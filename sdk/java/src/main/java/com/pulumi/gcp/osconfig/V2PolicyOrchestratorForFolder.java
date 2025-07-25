// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.osconfig.V2PolicyOrchestratorForFolderArgs;
import com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderState;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorForFolderOrchestratedResource;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorForFolderOrchestrationScope;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorForFolderOrchestrationState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * PolicyOrchestrator helps managing project+zone level policy resources (e.g.
 * OS Policy Assignments), by providing tools to create, update and delete them
 * across projects and locations, at scale.
 * 
 * ## Example Usage
 * 
 * ### Osconfigv2 Policy Orchestrator For Folder Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.Folder;
 * import com.pulumi.gcp.organizations.FolderArgs;
 * import com.pulumi.gcp.folder.ServiceIdentity;
 * import com.pulumi.gcp.folder.ServiceIdentityArgs;
 * import com.pulumi.time.sleep;
 * import com.pulumi.time.sleepArgs;
 * import com.pulumi.gcp.folder.IAMMember;
 * import com.pulumi.gcp.folder.IAMMemberArgs;
 * import com.pulumi.gcp.osconfig.V2PolicyOrchestratorForFolder;
 * import com.pulumi.gcp.osconfig.V2PolicyOrchestratorForFolderArgs;
 * import com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceArgs;
 * import com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadArgs;
 * import com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs;
 * import com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs;
 * import com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs;
 * import com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationScopeArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var myFolder = new Folder("myFolder", FolderArgs.builder()
 *             .displayName("po-folder")
 *             .parent("organizations/123456789")
 *             .deletionProtection(false)
 *             .build());
 * 
 *         var osconfigSa = new ServiceIdentity("osconfigSa", ServiceIdentityArgs.builder()
 *             .folder(myFolder.folderId())
 *             .service("osconfig.googleapis.com")
 *             .build());
 * 
 *         var rippleSa = new ServiceIdentity("rippleSa", ServiceIdentityArgs.builder()
 *             .folder(myFolder.folderId())
 *             .service("progressiverollout.googleapis.com")
 *             .build());
 * 
 *         var wait30Sec = new Sleep("wait30Sec", SleepArgs.builder()
 *             .createDuration("30s")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(List.of(                
 *                     osconfigSa,
 *                     rippleSa))
 *                 .build());
 * 
 *         var iamOsconfigServiceAgent = new IAMMember("iamOsconfigServiceAgent", IAMMemberArgs.builder()
 *             .folder(myFolder.folderId())
 *             .role("roles/osconfig.serviceAgent")
 *             .member(osconfigSa.member())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(wait30Sec)
 *                 .build());
 * 
 *         var iamOsconfigRolloutServiceAgent = new IAMMember("iamOsconfigRolloutServiceAgent", IAMMemberArgs.builder()
 *             .folder(myFolder.folderId())
 *             .role("roles/osconfig.rolloutServiceAgent")
 *             .member(myFolder.folderId().applyValue(_folderId -> String.format("serviceAccount:service-folder-%s}{@literal @}{@code gcp-sa-osconfig-rollout.iam.gserviceaccount.com", _folderId)))
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(iamOsconfigServiceAgent)
 *                 .build());
 * 
 *         var iamProgressiverolloutServiceAgent = new IAMMember("iamProgressiverolloutServiceAgent", IAMMemberArgs.builder()
 *             .folder(myFolder.folderId())
 *             .role("roles/progressiverollout.serviceAgent")
 *             .member(rippleSa.member())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(iamOsconfigRolloutServiceAgent)
 *                 .build());
 * 
 *         var wait3Min = new Sleep("wait3Min", SleepArgs.builder()
 *             .createDuration("180s")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(List.of(iamProgressiverolloutServiceAgent))
 *                 .build());
 * 
 *         var policyOrchestratorForFolder = new V2PolicyOrchestratorForFolder("policyOrchestratorForFolder", V2PolicyOrchestratorForFolderArgs.builder()
 *             .policyOrchestratorId("po-folder")
 *             .folderId(myFolder.folderId())
 *             .state("ACTIVE")
 *             .action("UPSERT")
 *             .orchestratedResource(V2PolicyOrchestratorForFolderOrchestratedResourceArgs.builder()
 *                 .id("test-orchestrated-resource-folder")
 *                 .osPolicyAssignmentV1Payload(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.builder()
 *                     .osPolicies(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyArgs.builder()
 *                         .id("test-os-policy-folder")
 *                         .mode("VALIDATION")
 *                         .resourceGroups(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupArgs.builder()
 *                             .resources(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.builder()
 *                                 .id("resource-tf")
 *                                 .file(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs.builder()
 *                                     .content("file-content-tf")
 *                                     .path("file-path-tf-1")
 *                                     .state("PRESENT")
 *                                     .build())
 *                                 .build())
 *                             .build())
 *                         .build())
 *                     .instanceFilter(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.builder()
 *                         .inventories(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterInventoryArgs.builder()
 *                             .osShortName("windows-10")
 *                             .build())
 *                         .build())
 *                     .rollout(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs.builder()
 *                         .disruptionBudget(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs.builder()
 *                             .percent(100)
 *                             .build())
 *                         .minWaitDuration("60s")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .labels(Map.of("state", "active"))
 *             .orchestrationScope(V2PolicyOrchestratorForFolderOrchestrationScopeArgs.builder()
 *                 .selectors(V2PolicyOrchestratorForFolderOrchestrationScopeSelectorArgs.builder()
 *                     .locationSelector(V2PolicyOrchestratorForFolderOrchestrationScopeSelectorLocationSelectorArgs.builder()
 *                         .includedLocations("")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(wait3Min)
 *                 .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * PolicyOrchestratorForFolder can be imported using any of these accepted formats:
 * 
 * * `folders/{{folder_id}}/locations/global/policyOrchestrators/{{policy_orchestrator_id}}`
 * 
 * * `{{folder_id}}/{{policy_orchestrator_id}}`
 * 
 * When using the `pulumi import` command, PolicyOrchestratorForFolder can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:osconfig/v2PolicyOrchestratorForFolder:V2PolicyOrchestratorForFolder default folders/{{folder_id}}/locations/global/policyOrchestrators/{{policy_orchestrator_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:osconfig/v2PolicyOrchestratorForFolder:V2PolicyOrchestratorForFolder default {{folder_id}}/{{policy_orchestrator_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:osconfig/v2PolicyOrchestratorForFolder:V2PolicyOrchestratorForFolder")
public class V2PolicyOrchestratorForFolder extends com.pulumi.resources.CustomResource {
    /**
     * Action to be done by the orchestrator in
     * `projects/{project_id}/zones/{zone_id}` locations defined by the
     * `orchestration_scope`. Allowed values:
     * - `UPSERT` - Orchestrator will create or update target resources.
     * - `DELETE` - Orchestrator will delete target resources, if they exist
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output<String> action;

    /**
     * @return Action to be done by the orchestrator in
     * `projects/{project_id}/zones/{zone_id}` locations defined by the
     * `orchestration_scope`. Allowed values:
     * - `UPSERT` - Orchestrator will create or update target resources.
     * - `DELETE` - Orchestrator will delete target resources, if they exist
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * Timestamp when the policy orchestrator resource was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Timestamp when the policy orchestrator resource was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Freeform text describing the purpose of the resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Freeform text describing the purpose of the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
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
     * This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The parent resource name in the form of `folders/{folder_id}/locations/global`.
     * 
     */
    @Export(name="folderId", refs={String.class}, tree="[0]")
    private Output<String> folderId;

    /**
     * @return The parent resource name in the form of `folders/{folder_id}/locations/global`.
     * 
     */
    public Output<String> folderId() {
        return this.folderId;
    }
    /**
     * Labels as key value pairs
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels as key value pairs
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Identifier. In form of
     * * `organizations/{organization_id}/locations/global/policyOrchestrators/{orchestrator_id}`
     * * `folders/{folder_id}/locations/global/policyOrchestrators/{orchestrator_id}`
     * * `projects/{project_id_or_number}/locations/global/policyOrchestrators/{orchestrator_id}`
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Identifier. In form of
     * * `organizations/{organization_id}/locations/global/policyOrchestrators/{orchestrator_id}`
     * * `folders/{folder_id}/locations/global/policyOrchestrators/{orchestrator_id}`
     * * `projects/{project_id_or_number}/locations/global/policyOrchestrators/{orchestrator_id}`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Represents a resource that is being orchestrated by the policy orchestrator.
     * Structure is documented below.
     * 
     */
    @Export(name="orchestratedResource", refs={V2PolicyOrchestratorForFolderOrchestratedResource.class}, tree="[0]")
    private Output<V2PolicyOrchestratorForFolderOrchestratedResource> orchestratedResource;

    /**
     * @return Represents a resource that is being orchestrated by the policy orchestrator.
     * Structure is documented below.
     * 
     */
    public Output<V2PolicyOrchestratorForFolderOrchestratedResource> orchestratedResource() {
        return this.orchestratedResource;
    }
    /**
     * Defines a set of selectors which drive which resources are in scope of policy
     * orchestration.
     * Structure is documented below.
     * 
     */
    @Export(name="orchestrationScope", refs={V2PolicyOrchestratorForFolderOrchestrationScope.class}, tree="[0]")
    private Output</* @Nullable */ V2PolicyOrchestratorForFolderOrchestrationScope> orchestrationScope;

    /**
     * @return Defines a set of selectors which drive which resources are in scope of policy
     * orchestration.
     * Structure is documented below.
     * 
     */
    public Output<Optional<V2PolicyOrchestratorForFolderOrchestrationScope>> orchestrationScope() {
        return Codegen.optional(this.orchestrationScope);
    }
    /**
     * Describes the state of the orchestration process.
     * Structure is documented below.
     * 
     */
    @Export(name="orchestrationStates", refs={List.class,V2PolicyOrchestratorForFolderOrchestrationState.class}, tree="[0,1]")
    private Output<List<V2PolicyOrchestratorForFolderOrchestrationState>> orchestrationStates;

    /**
     * @return Describes the state of the orchestration process.
     * Structure is documented below.
     * 
     */
    public Output<List<V2PolicyOrchestratorForFolderOrchestrationState>> orchestrationStates() {
        return this.orchestrationStates;
    }
    /**
     * The logical identifier of the policy orchestrator, with the following
     * restrictions:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the parent.
     * 
     */
    @Export(name="policyOrchestratorId", refs={String.class}, tree="[0]")
    private Output<String> policyOrchestratorId;

    /**
     * @return The logical identifier of the policy orchestrator, with the following
     * restrictions:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the parent.
     * 
     */
    public Output<String> policyOrchestratorId() {
        return this.policyOrchestratorId;
    }
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Export(name="pulumiLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Output<Map<String,String>> pulumiLabels() {
        return this.pulumiLabels;
    }
    /**
     * Set to true, if the there are ongoing changes being applied by the
     * orchestrator.
     * 
     */
    @Export(name="reconciling", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> reconciling;

    /**
     * @return Set to true, if the there are ongoing changes being applied by the
     * orchestrator.
     * 
     */
    public Output<Boolean> reconciling() {
        return this.reconciling;
    }
    /**
     * State of the orchestrator. Can be updated to change orchestrator behaviour.
     * Allowed values:
     * - `ACTIVE` - orchestrator is actively looking for actions to be taken.
     * - `STOPPED` - orchestrator won&#39;t make any changes.
     *   Note: There might be more states added in the future. We use string here
     *   instead of an enum, to avoid the need of propagating new states to all the
     *   client code.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> state;

    /**
     * @return State of the orchestrator. Can be updated to change orchestrator behaviour.
     * Allowed values:
     * - `ACTIVE` - orchestrator is actively looking for actions to be taken.
     * - `STOPPED` - orchestrator won&#39;t make any changes.
     *   Note: There might be more states added in the future. We use string here
     *   instead of an enum, to avoid the need of propagating new states to all the
     *   client code.
     * 
     */
    public Output<Optional<String>> state() {
        return Codegen.optional(this.state);
    }
    /**
     * Timestamp when the policy orchestrator resource was last modified.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return Timestamp when the policy orchestrator resource was last modified.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public V2PolicyOrchestratorForFolder(java.lang.String name) {
        this(name, V2PolicyOrchestratorForFolderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public V2PolicyOrchestratorForFolder(java.lang.String name, V2PolicyOrchestratorForFolderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public V2PolicyOrchestratorForFolder(java.lang.String name, V2PolicyOrchestratorForFolderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:osconfig/v2PolicyOrchestratorForFolder:V2PolicyOrchestratorForFolder", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private V2PolicyOrchestratorForFolder(java.lang.String name, Output<java.lang.String> id, @Nullable V2PolicyOrchestratorForFolderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:osconfig/v2PolicyOrchestratorForFolder:V2PolicyOrchestratorForFolder", name, state, makeResourceOptions(options, id), false);
    }

    private static V2PolicyOrchestratorForFolderArgs makeArgs(V2PolicyOrchestratorForFolderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? V2PolicyOrchestratorForFolderArgs.Empty : args;
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
    public static V2PolicyOrchestratorForFolder get(java.lang.String name, Output<java.lang.String> id, @Nullable V2PolicyOrchestratorForFolderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new V2PolicyOrchestratorForFolder(name, id, state, options);
    }
}
