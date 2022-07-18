// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.dataproc.ClusterIAMBindingArgs;
import com.pulumi.gcp.dataproc.inputs.ClusterIAMBindingState;
import com.pulumi.gcp.dataproc.outputs.ClusterIAMBindingCondition;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage IAM policies on dataproc clusters. Each of these resources serves a different use case:
 * 
 * * `gcp.dataproc.ClusterIAMPolicy`: Authoritative. Sets the IAM policy for the cluster and replaces any existing policy already attached.
 * * `gcp.dataproc.ClusterIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the cluster are preserved.
 * * `gcp.dataproc.ClusterIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the cluster are preserved.
 * 
 * &gt; **Note:** `gcp.dataproc.ClusterIAMPolicy` **cannot** be used in conjunction with `gcp.dataproc.ClusterIAMBinding` and `gcp.dataproc.ClusterIAMMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the cluster as `gcp.dataproc.ClusterIAMPolicy` replaces the entire policy.
 * 
 * &gt; **Note:** `gcp.dataproc.ClusterIAMBinding` resources **can be** used in conjunction with `gcp.dataproc.ClusterIAMMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_dataproc\_cluster\_iam\_policy
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var admin = Output.of(OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
 *             .bindings(GetIAMPolicyBindingArgs.builder()
 *                 .role(&#34;roles/editor&#34;)
 *                 .members(&#34;user:jane@example.com&#34;)
 *                 .build())
 *             .build()));
 * 
 *         var editor = new ClusterIAMPolicy(&#34;editor&#34;, ClusterIAMPolicyArgs.builder()        
 *             .project(&#34;your-project&#34;)
 *             .region(&#34;your-region&#34;)
 *             .cluster(&#34;your-dataproc-cluster&#34;)
 *             .policyData(admin.apply(getIAMPolicyResult -&gt; getIAMPolicyResult.policyData()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## google\_dataproc\_cluster\_iam\_binding
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var editor = new ClusterIAMBinding(&#34;editor&#34;, ClusterIAMBindingArgs.builder()        
 *             .cluster(&#34;your-dataproc-cluster&#34;)
 *             .members(&#34;user:jane@example.com&#34;)
 *             .role(&#34;roles/editor&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## google\_dataproc\_cluster\_iam\_member
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var editor = new ClusterIAMMember(&#34;editor&#34;, ClusterIAMMemberArgs.builder()        
 *             .cluster(&#34;your-dataproc-cluster&#34;)
 *             .member(&#34;user:jane@example.com&#34;)
 *             .role(&#34;roles/editor&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cluster IAM resources can be imported using the project, region, cluster name, role and/or member.
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/clusterIAMBinding:ClusterIAMBinding editor &#34;projects/{project}/regions/{region}/clusters/{cluster}&#34;
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/clusterIAMBinding:ClusterIAMBinding editor &#34;projects/{project}/regions/{region}/clusters/{cluster} roles/editor&#34;
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/clusterIAMBinding:ClusterIAMBinding editor &#34;projects/{project}/regions/{region}/clusters/{cluster} roles/editor user:jane@example.com&#34;
 * ```
 * 
 *  -&gt; **Custom Roles**If you&#39;re importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:dataproc/clusterIAMBinding:ClusterIAMBinding")
public class ClusterIAMBinding extends com.pulumi.resources.CustomResource {
    /**
     * The name or relative resource id of the cluster to manage IAM policies for.
     * 
     */
    @Export(name="cluster", type=String.class, parameters={})
    private Output<String> cluster;

    /**
     * @return The name or relative resource id of the cluster to manage IAM policies for.
     * 
     */
    public Output<String> cluster() {
        return this.cluster;
    }
    @Export(name="condition", type=ClusterIAMBindingCondition.class, parameters={})
    private Output</* @Nullable */ ClusterIAMBindingCondition> condition;

    public Output<Optional<ClusterIAMBindingCondition>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * (Computed) The etag of the clusters&#39;s IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the clusters&#39;s IAM policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    @Export(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }
    /**
     * The project in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The region in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.dataproc.ClusterIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.dataproc.ClusterIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterIAMBinding(String name) {
        this(name, ClusterIAMBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterIAMBinding(String name, ClusterIAMBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterIAMBinding(String name, ClusterIAMBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/clusterIAMBinding:ClusterIAMBinding", name, args == null ? ClusterIAMBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterIAMBinding(String name, Output<String> id, @Nullable ClusterIAMBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/clusterIAMBinding:ClusterIAMBinding", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static ClusterIAMBinding get(String name, Output<String> id, @Nullable ClusterIAMBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterIAMBinding(name, id, state, options);
    }
}