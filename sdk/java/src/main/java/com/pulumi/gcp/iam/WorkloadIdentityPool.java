// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.iam.WorkloadIdentityPoolArgs;
import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a collection of external workload identities. You can define IAM policies to
 * grant these identities access to Google Cloud resources.
 * 
 * To get more information about WorkloadIdentityPool, see:
 * 
 * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/projects.locations.workloadIdentityPools)
 * * How-to Guides
 *     * [Managing workload identity pools](https://cloud.google.com/iam/docs/manage-workload-identity-pools-providers#pools)
 * 
 * ## Example Usage
 * 
 * ### Iam Workload Identity Pool Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.iam.WorkloadIdentityPool;
 * import com.pulumi.gcp.iam.WorkloadIdentityPoolArgs;
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
 *         var example = new WorkloadIdentityPool("example", WorkloadIdentityPoolArgs.builder()
 *             .workloadIdentityPoolId("example-pool")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Iam Workload Identity Pool Full
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.iam.WorkloadIdentityPool;
 * import com.pulumi.gcp.iam.WorkloadIdentityPoolArgs;
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
 *         var example = new WorkloadIdentityPool("example", WorkloadIdentityPoolArgs.builder()
 *             .workloadIdentityPoolId("example-pool")
 *             .displayName("Name of pool")
 *             .description("Identity pool for automated test")
 *             .disabled(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * WorkloadIdentityPool can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}`
 * 
 * * `{{project}}/{{workload_identity_pool_id}}`
 * 
 * * `{{workload_identity_pool_id}}`
 * 
 * When using the `pulumi import` command, WorkloadIdentityPool can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:iam/workloadIdentityPool:WorkloadIdentityPool default projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:iam/workloadIdentityPool:WorkloadIdentityPool default {{project}}/{{workload_identity_pool_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:iam/workloadIdentityPool:WorkloadIdentityPool default {{workload_identity_pool_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:iam/workloadIdentityPool:WorkloadIdentityPool")
public class WorkloadIdentityPool extends com.pulumi.resources.CustomResource {
    /**
     * A description of the pool. Cannot exceed 256 characters.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the pool. Cannot exceed 256 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether the pool is disabled. You cannot use a disabled pool to exchange tokens, or use
     * existing tokens to access resources. If the pool is re-enabled, existing tokens grant
     * access again.
     * 
     */
    @Export(name="disabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return Whether the pool is disabled. You cannot use a disabled pool to exchange tokens, or use
     * existing tokens to access resources. If the pool is re-enabled, existing tokens grant
     * access again.
     * 
     */
    public Output<Optional<Boolean>> disabled() {
        return Codegen.optional(this.disabled);
    }
    /**
     * A display name for the pool. Cannot exceed 32 characters.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return A display name for the pool. Cannot exceed 32 characters.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * The resource name of the pool as
     * `projects/{project_number}/locations/global/workloadIdentityPools/{workload_identity_pool_id}`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name of the pool as
     * `projects/{project_number}/locations/global/workloadIdentityPools/{workload_identity_pool_id}`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The state of the pool.
     * * STATE_UNSPECIFIED: State unspecified.
     * * ACTIVE: The pool is active, and may be used in Google Cloud policies.
     * * DELETED: The pool is soft-deleted. Soft-deleted pools are permanently deleted after
     *   approximately 30 days. You can restore a soft-deleted pool using
     *   UndeleteWorkloadIdentityPool. You cannot reuse the ID of a soft-deleted pool until it is
     *   permanently deleted. While a pool is deleted, you cannot use it to exchange tokens, or
     *   use existing tokens to access resources. If the pool is undeleted, existing tokens grant
     *   access again.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The state of the pool.
     * * STATE_UNSPECIFIED: State unspecified.
     * * ACTIVE: The pool is active, and may be used in Google Cloud policies.
     * * DELETED: The pool is soft-deleted. Soft-deleted pools are permanently deleted after
     *   approximately 30 days. You can restore a soft-deleted pool using
     *   UndeleteWorkloadIdentityPool. You cannot reuse the ID of a soft-deleted pool until it is
     *   permanently deleted. While a pool is deleted, you cannot use it to exchange tokens, or
     *   use existing tokens to access resources. If the pool is undeleted, existing tokens grant
     *   access again.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The ID to use for the pool, which becomes the final component of the resource name. This
     * value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
     * `gcp-` is reserved for use by Google, and may not be specified.
     * 
     * ***
     * 
     */
    @Export(name="workloadIdentityPoolId", refs={String.class}, tree="[0]")
    private Output<String> workloadIdentityPoolId;

    /**
     * @return The ID to use for the pool, which becomes the final component of the resource name. This
     * value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
     * `gcp-` is reserved for use by Google, and may not be specified.
     * 
     * ***
     * 
     */
    public Output<String> workloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkloadIdentityPool(java.lang.String name) {
        this(name, WorkloadIdentityPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkloadIdentityPool(java.lang.String name, WorkloadIdentityPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkloadIdentityPool(java.lang.String name, WorkloadIdentityPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iam/workloadIdentityPool:WorkloadIdentityPool", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private WorkloadIdentityPool(java.lang.String name, Output<java.lang.String> id, @Nullable WorkloadIdentityPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iam/workloadIdentityPool:WorkloadIdentityPool", name, state, makeResourceOptions(options, id), false);
    }

    private static WorkloadIdentityPoolArgs makeArgs(WorkloadIdentityPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? WorkloadIdentityPoolArgs.Empty : args;
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
    public static WorkloadIdentityPool get(java.lang.String name, Output<java.lang.String> id, @Nullable WorkloadIdentityPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkloadIdentityPool(name, id, state, options);
    }
}
