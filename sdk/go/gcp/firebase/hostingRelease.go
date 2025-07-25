// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package firebase

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ### Firebasehosting Release In Site
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/firebase"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := firebase.NewHostingSite(ctx, "default", &firebase.HostingSiteArgs{
//				Project: pulumi.String("my-project-name"),
//				SiteId:  pulumi.String("site-id"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultHostingVersion, err := firebase.NewHostingVersion(ctx, "default", &firebase.HostingVersionArgs{
//				SiteId: _default.SiteId,
//				Config: &firebase.HostingVersionConfigArgs{
//					Redirects: firebase.HostingVersionConfigRedirectArray{
//						&firebase.HostingVersionConfigRedirectArgs{
//							Glob:       pulumi.String("/google/**"),
//							StatusCode: pulumi.Int(302),
//							Location:   pulumi.String("https://www.google.com"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = firebase.NewHostingRelease(ctx, "default", &firebase.HostingReleaseArgs{
//				SiteId:      _default.SiteId,
//				VersionName: defaultHostingVersion.Name,
//				Message:     pulumi.String("Test release"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Firebasehosting Release In Channel
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/firebase"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := firebase.NewHostingSite(ctx, "default", &firebase.HostingSiteArgs{
//				Project: pulumi.String("my-project-name"),
//				SiteId:  pulumi.String("site-with-channel"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultHostingVersion, err := firebase.NewHostingVersion(ctx, "default", &firebase.HostingVersionArgs{
//				SiteId: _default.SiteId,
//				Config: &firebase.HostingVersionConfigArgs{
//					Redirects: firebase.HostingVersionConfigRedirectArray{
//						&firebase.HostingVersionConfigRedirectArgs{
//							Glob:       pulumi.String("/google/**"),
//							StatusCode: pulumi.Int(302),
//							Location:   pulumi.String("https://www.google.com"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			defaultHostingChannel, err := firebase.NewHostingChannel(ctx, "default", &firebase.HostingChannelArgs{
//				SiteId:    _default.SiteId,
//				ChannelId: pulumi.String("channel-id"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = firebase.NewHostingRelease(ctx, "default", &firebase.HostingReleaseArgs{
//				SiteId:      _default.SiteId,
//				ChannelId:   defaultHostingChannel.ChannelId,
//				VersionName: defaultHostingVersion.Name,
//				Message:     pulumi.String("Test release in channel"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Firebasehosting Release Disable
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/firebase"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := firebase.NewHostingSite(ctx, "default", &firebase.HostingSiteArgs{
//				Project: pulumi.String("my-project-name"),
//				SiteId:  pulumi.String("site-id"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = firebase.NewHostingRelease(ctx, "default", &firebase.HostingReleaseArgs{
//				SiteId:  _default.SiteId,
//				Type:    pulumi.String("SITE_DISABLE"),
//				Message: pulumi.String("Take down site"),
//			})
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
// Release can be imported using any of these accepted formats:
//
// * `sites/{{site_id}}/channels/{{channel_id}}/releases/{{release_id}}`
//
// * `sites/{{site_id}}/releases/{{release_id}}`
//
// * `{{site_id}}/{{channel_id}}/{{release_id}}`
//
// * `{{site_id}}/{{release_id}}`
//
// When using the `pulumi import` command, Release can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:firebase/hostingRelease:HostingRelease default sites/{{site_id}}/channels/{{channel_id}}/releases/{{release_id}}
// ```
//
// ```sh
// $ pulumi import gcp:firebase/hostingRelease:HostingRelease default sites/{{site_id}}/releases/{{release_id}}
// ```
//
// ```sh
// $ pulumi import gcp:firebase/hostingRelease:HostingRelease default {{site_id}}/{{channel_id}}/{{release_id}}
// ```
//
// ```sh
// $ pulumi import gcp:firebase/hostingRelease:HostingRelease default {{site_id}}/{{release_id}}
// ```
type HostingRelease struct {
	pulumi.CustomResourceState

	// The ID of the channel to which the release belongs. If not provided, the release will
	// belong to the default "live" channel
	ChannelId pulumi.StringPtrOutput `pulumi:"channelId"`
	// The deploy description when the release was created. The value can be up to 512 characters.
	Message pulumi.StringPtrOutput `pulumi:"message"`
	// The unique identifier for the release, in either of the following formats:
	// sites/SITE_ID/releases/RELEASE_ID
	// sites/SITE_ID/channels/CHANNEL_ID/releases/RELEASE_ID
	Name pulumi.StringOutput `pulumi:"name"`
	// The unique identifier for the Release.
	ReleaseId pulumi.StringOutput `pulumi:"releaseId"`
	// Required. The ID of the site to which the release belongs.
	SiteId pulumi.StringOutput `pulumi:"siteId"`
	// The type of the release; indicates what happened to the content of the site. There is no need to specify
	// `DEPLOY` or `ROLLBACK` type if a `versionName` is provided.
	// DEPLOY: A version was uploaded to Firebase Hosting and released. Output only.
	// ROLLBACK: The release points back to a previously deployed version. Output only.
	// SITE_DISABLE: The release prevents the site from serving content. Firebase Hosting acts as if the site never existed
	// Possible values are: `DEPLOY`, `ROLLBACK`, `SITE_DISABLE`.
	Type pulumi.StringOutput `pulumi:"type"`
	// The unique identifier for a version, in the format: sites/SITE_ID/versions/VERSION_ID.
	// The content of the version specified will be actively displayed on the appropriate URL.
	// The Version must belong to the same site as in the `siteId`.
	// This parameter must be empty if the `type` of the release is `SITE_DISABLE`.
	VersionName pulumi.StringPtrOutput `pulumi:"versionName"`
}

// NewHostingRelease registers a new resource with the given unique name, arguments, and options.
func NewHostingRelease(ctx *pulumi.Context,
	name string, args *HostingReleaseArgs, opts ...pulumi.ResourceOption) (*HostingRelease, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SiteId == nil {
		return nil, errors.New("invalid value for required argument 'SiteId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HostingRelease
	err := ctx.RegisterResource("gcp:firebase/hostingRelease:HostingRelease", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHostingRelease gets an existing HostingRelease resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHostingRelease(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HostingReleaseState, opts ...pulumi.ResourceOption) (*HostingRelease, error) {
	var resource HostingRelease
	err := ctx.ReadResource("gcp:firebase/hostingRelease:HostingRelease", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HostingRelease resources.
type hostingReleaseState struct {
	// The ID of the channel to which the release belongs. If not provided, the release will
	// belong to the default "live" channel
	ChannelId *string `pulumi:"channelId"`
	// The deploy description when the release was created. The value can be up to 512 characters.
	Message *string `pulumi:"message"`
	// The unique identifier for the release, in either of the following formats:
	// sites/SITE_ID/releases/RELEASE_ID
	// sites/SITE_ID/channels/CHANNEL_ID/releases/RELEASE_ID
	Name *string `pulumi:"name"`
	// The unique identifier for the Release.
	ReleaseId *string `pulumi:"releaseId"`
	// Required. The ID of the site to which the release belongs.
	SiteId *string `pulumi:"siteId"`
	// The type of the release; indicates what happened to the content of the site. There is no need to specify
	// `DEPLOY` or `ROLLBACK` type if a `versionName` is provided.
	// DEPLOY: A version was uploaded to Firebase Hosting and released. Output only.
	// ROLLBACK: The release points back to a previously deployed version. Output only.
	// SITE_DISABLE: The release prevents the site from serving content. Firebase Hosting acts as if the site never existed
	// Possible values are: `DEPLOY`, `ROLLBACK`, `SITE_DISABLE`.
	Type *string `pulumi:"type"`
	// The unique identifier for a version, in the format: sites/SITE_ID/versions/VERSION_ID.
	// The content of the version specified will be actively displayed on the appropriate URL.
	// The Version must belong to the same site as in the `siteId`.
	// This parameter must be empty if the `type` of the release is `SITE_DISABLE`.
	VersionName *string `pulumi:"versionName"`
}

type HostingReleaseState struct {
	// The ID of the channel to which the release belongs. If not provided, the release will
	// belong to the default "live" channel
	ChannelId pulumi.StringPtrInput
	// The deploy description when the release was created. The value can be up to 512 characters.
	Message pulumi.StringPtrInput
	// The unique identifier for the release, in either of the following formats:
	// sites/SITE_ID/releases/RELEASE_ID
	// sites/SITE_ID/channels/CHANNEL_ID/releases/RELEASE_ID
	Name pulumi.StringPtrInput
	// The unique identifier for the Release.
	ReleaseId pulumi.StringPtrInput
	// Required. The ID of the site to which the release belongs.
	SiteId pulumi.StringPtrInput
	// The type of the release; indicates what happened to the content of the site. There is no need to specify
	// `DEPLOY` or `ROLLBACK` type if a `versionName` is provided.
	// DEPLOY: A version was uploaded to Firebase Hosting and released. Output only.
	// ROLLBACK: The release points back to a previously deployed version. Output only.
	// SITE_DISABLE: The release prevents the site from serving content. Firebase Hosting acts as if the site never existed
	// Possible values are: `DEPLOY`, `ROLLBACK`, `SITE_DISABLE`.
	Type pulumi.StringPtrInput
	// The unique identifier for a version, in the format: sites/SITE_ID/versions/VERSION_ID.
	// The content of the version specified will be actively displayed on the appropriate URL.
	// The Version must belong to the same site as in the `siteId`.
	// This parameter must be empty if the `type` of the release is `SITE_DISABLE`.
	VersionName pulumi.StringPtrInput
}

func (HostingReleaseState) ElementType() reflect.Type {
	return reflect.TypeOf((*hostingReleaseState)(nil)).Elem()
}

type hostingReleaseArgs struct {
	// The ID of the channel to which the release belongs. If not provided, the release will
	// belong to the default "live" channel
	ChannelId *string `pulumi:"channelId"`
	// The deploy description when the release was created. The value can be up to 512 characters.
	Message *string `pulumi:"message"`
	// Required. The ID of the site to which the release belongs.
	SiteId string `pulumi:"siteId"`
	// The type of the release; indicates what happened to the content of the site. There is no need to specify
	// `DEPLOY` or `ROLLBACK` type if a `versionName` is provided.
	// DEPLOY: A version was uploaded to Firebase Hosting and released. Output only.
	// ROLLBACK: The release points back to a previously deployed version. Output only.
	// SITE_DISABLE: The release prevents the site from serving content. Firebase Hosting acts as if the site never existed
	// Possible values are: `DEPLOY`, `ROLLBACK`, `SITE_DISABLE`.
	Type *string `pulumi:"type"`
	// The unique identifier for a version, in the format: sites/SITE_ID/versions/VERSION_ID.
	// The content of the version specified will be actively displayed on the appropriate URL.
	// The Version must belong to the same site as in the `siteId`.
	// This parameter must be empty if the `type` of the release is `SITE_DISABLE`.
	VersionName *string `pulumi:"versionName"`
}

// The set of arguments for constructing a HostingRelease resource.
type HostingReleaseArgs struct {
	// The ID of the channel to which the release belongs. If not provided, the release will
	// belong to the default "live" channel
	ChannelId pulumi.StringPtrInput
	// The deploy description when the release was created. The value can be up to 512 characters.
	Message pulumi.StringPtrInput
	// Required. The ID of the site to which the release belongs.
	SiteId pulumi.StringInput
	// The type of the release; indicates what happened to the content of the site. There is no need to specify
	// `DEPLOY` or `ROLLBACK` type if a `versionName` is provided.
	// DEPLOY: A version was uploaded to Firebase Hosting and released. Output only.
	// ROLLBACK: The release points back to a previously deployed version. Output only.
	// SITE_DISABLE: The release prevents the site from serving content. Firebase Hosting acts as if the site never existed
	// Possible values are: `DEPLOY`, `ROLLBACK`, `SITE_DISABLE`.
	Type pulumi.StringPtrInput
	// The unique identifier for a version, in the format: sites/SITE_ID/versions/VERSION_ID.
	// The content of the version specified will be actively displayed on the appropriate URL.
	// The Version must belong to the same site as in the `siteId`.
	// This parameter must be empty if the `type` of the release is `SITE_DISABLE`.
	VersionName pulumi.StringPtrInput
}

func (HostingReleaseArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hostingReleaseArgs)(nil)).Elem()
}

type HostingReleaseInput interface {
	pulumi.Input

	ToHostingReleaseOutput() HostingReleaseOutput
	ToHostingReleaseOutputWithContext(ctx context.Context) HostingReleaseOutput
}

func (*HostingRelease) ElementType() reflect.Type {
	return reflect.TypeOf((**HostingRelease)(nil)).Elem()
}

func (i *HostingRelease) ToHostingReleaseOutput() HostingReleaseOutput {
	return i.ToHostingReleaseOutputWithContext(context.Background())
}

func (i *HostingRelease) ToHostingReleaseOutputWithContext(ctx context.Context) HostingReleaseOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostingReleaseOutput)
}

// HostingReleaseArrayInput is an input type that accepts HostingReleaseArray and HostingReleaseArrayOutput values.
// You can construct a concrete instance of `HostingReleaseArrayInput` via:
//
//	HostingReleaseArray{ HostingReleaseArgs{...} }
type HostingReleaseArrayInput interface {
	pulumi.Input

	ToHostingReleaseArrayOutput() HostingReleaseArrayOutput
	ToHostingReleaseArrayOutputWithContext(context.Context) HostingReleaseArrayOutput
}

type HostingReleaseArray []HostingReleaseInput

func (HostingReleaseArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostingRelease)(nil)).Elem()
}

func (i HostingReleaseArray) ToHostingReleaseArrayOutput() HostingReleaseArrayOutput {
	return i.ToHostingReleaseArrayOutputWithContext(context.Background())
}

func (i HostingReleaseArray) ToHostingReleaseArrayOutputWithContext(ctx context.Context) HostingReleaseArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostingReleaseArrayOutput)
}

// HostingReleaseMapInput is an input type that accepts HostingReleaseMap and HostingReleaseMapOutput values.
// You can construct a concrete instance of `HostingReleaseMapInput` via:
//
//	HostingReleaseMap{ "key": HostingReleaseArgs{...} }
type HostingReleaseMapInput interface {
	pulumi.Input

	ToHostingReleaseMapOutput() HostingReleaseMapOutput
	ToHostingReleaseMapOutputWithContext(context.Context) HostingReleaseMapOutput
}

type HostingReleaseMap map[string]HostingReleaseInput

func (HostingReleaseMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostingRelease)(nil)).Elem()
}

func (i HostingReleaseMap) ToHostingReleaseMapOutput() HostingReleaseMapOutput {
	return i.ToHostingReleaseMapOutputWithContext(context.Background())
}

func (i HostingReleaseMap) ToHostingReleaseMapOutputWithContext(ctx context.Context) HostingReleaseMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostingReleaseMapOutput)
}

type HostingReleaseOutput struct{ *pulumi.OutputState }

func (HostingReleaseOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HostingRelease)(nil)).Elem()
}

func (o HostingReleaseOutput) ToHostingReleaseOutput() HostingReleaseOutput {
	return o
}

func (o HostingReleaseOutput) ToHostingReleaseOutputWithContext(ctx context.Context) HostingReleaseOutput {
	return o
}

// The ID of the channel to which the release belongs. If not provided, the release will
// belong to the default "live" channel
func (o HostingReleaseOutput) ChannelId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HostingRelease) pulumi.StringPtrOutput { return v.ChannelId }).(pulumi.StringPtrOutput)
}

// The deploy description when the release was created. The value can be up to 512 characters.
func (o HostingReleaseOutput) Message() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HostingRelease) pulumi.StringPtrOutput { return v.Message }).(pulumi.StringPtrOutput)
}

// The unique identifier for the release, in either of the following formats:
// sites/SITE_ID/releases/RELEASE_ID
// sites/SITE_ID/channels/CHANNEL_ID/releases/RELEASE_ID
func (o HostingReleaseOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *HostingRelease) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The unique identifier for the Release.
func (o HostingReleaseOutput) ReleaseId() pulumi.StringOutput {
	return o.ApplyT(func(v *HostingRelease) pulumi.StringOutput { return v.ReleaseId }).(pulumi.StringOutput)
}

// Required. The ID of the site to which the release belongs.
func (o HostingReleaseOutput) SiteId() pulumi.StringOutput {
	return o.ApplyT(func(v *HostingRelease) pulumi.StringOutput { return v.SiteId }).(pulumi.StringOutput)
}

// The type of the release; indicates what happened to the content of the site. There is no need to specify
// `DEPLOY` or `ROLLBACK` type if a `versionName` is provided.
// DEPLOY: A version was uploaded to Firebase Hosting and released. Output only.
// ROLLBACK: The release points back to a previously deployed version. Output only.
// SITE_DISABLE: The release prevents the site from serving content. Firebase Hosting acts as if the site never existed
// Possible values are: `DEPLOY`, `ROLLBACK`, `SITE_DISABLE`.
func (o HostingReleaseOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *HostingRelease) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The unique identifier for a version, in the format: sites/SITE_ID/versions/VERSION_ID.
// The content of the version specified will be actively displayed on the appropriate URL.
// The Version must belong to the same site as in the `siteId`.
// This parameter must be empty if the `type` of the release is `SITE_DISABLE`.
func (o HostingReleaseOutput) VersionName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HostingRelease) pulumi.StringPtrOutput { return v.VersionName }).(pulumi.StringPtrOutput)
}

type HostingReleaseArrayOutput struct{ *pulumi.OutputState }

func (HostingReleaseArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostingRelease)(nil)).Elem()
}

func (o HostingReleaseArrayOutput) ToHostingReleaseArrayOutput() HostingReleaseArrayOutput {
	return o
}

func (o HostingReleaseArrayOutput) ToHostingReleaseArrayOutputWithContext(ctx context.Context) HostingReleaseArrayOutput {
	return o
}

func (o HostingReleaseArrayOutput) Index(i pulumi.IntInput) HostingReleaseOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HostingRelease {
		return vs[0].([]*HostingRelease)[vs[1].(int)]
	}).(HostingReleaseOutput)
}

type HostingReleaseMapOutput struct{ *pulumi.OutputState }

func (HostingReleaseMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostingRelease)(nil)).Elem()
}

func (o HostingReleaseMapOutput) ToHostingReleaseMapOutput() HostingReleaseMapOutput {
	return o
}

func (o HostingReleaseMapOutput) ToHostingReleaseMapOutputWithContext(ctx context.Context) HostingReleaseMapOutput {
	return o
}

func (o HostingReleaseMapOutput) MapIndex(k pulumi.StringInput) HostingReleaseOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HostingRelease {
		return vs[0].(map[string]*HostingRelease)[vs[1].(string)]
	}).(HostingReleaseOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HostingReleaseInput)(nil)).Elem(), &HostingRelease{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostingReleaseArrayInput)(nil)).Elem(), HostingReleaseArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostingReleaseMapInput)(nil)).Elem(), HostingReleaseMap{})
	pulumi.RegisterOutputType(HostingReleaseOutput{})
	pulumi.RegisterOutputType(HostingReleaseArrayOutput{})
	pulumi.RegisterOutputType(HostingReleaseMapOutput{})
}
