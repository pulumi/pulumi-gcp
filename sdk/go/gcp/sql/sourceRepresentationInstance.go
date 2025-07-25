// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sql

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A source representation instance is a Cloud SQL instance that represents
// the source database server to the Cloud SQL replica. It is visible in the
// Cloud Console and appears the same as a regular Cloud SQL instance, but it
// contains no data, requires no configuration or maintenance, and does not
// affect billing. You cannot update the source representation instance.
//
// ## Example Usage
//
// ### Sql Source Representation Instance Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/sql"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sql.NewSourceRepresentationInstance(ctx, "instance", &sql.SourceRepresentationInstanceArgs{
//				Name:            pulumi.String("my-instance"),
//				Region:          pulumi.String("us-central1"),
//				DatabaseVersion: pulumi.String("MYSQL_8_0"),
//				Host:            pulumi.String("10.20.30.40"),
//				Port:            pulumi.Int(3306),
//				Username:        pulumi.String("some-user"),
//				Password:        pulumi.String("password-for-the-user"),
//				DumpFilePath:    pulumi.String("gs://replica-bucket/source-database.sql.gz"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Sql Source Representation Instance Postgres
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/sql"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sql.NewSourceRepresentationInstance(ctx, "instance", &sql.SourceRepresentationInstanceArgs{
//				Name:            pulumi.String("my-instance"),
//				Region:          pulumi.String("us-central1"),
//				DatabaseVersion: pulumi.String("POSTGRES_9_6"),
//				Host:            pulumi.String("10.20.30.40"),
//				Port:            pulumi.Int(3306),
//				Username:        pulumi.String("some-user"),
//				Password:        pulumi.String("password-for-the-user"),
//				DumpFilePath:    pulumi.String("gs://replica-bucket/source-database.sql.gz"),
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
// SourceRepresentationInstance can be imported using any of these accepted formats:
//
// * `projects/{{project}}/instances/{{name}}`
//
// * `{{project}}/{{name}}`
//
// * `{{name}}`
//
// When using the `pulumi import` command, SourceRepresentationInstance can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:sql/sourceRepresentationInstance:SourceRepresentationInstance default projects/{{project}}/instances/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:sql/sourceRepresentationInstance:SourceRepresentationInstance default {{project}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:sql/sourceRepresentationInstance:SourceRepresentationInstance default {{name}}
// ```
type SourceRepresentationInstance struct {
	pulumi.CustomResourceState

	// The CA certificate on the external server. Include only if SSL/TLS is used on the external server.
	CaCertificate pulumi.StringPtrOutput `pulumi:"caCertificate"`
	// The client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
	ClientCertificate pulumi.StringPtrOutput `pulumi:"clientCertificate"`
	// The private key file for the client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
	ClientKey pulumi.StringPtrOutput `pulumi:"clientKey"`
	// The MySQL, PostgreSQL or SQL Server (beta) version to use. Supported values include MYSQL_5_6, MYSQL_5_7, MYSQL_8_0, MYSQL_8_4, POSTGRES_9_6, POSTGRES_10, POSTGRES_11, POSTGRES_12, POSTGRES_13, POSTGRES_14, POSTGRES_15, POSTGRES_16, POSTGRES_17. Database Version Policies includes an up-to-date reference of supported versions.
	DatabaseVersion pulumi.StringOutput `pulumi:"databaseVersion"`
	// A file in the bucket that contains the data from the external server.
	DumpFilePath pulumi.StringPtrOutput `pulumi:"dumpFilePath"`
	// The IPv4 address and port for the external server, or the the DNS address for the external server. If the external server is hosted on Cloud SQL, the port is 5432.
	Host pulumi.StringOutput `pulumi:"host"`
	// The name of the source representation instance. Use any valid Cloud SQL instance name.
	Name pulumi.StringOutput `pulumi:"name"`
	// The password for the replication user account.
	// **Note**: This property is sensitive and will not be displayed in the plan.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// The externally accessible port for the source database server.
	// Defaults to 3306.
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The Region in which the created instance should reside.
	// If it is not provided, the provider region is used.
	Region pulumi.StringOutput `pulumi:"region"`
	// The replication user account on the external server.
	Username pulumi.StringPtrOutput `pulumi:"username"`
}

// NewSourceRepresentationInstance registers a new resource with the given unique name, arguments, and options.
func NewSourceRepresentationInstance(ctx *pulumi.Context,
	name string, args *SourceRepresentationInstanceArgs, opts ...pulumi.ResourceOption) (*SourceRepresentationInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseVersion == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseVersion'")
	}
	if args.Host == nil {
		return nil, errors.New("invalid value for required argument 'Host'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SourceRepresentationInstance
	err := ctx.RegisterResource("gcp:sql/sourceRepresentationInstance:SourceRepresentationInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSourceRepresentationInstance gets an existing SourceRepresentationInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSourceRepresentationInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SourceRepresentationInstanceState, opts ...pulumi.ResourceOption) (*SourceRepresentationInstance, error) {
	var resource SourceRepresentationInstance
	err := ctx.ReadResource("gcp:sql/sourceRepresentationInstance:SourceRepresentationInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SourceRepresentationInstance resources.
type sourceRepresentationInstanceState struct {
	// The CA certificate on the external server. Include only if SSL/TLS is used on the external server.
	CaCertificate *string `pulumi:"caCertificate"`
	// The client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
	ClientCertificate *string `pulumi:"clientCertificate"`
	// The private key file for the client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
	ClientKey *string `pulumi:"clientKey"`
	// The MySQL, PostgreSQL or SQL Server (beta) version to use. Supported values include MYSQL_5_6, MYSQL_5_7, MYSQL_8_0, MYSQL_8_4, POSTGRES_9_6, POSTGRES_10, POSTGRES_11, POSTGRES_12, POSTGRES_13, POSTGRES_14, POSTGRES_15, POSTGRES_16, POSTGRES_17. Database Version Policies includes an up-to-date reference of supported versions.
	DatabaseVersion *string `pulumi:"databaseVersion"`
	// A file in the bucket that contains the data from the external server.
	DumpFilePath *string `pulumi:"dumpFilePath"`
	// The IPv4 address and port for the external server, or the the DNS address for the external server. If the external server is hosted on Cloud SQL, the port is 5432.
	Host *string `pulumi:"host"`
	// The name of the source representation instance. Use any valid Cloud SQL instance name.
	Name *string `pulumi:"name"`
	// The password for the replication user account.
	// **Note**: This property is sensitive and will not be displayed in the plan.
	Password *string `pulumi:"password"`
	// The externally accessible port for the source database server.
	// Defaults to 3306.
	Port *int `pulumi:"port"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The Region in which the created instance should reside.
	// If it is not provided, the provider region is used.
	Region *string `pulumi:"region"`
	// The replication user account on the external server.
	Username *string `pulumi:"username"`
}

type SourceRepresentationInstanceState struct {
	// The CA certificate on the external server. Include only if SSL/TLS is used on the external server.
	CaCertificate pulumi.StringPtrInput
	// The client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
	ClientCertificate pulumi.StringPtrInput
	// The private key file for the client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
	ClientKey pulumi.StringPtrInput
	// The MySQL, PostgreSQL or SQL Server (beta) version to use. Supported values include MYSQL_5_6, MYSQL_5_7, MYSQL_8_0, MYSQL_8_4, POSTGRES_9_6, POSTGRES_10, POSTGRES_11, POSTGRES_12, POSTGRES_13, POSTGRES_14, POSTGRES_15, POSTGRES_16, POSTGRES_17. Database Version Policies includes an up-to-date reference of supported versions.
	DatabaseVersion pulumi.StringPtrInput
	// A file in the bucket that contains the data from the external server.
	DumpFilePath pulumi.StringPtrInput
	// The IPv4 address and port for the external server, or the the DNS address for the external server. If the external server is hosted on Cloud SQL, the port is 5432.
	Host pulumi.StringPtrInput
	// The name of the source representation instance. Use any valid Cloud SQL instance name.
	Name pulumi.StringPtrInput
	// The password for the replication user account.
	// **Note**: This property is sensitive and will not be displayed in the plan.
	Password pulumi.StringPtrInput
	// The externally accessible port for the source database server.
	// Defaults to 3306.
	Port pulumi.IntPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The Region in which the created instance should reside.
	// If it is not provided, the provider region is used.
	Region pulumi.StringPtrInput
	// The replication user account on the external server.
	Username pulumi.StringPtrInput
}

func (SourceRepresentationInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*sourceRepresentationInstanceState)(nil)).Elem()
}

type sourceRepresentationInstanceArgs struct {
	// The CA certificate on the external server. Include only if SSL/TLS is used on the external server.
	CaCertificate *string `pulumi:"caCertificate"`
	// The client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
	ClientCertificate *string `pulumi:"clientCertificate"`
	// The private key file for the client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
	ClientKey *string `pulumi:"clientKey"`
	// The MySQL, PostgreSQL or SQL Server (beta) version to use. Supported values include MYSQL_5_6, MYSQL_5_7, MYSQL_8_0, MYSQL_8_4, POSTGRES_9_6, POSTGRES_10, POSTGRES_11, POSTGRES_12, POSTGRES_13, POSTGRES_14, POSTGRES_15, POSTGRES_16, POSTGRES_17. Database Version Policies includes an up-to-date reference of supported versions.
	DatabaseVersion string `pulumi:"databaseVersion"`
	// A file in the bucket that contains the data from the external server.
	DumpFilePath *string `pulumi:"dumpFilePath"`
	// The IPv4 address and port for the external server, or the the DNS address for the external server. If the external server is hosted on Cloud SQL, the port is 5432.
	Host string `pulumi:"host"`
	// The name of the source representation instance. Use any valid Cloud SQL instance name.
	Name *string `pulumi:"name"`
	// The password for the replication user account.
	// **Note**: This property is sensitive and will not be displayed in the plan.
	Password *string `pulumi:"password"`
	// The externally accessible port for the source database server.
	// Defaults to 3306.
	Port *int `pulumi:"port"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The Region in which the created instance should reside.
	// If it is not provided, the provider region is used.
	Region *string `pulumi:"region"`
	// The replication user account on the external server.
	Username *string `pulumi:"username"`
}

// The set of arguments for constructing a SourceRepresentationInstance resource.
type SourceRepresentationInstanceArgs struct {
	// The CA certificate on the external server. Include only if SSL/TLS is used on the external server.
	CaCertificate pulumi.StringPtrInput
	// The client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
	ClientCertificate pulumi.StringPtrInput
	// The private key file for the client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
	ClientKey pulumi.StringPtrInput
	// The MySQL, PostgreSQL or SQL Server (beta) version to use. Supported values include MYSQL_5_6, MYSQL_5_7, MYSQL_8_0, MYSQL_8_4, POSTGRES_9_6, POSTGRES_10, POSTGRES_11, POSTGRES_12, POSTGRES_13, POSTGRES_14, POSTGRES_15, POSTGRES_16, POSTGRES_17. Database Version Policies includes an up-to-date reference of supported versions.
	DatabaseVersion pulumi.StringInput
	// A file in the bucket that contains the data from the external server.
	DumpFilePath pulumi.StringPtrInput
	// The IPv4 address and port for the external server, or the the DNS address for the external server. If the external server is hosted on Cloud SQL, the port is 5432.
	Host pulumi.StringInput
	// The name of the source representation instance. Use any valid Cloud SQL instance name.
	Name pulumi.StringPtrInput
	// The password for the replication user account.
	// **Note**: This property is sensitive and will not be displayed in the plan.
	Password pulumi.StringPtrInput
	// The externally accessible port for the source database server.
	// Defaults to 3306.
	Port pulumi.IntPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The Region in which the created instance should reside.
	// If it is not provided, the provider region is used.
	Region pulumi.StringPtrInput
	// The replication user account on the external server.
	Username pulumi.StringPtrInput
}

func (SourceRepresentationInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sourceRepresentationInstanceArgs)(nil)).Elem()
}

type SourceRepresentationInstanceInput interface {
	pulumi.Input

	ToSourceRepresentationInstanceOutput() SourceRepresentationInstanceOutput
	ToSourceRepresentationInstanceOutputWithContext(ctx context.Context) SourceRepresentationInstanceOutput
}

func (*SourceRepresentationInstance) ElementType() reflect.Type {
	return reflect.TypeOf((**SourceRepresentationInstance)(nil)).Elem()
}

func (i *SourceRepresentationInstance) ToSourceRepresentationInstanceOutput() SourceRepresentationInstanceOutput {
	return i.ToSourceRepresentationInstanceOutputWithContext(context.Background())
}

func (i *SourceRepresentationInstance) ToSourceRepresentationInstanceOutputWithContext(ctx context.Context) SourceRepresentationInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SourceRepresentationInstanceOutput)
}

// SourceRepresentationInstanceArrayInput is an input type that accepts SourceRepresentationInstanceArray and SourceRepresentationInstanceArrayOutput values.
// You can construct a concrete instance of `SourceRepresentationInstanceArrayInput` via:
//
//	SourceRepresentationInstanceArray{ SourceRepresentationInstanceArgs{...} }
type SourceRepresentationInstanceArrayInput interface {
	pulumi.Input

	ToSourceRepresentationInstanceArrayOutput() SourceRepresentationInstanceArrayOutput
	ToSourceRepresentationInstanceArrayOutputWithContext(context.Context) SourceRepresentationInstanceArrayOutput
}

type SourceRepresentationInstanceArray []SourceRepresentationInstanceInput

func (SourceRepresentationInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SourceRepresentationInstance)(nil)).Elem()
}

func (i SourceRepresentationInstanceArray) ToSourceRepresentationInstanceArrayOutput() SourceRepresentationInstanceArrayOutput {
	return i.ToSourceRepresentationInstanceArrayOutputWithContext(context.Background())
}

func (i SourceRepresentationInstanceArray) ToSourceRepresentationInstanceArrayOutputWithContext(ctx context.Context) SourceRepresentationInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SourceRepresentationInstanceArrayOutput)
}

// SourceRepresentationInstanceMapInput is an input type that accepts SourceRepresentationInstanceMap and SourceRepresentationInstanceMapOutput values.
// You can construct a concrete instance of `SourceRepresentationInstanceMapInput` via:
//
//	SourceRepresentationInstanceMap{ "key": SourceRepresentationInstanceArgs{...} }
type SourceRepresentationInstanceMapInput interface {
	pulumi.Input

	ToSourceRepresentationInstanceMapOutput() SourceRepresentationInstanceMapOutput
	ToSourceRepresentationInstanceMapOutputWithContext(context.Context) SourceRepresentationInstanceMapOutput
}

type SourceRepresentationInstanceMap map[string]SourceRepresentationInstanceInput

func (SourceRepresentationInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SourceRepresentationInstance)(nil)).Elem()
}

func (i SourceRepresentationInstanceMap) ToSourceRepresentationInstanceMapOutput() SourceRepresentationInstanceMapOutput {
	return i.ToSourceRepresentationInstanceMapOutputWithContext(context.Background())
}

func (i SourceRepresentationInstanceMap) ToSourceRepresentationInstanceMapOutputWithContext(ctx context.Context) SourceRepresentationInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SourceRepresentationInstanceMapOutput)
}

type SourceRepresentationInstanceOutput struct{ *pulumi.OutputState }

func (SourceRepresentationInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SourceRepresentationInstance)(nil)).Elem()
}

func (o SourceRepresentationInstanceOutput) ToSourceRepresentationInstanceOutput() SourceRepresentationInstanceOutput {
	return o
}

func (o SourceRepresentationInstanceOutput) ToSourceRepresentationInstanceOutputWithContext(ctx context.Context) SourceRepresentationInstanceOutput {
	return o
}

// The CA certificate on the external server. Include only if SSL/TLS is used on the external server.
func (o SourceRepresentationInstanceOutput) CaCertificate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SourceRepresentationInstance) pulumi.StringPtrOutput { return v.CaCertificate }).(pulumi.StringPtrOutput)
}

// The client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
func (o SourceRepresentationInstanceOutput) ClientCertificate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SourceRepresentationInstance) pulumi.StringPtrOutput { return v.ClientCertificate }).(pulumi.StringPtrOutput)
}

// The private key file for the client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
func (o SourceRepresentationInstanceOutput) ClientKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SourceRepresentationInstance) pulumi.StringPtrOutput { return v.ClientKey }).(pulumi.StringPtrOutput)
}

// The MySQL, PostgreSQL or SQL Server (beta) version to use. Supported values include MYSQL_5_6, MYSQL_5_7, MYSQL_8_0, MYSQL_8_4, POSTGRES_9_6, POSTGRES_10, POSTGRES_11, POSTGRES_12, POSTGRES_13, POSTGRES_14, POSTGRES_15, POSTGRES_16, POSTGRES_17. Database Version Policies includes an up-to-date reference of supported versions.
func (o SourceRepresentationInstanceOutput) DatabaseVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *SourceRepresentationInstance) pulumi.StringOutput { return v.DatabaseVersion }).(pulumi.StringOutput)
}

// A file in the bucket that contains the data from the external server.
func (o SourceRepresentationInstanceOutput) DumpFilePath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SourceRepresentationInstance) pulumi.StringPtrOutput { return v.DumpFilePath }).(pulumi.StringPtrOutput)
}

// The IPv4 address and port for the external server, or the the DNS address for the external server. If the external server is hosted on Cloud SQL, the port is 5432.
func (o SourceRepresentationInstanceOutput) Host() pulumi.StringOutput {
	return o.ApplyT(func(v *SourceRepresentationInstance) pulumi.StringOutput { return v.Host }).(pulumi.StringOutput)
}

// The name of the source representation instance. Use any valid Cloud SQL instance name.
func (o SourceRepresentationInstanceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SourceRepresentationInstance) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The password for the replication user account.
// **Note**: This property is sensitive and will not be displayed in the plan.
func (o SourceRepresentationInstanceOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SourceRepresentationInstance) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// The externally accessible port for the source database server.
// Defaults to 3306.
func (o SourceRepresentationInstanceOutput) Port() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *SourceRepresentationInstance) pulumi.IntPtrOutput { return v.Port }).(pulumi.IntPtrOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o SourceRepresentationInstanceOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *SourceRepresentationInstance) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The Region in which the created instance should reside.
// If it is not provided, the provider region is used.
func (o SourceRepresentationInstanceOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *SourceRepresentationInstance) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The replication user account on the external server.
func (o SourceRepresentationInstanceOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SourceRepresentationInstance) pulumi.StringPtrOutput { return v.Username }).(pulumi.StringPtrOutput)
}

type SourceRepresentationInstanceArrayOutput struct{ *pulumi.OutputState }

func (SourceRepresentationInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SourceRepresentationInstance)(nil)).Elem()
}

func (o SourceRepresentationInstanceArrayOutput) ToSourceRepresentationInstanceArrayOutput() SourceRepresentationInstanceArrayOutput {
	return o
}

func (o SourceRepresentationInstanceArrayOutput) ToSourceRepresentationInstanceArrayOutputWithContext(ctx context.Context) SourceRepresentationInstanceArrayOutput {
	return o
}

func (o SourceRepresentationInstanceArrayOutput) Index(i pulumi.IntInput) SourceRepresentationInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SourceRepresentationInstance {
		return vs[0].([]*SourceRepresentationInstance)[vs[1].(int)]
	}).(SourceRepresentationInstanceOutput)
}

type SourceRepresentationInstanceMapOutput struct{ *pulumi.OutputState }

func (SourceRepresentationInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SourceRepresentationInstance)(nil)).Elem()
}

func (o SourceRepresentationInstanceMapOutput) ToSourceRepresentationInstanceMapOutput() SourceRepresentationInstanceMapOutput {
	return o
}

func (o SourceRepresentationInstanceMapOutput) ToSourceRepresentationInstanceMapOutputWithContext(ctx context.Context) SourceRepresentationInstanceMapOutput {
	return o
}

func (o SourceRepresentationInstanceMapOutput) MapIndex(k pulumi.StringInput) SourceRepresentationInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SourceRepresentationInstance {
		return vs[0].(map[string]*SourceRepresentationInstance)[vs[1].(string)]
	}).(SourceRepresentationInstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SourceRepresentationInstanceInput)(nil)).Elem(), &SourceRepresentationInstance{})
	pulumi.RegisterInputType(reflect.TypeOf((*SourceRepresentationInstanceArrayInput)(nil)).Elem(), SourceRepresentationInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SourceRepresentationInstanceMapInput)(nil)).Elem(), SourceRepresentationInstanceMap{})
	pulumi.RegisterOutputType(SourceRepresentationInstanceOutput{})
	pulumi.RegisterOutputType(SourceRepresentationInstanceArrayOutput{})
	pulumi.RegisterOutputType(SourceRepresentationInstanceMapOutput{})
}
