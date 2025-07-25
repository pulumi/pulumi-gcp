// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.iam.FoldersPolicyBindingArgs;
import com.pulumi.gcp.iam.inputs.FoldersPolicyBindingState;
import com.pulumi.gcp.iam.outputs.FoldersPolicyBindingCondition;
import com.pulumi.gcp.iam.outputs.FoldersPolicyBindingTarget;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Iam Folders Policy Binding
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.iam.PrincipalAccessBoundaryPolicy;
 * import com.pulumi.gcp.iam.PrincipalAccessBoundaryPolicyArgs;
 * import com.pulumi.gcp.organizations.Folder;
 * import com.pulumi.gcp.organizations.FolderArgs;
 * import com.pulumi.time.sleep;
 * import com.pulumi.time.sleepArgs;
 * import com.pulumi.gcp.iam.FoldersPolicyBinding;
 * import com.pulumi.gcp.iam.FoldersPolicyBindingArgs;
 * import com.pulumi.gcp.iam.inputs.FoldersPolicyBindingTargetArgs;
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
 *         var pabPolicy = new PrincipalAccessBoundaryPolicy("pabPolicy", PrincipalAccessBoundaryPolicyArgs.builder()
 *             .organization("123456789")
 *             .location("global")
 *             .displayName("binding for all principals in the folder")
 *             .principalAccessBoundaryPolicyId("my-pab-policy")
 *             .build());
 * 
 *         var folder = new Folder("folder", FolderArgs.builder()
 *             .displayName("my folder")
 *             .parent("organizations/123456789")
 *             .deletionProtection(false)
 *             .build());
 * 
 *         var wait120s = new Sleep("wait120s", SleepArgs.builder()
 *             .createDuration("120s")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(List.of(folder))
 *                 .build());
 * 
 *         var binding_for_all_folder_principals = new FoldersPolicyBinding("binding-for-all-folder-principals", FoldersPolicyBindingArgs.builder()
 *             .folder(folder.folderId())
 *             .location("global")
 *             .displayName("binding for all principals in the folder")
 *             .policyKind("PRINCIPAL_ACCESS_BOUNDARY")
 *             .policyBindingId("binding-for-all-folder-principals")
 *             .policy(pabPolicy.principalAccessBoundaryPolicyId().applyValue(_principalAccessBoundaryPolicyId -> String.format("organizations/123456789/locations/global/principalAccessBoundaryPolicies/%s", _principalAccessBoundaryPolicyId)))
 *             .target(FoldersPolicyBindingTargetArgs.builder()
 *                 .principalSet(folder.folderId().applyValue(_folderId -> String.format("//cloudresourcemanager.googleapis.com/folders/%s", _folderId)))
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(wait120s)
 *                 .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * FoldersPolicyBinding can be imported using any of these accepted formats:
 * 
 * * `folders/{{folder}}/locations/{{location}}/policyBindings/{{policy_binding_id}}`
 * 
 * * `{{folder}}/{{location}}/{{policy_binding_id}}`
 * 
 * When using the `pulumi import` command, FoldersPolicyBinding can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:iam/foldersPolicyBinding:FoldersPolicyBinding default folders/{{folder}}/locations/{{location}}/policyBindings/{{policy_binding_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:iam/foldersPolicyBinding:FoldersPolicyBinding default {{folder}}/{{location}}/{{policy_binding_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:iam/foldersPolicyBinding:FoldersPolicyBinding")
public class FoldersPolicyBinding extends com.pulumi.resources.CustomResource {
    /**
     * Optional. User defined annotations. See https://google.aip.dev/148#annotations for more details such as format and size limitations
     * 
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> annotations;

    /**
     * @return Optional. User defined annotations. See https://google.aip.dev/148#annotations for more details such as format and size limitations
     * 
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * Represents a textual expression in the Common Expression Language
     * (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
     * CEL are documented at https://github.com/google/cel-spec.
     * Example (Comparison):
     * title: \&#34;Summary size limit\&#34;
     * description: \&#34;Determines if a summary is less than 100 chars\&#34;
     * expression: \&#34;document.summary.size() &lt; 100\&#34;
     * Example
     * (Equality):
     * title: \&#34;Requestor is owner\&#34;
     * description: \&#34;Determines if requestor is the document owner\&#34;
     * expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
     * (Logic):
     * title: \&#34;Public documents\&#34;
     * description: \&#34;Determine whether the document should be publicly visible\&#34;
     * expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
     * Example (Data Manipulation):
     * title: \&#34;Notification string\&#34;
     * description: \&#34;Create a notification string with a timestamp.\&#34;
     * expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
     * The exact variables and functions that may be referenced within an expression are
     * determined by the service that evaluates it. See the service documentation for
     * additional information.
     * Structure is documented below.
     * 
     */
    @Export(name="condition", refs={FoldersPolicyBindingCondition.class}, tree="[0]")
    private Output</* @Nullable */ FoldersPolicyBindingCondition> condition;

    /**
     * @return Represents a textual expression in the Common Expression Language
     * (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
     * CEL are documented at https://github.com/google/cel-spec.
     * Example (Comparison):
     * title: \&#34;Summary size limit\&#34;
     * description: \&#34;Determines if a summary is less than 100 chars\&#34;
     * expression: \&#34;document.summary.size() &lt; 100\&#34;
     * Example
     * (Equality):
     * title: \&#34;Requestor is owner\&#34;
     * description: \&#34;Determines if requestor is the document owner\&#34;
     * expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
     * (Logic):
     * title: \&#34;Public documents\&#34;
     * description: \&#34;Determine whether the document should be publicly visible\&#34;
     * expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
     * Example (Data Manipulation):
     * title: \&#34;Notification string\&#34;
     * description: \&#34;Create a notification string with a timestamp.\&#34;
     * expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
     * The exact variables and functions that may be referenced within an expression are
     * determined by the service that evaluates it. See the service documentation for
     * additional information.
     * Structure is documented below.
     * 
     */
    public Output<Optional<FoldersPolicyBindingCondition>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * Output only. The time when the policy binding was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Output only. The time when the policy binding was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optional. The description of the policy binding. Must be less than or equal to 63 characters.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Optional. The description of the policy binding. Must be less than or equal to 63 characters.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    @Export(name="effectiveAnnotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> effectiveAnnotations;

    public Output<Map<String,String>> effectiveAnnotations() {
        return this.effectiveAnnotations;
    }
    /**
     * Optional. The etag for the policy binding. If this is provided on update, it must match the server&#39;s etag.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return Optional. The etag for the policy binding. If this is provided on update, it must match the server&#39;s etag.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The parent folder for the PolicyBinding.
     * 
     */
    @Export(name="folder", refs={String.class}, tree="[0]")
    private Output<String> folder;

    /**
     * @return The parent folder for the PolicyBinding.
     * 
     */
    public Output<String> folder() {
        return this.folder;
    }
    /**
     * The location of the PolicyBinding.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location of the PolicyBinding.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the policy binding in the format `{binding_parent/locations/{location}/policyBindings/{policy_binding_id}`
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the policy binding in the format `{binding_parent/locations/{location}/policyBindings/{policy_binding_id}`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Required. Immutable. The resource name of the policy to be bound. The binding parent and policy must belong to the same Organization (or Project).
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return Required. Immutable. The resource name of the policy to be bound. The binding parent and policy must belong to the same Organization (or Project).
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * The Policy Binding ID.
     * 
     */
    @Export(name="policyBindingId", refs={String.class}, tree="[0]")
    private Output<String> policyBindingId;

    /**
     * @return The Policy Binding ID.
     * 
     */
    public Output<String> policyBindingId() {
        return this.policyBindingId;
    }
    /**
     * Immutable. The kind of the policy to attach in this binding. This
     * field must be one of the following:  - Left empty (will be automatically set
     * to the policy kind) - The input policy kind   Possible values:  POLICY_KIND_UNSPECIFIED PRINCIPAL_ACCESS_BOUNDARY ACCESS
     * 
     */
    @Export(name="policyKind", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> policyKind;

    /**
     * @return Immutable. The kind of the policy to attach in this binding. This
     * field must be one of the following:  - Left empty (will be automatically set
     * to the policy kind) - The input policy kind   Possible values:  POLICY_KIND_UNSPECIFIED PRINCIPAL_ACCESS_BOUNDARY ACCESS
     * 
     */
    public Output<Optional<String>> policyKind() {
        return Codegen.optional(this.policyKind);
    }
    /**
     * Output only. The globally unique ID of the policy to be bound.
     * 
     */
    @Export(name="policyUid", refs={String.class}, tree="[0]")
    private Output<String> policyUid;

    /**
     * @return Output only. The globally unique ID of the policy to be bound.
     * 
     */
    public Output<String> policyUid() {
        return this.policyUid;
    }
    /**
     * Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
     * Structure is documented below.
     * 
     */
    @Export(name="target", refs={FoldersPolicyBindingTarget.class}, tree="[0]")
    private Output<FoldersPolicyBindingTarget> target;

    /**
     * @return Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
     * Structure is documented below.
     * 
     */
    public Output<FoldersPolicyBindingTarget> target() {
        return this.target;
    }
    /**
     * Output only. The globally unique ID of the policy binding. Assigned when the policy binding is created.
     * 
     */
    @Export(name="uid", refs={String.class}, tree="[0]")
    private Output<String> uid;

    /**
     * @return Output only. The globally unique ID of the policy binding. Assigned when the policy binding is created.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * Output only. The time when the policy binding was most recently updated.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return Output only. The time when the policy binding was most recently updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FoldersPolicyBinding(java.lang.String name) {
        this(name, FoldersPolicyBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FoldersPolicyBinding(java.lang.String name, FoldersPolicyBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FoldersPolicyBinding(java.lang.String name, FoldersPolicyBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iam/foldersPolicyBinding:FoldersPolicyBinding", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FoldersPolicyBinding(java.lang.String name, Output<java.lang.String> id, @Nullable FoldersPolicyBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iam/foldersPolicyBinding:FoldersPolicyBinding", name, state, makeResourceOptions(options, id), false);
    }

    private static FoldersPolicyBindingArgs makeArgs(FoldersPolicyBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FoldersPolicyBindingArgs.Empty : args;
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
    public static FoldersPolicyBinding get(java.lang.String name, Output<java.lang.String> id, @Nullable FoldersPolicyBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FoldersPolicyBinding(name, id, state, options);
    }
}
