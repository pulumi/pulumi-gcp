// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudasset

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Describes a Cloud Asset Inventory feed used to to listen to asset updates.
//
// To get more information about FolderFeed, see:
//
// * [API documentation](https://cloud.google.com/asset-inventory/docs/reference/rest/)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/asset-inventory/docs)
//
// ## Example Usage
//
// ### Cloud Asset Folder Feed
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/cloudasset"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/pubsub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// The topic where the resource change notifications will be sent.
//			feedOutput, err := pubsub.NewTopic(ctx, "feed_output", &pubsub.TopicArgs{
//				Project: pulumi.String("my-project-name"),
//				Name:    pulumi.String("network-updates"),
//			})
//			if err != nil {
//				return err
//			}
//			// The folder that will be monitored for resource updates.
//			myFolder, err := organizations.NewFolder(ctx, "my_folder", &organizations.FolderArgs{
//				DisplayName:        pulumi.String("Networking"),
//				Parent:             pulumi.String("organizations/123456789"),
//				DeletionProtection: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			// Create a feed that sends notifications about network resource updates under a
//			// particular folder.
//			_, err = cloudasset.NewFolderFeed(ctx, "folder_feed", &cloudasset.FolderFeedArgs{
//				BillingProject: pulumi.String("my-project-name"),
//				Folder:         myFolder.FolderId,
//				FeedId:         pulumi.String("network-updates"),
//				ContentType:    pulumi.String("RESOURCE"),
//				AssetTypes: pulumi.StringArray{
//					pulumi.String("compute.googleapis.com/Subnetwork"),
//					pulumi.String("compute.googleapis.com/Network"),
//				},
//				FeedOutputConfig: &cloudasset.FolderFeedFeedOutputConfigArgs{
//					PubsubDestination: &cloudasset.FolderFeedFeedOutputConfigPubsubDestinationArgs{
//						Topic: feedOutput.ID(),
//					},
//				},
//				Condition: &cloudasset.FolderFeedConditionArgs{
//					Expression:  pulumi.String("!temporal_asset.deleted &&\ntemporal_asset.prior_asset_state == google.cloud.asset.v1.TemporalAsset.PriorAssetState.DOES_NOT_EXIST\n"),
//					Title:       pulumi.String("created"),
//					Description: pulumi.String("Send notifications on creation events"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// Find the project number of the project whose identity will be used for sending
//			// the asset change notifications.
//			_, err = organizations.LookupProject(ctx, &organizations.LookupProjectArgs{
//				ProjectId: pulumi.StringRef("my-project-name"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// FolderFeed can be imported using any of these accepted formats:
//
// * `folders/{{folder_id}}/feeds/{{name}}`
//
// * `{{folder_id}}/{{name}}`
//
// When using the `pulumi import` command, FolderFeed can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:cloudasset/folderFeed:FolderFeed default folders/{{folder_id}}/feeds/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:cloudasset/folderFeed:FolderFeed default {{folder_id}}/{{name}}
// ```
type FolderFeed struct {
	pulumi.CustomResourceState

	// A list of the full names of the assets to receive updates. You must specify either or both of
	// assetNames and assetTypes. Only asset updates matching specified assetNames and assetTypes are
	// exported to the feed. For example: //compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1.
	// See https://cloud.google.com/apis/design/resourceNames#fullResourceName for more info.
	AssetNames pulumi.StringArrayOutput `pulumi:"assetNames"`
	// A list of types of the assets to receive updates. You must specify either or both of assetNames
	// and assetTypes. Only asset updates matching specified assetNames and assetTypes are exported to
	// the feed. For example: "compute.googleapis.com/Disk"
	// See https://cloud.google.com/asset-inventory/docs/supported-asset-types for a list of all
	// supported asset types.
	AssetTypes pulumi.StringArrayOutput `pulumi:"assetTypes"`
	// The project whose identity will be used when sending messages to the
	// destination pubsub topic. It also specifies the project for API
	// enablement check, quota, and billing.
	BillingProject pulumi.StringOutput `pulumi:"billingProject"`
	// A condition which determines whether an asset update should be published. If specified, an asset
	// will be returned only when the expression evaluates to true. When set, expression field
	// must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
	// expression "temporal_asset.deleted == true" will only publish Asset deletions. Other fields of
	// condition are optional.
	// Structure is documented below.
	Condition FolderFeedConditionPtrOutput `pulumi:"condition"`
	// Asset content type. If not specified, no content but the asset name and type will be returned.
	// Possible values are: `CONTENT_TYPE_UNSPECIFIED`, `RESOURCE`, `IAM_POLICY`, `ORG_POLICY`, `OS_INVENTORY`, `ACCESS_POLICY`.
	ContentType pulumi.StringPtrOutput `pulumi:"contentType"`
	// This is the client-assigned asset feed identifier and it needs to be unique under a specific parent.
	FeedId pulumi.StringOutput `pulumi:"feedId"`
	// Output configuration for asset feed destination.
	// Structure is documented below.
	FeedOutputConfig FolderFeedFeedOutputConfigOutput `pulumi:"feedOutputConfig"`
	// The folder this feed should be created in.
	Folder pulumi.StringOutput `pulumi:"folder"`
	// The ID of the folder where this feed has been created. Both [FOLDER_NUMBER]
	// and folders/[FOLDER_NUMBER] are accepted.
	FolderId pulumi.StringOutput `pulumi:"folderId"`
	// The format will be folders/{folder_number}/feeds/{client-assigned_feed_identifier}.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewFolderFeed registers a new resource with the given unique name, arguments, and options.
func NewFolderFeed(ctx *pulumi.Context,
	name string, args *FolderFeedArgs, opts ...pulumi.ResourceOption) (*FolderFeed, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BillingProject == nil {
		return nil, errors.New("invalid value for required argument 'BillingProject'")
	}
	if args.FeedId == nil {
		return nil, errors.New("invalid value for required argument 'FeedId'")
	}
	if args.FeedOutputConfig == nil {
		return nil, errors.New("invalid value for required argument 'FeedOutputConfig'")
	}
	if args.Folder == nil {
		return nil, errors.New("invalid value for required argument 'Folder'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FolderFeed
	err := ctx.RegisterResource("gcp:cloudasset/folderFeed:FolderFeed", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFolderFeed gets an existing FolderFeed resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFolderFeed(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FolderFeedState, opts ...pulumi.ResourceOption) (*FolderFeed, error) {
	var resource FolderFeed
	err := ctx.ReadResource("gcp:cloudasset/folderFeed:FolderFeed", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FolderFeed resources.
type folderFeedState struct {
	// A list of the full names of the assets to receive updates. You must specify either or both of
	// assetNames and assetTypes. Only asset updates matching specified assetNames and assetTypes are
	// exported to the feed. For example: //compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1.
	// See https://cloud.google.com/apis/design/resourceNames#fullResourceName for more info.
	AssetNames []string `pulumi:"assetNames"`
	// A list of types of the assets to receive updates. You must specify either or both of assetNames
	// and assetTypes. Only asset updates matching specified assetNames and assetTypes are exported to
	// the feed. For example: "compute.googleapis.com/Disk"
	// See https://cloud.google.com/asset-inventory/docs/supported-asset-types for a list of all
	// supported asset types.
	AssetTypes []string `pulumi:"assetTypes"`
	// The project whose identity will be used when sending messages to the
	// destination pubsub topic. It also specifies the project for API
	// enablement check, quota, and billing.
	BillingProject *string `pulumi:"billingProject"`
	// A condition which determines whether an asset update should be published. If specified, an asset
	// will be returned only when the expression evaluates to true. When set, expression field
	// must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
	// expression "temporal_asset.deleted == true" will only publish Asset deletions. Other fields of
	// condition are optional.
	// Structure is documented below.
	Condition *FolderFeedCondition `pulumi:"condition"`
	// Asset content type. If not specified, no content but the asset name and type will be returned.
	// Possible values are: `CONTENT_TYPE_UNSPECIFIED`, `RESOURCE`, `IAM_POLICY`, `ORG_POLICY`, `OS_INVENTORY`, `ACCESS_POLICY`.
	ContentType *string `pulumi:"contentType"`
	// This is the client-assigned asset feed identifier and it needs to be unique under a specific parent.
	FeedId *string `pulumi:"feedId"`
	// Output configuration for asset feed destination.
	// Structure is documented below.
	FeedOutputConfig *FolderFeedFeedOutputConfig `pulumi:"feedOutputConfig"`
	// The folder this feed should be created in.
	Folder *string `pulumi:"folder"`
	// The ID of the folder where this feed has been created. Both [FOLDER_NUMBER]
	// and folders/[FOLDER_NUMBER] are accepted.
	FolderId *string `pulumi:"folderId"`
	// The format will be folders/{folder_number}/feeds/{client-assigned_feed_identifier}.
	Name *string `pulumi:"name"`
}

type FolderFeedState struct {
	// A list of the full names of the assets to receive updates. You must specify either or both of
	// assetNames and assetTypes. Only asset updates matching specified assetNames and assetTypes are
	// exported to the feed. For example: //compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1.
	// See https://cloud.google.com/apis/design/resourceNames#fullResourceName for more info.
	AssetNames pulumi.StringArrayInput
	// A list of types of the assets to receive updates. You must specify either or both of assetNames
	// and assetTypes. Only asset updates matching specified assetNames and assetTypes are exported to
	// the feed. For example: "compute.googleapis.com/Disk"
	// See https://cloud.google.com/asset-inventory/docs/supported-asset-types for a list of all
	// supported asset types.
	AssetTypes pulumi.StringArrayInput
	// The project whose identity will be used when sending messages to the
	// destination pubsub topic. It also specifies the project for API
	// enablement check, quota, and billing.
	BillingProject pulumi.StringPtrInput
	// A condition which determines whether an asset update should be published. If specified, an asset
	// will be returned only when the expression evaluates to true. When set, expression field
	// must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
	// expression "temporal_asset.deleted == true" will only publish Asset deletions. Other fields of
	// condition are optional.
	// Structure is documented below.
	Condition FolderFeedConditionPtrInput
	// Asset content type. If not specified, no content but the asset name and type will be returned.
	// Possible values are: `CONTENT_TYPE_UNSPECIFIED`, `RESOURCE`, `IAM_POLICY`, `ORG_POLICY`, `OS_INVENTORY`, `ACCESS_POLICY`.
	ContentType pulumi.StringPtrInput
	// This is the client-assigned asset feed identifier and it needs to be unique under a specific parent.
	FeedId pulumi.StringPtrInput
	// Output configuration for asset feed destination.
	// Structure is documented below.
	FeedOutputConfig FolderFeedFeedOutputConfigPtrInput
	// The folder this feed should be created in.
	Folder pulumi.StringPtrInput
	// The ID of the folder where this feed has been created. Both [FOLDER_NUMBER]
	// and folders/[FOLDER_NUMBER] are accepted.
	FolderId pulumi.StringPtrInput
	// The format will be folders/{folder_number}/feeds/{client-assigned_feed_identifier}.
	Name pulumi.StringPtrInput
}

func (FolderFeedState) ElementType() reflect.Type {
	return reflect.TypeOf((*folderFeedState)(nil)).Elem()
}

type folderFeedArgs struct {
	// A list of the full names of the assets to receive updates. You must specify either or both of
	// assetNames and assetTypes. Only asset updates matching specified assetNames and assetTypes are
	// exported to the feed. For example: //compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1.
	// See https://cloud.google.com/apis/design/resourceNames#fullResourceName for more info.
	AssetNames []string `pulumi:"assetNames"`
	// A list of types of the assets to receive updates. You must specify either or both of assetNames
	// and assetTypes. Only asset updates matching specified assetNames and assetTypes are exported to
	// the feed. For example: "compute.googleapis.com/Disk"
	// See https://cloud.google.com/asset-inventory/docs/supported-asset-types for a list of all
	// supported asset types.
	AssetTypes []string `pulumi:"assetTypes"`
	// The project whose identity will be used when sending messages to the
	// destination pubsub topic. It also specifies the project for API
	// enablement check, quota, and billing.
	BillingProject string `pulumi:"billingProject"`
	// A condition which determines whether an asset update should be published. If specified, an asset
	// will be returned only when the expression evaluates to true. When set, expression field
	// must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
	// expression "temporal_asset.deleted == true" will only publish Asset deletions. Other fields of
	// condition are optional.
	// Structure is documented below.
	Condition *FolderFeedCondition `pulumi:"condition"`
	// Asset content type. If not specified, no content but the asset name and type will be returned.
	// Possible values are: `CONTENT_TYPE_UNSPECIFIED`, `RESOURCE`, `IAM_POLICY`, `ORG_POLICY`, `OS_INVENTORY`, `ACCESS_POLICY`.
	ContentType *string `pulumi:"contentType"`
	// This is the client-assigned asset feed identifier and it needs to be unique under a specific parent.
	FeedId string `pulumi:"feedId"`
	// Output configuration for asset feed destination.
	// Structure is documented below.
	FeedOutputConfig FolderFeedFeedOutputConfig `pulumi:"feedOutputConfig"`
	// The folder this feed should be created in.
	Folder string `pulumi:"folder"`
}

// The set of arguments for constructing a FolderFeed resource.
type FolderFeedArgs struct {
	// A list of the full names of the assets to receive updates. You must specify either or both of
	// assetNames and assetTypes. Only asset updates matching specified assetNames and assetTypes are
	// exported to the feed. For example: //compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1.
	// See https://cloud.google.com/apis/design/resourceNames#fullResourceName for more info.
	AssetNames pulumi.StringArrayInput
	// A list of types of the assets to receive updates. You must specify either or both of assetNames
	// and assetTypes. Only asset updates matching specified assetNames and assetTypes are exported to
	// the feed. For example: "compute.googleapis.com/Disk"
	// See https://cloud.google.com/asset-inventory/docs/supported-asset-types for a list of all
	// supported asset types.
	AssetTypes pulumi.StringArrayInput
	// The project whose identity will be used when sending messages to the
	// destination pubsub topic. It also specifies the project for API
	// enablement check, quota, and billing.
	BillingProject pulumi.StringInput
	// A condition which determines whether an asset update should be published. If specified, an asset
	// will be returned only when the expression evaluates to true. When set, expression field
	// must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
	// expression "temporal_asset.deleted == true" will only publish Asset deletions. Other fields of
	// condition are optional.
	// Structure is documented below.
	Condition FolderFeedConditionPtrInput
	// Asset content type. If not specified, no content but the asset name and type will be returned.
	// Possible values are: `CONTENT_TYPE_UNSPECIFIED`, `RESOURCE`, `IAM_POLICY`, `ORG_POLICY`, `OS_INVENTORY`, `ACCESS_POLICY`.
	ContentType pulumi.StringPtrInput
	// This is the client-assigned asset feed identifier and it needs to be unique under a specific parent.
	FeedId pulumi.StringInput
	// Output configuration for asset feed destination.
	// Structure is documented below.
	FeedOutputConfig FolderFeedFeedOutputConfigInput
	// The folder this feed should be created in.
	Folder pulumi.StringInput
}

func (FolderFeedArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*folderFeedArgs)(nil)).Elem()
}

type FolderFeedInput interface {
	pulumi.Input

	ToFolderFeedOutput() FolderFeedOutput
	ToFolderFeedOutputWithContext(ctx context.Context) FolderFeedOutput
}

func (*FolderFeed) ElementType() reflect.Type {
	return reflect.TypeOf((**FolderFeed)(nil)).Elem()
}

func (i *FolderFeed) ToFolderFeedOutput() FolderFeedOutput {
	return i.ToFolderFeedOutputWithContext(context.Background())
}

func (i *FolderFeed) ToFolderFeedOutputWithContext(ctx context.Context) FolderFeedOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FolderFeedOutput)
}

// FolderFeedArrayInput is an input type that accepts FolderFeedArray and FolderFeedArrayOutput values.
// You can construct a concrete instance of `FolderFeedArrayInput` via:
//
//	FolderFeedArray{ FolderFeedArgs{...} }
type FolderFeedArrayInput interface {
	pulumi.Input

	ToFolderFeedArrayOutput() FolderFeedArrayOutput
	ToFolderFeedArrayOutputWithContext(context.Context) FolderFeedArrayOutput
}

type FolderFeedArray []FolderFeedInput

func (FolderFeedArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FolderFeed)(nil)).Elem()
}

func (i FolderFeedArray) ToFolderFeedArrayOutput() FolderFeedArrayOutput {
	return i.ToFolderFeedArrayOutputWithContext(context.Background())
}

func (i FolderFeedArray) ToFolderFeedArrayOutputWithContext(ctx context.Context) FolderFeedArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FolderFeedArrayOutput)
}

// FolderFeedMapInput is an input type that accepts FolderFeedMap and FolderFeedMapOutput values.
// You can construct a concrete instance of `FolderFeedMapInput` via:
//
//	FolderFeedMap{ "key": FolderFeedArgs{...} }
type FolderFeedMapInput interface {
	pulumi.Input

	ToFolderFeedMapOutput() FolderFeedMapOutput
	ToFolderFeedMapOutputWithContext(context.Context) FolderFeedMapOutput
}

type FolderFeedMap map[string]FolderFeedInput

func (FolderFeedMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FolderFeed)(nil)).Elem()
}

func (i FolderFeedMap) ToFolderFeedMapOutput() FolderFeedMapOutput {
	return i.ToFolderFeedMapOutputWithContext(context.Background())
}

func (i FolderFeedMap) ToFolderFeedMapOutputWithContext(ctx context.Context) FolderFeedMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FolderFeedMapOutput)
}

type FolderFeedOutput struct{ *pulumi.OutputState }

func (FolderFeedOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FolderFeed)(nil)).Elem()
}

func (o FolderFeedOutput) ToFolderFeedOutput() FolderFeedOutput {
	return o
}

func (o FolderFeedOutput) ToFolderFeedOutputWithContext(ctx context.Context) FolderFeedOutput {
	return o
}

// A list of the full names of the assets to receive updates. You must specify either or both of
// assetNames and assetTypes. Only asset updates matching specified assetNames and assetTypes are
// exported to the feed. For example: //compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1.
// See https://cloud.google.com/apis/design/resourceNames#fullResourceName for more info.
func (o FolderFeedOutput) AssetNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FolderFeed) pulumi.StringArrayOutput { return v.AssetNames }).(pulumi.StringArrayOutput)
}

// A list of types of the assets to receive updates. You must specify either or both of assetNames
// and assetTypes. Only asset updates matching specified assetNames and assetTypes are exported to
// the feed. For example: "compute.googleapis.com/Disk"
// See https://cloud.google.com/asset-inventory/docs/supported-asset-types for a list of all
// supported asset types.
func (o FolderFeedOutput) AssetTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FolderFeed) pulumi.StringArrayOutput { return v.AssetTypes }).(pulumi.StringArrayOutput)
}

// The project whose identity will be used when sending messages to the
// destination pubsub topic. It also specifies the project for API
// enablement check, quota, and billing.
func (o FolderFeedOutput) BillingProject() pulumi.StringOutput {
	return o.ApplyT(func(v *FolderFeed) pulumi.StringOutput { return v.BillingProject }).(pulumi.StringOutput)
}

// A condition which determines whether an asset update should be published. If specified, an asset
// will be returned only when the expression evaluates to true. When set, expression field
// must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
// expression "temporal_asset.deleted == true" will only publish Asset deletions. Other fields of
// condition are optional.
// Structure is documented below.
func (o FolderFeedOutput) Condition() FolderFeedConditionPtrOutput {
	return o.ApplyT(func(v *FolderFeed) FolderFeedConditionPtrOutput { return v.Condition }).(FolderFeedConditionPtrOutput)
}

// Asset content type. If not specified, no content but the asset name and type will be returned.
// Possible values are: `CONTENT_TYPE_UNSPECIFIED`, `RESOURCE`, `IAM_POLICY`, `ORG_POLICY`, `OS_INVENTORY`, `ACCESS_POLICY`.
func (o FolderFeedOutput) ContentType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FolderFeed) pulumi.StringPtrOutput { return v.ContentType }).(pulumi.StringPtrOutput)
}

// This is the client-assigned asset feed identifier and it needs to be unique under a specific parent.
func (o FolderFeedOutput) FeedId() pulumi.StringOutput {
	return o.ApplyT(func(v *FolderFeed) pulumi.StringOutput { return v.FeedId }).(pulumi.StringOutput)
}

// Output configuration for asset feed destination.
// Structure is documented below.
func (o FolderFeedOutput) FeedOutputConfig() FolderFeedFeedOutputConfigOutput {
	return o.ApplyT(func(v *FolderFeed) FolderFeedFeedOutputConfigOutput { return v.FeedOutputConfig }).(FolderFeedFeedOutputConfigOutput)
}

// The folder this feed should be created in.
func (o FolderFeedOutput) Folder() pulumi.StringOutput {
	return o.ApplyT(func(v *FolderFeed) pulumi.StringOutput { return v.Folder }).(pulumi.StringOutput)
}

// The ID of the folder where this feed has been created. Both [FOLDER_NUMBER]
// and folders/[FOLDER_NUMBER] are accepted.
func (o FolderFeedOutput) FolderId() pulumi.StringOutput {
	return o.ApplyT(func(v *FolderFeed) pulumi.StringOutput { return v.FolderId }).(pulumi.StringOutput)
}

// The format will be folders/{folder_number}/feeds/{client-assigned_feed_identifier}.
func (o FolderFeedOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FolderFeed) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type FolderFeedArrayOutput struct{ *pulumi.OutputState }

func (FolderFeedArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FolderFeed)(nil)).Elem()
}

func (o FolderFeedArrayOutput) ToFolderFeedArrayOutput() FolderFeedArrayOutput {
	return o
}

func (o FolderFeedArrayOutput) ToFolderFeedArrayOutputWithContext(ctx context.Context) FolderFeedArrayOutput {
	return o
}

func (o FolderFeedArrayOutput) Index(i pulumi.IntInput) FolderFeedOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FolderFeed {
		return vs[0].([]*FolderFeed)[vs[1].(int)]
	}).(FolderFeedOutput)
}

type FolderFeedMapOutput struct{ *pulumi.OutputState }

func (FolderFeedMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FolderFeed)(nil)).Elem()
}

func (o FolderFeedMapOutput) ToFolderFeedMapOutput() FolderFeedMapOutput {
	return o
}

func (o FolderFeedMapOutput) ToFolderFeedMapOutputWithContext(ctx context.Context) FolderFeedMapOutput {
	return o
}

func (o FolderFeedMapOutput) MapIndex(k pulumi.StringInput) FolderFeedOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FolderFeed {
		return vs[0].(map[string]*FolderFeed)[vs[1].(string)]
	}).(FolderFeedOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FolderFeedInput)(nil)).Elem(), &FolderFeed{})
	pulumi.RegisterInputType(reflect.TypeOf((*FolderFeedArrayInput)(nil)).Elem(), FolderFeedArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FolderFeedMapInput)(nil)).Elem(), FolderFeedMap{})
	pulumi.RegisterOutputType(FolderFeedOutput{})
	pulumi.RegisterOutputType(FolderFeedArrayOutput{})
	pulumi.RegisterOutputType(FolderFeedMapOutput{})
}
