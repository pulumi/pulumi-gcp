// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package beyondcorp

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A BeyondCorp AppConnection resource represents a BeyondCorp protected AppConnection to a remote application.
// It creates all the necessary GCP components needed for creating a BeyondCorp protected AppConnection.
// Multiple connectors can be authorised for a single AppConnection.
//
// To get more information about AppConnection, see:
//
// * [API documentation](https://cloud.google.com/beyondcorp/docs/reference/rest#rest-resource:-v1.projects.locations.appconnections)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/beyondcorp-enterprise/docs/enable-app-connector)
//
// ## Example Usage
// ### Beyondcorp App Connection Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/beyondcorp"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/serviceAccount"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			serviceAccount, err := serviceAccount.NewAccount(ctx, "serviceAccount", &serviceAccount.AccountArgs{
//				AccountId:   pulumi.String("my-account"),
//				DisplayName: pulumi.String("Test Service Account"),
//			})
//			if err != nil {
//				return err
//			}
//			appConnector, err := beyondcorp.NewAppConnector(ctx, "appConnector", &beyondcorp.AppConnectorArgs{
//				PrincipalInfo: &beyondcorp.AppConnectorPrincipalInfoArgs{
//					ServiceAccount: &beyondcorp.AppConnectorPrincipalInfoServiceAccountArgs{
//						Email: serviceAccount.Email,
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = beyondcorp.NewAppConnection(ctx, "appConnection", &beyondcorp.AppConnectionArgs{
//				Type: pulumi.String("TCP_PROXY"),
//				ApplicationEndpoint: &beyondcorp.AppConnectionApplicationEndpointArgs{
//					Host: pulumi.String("foo-host"),
//					Port: pulumi.Int(8080),
//				},
//				Connectors: pulumi.StringArray{
//					appConnector.ID(),
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
// # AppConnection can be imported using any of these accepted formats
//
// ```sh
//
//	$ pulumi import gcp:beyondcorp/appConnection:AppConnection default projects/{{project}}/locations/{{region}}/appConnections/{{name}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:beyondcorp/appConnection:AppConnection default {{project}}/{{region}}/{{name}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:beyondcorp/appConnection:AppConnection default {{region}}/{{name}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:beyondcorp/appConnection:AppConnection default {{name}}
//
// ```
type AppConnection struct {
	pulumi.CustomResourceState

	// Address of the remote application endpoint for the BeyondCorp AppConnection.
	// Structure is documented below.
	ApplicationEndpoint AppConnectionApplicationEndpointOutput `pulumi:"applicationEndpoint"`
	// List of AppConnectors that are authorised to be associated with this AppConnection
	Connectors pulumi.StringArrayOutput `pulumi:"connectors"`
	// An arbitrary user-provided name for the AppConnection.
	DisplayName pulumi.StringPtrOutput `pulumi:"displayName"`
	// Gateway used by the AppConnection.
	// Structure is documented below.
	Gateway AppConnectionGatewayOutput `pulumi:"gateway"`
	// Resource labels to represent user provided metadata.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// ID of the AppConnection.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The region of the AppConnection.
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// The type of network connectivity used by the AppConnection. Refer to
	// https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#type
	// for a list of possible values.
	// (Optional)
	// The type of hosting used by the gateway. Refer to
	// https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
	// for a list of possible values.
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewAppConnection registers a new resource with the given unique name, arguments, and options.
func NewAppConnection(ctx *pulumi.Context,
	name string, args *AppConnectionArgs, opts ...pulumi.ResourceOption) (*AppConnection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApplicationEndpoint == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationEndpoint'")
	}
	var resource AppConnection
	err := ctx.RegisterResource("gcp:beyondcorp/appConnection:AppConnection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppConnection gets an existing AppConnection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppConnectionState, opts ...pulumi.ResourceOption) (*AppConnection, error) {
	var resource AppConnection
	err := ctx.ReadResource("gcp:beyondcorp/appConnection:AppConnection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppConnection resources.
type appConnectionState struct {
	// Address of the remote application endpoint for the BeyondCorp AppConnection.
	// Structure is documented below.
	ApplicationEndpoint *AppConnectionApplicationEndpoint `pulumi:"applicationEndpoint"`
	// List of AppConnectors that are authorised to be associated with this AppConnection
	Connectors []string `pulumi:"connectors"`
	// An arbitrary user-provided name for the AppConnection.
	DisplayName *string `pulumi:"displayName"`
	// Gateway used by the AppConnection.
	// Structure is documented below.
	Gateway *AppConnectionGateway `pulumi:"gateway"`
	// Resource labels to represent user provided metadata.
	Labels map[string]string `pulumi:"labels"`
	// ID of the AppConnection.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The region of the AppConnection.
	Region *string `pulumi:"region"`
	// The type of network connectivity used by the AppConnection. Refer to
	// https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#type
	// for a list of possible values.
	// (Optional)
	// The type of hosting used by the gateway. Refer to
	// https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
	// for a list of possible values.
	Type *string `pulumi:"type"`
}

type AppConnectionState struct {
	// Address of the remote application endpoint for the BeyondCorp AppConnection.
	// Structure is documented below.
	ApplicationEndpoint AppConnectionApplicationEndpointPtrInput
	// List of AppConnectors that are authorised to be associated with this AppConnection
	Connectors pulumi.StringArrayInput
	// An arbitrary user-provided name for the AppConnection.
	DisplayName pulumi.StringPtrInput
	// Gateway used by the AppConnection.
	// Structure is documented below.
	Gateway AppConnectionGatewayPtrInput
	// Resource labels to represent user provided metadata.
	Labels pulumi.StringMapInput
	// ID of the AppConnection.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The region of the AppConnection.
	Region pulumi.StringPtrInput
	// The type of network connectivity used by the AppConnection. Refer to
	// https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#type
	// for a list of possible values.
	// (Optional)
	// The type of hosting used by the gateway. Refer to
	// https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
	// for a list of possible values.
	Type pulumi.StringPtrInput
}

func (AppConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*appConnectionState)(nil)).Elem()
}

type appConnectionArgs struct {
	// Address of the remote application endpoint for the BeyondCorp AppConnection.
	// Structure is documented below.
	ApplicationEndpoint AppConnectionApplicationEndpoint `pulumi:"applicationEndpoint"`
	// List of AppConnectors that are authorised to be associated with this AppConnection
	Connectors []string `pulumi:"connectors"`
	// An arbitrary user-provided name for the AppConnection.
	DisplayName *string `pulumi:"displayName"`
	// Gateway used by the AppConnection.
	// Structure is documented below.
	Gateway *AppConnectionGateway `pulumi:"gateway"`
	// Resource labels to represent user provided metadata.
	Labels map[string]string `pulumi:"labels"`
	// ID of the AppConnection.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The region of the AppConnection.
	Region *string `pulumi:"region"`
	// The type of network connectivity used by the AppConnection. Refer to
	// https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#type
	// for a list of possible values.
	// (Optional)
	// The type of hosting used by the gateway. Refer to
	// https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
	// for a list of possible values.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a AppConnection resource.
type AppConnectionArgs struct {
	// Address of the remote application endpoint for the BeyondCorp AppConnection.
	// Structure is documented below.
	ApplicationEndpoint AppConnectionApplicationEndpointInput
	// List of AppConnectors that are authorised to be associated with this AppConnection
	Connectors pulumi.StringArrayInput
	// An arbitrary user-provided name for the AppConnection.
	DisplayName pulumi.StringPtrInput
	// Gateway used by the AppConnection.
	// Structure is documented below.
	Gateway AppConnectionGatewayPtrInput
	// Resource labels to represent user provided metadata.
	Labels pulumi.StringMapInput
	// ID of the AppConnection.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The region of the AppConnection.
	Region pulumi.StringPtrInput
	// The type of network connectivity used by the AppConnection. Refer to
	// https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#type
	// for a list of possible values.
	// (Optional)
	// The type of hosting used by the gateway. Refer to
	// https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
	// for a list of possible values.
	Type pulumi.StringPtrInput
}

func (AppConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appConnectionArgs)(nil)).Elem()
}

type AppConnectionInput interface {
	pulumi.Input

	ToAppConnectionOutput() AppConnectionOutput
	ToAppConnectionOutputWithContext(ctx context.Context) AppConnectionOutput
}

func (*AppConnection) ElementType() reflect.Type {
	return reflect.TypeOf((**AppConnection)(nil)).Elem()
}

func (i *AppConnection) ToAppConnectionOutput() AppConnectionOutput {
	return i.ToAppConnectionOutputWithContext(context.Background())
}

func (i *AppConnection) ToAppConnectionOutputWithContext(ctx context.Context) AppConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppConnectionOutput)
}

// AppConnectionArrayInput is an input type that accepts AppConnectionArray and AppConnectionArrayOutput values.
// You can construct a concrete instance of `AppConnectionArrayInput` via:
//
//	AppConnectionArray{ AppConnectionArgs{...} }
type AppConnectionArrayInput interface {
	pulumi.Input

	ToAppConnectionArrayOutput() AppConnectionArrayOutput
	ToAppConnectionArrayOutputWithContext(context.Context) AppConnectionArrayOutput
}

type AppConnectionArray []AppConnectionInput

func (AppConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppConnection)(nil)).Elem()
}

func (i AppConnectionArray) ToAppConnectionArrayOutput() AppConnectionArrayOutput {
	return i.ToAppConnectionArrayOutputWithContext(context.Background())
}

func (i AppConnectionArray) ToAppConnectionArrayOutputWithContext(ctx context.Context) AppConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppConnectionArrayOutput)
}

// AppConnectionMapInput is an input type that accepts AppConnectionMap and AppConnectionMapOutput values.
// You can construct a concrete instance of `AppConnectionMapInput` via:
//
//	AppConnectionMap{ "key": AppConnectionArgs{...} }
type AppConnectionMapInput interface {
	pulumi.Input

	ToAppConnectionMapOutput() AppConnectionMapOutput
	ToAppConnectionMapOutputWithContext(context.Context) AppConnectionMapOutput
}

type AppConnectionMap map[string]AppConnectionInput

func (AppConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppConnection)(nil)).Elem()
}

func (i AppConnectionMap) ToAppConnectionMapOutput() AppConnectionMapOutput {
	return i.ToAppConnectionMapOutputWithContext(context.Background())
}

func (i AppConnectionMap) ToAppConnectionMapOutputWithContext(ctx context.Context) AppConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppConnectionMapOutput)
}

type AppConnectionOutput struct{ *pulumi.OutputState }

func (AppConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppConnection)(nil)).Elem()
}

func (o AppConnectionOutput) ToAppConnectionOutput() AppConnectionOutput {
	return o
}

func (o AppConnectionOutput) ToAppConnectionOutputWithContext(ctx context.Context) AppConnectionOutput {
	return o
}

// Address of the remote application endpoint for the BeyondCorp AppConnection.
// Structure is documented below.
func (o AppConnectionOutput) ApplicationEndpoint() AppConnectionApplicationEndpointOutput {
	return o.ApplyT(func(v *AppConnection) AppConnectionApplicationEndpointOutput { return v.ApplicationEndpoint }).(AppConnectionApplicationEndpointOutput)
}

// List of AppConnectors that are authorised to be associated with this AppConnection
func (o AppConnectionOutput) Connectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AppConnection) pulumi.StringArrayOutput { return v.Connectors }).(pulumi.StringArrayOutput)
}

// An arbitrary user-provided name for the AppConnection.
func (o AppConnectionOutput) DisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AppConnection) pulumi.StringPtrOutput { return v.DisplayName }).(pulumi.StringPtrOutput)
}

// Gateway used by the AppConnection.
// Structure is documented below.
func (o AppConnectionOutput) Gateway() AppConnectionGatewayOutput {
	return o.ApplyT(func(v *AppConnection) AppConnectionGatewayOutput { return v.Gateway }).(AppConnectionGatewayOutput)
}

// Resource labels to represent user provided metadata.
func (o AppConnectionOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AppConnection) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// ID of the AppConnection.
func (o AppConnectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AppConnection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o AppConnectionOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *AppConnection) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The region of the AppConnection.
func (o AppConnectionOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AppConnection) pulumi.StringPtrOutput { return v.Region }).(pulumi.StringPtrOutput)
}

// The type of network connectivity used by the AppConnection. Refer to
// https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#type
// for a list of possible values.
// (Optional)
// The type of hosting used by the gateway. Refer to
// https://cloud.google.com/beyondcorp/docs/reference/rest/v1/projects.locations.appConnections#Type_1
// for a list of possible values.
func (o AppConnectionOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AppConnection) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

type AppConnectionArrayOutput struct{ *pulumi.OutputState }

func (AppConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppConnection)(nil)).Elem()
}

func (o AppConnectionArrayOutput) ToAppConnectionArrayOutput() AppConnectionArrayOutput {
	return o
}

func (o AppConnectionArrayOutput) ToAppConnectionArrayOutputWithContext(ctx context.Context) AppConnectionArrayOutput {
	return o
}

func (o AppConnectionArrayOutput) Index(i pulumi.IntInput) AppConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AppConnection {
		return vs[0].([]*AppConnection)[vs[1].(int)]
	}).(AppConnectionOutput)
}

type AppConnectionMapOutput struct{ *pulumi.OutputState }

func (AppConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppConnection)(nil)).Elem()
}

func (o AppConnectionMapOutput) ToAppConnectionMapOutput() AppConnectionMapOutput {
	return o
}

func (o AppConnectionMapOutput) ToAppConnectionMapOutputWithContext(ctx context.Context) AppConnectionMapOutput {
	return o
}

func (o AppConnectionMapOutput) MapIndex(k pulumi.StringInput) AppConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AppConnection {
		return vs[0].(map[string]*AppConnection)[vs[1].(string)]
	}).(AppConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AppConnectionInput)(nil)).Elem(), &AppConnection{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppConnectionArrayInput)(nil)).Elem(), AppConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppConnectionMapInput)(nil)).Elem(), AppConnectionMap{})
	pulumi.RegisterOutputType(AppConnectionOutput{})
	pulumi.RegisterOutputType(AppConnectionArrayOutput{})
	pulumi.RegisterOutputType(AppConnectionMapOutput{})
}