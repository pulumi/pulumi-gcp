// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.dataproc.JobIAMMemberArgs;
import com.pulumi.gcp.dataproc.inputs.JobIAMMemberState;
import com.pulumi.gcp.dataproc.outputs.JobIAMMemberCondition;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage IAM policies on dataproc jobs. Each of these resources serves a different use case:
 * 
 * * `gcp.dataproc.JobIAMPolicy`: Authoritative. Sets the IAM policy for the job and replaces any existing policy already attached.
 * * `gcp.dataproc.JobIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the job are preserved.
 * * `gcp.dataproc.JobIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the job are preserved.
 * 
 * &gt; **Note:** `gcp.dataproc.JobIAMPolicy` **cannot** be used in conjunction with `gcp.dataproc.JobIAMBinding` and `gcp.dataproc.JobIAMMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the job as `gcp.dataproc.JobIAMPolicy` replaces the entire policy.
 * 
 * &gt; **Note:** `gcp.dataproc.JobIAMBinding` resources **can be** used in conjunction with `gcp.dataproc.JobIAMMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_dataproc\_job\_iam\_policy
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
 *         var editor = new JobIAMPolicy(&#34;editor&#34;, JobIAMPolicyArgs.builder()        
 *             .project(&#34;your-project&#34;)
 *             .region(&#34;your-region&#34;)
 *             .jobId(&#34;your-dataproc-job&#34;)
 *             .policyData(admin.apply(getIAMPolicyResult -&gt; getIAMPolicyResult.policyData()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## google\_dataproc\_job\_iam\_binding
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
 *         var editor = new JobIAMBinding(&#34;editor&#34;, JobIAMBindingArgs.builder()        
 *             .jobId(&#34;your-dataproc-job&#34;)
 *             .members(&#34;user:jane@example.com&#34;)
 *             .role(&#34;roles/editor&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## google\_dataproc\_job\_iam\_member
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
 *         var editor = new JobIAMMember(&#34;editor&#34;, JobIAMMemberArgs.builder()        
 *             .jobId(&#34;your-dataproc-job&#34;)
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
 * Job IAM resources can be imported using the project, region, job id, role and/or member.
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/jobIAMMember:JobIAMMember editor &#34;projects/{project}/regions/{region}/jobs/{job_id}&#34;
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/jobIAMMember:JobIAMMember editor &#34;projects/{project}/regions/{region}/jobs/{job_id} roles/editor&#34;
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/jobIAMMember:JobIAMMember editor &#34;projects/{project}/regions/{region}/jobs/{job_id} roles/editor user:jane@example.com&#34;
 * ```
 * 
 *  -&gt; **Custom Roles**If you&#39;re importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:dataproc/jobIAMMember:JobIAMMember")
public class JobIAMMember extends com.pulumi.resources.CustomResource {
    @Export(name="condition", type=JobIAMMemberCondition.class, parameters={})
    private Output</* @Nullable */ JobIAMMemberCondition> condition;

    public Output<Optional<JobIAMMemberCondition>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * (Computed) The etag of the jobs&#39;s IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the jobs&#39;s IAM policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    @Export(name="jobId", type=String.class, parameters={})
    private Output<String> jobId;

    public Output<String> jobId() {
        return this.jobId;
    }
    @Export(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }
    /**
     * The project in which the job belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project in which the job belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The region in which the job belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region in which the job belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.dataproc.JobIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.dataproc.JobIAMBinding` can be used per role. Note that custom roles must be of the format
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
    public JobIAMMember(String name) {
        this(name, JobIAMMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JobIAMMember(String name, JobIAMMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobIAMMember(String name, JobIAMMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/jobIAMMember:JobIAMMember", name, args == null ? JobIAMMemberArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private JobIAMMember(String name, Output<String> id, @Nullable JobIAMMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/jobIAMMember:JobIAMMember", name, state, makeResourceOptions(options, id));
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
    public static JobIAMMember get(String name, Output<String> id, @Nullable JobIAMMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new JobIAMMember(name, id, state, options);
    }
}