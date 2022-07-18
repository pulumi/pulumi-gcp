// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.accesscontextmanager.AccessLevelArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelState;
import com.pulumi.gcp.accesscontextmanager.outputs.AccessLevelBasic;
import com.pulumi.gcp.accesscontextmanager.outputs.AccessLevelCustom;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An AccessLevel is a label that can be applied to requests to GCP services,
 * along with a list of requirements necessary for the label to be applied.
 * 
 * To get more information about AccessLevel, see:
 * 
 * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.accessLevels)
 * * How-to Guides
 *     * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
 * 
 * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
 * you must specify a `billing_project` and set `user_project_override` to true
 * in the provider configuration. Otherwise the ACM API will return a 403 error.
 * Your account must have the `serviceusage.services.use` permission on the
 * `billing_project` you defined.
 * 
 * ## Example Usage
 * ### Access Context Manager Access Level Basic
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
 *         var access_policy = new AccessPolicy(&#34;access-policy&#34;, AccessPolicyArgs.builder()        
 *             .parent(&#34;organizations/123456789&#34;)
 *             .title(&#34;my policy&#34;)
 *             .build());
 * 
 *         var access_level = new AccessLevel(&#34;access-level&#34;, AccessLevelArgs.builder()        
 *             .basic(AccessLevelBasicArgs.builder()
 *                 .conditions(AccessLevelBasicConditionArgs.builder()
 *                     .devicePolicy(AccessLevelBasicConditionDevicePolicyArgs.builder()
 *                         .osConstraints(AccessLevelBasicConditionDevicePolicyOsConstraintArgs.builder()
 *                             .osType(&#34;DESKTOP_CHROME_OS&#34;)
 *                             .build())
 *                         .requireScreenLock(true)
 *                         .build())
 *                     .regions(                    
 *                         &#34;CH&#34;,
 *                         &#34;IT&#34;,
 *                         &#34;US&#34;)
 *                     .build())
 *                 .build())
 *             .parent(access_policy.name().apply(name -&gt; String.format(&#34;accessPolicies/%s&#34;, name)))
 *             .title(&#34;chromeos_no_lock&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * AccessLevel can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/accessLevel:AccessLevel default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:accesscontextmanager/accessLevel:AccessLevel")
public class AccessLevel extends com.pulumi.resources.CustomResource {
    /**
     * A set of predefined conditions for the access level and a combining function.
     * Structure is documented below.
     * 
     */
    @Export(name="basic", type=AccessLevelBasic.class, parameters={})
    private Output</* @Nullable */ AccessLevelBasic> basic;

    /**
     * @return A set of predefined conditions for the access level and a combining function.
     * Structure is documented below.
     * 
     */
    public Output<Optional<AccessLevelBasic>> basic() {
        return Codegen.optional(this.basic);
    }
    /**
     * Custom access level conditions are set using the Cloud Common Expression Language to represent the necessary conditions for the level to apply to a request.
     * See CEL spec at: https://github.com/google/cel-spec.
     * Structure is documented below.
     * 
     */
    @Export(name="custom", type=AccessLevelCustom.class, parameters={})
    private Output</* @Nullable */ AccessLevelCustom> custom;

    /**
     * @return Custom access level conditions are set using the Cloud Common Expression Language to represent the necessary conditions for the level to apply to a request.
     * See CEL spec at: https://github.com/google/cel-spec.
     * Structure is documented below.
     * 
     */
    public Output<Optional<AccessLevelCustom>> custom() {
        return Codegen.optional(this.custom);
    }
    /**
     * Description of the expression
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the expression
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Resource name for the Access Level. The short_name component must begin
     * with a letter and only include alphanumeric and &#39;_&#39;.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name for the Access Level. The short_name component must begin
     * with a letter and only include alphanumeric and &#39;_&#39;.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The AccessPolicy this AccessLevel lives in.
     * Format: accessPolicies/{policy_id}
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The AccessPolicy this AccessLevel lives in.
     * Format: accessPolicies/{policy_id}
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }
    /**
     * Title for the expression, i.e. a short string describing its purpose.
     * 
     */
    @Export(name="title", type=String.class, parameters={})
    private Output<String> title;

    /**
     * @return Title for the expression, i.e. a short string describing its purpose.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessLevel(String name) {
        this(name, AccessLevelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessLevel(String name, AccessLevelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessLevel(String name, AccessLevelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessLevel:AccessLevel", name, args == null ? AccessLevelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessLevel(String name, Output<String> id, @Nullable AccessLevelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessLevel:AccessLevel", name, state, makeResourceOptions(options, id));
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
    public static AccessLevel get(String name, Output<String> id, @Nullable AccessLevelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessLevel(name, id, state, options);
    }
}