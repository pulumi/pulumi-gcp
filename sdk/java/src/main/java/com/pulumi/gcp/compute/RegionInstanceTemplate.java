// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.RegionInstanceTemplateArgs;
import com.pulumi.gcp.compute.inputs.RegionInstanceTemplateState;
import com.pulumi.gcp.compute.outputs.RegionInstanceTemplateAdvancedMachineFeatures;
import com.pulumi.gcp.compute.outputs.RegionInstanceTemplateConfidentialInstanceConfig;
import com.pulumi.gcp.compute.outputs.RegionInstanceTemplateDisk;
import com.pulumi.gcp.compute.outputs.RegionInstanceTemplateGuestAccelerator;
import com.pulumi.gcp.compute.outputs.RegionInstanceTemplateNetworkInterface;
import com.pulumi.gcp.compute.outputs.RegionInstanceTemplateNetworkPerformanceConfig;
import com.pulumi.gcp.compute.outputs.RegionInstanceTemplateReservationAffinity;
import com.pulumi.gcp.compute.outputs.RegionInstanceTemplateScheduling;
import com.pulumi.gcp.compute.outputs.RegionInstanceTemplateServiceAccount;
import com.pulumi.gcp.compute.outputs.RegionInstanceTemplateShieldedInstanceConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Instance templates can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/regions/{{region}}/instanceTemplates/{{name}}`
 * 
 * * `{{project}}/{{name}}`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, instance templates can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionInstanceTemplate:RegionInstanceTemplate default projects/{{project}}/regions/{{region}}/instanceTemplates/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionInstanceTemplate:RegionInstanceTemplate default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionInstanceTemplate:RegionInstanceTemplate default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionInstanceTemplate:RegionInstanceTemplate")
public class RegionInstanceTemplate extends com.pulumi.resources.CustomResource {
    /**
     * Configure Nested Virtualisation and Simultaneous Hyper Threading on this VM. Structure is documented below
     * 
     */
    @Export(name="advancedMachineFeatures", refs={RegionInstanceTemplateAdvancedMachineFeatures.class}, tree="[0]")
    private Output</* @Nullable */ RegionInstanceTemplateAdvancedMachineFeatures> advancedMachineFeatures;

    /**
     * @return Configure Nested Virtualisation and Simultaneous Hyper Threading on this VM. Structure is documented below
     * 
     */
    public Output<Optional<RegionInstanceTemplateAdvancedMachineFeatures>> advancedMachineFeatures() {
        return Codegen.optional(this.advancedMachineFeatures);
    }
    /**
     * Whether to allow sending and receiving of
     * packets with non-matching source or destination IPs. This defaults to false.
     * 
     */
    @Export(name="canIpForward", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> canIpForward;

    /**
     * @return Whether to allow sending and receiving of
     * packets with non-matching source or destination IPs. This defaults to false.
     * 
     */
    public Output<Optional<Boolean>> canIpForward() {
        return Codegen.optional(this.canIpForward);
    }
    /**
     * Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
     * 
     */
    @Export(name="confidentialInstanceConfig", refs={RegionInstanceTemplateConfidentialInstanceConfig.class}, tree="[0]")
    private Output<RegionInstanceTemplateConfidentialInstanceConfig> confidentialInstanceConfig;

    /**
     * @return Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
     * 
     */
    public Output<RegionInstanceTemplateConfidentialInstanceConfig> confidentialInstanceConfig() {
        return this.confidentialInstanceConfig;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", refs={String.class}, tree="[0]")
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * A brief description of this resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A brief description of this resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Disks to attach to instances created from this template.
     * This can be specified multiple times for multiple disks. Structure is
     * documented below.
     * 
     */
    @Export(name="disks", refs={List.class,RegionInstanceTemplateDisk.class}, tree="[0,1]")
    private Output<List<RegionInstanceTemplateDisk>> disks;

    /**
     * @return Disks to attach to instances created from this template.
     * This can be specified multiple times for multiple disks. Structure is
     * documented below.
     * 
     */
    public Output<List<RegionInstanceTemplateDisk>> disks() {
        return this.disks;
    }
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Export(name="effectiveLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Output<Map<String,String>> effectiveLabels() {
        return this.effectiveLabels;
    }
    /**
     * Enable [Virtual Displays](https://cloud.google.com/compute/docs/instances/enable-instance-virtual-display#verify_display_driver) on this instance.
     * **Note**: `allow_stopping_for_update` must be set to true in order to update this field.
     * 
     */
    @Export(name="enableDisplay", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableDisplay;

    /**
     * @return Enable [Virtual Displays](https://cloud.google.com/compute/docs/instances/enable-instance-virtual-display#verify_display_driver) on this instance.
     * **Note**: `allow_stopping_for_update` must be set to true in order to update this field.
     * 
     */
    public Output<Optional<Boolean>> enableDisplay() {
        return Codegen.optional(this.enableDisplay);
    }
    /**
     * List of the type and count of accelerator cards attached to the instance. Structure documented below.
     * 
     */
    @Export(name="guestAccelerators", refs={List.class,RegionInstanceTemplateGuestAccelerator.class}, tree="[0,1]")
    private Output</* @Nullable */ List<RegionInstanceTemplateGuestAccelerator>> guestAccelerators;

    /**
     * @return List of the type and count of accelerator cards attached to the instance. Structure documented below.
     * 
     */
    public Output<Optional<List<RegionInstanceTemplateGuestAccelerator>>> guestAccelerators() {
        return Codegen.optional(this.guestAccelerators);
    }
    /**
     * A brief description to use for instances
     * created from this template.
     * 
     */
    @Export(name="instanceDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instanceDescription;

    /**
     * @return A brief description to use for instances
     * created from this template.
     * 
     */
    public Output<Optional<String>> instanceDescription() {
        return Codegen.optional(this.instanceDescription);
    }
    /**
     * Action to be taken when a customer&#39;s encryption key is revoked. Supports `STOP` and `NONE`, with `NONE` being the default.
     * 
     */
    @Export(name="keyRevocationActionType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keyRevocationActionType;

    /**
     * @return Action to be taken when a customer&#39;s encryption key is revoked. Supports `STOP` and `NONE`, with `NONE` being the default.
     * 
     */
    public Output<Optional<String>> keyRevocationActionType() {
        return Codegen.optional(this.keyRevocationActionType);
    }
    /**
     * A set of key/value label pairs to assign to instances
     * created from this template.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field &#39;effective_labels&#39; for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs to assign to instances
     * created from this template.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field &#39;effective_labels&#39; for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The machine type to create.
     * 
     * To create a machine with a [custom type](https://cloud.google.com/dataproc/docs/concepts/compute/custom-machine-types) (such as extended memory), format the value like `custom-VCPUS-MEM_IN_MB` like `custom-6-20480` for 6 vCPU and 20GB of RAM.
     * 
     * ***
     * 
     */
    @Export(name="machineType", refs={String.class}, tree="[0]")
    private Output<String> machineType;

    /**
     * @return The machine type to create.
     * 
     * To create a machine with a [custom type](https://cloud.google.com/dataproc/docs/concepts/compute/custom-machine-types) (such as extended memory), format the value like `custom-VCPUS-MEM_IN_MB` like `custom-6-20480` for 6 vCPU and 20GB of RAM.
     * 
     * ***
     * 
     */
    public Output<String> machineType() {
        return this.machineType;
    }
    /**
     * Metadata key/value pairs to make available from
     * within instances created from this template.
     * 
     */
    @Export(name="metadata", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return Metadata key/value pairs to make available from
     * within instances created from this template.
     * 
     */
    public Output<Optional<Map<String,String>>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * The unique fingerprint of the metadata.
     * 
     */
    @Export(name="metadataFingerprint", refs={String.class}, tree="[0]")
    private Output<String> metadataFingerprint;

    /**
     * @return The unique fingerprint of the metadata.
     * 
     */
    public Output<String> metadataFingerprint() {
        return this.metadataFingerprint;
    }
    /**
     * An alternative to using the
     * startup-script metadata key, mostly to match the compute_instance resource.
     * This replaces the startup-script metadata key on the created instance and
     * thus the two mechanisms are not allowed to be used simultaneously.
     * 
     */
    @Export(name="metadataStartupScript", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> metadataStartupScript;

    /**
     * @return An alternative to using the
     * startup-script metadata key, mostly to match the compute_instance resource.
     * This replaces the startup-script metadata key on the created instance and
     * thus the two mechanisms are not allowed to be used simultaneously.
     * 
     */
    public Output<Optional<String>> metadataStartupScript() {
        return Codegen.optional(this.metadataStartupScript);
    }
    /**
     * Specifies a minimum CPU platform. Applicable values are the friendly names of CPU platforms, such as
     * `Intel Haswell` or `Intel Skylake`. See the complete list [here](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform).
     * 
     */
    @Export(name="minCpuPlatform", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> minCpuPlatform;

    /**
     * @return Specifies a minimum CPU platform. Applicable values are the friendly names of CPU platforms, such as
     * `Intel Haswell` or `Intel Skylake`. See the complete list [here](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform).
     * 
     */
    public Output<Optional<String>> minCpuPlatform() {
        return Codegen.optional(this.minCpuPlatform);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`. Max length is 54 characters.
     * Prefixes with lengths longer than 37 characters will use a shortened
     * UUID that will be more prone to collisions.
     * 
     * Resulting name for a `name_prefix` &lt;= 37 characters:
     * `name_prefix` + YYYYmmddHHSSssss + 8 digit incremental counter
     * Resulting name for a `name_prefix` 38 - 54 characters:
     * `name_prefix` + YYmmdd + 3 digit incremental counter
     * 
     */
    @Export(name="namePrefix", refs={String.class}, tree="[0]")
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`. Max length is 54 characters.
     * Prefixes with lengths longer than 37 characters will use a shortened
     * UUID that will be more prone to collisions.
     * 
     * Resulting name for a `name_prefix` &lt;= 37 characters:
     * `name_prefix` + YYYYmmddHHSSssss + 8 digit incremental counter
     * Resulting name for a `name_prefix` 38 - 54 characters:
     * `name_prefix` + YYmmdd + 3 digit incremental counter
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * Networks to attach to instances created from
     * this template. This can be specified multiple times for multiple networks.
     * Structure is documented below.
     * 
     */
    @Export(name="networkInterfaces", refs={List.class,RegionInstanceTemplateNetworkInterface.class}, tree="[0,1]")
    private Output</* @Nullable */ List<RegionInstanceTemplateNetworkInterface>> networkInterfaces;

    /**
     * @return Networks to attach to instances created from
     * this template. This can be specified multiple times for multiple networks.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<RegionInstanceTemplateNetworkInterface>>> networkInterfaces() {
        return Codegen.optional(this.networkInterfaces);
    }
    /**
     * Configures network performance settings for the instance created from the
     * template. Structure is documented below. **Note**: `machine_type`
     * must be a [supported type](https://cloud.google.com/compute/docs/networking/configure-vm-with-high-bandwidth-configuration),
     * the `image` used must include the [`GVNIC`](https://cloud.google.com/compute/docs/networking/using-gvnic#create-instance-gvnic-image)
     * in `guest-os-features`, and `network_interface.0.nic-type` must be `GVNIC`
     * in order for this setting to take effect.
     * 
     */
    @Export(name="networkPerformanceConfig", refs={RegionInstanceTemplateNetworkPerformanceConfig.class}, tree="[0]")
    private Output</* @Nullable */ RegionInstanceTemplateNetworkPerformanceConfig> networkPerformanceConfig;

    /**
     * @return Configures network performance settings for the instance created from the
     * template. Structure is documented below. **Note**: `machine_type`
     * must be a [supported type](https://cloud.google.com/compute/docs/networking/configure-vm-with-high-bandwidth-configuration),
     * the `image` used must include the [`GVNIC`](https://cloud.google.com/compute/docs/networking/using-gvnic#create-instance-gvnic-image)
     * in `guest-os-features`, and `network_interface.0.nic-type` must be `GVNIC`
     * in order for this setting to take effect.
     * 
     */
    public Output<Optional<RegionInstanceTemplateNetworkPerformanceConfig>> networkPerformanceConfig() {
        return Codegen.optional(this.networkPerformanceConfig);
    }
    /**
     * numeric identifier of the resource.
     * 
     */
    @Export(name="numericId", refs={String.class}, tree="[0]")
    private Output<String> numericId;

    /**
     * @return numeric identifier of the resource.
     * 
     */
    public Output<String> numericId() {
        return this.numericId;
    }
    /**
     * Beta key/value pair represents partner metadata assigned to instance template where key represent a defined namespace and value is a json string represent the entries associted with the namespace.
     * 
     */
    @Export(name="partnerMetadata", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> partnerMetadata;

    /**
     * @return Beta key/value pair represents partner metadata assigned to instance template where key represent a defined namespace and value is a json string represent the entries associted with the namespace.
     * 
     */
    public Output<Optional<Map<String,String>>> partnerMetadata() {
        return Codegen.optional(this.partnerMetadata);
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The combination of labels configured directly on the resource and default labels configured on the provider.
     * 
     */
    @Export(name="pulumiLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource and default labels configured on the provider.
     * 
     */
    public Output<Map<String,String>> pulumiLabels() {
        return this.pulumiLabels;
    }
    /**
     * The Region in which the resource belongs.
     * If region is not provided, the provider region is used.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The Region in which the resource belongs.
     * If region is not provided, the provider region is used.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Specifies the reservations that this instance can consume from.
     * Structure is documented below.
     * 
     */
    @Export(name="reservationAffinity", refs={RegionInstanceTemplateReservationAffinity.class}, tree="[0]")
    private Output</* @Nullable */ RegionInstanceTemplateReservationAffinity> reservationAffinity;

    /**
     * @return Specifies the reservations that this instance can consume from.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RegionInstanceTemplateReservationAffinity>> reservationAffinity() {
        return Codegen.optional(this.reservationAffinity);
    }
    /**
     * A set of key/value resource manager tag pairs to bind to the instance. Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/456.
     * 
     */
    @Export(name="resourceManagerTags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> resourceManagerTags;

    /**
     * @return A set of key/value resource manager tag pairs to bind to the instance. Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/456.
     * 
     */
    public Output<Optional<Map<String,String>>> resourceManagerTags() {
        return Codegen.optional(this.resourceManagerTags);
    }
    /**
     * - A list of self_links of resource policies to attach to the instance. Modifying this list will cause the instance to recreate. Currently a max of 1 resource policy is supported.
     * 
     */
    @Export(name="resourcePolicies", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> resourcePolicies;

    /**
     * @return - A list of self_links of resource policies to attach to the instance. Modifying this list will cause the instance to recreate. Currently a max of 1 resource policy is supported.
     * 
     */
    public Output<Optional<String>> resourcePolicies() {
        return Codegen.optional(this.resourcePolicies);
    }
    /**
     * The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     * 
     */
    @Export(name="scheduling", refs={RegionInstanceTemplateScheduling.class}, tree="[0]")
    private Output<RegionInstanceTemplateScheduling> scheduling;

    /**
     * @return The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     * 
     */
    public Output<RegionInstanceTemplateScheduling> scheduling() {
        return this.scheduling;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", refs={String.class}, tree="[0]")
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Service account to attach to the instance. Structure is documented below.
     * 
     */
    @Export(name="serviceAccount", refs={RegionInstanceTemplateServiceAccount.class}, tree="[0]")
    private Output</* @Nullable */ RegionInstanceTemplateServiceAccount> serviceAccount;

    /**
     * @return Service account to attach to the instance. Structure is documented below.
     * 
     */
    public Output<Optional<RegionInstanceTemplateServiceAccount>> serviceAccount() {
        return Codegen.optional(this.serviceAccount);
    }
    /**
     * Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
     * **Note**: `shielded_instance_config` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
     * 
     */
    @Export(name="shieldedInstanceConfig", refs={RegionInstanceTemplateShieldedInstanceConfig.class}, tree="[0]")
    private Output<RegionInstanceTemplateShieldedInstanceConfig> shieldedInstanceConfig;

    /**
     * @return Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
     * **Note**: `shielded_instance_config` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
     * 
     */
    public Output<RegionInstanceTemplateShieldedInstanceConfig> shieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * Tags to attach to the instance.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Tags to attach to the instance.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The unique fingerprint of the tags.
     * 
     */
    @Export(name="tagsFingerprint", refs={String.class}, tree="[0]")
    private Output<String> tagsFingerprint;

    /**
     * @return The unique fingerprint of the tags.
     * 
     */
    public Output<String> tagsFingerprint() {
        return this.tagsFingerprint;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionInstanceTemplate(java.lang.String name) {
        this(name, RegionInstanceTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionInstanceTemplate(java.lang.String name, RegionInstanceTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionInstanceTemplate(java.lang.String name, RegionInstanceTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionInstanceTemplate:RegionInstanceTemplate", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RegionInstanceTemplate(java.lang.String name, Output<java.lang.String> id, @Nullable RegionInstanceTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionInstanceTemplate:RegionInstanceTemplate", name, state, makeResourceOptions(options, id), false);
    }

    private static RegionInstanceTemplateArgs makeArgs(RegionInstanceTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RegionInstanceTemplateArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "effectiveLabels",
                "pulumiLabels"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RegionInstanceTemplate get(java.lang.String name, Output<java.lang.String> id, @Nullable RegionInstanceTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegionInstanceTemplate(name, id, state, options);
    }
}
