// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pubsub

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for pubsub subscription. Each of these resources serves a different use case:
//
// * `pubsub.SubscriptionIAMPolicy`: Authoritative. Sets the IAM policy for the subscription and replaces any existing policy already attached.
// * `pubsub.SubscriptionIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the subscription are preserved.
// * `pubsub.SubscriptionIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the subscription are preserved.
//
// > **Note:** `pubsub.SubscriptionIAMPolicy` **cannot** be used in conjunction with `pubsub.SubscriptionIAMBinding` and `pubsub.SubscriptionIAMMember` or they will fight over what your policy should be.
//
// > **Note:** `pubsub.SubscriptionIAMBinding` resources **can be** used in conjunction with `pubsub.SubscriptionIAMMember` resources **only if** they do not grant privilege to the same role.
//
// ## pubsub.SubscriptionIAMPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/pubsub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			admin, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
//				Bindings: []organizations.GetIAMPolicyBinding{
//					{
//						Role: "roles/editor",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pubsub.NewSubscriptionIAMPolicy(ctx, "editor", &pubsub.SubscriptionIAMPolicyArgs{
//				Subscription: pulumi.String("your-subscription-name"),
//				PolicyData:   pulumi.String(admin.PolicyData),
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
// ## pubsub.SubscriptionIAMBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/pubsub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := pubsub.NewSubscriptionIAMBinding(ctx, "editor", &pubsub.SubscriptionIAMBindingArgs{
//				Subscription: pulumi.String("your-subscription-name"),
//				Role:         pulumi.String("roles/editor"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
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
// ## pubsub.SubscriptionIAMMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/pubsub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := pubsub.NewSubscriptionIAMMember(ctx, "editor", &pubsub.SubscriptionIAMMemberArgs{
//				Subscription: pulumi.String("your-subscription-name"),
//				Role:         pulumi.String("roles/editor"),
//				Member:       pulumi.String("user:jane@example.com"),
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
// ## pubsub.SubscriptionIAMBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/pubsub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := pubsub.NewSubscriptionIAMBinding(ctx, "editor", &pubsub.SubscriptionIAMBindingArgs{
//				Subscription: pulumi.String("your-subscription-name"),
//				Role:         pulumi.String("roles/editor"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
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
// ## pubsub.SubscriptionIAMMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/pubsub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := pubsub.NewSubscriptionIAMMember(ctx, "editor", &pubsub.SubscriptionIAMMemberArgs{
//				Subscription: pulumi.String("your-subscription-name"),
//				Role:         pulumi.String("roles/editor"),
//				Member:       pulumi.String("user:jane@example.com"),
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
// ### Importing IAM policies
//
// IAM policy imports use the identifier of the Pubsub Subscription resource. For example:
//
// * `"projects/{{project_id}}/subscriptions/{{subscription}}"`
//
// An `import` block (Terraform v1.5.0 and later) can be used to import IAM policies:
//
// tf
//
// import {
//
//	id = "projects/{{project_id}}/subscriptions/{{subscription}}"
//
//	to = google_pubsub_subscription_iam_policy.default
//
// }
//
// The `pulumi import` command can also be used:
//
// ```sh
// $ pulumi import gcp:pubsub/subscriptionIAMBinding:SubscriptionIAMBinding default projects/{{project_id}}/subscriptions/{{subscription}}
// ```
type SubscriptionIAMBinding struct {
	pulumi.CustomResourceState

	Condition SubscriptionIAMBindingConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the subscription's IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	Members pulumi.StringArrayOutput `pulumi:"members"`
	// The project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `pubsub.SubscriptionIAMBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
	// The subscription name or id to bind to attach IAM policy to.
	Subscription pulumi.StringOutput `pulumi:"subscription"`
}

// NewSubscriptionIAMBinding registers a new resource with the given unique name, arguments, and options.
func NewSubscriptionIAMBinding(ctx *pulumi.Context,
	name string, args *SubscriptionIAMBindingArgs, opts ...pulumi.ResourceOption) (*SubscriptionIAMBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.Subscription == nil {
		return nil, errors.New("invalid value for required argument 'Subscription'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SubscriptionIAMBinding
	err := ctx.RegisterResource("gcp:pubsub/subscriptionIAMBinding:SubscriptionIAMBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSubscriptionIAMBinding gets an existing SubscriptionIAMBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSubscriptionIAMBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SubscriptionIAMBindingState, opts ...pulumi.ResourceOption) (*SubscriptionIAMBinding, error) {
	var resource SubscriptionIAMBinding
	err := ctx.ReadResource("gcp:pubsub/subscriptionIAMBinding:SubscriptionIAMBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SubscriptionIAMBinding resources.
type subscriptionIAMBindingState struct {
	Condition *SubscriptionIAMBindingCondition `pulumi:"condition"`
	// (Computed) The etag of the subscription's IAM policy.
	Etag *string `pulumi:"etag"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	Members []string `pulumi:"members"`
	// The project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `pubsub.SubscriptionIAMBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
	// The subscription name or id to bind to attach IAM policy to.
	Subscription *string `pulumi:"subscription"`
}

type SubscriptionIAMBindingState struct {
	Condition SubscriptionIAMBindingConditionPtrInput
	// (Computed) The etag of the subscription's IAM policy.
	Etag pulumi.StringPtrInput
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	Members pulumi.StringArrayInput
	// The project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `pubsub.SubscriptionIAMBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
	// The subscription name or id to bind to attach IAM policy to.
	Subscription pulumi.StringPtrInput
}

func (SubscriptionIAMBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*subscriptionIAMBindingState)(nil)).Elem()
}

type subscriptionIAMBindingArgs struct {
	Condition *SubscriptionIAMBindingCondition `pulumi:"condition"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	Members []string `pulumi:"members"`
	// The project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `pubsub.SubscriptionIAMBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
	// The subscription name or id to bind to attach IAM policy to.
	Subscription string `pulumi:"subscription"`
}

// The set of arguments for constructing a SubscriptionIAMBinding resource.
type SubscriptionIAMBindingArgs struct {
	Condition SubscriptionIAMBindingConditionPtrInput
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	Members pulumi.StringArrayInput
	// The project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `pubsub.SubscriptionIAMBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
	// The subscription name or id to bind to attach IAM policy to.
	Subscription pulumi.StringInput
}

func (SubscriptionIAMBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*subscriptionIAMBindingArgs)(nil)).Elem()
}

type SubscriptionIAMBindingInput interface {
	pulumi.Input

	ToSubscriptionIAMBindingOutput() SubscriptionIAMBindingOutput
	ToSubscriptionIAMBindingOutputWithContext(ctx context.Context) SubscriptionIAMBindingOutput
}

func (*SubscriptionIAMBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**SubscriptionIAMBinding)(nil)).Elem()
}

func (i *SubscriptionIAMBinding) ToSubscriptionIAMBindingOutput() SubscriptionIAMBindingOutput {
	return i.ToSubscriptionIAMBindingOutputWithContext(context.Background())
}

func (i *SubscriptionIAMBinding) ToSubscriptionIAMBindingOutputWithContext(ctx context.Context) SubscriptionIAMBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionIAMBindingOutput)
}

// SubscriptionIAMBindingArrayInput is an input type that accepts SubscriptionIAMBindingArray and SubscriptionIAMBindingArrayOutput values.
// You can construct a concrete instance of `SubscriptionIAMBindingArrayInput` via:
//
//	SubscriptionIAMBindingArray{ SubscriptionIAMBindingArgs{...} }
type SubscriptionIAMBindingArrayInput interface {
	pulumi.Input

	ToSubscriptionIAMBindingArrayOutput() SubscriptionIAMBindingArrayOutput
	ToSubscriptionIAMBindingArrayOutputWithContext(context.Context) SubscriptionIAMBindingArrayOutput
}

type SubscriptionIAMBindingArray []SubscriptionIAMBindingInput

func (SubscriptionIAMBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SubscriptionIAMBinding)(nil)).Elem()
}

func (i SubscriptionIAMBindingArray) ToSubscriptionIAMBindingArrayOutput() SubscriptionIAMBindingArrayOutput {
	return i.ToSubscriptionIAMBindingArrayOutputWithContext(context.Background())
}

func (i SubscriptionIAMBindingArray) ToSubscriptionIAMBindingArrayOutputWithContext(ctx context.Context) SubscriptionIAMBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionIAMBindingArrayOutput)
}

// SubscriptionIAMBindingMapInput is an input type that accepts SubscriptionIAMBindingMap and SubscriptionIAMBindingMapOutput values.
// You can construct a concrete instance of `SubscriptionIAMBindingMapInput` via:
//
//	SubscriptionIAMBindingMap{ "key": SubscriptionIAMBindingArgs{...} }
type SubscriptionIAMBindingMapInput interface {
	pulumi.Input

	ToSubscriptionIAMBindingMapOutput() SubscriptionIAMBindingMapOutput
	ToSubscriptionIAMBindingMapOutputWithContext(context.Context) SubscriptionIAMBindingMapOutput
}

type SubscriptionIAMBindingMap map[string]SubscriptionIAMBindingInput

func (SubscriptionIAMBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SubscriptionIAMBinding)(nil)).Elem()
}

func (i SubscriptionIAMBindingMap) ToSubscriptionIAMBindingMapOutput() SubscriptionIAMBindingMapOutput {
	return i.ToSubscriptionIAMBindingMapOutputWithContext(context.Background())
}

func (i SubscriptionIAMBindingMap) ToSubscriptionIAMBindingMapOutputWithContext(ctx context.Context) SubscriptionIAMBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionIAMBindingMapOutput)
}

type SubscriptionIAMBindingOutput struct{ *pulumi.OutputState }

func (SubscriptionIAMBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SubscriptionIAMBinding)(nil)).Elem()
}

func (o SubscriptionIAMBindingOutput) ToSubscriptionIAMBindingOutput() SubscriptionIAMBindingOutput {
	return o
}

func (o SubscriptionIAMBindingOutput) ToSubscriptionIAMBindingOutputWithContext(ctx context.Context) SubscriptionIAMBindingOutput {
	return o
}

func (o SubscriptionIAMBindingOutput) Condition() SubscriptionIAMBindingConditionPtrOutput {
	return o.ApplyT(func(v *SubscriptionIAMBinding) SubscriptionIAMBindingConditionPtrOutput { return v.Condition }).(SubscriptionIAMBindingConditionPtrOutput)
}

// (Computed) The etag of the subscription's IAM policy.
func (o SubscriptionIAMBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *SubscriptionIAMBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// Identities that will be granted the privilege in `role`.
// Each entry can have one of the following values:
// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
func (o SubscriptionIAMBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SubscriptionIAMBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// The project in which the resource belongs. If it
// is not provided, the provider project is used.
func (o SubscriptionIAMBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *SubscriptionIAMBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `pubsub.SubscriptionIAMBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o SubscriptionIAMBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *SubscriptionIAMBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// The subscription name or id to bind to attach IAM policy to.
func (o SubscriptionIAMBindingOutput) Subscription() pulumi.StringOutput {
	return o.ApplyT(func(v *SubscriptionIAMBinding) pulumi.StringOutput { return v.Subscription }).(pulumi.StringOutput)
}

type SubscriptionIAMBindingArrayOutput struct{ *pulumi.OutputState }

func (SubscriptionIAMBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SubscriptionIAMBinding)(nil)).Elem()
}

func (o SubscriptionIAMBindingArrayOutput) ToSubscriptionIAMBindingArrayOutput() SubscriptionIAMBindingArrayOutput {
	return o
}

func (o SubscriptionIAMBindingArrayOutput) ToSubscriptionIAMBindingArrayOutputWithContext(ctx context.Context) SubscriptionIAMBindingArrayOutput {
	return o
}

func (o SubscriptionIAMBindingArrayOutput) Index(i pulumi.IntInput) SubscriptionIAMBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SubscriptionIAMBinding {
		return vs[0].([]*SubscriptionIAMBinding)[vs[1].(int)]
	}).(SubscriptionIAMBindingOutput)
}

type SubscriptionIAMBindingMapOutput struct{ *pulumi.OutputState }

func (SubscriptionIAMBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SubscriptionIAMBinding)(nil)).Elem()
}

func (o SubscriptionIAMBindingMapOutput) ToSubscriptionIAMBindingMapOutput() SubscriptionIAMBindingMapOutput {
	return o
}

func (o SubscriptionIAMBindingMapOutput) ToSubscriptionIAMBindingMapOutputWithContext(ctx context.Context) SubscriptionIAMBindingMapOutput {
	return o
}

func (o SubscriptionIAMBindingMapOutput) MapIndex(k pulumi.StringInput) SubscriptionIAMBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SubscriptionIAMBinding {
		return vs[0].(map[string]*SubscriptionIAMBinding)[vs[1].(string)]
	}).(SubscriptionIAMBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionIAMBindingInput)(nil)).Elem(), &SubscriptionIAMBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionIAMBindingArrayInput)(nil)).Elem(), SubscriptionIAMBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionIAMBindingMapInput)(nil)).Elem(), SubscriptionIAMBindingMap{})
	pulumi.RegisterOutputType(SubscriptionIAMBindingOutput{})
	pulumi.RegisterOutputType(SubscriptionIAMBindingArrayOutput{})
	pulumi.RegisterOutputType(SubscriptionIAMBindingMapOutput{})
}
