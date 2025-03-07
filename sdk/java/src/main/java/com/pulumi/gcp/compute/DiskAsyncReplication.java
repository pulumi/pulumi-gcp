// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.DiskAsyncReplicationArgs;
import com.pulumi.gcp.compute.inputs.DiskAsyncReplicationState;
import com.pulumi.gcp.compute.outputs.DiskAsyncReplicationSecondaryDisk;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Starts and stops asynchronous persistent disk replication. For more information
 * see [the official documentation](https://cloud.google.com/compute/docs/disks/async-pd/about)
 * and the [API](https://cloud.google.com/compute/docs/reference/rest/v1/disks).
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
 * import com.pulumi.gcp.compute.Disk;
 * import com.pulumi.gcp.compute.DiskArgs;
 * import com.pulumi.gcp.compute.inputs.DiskAsyncPrimaryDiskArgs;
 * import com.pulumi.gcp.compute.DiskAsyncReplication;
 * import com.pulumi.gcp.compute.DiskAsyncReplicationArgs;
 * import com.pulumi.gcp.compute.inputs.DiskAsyncReplicationSecondaryDiskArgs;
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
 *         var primary_disk = new Disk("primary-disk", DiskArgs.builder()
 *             .name("primary-disk")
 *             .type("pd-ssd")
 *             .zone("europe-west4-a")
 *             .physicalBlockSizeBytes(4096)
 *             .build());
 * 
 *         var secondary_disk = new Disk("secondary-disk", DiskArgs.builder()
 *             .name("secondary-disk")
 *             .type("pd-ssd")
 *             .zone("europe-west3-a")
 *             .asyncPrimaryDisk(DiskAsyncPrimaryDiskArgs.builder()
 *                 .disk(primary_disk.id())
 *                 .build())
 *             .physicalBlockSizeBytes(4096)
 *             .build());
 * 
 *         var replication = new DiskAsyncReplication("replication", DiskAsyncReplicationArgs.builder()
 *             .primaryDisk(primary_disk.id())
 *             .secondaryDisk(DiskAsyncReplicationSecondaryDiskArgs.builder()
 *                 .disk(secondary_disk.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="gcp:compute/diskAsyncReplication:DiskAsyncReplication")
public class DiskAsyncReplication extends com.pulumi.resources.CustomResource {
    /**
     * The primary disk (source of replication).
     * 
     */
    @Export(name="primaryDisk", refs={String.class}, tree="[0]")
    private Output<String> primaryDisk;

    /**
     * @return The primary disk (source of replication).
     * 
     */
    public Output<String> primaryDisk() {
        return this.primaryDisk;
    }
    /**
     * The secondary disk (target of replication). You can specify only one value. Structure is documented below.
     * 
     * The `secondary_disk` block includes:
     * 
     */
    @Export(name="secondaryDisk", refs={DiskAsyncReplicationSecondaryDisk.class}, tree="[0]")
    private Output<DiskAsyncReplicationSecondaryDisk> secondaryDisk;

    /**
     * @return The secondary disk (target of replication). You can specify only one value. Structure is documented below.
     * 
     * The `secondary_disk` block includes:
     * 
     */
    public Output<DiskAsyncReplicationSecondaryDisk> secondaryDisk() {
        return this.secondaryDisk;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DiskAsyncReplication(java.lang.String name) {
        this(name, DiskAsyncReplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DiskAsyncReplication(java.lang.String name, DiskAsyncReplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiskAsyncReplication(java.lang.String name, DiskAsyncReplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/diskAsyncReplication:DiskAsyncReplication", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DiskAsyncReplication(java.lang.String name, Output<java.lang.String> id, @Nullable DiskAsyncReplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/diskAsyncReplication:DiskAsyncReplication", name, state, makeResourceOptions(options, id), false);
    }

    private static DiskAsyncReplicationArgs makeArgs(DiskAsyncReplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DiskAsyncReplicationArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static DiskAsyncReplication get(java.lang.String name, Output<java.lang.String> id, @Nullable DiskAsyncReplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DiskAsyncReplication(name, id, state, options);
    }
}
