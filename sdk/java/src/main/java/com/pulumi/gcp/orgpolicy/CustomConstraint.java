// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.orgpolicy;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.orgpolicy.CustomConstraintArgs;
import com.pulumi.gcp.orgpolicy.inputs.CustomConstraintState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Org Policy Custom Constraint Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.orgpolicy.CustomConstraint;
 * import com.pulumi.gcp.orgpolicy.CustomConstraintArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var constraint = new CustomConstraint(&#34;constraint&#34;, CustomConstraintArgs.builder()        
 *             .parent(&#34;organizations/123456789&#34;)
 *             .actionType(&#34;ALLOW&#34;)
 *             .condition(&#34;resource.management.autoUpgrade == false&#34;)
 *             .methodTypes(            
 *                 &#34;CREATE&#34;,
 *                 &#34;UPDATE&#34;)
 *             .resourceTypes(&#34;container.googleapis.com/NodePool&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Org Policy Custom Constraint Full
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.orgpolicy.CustomConstraint;
 * import com.pulumi.gcp.orgpolicy.CustomConstraintArgs;
 * import com.pulumi.gcp.orgpolicy.Policy;
 * import com.pulumi.gcp.orgpolicy.PolicyArgs;
 * import com.pulumi.gcp.orgpolicy.inputs.PolicySpecArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var constraint = new CustomConstraint(&#34;constraint&#34;, CustomConstraintArgs.builder()        
 *             .parent(&#34;organizations/123456789&#34;)
 *             .displayName(&#34;Disable GKE auto upgrade&#34;)
 *             .description(&#34;Only allow GKE NodePool resource to be created or updated if AutoUpgrade is not enabled where this custom constraint is enforced.&#34;)
 *             .actionType(&#34;ALLOW&#34;)
 *             .condition(&#34;resource.management.autoUpgrade == false&#34;)
 *             .methodTypes(            
 *                 &#34;CREATE&#34;,
 *                 &#34;UPDATE&#34;)
 *             .resourceTypes(&#34;container.googleapis.com/NodePool&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var bool = new Policy(&#34;bool&#34;, PolicyArgs.builder()        
 *             .parent(&#34;organizations/123456789&#34;)
 *             .spec(PolicySpecArgs.builder()
 *                 .rules(PolicySpecRuleArgs.builder()
 *                     .enforce(&#34;TRUE&#34;)
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * CustomConstraint can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:orgpolicy/customConstraint:CustomConstraint default {{parent}}/customConstraints/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:orgpolicy/customConstraint:CustomConstraint")
public class CustomConstraint extends com.pulumi.resources.CustomResource {
    /**
     * The action to take if the condition is met.
     * Possible values are `ALLOW` and `DENY`.
     * 
     */
    @Export(name="actionType", type=String.class, parameters={})
    private Output<String> actionType;

    /**
     * @return The action to take if the condition is met.
     * Possible values are `ALLOW` and `DENY`.
     * 
     */
    public Output<String> actionType() {
        return this.actionType;
    }
    /**
     * A CEL condition that refers to a supported service resource, for example `resource.management.autoUpgrade == false`. For details about CEL usage, see [Common Expression Language](https://cloud.google.com/resource-manager/docs/organization-policy/creating-managing-custom-constraints#common_expression_language).
     * 
     */
    @Export(name="condition", type=String.class, parameters={})
    private Output<String> condition;

    /**
     * @return A CEL condition that refers to a supported service resource, for example `resource.management.autoUpgrade == false`. For details about CEL usage, see [Common Expression Language](https://cloud.google.com/resource-manager/docs/organization-policy/creating-managing-custom-constraints#common_expression_language).
     * 
     */
    public Output<String> condition() {
        return this.condition;
    }
    /**
     * A human-friendly description of the constraint to display as an error message when the policy is violated.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A human-friendly description of the constraint to display as an error message when the policy is violated.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A human-friendly name for the constraint.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return A human-friendly name for the constraint.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * A list of RESTful methods for which to enforce the constraint. Can be `CREATE`, `UPDATE`, or both. Not all Google Cloud services support both methods. To see supported methods for each service, find the service in [Supported services](https://cloud.google.com/resource-manager/docs/organization-policy/custom-constraint-supported-services).
     * 
     */
    @Export(name="methodTypes", type=List.class, parameters={String.class})
    private Output<List<String>> methodTypes;

    /**
     * @return A list of RESTful methods for which to enforce the constraint. Can be `CREATE`, `UPDATE`, or both. Not all Google Cloud services support both methods. To see supported methods for each service, find the service in [Supported services](https://cloud.google.com/resource-manager/docs/organization-policy/custom-constraint-supported-services).
     * 
     */
    public Output<List<String>> methodTypes() {
        return this.methodTypes;
    }
    /**
     * Immutable. The name of the custom constraint. This is unique within the organization.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The name of the custom constraint. This is unique within the organization.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }
    /**
     * Immutable. The fully qualified name of the Google Cloud REST resource containing the object and field you want to restrict. For example, `container.googleapis.com/NodePool`.
     * 
     */
    @Export(name="resourceTypes", type=List.class, parameters={String.class})
    private Output<List<String>> resourceTypes;

    /**
     * @return Immutable. The fully qualified name of the Google Cloud REST resource containing the object and field you want to restrict. For example, `container.googleapis.com/NodePool`.
     * 
     */
    public Output<List<String>> resourceTypes() {
        return this.resourceTypes;
    }
    /**
     * Output only. The timestamp representing when the constraint was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Output only. The timestamp representing when the constraint was last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomConstraint(String name) {
        this(name, CustomConstraintArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomConstraint(String name, CustomConstraintArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomConstraint(String name, CustomConstraintArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:orgpolicy/customConstraint:CustomConstraint", name, args == null ? CustomConstraintArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomConstraint(String name, Output<String> id, @Nullable CustomConstraintState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:orgpolicy/customConstraint:CustomConstraint", name, state, makeResourceOptions(options, id));
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
    public static CustomConstraint get(String name, Output<String> id, @Nullable CustomConstraintState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomConstraint(name, id, state, options);
    }
}