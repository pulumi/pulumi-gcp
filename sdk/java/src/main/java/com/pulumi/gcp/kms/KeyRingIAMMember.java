// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.kms.KeyRingIAMMemberArgs;
import com.pulumi.gcp.kms.inputs.KeyRingIAMMemberState;
import com.pulumi.gcp.kms.outputs.KeyRingIAMMemberCondition;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for KMS key ring. Each of these resources serves a different use case:
 * 
 * * `gcp.kms.KeyRingIAMPolicy`: Authoritative. Sets the IAM policy for the key ring and replaces any existing policy already attached.
 * * `gcp.kms.KeyRingIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the key ring are preserved.
 * * `gcp.kms.KeyRingIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the key ring are preserved.
 * 
 * &gt; **Note:** `gcp.kms.KeyRingIAMPolicy` **cannot** be used in conjunction with `gcp.kms.KeyRingIAMBinding` and `gcp.kms.KeyRingIAMMember` or they will fight over what your policy should be.
 * 
 * &gt; **Note:** `gcp.kms.KeyRingIAMBinding` resources **can be** used in conjunction with `gcp.kms.KeyRingIAMMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_kms\_key\_ring\_iam\_policy
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
 *         var keyring = new KeyRing(&#34;keyring&#34;, KeyRingArgs.builder()        
 *             .location(&#34;global&#34;)
 *             .build());
 * 
 *         final var admin = Output.of(OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
 *             .bindings(GetIAMPolicyBindingArgs.builder()
 *                 .role(&#34;roles/editor&#34;)
 *                 .members(&#34;user:jane@example.com&#34;)
 *                 .build())
 *             .build()));
 * 
 *         var keyRing = new KeyRingIAMPolicy(&#34;keyRing&#34;, KeyRingIAMPolicyArgs.builder()        
 *             .keyRingId(keyring.id())
 *             .policyData(admin.apply(getIAMPolicyResult -&gt; getIAMPolicyResult.policyData()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * With IAM Conditions:
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
 *         var keyring = new KeyRing(&#34;keyring&#34;, KeyRingArgs.builder()        
 *             .location(&#34;global&#34;)
 *             .build());
 * 
 *         final var admin = Output.of(OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
 *             .bindings(GetIAMPolicyBindingArgs.builder()
 *                 .role(&#34;roles/editor&#34;)
 *                 .members(&#34;user:jane@example.com&#34;)
 *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
 *                     .title(&#34;expires_after_2019_12_31&#34;)
 *                     .description(&#34;Expiring at midnight of 2019-12-31&#34;)
 *                     .expression(&#34;request.time &lt; timestamp(\&#34;2020-01-01T00:00:00Z\&#34;)&#34;)
 *                     .build())
 *                 .build())
 *             .build()));
 * 
 *         var keyRing = new KeyRingIAMPolicy(&#34;keyRing&#34;, KeyRingIAMPolicyArgs.builder()        
 *             .keyRingId(keyring.id())
 *             .policyData(admin.apply(getIAMPolicyResult -&gt; getIAMPolicyResult.policyData()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## google\_kms\_key\_ring\_iam\_binding
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
 *         var keyRing = new KeyRingIAMBinding(&#34;keyRing&#34;, KeyRingIAMBindingArgs.builder()        
 *             .keyRingId(&#34;your-key-ring-id&#34;)
 *             .members(&#34;user:jane@example.com&#34;)
 *             .role(&#34;roles/editor&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * With IAM Conditions:
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
 *         var keyRing = new KeyRingIAMBinding(&#34;keyRing&#34;, KeyRingIAMBindingArgs.builder()        
 *             .condition(KeyRingIAMBindingConditionArgs.builder()
 *                 .description(&#34;Expiring at midnight of 2019-12-31&#34;)
 *                 .expression(&#34;request.time &lt; timestamp(\&#34;2020-01-01T00:00:00Z\&#34;)&#34;)
 *                 .title(&#34;expires_after_2019_12_31&#34;)
 *                 .build())
 *             .keyRingId(&#34;your-key-ring-id&#34;)
 *             .members(&#34;user:jane@example.com&#34;)
 *             .role(&#34;roles/editor&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## google\_kms\_key\_ring\_iam\_member
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
 *         var keyRing = new KeyRingIAMMember(&#34;keyRing&#34;, KeyRingIAMMemberArgs.builder()        
 *             .keyRingId(&#34;your-key-ring-id&#34;)
 *             .member(&#34;user:jane@example.com&#34;)
 *             .role(&#34;roles/editor&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * With IAM Conditions:
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
 *         var keyRing = new KeyRingIAMMember(&#34;keyRing&#34;, KeyRingIAMMemberArgs.builder()        
 *             .condition(KeyRingIAMMemberConditionArgs.builder()
 *                 .description(&#34;Expiring at midnight of 2019-12-31&#34;)
 *                 .expression(&#34;request.time &lt; timestamp(\&#34;2020-01-01T00:00:00Z\&#34;)&#34;)
 *                 .title(&#34;expires_after_2019_12_31&#34;)
 *                 .build())
 *             .keyRingId(&#34;your-key-ring-id&#34;)
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
 * IAM member imports use space-delimited identifiers; the resource in question, the role, and the account.
 * 
 * This member resource can be imported using the `key_ring_id`, role, and account e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:kms/keyRingIAMMember:KeyRingIAMMember key_ring_iam &#34;your-project-id/location-name/key-ring-name roles/viewer user:foo@example.com&#34;
 * ```
 * 
 *  IAM binding imports use space-delimited identifiers; the resource in question and the role.
 * 
 * This binding resource can be imported using the `key_ring_id` and role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:kms/keyRingIAMMember:KeyRingIAMMember key_ring_iam &#34;your-project-id/location-name/key-ring-name roles/viewer&#34;
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question.
 * 
 * This policy resource can be imported using the `key_ring_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:kms/keyRingIAMMember:KeyRingIAMMember key_ring_iam your-project-id/location-name/key-ring-name
 * ```
 * 
 */
@ResourceType(type="gcp:kms/keyRingIAMMember:KeyRingIAMMember")
public class KeyRingIAMMember extends com.pulumi.resources.CustomResource {
    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Export(name="condition", type=KeyRingIAMMemberCondition.class, parameters={})
    private Output</* @Nullable */ KeyRingIAMMemberCondition> condition;

    /**
     * @return ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    public Output<Optional<KeyRingIAMMemberCondition>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * (Computed) The etag of the key ring&#39;s IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the key ring&#39;s IAM policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The key ring ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}` or
     * `{location_name}/{key_ring_name}`. In the second form, the provider&#39;s
     * project setting will be used as a fallback.
     * 
     */
    @Export(name="keyRingId", type=String.class, parameters={})
    private Output<String> keyRingId;

    /**
     * @return The key ring ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}` or
     * `{location_name}/{key_ring_name}`. In the second form, the provider&#39;s
     * project setting will be used as a fallback.
     * 
     */
    public Output<String> keyRingId() {
        return this.keyRingId;
    }
    @Export(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.kms.KeyRingIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.kms.KeyRingIAMBinding` can be used per role. Note that custom roles must be of the format
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
    public KeyRingIAMMember(String name) {
        this(name, KeyRingIAMMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KeyRingIAMMember(String name, KeyRingIAMMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KeyRingIAMMember(String name, KeyRingIAMMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/keyRingIAMMember:KeyRingIAMMember", name, args == null ? KeyRingIAMMemberArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KeyRingIAMMember(String name, Output<String> id, @Nullable KeyRingIAMMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/keyRingIAMMember:KeyRingIAMMember", name, state, makeResourceOptions(options, id));
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
    public static KeyRingIAMMember get(String name, Output<String> id, @Nullable KeyRingIAMMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KeyRingIAMMember(name, id, state, options);
    }
}