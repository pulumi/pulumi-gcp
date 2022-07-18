// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bigquery

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Three different resources help you manage your IAM policy for BigQuery Connection Connection. Each of these resources serves a different use case:
//
// * `bigquery.ConnectionIamPolicy`: Authoritative. Sets the IAM policy for the connection and replaces any existing policy already attached.
// * `bigquery.ConnectionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the connection are preserved.
// * `bigquery.ConnectionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the connection are preserved.
//
// > **Note:** `bigquery.ConnectionIamPolicy` **cannot** be used in conjunction with `bigquery.ConnectionIamBinding` and `bigquery.ConnectionIamMember` or they will fight over what your policy should be.
//
// > **Note:** `bigquery.ConnectionIamBinding` resources **can be** used in conjunction with `bigquery.ConnectionIamMember` resources **only if** they do not grant privilege to the same role.
//
// ## google\_bigquery\_connection\_iam\_policy
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/bigquery"
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		admin, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
// 			Bindings: []organizations.GetIAMPolicyBinding{
// 				organizations.GetIAMPolicyBinding{
// 					Role: "roles/viewer",
// 					Members: []string{
// 						"user:jane@example.com",
// 					},
// 				},
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = bigquery.NewConnectionIamPolicy(ctx, "policy", &bigquery.ConnectionIamPolicyArgs{
// 			Project:      pulumi.Any(google_bigquery_connection.Connection.Project),
// 			Location:     pulumi.Any(google_bigquery_connection.Connection.Location),
// 			ConnectionId: pulumi.Any(google_bigquery_connection.Connection.Connection_id),
// 			PolicyData:   pulumi.String(admin.PolicyData),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## google\_bigquery\_connection\_iam\_binding
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/bigquery"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := bigquery.NewConnectionIamBinding(ctx, "binding", &bigquery.ConnectionIamBindingArgs{
// 			Project:      pulumi.Any(google_bigquery_connection.Connection.Project),
// 			Location:     pulumi.Any(google_bigquery_connection.Connection.Location),
// 			ConnectionId: pulumi.Any(google_bigquery_connection.Connection.Connection_id),
// 			Role:         pulumi.String("roles/viewer"),
// 			Members: pulumi.StringArray{
// 				pulumi.String("user:jane@example.com"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## google\_bigquery\_connection\_iam\_member
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/bigquery"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := bigquery.NewConnectionIamMember(ctx, "member", &bigquery.ConnectionIamMemberArgs{
// 			Project:      pulumi.Any(google_bigquery_connection.Connection.Project),
// 			Location:     pulumi.Any(google_bigquery_connection.Connection.Location),
// 			ConnectionId: pulumi.Any(google_bigquery_connection.Connection.Connection_id),
// 			Role:         pulumi.String("roles/viewer"),
// 			Member:       pulumi.String("user:jane@example.com"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/locations/{{location}}/connections/{{connection_id}} * {{project}}/{{location}}/{{connection_id}} * {{location}}/{{connection_id}} * {{connection_id}} Any variables not passed in the import command will be taken from the provider configuration. BigQuery Connection connection IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
//
// ```sh
//  $ pulumi import gcp:bigquery/connectionIamBinding:ConnectionIamBinding editor "projects/{{project}}/locations/{{location}}/connections/{{connection_id}} roles/viewer user:jane@example.com"
// ```
//
//  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
//
// ```sh
//  $ pulumi import gcp:bigquery/connectionIamBinding:ConnectionIamBinding editor "projects/{{project}}/locations/{{location}}/connections/{{connection_id}} roles/viewer"
// ```
//
//  IAM policy imports use the identifier of the resource in question, e.g.
//
// ```sh
//  $ pulumi import gcp:bigquery/connectionIamBinding:ConnectionIamBinding editor projects/{{project}}/locations/{{location}}/connections/{{connection_id}}
// ```
//
//  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
//
// full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
type ConnectionIamBinding struct {
	pulumi.CustomResourceState

	Condition ConnectionIamBindingConditionPtrOutput `pulumi:"condition"`
	// Optional connection id that should be assigned to the created connection.
	// Used to find the parent resource to bind the IAM policy to
	ConnectionId pulumi.StringOutput `pulumi:"connectionId"`
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The geographic location where the connection should reside.
	// Cloud SQL instance must be in the same location as the connection
	// with following exceptions: Cloud SQL us-central1 maps to BigQuery US, Cloud SQL europe-west1 maps to BigQuery EU.
	// Examples: US, EU, asia-northeast1, us-central1, europe-west1.
	// Spanner Connections same as spanner region
	// AWS allowed regions are aws-us-east-1
	// Azure allowed regions are azure-eastus2 Used to find the parent resource to bind the IAM policy to
	Location pulumi.StringOutput      `pulumi:"location"`
	Members  pulumi.StringArrayOutput `pulumi:"members"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role that should be applied. Only one
	// `bigquery.ConnectionIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewConnectionIamBinding registers a new resource with the given unique name, arguments, and options.
func NewConnectionIamBinding(ctx *pulumi.Context,
	name string, args *ConnectionIamBindingArgs, opts ...pulumi.ResourceOption) (*ConnectionIamBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectionId == nil {
		return nil, errors.New("invalid value for required argument 'ConnectionId'")
	}
	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	var resource ConnectionIamBinding
	err := ctx.RegisterResource("gcp:bigquery/connectionIamBinding:ConnectionIamBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnectionIamBinding gets an existing ConnectionIamBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnectionIamBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectionIamBindingState, opts ...pulumi.ResourceOption) (*ConnectionIamBinding, error) {
	var resource ConnectionIamBinding
	err := ctx.ReadResource("gcp:bigquery/connectionIamBinding:ConnectionIamBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ConnectionIamBinding resources.
type connectionIamBindingState struct {
	Condition *ConnectionIamBindingCondition `pulumi:"condition"`
	// Optional connection id that should be assigned to the created connection.
	// Used to find the parent resource to bind the IAM policy to
	ConnectionId *string `pulumi:"connectionId"`
	// (Computed) The etag of the IAM policy.
	Etag *string `pulumi:"etag"`
	// The geographic location where the connection should reside.
	// Cloud SQL instance must be in the same location as the connection
	// with following exceptions: Cloud SQL us-central1 maps to BigQuery US, Cloud SQL europe-west1 maps to BigQuery EU.
	// Examples: US, EU, asia-northeast1, us-central1, europe-west1.
	// Spanner Connections same as spanner region
	// AWS allowed regions are aws-us-east-1
	// Azure allowed regions are azure-eastus2 Used to find the parent resource to bind the IAM policy to
	Location *string  `pulumi:"location"`
	Members  []string `pulumi:"members"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `bigquery.ConnectionIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role *string `pulumi:"role"`
}

type ConnectionIamBindingState struct {
	Condition ConnectionIamBindingConditionPtrInput
	// Optional connection id that should be assigned to the created connection.
	// Used to find the parent resource to bind the IAM policy to
	ConnectionId pulumi.StringPtrInput
	// (Computed) The etag of the IAM policy.
	Etag pulumi.StringPtrInput
	// The geographic location where the connection should reside.
	// Cloud SQL instance must be in the same location as the connection
	// with following exceptions: Cloud SQL us-central1 maps to BigQuery US, Cloud SQL europe-west1 maps to BigQuery EU.
	// Examples: US, EU, asia-northeast1, us-central1, europe-west1.
	// Spanner Connections same as spanner region
	// AWS allowed regions are aws-us-east-1
	// Azure allowed regions are azure-eastus2 Used to find the parent resource to bind the IAM policy to
	Location pulumi.StringPtrInput
	Members  pulumi.StringArrayInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `bigquery.ConnectionIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringPtrInput
}

func (ConnectionIamBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionIamBindingState)(nil)).Elem()
}

type connectionIamBindingArgs struct {
	Condition *ConnectionIamBindingCondition `pulumi:"condition"`
	// Optional connection id that should be assigned to the created connection.
	// Used to find the parent resource to bind the IAM policy to
	ConnectionId string `pulumi:"connectionId"`
	// The geographic location where the connection should reside.
	// Cloud SQL instance must be in the same location as the connection
	// with following exceptions: Cloud SQL us-central1 maps to BigQuery US, Cloud SQL europe-west1 maps to BigQuery EU.
	// Examples: US, EU, asia-northeast1, us-central1, europe-west1.
	// Spanner Connections same as spanner region
	// AWS allowed regions are aws-us-east-1
	// Azure allowed regions are azure-eastus2 Used to find the parent resource to bind the IAM policy to
	Location *string  `pulumi:"location"`
	Members  []string `pulumi:"members"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project *string `pulumi:"project"`
	// The role that should be applied. Only one
	// `bigquery.ConnectionIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role string `pulumi:"role"`
}

// The set of arguments for constructing a ConnectionIamBinding resource.
type ConnectionIamBindingArgs struct {
	Condition ConnectionIamBindingConditionPtrInput
	// Optional connection id that should be assigned to the created connection.
	// Used to find the parent resource to bind the IAM policy to
	ConnectionId pulumi.StringInput
	// The geographic location where the connection should reside.
	// Cloud SQL instance must be in the same location as the connection
	// with following exceptions: Cloud SQL us-central1 maps to BigQuery US, Cloud SQL europe-west1 maps to BigQuery EU.
	// Examples: US, EU, asia-northeast1, us-central1, europe-west1.
	// Spanner Connections same as spanner region
	// AWS allowed regions are aws-us-east-1
	// Azure allowed regions are azure-eastus2 Used to find the parent resource to bind the IAM policy to
	Location pulumi.StringPtrInput
	Members  pulumi.StringArrayInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
	Project pulumi.StringPtrInput
	// The role that should be applied. Only one
	// `bigquery.ConnectionIamBinding` can be used per role. Note that custom roles must be of the format
	// `[projects|organizations]/{parent-name}/roles/{role-name}`.
	Role pulumi.StringInput
}

func (ConnectionIamBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionIamBindingArgs)(nil)).Elem()
}

type ConnectionIamBindingInput interface {
	pulumi.Input

	ToConnectionIamBindingOutput() ConnectionIamBindingOutput
	ToConnectionIamBindingOutputWithContext(ctx context.Context) ConnectionIamBindingOutput
}

func (*ConnectionIamBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectionIamBinding)(nil)).Elem()
}

func (i *ConnectionIamBinding) ToConnectionIamBindingOutput() ConnectionIamBindingOutput {
	return i.ToConnectionIamBindingOutputWithContext(context.Background())
}

func (i *ConnectionIamBinding) ToConnectionIamBindingOutputWithContext(ctx context.Context) ConnectionIamBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionIamBindingOutput)
}

// ConnectionIamBindingArrayInput is an input type that accepts ConnectionIamBindingArray and ConnectionIamBindingArrayOutput values.
// You can construct a concrete instance of `ConnectionIamBindingArrayInput` via:
//
//          ConnectionIamBindingArray{ ConnectionIamBindingArgs{...} }
type ConnectionIamBindingArrayInput interface {
	pulumi.Input

	ToConnectionIamBindingArrayOutput() ConnectionIamBindingArrayOutput
	ToConnectionIamBindingArrayOutputWithContext(context.Context) ConnectionIamBindingArrayOutput
}

type ConnectionIamBindingArray []ConnectionIamBindingInput

func (ConnectionIamBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectionIamBinding)(nil)).Elem()
}

func (i ConnectionIamBindingArray) ToConnectionIamBindingArrayOutput() ConnectionIamBindingArrayOutput {
	return i.ToConnectionIamBindingArrayOutputWithContext(context.Background())
}

func (i ConnectionIamBindingArray) ToConnectionIamBindingArrayOutputWithContext(ctx context.Context) ConnectionIamBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionIamBindingArrayOutput)
}

// ConnectionIamBindingMapInput is an input type that accepts ConnectionIamBindingMap and ConnectionIamBindingMapOutput values.
// You can construct a concrete instance of `ConnectionIamBindingMapInput` via:
//
//          ConnectionIamBindingMap{ "key": ConnectionIamBindingArgs{...} }
type ConnectionIamBindingMapInput interface {
	pulumi.Input

	ToConnectionIamBindingMapOutput() ConnectionIamBindingMapOutput
	ToConnectionIamBindingMapOutputWithContext(context.Context) ConnectionIamBindingMapOutput
}

type ConnectionIamBindingMap map[string]ConnectionIamBindingInput

func (ConnectionIamBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectionIamBinding)(nil)).Elem()
}

func (i ConnectionIamBindingMap) ToConnectionIamBindingMapOutput() ConnectionIamBindingMapOutput {
	return i.ToConnectionIamBindingMapOutputWithContext(context.Background())
}

func (i ConnectionIamBindingMap) ToConnectionIamBindingMapOutputWithContext(ctx context.Context) ConnectionIamBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionIamBindingMapOutput)
}

type ConnectionIamBindingOutput struct{ *pulumi.OutputState }

func (ConnectionIamBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectionIamBinding)(nil)).Elem()
}

func (o ConnectionIamBindingOutput) ToConnectionIamBindingOutput() ConnectionIamBindingOutput {
	return o
}

func (o ConnectionIamBindingOutput) ToConnectionIamBindingOutputWithContext(ctx context.Context) ConnectionIamBindingOutput {
	return o
}

func (o ConnectionIamBindingOutput) Condition() ConnectionIamBindingConditionPtrOutput {
	return o.ApplyT(func(v *ConnectionIamBinding) ConnectionIamBindingConditionPtrOutput { return v.Condition }).(ConnectionIamBindingConditionPtrOutput)
}

// Optional connection id that should be assigned to the created connection.
// Used to find the parent resource to bind the IAM policy to
func (o ConnectionIamBindingOutput) ConnectionId() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionIamBinding) pulumi.StringOutput { return v.ConnectionId }).(pulumi.StringOutput)
}

// (Computed) The etag of the IAM policy.
func (o ConnectionIamBindingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionIamBinding) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The geographic location where the connection should reside.
// Cloud SQL instance must be in the same location as the connection
// with following exceptions: Cloud SQL us-central1 maps to BigQuery US, Cloud SQL europe-west1 maps to BigQuery EU.
// Examples: US, EU, asia-northeast1, us-central1, europe-west1.
// Spanner Connections same as spanner region
// AWS allowed regions are aws-us-east-1
// Azure allowed regions are azure-eastus2 Used to find the parent resource to bind the IAM policy to
func (o ConnectionIamBindingOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionIamBinding) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

func (o ConnectionIamBindingOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ConnectionIamBinding) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
func (o ConnectionIamBindingOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionIamBinding) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The role that should be applied. Only one
// `bigquery.ConnectionIamBinding` can be used per role. Note that custom roles must be of the format
// `[projects|organizations]/{parent-name}/roles/{role-name}`.
func (o ConnectionIamBindingOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionIamBinding) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type ConnectionIamBindingArrayOutput struct{ *pulumi.OutputState }

func (ConnectionIamBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectionIamBinding)(nil)).Elem()
}

func (o ConnectionIamBindingArrayOutput) ToConnectionIamBindingArrayOutput() ConnectionIamBindingArrayOutput {
	return o
}

func (o ConnectionIamBindingArrayOutput) ToConnectionIamBindingArrayOutputWithContext(ctx context.Context) ConnectionIamBindingArrayOutput {
	return o
}

func (o ConnectionIamBindingArrayOutput) Index(i pulumi.IntInput) ConnectionIamBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ConnectionIamBinding {
		return vs[0].([]*ConnectionIamBinding)[vs[1].(int)]
	}).(ConnectionIamBindingOutput)
}

type ConnectionIamBindingMapOutput struct{ *pulumi.OutputState }

func (ConnectionIamBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectionIamBinding)(nil)).Elem()
}

func (o ConnectionIamBindingMapOutput) ToConnectionIamBindingMapOutput() ConnectionIamBindingMapOutput {
	return o
}

func (o ConnectionIamBindingMapOutput) ToConnectionIamBindingMapOutputWithContext(ctx context.Context) ConnectionIamBindingMapOutput {
	return o
}

func (o ConnectionIamBindingMapOutput) MapIndex(k pulumi.StringInput) ConnectionIamBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ConnectionIamBinding {
		return vs[0].(map[string]*ConnectionIamBinding)[vs[1].(string)]
	}).(ConnectionIamBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionIamBindingInput)(nil)).Elem(), &ConnectionIamBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionIamBindingArrayInput)(nil)).Elem(), ConnectionIamBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionIamBindingMapInput)(nil)).Elem(), ConnectionIamBindingMap{})
	pulumi.RegisterOutputType(ConnectionIamBindingOutput{})
	pulumi.RegisterOutputType(ConnectionIamBindingArrayOutput{})
	pulumi.RegisterOutputType(ConnectionIamBindingMapOutput{})
}