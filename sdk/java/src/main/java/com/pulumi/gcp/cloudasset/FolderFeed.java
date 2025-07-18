// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudasset;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.cloudasset.FolderFeedArgs;
import com.pulumi.gcp.cloudasset.inputs.FolderFeedState;
import com.pulumi.gcp.cloudasset.outputs.FolderFeedCondition;
import com.pulumi.gcp.cloudasset.outputs.FolderFeedFeedOutputConfig;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Describes a Cloud Asset Inventory feed used to to listen to asset updates.
 * 
 * To get more information about FolderFeed, see:
 * 
 * * [API documentation](https://cloud.google.com/asset-inventory/docs/reference/rest/)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/asset-inventory/docs)
 * 
 * ## Example Usage
 * 
 * ### Cloud Asset Folder Feed
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.pubsub.Topic;
 * import com.pulumi.gcp.pubsub.TopicArgs;
 * import com.pulumi.gcp.organizations.Folder;
 * import com.pulumi.gcp.organizations.FolderArgs;
 * import com.pulumi.gcp.cloudasset.FolderFeed;
 * import com.pulumi.gcp.cloudasset.FolderFeedArgs;
 * import com.pulumi.gcp.cloudasset.inputs.FolderFeedFeedOutputConfigArgs;
 * import com.pulumi.gcp.cloudasset.inputs.FolderFeedFeedOutputConfigPubsubDestinationArgs;
 * import com.pulumi.gcp.cloudasset.inputs.FolderFeedConditionArgs;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
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
 *         // The topic where the resource change notifications will be sent.
 *         var feedOutput = new Topic("feedOutput", TopicArgs.builder()
 *             .project("my-project-name")
 *             .name("network-updates")
 *             .build());
 * 
 *         // The folder that will be monitored for resource updates.
 *         var myFolder = new Folder("myFolder", FolderArgs.builder()
 *             .displayName("Networking")
 *             .parent("organizations/123456789")
 *             .deletionProtection(false)
 *             .build());
 * 
 *         // Create a feed that sends notifications about network resource updates under a
 *         // particular folder.
 *         var folderFeed = new FolderFeed("folderFeed", FolderFeedArgs.builder()
 *             .billingProject("my-project-name")
 *             .folder(myFolder.folderId())
 *             .feedId("network-updates")
 *             .contentType("RESOURCE")
 *             .assetTypes(            
 *                 "compute.googleapis.com/Subnetwork",
 *                 "compute.googleapis.com/Network")
 *             .feedOutputConfig(FolderFeedFeedOutputConfigArgs.builder()
 *                 .pubsubDestination(FolderFeedFeedOutputConfigPubsubDestinationArgs.builder()
 *                     .topic(feedOutput.id())
 *                     .build())
 *                 .build())
 *             .condition(FolderFeedConditionArgs.builder()
 *                 .expression("""
 * !temporal_asset.deleted &&
 * temporal_asset.prior_asset_state == google.cloud.asset.v1.TemporalAsset.PriorAssetState.DOES_NOT_EXIST
 *                 """)
 *                 .title("created")
 *                 .description("Send notifications on creation events")
 *                 .build())
 *             .build());
 * 
 *         // Find the project number of the project whose identity will be used for sending
 *         // the asset change notifications.
 *         final var project = OrganizationsFunctions.getProject(GetProjectArgs.builder()
 *             .projectId("my-project-name")
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
 * FolderFeed can be imported using any of these accepted formats:
 * 
 * * `folders/{{folder_id}}/feeds/{{name}}`
 * 
 * * `{{folder_id}}/{{name}}`
 * 
 * When using the `pulumi import` command, FolderFeed can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:cloudasset/folderFeed:FolderFeed default folders/{{folder_id}}/feeds/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:cloudasset/folderFeed:FolderFeed default {{folder_id}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:cloudasset/folderFeed:FolderFeed")
public class FolderFeed extends com.pulumi.resources.CustomResource {
    /**
     * A list of the full names of the assets to receive updates. You must specify either or both of
     * assetNames and assetTypes. Only asset updates matching specified assetNames and assetTypes are
     * exported to the feed. For example: //compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1.
     * See https://cloud.google.com/apis/design/resourceNames#fullResourceName for more info.
     * 
     */
    @Export(name="assetNames", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> assetNames;

    /**
     * @return A list of the full names of the assets to receive updates. You must specify either or both of
     * assetNames and assetTypes. Only asset updates matching specified assetNames and assetTypes are
     * exported to the feed. For example: //compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1.
     * See https://cloud.google.com/apis/design/resourceNames#fullResourceName for more info.
     * 
     */
    public Output<Optional<List<String>>> assetNames() {
        return Codegen.optional(this.assetNames);
    }
    /**
     * A list of types of the assets to receive updates. You must specify either or both of assetNames
     * and assetTypes. Only asset updates matching specified assetNames and assetTypes are exported to
     * the feed. For example: &#34;compute.googleapis.com/Disk&#34;
     * See https://cloud.google.com/asset-inventory/docs/supported-asset-types for a list of all
     * supported asset types.
     * 
     */
    @Export(name="assetTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> assetTypes;

    /**
     * @return A list of types of the assets to receive updates. You must specify either or both of assetNames
     * and assetTypes. Only asset updates matching specified assetNames and assetTypes are exported to
     * the feed. For example: &#34;compute.googleapis.com/Disk&#34;
     * See https://cloud.google.com/asset-inventory/docs/supported-asset-types for a list of all
     * supported asset types.
     * 
     */
    public Output<Optional<List<String>>> assetTypes() {
        return Codegen.optional(this.assetTypes);
    }
    /**
     * The project whose identity will be used when sending messages to the
     * destination pubsub topic. It also specifies the project for API
     * enablement check, quota, and billing.
     * 
     */
    @Export(name="billingProject", refs={String.class}, tree="[0]")
    private Output<String> billingProject;

    /**
     * @return The project whose identity will be used when sending messages to the
     * destination pubsub topic. It also specifies the project for API
     * enablement check, quota, and billing.
     * 
     */
    public Output<String> billingProject() {
        return this.billingProject;
    }
    /**
     * A condition which determines whether an asset update should be published. If specified, an asset
     * will be returned only when the expression evaluates to true. When set, expression field
     * must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
     * expression &#34;temporal_asset.deleted == true&#34; will only publish Asset deletions. Other fields of
     * condition are optional.
     * Structure is documented below.
     * 
     */
    @Export(name="condition", refs={FolderFeedCondition.class}, tree="[0]")
    private Output</* @Nullable */ FolderFeedCondition> condition;

    /**
     * @return A condition which determines whether an asset update should be published. If specified, an asset
     * will be returned only when the expression evaluates to true. When set, expression field
     * must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
     * expression &#34;temporal_asset.deleted == true&#34; will only publish Asset deletions. Other fields of
     * condition are optional.
     * Structure is documented below.
     * 
     */
    public Output<Optional<FolderFeedCondition>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * Asset content type. If not specified, no content but the asset name and type will be returned.
     * Possible values are: `CONTENT_TYPE_UNSPECIFIED`, `RESOURCE`, `IAM_POLICY`, `ORG_POLICY`, `OS_INVENTORY`, `ACCESS_POLICY`.
     * 
     */
    @Export(name="contentType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> contentType;

    /**
     * @return Asset content type. If not specified, no content but the asset name and type will be returned.
     * Possible values are: `CONTENT_TYPE_UNSPECIFIED`, `RESOURCE`, `IAM_POLICY`, `ORG_POLICY`, `OS_INVENTORY`, `ACCESS_POLICY`.
     * 
     */
    public Output<Optional<String>> contentType() {
        return Codegen.optional(this.contentType);
    }
    /**
     * This is the client-assigned asset feed identifier and it needs to be unique under a specific parent.
     * 
     */
    @Export(name="feedId", refs={String.class}, tree="[0]")
    private Output<String> feedId;

    /**
     * @return This is the client-assigned asset feed identifier and it needs to be unique under a specific parent.
     * 
     */
    public Output<String> feedId() {
        return this.feedId;
    }
    /**
     * Output configuration for asset feed destination.
     * Structure is documented below.
     * 
     */
    @Export(name="feedOutputConfig", refs={FolderFeedFeedOutputConfig.class}, tree="[0]")
    private Output<FolderFeedFeedOutputConfig> feedOutputConfig;

    /**
     * @return Output configuration for asset feed destination.
     * Structure is documented below.
     * 
     */
    public Output<FolderFeedFeedOutputConfig> feedOutputConfig() {
        return this.feedOutputConfig;
    }
    /**
     * The folder this feed should be created in.
     * 
     */
    @Export(name="folder", refs={String.class}, tree="[0]")
    private Output<String> folder;

    /**
     * @return The folder this feed should be created in.
     * 
     */
    public Output<String> folder() {
        return this.folder;
    }
    /**
     * The ID of the folder where this feed has been created. Both [FOLDER_NUMBER]
     * and folders/[FOLDER_NUMBER] are accepted.
     * 
     */
    @Export(name="folderId", refs={String.class}, tree="[0]")
    private Output<String> folderId;

    /**
     * @return The ID of the folder where this feed has been created. Both [FOLDER_NUMBER]
     * and folders/[FOLDER_NUMBER] are accepted.
     * 
     */
    public Output<String> folderId() {
        return this.folderId;
    }
    /**
     * The format will be folders/{folder_number}/feeds/{client-assigned_feed_identifier}.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The format will be folders/{folder_number}/feeds/{client-assigned_feed_identifier}.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FolderFeed(java.lang.String name) {
        this(name, FolderFeedArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FolderFeed(java.lang.String name, FolderFeedArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FolderFeed(java.lang.String name, FolderFeedArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudasset/folderFeed:FolderFeed", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FolderFeed(java.lang.String name, Output<java.lang.String> id, @Nullable FolderFeedState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudasset/folderFeed:FolderFeed", name, state, makeResourceOptions(options, id), false);
    }

    private static FolderFeedArgs makeArgs(FolderFeedArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FolderFeedArgs.Empty : args;
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
    public static FolderFeed get(java.lang.String name, Output<java.lang.String> id, @Nullable FolderFeedState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FolderFeed(name, id, state, options);
    }
}
