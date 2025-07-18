// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package certificateauthority

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Certificate Authority Service CertificateTemplate. Each of these resources serves a different use case:
//
// * `certificateauthority.CertificateTemplateIamPolicy`: Authoritative. Sets the IAM policy for the certificatetemplate and replaces any existing policy already attached.
// * `certificateauthority.CertificateTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the certificatetemplate are preserved.
// * `certificateauthority.CertificateTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the certificatetemplate are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `certificateauthority.CertificateTemplateIamPolicy`: Retrieves the IAM policy for the certificatetemplate
//
// > **Note:** `certificateauthority.CertificateTemplateIamPolicy` **cannot** be used in conjunction with `certificateauthority.CertificateTemplateIamBinding` and `certificateauthority.CertificateTemplateIamMember` or they will fight over what your policy should be.
//
// > **Note:** `certificateauthority.CertificateTemplateIamBinding` resources **can be** used in conjunction with `certificateauthority.CertificateTemplateIamMember` resources **only if** they do not grant privilege to the same role.
//
// > **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
//
// ## certificateauthority.CertificateTemplateIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/certificateauthority"
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
//						Role: "roles/privateca.templateUser",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = certificateauthority.NewCertificateTemplateIamPolicy(ctx, "policy", &certificateauthority.CertificateTemplateIamPolicyArgs{
//				CertificateTemplate: pulumi.Any(_default.Id),
//				PolicyData:          pulumi.String(admin.PolicyData),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/certificateauthority"
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
//						Role: "roles/privateca.templateUser",
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
//			_, err = certificateauthority.NewCertificateTemplateIamPolicy(ctx, "policy", &certificateauthority.CertificateTemplateIamPolicyArgs{
//				CertificateTemplate: pulumi.Any(_default.Id),
//				PolicyData:          pulumi.String(admin.PolicyData),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## certificateauthority.CertificateTemplateIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/certificateauthority"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := certificateauthority.NewCertificateTemplateIamBinding(ctx, "binding", &certificateauthority.CertificateTemplateIamBindingArgs{
//				CertificateTemplate: pulumi.Any(_default.Id),
//				Role:                pulumi.String("roles/privateca.templateUser"),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/certificateauthority"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := certificateauthority.NewCertificateTemplateIamBinding(ctx, "binding", &certificateauthority.CertificateTemplateIamBindingArgs{
//				CertificateTemplate: pulumi.Any(_default.Id),
//				Role:                pulumi.String("roles/privateca.templateUser"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
//				Condition: &certificateauthority.CertificateTemplateIamBindingConditionArgs{
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
// ## certificateauthority.CertificateTemplateIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/certificateauthority"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := certificateauthority.NewCertificateTemplateIamMember(ctx, "member", &certificateauthority.CertificateTemplateIamMemberArgs{
//				CertificateTemplate: pulumi.Any(_default.Id),
//				Role:                pulumi.String("roles/privateca.templateUser"),
//				Member:              pulumi.String("user:jane@example.com"),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/certificateauthority"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := certificateauthority.NewCertificateTemplateIamMember(ctx, "member", &certificateauthority.CertificateTemplateIamMemberArgs{
//				CertificateTemplate: pulumi.Any(_default.Id),
//				Role:                pulumi.String("roles/privateca.templateUser"),
//				Member:              pulumi.String("user:jane@example.com"),
//				Condition: &certificateauthority.CertificateTemplateIamMemberConditionArgs{
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
// ## This resource supports User Project Overrides.
//
// -
//
// # IAM policy for Certificate Authority Service CertificateTemplate
// Three different resources help you manage your IAM policy for Certificate Authority Service CertificateTemplate. Each of these resources serves a different use case:
//
// * `certificateauthority.CertificateTemplateIamPolicy`: Authoritative. Sets the IAM policy for the certificatetemplate and replaces any existing policy already attached.
// * `certificateauthority.CertificateTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the certificatetemplate are preserved.
// * `certificateauthority.CertificateTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the certificatetemplate are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `certificateauthority.CertificateTemplateIamPolicy`: Retrieves the IAM policy for the certificatetemplate
//
// > **Note:** `certificateauthority.CertificateTemplateIamPolicy` **cannot** be used in conjunction with `certificateauthority.CertificateTemplateIamBinding` and `certificateauthority.CertificateTemplateIamMember` or they will fight over what your policy should be.
//
// > **Note:** `certificateauthority.CertificateTemplateIamBinding` resources **can be** used in conjunction with `certificateauthority.CertificateTemplateIamMember` resources **only if** they do not grant privilege to the same role.
//
// > **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
//
// ## certificateauthority.CertificateTemplateIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/certificateauthority"
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
//						Role: "roles/privateca.templateUser",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = certificateauthority.NewCertificateTemplateIamPolicy(ctx, "policy", &certificateauthority.CertificateTemplateIamPolicyArgs{
//				CertificateTemplate: pulumi.Any(_default.Id),
//				PolicyData:          pulumi.String(admin.PolicyData),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/certificateauthority"
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
//						Role: "roles/privateca.templateUser",
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
//			_, err = certificateauthority.NewCertificateTemplateIamPolicy(ctx, "policy", &certificateauthority.CertificateTemplateIamPolicyArgs{
//				CertificateTemplate: pulumi.Any(_default.Id),
//				PolicyData:          pulumi.String(admin.PolicyData),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## certificateauthority.CertificateTemplateIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/certificateauthority"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := certificateauthority.NewCertificateTemplateIamBinding(ctx, "binding", &certificateauthority.CertificateTemplateIamBindingArgs{
//				CertificateTemplate: pulumi.Any(_default.Id),
//				Role:                pulumi.String("roles/privateca.templateUser"),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/certificateauthority"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := certificateauthority.NewCertificateTemplateIamBinding(ctx, "binding", &certificateauthority.CertificateTemplateIamBindingArgs{
//				CertificateTemplate: pulumi.Any(_default.Id),
//				Role:                pulumi.String("roles/privateca.templateUser"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
//				Condition: &certificateauthority.CertificateTemplateIamBindingConditionArgs{
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
// ## certificateauthority.CertificateTemplateIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/certificateauthority"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := certificateauthority.NewCertificateTemplateIamMember(ctx, "member", &certificateauthority.CertificateTemplateIamMemberArgs{
//				CertificateTemplate: pulumi.Any(_default.Id),
//				Role:                pulumi.String("roles/privateca.templateUser"),
//				Member:              pulumi.String("user:jane@example.com"),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/certificateauthority"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := certificateauthority.NewCertificateTemplateIamMember(ctx, "member", &certificateauthority.CertificateTemplateIamMemberArgs{
//				CertificateTemplate: pulumi.Any(_default.Id),
//				Role:                pulumi.String("roles/privateca.templateUser"),
//				Member:              pulumi.String("user:jane@example.com"),
//				Condition: &certificateauthority.CertificateTemplateIamMemberConditionArgs{
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
// For all import syntaxes, the "resource in question" can take any of the following forms:
//
// * projects/{{project}}/locations/{{location}}/certificateTemplates/{{name}}
//
// * {{project}}/{{location}}/{{name}}
//
// * {{location}}/{{name}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Certificate Authority Service certificatetemplate IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:certificateauthority/certificateTemplateIamPolicy:CertificateTemplateIamPolicy editor "projects/{{project}}/locations/{{location}}/certificateTemplates/{{certificate_template}} roles/privateca.templateUser user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:certificateauthority/certificateTemplateIamPolicy:CertificateTemplateIamPolicy editor "projects/{{project}}/locations/{{location}}/certificateTemplates/{{certificate_template}} roles/privateca.templateUser"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:certificateauthority/certificateTemplateIamPolicy:CertificateTemplateIamPolicy editor projects/{{project}}/locations/{{location}}/certificateTemplates/{{certificate_template}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type CertificateTemplateIamPolicy struct {
	pulumi.CustomResourceState

	// Used to find the parent resource to bind the IAM policy to
	CertificateTemplate pulumi.StringOutput `pulumi:"certificateTemplate"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringOutput `pulumi:"location"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringOutput `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
}

// NewCertificateTemplateIamPolicy registers a new resource with the given unique name, arguments, and options.
func NewCertificateTemplateIamPolicy(ctx *pulumi.Context,
	name string, args *CertificateTemplateIamPolicyArgs, opts ...pulumi.ResourceOption) (*CertificateTemplateIamPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CertificateTemplate == nil {
		return nil, errors.New("invalid value for required argument 'CertificateTemplate'")
	}
	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CertificateTemplateIamPolicy
	err := ctx.RegisterResource("gcp:certificateauthority/certificateTemplateIamPolicy:CertificateTemplateIamPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCertificateTemplateIamPolicy gets an existing CertificateTemplateIamPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCertificateTemplateIamPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CertificateTemplateIamPolicyState, opts ...pulumi.ResourceOption) (*CertificateTemplateIamPolicy, error) {
	var resource CertificateTemplateIamPolicy
	err := ctx.ReadResource("gcp:certificateauthority/certificateTemplateIamPolicy:CertificateTemplateIamPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CertificateTemplateIamPolicy resources.
type certificateTemplateIamPolicyState struct {
	// Used to find the parent resource to bind the IAM policy to
	CertificateTemplate *string `pulumi:"certificateTemplate"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData *string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
}

type CertificateTemplateIamPolicyState struct {
	// Used to find the parent resource to bind the IAM policy to
	CertificateTemplate pulumi.StringPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
}

func (CertificateTemplateIamPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateTemplateIamPolicyState)(nil)).Elem()
}

type certificateTemplateIamPolicyArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	CertificateTemplate string `pulumi:"certificateTemplate"`
	// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
}

// The set of arguments for constructing a CertificateTemplateIamPolicy resource.
type CertificateTemplateIamPolicyArgs struct {
	// Used to find the parent resource to bind the IAM policy to
	CertificateTemplate pulumi.StringInput
	// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
}

func (CertificateTemplateIamPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateTemplateIamPolicyArgs)(nil)).Elem()
}

type CertificateTemplateIamPolicyInput interface {
	pulumi.Input

	ToCertificateTemplateIamPolicyOutput() CertificateTemplateIamPolicyOutput
	ToCertificateTemplateIamPolicyOutputWithContext(ctx context.Context) CertificateTemplateIamPolicyOutput
}

func (*CertificateTemplateIamPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**CertificateTemplateIamPolicy)(nil)).Elem()
}

func (i *CertificateTemplateIamPolicy) ToCertificateTemplateIamPolicyOutput() CertificateTemplateIamPolicyOutput {
	return i.ToCertificateTemplateIamPolicyOutputWithContext(context.Background())
}

func (i *CertificateTemplateIamPolicy) ToCertificateTemplateIamPolicyOutputWithContext(ctx context.Context) CertificateTemplateIamPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateTemplateIamPolicyOutput)
}

// CertificateTemplateIamPolicyArrayInput is an input type that accepts CertificateTemplateIamPolicyArray and CertificateTemplateIamPolicyArrayOutput values.
// You can construct a concrete instance of `CertificateTemplateIamPolicyArrayInput` via:
//
//	CertificateTemplateIamPolicyArray{ CertificateTemplateIamPolicyArgs{...} }
type CertificateTemplateIamPolicyArrayInput interface {
	pulumi.Input

	ToCertificateTemplateIamPolicyArrayOutput() CertificateTemplateIamPolicyArrayOutput
	ToCertificateTemplateIamPolicyArrayOutputWithContext(context.Context) CertificateTemplateIamPolicyArrayOutput
}

type CertificateTemplateIamPolicyArray []CertificateTemplateIamPolicyInput

func (CertificateTemplateIamPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CertificateTemplateIamPolicy)(nil)).Elem()
}

func (i CertificateTemplateIamPolicyArray) ToCertificateTemplateIamPolicyArrayOutput() CertificateTemplateIamPolicyArrayOutput {
	return i.ToCertificateTemplateIamPolicyArrayOutputWithContext(context.Background())
}

func (i CertificateTemplateIamPolicyArray) ToCertificateTemplateIamPolicyArrayOutputWithContext(ctx context.Context) CertificateTemplateIamPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateTemplateIamPolicyArrayOutput)
}

// CertificateTemplateIamPolicyMapInput is an input type that accepts CertificateTemplateIamPolicyMap and CertificateTemplateIamPolicyMapOutput values.
// You can construct a concrete instance of `CertificateTemplateIamPolicyMapInput` via:
//
//	CertificateTemplateIamPolicyMap{ "key": CertificateTemplateIamPolicyArgs{...} }
type CertificateTemplateIamPolicyMapInput interface {
	pulumi.Input

	ToCertificateTemplateIamPolicyMapOutput() CertificateTemplateIamPolicyMapOutput
	ToCertificateTemplateIamPolicyMapOutputWithContext(context.Context) CertificateTemplateIamPolicyMapOutput
}

type CertificateTemplateIamPolicyMap map[string]CertificateTemplateIamPolicyInput

func (CertificateTemplateIamPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CertificateTemplateIamPolicy)(nil)).Elem()
}

func (i CertificateTemplateIamPolicyMap) ToCertificateTemplateIamPolicyMapOutput() CertificateTemplateIamPolicyMapOutput {
	return i.ToCertificateTemplateIamPolicyMapOutputWithContext(context.Background())
}

func (i CertificateTemplateIamPolicyMap) ToCertificateTemplateIamPolicyMapOutputWithContext(ctx context.Context) CertificateTemplateIamPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateTemplateIamPolicyMapOutput)
}

type CertificateTemplateIamPolicyOutput struct{ *pulumi.OutputState }

func (CertificateTemplateIamPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CertificateTemplateIamPolicy)(nil)).Elem()
}

func (o CertificateTemplateIamPolicyOutput) ToCertificateTemplateIamPolicyOutput() CertificateTemplateIamPolicyOutput {
	return o
}

func (o CertificateTemplateIamPolicyOutput) ToCertificateTemplateIamPolicyOutputWithContext(ctx context.Context) CertificateTemplateIamPolicyOutput {
	return o
}

// Used to find the parent resource to bind the IAM policy to
func (o CertificateTemplateIamPolicyOutput) CertificateTemplate() pulumi.StringOutput {
	return o.ApplyT(func(v *CertificateTemplateIamPolicy) pulumi.StringOutput { return v.CertificateTemplate }).(pulumi.StringOutput)
}

// (Computed) The etag of the IAM policy.
func (o CertificateTemplateIamPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *CertificateTemplateIamPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The location for the resource Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
// location is specified, it is taken from the provider configuration.
func (o CertificateTemplateIamPolicyOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *CertificateTemplateIamPolicy) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o CertificateTemplateIamPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *CertificateTemplateIamPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o CertificateTemplateIamPolicyOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *CertificateTemplateIamPolicy) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

type CertificateTemplateIamPolicyArrayOutput struct{ *pulumi.OutputState }

func (CertificateTemplateIamPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CertificateTemplateIamPolicy)(nil)).Elem()
}

func (o CertificateTemplateIamPolicyArrayOutput) ToCertificateTemplateIamPolicyArrayOutput() CertificateTemplateIamPolicyArrayOutput {
	return o
}

func (o CertificateTemplateIamPolicyArrayOutput) ToCertificateTemplateIamPolicyArrayOutputWithContext(ctx context.Context) CertificateTemplateIamPolicyArrayOutput {
	return o
}

func (o CertificateTemplateIamPolicyArrayOutput) Index(i pulumi.IntInput) CertificateTemplateIamPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CertificateTemplateIamPolicy {
		return vs[0].([]*CertificateTemplateIamPolicy)[vs[1].(int)]
	}).(CertificateTemplateIamPolicyOutput)
}

type CertificateTemplateIamPolicyMapOutput struct{ *pulumi.OutputState }

func (CertificateTemplateIamPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CertificateTemplateIamPolicy)(nil)).Elem()
}

func (o CertificateTemplateIamPolicyMapOutput) ToCertificateTemplateIamPolicyMapOutput() CertificateTemplateIamPolicyMapOutput {
	return o
}

func (o CertificateTemplateIamPolicyMapOutput) ToCertificateTemplateIamPolicyMapOutputWithContext(ctx context.Context) CertificateTemplateIamPolicyMapOutput {
	return o
}

func (o CertificateTemplateIamPolicyMapOutput) MapIndex(k pulumi.StringInput) CertificateTemplateIamPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CertificateTemplateIamPolicy {
		return vs[0].(map[string]*CertificateTemplateIamPolicy)[vs[1].(string)]
	}).(CertificateTemplateIamPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateTemplateIamPolicyInput)(nil)).Elem(), &CertificateTemplateIamPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateTemplateIamPolicyArrayInput)(nil)).Elem(), CertificateTemplateIamPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateTemplateIamPolicyMapInput)(nil)).Elem(), CertificateTemplateIamPolicyMap{})
	pulumi.RegisterOutputType(CertificateTemplateIamPolicyOutput{})
	pulumi.RegisterOutputType(CertificateTemplateIamPolicyArrayOutput{})
	pulumi.RegisterOutputType(CertificateTemplateIamPolicyMapOutput{})
}
