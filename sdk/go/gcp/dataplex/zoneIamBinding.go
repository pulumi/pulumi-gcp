// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dataplex

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Dataplex Zone. Each of these resources serves a different use case:
//
// * `dataplex.ZoneIamPolicy`: Authoritative. Sets the IAM policy for the zone and replaces any existing policy already attached.
// * `dataplex.ZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the zone are preserved.
// * `dataplex.ZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the zone are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `dataplex.ZoneIamPolicy`: Retrieves the IAM policy for the zone
//
// > **Note:** `dataplex.ZoneIamPolicy` **cannot** be used in conjunction with `dataplex.ZoneIamBinding` and `dataplex.ZoneIamMember` or they will fight over what your policy should be.
//
// > **Note:** `dataplex.ZoneIamBinding` resources **can be** used in conjunction with `dataplex.ZoneIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## dataplex.ZoneIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dataplex"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			admin, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
//				Bindings: []organizations.GetIAMPolicyBinding{
//					{
//						Role: "roles/viewer",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = dataplex.NewZoneIamPolicy(ctx, "policy", &dataplex.ZoneIamPolicyArgs{
//				Project:      pulumi.Any(example.Project),
//				Location:     pulumi.Any(example.Location),
//				Lake:         pulumi.Any(example.Lake),
//				DataplexZone: pulumi.Any(example.Name),
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
// ## dataplex.ZoneIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dataplex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataplex.NewZoneIamBinding(ctx, "binding", &dataplex.ZoneIamBindingArgs{
//				Project:      pulumi.Any(example.Project),
//				Location:     pulumi.Any(example.Location),
//				Lake:         pulumi.Any(example.Lake),
//				DataplexZone: pulumi.Any(example.Name),
//				Role:         pulumi.String("roles/viewer"),
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
// ## dataplex.ZoneIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dataplex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataplex.NewZoneIamMember(ctx, "member", &dataplex.ZoneIamMemberArgs{
//				Project:      pulumi.Any(example.Project),
//				Location:     pulumi.Any(example.Location),
//				Lake:         pulumi.Any(example.Lake),
//				DataplexZone: pulumi.Any(example.Name),
//				Role:         pulumi.String("roles/viewer"),
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
// ## This resource supports User Project Overrides.
//
// -
//
// # IAM policy for Dataplex Zone
// Three different resources help you manage your IAM policy for Dataplex Zone. Each of these resources serves a different use case:
//
// * `dataplex.ZoneIamPolicy`: Authoritative. Sets the IAM policy for the zone and replaces any existing policy already attached.
// * `dataplex.ZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the zone are preserved.
// * `dataplex.ZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the zone are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `dataplex.ZoneIamPolicy`: Retrieves the IAM policy for the zone
//
// > **Note:** `dataplex.ZoneIamPolicy` **cannot** be used in conjunction with `dataplex.ZoneIamBinding` and `dataplex.ZoneIamMember` or they will fight over what your policy should be.
//
// > **Note:** `dataplex.ZoneIamBinding` resources **can be** used in conjunction with `dataplex.ZoneIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## dataplex.ZoneIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dataplex"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			admin, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
//				Bindings: []organizations.GetIAMPolicyBinding{
//					{
//						Role: "roles/viewer",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = dataplex.NewZoneIamPolicy(ctx, "policy", &dataplex.ZoneIamPolicyArgs{
//				Project:      pulumi.Any(example.Project),
//				Location:     pulumi.Any(example.Location),
//				Lake:         pulumi.Any(example.Lake),
//				DataplexZone: pulumi.Any(example.Name),
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
// ## dataplex.ZoneIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dataplex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataplex.NewZoneIamBinding(ctx, "binding", &dataplex.ZoneIamBindingArgs{
//				Project:      pulumi.Any(example.Project),
//				Location:     pulumi.Any(example.Location),
//				Lake:         pulumi.Any(example.Lake),
//				DataplexZone: pulumi.Any(example.Name),
//				Role:         pulumi.String("roles/viewer"),
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
// ## dataplex.ZoneIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/dataplex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dataplex.NewZoneIamMember(ctx, "member", &dataplex.ZoneIamMemberArgs{
//				Project:      pulumi.Any(example.Project),
//				Location:     pulumi.Any(example.Location),
//				Lake:         pulumi.Any(example.Lake),
//				DataplexZone: pulumi.Any(example.Name),
//				Role:         pulumi.String("roles/viewer"),
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
// For all import syntaxes, the "resource in question" can take any of the following forms:
//
// * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{name}}
//
// * {{project}}/{{location}}/{{lake}}/{{name}}
//
// * {{location}}/{{lake}}/{{name}}
//
// * {{name}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Dataplex zone IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:dataplex/zoneIamBinding:ZoneIamBinding editor "projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:dataplex/zoneIamBinding:ZoneIamBinding editor "projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:dataplex/zoneIamBinding:ZoneIamBinding editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type ZoneIamBinding struct {
	pulumi.CustomResourceState

	Condition ZoneIamBindingConditionPtrOutput `pulumi:"condition"`
	// Used to find the parent resource to bind the IAM policy to
	DataplexZone pulumi.StringOutput `pulumi:"dataplexZone"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// Used to find the parent resource to bind the IAM policy to
	Lake pulumi.StringOutput `pulumi:"lake"`
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringOutput `pulumi:"location"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Members pulumi.StringArrayOutput `pulumi:"members"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `dataplex.ZoneIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewZoneIamBinding registers a new resource with the given unique name, arguments, and options.
func NewZoneIamBinding(ctx *pulumi.Context,
	name string, args *ZoneIamBindingArgs, opts ...pulumi.ResourceOption) (*ZoneIamBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataplexZone == nil {
		return nil, errors.New("invalid value for required argument 'DataplexZone'")
	}
	if args.Lake == nil {
		return nil, errors.New("invalid value for required argument 'Lake'")
	}
	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ZoneIamBinding
	err := ctx.RegisterResource("gcp:dataplex/zoneIamBinding:ZoneIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZoneIamBinding gets an existing ZoneIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZoneIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZoneIamBindingState, opts ...pulumi.ResourceOption) (*ZoneIamBinding, error) {
	var resource ZoneIamBinding
	err := ctx.ReadResource("gcp:dataplex/zoneIamBinding:ZoneIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ZoneIamBinding resources.
type zoneIamBindingState struct {
	Condition *ZoneIamBindingCondition `pulumi:"condition"`
	// Used to find the parent resource to bind the IAM policy to
	DataplexZone *string `pulumi:"dataplexZone"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// Used to find the parent resource to bind the IAM policy to
	Lake *string `pulumi:"lake"`
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Members []string `pulumi:"members"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `dataplex.ZoneIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type ZoneIamBindingState struct {
	Condition ZoneIamBindingConditionPtrInput
	// Used to find the parent resource to bind the IAM policy to
	DataplexZone pulumi.StringPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	Lake pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Members pulumi.StringArrayInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `dataplex.ZoneIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (ZoneIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneIamBindingState)(nil)).Elem()
}

type zoneIamBindingArgs struct {
	Condition *ZoneIamBindingCondition `pulumi:"condition"`
	// Used to find the parent resource to bind the IAM policy to
	DataplexZone string `pulumi:"dataplexZone"`
	// Used to find the parent resource to bind the IAM policy to
	Lake string `pulumi:"lake"`
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Members []string `pulumi:"members"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `dataplex.ZoneIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a ZoneIamBinding resource.
type ZoneIamBindingArgs struct {
	Condition ZoneIamBindingConditionPtrInput
	// Used to find the parent resource to bind the IAM policy to
	DataplexZone pulumi.StringInput
	// Used to find the parent resource to bind the IAM policy to
	Lake pulumi.StringInput
	// Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput
	// Identities that will be granted the privilege in `role`.
	// Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Members pulumi.StringArrayInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `dataplex.ZoneIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (ZoneIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneIamBindingArgs)(nil)).Elem()
}

type ZoneIamBindingInput interface {
	pulumi.Input

	ToZoneIamBindingOutput() ZoneIamBindingOutput
	ToZoneIamBindingOutputWithContext(ctx context.Context) ZoneIamBindingOutput
}

func (*ZoneIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**ZoneIamBinding)(nil)).Elem()
}

func (i *ZoneIamBinding) ToZoneIamBindingOutput() ZoneIamBindingOutput {
	return i.ToZoneIamBindingOutputWithContext(context.Background())
}

func (i *ZoneIamBinding) ToZoneIamBindingOutputWithContext(ctx context.Context) ZoneIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneIamBindingOutput)
}

// ZoneIamBindingArrayInput is an input type that accepts ZoneIamBindingArray and ZoneIamBindingArrayOutput values.
// You can construct a concrete instance of `ZoneIamBindingArrayInput` via:
//
//	ZoneIamBindingArray{ ZoneIamBindingArgs{...} }
type ZoneIamBindingArrayInput interface {
	pulumi.Input

	ToZoneIamBindingArrayOutput() ZoneIamBindingArrayOutput
	ToZoneIamBindingArrayOutputWithContext(context.Context) ZoneIamBindingArrayOutput
}

type ZoneIamBindingArray []ZoneIamBindingInput

func (ZoneIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZoneIamBinding)(nil)).Elem()
}

func (i ZoneIamBindingArray) ToZoneIamBindingArrayOutput() ZoneIamBindingArrayOutput {
	return i.ToZoneIamBindingArrayOutputWithContext(context.Background())
}

func (i ZoneIamBindingArray) ToZoneIamBindingArrayOutputWithContext(ctx context.Context) ZoneIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneIamBindingArrayOutput)
}

// ZoneIamBindingMapInput is an input type that accepts ZoneIamBindingMap and ZoneIamBindingMapOutput values.
// You can construct a concrete instance of `ZoneIamBindingMapInput` via:
//
//	ZoneIamBindingMap{ "key": ZoneIamBindingArgs{...} }
type ZoneIamBindingMapInput interface {
	pulumi.Input

	ToZoneIamBindingMapOutput() ZoneIamBindingMapOutput
	ToZoneIamBindingMapOutputWithContext(context.Context) ZoneIamBindingMapOutput
}

type ZoneIamBindingMap map[string]ZoneIamBindingInput

func (ZoneIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZoneIamBinding)(nil)).Elem()
}

func (i ZoneIamBindingMap) ToZoneIamBindingMapOutput() ZoneIamBindingMapOutput {
	return i.ToZoneIamBindingMapOutputWithContext(context.Background())
}

func (i ZoneIamBindingMap) ToZoneIamBindingMapOutputWithContext(ctx context.Context) ZoneIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneIamBindingMapOutput)
}

type ZoneIamBindingOutput struct{ *pulumi.OutputState }

func (ZoneIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ZoneIamBinding)(nil)).Elem()
}

func (o ZoneIamBindingOutput) ToZoneIamBindingOutput() ZoneIamBindingOutput {
	return o
}

func (o ZoneIamBindingOutput) ToZoneIamBindingOutputWithContext(ctx context.Context) ZoneIamBindingOutput {
	return o
}

func (o ZoneIamBindingOutput) Condition() ZoneIamBindingConditionPtrOutput {
	return o.ApplyT(func(v *ZoneIamBinding) ZoneIamBindingConditionPtrOutput { return v.Condition }).(ZoneIamBindingConditionPtrOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o ZoneIamBindingOutput) DataplexZone() pulumi.StringOutput {
	return o.ApplyT(func(v *ZoneIamBinding) pulumi.StringOutput { return v.DataplexZone }).(pulumi.StringOutput)
}

// (Computed) The etag of the IAM policy.
func (o ZoneIamBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *ZoneIamBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o ZoneIamBindingOutput) Lake() pulumi.StringOutput {
	return o.ApplyT(func(v *ZoneIamBinding) pulumi.StringOutput { return v.Lake }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
// location is specified, it is taken from the provider configuration.
func (o ZoneIamBindingOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ZoneIamBinding) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Identities that will be granted the privilege in `role`.
// Each entry can have one of the following values:
// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
func (o ZoneIamBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ZoneIamBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o ZoneIamBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *ZoneIamBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `dataplex.ZoneIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o ZoneIamBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *ZoneIamBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type ZoneIamBindingArrayOutput struct{ *pulumi.OutputState }

func (ZoneIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZoneIamBinding)(nil)).Elem()
}

func (o ZoneIamBindingArrayOutput) ToZoneIamBindingArrayOutput() ZoneIamBindingArrayOutput {
	return o
}

func (o ZoneIamBindingArrayOutput) ToZoneIamBindingArrayOutputWithContext(ctx context.Context) ZoneIamBindingArrayOutput {
	return o
}

func (o ZoneIamBindingArrayOutput) Index(i pulumi.IntInput) ZoneIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ZoneIamBinding {
		return vs[0].([]*ZoneIamBinding)[vs[1].(int)]
	}).(ZoneIamBindingOutput)
}

type ZoneIamBindingMapOutput struct{ *pulumi.OutputState }

func (ZoneIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZoneIamBinding)(nil)).Elem()
}

func (o ZoneIamBindingMapOutput) ToZoneIamBindingMapOutput() ZoneIamBindingMapOutput {
	return o
}

func (o ZoneIamBindingMapOutput) ToZoneIamBindingMapOutputWithContext(ctx context.Context) ZoneIamBindingMapOutput {
	return o
}

func (o ZoneIamBindingMapOutput) MapIndex(k pulumi.StringInput) ZoneIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ZoneIamBinding {
		return vs[0].(map[string]*ZoneIamBinding)[vs[1].(string)]
	}).(ZoneIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneIamBindingInput)(nil)).Elem(), &ZoneIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneIamBindingArrayInput)(nil)).Elem(), ZoneIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneIamBindingMapInput)(nil)).Elem(), ZoneIamBindingMap{})
	pulumi.RegisterOutputType(ZoneIamBindingOutput{})
	pulumi.RegisterOutputType(ZoneIamBindingArrayOutput{})
	pulumi.RegisterOutputType(ZoneIamBindingMapOutput{})
}
