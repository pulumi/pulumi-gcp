// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iap

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Identity-Aware Proxy WebRegionBackendService. Each of these resources serves a different use case:
//
// * `iap.WebRegionBackendServiceIamPolicy`: Authoritative. Sets the IAM policy for the webregionbackendservice and replaces any existing policy already attached.
// * `iap.WebRegionBackendServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the webregionbackendservice are preserved.
// * `iap.WebRegionBackendServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the webregionbackendservice are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `iap.WebRegionBackendServiceIamPolicy`: Retrieves the IAM policy for the webregionbackendservice
//
// > **Note:** `iap.WebRegionBackendServiceIamPolicy` **cannot** be used in conjunction with `iap.WebRegionBackendServiceIamBinding` and `iap.WebRegionBackendServiceIamMember` or they will fight over what your policy should be.
//
// > **Note:** `iap.WebRegionBackendServiceIamBinding` resources **can be** used in conjunction with `iap.WebRegionBackendServiceIamMember` resources **only if** they do not grant privilege to the same role.
//
// > **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
//
// ## google\_iap\_web\_region\_backend\_service\_iam\_policy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/iap"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			admin, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
//				Bindings: []organizations.GetIAMPolicyBinding{
//					{
//						Role: "roles/iap.httpsResourceAccessor",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = iap.NewWebRegionBackendServiceIamPolicy(ctx, "policy", &iap.WebRegionBackendServiceIamPolicyArgs{
//				Project:                 pulumi.Any(google_compute_region_backend_service.Default.Project),
//				Region:                  pulumi.Any(google_compute_region_backend_service.Default.Region),
//				WebRegionBackendService: pulumi.Any(google_compute_region_backend_service.Default.Name),
//				PolicyData:              *pulumi.String(admin.PolicyData),
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
// With IAM Conditions:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/iap"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			admin, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
//				Bindings: []organizations.GetIAMPolicyBinding{
//					{
//						Role: "roles/iap.httpsResourceAccessor",
//						Members: []string{
//							"user:jane@example.com",
//						},
//						Condition: {
//							Title:       "expires_after_2019_12_31",
//							Description: pulumi.StringRef("Expiring at midnight of 2019-12-31"),
//							Expression:  "request.time < timestamp(\"2020-01-01T00:00:00Z\")",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = iap.NewWebRegionBackendServiceIamPolicy(ctx, "policy", &iap.WebRegionBackendServiceIamPolicyArgs{
//				Project:                 pulumi.Any(google_compute_region_backend_service.Default.Project),
//				Region:                  pulumi.Any(google_compute_region_backend_service.Default.Region),
//				WebRegionBackendService: pulumi.Any(google_compute_region_backend_service.Default.Name),
//				PolicyData:              *pulumi.String(admin.PolicyData),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## google\_iap\_web\_region\_backend\_service\_iam\_binding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/iap"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iap.NewWebRegionBackendServiceIamBinding(ctx, "binding", &iap.WebRegionBackendServiceIamBindingArgs{
//				Project:                 pulumi.Any(google_compute_region_backend_service.Default.Project),
//				Region:                  pulumi.Any(google_compute_region_backend_service.Default.Region),
//				WebRegionBackendService: pulumi.Any(google_compute_region_backend_service.Default.Name),
//				Role:                    pulumi.String("roles/iap.httpsResourceAccessor"),
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
// With IAM Conditions:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/iap"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iap.NewWebRegionBackendServiceIamBinding(ctx, "binding", &iap.WebRegionBackendServiceIamBindingArgs{
//				Project:                 pulumi.Any(google_compute_region_backend_service.Default.Project),
//				Region:                  pulumi.Any(google_compute_region_backend_service.Default.Region),
//				WebRegionBackendService: pulumi.Any(google_compute_region_backend_service.Default.Name),
//				Role:                    pulumi.String("roles/iap.httpsResourceAccessor"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
//				Condition: &iap.WebRegionBackendServiceIamBindingConditionArgs{
//					Title:       pulumi.String("expires_after_2019_12_31"),
//					Description: pulumi.String("Expiring at midnight of 2019-12-31"),
//					Expression:  pulumi.String("request.time < timestamp(\"2020-01-01T00:00:00Z\")"),
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
// ## google\_iap\_web\_region\_backend\_service\_iam\_member
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/iap"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iap.NewWebRegionBackendServiceIamMember(ctx, "member", &iap.WebRegionBackendServiceIamMemberArgs{
//				Project:                 pulumi.Any(google_compute_region_backend_service.Default.Project),
//				Region:                  pulumi.Any(google_compute_region_backend_service.Default.Region),
//				WebRegionBackendService: pulumi.Any(google_compute_region_backend_service.Default.Name),
//				Role:                    pulumi.String("roles/iap.httpsResourceAccessor"),
//				Member:                  pulumi.String("user:jane@example.com"),
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
// With IAM Conditions:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/iap"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iap.NewWebRegionBackendServiceIamMember(ctx, "member", &iap.WebRegionBackendServiceIamMemberArgs{
//				Project:                 pulumi.Any(google_compute_region_backend_service.Default.Project),
//				Region:                  pulumi.Any(google_compute_region_backend_service.Default.Region),
//				WebRegionBackendService: pulumi.Any(google_compute_region_backend_service.Default.Name),
//				Role:                    pulumi.String("roles/iap.httpsResourceAccessor"),
//				Member:                  pulumi.String("user:jane@example.com"),
//				Condition: &iap.WebRegionBackendServiceIamMemberConditionArgs{
//					Title:       pulumi.String("expires_after_2019_12_31"),
//					Description: pulumi.String("Expiring at midnight of 2019-12-31"),
//					Expression:  pulumi.String("request.time < timestamp(\"2020-01-01T00:00:00Z\")"),
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
// ## Import
//
// For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/iap_web/compute-{{region}}/services/{{name}} * {{project}}/{{region}}/{{name}} * {{region}}/{{name}} * {{name}} Any variables not passed in the import command will be taken from the provider configuration. Identity-Aware Proxy webregionbackendservice IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
//
// ```sh
//
//	$ pulumi import gcp:iap/webRegionBackendServiceIamMember:WebRegionBackendServiceIamMember editor "projects/{{project}}/iap_web/compute-{{region}}/services/{{web_region_backend_service}} roles/iap.httpsResourceAccessor user:jane@example.com"
//
// ```
//
//	IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
//
// ```sh
//
//	$ pulumi import gcp:iap/webRegionBackendServiceIamMember:WebRegionBackendServiceIamMember editor "projects/{{project}}/iap_web/compute-{{region}}/services/{{web_region_backend_service}} roles/iap.httpsResourceAccessor"
//
// ```
//
//	IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
//
//	$ pulumi import gcp:iap/webRegionBackendServiceIamMember:WebRegionBackendServiceIamMember editor projects/{{project}}/iap_web/compute-{{region}}/services/{{web_region_backend_service}}
//
// ```
//
//	-> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
//
// full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type WebRegionBackendServiceIamMember struct {
	pulumi.CustomResourceState

	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition WebRegionBackendServiceIamMemberConditionPtrOutput `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag   pulumi.StringOutput `pulumi:"etag"`
	Member pulumi.StringOutput `pulumi:"member"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	//
	// * `member/members` - (Required) Identities that will be granted the privilege in `role`.
	//   Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Project pulumi.StringOutput `pulumi:"project"`
	Region  pulumi.StringOutput `pulumi:"region"`
	// The role that should be applied. Only one
	// `iap.WebRegionBackendServiceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	WebRegionBackendService pulumi.StringOutput `pulumi:"webRegionBackendService"`
}

// NewWebRegionBackendServiceIamMember registers a new resource with the given unique name, arguments, and options.
func NewWebRegionBackendServiceIamMember(ctx *pulumi.Context,
	name string, args *WebRegionBackendServiceIamMemberArgs, opts ...pulumi.ResourceOption) (*WebRegionBackendServiceIamMember, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Member == nil {
		return nil, errors.New("invalid value for required argument 'Member'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.WebRegionBackendService == nil {
		return nil, errors.New("invalid value for required argument 'WebRegionBackendService'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WebRegionBackendServiceIamMember
	err := ctx.RegisterResource("gcp:iap/webRegionBackendServiceIamMember:WebRegionBackendServiceIamMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWebRegionBackendServiceIamMember gets an existing WebRegionBackendServiceIamMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWebRegionBackendServiceIamMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WebRegionBackendServiceIamMemberState, opts ...pulumi.ResourceOption) (*WebRegionBackendServiceIamMember, error) {
	var resource WebRegionBackendServiceIamMember
	err := ctx.ReadResource("gcp:iap/webRegionBackendServiceIamMember:WebRegionBackendServiceIamMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WebRegionBackendServiceIamMember resources.
type webRegionBackendServiceIamMemberState struct {
	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition *WebRegionBackendServiceIamMemberCondition `pulumi:"condition"`
	// (Computed) The etag of the IAM policy.
	Etag   *string `pulumi:"etag"`
	Member *string `pulumi:"member"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	//
	// * `member/members` - (Required) Identities that will be granted the privilege in `role`.
	//   Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Project *string `pulumi:"project"`
	Region  *string `pulumi:"region"`
	// The role that should be applied. Only one
	// `iap.WebRegionBackendServiceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	WebRegionBackendService *string `pulumi:"webRegionBackendService"`
}

type WebRegionBackendServiceIamMemberState struct {
	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition WebRegionBackendServiceIamMemberConditionPtrInput
	// (Computed) The etag of the IAM policy.
	Etag   pulumi.StringPtrInput
	Member pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	//
	// * `member/members` - (Required) Identities that will be granted the privilege in `role`.
	//   Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Project pulumi.StringPtrInput
	Region  pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `iap.WebRegionBackendServiceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	WebRegionBackendService pulumi.StringPtrInput
}

func (WebRegionBackendServiceIamMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*webRegionBackendServiceIamMemberState)(nil)).Elem()
}

type webRegionBackendServiceIamMemberArgs struct {
	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition *WebRegionBackendServiceIamMemberCondition `pulumi:"condition"`
	Member    string                                     `pulumi:"member"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	//
	// * `member/members` - (Required) Identities that will be granted the privilege in `role`.
	//   Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Project *string `pulumi:"project"`
	Region  *string `pulumi:"region"`
	// The role that should be applied. Only one
	// `iap.WebRegionBackendServiceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
	// Used to find the parent resource to bind the IAM policy to
	WebRegionBackendService string `pulumi:"webRegionBackendService"`
}

// The set of arguments for constructing a WebRegionBackendServiceIamMember resource.
type WebRegionBackendServiceIamMemberArgs struct {
	// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
	// Structure is documented below.
	Condition WebRegionBackendServiceIamMemberConditionPtrInput
	Member    pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	//
	// * `member/members` - (Required) Identities that will be granted the privilege in `role`.
	//   Each entry can have one of the following values:
	// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
	// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
	// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
	// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
	// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
	// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
	// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
	// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
	// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
	Project pulumi.StringPtrInput
	Region  pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `iap.WebRegionBackendServiceIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
	// Used to find the parent resource to bind the IAM policy to
	WebRegionBackendService pulumi.StringInput
}

func (WebRegionBackendServiceIamMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*webRegionBackendServiceIamMemberArgs)(nil)).Elem()
}

type WebRegionBackendServiceIamMemberInput interface {
	pulumi.Input

	ToWebRegionBackendServiceIamMemberOutput() WebRegionBackendServiceIamMemberOutput
	ToWebRegionBackendServiceIamMemberOutputWithContext(ctx context.Context) WebRegionBackendServiceIamMemberOutput
}

func (*WebRegionBackendServiceIamMember) ElementType() reflect.Type {
	return reflect.TypeOf((**WebRegionBackendServiceIamMember)(nil)).Elem()
}

func (i *WebRegionBackendServiceIamMember) ToWebRegionBackendServiceIamMemberOutput() WebRegionBackendServiceIamMemberOutput {
	return i.ToWebRegionBackendServiceIamMemberOutputWithContext(context.Background())
}

func (i *WebRegionBackendServiceIamMember) ToWebRegionBackendServiceIamMemberOutputWithContext(ctx context.Context) WebRegionBackendServiceIamMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebRegionBackendServiceIamMemberOutput)
}

// WebRegionBackendServiceIamMemberArrayInput is an input type that accepts WebRegionBackendServiceIamMemberArray and WebRegionBackendServiceIamMemberArrayOutput values.
// You can construct a concrete instance of `WebRegionBackendServiceIamMemberArrayInput` via:
//
//	WebRegionBackendServiceIamMemberArray{ WebRegionBackendServiceIamMemberArgs{...} }
type WebRegionBackendServiceIamMemberArrayInput interface {
	pulumi.Input

	ToWebRegionBackendServiceIamMemberArrayOutput() WebRegionBackendServiceIamMemberArrayOutput
	ToWebRegionBackendServiceIamMemberArrayOutputWithContext(context.Context) WebRegionBackendServiceIamMemberArrayOutput
}

type WebRegionBackendServiceIamMemberArray []WebRegionBackendServiceIamMemberInput

func (WebRegionBackendServiceIamMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WebRegionBackendServiceIamMember)(nil)).Elem()
}

func (i WebRegionBackendServiceIamMemberArray) ToWebRegionBackendServiceIamMemberArrayOutput() WebRegionBackendServiceIamMemberArrayOutput {
	return i.ToWebRegionBackendServiceIamMemberArrayOutputWithContext(context.Background())
}

func (i WebRegionBackendServiceIamMemberArray) ToWebRegionBackendServiceIamMemberArrayOutputWithContext(ctx context.Context) WebRegionBackendServiceIamMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebRegionBackendServiceIamMemberArrayOutput)
}

// WebRegionBackendServiceIamMemberMapInput is an input type that accepts WebRegionBackendServiceIamMemberMap and WebRegionBackendServiceIamMemberMapOutput values.
// You can construct a concrete instance of `WebRegionBackendServiceIamMemberMapInput` via:
//
//	WebRegionBackendServiceIamMemberMap{ "key": WebRegionBackendServiceIamMemberArgs{...} }
type WebRegionBackendServiceIamMemberMapInput interface {
	pulumi.Input

	ToWebRegionBackendServiceIamMemberMapOutput() WebRegionBackendServiceIamMemberMapOutput
	ToWebRegionBackendServiceIamMemberMapOutputWithContext(context.Context) WebRegionBackendServiceIamMemberMapOutput
}

type WebRegionBackendServiceIamMemberMap map[string]WebRegionBackendServiceIamMemberInput

func (WebRegionBackendServiceIamMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WebRegionBackendServiceIamMember)(nil)).Elem()
}

func (i WebRegionBackendServiceIamMemberMap) ToWebRegionBackendServiceIamMemberMapOutput() WebRegionBackendServiceIamMemberMapOutput {
	return i.ToWebRegionBackendServiceIamMemberMapOutputWithContext(context.Background())
}

func (i WebRegionBackendServiceIamMemberMap) ToWebRegionBackendServiceIamMemberMapOutputWithContext(ctx context.Context) WebRegionBackendServiceIamMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebRegionBackendServiceIamMemberMapOutput)
}

type WebRegionBackendServiceIamMemberOutput struct{ *pulumi.OutputState }

func (WebRegionBackendServiceIamMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WebRegionBackendServiceIamMember)(nil)).Elem()
}

func (o WebRegionBackendServiceIamMemberOutput) ToWebRegionBackendServiceIamMemberOutput() WebRegionBackendServiceIamMemberOutput {
	return o
}

func (o WebRegionBackendServiceIamMemberOutput) ToWebRegionBackendServiceIamMemberOutputWithContext(ctx context.Context) WebRegionBackendServiceIamMemberOutput {
	return o
}

// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
// Structure is documented below.
func (o WebRegionBackendServiceIamMemberOutput) Condition() WebRegionBackendServiceIamMemberConditionPtrOutput {
	return o.ApplyT(func(v *WebRegionBackendServiceIamMember) WebRegionBackendServiceIamMemberConditionPtrOutput {
		return v.Condition
	}).(WebRegionBackendServiceIamMemberConditionPtrOutput)
}

// (Computed) The etag of the IAM policy.
func (o WebRegionBackendServiceIamMemberOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *WebRegionBackendServiceIamMember) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

func (o WebRegionBackendServiceIamMemberOutput) Member() pulumi.StringOutput {
	return o.ApplyT(func(v *WebRegionBackendServiceIamMember) pulumi.StringOutput { return v.Member }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
//
//   - `member/members` - (Required) Identities that will be granted the privilege in `role`.
//     Each entry can have one of the following values:
//   - **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
//   - **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
//   - **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
//   - **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
//   - **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
//   - **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
//   - **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
//   - **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
//   - **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
func (o WebRegionBackendServiceIamMemberOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *WebRegionBackendServiceIamMember) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

func (o WebRegionBackendServiceIamMemberOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *WebRegionBackendServiceIamMember) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `iap.WebRegionBackendServiceIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o WebRegionBackendServiceIamMemberOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *WebRegionBackendServiceIamMember) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o WebRegionBackendServiceIamMemberOutput) WebRegionBackendService() pulumi.StringOutput {
	return o.ApplyT(func(v *WebRegionBackendServiceIamMember) pulumi.StringOutput { return v.WebRegionBackendService }).(pulumi.StringOutput)
}

type WebRegionBackendServiceIamMemberArrayOutput struct{ *pulumi.OutputState }

func (WebRegionBackendServiceIamMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WebRegionBackendServiceIamMember)(nil)).Elem()
}

func (o WebRegionBackendServiceIamMemberArrayOutput) ToWebRegionBackendServiceIamMemberArrayOutput() WebRegionBackendServiceIamMemberArrayOutput {
	return o
}

func (o WebRegionBackendServiceIamMemberArrayOutput) ToWebRegionBackendServiceIamMemberArrayOutputWithContext(ctx context.Context) WebRegionBackendServiceIamMemberArrayOutput {
	return o
}

func (o WebRegionBackendServiceIamMemberArrayOutput) Index(i pulumi.IntInput) WebRegionBackendServiceIamMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WebRegionBackendServiceIamMember {
		return vs[0].([]*WebRegionBackendServiceIamMember)[vs[1].(int)]
	}).(WebRegionBackendServiceIamMemberOutput)
}

type WebRegionBackendServiceIamMemberMapOutput struct{ *pulumi.OutputState }

func (WebRegionBackendServiceIamMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WebRegionBackendServiceIamMember)(nil)).Elem()
}

func (o WebRegionBackendServiceIamMemberMapOutput) ToWebRegionBackendServiceIamMemberMapOutput() WebRegionBackendServiceIamMemberMapOutput {
	return o
}

func (o WebRegionBackendServiceIamMemberMapOutput) ToWebRegionBackendServiceIamMemberMapOutputWithContext(ctx context.Context) WebRegionBackendServiceIamMemberMapOutput {
	return o
}

func (o WebRegionBackendServiceIamMemberMapOutput) MapIndex(k pulumi.StringInput) WebRegionBackendServiceIamMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WebRegionBackendServiceIamMember {
		return vs[0].(map[string]*WebRegionBackendServiceIamMember)[vs[1].(string)]
	}).(WebRegionBackendServiceIamMemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WebRegionBackendServiceIamMemberInput)(nil)).Elem(), &WebRegionBackendServiceIamMember{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebRegionBackendServiceIamMemberArrayInput)(nil)).Elem(), WebRegionBackendServiceIamMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebRegionBackendServiceIamMemberMapInput)(nil)).Elem(), WebRegionBackendServiceIamMemberMap{})
	pulumi.RegisterOutputType(WebRegionBackendServiceIamMemberOutput{})
	pulumi.RegisterOutputType(WebRegionBackendServiceIamMemberArrayOutput{})
	pulumi.RegisterOutputType(WebRegionBackendServiceIamMemberMapOutput{})
}