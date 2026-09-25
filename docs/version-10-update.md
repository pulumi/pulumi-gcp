# Pulumi GCP Provider Version Upgrade Guide

Version 10.0.0 of the GCP provider for Pulumi is a major release and includes changes that you need to consider when upgrading. This guide will help with that process and focuses only on changes from version 9.x to version 10.0.0. See the [Version 9 Upgrade Guide](https://www.pulumi.com/registry/packages/gcp/how-to-guides/9-0-migration) for information on upgrading from 8.x to version 9.0.0.

Version 10.0.0 tracks the upstream `terraform-provider-google-beta` v8.x release.

## How to upgrade

Follow [the procedure for a provider major version](https://www.pulumi.com/docs/iac/operations/stack-management/run-program/):

```bash
pulumi up --refresh                 # before the bump, with 9.x still installed
# bump @pulumi/gcp (or the equivalent for your language) to 10.0.0
pulumi up --refresh --run-program   # after the bump
```

The bump itself, per language:

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}

{{% choosable language typescript %}}

```bash
npm install @pulumi/gcp@^10.0.0
```

{{% /choosable %}}

{{% choosable language python %}}

```bash
pip install --upgrade 'pulumi-gcp>=10.0.0,<11.0.0'
```

{{% /choosable %}}

{{% choosable language go %}}

```bash
go get github.com/pulumi/pulumi-gcp/sdk/v10@latest
```

{{% /choosable %}}

{{% choosable language csharp %}}

```bash
dotnet add package Pulumi.Gcp --version 10.*
```

{{% /choosable %}}

{{% choosable language java %}}

```xml
<dependency>
  <groupId>com.pulumi</groupId>
  <artifactId>gcp</artifactId>
  <version>10.0.0</version>
</dependency>
```

{{% /choosable %}}

{{% choosable language yaml %}}

```bash
pulumi package add gcp 10.0.0
```

{{% /choosable %}}

{{< /chooser >}}

Run the detection commands in this guide before the bump, while 9.x is still installed. They read your stack's state and change nothing.

## Breaking changes

GCP provider v10.0 includes several breaking changes. These are the ones we consider the most impactful and noteworthy, ordered by what each one does to a live stack. Every other change in the release, including the rest of the removed resources and functions, is listed under [Other changes](#other-changes).

- [`gcp.compute.Instance`: a `guestAccelerator` count of `0` now replaces the instance](#gcpcomputeinstance-a-guestaccelerator-count-of-0-now-replaces-the-instance)
- [`gcp.iap.Brand` and `gcp.iap.Client`: removed](#gcpiapbrand-and-gcpiapclient-removed)
- [`gcp.notebooks`: the module has been removed](#gcpnotebooks-the-module-has-been-removed)
- [`gcp.bigquery.Dataset`: `defaultCollation` is no longer computed](#gcpbigquerydataset-defaultcollation-is-no-longer-computed)
- [`gcp.secretmanager.SecretVersion`: `secretDataWoVersion` is required alongside `secretDataWo`, and is a string](#gcpsecretmanagersecretversion-secretdatawoversion-is-required-alongside-secretdatawo-and-is-a-string)
- [`gcp.monitoring.UptimeCheckConfig`: the two password fields are now mutually exclusive](#gcpmonitoringuptimecheckconfig-the-two-password-fields-are-now-mutually-exclusive)
- [`gcp.container.Cluster` and `gcp.container.NodePool`: `namePrefix` may now be up to 31 characters](#gcpcontainercluster-and-gcpcontainernodepool-nameprefix-may-now-be-up-to-31-characters)
- [`gcp.workflows.Workflow`: `sourceContents` is now required](#gcpworkflowsworkflow-sourcecontents-is-now-required)
- [`gcp.cloudrunv2.WorkerPool`: probe header fields changed](#gcpcloudrunv2workerpool-probe-header-fields-changed)
- [`gcp.compute.ServiceAttachment`: `natSubnets` and `consumerRejectLists` are now sets](#gcpcomputeserviceattachment-natsubnets-and-consumerrejectlists-are-now-sets)
- [`gcp.container.Cluster`: the `enableComponents` fields are now sets](#gcpcontainercluster-the-enablecomponents-fields-are-now-sets)
- [`gcp.compute.Reservation`: top-level `reservationBlockCount` removed](#gcpcomputereservation-top-level-reservationblockcount-removed)

### `gcp.compute.Instance`: a `guestAccelerator` count of `0` now replaces the instance

`gcp.compute.Instance` now acts on a `guestAccelerator` block whose `count` is `0`, where v9 ignored it. Detaching an accelerator cannot be done in place, so the instance is **replaced**.

The block is still ignored in one case: nothing attached, and exactly one block declared. Attach an accelerator, or declare a second zero-count block, and the instance is replaced.

An empty `guestAccelerators` list and omitting the block are never affected.

#### Impact/Risk

**Unaffected:** every `gcp.compute.Instance` that does not declare a `guestAccelerator` block with `count: 0`. No type or signature changed, so an affected program still compiles and `pulumi preview` still exits cleanly. The replacement shows up only in what `pulumi preview` prints.

**If you declare a `count: 0` block**, `pulumi preview` shows a replacement of the instance and `pulumi up` carries it out, whenever accelerators are attached or the configuration holds more than one block. Replacement, not an update.

A replacement destroys the boot disk and any local SSDs, and changes the external IP, the internal IP and the instance id. Local SSDs cannot be snapshotted, so what was on them is unrecoverable. Disks and addresses declared as their own resources survive and are reattached.

Nothing is snapshotted on the way through, so take a snapshot first. An instance with an explicit `name` is deleted before its replacement is created, so there is an interval with no instance and nothing to roll back to if the create fails.

Neither `pulumi up --refresh` before the bump nor `pulumi up --refresh --run-program` after it avoids the replacement.

#### Am I affected?

This reads your stack's state and changes nothing. Run it before you upgrade.

```bash
pulumi stack export | jq -r '
  .deployment.resources[]
  | select(.type == "gcp:compute/instance:Instance")
  | (.inputs.guestAccelerators // []) as $cfg
  | select(($cfg | map(select(.count == 0)) | length) > 0)
  | (.outputs.guestAccelerators // []) as $live
  | "\(.urn)\n    configured = \($cfg | map({count, type}) | tojson)\n    attached   = \($live | map({count, type: (.type | split("/") | last)}) | tojson)"
'
```

Output from a stack with one instance of each kind:

```text
urn:pulumi:dev::my-stack::gcp:compute/instance:Instance::no-accelerator-instance
    configured = [{"count":0,"type":"nvidia-tesla-t4"}]
    attached   = []
urn:pulumi:dev::my-stack::gcp:compute/instance:Instance::gpu-instance
    configured = [{"count":0,"type":"nvidia-tesla-t4"}]
    attached   = [{"count":1,"type":"nvidia-tesla-t4"}]
```

Reading it:

- `attached` is not empty — this instance will be replaced. See the Remediation section below before upgrading.
- `attached` is empty and `configured` holds two or more blocks — this instance will be replaced. See the Remediation section below before upgrading.
- `attached` is empty and `configured` holds exactly one block — nothing changes yet, but attaching an accelerator or adding a second zero-count block turns it into a replacement. See the Remediation section below anyway.
- no output at all — no instance in the stack declares a zero-count accelerator, so you are not affected.

#### Remediation

When migrating from v9, build the `guestAccelerators` list so that it is omitted when you want no accelerator, rather than present with `count: 0`. Omitting it leaves an attached accelerator in place, so nothing is replaced.

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}

{{% choosable language typescript %}}

```typescript
const gpu = new gcp.compute.Instance("gpu-instance", {
    name: "gpu-instance",
    zone: zone,
    machineType: "n1-standard-1",
    bootDisk: {
        initializeParams: { image: image, size: 10 },
    },
    scratchDisks: [{ interface: "NVME" }],
    attachedDisks: [{ source: dataDisk.selfLink, deviceName: "data-disk" }],
    networkInterfaces: [{
        network: "default",
        accessConfigs: [{}],
    }],
    metadataStartupScript: startupScript,
    // v9 (will cause replacement)
    // guestAccelerators: [{ count: enableGpu ? 1 : 0, type: "nvidia-tesla-t4" }],
    // v10 (fixed)
    guestAccelerators: enableGpu ? [{ count: 1, type: "nvidia-tesla-t4" }] : undefined,
    scheduling: { onHostMaintenance: "TERMINATE", automaticRestart: true },
});
```

{{% /choosable %}}

{{% choosable language python %}}

```python
gpu = gcp.compute.Instance("gpu-instance",
    name="gpu-instance",
    zone=zone,
    machine_type="n1-standard-1",
    boot_disk={
        "initialize_params": {
            "image": image,
            "size": 10,
        },
    },
    scratch_disks=[{
        "interface": "NVME",
    }],
    attached_disks=[{
        "source": data_disk.self_link,
        "device_name": "data-disk",
    }],
    network_interfaces=[{
        "network": "default",
        "access_configs": [{}],
    }],
    metadata_startup_script=startup_script,
    # v9 (will cause replacement)
    # guest_accelerators=[{"count": 1 if enable_gpu else 0, "type": "nvidia-tesla-t4"}],
    # v10 (fixed)
    guest_accelerators=[{
        "count": 1,
        "type": "nvidia-tesla-t4",
    }] if enable_gpu else None,
    scheduling={
        "on_host_maintenance": "TERMINATE",
        "automatic_restart": True,
    })
```

{{% /choosable %}}

{{% choosable language go %}}

```go
// v9 (will cause replacement)
// GuestAccelerators: compute.InstanceGuestAcceleratorArray{&compute.InstanceGuestAcceleratorArgs{
//     Count: pulumi.Int(gpuCount), Type: pulumi.String("nvidia-tesla-t4"),
// }},
// v10 (fixed)
var tmp0 compute.InstanceGuestAcceleratorArray
if enableGpu {
	tmp0 = compute.InstanceGuestAcceleratorArray{
		&compute.InstanceGuestAcceleratorArgs{
			Count: pulumi.Int(1),
			Type:  pulumi.String("nvidia-tesla-t4"),
		},
	}
} else {
	tmp0 = nil
}
_, err := compute.NewInstance(ctx, "gpu-instance", &compute.InstanceArgs{
	Name:        pulumi.String("gpu-instance"),
	Zone:        pulumi.String(zone),
	MachineType: pulumi.String("n1-standard-1"),
	BootDisk: &compute.InstanceBootDiskArgs{
		InitializeParams: &compute.InstanceBootDiskInitializeParamsArgs{
			Image: pulumi.String(image),
			Size:  pulumi.Int(10),
		},
	},
	ScratchDisks: compute.InstanceScratchDiskArray{
		&compute.InstanceScratchDiskArgs{
			Interface: pulumi.String("NVME"),
		},
	},
	AttachedDisks: compute.InstanceAttachedDiskArray{
		&compute.InstanceAttachedDiskArgs{
			Source:     dataDisk.SelfLink,
			DeviceName: pulumi.String("data-disk"),
		},
	},
	NetworkInterfaces: compute.InstanceNetworkInterfaceArray{
		&compute.InstanceNetworkInterfaceArgs{
			Network: pulumi.String("default"),
			AccessConfigs: compute.InstanceNetworkInterfaceAccessConfigArray{
				&compute.InstanceNetworkInterfaceAccessConfigArgs{},
			},
		},
	},
	MetadataStartupScript: pulumi.String(startupScript),
	GuestAccelerators:     tmp0,
	Scheduling: &compute.InstanceSchedulingArgs{
		OnHostMaintenance: pulumi.String("TERMINATE"),
		AutomaticRestart:  pulumi.Bool(true),
	},
})
if err != nil {
	return err
}
```

{{% /choosable %}}

{{% choosable language csharp %}}

```csharp
var args = new Gcp.Compute.InstanceArgs
{
    Name = "gpu-instance",
    Zone = zone,
    MachineType = "n1-standard-1",
    BootDisk = new Gcp.Compute.Inputs.InstanceBootDiskArgs
    {
        InitializeParams = new Gcp.Compute.Inputs.InstanceBootDiskInitializeParamsArgs
        {
            Image = image,
            Size = 10,
        },
    },
    ScratchDisks = new[]
    {
        new Gcp.Compute.Inputs.InstanceScratchDiskArgs
        {
            Interface = "NVME",
        },
    },
    AttachedDisks = new[]
    {
        new Gcp.Compute.Inputs.InstanceAttachedDiskArgs
        {
            Source = dataDisk.SelfLink,
            DeviceName = "data-disk",
        },
    },
    NetworkInterfaces = new[]
    {
        new Gcp.Compute.Inputs.InstanceNetworkInterfaceArgs
        {
            Network = "default",
            AccessConfigs = new[]
            {
                new Gcp.Compute.Inputs.InstanceNetworkInterfaceAccessConfigArgs(),
            },
        },
    },
    MetadataStartupScript = startupScript,
    Scheduling = new Gcp.Compute.Inputs.InstanceSchedulingArgs
    {
        OnHostMaintenance = "TERMINATE",
        AutomaticRestart = true,
    },
};

// v9 (will cause replacement)
// GuestAccelerators = new[] { new Gcp.Compute.Inputs.InstanceGuestAcceleratorArgs
//     { Count = enableGpu ? 1 : 0, Type = "nvidia-tesla-t4" } },
// v10 (fixed): set the property only when an accelerator is wanted, rather than
// assigning null, because the list conversion does not treat null as "omitted".
if (enableGpu)
{
    args.GuestAccelerators = new[]
    {
        new Gcp.Compute.Inputs.InstanceGuestAcceleratorArgs
        {
            Count = 1,
            Type = "nvidia-tesla-t4",
        },
    };
}

var gpu = new Gcp.Compute.Instance("gpu-instance", args);
```

{{% /choosable %}}

{{% choosable language java %}}

```java
var builder = InstanceArgs.builder()
    .name("gpu-instance")
    .zone(zone)
    .machineType("n1-standard-1")
    .bootDisk(InstanceBootDiskArgs.builder()
        .initializeParams(InstanceBootDiskInitializeParamsArgs.builder()
            .image(image)
            .size(10)
            .build())
        .build())
    .scratchDisks(InstanceScratchDiskArgs.builder()
        .interface_("NVME")
        .build())
    .attachedDisks(InstanceAttachedDiskArgs.builder()
        .source(dataDisk.selfLink())
        .deviceName("data-disk")
        .build())
    .networkInterfaces(InstanceNetworkInterfaceArgs.builder()
        .network("default")
        .accessConfigs(InstanceNetworkInterfaceAccessConfigArgs.builder()
            .build())
        .build())
    .metadataStartupScript(startupScript)
    .scheduling(InstanceSchedulingArgs.builder()
        .onHostMaintenance("TERMINATE")
        .automaticRestart(true)
        .build());

// v9 (will cause replacement)
// .guestAccelerators(InstanceGuestAcceleratorArgs.builder()
//     .count(enableGpu ? 1 : 0).type("nvidia-tesla-t4").build())
// v10 (fixed): call the setter only when an accelerator is wanted, because
// passing null to the varargs overload adds a null element.
if (enableGpu) {
    builder.guestAccelerators(InstanceGuestAcceleratorArgs.builder()
        .count(1)
        .type("nvidia-tesla-t4")
        .build());
}

var gpu = new Instance("gpu-instance", builder.build());
```

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
resources:
  gpu:
    type: gcp:compute:Instance
    name: gpu-instance
    properties:
      name: gpu-instance
      zone: ${zone}
      machineType: n1-standard-1
      bootDisk:
        initializeParams:
          image: ${image}
          size: 10
      scratchDisks:
        - interface: NVME
      attachedDisks:
        - source: ${dataDisk.selfLink}
          deviceName: data-disk
      networkInterfaces:
        - network: default
          accessConfigs:
            - {}
      metadataStartupScript: ${startupScript}
      # v9 (will cause replacement): count: 0 meant "no accelerator"
      # v10 (fixed): omit the whole guestAccelerators key instead. Pulumi YAML
      # has no conditional, so this arm shows the accelerator attached.
      guestAccelerators:
        - count: 1
          type: nvidia-tesla-t4
      scheduling:
        onHostMaintenance: TERMINATE
        automaticRestart: true
```

{{% /choosable %}}

{{< /chooser >}}

**If you do want the accelerators detached**, a `count: 0` block will detach and replace your instance.

### `gcp.iap.Brand` and `gcp.iap.Client`: removed

Google shut down the IAP OAuth Admin APIs and there is no replacement resource.

So `gcp.iap.Brand`, `gcp.iap.Client` and the `gcp.iap.getClient` data source are removed in v10. OAuth clients keep existing in Google Cloud; manage them in the [Google Cloud Console](https://console.cloud.google.com/apis/credentials).

#### Impact/Risk

**Unaffected:** stacks that declare no `gcp.iap.Brand`, no `gcp.iap.Client` and no `gcp.iap.getClient`. The rest of the IAP module, including `gcp.iap.Settings`, `gcp.iap.TunnelDestGroup` and the IAP IAM resources, is unchanged.

**If you upgrade and change nothing else**, the program stops building and `pulumi preview` stops before it registers anything.

**If you then delete the declarations while the resources are still in state, the next `pulumi up` on v10 deletes your live OAuth client.** Each state entry records the provider version that created it, so the engine downloads that v9 provider and asks it to do the delete. The run succeeds and prints no warning. The client ID and secret are gone, every application signing in through them stops working, and no v10 resource can recreate them.

If you deleted the resources by mistake, reissuing one is a manual step in Google Cloud, see [Google's guidance](https://cloud.google.com/iap/docs/custom-oauth-configuration), and it produces a different client ID and secret, so everything referencing the old one has to be updated.

#### Am I affected?

Run the following command against each stack to determine whether you are affected. It is read-only.

```bash
pulumi stack export | jq -r '
  .deployment.resources[]
  | select(.type == "gcp:iap/brand:Brand" or .type == "gcp:iap/client:Client")
  | "\(.type)\n    \(.urn)"
'
```

Output from a stack holding both:

```text
gcp:iap/brand:Brand
    urn:pulumi:dev::my-stack::gcp:iap/brand:Brand::iap-brand
gcp:iap/client:Client
    urn:pulumi:dev::my-stack::gcp:iap/client:Client::iap-client
```

Reading it:

- a `gcp:iap/client:Client` line — remove it from state before your next `pulumi up`, or that OAuth client is deleted in Google Cloud. See the Remediation section below and follow it in order.
- a `gcp:iap/brand:Brand` line — remove it from state too, see the Remediation section below. Nothing in Google Cloud is lost either way.
- no output at all — no IAP brand or client is under management in this stack, so you are not affected.

The command cannot see `gcp.iap.getClient`, because a data source is never written to state. Search your program for it separately.

#### Remediation

First take the resources out of state. Neither command calls Google Cloud, so the brand and the OAuth client stay exactly as they are. Delete the client before the brand, because the brand cannot go while something still references it.

```bash
pulumi state delete 'urn:pulumi:dev::my-stack::gcp:iap/client:Client::iap-client'
pulumi state delete 'urn:pulumi:dev::my-stack::gcp:iap/brand:Brand::iap-brand'
```

Note: Taking the brand first fails, with the fix in the message:

```text
error: urn:pulumi:dev::...::gcp:iap/brand:Brand::iap-brand can't be safely deleted because the following resources depend on it:
 * "iap-client" (urn:pulumi:dev::...::gcp:iap/client:Client::iap-client)

Delete those resources first or pass --target-dependents.
```

Then delete every `gcp.iap.Brand` and `gcp.iap.Client` from your program. Nothing takes their place; Pulumi just stops managing resources that go on existing in Google Cloud.

Only the client is at stake in all of this. Removing a `gcp.iap.Brand` drops it out of state whatever order you work in, because the IAP API has no delete method for brands.

**If you read an existing client with the `gcp.iap.getClient` data source**, the build fails and nothing is replaced. There is no replacement data source, so read the client from the IAP Console once and keep it in config. Google documents the credentials themselves in [Use custom OAuth clients with IAP](https://cloud.google.com/iap/docs/custom-oauth-configuration):

```typescript
const cfg = new pulumi.Config();

// v9
// const existing = gcp.iap.getClientOutput({ brand: brand.name, clientId: client.clientId });
// export const iapClientSecret = existing.secret;
// v10 (fixed), after:
//   pulumi config set iapClientId <id>
//   pulumi config set --secret iapClientSecret <secret>
export const iapClientId = cfg.require("iapClientId");
export const iapClientSecret = cfg.requireSecret("iapClientSecret");
```

### `gcp.notebooks`: the module has been removed

The whole `gcp.notebooks` namespace has been removed: `Instance`, `Runtime`, `Environment`, their IAM resources (`InstanceIamPolicy`, `InstanceIamBinding`, `InstanceIamMember`, `RuntimeIamPolicy`, `RuntimeIamBinding`, `RuntimeIamMember`) and the `getInstanceIamPolicy` and `getRuntimeIamPolicy` functions. The products behind them, Vertex AI Workbench User-Managed and Google-Managed Notebooks, have reached end of life, and Google already refuses to create new instances of either. Use `gcp.workbench.Instance` and `gcp.workbench.InstanceIamMember` instead.

There is no setting that keeps the old behaviour. `gcp.notebooks` does not exist on v10.

#### Impact/Risk

**Unaffected:** a stack with no `gcp:notebooks/` resource in its state. Workbench resources are untouched by this change.

If you do have one, the upgrade breaks in two stages.

**Your program stops working.** Every reference to `gcp.notebooks` fails: a build error in compiled languages, and in interpreted ones the program throws while loading, so `pulumi preview` exits non-zero before it reaches your resources.

**Then the fix deletes your notebook.** Once you remove those references, `pulumi preview` succeeds and shows a **delete** of the entries left in state. It is a delete rather than a replacement, and the engine does not need v10 to know the type: it routes the delete to the 9.x provider recorded alongside the resource, which calls the legacy API. For a notebook that is still a notebook, that destroys the VM, its boot disk and, unless the instance was created with `noRemoveDataDisk: true`, its data disk and everything in the home directory. Running the documented `pulumi up --refresh --run-program` produces the same plan.

**The machine may no longer be a notebook.** Google's published schedule converted user-managed notebooks that were never migrated into plain Compute Engine VMs on 2026-03-30, and a converted instance is not visible to Vertex AI Workbench. What a legacy delete does to a converted machine is untested, because Google no longer lets anyone create a legacy notebook to try it on. Both readings lead to the same move: take the resources out of state rather than letting `pulumi up` delete them.

#### Am I affected?

Run the following command against each stack to list the resources that the v10 provider no longer has a type for:

```bash
pulumi stack export | jq -r '
  .deployment.resources[]
  | select(.type | startswith("gcp:notebooks/"))
  | "\(.type)\n    \(.urn)"
'
```

Output from a stack with a legacy instance and one of its IAM bindings:

```text
gcp:notebooks/instance:Instance
    urn:pulumi:dev::my-stack::gcp:notebooks/instance:Instance::legacy-notebook
gcp:notebooks/instanceIamMember:InstanceIamMember
    urn:pulumi:dev::my-stack::gcp:notebooks/instanceIamMember:InstanceIamMember::legacy-notebook-viewer
```

No output means the stack holds nothing from the removed namespace and you are not affected. Any output at all means the stack is affected: follow the Remediation section below before you upgrade, because the wrong order deletes the machine.

#### Remediation

**If you want to keep the existing machine**, do not let `pulumi up` carry out that delete. Nothing is destroyed on this path.

1. Migrate the instance at the GCP level first. A legacy notebook is served by `notebooks.googleapis.com/v1` and a Workbench instance by `/v2`, so until it is migrated `gcp.workbench.Instance` cannot see it.

```bash
curl -X POST -H "Authorization: Bearer $(gcloud auth print-access-token)" \
  "https://notebooks.googleapis.com/v1/projects/PROJECT/locations/ZONE/instances/NAME:migrate"
```

2. Drop the legacy entries from Pulumi's state. This edits state only and leaves the machine running. Delete the IAM resources before the instance they point at.

```bash
pulumi state delete 'urn:pulumi:dev::my-stack::gcp:notebooks/instanceIamMember:InstanceIamMember::viewer'
pulumi state delete 'urn:pulumi:dev::my-stack::gcp:notebooks/instance:Instance::my-notebook'
```

3. Rewrite the code against `gcp.workbench` (below), then adopt the migrated machine rather than creating a second one.

```bash
pulumi import gcp:workbench/instance:Instance my-notebook \
  projects/PROJECT/locations/ZONE/instances/NAME
```

**If you are content to recreate**, change the types and run `pulumi up`. The legacy instance is destroyed and a new Workbench instance is created; disk contents do not carry over. The machine settings move under `gceSetup`, the disk sizes become strings, and the IAM resource's `instanceName` becomes `name`.

v9:

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}

{{% choosable language typescript %}}

```typescript
const instance = new gcp.notebooks.Instance("legacy-notebook", {
    name: "legacy-notebook",
    location: "europe-west2-a",
    machineType: "e2-medium",
    vmImage: {
        project: "cloud-notebooks-managed",
        imageFamily: "workbench-instances",
    },
    dataDiskSizeGb: 100,
    dataDiskType: "PD_BALANCED",
});

const viewer = new gcp.notebooks.InstanceIamMember("legacy-notebook-viewer", {
    project: instance.project,
    location: instance.location,
    instanceName: instance.name,
    role: "roles/notebooks.viewer",
    member: sa.email.apply(e => `serviceAccount:${e}`),
});
```

{{% /choosable %}}

{{% choosable language python %}}

```python
instance = gcp.notebooks.Instance("legacy-notebook",
    name="legacy-notebook",
    location="europe-west2-a",
    machine_type="e2-medium",
    vm_image={
        "project": "cloud-notebooks-managed",
        "image_family": "workbench-instances",
    },
    data_disk_size_gb=100,
    data_disk_type="PD_BALANCED")
viewer = gcp.notebooks.InstanceIamMember("legacy-notebook-viewer",
    project=instance.project,
    location=instance.location,
    instance_name=instance.name,
    role="roles/notebooks.viewer",
    member=sa.email.apply(lambda email: f"serviceAccount:{email}"))
```

{{% /choosable %}}

{{% choosable language go %}}

```go
instance, err := notebooks.NewInstance(ctx, "legacy-notebook", &notebooks.InstanceArgs{
	Name:        pulumi.String("legacy-notebook"),
	Location:    pulumi.String("europe-west2-a"),
	MachineType: pulumi.String("e2-medium"),
	VmImage: &notebooks.InstanceVmImageArgs{
		Project:     pulumi.String("cloud-notebooks-managed"),
		ImageFamily: pulumi.String("workbench-instances"),
	},
	DataDiskSizeGb: pulumi.Int(100),
	DataDiskType:   pulumi.String("PD_BALANCED"),
})
if err != nil {
	return err
}
_, err = notebooks.NewInstanceIamMember(ctx, "legacy-notebook-viewer", &notebooks.InstanceIamMemberArgs{
	Project:      instance.Project,
	Location:     instance.Location,
	InstanceName: instance.Name,
	Role:         pulumi.String("roles/notebooks.viewer"),
	Member: sa.Email.ApplyT(func(email string) (string, error) {
		return fmt.Sprintf("serviceAccount:%v", email), nil
	}).(pulumi.StringOutput),
})
if err != nil {
	return err
}
```

Go needs `fmt` imported for the interpolation.

{{% /choosable %}}

{{% choosable language csharp %}}

```csharp
var instance = new Gcp.Notebooks.Instance("legacy-notebook", new()
{
    Name = "legacy-notebook",
    Location = "europe-west2-a",
    MachineType = "e2-medium",
    VmImage = new Gcp.Notebooks.Inputs.InstanceVmImageArgs
    {
        Project = "cloud-notebooks-managed",
        ImageFamily = "workbench-instances",
    },
    DataDiskSizeGb = 100,
    DataDiskType = "PD_BALANCED",
});

var viewer = new Gcp.Notebooks.InstanceIamMember("legacy-notebook-viewer", new()
{
    Project = instance.Project,
    Location = instance.Location,
    InstanceName = instance.Name,
    Role = "roles/notebooks.viewer",
    Member = sa.Email.Apply(email => $"serviceAccount:{email}"),
});
```

{{% /choosable %}}

{{% choosable language java %}}

```java
var instance = new Instance("legacy-notebook", InstanceArgs.builder()
    .name("legacy-notebook")
    .location("europe-west2-a")
    .machineType("e2-medium")
    .vmImage(InstanceVmImageArgs.builder()
        .project("cloud-notebooks-managed")
        .imageFamily("workbench-instances")
        .build())
    .dataDiskSizeGb(100)
    .dataDiskType("PD_BALANCED")
    .build());

var viewer = new InstanceIamMember("legacy-notebook-viewer", InstanceIamMemberArgs.builder()
    .project(instance.project())
    .location(instance.location())
    .instanceName(instance.name())
    .role("roles/notebooks.viewer")
    .member(sa.email().applyValue(_email -> String.format("serviceAccount:%s", _email)))
    .build());
```

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
resources:
  instance:
    type: gcp:notebooks:Instance
    name: legacy-notebook
    properties:
      name: legacy-notebook
      location: europe-west2-a
      machineType: e2-medium
      vmImage:
        project: cloud-notebooks-managed
        imageFamily: workbench-instances
      dataDiskSizeGb: 100
      dataDiskType: PD_BALANCED
  viewer:
    type: gcp:notebooks:InstanceIamMember
    name: legacy-notebook-viewer
    properties:
      project: ${instance.project}
      location: ${instance.location}
      instanceName: ${instance.name}
      role: roles/notebooks.viewer
      member: serviceAccount:${sa.email}
```

{{% /choosable %}}

{{< /chooser >}}

v10:

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}

{{% choosable language typescript %}}

```typescript
const instance = new gcp.workbench.Instance("workbench-instance", {
    name: "workbench-instance",
    location: "europe-west2-a",
    gceSetup: {
        machineType: "e2-medium",
        dataDisks: {
            diskSizeGb: "100",
            diskType: "PD_BALANCED",
        },
    },
});

const viewer = new gcp.workbench.InstanceIamMember("workbench-viewer", {
    project: instance.project,
    location: instance.location,
    name: instance.name,
    role: "roles/notebooks.viewer",
    member: sa.email.apply(e => `serviceAccount:${e}`),
});
```

{{% /choosable %}}

{{% choosable language python %}}

```python
instance = gcp.workbench.Instance("workbench-instance",
    name="workbench-instance",
    location="europe-west2-a",
    gce_setup={
        "machine_type": "e2-medium",
        "data_disks": {
            "disk_size_gb": "100",
            "disk_type": "PD_BALANCED",
        },
    })
viewer = gcp.workbench.InstanceIamMember("workbench-viewer",
    project=instance.project,
    location=instance.location,
    name=instance.name,
    role="roles/notebooks.viewer",
    member=sa.email.apply(lambda email: f"serviceAccount:{email}"))
```

{{% /choosable %}}

{{% choosable language go %}}

```go
instance, err := workbench.NewInstance(ctx, "workbench-instance", &workbench.InstanceArgs{
	Name:     pulumi.String("workbench-instance"),
	Location: pulumi.String("europe-west2-a"),
	GceSetup: &workbench.InstanceGceSetupArgs{
		MachineType: pulumi.String("e2-medium"),
		DataDisks: &workbench.InstanceGceSetupDataDisksArgs{
			DiskSizeGb: pulumi.String("100"),
			DiskType:   pulumi.String("PD_BALANCED"),
		},
	},
})
if err != nil {
	return err
}
_, err = workbench.NewInstanceIamMember(ctx, "workbench-viewer", &workbench.InstanceIamMemberArgs{
	Project:  instance.Project,
	Location: instance.Location,
	Name:     instance.Name,
	Role:     pulumi.String("roles/notebooks.viewer"),
	Member: sa.Email.ApplyT(func(email string) (string, error) {
		return fmt.Sprintf("serviceAccount:%v", email), nil
	}).(pulumi.StringOutput),
})
if err != nil {
	return err
}
```

Go needs `fmt` imported for the interpolation.

{{% /choosable %}}

{{% choosable language csharp %}}

```csharp
var instance = new Gcp.Workbench.Instance("workbench-instance", new()
{
    Name = "workbench-instance",
    Location = "europe-west2-a",
    GceSetup = new Gcp.Workbench.Inputs.InstanceGceSetupArgs
    {
        MachineType = "e2-medium",
        DataDisks = new Gcp.Workbench.Inputs.InstanceGceSetupDataDisksArgs
        {
            DiskSizeGb = "100",
            DiskType = "PD_BALANCED",
        },
    },
});

var viewer = new Gcp.Workbench.InstanceIamMember("workbench-viewer", new()
{
    Project = instance.Project,
    Location = instance.Location,
    Name = instance.Name,
    Role = "roles/notebooks.viewer",
    Member = sa.Email.Apply(email => $"serviceAccount:{email}"),
});
```

{{% /choosable %}}

{{% choosable language java %}}

```java
var instance = new Instance("workbench-instance", InstanceArgs.builder()
    .name("workbench-instance")
    .location("europe-west2-a")
    .gceSetup(InstanceGceSetupArgs.builder()
        .machineType("e2-medium")
        .dataDisks(InstanceGceSetupDataDisksArgs.builder()
            .diskSizeGb("100")
            .diskType("PD_BALANCED")
            .build())
        .build())
    .build());

var viewer = new InstanceIamMember("workbench-viewer", InstanceIamMemberArgs.builder()
    .project(instance.project())
    .location(instance.location())
    .name(instance.name())
    .role("roles/notebooks.viewer")
    .member(sa.email().applyValue(_email -> String.format("serviceAccount:%s", _email)))
    .build());
```

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
resources:
  instance:
    type: gcp:workbench:Instance
    name: workbench-instance
    properties:
      name: workbench-instance
      location: europe-west2-a
      gceSetup:
        machineType: e2-medium
        dataDisks:
          diskSizeGb: '100'
          diskType: PD_BALANCED
  viewer:
    type: gcp:workbench:InstanceIamMember
    name: workbench-viewer
    properties:
      project: ${instance.project}
      location: ${instance.location}
      name: ${instance.name}
      role: roles/notebooks.viewer
      member: serviceAccount:${sa.email}
```

{{% /choosable %}}

{{< /chooser >}}

`gcp.notebooks.Runtime` and `gcp.notebooks.Environment` are removed the same way and have the same replacement: a Runtime becomes a `gcp.workbench.Instance`, and an Environment's settings (VM or container image, post-startup script) are set directly on `gcp.workbench.Instance`.

### `gcp.bigquery.Dataset`: `defaultCollation` is no longer computed

`defaultCollation` on `gcp.bigquery.Dataset` is no longer computed. On v9 the provider filled the field in from the API when your program did not set one, so a dataset kept whatever collation it already had. On v10 your program is the only source: a dataset whose program does not set `defaultCollation`, or sets it to `""`, has its collation cleared.

`defaultCollation` is also now an optional output, so code that reads `dataset.defaultCollation` has to handle an absent value.

#### Impact/Risk

**Unaffected: a `gcp.bigquery.Dataset` with no collation on it.** That is most datasets. Nothing changes and nothing is deployed.

**Unaffected: a `gcp.bigquery.Dataset` whose program sets `defaultCollation` to a collation.** Program and dataset already agree.

**If the dataset has a collation your program does not set, the first `pulumi up` clears it.** Existing tables and their data are untouched; only tables created afterwards lose the collation, so their string columns become case sensitive, which is what a dataset with no collation does.

**Code that reads the `defaultCollation` output** now has to handle an absent value. Where types are checked this is a build failure; elsewhere it surfaces only if you run a type checker.

No `gcp.bigquery.Dataset` is replaced by this change.

#### Am I affected?

Run the following command against each stack. It reads state and changes nothing.

```bash
pulumi stack export | jq -r '
  .deployment.resources[]
  | select(.type == "gcp:bigquery/dataset:Dataset")
  | (if (.inputs | has("defaultCollation")) then .inputs.defaultCollation else null end) as $cfg
  | (.outputs.defaultCollation // "") as $live
  | (if ($live != "") and (($cfg // "") == "") then "  AFFECTED" else "  ok" end) as $flag
  | "\(.urn)\n   program: \($cfg | tojson)   dataset: \($live | tojson) \($flag)"
'
```

Output from a stack holding one dataset of each kind:

```text
urn:pulumi:dev::my-stack::gcp:bigquery/dataset:Dataset::ci-dataset
   program: null   dataset: "und:ci"   AFFECTED
urn:pulumi:dev::my-stack::gcp:bigquery/dataset:Dataset::empty-collation-dataset
   program: ""   dataset: ""   ok
urn:pulumi:dev::my-stack::gcp:bigquery/dataset:Dataset::no-collation-dataset
   program: null   dataset: ""   ok
```

Reading it:

- `AFFECTED` — the dataset has a collation your program does not set, and upgrading clears it. The literal you need is the one printed after `dataset:`. See the Remediation section below.
- `ok` with a collation after `program:` — your program already names it, nothing changes.
- `ok` with `""` after `dataset:` — the dataset has no collation, nothing changes.
- no output at all — the stack has no `gcp.bigquery.Dataset`, so you are not affected.

#### Remediation

**If your program does not set `defaultCollation` and the dataset has one**, name it. This is an in-place update; the dataset is not replaced.

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}

{{% choosable language typescript %}}

```typescript
const ci = new gcp.bigquery.Dataset("ci-dataset", {
    datasetId: "ci_dataset",
    location: "europe-west2",
    // v9: the field was computed, so the collation survived being unset.
    // v10 (fixed): name it, or it is cleared.
    defaultCollation: "und:ci",
    deleteContentsOnDestroy: true,
});
```

{{% /choosable %}}

{{% choosable language python %}}

```python
ci = gcp.bigquery.Dataset("ci-dataset",
    dataset_id="ci_dataset",
    location="europe-west2",
    # v9: the field was computed, so the collation survived being unset.
    # v10 (fixed): name it, or it is cleared.
    default_collation="und:ci",
    delete_contents_on_destroy=True)
```

{{% /choosable %}}

{{% choosable language go %}}

```go
_, err := bigquery.NewDataset(ctx, "ci-dataset", &bigquery.DatasetArgs{
	DatasetId:               pulumi.String("ci_dataset"),
	Location:                pulumi.String("europe-west2"),
	// v9: the field was computed, so the collation survived being unset.
	// v10 (fixed): name it, or it is cleared.
	DefaultCollation:        pulumi.String("und:ci"),
	DeleteContentsOnDestroy: pulumi.Bool(true),
})
if err != nil {
	return err
}
```

{{% /choosable %}}

{{% choosable language csharp %}}

```csharp
var ci = new Gcp.BigQuery.Dataset("ci-dataset", new()
{
    DatasetId = "ci_dataset",
    Location = "europe-west2",
    // v9: the field was computed, so the collation survived being unset.
    // v10 (fixed): name it, or it is cleared.
    DefaultCollation = "und:ci",
    DeleteContentsOnDestroy = true,
});
```

{{% /choosable %}}

{{% choosable language java %}}

```java
var ci = new Dataset("ci-dataset", DatasetArgs.builder()
    .datasetId("ci_dataset")
    .location("europe-west2")
    // v9: the field was computed, so the collation survived being unset.
    // v10 (fixed): name it, or it is cleared.
    .defaultCollation("und:ci")
    .deleteContentsOnDestroy(true)
    .build());
```

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
resources:
  ci:
    type: gcp:bigquery:Dataset
    name: ci-dataset
    properties:
      datasetId: ci_dataset
      location: europe-west2
      # v9: the field was computed, so the collation survived being unset.
      # v10 (fixed): name it, or it is cleared.
      defaultCollation: und:ci
      deleteContentsOnDestroy: true
```

{{% /choosable %}}

{{< /chooser >}}

**If your program sets `defaultCollation: ""` and the dataset has a collation**, the same fix applies: on v10 the empty string clears it for real. In-place update, no replacement.

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}

{{% choosable language typescript %}}

```typescript
const ci = new gcp.bigquery.Dataset("ci-dataset", {
    datasetId: "ci_dataset",
    location: "europe-west2",
    // v9
    // defaultCollation: "",
    // v10 (fixed)
    defaultCollation: "und:ci",
    deleteContentsOnDestroy: true,
});
```

{{% /choosable %}}

{{% choosable language python %}}

```python
ci = gcp.bigquery.Dataset("ci-dataset",
    dataset_id="ci_dataset",
    location="europe-west2",
    # v9
    # default_collation="",
    # v10 (fixed)
    default_collation="und:ci",
    delete_contents_on_destroy=True)
```

{{% /choosable %}}

{{% choosable language go %}}

```go
_, err := bigquery.NewDataset(ctx, "ci-dataset", &bigquery.DatasetArgs{
	DatasetId:               pulumi.String("ci_dataset"),
	Location:                pulumi.String("europe-west2"),
	// v9
	// DefaultCollation: pulumi.String(""),
	// v10 (fixed)
	DefaultCollation:        pulumi.String("und:ci"),
	DeleteContentsOnDestroy: pulumi.Bool(true),
})
if err != nil {
	return err
}
```

{{% /choosable %}}

{{% choosable language csharp %}}

```csharp
var ci = new Gcp.BigQuery.Dataset("ci-dataset", new()
{
    DatasetId = "ci_dataset",
    Location = "europe-west2",
    // v9
    // DefaultCollation = "",
    // v10 (fixed)
    DefaultCollation = "und:ci",
    DeleteContentsOnDestroy = true,
});
```

{{% /choosable %}}

{{% choosable language java %}}

```java
var ci = new Dataset("ci-dataset", DatasetArgs.builder()
    .datasetId("ci_dataset")
    .location("europe-west2")
    // v9
    // .defaultCollation("")
    // v10 (fixed)
    .defaultCollation("und:ci")
    .deleteContentsOnDestroy(true)
    .build());
```

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
resources:
  ci:
    type: gcp:bigquery:Dataset
    name: ci-dataset
    properties:
      datasetId: ci_dataset
      location: europe-west2
      # v9
      # defaultCollation: ""
      # v10 (fixed)
      defaultCollation: und:ci
      deleteContentsOnDestroy: true
```

{{% /choosable %}}

{{< /chooser >}}

**If your code reads the `defaultCollation` output**, give it a fallback. Setting it was always optional; reading it was not. Because the field was computed, the output was typed `string` on v9 and is `string | undefined` on v10, so an unguarded read stops compiling.

```typescript
// v9
// export const ciCollationUpper = ci.defaultCollation.apply(c => c.toUpperCase());
// v10 (fixed)
export const ciCollationUpper = ci.defaultCollation.apply(c => (c ?? "").toUpperCase());
```

### `gcp.secretmanager.SecretVersion`: `secretDataWoVersion` is required alongside `secretDataWo`, and is a string

`gcp.secretmanager.SecretVersion` changed in two ways.

- `secretDataWo` and `secretDataWoVersion` must now be set together. On v9 `secretDataWoVersion` defaulted to `0` and could be omitted; on v10 it is required.
- `secretDataWoVersion` changed type from integer to string.

#### Impact/Risk

**Unaffected:** anyone using `secretData` instead of the write-only pair.

**If you set `secretDataWoVersion` to a number**, quoting it is the whole fix and replaces nothing.

**If you set `secretDataWo` but not `secretDataWoVersion`**, preview fails on v10. Set it to `""` and nothing is replaced. Set it to any other value, including `"0"`, and the live secret version is replaced.

#### Am I affected?

Run the following command against each stack. It reads state and changes nothing.

``` sh
pulumi stack export | jq -r '
  .deployment.resources[]
  | select(.type == "gcp:secretmanager/secretVersion:SecretVersion")
  | select(.inputs.secretDataWo != null)
  | .inputs.secretDataWoVersion as $v
  | "\(.urn)\n    secretDataWoVersion = \($v | tojson) (\($v | type))"
'
```

Output from a v9 stack with one of each: a resource that set `secretDataWoVersion`, and one that omitted it.

``` text
urn:pulumi:dev::my-stack::gcp:secretmanager/secretVersion:SecretVersion::pinned-payload
    secretDataWoVersion = 1 (number)
urn:pulumi:dev::my-stack::gcp:secretmanager/secretVersion:SecretVersion::unpinned-payload
    secretDataWoVersion = null (null)
```

Reading it:

- `(null)` — `secretDataWoVersion` is not set. See the Remediation section below.
- `(number)` — quote the literal in your program. See the Remediation section below.
- `(string)` — already done, nothing to do.
- no output at all — the stack has no `SecretVersion` using the write-only pair, so you are not affected.

#### Remediation

**If `secretDataWoVersion` was set to a number**, quote it.

``` ts
const pinned = new gcp.secretmanager.SecretVersion("pinned-payload", {
    secret: secret.id,
    secretDataWo: "payload-pinned-v1",
    // v9
    // secretDataWoVersion: 1,
    // v10 (fixed)
    secretDataWoVersion: "1",
    deletionPolicy: "DELETE",
});
```

**If `secretDataWoVersion` was omitted**, it is now required alongside `secretDataWo`. Use `""`, which is what the upgrade leaves in state, and nothing is replaced.

v9:

``` ts
const unpinned = new gcp.secretmanager.SecretVersion("unpinned-payload", {
    secret: secret.id,
    secretDataWo: "payload-unpinned",
});
```

v10:

``` ts
const unpinned = new gcp.secretmanager.SecretVersion("unpinned-payload", {
    secret: secret.id,
    secretDataWo: "payload-unpinned",
    // Use "" and nothing is replaced.
    secretDataWoVersion: "",
});
```

### `gcp.monitoring.UptimeCheckConfig`: the two password fields are now mutually exclusive

`gcp.monitoring.UptimeCheckConfig`'s `httpCheck.authInfo` block must now set **exactly one** of `password` and `passwordWo`. On v9 both fields were optional.

#### Impact/Risk

**Unaffected:** every `gcp.monitoring.UptimeCheckConfig` without an `httpCheck.authInfo` block, and every `authInfo` that already sets exactly one of `password` or `passwordWo`. Nothing to do.

**Nothing is replaced.** Every fix below is an in-place update, so no uptime check is recreated and no check id changes.

**If `authInfo` sets both fields**, `pulumi preview` fails outright, so nothing is deployed. Delete one of the two. The choice matters: on v9 the value that reached the check was `password`, because `passwordWo` was not applied. Keep `password` and the check's credential is unchanged. Keep `passwordWo` and the next update changes the password the check sends, without preview showing the new value.

**If `authInfo` sets neither field**, `pulumi preview` fails as well. This was legal on v9 and means the check authenticates with the username alone.

Note: `pulumi preview` is what catches this. The program compiles, because no type changed, and the provider rejects the inputs when preview validates them.

#### Am I affected?

This reads your existing state and changes nothing:

```bash
pulumi stack export | jq -r '
  .deployment.resources[]
  | select(.type == "gcp:monitoring/uptimeCheckConfig:UptimeCheckConfig")
  | (((.inputs // {}).httpCheck // {}).authInfo) as $a
  | select($a != null)
  | "\(.urn)\n    password = \($a | has("password"))   passwordWo = \($a | has("passwordWo"))"
'
```

Output from a v9 stack with one check of each kind:

```text
urn:pulumi:dev::my-stack::gcp:monitoring/uptimeCheckConfig:UptimeCheckConfig::both-passwords-check
    password = true   passwordWo = true
urn:pulumi:dev::my-stack::gcp:monitoring/uptimeCheckConfig:UptimeCheckConfig::username-only-check
    password = false   passwordWo = false
urn:pulumi:dev::my-stack::gcp:monitoring/uptimeCheckConfig:UptimeCheckConfig::password-only-check
    password = true   passwordWo = false
urn:pulumi:dev::my-stack::gcp:monitoring/uptimeCheckConfig:UptimeCheckConfig::write-only-check
    password = false   passwordWo = true
```

Reading it:

- both `true` — delete one of the two. See the Remediation section below.
- both `false` — add `password: ""`. See the Remediation section below.
- exactly one `true` — nothing to do.
- no output at all — no uptime check in the stack sets `httpCheck.authInfo`, so you are not affected.

#### Remediation

**If both fields are set**, delete `passwordWo` and `passwordWoVersion`. This is an update, not a replacement, and it keeps the password the check is authenticating with today.

v9:

```typescript
authInfo: {
    username: "check-user",
    password: "example-password",
    passwordWo: "example-write-only-password",
    passwordWoVersion: "1",
},
```

v10:

```typescript
authInfo: {
    username: "check-user",
    // v10 (fixed): keep password, drop passwordWo and passwordWoVersion.
    password: "example-password",
},
```

Deleting `password` instead, and keeping `passwordWo` with `passwordWoVersion`, is also an update rather than a replacement. It changes the password the check sends.

**If neither password field is set**, add `password: ""`. This is not a password for the endpoint: the constraint tests whether the field is present, not what it holds, and an empty string is never sent to Google. The check goes on authenticating with the username alone, exactly as it did on v9, and preview shows no diff. If the endpoint does need a password, set a real one in `password` or `passwordWo` instead.

v9:

```typescript
authInfo: {
    username: "check-user",
},
```

v10:

```typescript
authInfo: {
    username: "check-user",
    // v10 (fixed): one of the two is now required. "" is not sent to the API.
    password: "",
},
```

### `gcp.container.Cluster` and `gcp.container.NodePool`: `namePrefix` may now be up to 31 characters

`gcp.container.NodePool`, and the inline node pools of `gcp.container.Cluster` under `nodePools[]`, can have their GKE name generated from `namePrefix`. The provider appends a generated suffix to the prefix, and GKE limits the finished name to 40 characters.

The suffix used to be 26 characters long, which capped `namePrefix` at 14. It now depends on the length of the prefix:

- 14 characters or fewer: a 26-character suffix, unchanged.
- 15 to 31 characters: a 9-character suffix, a 6-digit date plus a 3-digit counter.
- longer than 31 characters: rejected.

Node pool names already recorded in state are not regenerated.

#### Impact/Risk

Beware: changing `namePrefix` on a live node pool replaces it, deleting the nodes and everything running on them.

**Unaffected:** every existing stack. Only a prefix of 14 characters or fewer could be deployed on v9, and those generate exactly the same names on v10.

**A `namePrefix` of 15 to 31 characters** is now possible, but use it with caution: the suffix is a date plus a counter that restarts at 1 on every deployment, so two deployments of one prefix into the same cluster on the same UTC day generate the same name. The second fails with `already exists` from GKE, and preview cannot warn about it, because the name is generated while the resource is being created.

#### Am I affected?

No. This change only widens what is allowed; read the warning above before using the new range.

#### Remediation

N/A

### `gcp.workflows.Workflow`: `sourceContents` is now required

`gcp.workflows.Workflow` now requires `sourceContents`, the workflow code the resource deploys. On v9 the argument was optional.

Google has always rejected a workflow with no source code, so the change turns an error you got from the cloud on `pulumi up` into one you get locally at preview.

#### Impact/Risk

N/A

#### Am I affected?

N/A

#### Remediation

N/A

### `gcp.cloudrunv2.WorkerPool`: probe header fields changed

`gcp.cloudrunv2.WorkerPool` changed in three ways.

- `httpGet.httpHeaders`, on both the startup probe and the liveness probe of a container, changed from a single header to a list of headers.
- `httpGet.httpHeaders.name` is now required, and `httpGet.httpHeaders.port` was removed.
- The top-level `customAudiences` was removed, from the resource and from the `gcp.cloudrunv2.getWorkerPool` data source.

#### Impact/Risk

**Unaffected:** every `gcp.cloudrunv2.WorkerPool` whose container probes set no `httpGet.httpHeaders`, or that uses `grpc` or `tcpSocket` probes, or that has no probes at all, and that does not set `customAudiences`.

**If a probe sets `httpGet.httpHeaders`**, the value must become a list. Where there is a compile step, the program stops building until you change it; where there is not, the old shape still reaches the provider, which warns that an array was expected and deploys the header correctly anyway. Wrapping the header in a list is the whole fix: **nothing is replaced and nothing is updated**.

**If you set `customAudiences`**, delete the line. Cloud Run worker pools never accepted the field: on v9 the API returned an empty list and the worker pool ran exactly as if it had not been set. Deleting it **replaces nothing**. A value read back from `customAudiences`, on the resource or on the `gcp.cloudrunv2.getWorkerPool` data source, is gone as well.

**If you set `httpGet.httpHeaders.port`, or left `httpGet.httpHeaders.name` unset**, that worker pool does not exist: GCP rejects both with a 400 at create time. Delete the `port`, give the header a `name`.

#### Am I affected?

Run the following command against each stack. It reads state and changes nothing.

```bash
pulumi stack export | jq -r '
  .deployment.resources[]
  | select(.type == "gcp:cloudrunv2/workerPool:WorkerPool")
  | [ (if .inputs.customAudiences then "    customAudiences is set" else empty end),
      ( (.inputs.template.containers // []) | to_entries[] as $c
        | ("startupProbe", "livenessProbe") as $p
        | ($c.value[$p].httpGet.httpHeaders // empty)
        | "    containers[\($c.key)].\($p).httpGet.httpHeaders is \(type)" ) ] as $found
  | select($found | length > 0)
  | "\(.urn)\n\($found | join("\n"))"
'
```

Output from a stack with one worker pool of each kind:

```text
urn:pulumi:dev::my-stack::gcp:cloudrunv2/workerPool:WorkerPool::worker-pool
    customAudiences is set
urn:pulumi:dev::my-stack::gcp:cloudrunv2/workerPool:WorkerPool::probe-worker-pool
    containers[0].startupProbe.httpGet.httpHeaders is object
    containers[0].livenessProbe.httpGet.httpHeaders is object
```

Reading it:

- `is object` — wrap that header in a list, see the Remediation section below.
- `customAudiences is set` — delete that line from your program, see the Remediation section below.
- `is array` — already done, nothing to do.
- no output at all — the stack has no affected worker pool, so you are not affected.

#### Remediation

**If a probe sets `httpGet.httpHeaders`**, put the header in a list. The liveness probe takes the same edit. Nothing is replaced.

```typescript
startupProbe: {
    initialDelaySeconds: 0,
    periodSeconds: 10,
    timeoutSeconds: 5,
    failureThreshold: 10,
    httpGet: {
        path: "/",
        port: 8080,
        // v9
        // httpHeaders: { name: "X-Startup-Probe", value: "named" },
        // v10 (fixed)
        httpHeaders: [{ name: "X-Startup-Probe", value: "named" }],
    },
},
```

**If you set `customAudiences`**, delete the line. Nothing is replaced.

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}

{{% choosable language typescript %}}

```typescript
const audiences = new gcp.cloudrunv2.WorkerPool("worker-pool", {
    name: "worker-pool",
    location: location,
    deletionProtection: false,
    scaling: { manualInstanceCount: 1 },
    // v9, removed in v10
    // customAudiences: ["https://worker-pool.example.com"],
    template: {
        containers: [{ image: image }],
    },
});
```

{{% /choosable %}}

{{% choosable language python %}}

```python
audiences = gcp.cloudrunv2.WorkerPool("worker-pool",
    name="worker-pool",
    location=location,
    deletion_protection=False,
    scaling={
        "manual_instance_count": 1,
    },
    # v9, removed in v10
    # custom_audiences=["https://worker-pool.example.com"],
    template={
        "containers": [{
            "image": image,
        }],
    })
```

{{% /choosable %}}

{{% choosable language go %}}

```go
_, err := cloudrunv2.NewWorkerPool(ctx, "worker-pool", &cloudrunv2.WorkerPoolArgs{
	Name:               pulumi.String("worker-pool"),
	Location:           pulumi.String(location),
	DeletionProtection: pulumi.Bool(false),
	Scaling: &cloudrunv2.WorkerPoolScalingArgs{
		ManualInstanceCount: pulumi.Int(1),
	},
	// v9, removed in v10
	// CustomAudiences: pulumi.StringArray{pulumi.String("https://worker-pool.example.com")},
	Template: &cloudrunv2.WorkerPoolTemplateArgs{
		Containers: cloudrunv2.WorkerPoolTemplateContainerArray{
			&cloudrunv2.WorkerPoolTemplateContainerArgs{
				Image: pulumi.String(image),
			},
		},
	},
})
if err != nil {
	return err
}
```

{{% /choosable %}}

{{% choosable language csharp %}}

```csharp
var audiences = new Gcp.CloudRunV2.WorkerPool("worker-pool", new()
{
    Name = "worker-pool",
    Location = location,
    DeletionProtection = false,
    Scaling = new Gcp.CloudRunV2.Inputs.WorkerPoolScalingArgs
    {
        ManualInstanceCount = 1,
    },
    // v9, removed in v10
    // CustomAudiences = new[] { "https://worker-pool.example.com" },
    Template = new Gcp.CloudRunV2.Inputs.WorkerPoolTemplateArgs
    {
        Containers = new[]
        {
            new Gcp.CloudRunV2.Inputs.WorkerPoolTemplateContainerArgs
            {
                Image = image,
            },
        },
    },
});
```

{{% /choosable %}}

{{% choosable language java %}}

```java
var audiences = new WorkerPool("worker-pool", WorkerPoolArgs.builder()
    .name("worker-pool")
    .location(location)
    .deletionProtection(false)
    .scaling(WorkerPoolScalingArgs.builder()
        .manualInstanceCount(1)
        .build())
    // v9, removed in v10
    // .customAudiences("https://worker-pool.example.com")
    .template(WorkerPoolTemplateArgs.builder()
        .containers(WorkerPoolTemplateContainerArgs.builder()
            .image(image)
            .build())
        .build())
    .build());
```

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
resources:
  audiences:
    type: gcp:cloudrunv2:WorkerPool
    name: worker-pool
    properties:
      name: worker-pool
      location: ${location}
      deletionProtection: false
      scaling:
        manualInstanceCount: 1
      # v9, removed in v10
      # customAudiences:
      #   - https://worker-pool.example.com
      template:
        containers:
          - image: ${image}
```

{{% /choosable %}}

{{< /chooser >}}

### `gcp.compute.ServiceAttachment`: `natSubnets` and `consumerRejectLists` are now sets

On `gcp.compute.ServiceAttachment`, `natSubnets` and `consumerRejectLists` are now sets rather than lists. The order of their entries is no longer significant: reordering them in your program produces no diff, and the order the provider stores and hands back is its own, not the order you wrote.

This removes a recurring diff. On v9 a service attachment with more than one NAT subnet could show an update on every `pulumi up` and never settle, because GCP returns the subnets in its own order and in a different URL form than the one you supplied. That no longer happens.

#### Impact/Risk

**Unaffected:** anyone whose `gcp.compute.ServiceAttachment` has at most one `natSubnets` entry and at most one `consumerRejectLists` entry, and anyone who does not read either collection back. No program change is required in any case, and nothing is replaced.

**If you read `natSubnets` or `consumerRejectLists` back by index**, the value at a given index can change. The first `pulumi up --refresh` after the upgrade rewrites both collections in state into the provider's order, which is neither the order you wrote nor the order GCP returns. A stack output built from the first entry changes value silently, with the attachment itself reported as unchanged. If the entry feeds another resource, that resource gets whatever diff its own rules imply.

**If you had a recurring diff on `natSubnets`**, it is gone. An attachment that showed an update on every run now previews clean with no edit to your program.

#### Am I affected?

Run this against each stack. It is read-only.

```bash
pulumi stack export | jq -r '
  .deployment.resources[]
  | select(.type == "gcp:compute/serviceAttachment:ServiceAttachment")
  | "\(.urn)",
    "    natSubnets          : \((.outputs.natSubnets // []) | map(split("/") | last))",
    "    consumerRejectLists : \((.outputs.consumerRejectLists // []) | map(split("/") | last))"
'
```

Output from a stack with one service attachment, before the upgrade:

```text
urn:pulumi:dev::my-stack::gcp:compute/serviceAttachment:ServiceAttachment::service-attachment
    natSubnets          : ["nat-subnet-b","nat-subnet-a"]
    consumerRejectLists : ["pulumi-k8s-provider","pulumi-k8s-operator"]
```

Reading it:

- two or more entries in either collection — the order can change on the first refresh after the upgrade. Check whether anything indexes that collection, and if so see the Remediation section below.
- one entry or none in both — nothing to do.
- no output at all — the stack has no `gcp.compute.ServiceAttachment`, so you are not affected.

The same command after the upgrade and a refresh shows the new order, so you can see exactly which positions moved:

```text
    natSubnets          : ["nat-subnet-a","nat-subnet-b"]
    consumerRejectLists : ["pulumi-k8s-operator","pulumi-k8s-provider"]
```

#### Remediation

**If nothing reads the two collections back**, there is nothing to change. The program below is valid on both versions, and on v10 it previews clean where on v9 it showed an update on every run.

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}

{{% choosable language typescript %}}

```typescript
const attachment = new gcp.compute.ServiceAttachment("service-attachment", {
    name: "service-attachment",
    region: region,
    description: "example service attachment",
    enableProxyProtocol: false,
    connectionPreference: "ACCEPT_MANUAL",
    targetService: targetService.id,
    natSubnets: [natA.id, natB.id],
    consumerRejectLists: ["pulumi-k8s-provider", "pulumi-k8s-operator"],
    consumerAcceptLists: [{
        projectIdOrNum: "pulumi-ci-gcp-provider",
        connectionLimit: 1,
    }],
});
```

{{% /choosable %}}

{{% choosable language python %}}

```python
attachment = gcp.compute.ServiceAttachment("service-attachment",
    name="service-attachment",
    region=region,
    description="example service attachment",
    enable_proxy_protocol=False,
    connection_preference="ACCEPT_MANUAL",
    target_service=target_service.id,
    nat_subnets=[
        nat_a.id,
        nat_b.id,
    ],
    consumer_reject_lists=[
        "pulumi-k8s-provider",
        "pulumi-k8s-operator",
    ],
    consumer_accept_lists=[{
        "project_id_or_num": "pulumi-ci-gcp-provider",
        "connection_limit": 1,
    }])
```

{{% /choosable %}}

{{% choosable language go %}}

```go
_, err := compute.NewServiceAttachment(ctx, "service-attachment", &compute.ServiceAttachmentArgs{
	Name:                 pulumi.String("service-attachment"),
	Region:               pulumi.String(region),
	Description:          pulumi.String("example service attachment"),
	EnableProxyProtocol:  pulumi.Bool(false),
	ConnectionPreference: pulumi.String("ACCEPT_MANUAL"),
	TargetService:        targetService.ID().ToIDOutput().ToStringOutput(),
	NatSubnets: pulumi.StringArray{
		natA.ID().ToIDOutput().ToStringOutput(),
		natB.ID().ToIDOutput().ToStringOutput(),
	},
	ConsumerRejectLists: pulumi.StringArray{
		pulumi.String("pulumi-k8s-provider"),
		pulumi.String("pulumi-k8s-operator"),
	},
	ConsumerAcceptLists: compute.ServiceAttachmentConsumerAcceptListArray{
		&compute.ServiceAttachmentConsumerAcceptListArgs{
			ProjectIdOrNum:  pulumi.String("pulumi-ci-gcp-provider"),
			ConnectionLimit: pulumi.Int(1),
		},
	},
})
if err != nil {
	return err
}
```

{{% /choosable %}}

{{% choosable language csharp %}}

```csharp
var attachment = new Gcp.Compute.ServiceAttachment("service-attachment", new()
{
    Name = "service-attachment",
    Region = region,
    Description = "example service attachment",
    EnableProxyProtocol = false,
    ConnectionPreference = "ACCEPT_MANUAL",
    TargetService = targetService.Id,
    NatSubnets = new[]
    {
        natA.Id,
        natB.Id,
    },
    ConsumerRejectLists = new[]
    {
        "pulumi-k8s-provider",
        "pulumi-k8s-operator",
    },
    ConsumerAcceptLists = new[]
    {
        new Gcp.Compute.Inputs.ServiceAttachmentConsumerAcceptListArgs
        {
            ProjectIdOrNum = "pulumi-ci-gcp-provider",
            ConnectionLimit = 1,
        },
    },
});
```

{{% /choosable %}}

{{% choosable language java %}}

```java
var attachment = new ServiceAttachment("service-attachment", ServiceAttachmentArgs.builder()
    .name("service-attachment")
    .region(region)
    .description("example service attachment")
    .enableProxyProtocol(false)
    .connectionPreference("ACCEPT_MANUAL")
    .targetService(targetService.id())
    .natSubnets(
        natA.id(),
        natB.id())
    .consumerRejectLists(
        "pulumi-k8s-provider",
        "pulumi-k8s-operator")
    .consumerAcceptLists(ServiceAttachmentConsumerAcceptListArgs.builder()
        .projectIdOrNum("pulumi-ci-gcp-provider")
        .connectionLimit(1)
        .build())
    .build());
```

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
resources:
  attachment:
    type: gcp:compute:ServiceAttachment
    name: service-attachment
    properties:
      name: service-attachment
      region: ${region}
      description: example service attachment
      enableProxyProtocol: false
      connectionPreference: ACCEPT_MANUAL
      targetService: ${targetService.id}
      natSubnets:
        - ${natA.id}
        - ${natB.id}
      consumerRejectLists:
        - pulumi-k8s-provider
        - pulumi-k8s-operator
      consumerAcceptLists:
        - projectIdOrNum: pulumi-ci-gcp-provider
          connectionLimit: 1
```

{{% /choosable %}}

{{< /chooser >}}

**If you index into either collection**, stop indexing the value the provider returns and index the value you supplied. Nothing is replaced by this edit.

v9:

```typescript
export const firstNatSubnet = attachment.natSubnets.apply(s => s[0]);
export const firstRejectedProject = attachment.consumerRejectLists.apply(s => (s ?? [])[0]);
```

v10:

```typescript
export const firstNatSubnet = natA.id;
export const firstRejectedProject = "pulumi-k8s-provider";
```

Make this edit before the refresh. The reorder lands on the first `pulumi up --refresh` after the upgrade, and until then state keeps the old order, so a stack that has been bumped but not refreshed will not have shown you the change yet.

### `gcp.container.Cluster`: the `enableComponents` fields are now sets

`gcp.container.Cluster` now treats `loggingConfig.enableComponents` and `monitoringConfig.enableComponents` as sets rather than lists.

The declared type is unchanged. Both fields are still arrays of strings and no resource argument needs editing. What changes is order: the values you read back from the cluster now come back sorted alphabetically rather than in the order GKE returned them, and the order you write them in no longer has any effect. That reaches your program only if it reads a position out of one of those arrays.

#### Impact/Risk

**Unaffected:** anyone who sets `loggingConfig.enableComponents` or `monitoringConfig.enableComponents` and never reads the value back, which is nearly everyone. Nothing is replaced, before or after the upgrade.

**If your program reads a position out of either array**, such as `enableComponents[0]`, that value changes once, at your first refresh after the upgrade: a cluster declaring `["APISERVER", "SYSTEM_COMPONENTS"]` used to hand back `SYSTEM_COMPONENTS` at position `0` and now hands back `APISERVER`. A recurring `enableComponents` update that never settled also stops, because the order no longer counts as a difference.

#### Am I affected?

Run the following command against each stack to see whether the recorded order of `enableComponents` will move. It reads state and changes nothing.

```bash
pulumi stack export | jq -r '
  .deployment.resources[]
  | select(.type == "gcp:container/cluster:Cluster")
  | . as $r
  | ("loggingConfig", "monitoringConfig")
  | . as $block
  | ($r.outputs[$block].enableComponents // empty)
  | select(length > 1)
  | "\($r.urn)  \($block)\n    now   = \(tojson)\n    after = \(sort | tojson)"
'
```

Output from a stack with one cluster that declares two logging components and two monitoring components:

```text
urn:pulumi:dev::my-stack::gcp:container/cluster:Cluster::cluster  loggingConfig
    now   = ["WORKLOADS","SYSTEM_COMPONENTS"]
    after = ["SYSTEM_COMPONENTS","WORKLOADS"]
urn:pulumi:dev::my-stack::gcp:container/cluster:Cluster::cluster  monitoringConfig
    now   = ["SYSTEM_COMPONENTS","APISERVER"]
    after = ["APISERVER","SYSTEM_COMPONENTS"]
```

Reading it:

- no output at all — no cluster in the stack sets more than one component in either field, so no order can move and you are not affected.
- `now` and `after` identical — the components are already in sorted order, so nothing moves.
- `now` and `after` different — the order changes at your first refresh after the upgrade. That only matters if something in your program reads a position out of the array; if something does, see the Remediation section below. If nothing does, you are not affected either.

#### Remediation

**If you read a position out of `loggingConfig.enableComponents` or `monitoringConfig.enableComponents`**, that position now holds a different component. Replace the index with the question you were really asking. Nothing is replaced either way.

v9:

```typescript
export const firstLoggingComponent = cluster.loggingConfig.apply(c => c.enableComponents[0]);
export const firstMonitoringComponent = cluster.monitoringConfig.apply(c => c.enableComponents[0]);
```

v10, when the question was membership:

```typescript
export const loggingHasWorkloads = cluster.loggingConfig.apply(c => c.enableComponents.includes("WORKLOADS"));
export const monitoringHasApiserver = cluster.monitoringConfig.apply(c => c.enableComponents.includes("APISERVER"));
```

v10, when you need a stable ordering of your own:

```typescript
export const loggingComponentsSorted = cluster.loggingConfig.apply(c => [...c.enableComponents].sort());
export const monitoringComponentsSorted = cluster.monitoringConfig.apply(c => [...c.enableComponents].sort());
```

### `gcp.compute.Reservation`: top-level `reservationBlockCount` removed

The top-level `reservationBlockCount` attribute has been removed from `gcp.compute.Reservation` and from the `gcp.compute.getReservation` function. Read `resourceStatuses[0].reservationBlockCount` instead, which is available in v9 as well.

`reservationBlockCount` was never settable, so no configuration changes. Only code that reads the value has to move.

#### Impact/Risk

**Unaffected:** anyone who does not read `reservationBlockCount`. The reservation's own configuration is untouched by this change and **no reservation is replaced**, on upgrade or on any later update.

**If your program reads `reservationBlockCount`**, in a stack output, a `StackReference` or any derived value, what happens depends on whether your language checks types before the deployment runs:

- Compiled languages fail at build, before anything is deployed.
- Interpreted languages have no build step. The read produces no value, the deployment succeeds, and any stack output built from it silently disappears. Anything downstream that consumed that output gets no value back rather than an error.

**`resourceStatuses` is empty for a reservation that has no blocks**, where the removed attribute reported `0`. Substituting the new path on its own gives you no value; supply `0` as the fallback to keep what v9 reported.

#### Am I affected?

The change is in the values your program reads, so it is your source that decides whether you are affected. Search it for `reservationBlockCount`; every occurrence that is not already under `resourceStatuses` has to move.

To find which stacks hold reservations, and what value their state carries today, run the following command against each stack. It reads state and changes nothing.

```bash
pulumi stack export | jq -r '
  .deployment.resources[]
  | select(.type == "gcp:compute/reservation:Reservation")
  | "\(.urn)\n    reservationBlockCount                     = \(.outputs.reservationBlockCount // "absent")\n    resourceStatuses[0].reservationBlockCount = \(.outputs.resourceStatuses[0].reservationBlockCount // "absent")"
'
```

Output from a stack still on v9:

```text
urn:pulumi:dev::my-stack::gcp:compute/reservation:Reservation::reservation
    reservationBlockCount                     = 0
    resourceStatuses[0].reservationBlockCount = absent
```

Reading it:

- no output at all — the stack has no reservations, so you are not affected.
- a number next to `reservationBlockCount` and `absent` next to the nested path — the reservation has no blocks, and this is the value to preserve with a fallback. See the Remediation section below.
- a number next to both — the reservation has blocks, and the nested path already reports the same value.

#### Remediation

**If you read the attribute on the resource**, move the read under `resourceStatuses`. Nothing is replaced.

v9:

```typescript
export const blockCount = reservation.reservationBlockCount;
```

v10:

```typescript
export const blockCount = reservation.resourceStatuses.apply(
    s => s[0]?.reservationBlockCount ?? 0);
```

If you read the attribute on a reservation you looked up rather than created, the same move applies to the `gcp.compute.getReservation` result.

The `?? 0` is the part to keep. `resourceStatuses` is empty for a reservation with no blocks, and without the fallback the value is absent rather than the `0` v9 reported.

## Other changes

Everything in the release that is not covered above, listed for completeness.

### Removed resources

- Resource `gcp.beyondcorp.AppConnection` removed:
  - Use `gcp.beyondcorp.SecurityGateway` and `gcp.beyondcorp.SecurityGatewayApplication` for modern BeyondCorp Zero Trust application deployments.

- Resource `gcp.beyondcorp.AppConnector` removed.

- Resource `gcp.beyondcorp.AppGateway` removed:
  - Use `gcp.beyondcorp.SecurityGateway` instead.

- Resource `gcp.ml.EngineModel` removed:
  - The underlying Cloud ML Engine (AI Platform Prediction) API has been deprecated. Migrate to Vertex AI resources such as `gcp.vertex.AiEndpoint`.
  - This was the only resource in the `gcp.ml` module, so the module no longer exists.

- Resource `gcp.vertex.AiSchedule` removed:
  - Use `gcp.colab.Schedule` instead.

### Removed functions

- `gcp.beyondcorp.getAppConnection`
- `gcp.beyondcorp.getAppConnector`
- `gcp.beyondcorp.getAppGateway`

### Changed resources

- Resource `gcp.applicationintegration.Client`:
  - Field `runAsServiceAccount` is removed.

- Resource `gcp.bigquery.DataTransferConfig`:
  - Exactly one of `sensitiveParams.secretAccessKey` and `sensitiveParams.secretAccessKeyWo` must now be set.
  - Field `sensitiveParams.secretAccessKeyWoVersion` has changed type from integer to string.

- Resource `gcp.cloudsecuritycompliance.Framework`:
  - Field `cloudControlDetails` is now a set. Ordering is no longer significant and duplicate entries are rejected.

- Resource `gcp.compute.BackendService`:
  - Field `loadBalancingScheme` default value changed to `EXTERNAL_MANAGED`.

- Resource `gcp.compute.GlobalForwardingRule`:
  - Field `loadBalancingScheme` default value changed to `EXTERNAL_MANAGED`.

- Resource `gcp.compute.InterconnectAttachmentGroup`:
  - Field `logicalStructure.zones.attachment` is removed.

- Resource `gcp.dataloss.PreventionJobTrigger`:
  - Field `actions.publishFindingsToCloudDataCatalog` is removed.

- Resource `gcp.iam.WorkforcePoolProviderScimTenant`:
  - Field `claimMapping` is now required on create.

- Resource `gcp.netapp.StoragePool`:
  - Field `scaleTier` is removed.

### Changed functions

- Function `gcp.backupdisasterrecovery.getBackupPlanAssociations`:
  - Field `resourceType` is removed.

- Function `gcp.backupdisasterrecovery.getDataSourceReferences`:
  - Field `resourceType` is removed.
