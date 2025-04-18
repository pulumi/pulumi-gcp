// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.InstanceFromMachineImageArgs;
import com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageAdvancedMachineFeatures;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageAttachedDisk;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageBootDisk;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageConfidentialInstanceConfig;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageGuestAccelerator;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageInstanceEncryptionKey;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageNetworkInterface;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageNetworkPerformanceConfig;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageParams;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageReservationAffinity;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageScheduling;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageScratchDisk;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageServiceAccount;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageShieldedInstanceConfig;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageSourceMachineImageEncryptionKey;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a VM instance resource within GCE. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/instances)
 * and
 * [API](https://cloud.google.com/compute/docs/reference/latest/instances).
 * 
 * This resource is specifically to create a compute instance from a given
 * `source_machine_image`. To create an instance without a machine image, use the
 * `gcp.compute.Instance` resource.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.InstanceFromMachineImage;
 * import com.pulumi.gcp.compute.InstanceFromMachineImageArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var tpl = new InstanceFromMachineImage("tpl", InstanceFromMachineImageArgs.builder()
 *             .name("instance-from-machine-image")
 *             .zone("us-central1-a")
 *             .sourceMachineImage("projects/PROJECT-ID/global/machineImages/NAME")
 *             .canIpForward(false)
 *             .labels(Map.of("my_key", "my_value"))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="gcp:compute/instanceFromMachineImage:InstanceFromMachineImage")
public class InstanceFromMachineImage extends com.pulumi.resources.CustomResource {
    /**
     * Controls for advanced machine-related behavior features.
     * 
     */
    @Export(name="advancedMachineFeatures", refs={InstanceFromMachineImageAdvancedMachineFeatures.class}, tree="[0]")
    private Output<InstanceFromMachineImageAdvancedMachineFeatures> advancedMachineFeatures;

    /**
     * @return Controls for advanced machine-related behavior features.
     * 
     */
    public Output<InstanceFromMachineImageAdvancedMachineFeatures> advancedMachineFeatures() {
        return this.advancedMachineFeatures;
    }
    @Export(name="allowStoppingForUpdate", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> allowStoppingForUpdate;

    public Output<Boolean> allowStoppingForUpdate() {
        return this.allowStoppingForUpdate;
    }
    /**
     * List of disks attached to the instance
     * 
     */
    @Export(name="attachedDisks", refs={List.class,InstanceFromMachineImageAttachedDisk.class}, tree="[0,1]")
    private Output<List<InstanceFromMachineImageAttachedDisk>> attachedDisks;

    /**
     * @return List of disks attached to the instance
     * 
     */
    public Output<List<InstanceFromMachineImageAttachedDisk>> attachedDisks() {
        return this.attachedDisks;
    }
    /**
     * The boot disk for the instance.
     * 
     */
    @Export(name="bootDisks", refs={List.class,InstanceFromMachineImageBootDisk.class}, tree="[0,1]")
    private Output<List<InstanceFromMachineImageBootDisk>> bootDisks;

    /**
     * @return The boot disk for the instance.
     * 
     */
    public Output<List<InstanceFromMachineImageBootDisk>> bootDisks() {
        return this.bootDisks;
    }
    /**
     * Whether sending and receiving of packets with non-matching source or destination IPs is allowed.
     * 
     */
    @Export(name="canIpForward", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> canIpForward;

    /**
     * @return Whether sending and receiving of packets with non-matching source or destination IPs is allowed.
     * 
     */
    public Output<Boolean> canIpForward() {
        return this.canIpForward;
    }
    /**
     * The Confidential VM config being used by the instance. on_host_maintenance has to be set to TERMINATE or this will fail
     * to create.
     * 
     */
    @Export(name="confidentialInstanceConfig", refs={InstanceFromMachineImageConfidentialInstanceConfig.class}, tree="[0]")
    private Output<InstanceFromMachineImageConfidentialInstanceConfig> confidentialInstanceConfig;

    /**
     * @return The Confidential VM config being used by the instance. on_host_maintenance has to be set to TERMINATE or this will fail
     * to create.
     * 
     */
    public Output<InstanceFromMachineImageConfidentialInstanceConfig> confidentialInstanceConfig() {
        return this.confidentialInstanceConfig;
    }
    /**
     * The CPU platform used by this instance.
     * 
     */
    @Export(name="cpuPlatform", refs={String.class}, tree="[0]")
    private Output<String> cpuPlatform;

    /**
     * @return The CPU platform used by this instance.
     * 
     */
    public Output<String> cpuPlatform() {
        return this.cpuPlatform;
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
     * Current status of the instance. This could be one of the following values: PROVISIONING, STAGING, RUNNING, STOPPING,
     * SUSPENDING, SUSPENDED, REPAIRING, and TERMINATED. For more information about the status of the instance, see [Instance
     * life cycle](https://cloud.google.com/compute/docs/instances/instance-life-cycle).
     * 
     */
    @Export(name="currentStatus", refs={String.class}, tree="[0]")
    private Output<String> currentStatus;

    /**
     * @return Current status of the instance. This could be one of the following values: PROVISIONING, STAGING, RUNNING, STOPPING,
     * SUSPENDING, SUSPENDED, REPAIRING, and TERMINATED. For more information about the status of the instance, see [Instance
     * life cycle](https://cloud.google.com/compute/docs/instances/instance-life-cycle).
     * 
     */
    public Output<String> currentStatus() {
        return this.currentStatus;
    }
    /**
     * Whether deletion protection is enabled on this instance.
     * 
     */
    @Export(name="deletionProtection", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> deletionProtection;

    /**
     * @return Whether deletion protection is enabled on this instance.
     * 
     */
    public Output<Boolean> deletionProtection() {
        return this.deletionProtection;
    }
    /**
     * A brief description of the resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return A brief description of the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Desired status of the instance. Either &#34;RUNNING&#34;, &#34;SUSPENDED&#34; or &#34;TERMINATED&#34;.
     * 
     */
    @Export(name="desiredStatus", refs={String.class}, tree="[0]")
    private Output<String> desiredStatus;

    /**
     * @return Desired status of the instance. Either &#34;RUNNING&#34;, &#34;SUSPENDED&#34; or &#34;TERMINATED&#34;.
     * 
     */
    public Output<String> desiredStatus() {
        return this.desiredStatus;
    }
    @Export(name="effectiveLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> effectiveLabels;

    public Output<Map<String,String>> effectiveLabels() {
        return this.effectiveLabels;
    }
    /**
     * Whether the instance has virtual displays enabled.
     * 
     */
    @Export(name="enableDisplay", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enableDisplay;

    /**
     * @return Whether the instance has virtual displays enabled.
     * 
     */
    public Output<Boolean> enableDisplay() {
        return this.enableDisplay;
    }
    /**
     * List of the type and count of accelerator cards attached to the instance.
     * 
     */
    @Export(name="guestAccelerators", refs={List.class,InstanceFromMachineImageGuestAccelerator.class}, tree="[0,1]")
    private Output<List<InstanceFromMachineImageGuestAccelerator>> guestAccelerators;

    /**
     * @return List of the type and count of accelerator cards attached to the instance.
     * 
     */
    public Output<List<InstanceFromMachineImageGuestAccelerator>> guestAccelerators() {
        return this.guestAccelerators;
    }
    /**
     * A custom hostname for the instance. Must be a fully qualified DNS name and RFC-1035-valid. Valid format is a series of
     * labels 1-63 characters long matching the regular expression a-z, concatenated with periods. The entire hostname must not
     * exceed 253 characters. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="hostname", refs={String.class}, tree="[0]")
    private Output<String> hostname;

    /**
     * @return A custom hostname for the instance. Must be a fully qualified DNS name and RFC-1035-valid. Valid format is a series of
     * labels 1-63 characters long matching the regular expression a-z, concatenated with periods. The entire hostname must not
     * exceed 253 characters. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * Encryption key used to provide data encryption on the given instance.
     * 
     */
    @Export(name="instanceEncryptionKey", refs={InstanceFromMachineImageInstanceEncryptionKey.class}, tree="[0]")
    private Output<InstanceFromMachineImageInstanceEncryptionKey> instanceEncryptionKey;

    /**
     * @return Encryption key used to provide data encryption on the given instance.
     * 
     */
    public Output<InstanceFromMachineImageInstanceEncryptionKey> instanceEncryptionKey() {
        return this.instanceEncryptionKey;
    }
    /**
     * The server-assigned unique identifier of this instance.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The server-assigned unique identifier of this instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * Action to be taken when a customer&#39;s encryption key is revoked. Supports &#34;STOP&#34; and &#34;NONE&#34;, with &#34;NONE&#34; being the
     * default.
     * 
     */
    @Export(name="keyRevocationActionType", refs={String.class}, tree="[0]")
    private Output<String> keyRevocationActionType;

    /**
     * @return Action to be taken when a customer&#39;s encryption key is revoked. Supports &#34;STOP&#34; and &#34;NONE&#34;, with &#34;NONE&#34; being the
     * default.
     * 
     */
    public Output<String> keyRevocationActionType() {
        return this.keyRevocationActionType;
    }
    /**
     * The unique fingerprint of the labels.
     * 
     */
    @Export(name="labelFingerprint", refs={String.class}, tree="[0]")
    private Output<String> labelFingerprint;

    /**
     * @return The unique fingerprint of the labels.
     * 
     */
    public Output<String> labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * A set of key/value label pairs assigned to the instance. **Note**: This field is non-authoritative, and will only manage
     * the labels present in your configuration. Please refer to the field &#39;effective_labels&#39; for all of the labels present on
     * the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs assigned to the instance. **Note**: This field is non-authoritative, and will only manage
     * the labels present in your configuration. Please refer to the field &#39;effective_labels&#39; for all of the labels present on
     * the resource.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The machine type to create.
     * 
     */
    @Export(name="machineType", refs={String.class}, tree="[0]")
    private Output<String> machineType;

    /**
     * @return The machine type to create.
     * 
     */
    public Output<String> machineType() {
        return this.machineType;
    }
    /**
     * Metadata key/value pairs made available within the instance.
     * 
     */
    @Export(name="metadata", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> metadata;

    /**
     * @return Metadata key/value pairs made available within the instance.
     * 
     */
    public Output<Map<String,String>> metadata() {
        return this.metadata;
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
     * Metadata startup scripts made available within the instance.
     * 
     */
    @Export(name="metadataStartupScript", refs={String.class}, tree="[0]")
    private Output<String> metadataStartupScript;

    /**
     * @return Metadata startup scripts made available within the instance.
     * 
     */
    public Output<String> metadataStartupScript() {
        return this.metadataStartupScript;
    }
    /**
     * The minimum CPU platform specified for the VM instance.
     * 
     */
    @Export(name="minCpuPlatform", refs={String.class}, tree="[0]")
    private Output<String> minCpuPlatform;

    /**
     * @return The minimum CPU platform specified for the VM instance.
     * 
     */
    public Output<String> minCpuPlatform() {
        return this.minCpuPlatform;
    }
    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The networks attached to the instance.
     * 
     */
    @Export(name="networkInterfaces", refs={List.class,InstanceFromMachineImageNetworkInterface.class}, tree="[0,1]")
    private Output<List<InstanceFromMachineImageNetworkInterface>> networkInterfaces;

    /**
     * @return The networks attached to the instance.
     * 
     */
    public Output<List<InstanceFromMachineImageNetworkInterface>> networkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * Configures network performance settings for the instance. If not specified, the instance will be created with its
     * default network performance configuration.
     * 
     */
    @Export(name="networkPerformanceConfig", refs={InstanceFromMachineImageNetworkPerformanceConfig.class}, tree="[0]")
    private Output<InstanceFromMachineImageNetworkPerformanceConfig> networkPerformanceConfig;

    /**
     * @return Configures network performance settings for the instance. If not specified, the instance will be created with its
     * default network performance configuration.
     * 
     */
    public Output<InstanceFromMachineImageNetworkPerformanceConfig> networkPerformanceConfig() {
        return this.networkPerformanceConfig;
    }
    /**
     * Stores additional params passed with the request, but not persisted as part of resource payload.
     * 
     */
    @Export(name="params", refs={InstanceFromMachineImageParams.class}, tree="[0]")
    private Output<InstanceFromMachineImageParams> params;

    /**
     * @return Stores additional params passed with the request, but not persisted as part of resource payload.
     * 
     */
    public Output<InstanceFromMachineImageParams> params() {
        return this.params;
    }
    /**
     * Partner Metadata Map made available within the instance.
     * 
     */
    @Export(name="partnerMetadata", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> partnerMetadata;

    /**
     * @return Partner Metadata Map made available within the instance.
     * 
     */
    public Output<Map<String,String>> partnerMetadata() {
        return this.partnerMetadata;
    }
    /**
     * The ID of the project in which the resource belongs. If self_link is provided, this value is ignored. If neither
     * self_link nor project are provided, the provider project is used.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If self_link is provided, this value is ignored. If neither
     * self_link nor project are provided, the provider project is used.
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
     * Specifies the reservations that this instance can consume from.
     * 
     */
    @Export(name="reservationAffinity", refs={InstanceFromMachineImageReservationAffinity.class}, tree="[0]")
    private Output<InstanceFromMachineImageReservationAffinity> reservationAffinity;

    /**
     * @return Specifies the reservations that this instance can consume from.
     * 
     */
    public Output<InstanceFromMachineImageReservationAffinity> reservationAffinity() {
        return this.reservationAffinity;
    }
    /**
     * A list of self_links of resource policies to attach to the instance. Currently a max of 1 resource policy is supported.
     * 
     */
    @Export(name="resourcePolicies", refs={String.class}, tree="[0]")
    private Output<String> resourcePolicies;

    /**
     * @return A list of self_links of resource policies to attach to the instance. Currently a max of 1 resource policy is supported.
     * 
     */
    public Output<String> resourcePolicies() {
        return this.resourcePolicies;
    }
    /**
     * The scheduling strategy being used by the instance.
     * 
     */
    @Export(name="scheduling", refs={InstanceFromMachineImageScheduling.class}, tree="[0]")
    private Output<InstanceFromMachineImageScheduling> scheduling;

    /**
     * @return The scheduling strategy being used by the instance.
     * 
     */
    public Output<InstanceFromMachineImageScheduling> scheduling() {
        return this.scheduling;
    }
    /**
     * The scratch disks attached to the instance.
     * 
     */
    @Export(name="scratchDisks", refs={List.class,InstanceFromMachineImageScratchDisk.class}, tree="[0,1]")
    private Output<List<InstanceFromMachineImageScratchDisk>> scratchDisks;

    /**
     * @return The scratch disks attached to the instance.
     * 
     */
    public Output<List<InstanceFromMachineImageScratchDisk>> scratchDisks() {
        return this.scratchDisks;
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
     * The service account to attach to the instance.
     * 
     */
    @Export(name="serviceAccount", refs={InstanceFromMachineImageServiceAccount.class}, tree="[0]")
    private Output<InstanceFromMachineImageServiceAccount> serviceAccount;

    /**
     * @return The service account to attach to the instance.
     * 
     */
    public Output<InstanceFromMachineImageServiceAccount> serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * The shielded vm config being used by the instance.
     * 
     */
    @Export(name="shieldedInstanceConfig", refs={InstanceFromMachineImageShieldedInstanceConfig.class}, tree="[0]")
    private Output<InstanceFromMachineImageShieldedInstanceConfig> shieldedInstanceConfig;

    /**
     * @return The shielded vm config being used by the instance.
     * 
     */
    public Output<InstanceFromMachineImageShieldedInstanceConfig> shieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * Name or self link of a machine
     * image to create the instance based on.
     * 
     * ***
     * 
     */
    @Export(name="sourceMachineImage", refs={String.class}, tree="[0]")
    private Output<String> sourceMachineImage;

    /**
     * @return Name or self link of a machine
     * image to create the instance based on.
     * 
     * ***
     * 
     */
    public Output<String> sourceMachineImage() {
        return this.sourceMachineImage;
    }
    /**
     * Encryption key for the source machine image.
     * 
     */
    @Export(name="sourceMachineImageEncryptionKey", refs={InstanceFromMachineImageSourceMachineImageEncryptionKey.class}, tree="[0]")
    private Output</* @Nullable */ InstanceFromMachineImageSourceMachineImageEncryptionKey> sourceMachineImageEncryptionKey;

    /**
     * @return Encryption key for the source machine image.
     * 
     */
    public Output<Optional<InstanceFromMachineImageSourceMachineImageEncryptionKey>> sourceMachineImageEncryptionKey() {
        return Codegen.optional(this.sourceMachineImageEncryptionKey);
    }
    /**
     * The list of tags attached to the instance.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> tags;

    /**
     * @return The list of tags attached to the instance.
     * 
     */
    public Output<List<String>> tags() {
        return this.tags;
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
     * The zone that the machine should be created in. If not
     * set, the provider zone is used.
     * 
     * In addition to these, most* arguments from `gcp.compute.Instance` are supported
     * as a way to override the properties in the machine image. All exported attributes
     * from `gcp.compute.Instance` are likewise exported here.
     * 
     * &gt; **Warning:** *Due to API limitations, disk overrides are currently disabled. This includes the &#34;boot_disk&#34;, &#34;attached_disk&#34;, and &#34;scratch_disk&#34; fields.
     * 
     */
    @Export(name="zone", refs={String.class}, tree="[0]")
    private Output<String> zone;

    /**
     * @return The zone that the machine should be created in. If not
     * set, the provider zone is used.
     * 
     * In addition to these, most* arguments from `gcp.compute.Instance` are supported
     * as a way to override the properties in the machine image. All exported attributes
     * from `gcp.compute.Instance` are likewise exported here.
     * 
     * &gt; **Warning:** *Due to API limitations, disk overrides are currently disabled. This includes the &#34;boot_disk&#34;, &#34;attached_disk&#34;, and &#34;scratch_disk&#34; fields.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceFromMachineImage(java.lang.String name) {
        this(name, InstanceFromMachineImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceFromMachineImage(java.lang.String name, InstanceFromMachineImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceFromMachineImage(java.lang.String name, InstanceFromMachineImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/instanceFromMachineImage:InstanceFromMachineImage", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private InstanceFromMachineImage(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceFromMachineImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/instanceFromMachineImage:InstanceFromMachineImage", name, state, makeResourceOptions(options, id), false);
    }

    private static InstanceFromMachineImageArgs makeArgs(InstanceFromMachineImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? InstanceFromMachineImageArgs.Empty : args;
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
    public static InstanceFromMachineImage get(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceFromMachineImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceFromMachineImage(name, id, state, options);
    }
}
