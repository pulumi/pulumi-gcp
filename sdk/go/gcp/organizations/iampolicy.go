// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package organizations

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Four different resources help you manage your IAM policy for a organization. Each of these resources serves a different use case:
//
// * `organizations.IAMPolicy`: Authoritative. Sets the IAM policy for the organization and replaces any existing policy already attached.
// * `organizations.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the organization are preserved.
// * `organizations.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the organization are preserved.
// * `organizations.IamAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
//
// > **Note:** `organizations.IAMPolicy` **cannot** be used in conjunction with `organizations.IAMBinding`, `organizations.IAMMember`, or `organizations.IamAuditConfig` or they will fight over what your policy should be.
//
// > **Note:** `organizations.IAMBinding` resources **can be** used in conjunction with `organizations.IAMMember` resources **only if** they do not grant privilege to the same role.
//
// ## organizations.IAMPolicy
//
// !> **Warning:** New organizations have several default policies which will,
//
//	without extreme caution, be **overwritten** by use of this resource.
//	The safest alternative is to use multiple `organizations.IAMBinding`
//	resources. This resource makes it easy to remove your own access to
//	an organization, which will require a call to Google Support to have
//	fixed, and can take multiple days to resolve.
//
//	In general, this resource should only be used with organizations
//	fully managed by this provider.I f you do use this resource,
//	the best way to be sure that you are not making dangerous changes is to start
//	by **importing** your existing policy, and examining the diff very closely.
//
// ```go
// package main
//
// import (
//
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
//			_, err = organizations.NewIAMPolicy(ctx, "organization", &organizations.IAMPolicyArgs{
//				OrgId:      pulumi.String("1234567890"),
//				PolicyData: pulumi.String(admin.PolicyData),
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
//						Role: "roles/editor",
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
//			_, err = organizations.NewIAMPolicy(ctx, "organization", &organizations.IAMPolicyArgs{
//				OrgId:      pulumi.String("1234567890"),
//				PolicyData: pulumi.String(admin.PolicyData),
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
// ## organizations.IAMBinding
//
// > **Note:** If `role` is set to `roles/owner` and you don't specify a user or service account you have access to in `members`, you can lock yourself out of your organization.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewIAMBinding(ctx, "organization", &organizations.IAMBindingArgs{
//				OrgId: pulumi.String("1234567890"),
//				Role:  pulumi.String("roles/editor"),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewIAMBinding(ctx, "organization", &organizations.IAMBindingArgs{
//				OrgId: pulumi.String("1234567890"),
//				Role:  pulumi.String("roles/editor"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
//				Condition: &organizations.IAMBindingConditionArgs{
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
// ## organizations.IAMMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewIAMMember(ctx, "organization", &organizations.IAMMemberArgs{
//				OrgId:  pulumi.String("1234567890"),
//				Role:   pulumi.String("roles/editor"),
//				Member: pulumi.String("user:jane@example.com"),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewIAMMember(ctx, "organization", &organizations.IAMMemberArgs{
//				OrgId:  pulumi.String("1234567890"),
//				Role:   pulumi.String("roles/editor"),
//				Member: pulumi.String("user:jane@example.com"),
//				Condition: &organizations.IAMMemberConditionArgs{
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
// ## organizations.IamAuditConfig
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewIamAuditConfig(ctx, "organization", &organizations.IamAuditConfigArgs{
//				OrgId:   pulumi.String("1234567890"),
//				Service: pulumi.String("allServices"),
//				AuditLogConfigs: organizations.IamAuditConfigAuditLogConfigArray{
//					&organizations.IamAuditConfigAuditLogConfigArgs{
//						LogType: pulumi.String("ADMIN_READ"),
//					},
//					&organizations.IamAuditConfigAuditLogConfigArgs{
//						LogType: pulumi.String("DATA_READ"),
//						ExemptedMembers: pulumi.StringArray{
//							pulumi.String("user:joebloggs@example.com"),
//						},
//					},
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
// ## organizations.IAMBinding
//
// > **Note:** If `role` is set to `roles/owner` and you don't specify a user or service account you have access to in `members`, you can lock yourself out of your organization.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewIAMBinding(ctx, "organization", &organizations.IAMBindingArgs{
//				OrgId: pulumi.String("1234567890"),
//				Role:  pulumi.String("roles/editor"),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewIAMBinding(ctx, "organization", &organizations.IAMBindingArgs{
//				OrgId: pulumi.String("1234567890"),
//				Role:  pulumi.String("roles/editor"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
//				Condition: &organizations.IAMBindingConditionArgs{
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
// ## organizations.IAMMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewIAMMember(ctx, "organization", &organizations.IAMMemberArgs{
//				OrgId:  pulumi.String("1234567890"),
//				Role:   pulumi.String("roles/editor"),
//				Member: pulumi.String("user:jane@example.com"),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewIAMMember(ctx, "organization", &organizations.IAMMemberArgs{
//				OrgId:  pulumi.String("1234567890"),
//				Role:   pulumi.String("roles/editor"),
//				Member: pulumi.String("user:jane@example.com"),
//				Condition: &organizations.IAMMemberConditionArgs{
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
// ## organizations.IamAuditConfig
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewIamAuditConfig(ctx, "organization", &organizations.IamAuditConfigArgs{
//				OrgId:   pulumi.String("1234567890"),
//				Service: pulumi.String("allServices"),
//				AuditLogConfigs: organizations.IamAuditConfigAuditLogConfigArray{
//					&organizations.IamAuditConfigAuditLogConfigArgs{
//						LogType: pulumi.String("ADMIN_READ"),
//					},
//					&organizations.IamAuditConfigAuditLogConfigArgs{
//						LogType: pulumi.String("DATA_READ"),
//						ExemptedMembers: pulumi.StringArray{
//							pulumi.String("user:joebloggs@example.com"),
//						},
//					},
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
// ### Importing Audit Configs
//
// An audit config can be imported into a `google_organization_iam_audit_config` resource using the resource's `org_id` and the `service`, e.g:
//
// * `"{{org_id}} foo.googleapis.com"`
//
// An `import` block (Terraform v1.5.0 and later) can be used to import audit configs:
//
// tf
//
// import {
//
//	id = "{{org_id}} foo.googleapis.com"
//
//	to = google_organization_iam_audit_config.default
//
// }
//
// The `pulumi import` command can also be used:
//
// ```sh
// $ pulumi import gcp:organizations/iAMPolicy:IAMPolicy default "{{org_id}} foo.googleapis.com"
// ```
type IAMPolicy struct {
	pulumi.CustomResourceState

	// (Computed) The etag of the organization's IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The organization id of the target organization.
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// The `organizations.getIAMPolicy` data source that represents
	// the IAM policy that will be applied to the organization. The policy will be
	// merged with any existing policy applied to the organization.
	//
	// Changing this updates the policy.
	//
	// Deleting this removes all policies from the organization, locking out users without
	// organization-level access.
	PolicyData pulumi.StringOutput `pulumi:"policyData"`
}

// NewIAMPolicy registers a new resource with the given unique name, arguments, and options.
func NewIAMPolicy(ctx *pulumi.Context,
	name string, args *IAMPolicyArgs, opts ...pulumi.ResourceOption) (*IAMPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IAMPolicy
	err := ctx.RegisterResource("gcp:organizations/iAMPolicy:IAMPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIAMPolicy gets an existing IAMPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIAMPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IAMPolicyState, opts ...pulumi.ResourceOption) (*IAMPolicy, error) {
	var resource IAMPolicy
	err := ctx.ReadResource("gcp:organizations/iAMPolicy:IAMPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IAMPolicy resources.
type iampolicyState struct {
	// (Computed) The etag of the organization's IAM policy.
	Etag *string `pulumi:"etag"`
	// The organization id of the target organization.
	OrgId *string `pulumi:"orgId"`
	// The `organizations.getIAMPolicy` data source that represents
	// the IAM policy that will be applied to the organization. The policy will be
	// merged with any existing policy applied to the organization.
	//
	// Changing this updates the policy.
	//
	// Deleting this removes all policies from the organization, locking out users without
	// organization-level access.
	PolicyData *string `pulumi:"policyData"`
}

type IAMPolicyState struct {
	// (Computed) The etag of the organization's IAM policy.
	Etag pulumi.StringPtrInput
	// The organization id of the target organization.
	OrgId pulumi.StringPtrInput
	// The `organizations.getIAMPolicy` data source that represents
	// the IAM policy that will be applied to the organization. The policy will be
	// merged with any existing policy applied to the organization.
	//
	// Changing this updates the policy.
	//
	// Deleting this removes all policies from the organization, locking out users without
	// organization-level access.
	PolicyData pulumi.StringPtrInput
}

func (IAMPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*iampolicyState)(nil)).Elem()
}

type iampolicyArgs struct {
	// The organization id of the target organization.
	OrgId string `pulumi:"orgId"`
	// The `organizations.getIAMPolicy` data source that represents
	// the IAM policy that will be applied to the organization. The policy will be
	// merged with any existing policy applied to the organization.
	//
	// Changing this updates the policy.
	//
	// Deleting this removes all policies from the organization, locking out users without
	// organization-level access.
	PolicyData string `pulumi:"policyData"`
}

// The set of arguments for constructing a IAMPolicy resource.
type IAMPolicyArgs struct {
	// The organization id of the target organization.
	OrgId pulumi.StringInput
	// The `organizations.getIAMPolicy` data source that represents
	// the IAM policy that will be applied to the organization. The policy will be
	// merged with any existing policy applied to the organization.
	//
	// Changing this updates the policy.
	//
	// Deleting this removes all policies from the organization, locking out users without
	// organization-level access.
	PolicyData pulumi.StringInput
}

func (IAMPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*iampolicyArgs)(nil)).Elem()
}

type IAMPolicyInput interface {
	pulumi.Input

	ToIAMPolicyOutput() IAMPolicyOutput
	ToIAMPolicyOutputWithContext(ctx context.Context) IAMPolicyOutput
}

func (*IAMPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**IAMPolicy)(nil)).Elem()
}

func (i *IAMPolicy) ToIAMPolicyOutput() IAMPolicyOutput {
	return i.ToIAMPolicyOutputWithContext(context.Background())
}

func (i *IAMPolicy) ToIAMPolicyOutputWithContext(ctx context.Context) IAMPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IAMPolicyOutput)
}

// IAMPolicyArrayInput is an input type that accepts IAMPolicyArray and IAMPolicyArrayOutput values.
// You can construct a concrete instance of `IAMPolicyArrayInput` via:
//
//	IAMPolicyArray{ IAMPolicyArgs{...} }
type IAMPolicyArrayInput interface {
	pulumi.Input

	ToIAMPolicyArrayOutput() IAMPolicyArrayOutput
	ToIAMPolicyArrayOutputWithContext(context.Context) IAMPolicyArrayOutput
}

type IAMPolicyArray []IAMPolicyInput

func (IAMPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IAMPolicy)(nil)).Elem()
}

func (i IAMPolicyArray) ToIAMPolicyArrayOutput() IAMPolicyArrayOutput {
	return i.ToIAMPolicyArrayOutputWithContext(context.Background())
}

func (i IAMPolicyArray) ToIAMPolicyArrayOutputWithContext(ctx context.Context) IAMPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IAMPolicyArrayOutput)
}

// IAMPolicyMapInput is an input type that accepts IAMPolicyMap and IAMPolicyMapOutput values.
// You can construct a concrete instance of `IAMPolicyMapInput` via:
//
//	IAMPolicyMap{ "key": IAMPolicyArgs{...} }
type IAMPolicyMapInput interface {
	pulumi.Input

	ToIAMPolicyMapOutput() IAMPolicyMapOutput
	ToIAMPolicyMapOutputWithContext(context.Context) IAMPolicyMapOutput
}

type IAMPolicyMap map[string]IAMPolicyInput

func (IAMPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IAMPolicy)(nil)).Elem()
}

func (i IAMPolicyMap) ToIAMPolicyMapOutput() IAMPolicyMapOutput {
	return i.ToIAMPolicyMapOutputWithContext(context.Background())
}

func (i IAMPolicyMap) ToIAMPolicyMapOutputWithContext(ctx context.Context) IAMPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IAMPolicyMapOutput)
}

type IAMPolicyOutput struct{ *pulumi.OutputState }

func (IAMPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IAMPolicy)(nil)).Elem()
}

func (o IAMPolicyOutput) ToIAMPolicyOutput() IAMPolicyOutput {
	return o
}

func (o IAMPolicyOutput) ToIAMPolicyOutputWithContext(ctx context.Context) IAMPolicyOutput {
	return o
}

// (Computed) The etag of the organization's IAM policy.
func (o IAMPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *IAMPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The organization id of the target organization.
func (o IAMPolicyOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *IAMPolicy) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// The `organizations.getIAMPolicy` data source that represents
// the IAM policy that will be applied to the organization. The policy will be
// merged with any existing policy applied to the organization.
//
// Changing this updates the policy.
//
// Deleting this removes all policies from the organization, locking out users without
// organization-level access.
func (o IAMPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *IAMPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
}

type IAMPolicyArrayOutput struct{ *pulumi.OutputState }

func (IAMPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IAMPolicy)(nil)).Elem()
}

func (o IAMPolicyArrayOutput) ToIAMPolicyArrayOutput() IAMPolicyArrayOutput {
	return o
}

func (o IAMPolicyArrayOutput) ToIAMPolicyArrayOutputWithContext(ctx context.Context) IAMPolicyArrayOutput {
	return o
}

func (o IAMPolicyArrayOutput) Index(i pulumi.IntInput) IAMPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IAMPolicy {
		return vs[0].([]*IAMPolicy)[vs[1].(int)]
	}).(IAMPolicyOutput)
}

type IAMPolicyMapOutput struct{ *pulumi.OutputState }

func (IAMPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IAMPolicy)(nil)).Elem()
}

func (o IAMPolicyMapOutput) ToIAMPolicyMapOutput() IAMPolicyMapOutput {
	return o
}

func (o IAMPolicyMapOutput) ToIAMPolicyMapOutputWithContext(ctx context.Context) IAMPolicyMapOutput {
	return o
}

func (o IAMPolicyMapOutput) MapIndex(k pulumi.StringInput) IAMPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IAMPolicy {
		return vs[0].(map[string]*IAMPolicy)[vs[1].(string)]
	}).(IAMPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IAMPolicyInput)(nil)).Elem(), &IAMPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*IAMPolicyArrayInput)(nil)).Elem(), IAMPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IAMPolicyMapInput)(nil)).Elem(), IAMPolicyMap{})
	pulumi.RegisterOutputType(IAMPolicyOutput{})
	pulumi.RegisterOutputType(IAMPolicyArrayOutput{})
	pulumi.RegisterOutputType(IAMPolicyMapOutput{})
}
