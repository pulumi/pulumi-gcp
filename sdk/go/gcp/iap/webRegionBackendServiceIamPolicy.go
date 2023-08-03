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
//	$ pulumi import gcp:iap/webRegionBackendServiceIamPolicy:WebRegionBackendServiceIamPolicy editor "projects/{{project}}/iap_web/compute-{{region}}/services/{{web_region_backend_service}} roles/iap.httpsResourceAccessor user:jane@example.com"
//
// ```
//
//	IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
//
// ```sh
//
//	$ pulumi import gcp:iap/webRegionBackendServiceIamPolicy:WebRegionBackendServiceIamPolicy editor "projects/{{project}}/iap_web/compute-{{region}}/services/{{web_region_backend_service}} roles/iap.httpsResourceAccessor"
//
// ```
//
//	IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
//
//	$ pulumi import gcp:iap/webRegionBackendServiceIamPolicy:WebRegionBackendServiceIamPolicy editor projects/{{project}}/iap_web/compute-{{region}}/services/{{web_region_backend_service}}
//
// ```
//
//	-> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
//
// full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type WebRegionBackendServiceIamPolicy struct {
	pulumi.CustomResourceState

	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringOutput `pulumi:"policyData"`
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
	// Used to find the parent resource to bind the IAM policy to
	WebRegionBackendService pulumi.StringOutput `pulumi:"webRegionBackendService"`
}

// NewWebRegionBackendServiceIamPolicy registers a new resource with the given unique name, arguments, and options.
func NewWebRegionBackendServiceIamPolicy(ctx *pulumi.Context,
	name string, args *WebRegionBackendServiceIamPolicyArgs, opts ...pulumi.ResourceOption) (*WebRegionBackendServiceIamPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	if args.WebRegionBackendService == nil {
		return nil, errors.New("invalid value for required argument 'WebRegionBackendService'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WebRegionBackendServiceIamPolicy
	err := ctx.RegisterResource("gcp:iap/webRegionBackendServiceIamPolicy:WebRegionBackendServiceIamPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWebRegionBackendServiceIamPolicy gets an existing WebRegionBackendServiceIamPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWebRegionBackendServiceIamPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WebRegionBackendServiceIamPolicyState, opts ...pulumi.ResourceOption) (*WebRegionBackendServiceIamPolicy, error) {
	var resource WebRegionBackendServiceIamPolicy
	err := ctx.ReadResource("gcp:iap/webRegionBackendServiceIamPolicy:WebRegionBackendServiceIamPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WebRegionBackendServiceIamPolicy resources.
type webRegionBackendServiceIamPolicyState struct {
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData *string `pulumi:"policyData"`
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
	// Used to find the parent resource to bind the IAM policy to
	WebRegionBackendService *string `pulumi:"webRegionBackendService"`
}

type WebRegionBackendServiceIamPolicyState struct {
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringPtrInput
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
	// Used to find the parent resource to bind the IAM policy to
	WebRegionBackendService pulumi.StringPtrInput
}

func (WebRegionBackendServiceIamPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*webRegionBackendServiceIamPolicyState)(nil)).Elem()
}

type webRegionBackendServiceIamPolicyArgs struct {
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
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
	// Used to find the parent resource to bind the IAM policy to
	WebRegionBackendService string `pulumi:"webRegionBackendService"`
}

// The set of arguments for constructing a WebRegionBackendServiceIamPolicy resource.
type WebRegionBackendServiceIamPolicyArgs struct {
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringInput
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
	// Used to find the parent resource to bind the IAM policy to
	WebRegionBackendService pulumi.StringInput
}

func (WebRegionBackendServiceIamPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*webRegionBackendServiceIamPolicyArgs)(nil)).Elem()
}

type WebRegionBackendServiceIamPolicyInput interface {
	pulumi.Input

	ToWebRegionBackendServiceIamPolicyOutput() WebRegionBackendServiceIamPolicyOutput
	ToWebRegionBackendServiceIamPolicyOutputWithContext(ctx context.Context) WebRegionBackendServiceIamPolicyOutput
}

func (*WebRegionBackendServiceIamPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**WebRegionBackendServiceIamPolicy)(nil)).Elem()
}

func (i *WebRegionBackendServiceIamPolicy) ToWebRegionBackendServiceIamPolicyOutput() WebRegionBackendServiceIamPolicyOutput {
	return i.ToWebRegionBackendServiceIamPolicyOutputWithContext(context.Background())
}

func (i *WebRegionBackendServiceIamPolicy) ToWebRegionBackendServiceIamPolicyOutputWithContext(ctx context.Context) WebRegionBackendServiceIamPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebRegionBackendServiceIamPolicyOutput)
}

// WebRegionBackendServiceIamPolicyArrayInput is an input type that accepts WebRegionBackendServiceIamPolicyArray and WebRegionBackendServiceIamPolicyArrayOutput values.
// You can construct a concrete instance of `WebRegionBackendServiceIamPolicyArrayInput` via:
//
//	WebRegionBackendServiceIamPolicyArray{ WebRegionBackendServiceIamPolicyArgs{...} }
type WebRegionBackendServiceIamPolicyArrayInput interface {
	pulumi.Input

	ToWebRegionBackendServiceIamPolicyArrayOutput() WebRegionBackendServiceIamPolicyArrayOutput
	ToWebRegionBackendServiceIamPolicyArrayOutputWithContext(context.Context) WebRegionBackendServiceIamPolicyArrayOutput
}

type WebRegionBackendServiceIamPolicyArray []WebRegionBackendServiceIamPolicyInput

func (WebRegionBackendServiceIamPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WebRegionBackendServiceIamPolicy)(nil)).Elem()
}

func (i WebRegionBackendServiceIamPolicyArray) ToWebRegionBackendServiceIamPolicyArrayOutput() WebRegionBackendServiceIamPolicyArrayOutput {
	return i.ToWebRegionBackendServiceIamPolicyArrayOutputWithContext(context.Background())
}

func (i WebRegionBackendServiceIamPolicyArray) ToWebRegionBackendServiceIamPolicyArrayOutputWithContext(ctx context.Context) WebRegionBackendServiceIamPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebRegionBackendServiceIamPolicyArrayOutput)
}

// WebRegionBackendServiceIamPolicyMapInput is an input type that accepts WebRegionBackendServiceIamPolicyMap and WebRegionBackendServiceIamPolicyMapOutput values.
// You can construct a concrete instance of `WebRegionBackendServiceIamPolicyMapInput` via:
//
//	WebRegionBackendServiceIamPolicyMap{ "key": WebRegionBackendServiceIamPolicyArgs{...} }
type WebRegionBackendServiceIamPolicyMapInput interface {
	pulumi.Input

	ToWebRegionBackendServiceIamPolicyMapOutput() WebRegionBackendServiceIamPolicyMapOutput
	ToWebRegionBackendServiceIamPolicyMapOutputWithContext(context.Context) WebRegionBackendServiceIamPolicyMapOutput
}

type WebRegionBackendServiceIamPolicyMap map[string]WebRegionBackendServiceIamPolicyInput

func (WebRegionBackendServiceIamPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WebRegionBackendServiceIamPolicy)(nil)).Elem()
}

func (i WebRegionBackendServiceIamPolicyMap) ToWebRegionBackendServiceIamPolicyMapOutput() WebRegionBackendServiceIamPolicyMapOutput {
	return i.ToWebRegionBackendServiceIamPolicyMapOutputWithContext(context.Background())
}

func (i WebRegionBackendServiceIamPolicyMap) ToWebRegionBackendServiceIamPolicyMapOutputWithContext(ctx context.Context) WebRegionBackendServiceIamPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebRegionBackendServiceIamPolicyMapOutput)
}

type WebRegionBackendServiceIamPolicyOutput struct{ *pulumi.OutputState }

func (WebRegionBackendServiceIamPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WebRegionBackendServiceIamPolicy)(nil)).Elem()
}

func (o WebRegionBackendServiceIamPolicyOutput) ToWebRegionBackendServiceIamPolicyOutput() WebRegionBackendServiceIamPolicyOutput {
	return o
}

func (o WebRegionBackendServiceIamPolicyOutput) ToWebRegionBackendServiceIamPolicyOutputWithContext(ctx context.Context) WebRegionBackendServiceIamPolicyOutput {
	return o
}

// (Computed) The etag of the IAM policy.
func (o WebRegionBackendServiceIamPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *WebRegionBackendServiceIamPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o WebRegionBackendServiceIamPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *WebRegionBackendServiceIamPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
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
func (o WebRegionBackendServiceIamPolicyOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *WebRegionBackendServiceIamPolicy) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

func (o WebRegionBackendServiceIamPolicyOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *WebRegionBackendServiceIamPolicy) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o WebRegionBackendServiceIamPolicyOutput) WebRegionBackendService() pulumi.StringOutput {
	return o.ApplyT(func(v *WebRegionBackendServiceIamPolicy) pulumi.StringOutput { return v.WebRegionBackendService }).(pulumi.StringOutput)
}

type WebRegionBackendServiceIamPolicyArrayOutput struct{ *pulumi.OutputState }

func (WebRegionBackendServiceIamPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WebRegionBackendServiceIamPolicy)(nil)).Elem()
}

func (o WebRegionBackendServiceIamPolicyArrayOutput) ToWebRegionBackendServiceIamPolicyArrayOutput() WebRegionBackendServiceIamPolicyArrayOutput {
	return o
}

func (o WebRegionBackendServiceIamPolicyArrayOutput) ToWebRegionBackendServiceIamPolicyArrayOutputWithContext(ctx context.Context) WebRegionBackendServiceIamPolicyArrayOutput {
	return o
}

func (o WebRegionBackendServiceIamPolicyArrayOutput) Index(i pulumi.IntInput) WebRegionBackendServiceIamPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WebRegionBackendServiceIamPolicy {
		return vs[0].([]*WebRegionBackendServiceIamPolicy)[vs[1].(int)]
	}).(WebRegionBackendServiceIamPolicyOutput)
}

type WebRegionBackendServiceIamPolicyMapOutput struct{ *pulumi.OutputState }

func (WebRegionBackendServiceIamPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WebRegionBackendServiceIamPolicy)(nil)).Elem()
}

func (o WebRegionBackendServiceIamPolicyMapOutput) ToWebRegionBackendServiceIamPolicyMapOutput() WebRegionBackendServiceIamPolicyMapOutput {
	return o
}

func (o WebRegionBackendServiceIamPolicyMapOutput) ToWebRegionBackendServiceIamPolicyMapOutputWithContext(ctx context.Context) WebRegionBackendServiceIamPolicyMapOutput {
	return o
}

func (o WebRegionBackendServiceIamPolicyMapOutput) MapIndex(k pulumi.StringInput) WebRegionBackendServiceIamPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WebRegionBackendServiceIamPolicy {
		return vs[0].(map[string]*WebRegionBackendServiceIamPolicy)[vs[1].(string)]
	}).(WebRegionBackendServiceIamPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WebRegionBackendServiceIamPolicyInput)(nil)).Elem(), &WebRegionBackendServiceIamPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebRegionBackendServiceIamPolicyArrayInput)(nil)).Elem(), WebRegionBackendServiceIamPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebRegionBackendServiceIamPolicyMapInput)(nil)).Elem(), WebRegionBackendServiceIamPolicyMap{})
	pulumi.RegisterOutputType(WebRegionBackendServiceIamPolicyOutput{})
	pulumi.RegisterOutputType(WebRegionBackendServiceIamPolicyArrayOutput{})
	pulumi.RegisterOutputType(WebRegionBackendServiceIamPolicyMapOutput{})
}