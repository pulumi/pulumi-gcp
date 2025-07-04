// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package logging

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for Cloud (Stackdriver) Logging LogView. Each of these resources serves a different use case:
//
// * `logging.LogViewIamPolicy`: Authoritative. Sets the IAM policy for the logview and replaces any existing policy already attached.
// * `logging.LogViewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the logview are preserved.
// * `logging.LogViewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the logview are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `logging.LogViewIamPolicy`: Retrieves the IAM policy for the logview
//
// > **Note:** `logging.LogViewIamPolicy` **cannot** be used in conjunction with `logging.LogViewIamBinding` and `logging.LogViewIamMember` or they will fight over what your policy should be.
//
// > **Note:** `logging.LogViewIamBinding` resources **can be** used in conjunction with `logging.LogViewIamMember` resources **only if** they do not grant privilege to the same role.
//
// > **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
//
// ## logging.LogViewIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/logging"
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
//						Role: "roles/logging.admin",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = logging.NewLogViewIamPolicy(ctx, "policy", &logging.LogViewIamPolicyArgs{
//				Parent:     pulumi.Any(loggingLogView.Parent),
//				Location:   pulumi.Any(loggingLogView.Location),
//				Bucket:     pulumi.Any(loggingLogView.Bucket),
//				Name:       pulumi.Any(loggingLogView.Name),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/logging"
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
//						Role: "roles/logging.admin",
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
//			_, err = logging.NewLogViewIamPolicy(ctx, "policy", &logging.LogViewIamPolicyArgs{
//				Parent:     pulumi.Any(loggingLogView.Parent),
//				Location:   pulumi.Any(loggingLogView.Location),
//				Bucket:     pulumi.Any(loggingLogView.Bucket),
//				Name:       pulumi.Any(loggingLogView.Name),
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
// ## logging.LogViewIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/logging"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := logging.NewLogViewIamBinding(ctx, "binding", &logging.LogViewIamBindingArgs{
//				Parent:   pulumi.Any(loggingLogView.Parent),
//				Location: pulumi.Any(loggingLogView.Location),
//				Bucket:   pulumi.Any(loggingLogView.Bucket),
//				Name:     pulumi.Any(loggingLogView.Name),
//				Role:     pulumi.String("roles/logging.admin"),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/logging"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := logging.NewLogViewIamBinding(ctx, "binding", &logging.LogViewIamBindingArgs{
//				Parent:   pulumi.Any(loggingLogView.Parent),
//				Location: pulumi.Any(loggingLogView.Location),
//				Bucket:   pulumi.Any(loggingLogView.Bucket),
//				Name:     pulumi.Any(loggingLogView.Name),
//				Role:     pulumi.String("roles/logging.admin"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
//				Condition: &logging.LogViewIamBindingConditionArgs{
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
// ## logging.LogViewIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/logging"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := logging.NewLogViewIamMember(ctx, "member", &logging.LogViewIamMemberArgs{
//				Parent:   pulumi.Any(loggingLogView.Parent),
//				Location: pulumi.Any(loggingLogView.Location),
//				Bucket:   pulumi.Any(loggingLogView.Bucket),
//				Name:     pulumi.Any(loggingLogView.Name),
//				Role:     pulumi.String("roles/logging.admin"),
//				Member:   pulumi.String("user:jane@example.com"),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/logging"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := logging.NewLogViewIamMember(ctx, "member", &logging.LogViewIamMemberArgs{
//				Parent:   pulumi.Any(loggingLogView.Parent),
//				Location: pulumi.Any(loggingLogView.Location),
//				Bucket:   pulumi.Any(loggingLogView.Bucket),
//				Name:     pulumi.Any(loggingLogView.Name),
//				Role:     pulumi.String("roles/logging.admin"),
//				Member:   pulumi.String("user:jane@example.com"),
//				Condition: &logging.LogViewIamMemberConditionArgs{
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
// ## > **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
// full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
// ---
//
// # IAM policy for Cloud (Stackdriver) Logging LogView
// Three different resources help you manage your IAM policy for Cloud (Stackdriver) Logging LogView. Each of these resources serves a different use case:
//
// * `logging.LogViewIamPolicy`: Authoritative. Sets the IAM policy for the logview and replaces any existing policy already attached.
// * `logging.LogViewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the logview are preserved.
// * `logging.LogViewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the logview are preserved.
//
// # A data source can be used to retrieve policy data in advent you do not need creation
//
// * `logging.LogViewIamPolicy`: Retrieves the IAM policy for the logview
//
// > **Note:** `logging.LogViewIamPolicy` **cannot** be used in conjunction with `logging.LogViewIamBinding` and `logging.LogViewIamMember` or they will fight over what your policy should be.
//
// > **Note:** `logging.LogViewIamBinding` resources **can be** used in conjunction with `logging.LogViewIamMember` resources **only if** they do not grant privilege to the same role.
//
// > **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
//
// ## logging.LogViewIamPolicy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/logging"
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
//						Role: "roles/logging.admin",
//						Members: []string{
//							"user:jane@example.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = logging.NewLogViewIamPolicy(ctx, "policy", &logging.LogViewIamPolicyArgs{
//				Parent:     pulumi.Any(loggingLogView.Parent),
//				Location:   pulumi.Any(loggingLogView.Location),
//				Bucket:     pulumi.Any(loggingLogView.Bucket),
//				Name:       pulumi.Any(loggingLogView.Name),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/logging"
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
//						Role: "roles/logging.admin",
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
//			_, err = logging.NewLogViewIamPolicy(ctx, "policy", &logging.LogViewIamPolicyArgs{
//				Parent:     pulumi.Any(loggingLogView.Parent),
//				Location:   pulumi.Any(loggingLogView.Location),
//				Bucket:     pulumi.Any(loggingLogView.Bucket),
//				Name:       pulumi.Any(loggingLogView.Name),
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
// ## logging.LogViewIamBinding
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/logging"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := logging.NewLogViewIamBinding(ctx, "binding", &logging.LogViewIamBindingArgs{
//				Parent:   pulumi.Any(loggingLogView.Parent),
//				Location: pulumi.Any(loggingLogView.Location),
//				Bucket:   pulumi.Any(loggingLogView.Bucket),
//				Name:     pulumi.Any(loggingLogView.Name),
//				Role:     pulumi.String("roles/logging.admin"),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/logging"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := logging.NewLogViewIamBinding(ctx, "binding", &logging.LogViewIamBindingArgs{
//				Parent:   pulumi.Any(loggingLogView.Parent),
//				Location: pulumi.Any(loggingLogView.Location),
//				Bucket:   pulumi.Any(loggingLogView.Bucket),
//				Name:     pulumi.Any(loggingLogView.Name),
//				Role:     pulumi.String("roles/logging.admin"),
//				Members: pulumi.StringArray{
//					pulumi.String("user:jane@example.com"),
//				},
//				Condition: &logging.LogViewIamBindingConditionArgs{
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
// ## logging.LogViewIamMember
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/logging"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := logging.NewLogViewIamMember(ctx, "member", &logging.LogViewIamMemberArgs{
//				Parent:   pulumi.Any(loggingLogView.Parent),
//				Location: pulumi.Any(loggingLogView.Location),
//				Bucket:   pulumi.Any(loggingLogView.Bucket),
//				Name:     pulumi.Any(loggingLogView.Name),
//				Role:     pulumi.String("roles/logging.admin"),
//				Member:   pulumi.String("user:jane@example.com"),
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
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/logging"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := logging.NewLogViewIamMember(ctx, "member", &logging.LogViewIamMemberArgs{
//				Parent:   pulumi.Any(loggingLogView.Parent),
//				Location: pulumi.Any(loggingLogView.Location),
//				Bucket:   pulumi.Any(loggingLogView.Bucket),
//				Name:     pulumi.Any(loggingLogView.Name),
//				Role:     pulumi.String("roles/logging.admin"),
//				Member:   pulumi.String("user:jane@example.com"),
//				Condition: &logging.LogViewIamMemberConditionArgs{
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
// * {{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{name}}
//
// * {{name}}
//
// Any variables not passed in the import command will be taken from the provider configuration.
//
// Cloud (Stackdriver) Logging logview IAM resources can be imported using the resource identifiers, role, and member.
//
// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
//
// ```sh
// $ pulumi import gcp:logging/logViewIamPolicy:LogViewIamPolicy editor "{{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}} roles/logging.admin user:jane@example.com"
// ```
//
// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
//
// ```sh
// $ pulumi import gcp:logging/logViewIamPolicy:LogViewIamPolicy editor "{{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}} roles/logging.admin"
// ```
//
// IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
// $ pulumi import gcp:logging/logViewIamPolicy:LogViewIamPolicy editor {{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}}
// ```
//
// -> **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
//
//	full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type LogViewIamPolicy struct {
	pulumi.CustomResourceState

	// The bucket of the resource Used to find the parent resource to bind the IAM policy to
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringOutput `pulumi:"location"`
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringOutput `pulumi:"name"`
	// The parent of the resource. Used to find the parent resource to bind the IAM policy to
	Parent pulumi.StringOutput `pulumi:"parent"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringOutput `pulumi:"policyData"`
}

// NewLogViewIamPolicy registers a new resource with the given unique name, arguments, and options.
func NewLogViewIamPolicy(ctx *pulumi.Context,
	name string, args *LogViewIamPolicyArgs, opts ...pulumi.ResourceOption) (*LogViewIamPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	if args.Parent == nil {
		return nil, errors.New("invalid value for required argument 'Parent'")
	}
	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LogViewIamPolicy
	err := ctx.RegisterResource("gcp:logging/logViewIamPolicy:LogViewIamPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogViewIamPolicy gets an existing LogViewIamPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogViewIamPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogViewIamPolicyState, opts ...pulumi.ResourceOption) (*LogViewIamPolicy, error) {
	var resource LogViewIamPolicy
	err := ctx.ReadResource("gcp:logging/logViewIamPolicy:LogViewIamPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogViewIamPolicy resources.
type logViewIamPolicyState struct {
	// The bucket of the resource Used to find the parent resource to bind the IAM policy to
	Bucket *string `pulumi:"bucket"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
	// Used to find the parent resource to bind the IAM policy to
	Name *string `pulumi:"name"`
	// The parent of the resource. Used to find the parent resource to bind the IAM policy to
	Parent *string `pulumi:"parent"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData *string `pulumi:"policyData"`
}

type LogViewIamPolicyState struct {
	// The bucket of the resource Used to find the parent resource to bind the IAM policy to
	Bucket pulumi.StringPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringPtrInput
	// The parent of the resource. Used to find the parent resource to bind the IAM policy to
	Parent pulumi.StringPtrInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringPtrInput
}

func (LogViewIamPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*logViewIamPolicyState)(nil)).Elem()
}

type logViewIamPolicyArgs struct {
	// The bucket of the resource Used to find the parent resource to bind the IAM policy to
	Bucket string `pulumi:"bucket"`
	// The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location *string `pulumi:"location"`
	// Used to find the parent resource to bind the IAM policy to
	Name *string `pulumi:"name"`
	// The parent of the resource. Used to find the parent resource to bind the IAM policy to
	Parent string `pulumi:"parent"`
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData string `pulumi:"policyData"`
}

// The set of arguments for constructing a LogViewIamPolicy resource.
type LogViewIamPolicyArgs struct {
	// The bucket of the resource Used to find the parent resource to bind the IAM policy to
	Bucket pulumi.StringInput
	// The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1. Used to find the parent resource to bind the IAM policy to. If not specified,
	// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
	// location is specified, it is taken from the provider configuration.
	Location pulumi.StringPtrInput
	// Used to find the parent resource to bind the IAM policy to
	Name pulumi.StringPtrInput
	// The parent of the resource. Used to find the parent resource to bind the IAM policy to
	Parent pulumi.StringInput
	// The policy data generated by
	// a `organizations.getIAMPolicy` data source.
	PolicyData pulumi.StringInput
}

func (LogViewIamPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logViewIamPolicyArgs)(nil)).Elem()
}

type LogViewIamPolicyInput interface {
	pulumi.Input

	ToLogViewIamPolicyOutput() LogViewIamPolicyOutput
	ToLogViewIamPolicyOutputWithContext(ctx context.Context) LogViewIamPolicyOutput
}

func (*LogViewIamPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**LogViewIamPolicy)(nil)).Elem()
}

func (i *LogViewIamPolicy) ToLogViewIamPolicyOutput() LogViewIamPolicyOutput {
	return i.ToLogViewIamPolicyOutputWithContext(context.Background())
}

func (i *LogViewIamPolicy) ToLogViewIamPolicyOutputWithContext(ctx context.Context) LogViewIamPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogViewIamPolicyOutput)
}

// LogViewIamPolicyArrayInput is an input type that accepts LogViewIamPolicyArray and LogViewIamPolicyArrayOutput values.
// You can construct a concrete instance of `LogViewIamPolicyArrayInput` via:
//
//	LogViewIamPolicyArray{ LogViewIamPolicyArgs{...} }
type LogViewIamPolicyArrayInput interface {
	pulumi.Input

	ToLogViewIamPolicyArrayOutput() LogViewIamPolicyArrayOutput
	ToLogViewIamPolicyArrayOutputWithContext(context.Context) LogViewIamPolicyArrayOutput
}

type LogViewIamPolicyArray []LogViewIamPolicyInput

func (LogViewIamPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogViewIamPolicy)(nil)).Elem()
}

func (i LogViewIamPolicyArray) ToLogViewIamPolicyArrayOutput() LogViewIamPolicyArrayOutput {
	return i.ToLogViewIamPolicyArrayOutputWithContext(context.Background())
}

func (i LogViewIamPolicyArray) ToLogViewIamPolicyArrayOutputWithContext(ctx context.Context) LogViewIamPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogViewIamPolicyArrayOutput)
}

// LogViewIamPolicyMapInput is an input type that accepts LogViewIamPolicyMap and LogViewIamPolicyMapOutput values.
// You can construct a concrete instance of `LogViewIamPolicyMapInput` via:
//
//	LogViewIamPolicyMap{ "key": LogViewIamPolicyArgs{...} }
type LogViewIamPolicyMapInput interface {
	pulumi.Input

	ToLogViewIamPolicyMapOutput() LogViewIamPolicyMapOutput
	ToLogViewIamPolicyMapOutputWithContext(context.Context) LogViewIamPolicyMapOutput
}

type LogViewIamPolicyMap map[string]LogViewIamPolicyInput

func (LogViewIamPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogViewIamPolicy)(nil)).Elem()
}

func (i LogViewIamPolicyMap) ToLogViewIamPolicyMapOutput() LogViewIamPolicyMapOutput {
	return i.ToLogViewIamPolicyMapOutputWithContext(context.Background())
}

func (i LogViewIamPolicyMap) ToLogViewIamPolicyMapOutputWithContext(ctx context.Context) LogViewIamPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogViewIamPolicyMapOutput)
}

type LogViewIamPolicyOutput struct{ *pulumi.OutputState }

func (LogViewIamPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogViewIamPolicy)(nil)).Elem()
}

func (o LogViewIamPolicyOutput) ToLogViewIamPolicyOutput() LogViewIamPolicyOutput {
	return o
}

func (o LogViewIamPolicyOutput) ToLogViewIamPolicyOutputWithContext(ctx context.Context) LogViewIamPolicyOutput {
	return o
}

// The bucket of the resource Used to find the parent resource to bind the IAM policy to
func (o LogViewIamPolicyOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *LogViewIamPolicy) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// (Computed) The etag of the IAM policy.
func (o LogViewIamPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *LogViewIamPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The location of the resource. The supported locations are: global, us-central1, us-east1, us-west1, asia-east1, europe-west1. Used to find the parent resource to bind the IAM policy to. If not specified,
// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
// location is specified, it is taken from the provider configuration.
func (o LogViewIamPolicyOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *LogViewIamPolicy) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Used to find the parent resource to bind the IAM policy to
func (o LogViewIamPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LogViewIamPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The parent of the resource. Used to find the parent resource to bind the IAM policy to
func (o LogViewIamPolicyOutput) Parent() pulumi.StringOutput {
	return o.ApplyT(func(v *LogViewIamPolicy) pulumi.StringOutput { return v.Parent }).(pulumi.StringOutput)
}

// The policy data generated by
// a `organizations.getIAMPolicy` data source.
func (o LogViewIamPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *LogViewIamPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
}

type LogViewIamPolicyArrayOutput struct{ *pulumi.OutputState }

func (LogViewIamPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogViewIamPolicy)(nil)).Elem()
}

func (o LogViewIamPolicyArrayOutput) ToLogViewIamPolicyArrayOutput() LogViewIamPolicyArrayOutput {
	return o
}

func (o LogViewIamPolicyArrayOutput) ToLogViewIamPolicyArrayOutputWithContext(ctx context.Context) LogViewIamPolicyArrayOutput {
	return o
}

func (o LogViewIamPolicyArrayOutput) Index(i pulumi.IntInput) LogViewIamPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogViewIamPolicy {
		return vs[0].([]*LogViewIamPolicy)[vs[1].(int)]
	}).(LogViewIamPolicyOutput)
}

type LogViewIamPolicyMapOutput struct{ *pulumi.OutputState }

func (LogViewIamPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogViewIamPolicy)(nil)).Elem()
}

func (o LogViewIamPolicyMapOutput) ToLogViewIamPolicyMapOutput() LogViewIamPolicyMapOutput {
	return o
}

func (o LogViewIamPolicyMapOutput) ToLogViewIamPolicyMapOutputWithContext(ctx context.Context) LogViewIamPolicyMapOutput {
	return o
}

func (o LogViewIamPolicyMapOutput) MapIndex(k pulumi.StringInput) LogViewIamPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogViewIamPolicy {
		return vs[0].(map[string]*LogViewIamPolicy)[vs[1].(string)]
	}).(LogViewIamPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogViewIamPolicyInput)(nil)).Elem(), &LogViewIamPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogViewIamPolicyArrayInput)(nil)).Elem(), LogViewIamPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogViewIamPolicyMapInput)(nil)).Elem(), LogViewIamPolicyMap{})
	pulumi.RegisterOutputType(LogViewIamPolicyOutput{})
	pulumi.RegisterOutputType(LogViewIamPolicyArrayOutput{})
	pulumi.RegisterOutputType(LogViewIamPolicyMapOutput{})
}
