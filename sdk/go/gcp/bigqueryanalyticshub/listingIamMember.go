// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bigqueryanalyticshub

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for BigQuery Analytics Hub Listing. Each of these resources serves a different use case:
//
// * `bigqueryanalyticshub.ListingIamPolicy`: Authoritative. Sets the IAM policy for the listing and replaces any existing policy already attached.
// * `bigqueryanalyticshub.ListingIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the listing are preserved.
// * `bigqueryanalyticshub.ListingIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the listing are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `bigqueryanalyticshub.ListingIamPolicy`: Retrieves the IAM policy for the listing
//
// > **Note:** `bigqueryanalyticshub.ListingIamPolicy` **cannot** be used in conjunction with `bigqueryanalyticshub.ListingIamBinding` and `bigqueryanalyticshub.ListingIamMember` or they will fight over what your policy should be.
//
// > **Note:** `bigqueryanalyticshub.ListingIamBinding` resources **can be** used in conjunction with `bigqueryanalyticshub.ListingIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## bigqueryanalyticshub.ListingIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigqueryanalyticshub"
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
//			_, err = bigqueryanalyticshub.NewListingIamPolicy(ctx, "policy", &bigqueryanalyticshub.ListingIamPolicyArgs{
//				Project:        pulumi.Any(listing.Project),
//				Location:       pulumi.Any(listing.Location),
//				DataExchangeId: pulumi.Any(listing.DataExchangeId),
//				ListingId:      pulumi.Any(listing.ListingId),
//				PolicyData:     pulumi.String(admin.PolicyData),
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
// ## bigqueryanalyticshub.ListingIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigqueryanalyticshub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigqueryanalyticshub.NewListingIamBinding(ctx, "binding", &bigqueryanalyticshub.ListingIamBindingArgs{
//				Project:        pulumi.Any(listing.Project),
//				Location:       pulumi.Any(listing.Location),
//				DataExchangeId: pulumi.Any(listing.DataExchangeId),
//				ListingId:      pulumi.Any(listing.ListingId),
//				Role:           pulumi.String("roles/viewer"),
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
// ## bigqueryanalyticshub.ListingIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigqueryanalyticshub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigqueryanalyticshub.NewListingIamMember(ctx, "member", &bigqueryanalyticshub.ListingIamMemberArgs{
//				Project:        pulumi.Any(listing.Project),
//				Location:       pulumi.Any(listing.Location),
//				DataExchangeId: pulumi.Any(listing.DataExchangeId),
//				ListingId:      pulumi.Any(listing.ListingId),
//				Role:           pulumi.String("roles/viewer"),
//				Member:         pulumi.String("user:jane@example.com"),
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
// # IAM policy for BigQuery Analytics Hub Listing
// Three different resources help you manage your IAM policy for BigQuery Analytics Hub Listing. Each of these resources serves a different use case:
//
// * `bigqueryanalyticshub.ListingIamPolicy`: Authoritative. Sets the IAM policy for the listing and replaces any existing policy already attached.
// * `bigqueryanalyticshub.ListingIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the listing are preserved.
// * `bigqueryanalyticshub.ListingIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the listing are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `bigqueryanalyticshub.ListingIamPolicy`: Retrieves the IAM policy for the listing
//
// > **Note:** `bigqueryanalyticshub.ListingIamPolicy` **cannot** be used in conjunction with `bigqueryanalyticshub.ListingIamBinding` and `bigqueryanalyticshub.ListingIamMember` or they will fight over what your policy should be.
//
// > **Note:** `bigqueryanalyticshub.ListingIamBinding` resources **can be** used in conjunction with `bigqueryanalyticshub.ListingIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## bigqueryanalyticshub.ListingIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigqueryanalyticshub"
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
//			_, err = bigqueryanalyticshub.NewListingIamPolicy(ctx, "policy", &bigqueryanalyticshub.ListingIamPolicyArgs{
//				Project:        pulumi.Any(listing.Project),
//				Location:       pulumi.Any(listing.Location),
//				DataExchangeId: pulumi.Any(listing.DataExchangeId),
//				ListingId:      pulumi.Any(listing.ListingId),
//				PolicyData:     pulumi.String(admin.PolicyData),
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
// ## bigqueryanalyticshub.ListingIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigqueryanalyticshub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigqueryanalyticshub.NewListingIamBinding(ctx, "binding", &bigqueryanalyticshub.ListingIamBindingArgs{
//				Project:        pulumi.Any(listing.Project),
//				Location:       pulumi.Any(listing.Location),
//				DataExchangeId: pulumi.Any(listing.DataExchangeId),
//				ListingId:      pulumi.Any(listing.ListingId),
//				Role:           pulumi.String("roles/viewer"),
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
// ## bigqueryanalyticshub.ListingIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/bigqueryanalyticshub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := bigqueryanalyticshub.NewListingIamMember(ctx, "member", &bigqueryanalyticshub.ListingIamMemberArgs{
//				Project:        pulumi.Any(listing.Project),
//				Location:       pulumi.Any(listing.Location),
//				DataExchangeId: pulumi.Any(listing.DataExchangeId),
//				ListingId:      pulumi.Any(listing.ListingId),
//				Role:           pulumi.String("roles/viewer"),
//				Member:         pulumi.String("user:jane@example.com"),
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
// * projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}}
//
// * {{project}}/{{location}}/{{data_exchange_id}}/{{listing_id}}
//
// * {{location}}/{{data_exchange_id}}/{{listing_id}}
//
// * {{listing_id}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// BigQuery Analytics Hub listing IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:bigqueryanalyticshub/listingIamMember:ListingIamMember editor "projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}} roles/viewer user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:bigqueryanalyticshub/listingIamMember:ListingIamMember editor "projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}} roles/viewer"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:bigqueryanalyticshub/listingIamMember:ListingIamMember editor projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type ListingIamMember struct {
	pulumi.CustomResourceState

	Condition ListingIamMemberConditionPtrOutput `pulumi:"condition"`
	// The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Used to find the parent resource to bind the IAM policy to
	DataExchangeId pulumi.StringOutput `pulumi:"dataExchangeId"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// Used to find the parent resource to bind the IAM policy to
	ListingId pulumi.StringOutput `pulumi:"listingId"`
	// The name of the location this data exchange listing.
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
	Member pulumi.StringOutput `pulumi:"member"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `bigqueryanalyticshub.ListingIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewListingIamMember registers a new resource with the given unique name, arguments, and options.
func NewListingIamMember(ctx *pulumi.Context,
	name string, args *ListingIamMemberArgs, opts ...pulumi.ResourceOption) (*ListingIamMember, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataExchangeId == nil {
		return nil, errors.New("invalid value for required argument 'DataExchangeId'")
	}
	if args.ListingId == nil {
		return nil, errors.New("invalid value for required argument 'ListingId'")
	}
	if args.Member == nil {
		return nil, errors.New("invalid value for required argument 'Member'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ListingIamMember
	err := ctx.RegisterResource("gcp:bigqueryanalyticshub/listingIamMember:ListingIamMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetListingIamMember gets an existing ListingIamMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetListingIamMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ListingIamMemberState, opts ...pulumi.ResourceOption) (*ListingIamMember, error) {
	var resource ListingIamMember
	err := ctx.ReadResource("gcp:bigqueryanalyticshub/listingIamMember:ListingIamMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ListingIamMember resources.
type listingIamMemberState struct {
	Condition *ListingIamMemberCondition `pulumi:"condition"`
	// The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Used to find the parent resource to bind the IAM policy to
	DataExchangeId *string `pulumi:"dataExchangeId"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// Used to find the parent resource to bind the IAM policy to
	ListingId *string `pulumi:"listingId"`
	// The name of the location this data exchange listing.
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
	Member *string `pulumi:"member"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `bigqueryanalyticshub.ListingIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type ListingIamMemberState struct {
	Condition ListingIamMemberConditionPtrInput
	// The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Used to find the parent resource to bind the IAM policy to
	DataExchangeId pulumi.StringPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	ListingId pulumi.StringPtrInput
	// The name of the location this data exchange listing.
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
	Member pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `bigqueryanalyticshub.ListingIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (ListingIamMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*listingIamMemberState)(nil)).Elem()
}

type listingIamMemberArgs struct {
	Condition *ListingIamMemberCondition `pulumi:"condition"`
	// The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Used to find the parent resource to bind the IAM policy to
	DataExchangeId string `pulumi:"dataExchangeId"`
	// Used to find the parent resource to bind the IAM policy to
	ListingId string `pulumi:"listingId"`
	// The name of the location this data exchange listing.
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
	Member string `pulumi:"member"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `bigqueryanalyticshub.ListingIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a ListingIamMember resource.
type ListingIamMemberArgs struct {
	Condition ListingIamMemberConditionPtrInput
	// The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Used to find the parent resource to bind the IAM policy to
	DataExchangeId pulumi.StringInput
	// Used to find the parent resource to bind the IAM policy to
	ListingId pulumi.StringInput
	// The name of the location this data exchange listing.
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
	Member pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `bigqueryanalyticshub.ListingIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (ListingIamMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*listingIamMemberArgs)(nil)).Elem()
}

type ListingIamMemberInput interface {
	pulumi.Input

	ToListingIamMemberOutput() ListingIamMemberOutput
	ToListingIamMemberOutputWithContext(ctx context.Context) ListingIamMemberOutput
}

func (*ListingIamMember) ElementType() reflect.Type {
	return reflect.TypeOf((**ListingIamMember)(nil)).Elem()
}

func (i *ListingIamMember) ToListingIamMemberOutput() ListingIamMemberOutput {
	return i.ToListingIamMemberOutputWithContext(context.Background())
}

func (i *ListingIamMember) ToListingIamMemberOutputWithContext(ctx context.Context) ListingIamMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListingIamMemberOutput)
}

// ListingIamMemberArrayInput is an input type that accepts ListingIamMemberArray and ListingIamMemberArrayOutput values.
// You can construct a concrete instance of `ListingIamMemberArrayInput` via:
//
//	ListingIamMemberArray{ ListingIamMemberArgs{...} }
type ListingIamMemberArrayInput interface {
	pulumi.Input

	ToListingIamMemberArrayOutput() ListingIamMemberArrayOutput
	ToListingIamMemberArrayOutputWithContext(context.Context) ListingIamMemberArrayOutput
}

type ListingIamMemberArray []ListingIamMemberInput

func (ListingIamMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ListingIamMember)(nil)).Elem()
}

func (i ListingIamMemberArray) ToListingIamMemberArrayOutput() ListingIamMemberArrayOutput {
	return i.ToListingIamMemberArrayOutputWithContext(context.Background())
}

func (i ListingIamMemberArray) ToListingIamMemberArrayOutputWithContext(ctx context.Context) ListingIamMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListingIamMemberArrayOutput)
}

// ListingIamMemberMapInput is an input type that accepts ListingIamMemberMap and ListingIamMemberMapOutput values.
// You can construct a concrete instance of `ListingIamMemberMapInput` via:
//
//	ListingIamMemberMap{ "key": ListingIamMemberArgs{...} }
type ListingIamMemberMapInput interface {
	pulumi.Input

	ToListingIamMemberMapOutput() ListingIamMemberMapOutput
	ToListingIamMemberMapOutputWithContext(context.Context) ListingIamMemberMapOutput
}

type ListingIamMemberMap map[string]ListingIamMemberInput

func (ListingIamMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ListingIamMember)(nil)).Elem()
}

func (i ListingIamMemberMap) ToListingIamMemberMapOutput() ListingIamMemberMapOutput {
	return i.ToListingIamMemberMapOutputWithContext(context.Background())
}

func (i ListingIamMemberMap) ToListingIamMemberMapOutputWithContext(ctx context.Context) ListingIamMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListingIamMemberMapOutput)
}

type ListingIamMemberOutput struct{ *pulumi.OutputState }

func (ListingIamMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ListingIamMember)(nil)).Elem()
}

func (o ListingIamMemberOutput) ToListingIamMemberOutput() ListingIamMemberOutput {
	return o
}

func (o ListingIamMemberOutput) ToListingIamMemberOutputWithContext(ctx context.Context) ListingIamMemberOutput {
	return o
}

func (o ListingIamMemberOutput) Condition() ListingIamMemberConditionPtrOutput {
	return o.ApplyT(func(v *ListingIamMember) ListingIamMemberConditionPtrOutput { return v.Condition }).(ListingIamMemberConditionPtrOutput)
}

// The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Used to find the parent resource to bind the IAM policy to
func (o ListingIamMemberOutput) DataExchangeId() pulumi.StringOutput {
	return o.ApplyT(func(v *ListingIamMember) pulumi.StringOutput { return v.DataExchangeId }).(pulumi.StringOutput)
}

// (Computed) The etag of the IAM policy.
func (o ListingIamMemberOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *ListingIamMember) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o ListingIamMemberOutput) ListingId() pulumi.StringOutput {
	return o.ApplyT(func(v *ListingIamMember) pulumi.StringOutput { return v.ListingId }).(pulumi.StringOutput)
}

// The name of the location this data exchange listing.
// Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
// location is specified, it is taken from the provider configuration.
func (o ListingIamMemberOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ListingIamMember) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
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
func (o ListingIamMemberOutput) Member() pulumi.StringOutput {
	return o.ApplyT(func(v *ListingIamMember) pulumi.StringOutput { return v.Member }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o ListingIamMemberOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *ListingIamMember) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `bigqueryanalyticshub.ListingIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o ListingIamMemberOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *ListingIamMember) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type ListingIamMemberArrayOutput struct{ *pulumi.OutputState }

func (ListingIamMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ListingIamMember)(nil)).Elem()
}

func (o ListingIamMemberArrayOutput) ToListingIamMemberArrayOutput() ListingIamMemberArrayOutput {
	return o
}

func (o ListingIamMemberArrayOutput) ToListingIamMemberArrayOutputWithContext(ctx context.Context) ListingIamMemberArrayOutput {
	return o
}

func (o ListingIamMemberArrayOutput) Index(i pulumi.IntInput) ListingIamMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ListingIamMember {
		return vs[0].([]*ListingIamMember)[vs[1].(int)]
	}).(ListingIamMemberOutput)
}

type ListingIamMemberMapOutput struct{ *pulumi.OutputState }

func (ListingIamMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ListingIamMember)(nil)).Elem()
}

func (o ListingIamMemberMapOutput) ToListingIamMemberMapOutput() ListingIamMemberMapOutput {
	return o
}

func (o ListingIamMemberMapOutput) ToListingIamMemberMapOutputWithContext(ctx context.Context) ListingIamMemberMapOutput {
	return o
}

func (o ListingIamMemberMapOutput) MapIndex(k pulumi.StringInput) ListingIamMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ListingIamMember {
		return vs[0].(map[string]*ListingIamMember)[vs[1].(string)]
	}).(ListingIamMemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ListingIamMemberInput)(nil)).Elem(), &ListingIamMember{})
	pulumi.RegisterInputType(reflect.TypeOf((*ListingIamMemberArrayInput)(nil)).Elem(), ListingIamMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ListingIamMemberMapInput)(nil)).Elem(), ListingIamMemberMap{})
	pulumi.RegisterOutputType(ListingIamMemberOutput{})
	pulumi.RegisterOutputType(ListingIamMemberArrayOutput{})
	pulumi.RegisterOutputType(ListingIamMemberMapOutput{})
}
