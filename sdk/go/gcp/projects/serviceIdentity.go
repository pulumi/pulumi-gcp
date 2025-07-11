// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package projects

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Generate service identity for a service.
//
// > **Note:** Once created, this resource cannot be updated or destroyed. These
// actions are a no-op.
//
// > **Note:** This resource can be used to retrieve the emails of the [Google-managed service accounts](https://cloud.google.com/iam/docs/service-agents)
// of the APIs that Google has configured with a Service Identity. You can run `gcloud beta services identity create --service SERVICE_NAME.googleapis.com` to
// verify if an API supports this.
//
// To get more information about Service Identity, see:
//
// * [API documentation](https://cloud.google.com/service-usage/docs/reference/rest/v1beta1/services/generateServiceIdentity)
//
// ## Example Usage
//
// ### Service Identity Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/projects"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			project, err := organizations.LookupProject(ctx, &organizations.LookupProjectArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			hcSa, err := projects.NewServiceIdentity(ctx, "hc_sa", &projects.ServiceIdentityArgs{
//				Project: pulumi.String(project.ProjectId),
//				Service: pulumi.String("healthcare.googleapis.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = projects.NewIAMMember(ctx, "hc_sa_bq_jobuser", &projects.IAMMemberArgs{
//				Project: pulumi.String(project.ProjectId),
//				Role:    pulumi.String("roles/bigquery.jobUser"),
//				Member:  hcSa.Member,
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
// This resource does not support import.
type ServiceIdentity struct {
	pulumi.CustomResourceState

	// The email address of the Google managed service account.
	Email pulumi.StringOutput `pulumi:"email"`
	// The Identity of the Google managed service account in the form 'serviceAccount:{email}'. This value is often used to refer to the service account in order to grant IAM permissions.
	Member pulumi.StringOutput `pulumi:"member"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The service to generate identity for.
	//
	// ***
	Service pulumi.StringOutput `pulumi:"service"`
}

// NewServiceIdentity registers a new resource with the given unique name, arguments, and options.
func NewServiceIdentity(ctx *pulumi.Context,
	name string, args *ServiceIdentityArgs, opts ...pulumi.ResourceOption) (*ServiceIdentity, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Service == nil {
		return nil, errors.New("invalid value for required argument 'Service'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceIdentity
	err := ctx.RegisterResource("gcp:projects/serviceIdentity:ServiceIdentity", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceIdentity gets an existing ServiceIdentity resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceIdentity(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceIdentityState, opts ...pulumi.ResourceOption) (*ServiceIdentity, error) {
	var resource ServiceIdentity
	err := ctx.ReadResource("gcp:projects/serviceIdentity:ServiceIdentity", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceIdentity resources.
type serviceIdentityState struct {
	// The email address of the Google managed service account.
	Email *string `pulumi:"email"`
	// The Identity of the Google managed service account in the form 'serviceAccount:{email}'. This value is often used to refer to the service account in order to grant IAM permissions.
	Member *string `pulumi:"member"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The service to generate identity for.
	//
	// ***
	Service *string `pulumi:"service"`
}

type ServiceIdentityState struct {
	// The email address of the Google managed service account.
	Email pulumi.StringPtrInput
	// The Identity of the Google managed service account in the form 'serviceAccount:{email}'. This value is often used to refer to the service account in order to grant IAM permissions.
	Member pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The service to generate identity for.
	//
	// ***
	Service pulumi.StringPtrInput
}

func (ServiceIdentityState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceIdentityState)(nil)).Elem()
}

type serviceIdentityArgs struct {
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The service to generate identity for.
	//
	// ***
	Service string `pulumi:"service"`
}

// The set of arguments for constructing a ServiceIdentity resource.
type ServiceIdentityArgs struct {
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The service to generate identity for.
	//
	// ***
	Service pulumi.StringInput
}

func (ServiceIdentityArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceIdentityArgs)(nil)).Elem()
}

type ServiceIdentityInput interface {
	pulumi.Input

	ToServiceIdentityOutput() ServiceIdentityOutput
	ToServiceIdentityOutputWithContext(ctx context.Context) ServiceIdentityOutput
}

func (*ServiceIdentity) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceIdentity)(nil)).Elem()
}

func (i *ServiceIdentity) ToServiceIdentityOutput() ServiceIdentityOutput {
	return i.ToServiceIdentityOutputWithContext(context.Background())
}

func (i *ServiceIdentity) ToServiceIdentityOutputWithContext(ctx context.Context) ServiceIdentityOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIdentityOutput)
}

// ServiceIdentityArrayInput is an input type that accepts ServiceIdentityArray and ServiceIdentityArrayOutput values.
// You can construct a concrete instance of `ServiceIdentityArrayInput` via:
//
//	ServiceIdentityArray{ ServiceIdentityArgs{...} }
type ServiceIdentityArrayInput interface {
	pulumi.Input

	ToServiceIdentityArrayOutput() ServiceIdentityArrayOutput
	ToServiceIdentityArrayOutputWithContext(context.Context) ServiceIdentityArrayOutput
}

type ServiceIdentityArray []ServiceIdentityInput

func (ServiceIdentityArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceIdentity)(nil)).Elem()
}

func (i ServiceIdentityArray) ToServiceIdentityArrayOutput() ServiceIdentityArrayOutput {
	return i.ToServiceIdentityArrayOutputWithContext(context.Background())
}

func (i ServiceIdentityArray) ToServiceIdentityArrayOutputWithContext(ctx context.Context) ServiceIdentityArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIdentityArrayOutput)
}

// ServiceIdentityMapInput is an input type that accepts ServiceIdentityMap and ServiceIdentityMapOutput values.
// You can construct a concrete instance of `ServiceIdentityMapInput` via:
//
//	ServiceIdentityMap{ "key": ServiceIdentityArgs{...} }
type ServiceIdentityMapInput interface {
	pulumi.Input

	ToServiceIdentityMapOutput() ServiceIdentityMapOutput
	ToServiceIdentityMapOutputWithContext(context.Context) ServiceIdentityMapOutput
}

type ServiceIdentityMap map[string]ServiceIdentityInput

func (ServiceIdentityMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceIdentity)(nil)).Elem()
}

func (i ServiceIdentityMap) ToServiceIdentityMapOutput() ServiceIdentityMapOutput {
	return i.ToServiceIdentityMapOutputWithContext(context.Background())
}

func (i ServiceIdentityMap) ToServiceIdentityMapOutputWithContext(ctx context.Context) ServiceIdentityMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIdentityMapOutput)
}

type ServiceIdentityOutput struct{ *pulumi.OutputState }

func (ServiceIdentityOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceIdentity)(nil)).Elem()
}

func (o ServiceIdentityOutput) ToServiceIdentityOutput() ServiceIdentityOutput {
	return o
}

func (o ServiceIdentityOutput) ToServiceIdentityOutputWithContext(ctx context.Context) ServiceIdentityOutput {
	return o
}

// The email address of the Google managed service account.
func (o ServiceIdentityOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIdentity) pulumi.StringOutput { return v.Email }).(pulumi.StringOutput)
}

// The Identity of the Google managed service account in the form 'serviceAccount:{email}'. This value is often used to refer to the service account in order to grant IAM permissions.
func (o ServiceIdentityOutput) Member() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIdentity) pulumi.StringOutput { return v.Member }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o ServiceIdentityOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIdentity) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The service to generate identity for.
//
// ***
func (o ServiceIdentityOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIdentity) pulumi.StringOutput { return v.Service }).(pulumi.StringOutput)
}

type ServiceIdentityArrayOutput struct{ *pulumi.OutputState }

func (ServiceIdentityArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceIdentity)(nil)).Elem()
}

func (o ServiceIdentityArrayOutput) ToServiceIdentityArrayOutput() ServiceIdentityArrayOutput {
	return o
}

func (o ServiceIdentityArrayOutput) ToServiceIdentityArrayOutputWithContext(ctx context.Context) ServiceIdentityArrayOutput {
	return o
}

func (o ServiceIdentityArrayOutput) Index(i pulumi.IntInput) ServiceIdentityOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceIdentity {
		return vs[0].([]*ServiceIdentity)[vs[1].(int)]
	}).(ServiceIdentityOutput)
}

type ServiceIdentityMapOutput struct{ *pulumi.OutputState }

func (ServiceIdentityMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceIdentity)(nil)).Elem()
}

func (o ServiceIdentityMapOutput) ToServiceIdentityMapOutput() ServiceIdentityMapOutput {
	return o
}

func (o ServiceIdentityMapOutput) ToServiceIdentityMapOutputWithContext(ctx context.Context) ServiceIdentityMapOutput {
	return o
}

func (o ServiceIdentityMapOutput) MapIndex(k pulumi.StringInput) ServiceIdentityOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceIdentity {
		return vs[0].(map[string]*ServiceIdentity)[vs[1].(string)]
	}).(ServiceIdentityOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceIdentityInput)(nil)).Elem(), &ServiceIdentity{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceIdentityArrayInput)(nil)).Elem(), ServiceIdentityArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceIdentityMapInput)(nil)).Elem(), ServiceIdentityMap{})
	pulumi.RegisterOutputType(ServiceIdentityOutput{})
	pulumi.RegisterOutputType(ServiceIdentityArrayOutput{})
	pulumi.RegisterOutputType(ServiceIdentityMapOutput{})
}
