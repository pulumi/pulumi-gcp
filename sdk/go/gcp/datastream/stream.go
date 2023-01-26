// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package datastream

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A resource representing streaming data from a source to a destination.
//
// To get more information about Stream, see:
//
// * [API documentation](https://cloud.google.com/datastream/docs/reference/rest/v1/projects.locations.streams)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/datastream/docs/create-a-stream)
//
// ## Example Usage
// ### Datastream Stream Full
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/datastream"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/sql"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/storage"
//	"github.com/pulumi/pulumi-random/sdk/v4/go/random"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			project, err := organizations.LookupProject(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			instance, err := sql.NewDatabaseInstance(ctx, "instance", &sql.DatabaseInstanceArgs{
//				DatabaseVersion: pulumi.String("MYSQL_8_0"),
//				Region:          pulumi.String("us-central1"),
//				Settings: &sql.DatabaseInstanceSettingsArgs{
//					Tier: pulumi.String("db-f1-micro"),
//					BackupConfiguration: &sql.DatabaseInstanceSettingsBackupConfigurationArgs{
//						Enabled:          pulumi.Bool(true),
//						BinaryLogEnabled: pulumi.Bool(true),
//					},
//					IpConfiguration: &sql.DatabaseInstanceSettingsIpConfigurationArgs{
//						AuthorizedNetworks: sql.DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArray{
//							&sql.DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs{
//								Value: pulumi.String("34.71.242.81"),
//							},
//							&sql.DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs{
//								Value: pulumi.String("34.72.28.29"),
//							},
//							&sql.DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs{
//								Value: pulumi.String("34.67.6.157"),
//							},
//							&sql.DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs{
//								Value: pulumi.String("34.67.234.134"),
//							},
//							&sql.DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs{
//								Value: pulumi.String("34.72.239.218"),
//							},
//						},
//					},
//				},
//				DeletionProtection: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = sql.NewDatabase(ctx, "db", &sql.DatabaseArgs{
//				Instance: instance.Name,
//			})
//			if err != nil {
//				return err
//			}
//			pwd, err := random.NewRandomPassword(ctx, "pwd", &random.RandomPasswordArgs{
//				Length:  pulumi.Int(16),
//				Special: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			user, err := sql.NewUser(ctx, "user", &sql.UserArgs{
//				Instance: instance.Name,
//				Host:     pulumi.String("%"),
//				Password: pwd.Result,
//			})
//			if err != nil {
//				return err
//			}
//			sourceConnectionProfile, err := datastream.NewConnectionProfile(ctx, "sourceConnectionProfile", &datastream.ConnectionProfileArgs{
//				DisplayName:         pulumi.String("Source connection profile"),
//				Location:            pulumi.String("us-central1"),
//				ConnectionProfileId: pulumi.String("source-profile"),
//				MysqlProfile: &datastream.ConnectionProfileMysqlProfileArgs{
//					Hostname: instance.PublicIpAddress,
//					Username: user.Name,
//					Password: user.Password,
//				},
//			})
//			if err != nil {
//				return err
//			}
//			bucket, err := storage.NewBucket(ctx, "bucket", &storage.BucketArgs{
//				Location:                 pulumi.String("US"),
//				UniformBucketLevelAccess: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = storage.NewBucketIAMMember(ctx, "viewer", &storage.BucketIAMMemberArgs{
//				Bucket: bucket.Name,
//				Role:   pulumi.String("roles/storage.objectViewer"),
//				Member: pulumi.String(fmt.Sprintf("serviceAccount:service-%v@gcp-sa-datastream.iam.gserviceaccount.com", project.Number)),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = storage.NewBucketIAMMember(ctx, "creator", &storage.BucketIAMMemberArgs{
//				Bucket: bucket.Name,
//				Role:   pulumi.String("roles/storage.objectCreator"),
//				Member: pulumi.String(fmt.Sprintf("serviceAccount:service-%v@gcp-sa-datastream.iam.gserviceaccount.com", project.Number)),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = storage.NewBucketIAMMember(ctx, "reader", &storage.BucketIAMMemberArgs{
//				Bucket: bucket.Name,
//				Role:   pulumi.String("roles/storage.legacyBucketReader"),
//				Member: pulumi.String(fmt.Sprintf("serviceAccount:service-%v@gcp-sa-datastream.iam.gserviceaccount.com", project.Number)),
//			})
//			if err != nil {
//				return err
//			}
//			destinationConnectionProfile, err := datastream.NewConnectionProfile(ctx, "destinationConnectionProfile", &datastream.ConnectionProfileArgs{
//				DisplayName:         pulumi.String("Connection profile"),
//				Location:            pulumi.String("us-central1"),
//				ConnectionProfileId: pulumi.String("destination-profile"),
//				GcsProfile: &datastream.ConnectionProfileGcsProfileArgs{
//					Bucket:   bucket.Name,
//					RootPath: pulumi.String("/path"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = datastream.NewStream(ctx, "default", &datastream.StreamArgs{
//				StreamId:     pulumi.String("my-stream"),
//				DesiredState: pulumi.String("NOT_STARTED"),
//				Location:     pulumi.String("us-central1"),
//				DisplayName:  pulumi.String("my stream"),
//				Labels: pulumi.StringMap{
//					"key": pulumi.String("value"),
//				},
//				SourceConfig: &datastream.StreamSourceConfigArgs{
//					SourceConnectionProfile: sourceConnectionProfile.ID(),
//					MysqlSourceConfig: &datastream.StreamSourceConfigMysqlSourceConfigArgs{
//						IncludeObjects: &datastream.StreamSourceConfigMysqlSourceConfigIncludeObjectsArgs{
//							MysqlDatabases: datastream.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArray{
//								&datastream.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArgs{
//									Database: pulumi.String("my-database"),
//									MysqlTables: datastream.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTableArray{
//										&datastream.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTableArgs{
//											Table: pulumi.String("includedTable"),
//											MysqlColumns: datastream.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTableMysqlColumnArray{
//												&datastream.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTableMysqlColumnArgs{
//													Column:          pulumi.String("includedColumn"),
//													DataType:        pulumi.String("VARCHAR"),
//													Collation:       pulumi.String("utf8mb4"),
//													PrimaryKey:      pulumi.Bool(false),
//													Nullable:        pulumi.Bool(false),
//													OrdinalPosition: pulumi.Int(0),
//												},
//											},
//										},
//									},
//								},
//							},
//						},
//						ExcludeObjects: &datastream.StreamSourceConfigMysqlSourceConfigExcludeObjectsArgs{
//							MysqlDatabases: datastream.StreamSourceConfigMysqlSourceConfigExcludeObjectsMysqlDatabaseArray{
//								&datastream.StreamSourceConfigMysqlSourceConfigExcludeObjectsMysqlDatabaseArgs{
//									Database: pulumi.String("my-database"),
//									MysqlTables: datastream.StreamSourceConfigMysqlSourceConfigExcludeObjectsMysqlDatabaseMysqlTableArray{
//										&datastream.StreamSourceConfigMysqlSourceConfigExcludeObjectsMysqlDatabaseMysqlTableArgs{
//											Table: pulumi.String("excludedTable"),
//											MysqlColumns: datastream.StreamSourceConfigMysqlSourceConfigExcludeObjectsMysqlDatabaseMysqlTableMysqlColumnArray{
//												&datastream.StreamSourceConfigMysqlSourceConfigExcludeObjectsMysqlDatabaseMysqlTableMysqlColumnArgs{
//													Column:          pulumi.String("excludedColumn"),
//													DataType:        pulumi.String("VARCHAR"),
//													Collation:       pulumi.String("utf8mb4"),
//													PrimaryKey:      pulumi.Bool(false),
//													Nullable:        pulumi.Bool(false),
//													OrdinalPosition: pulumi.Int(0),
//												},
//											},
//										},
//									},
//								},
//							},
//						},
//						MaxConcurrentCdcTasks: pulumi.Int(5),
//					},
//				},
//				DestinationConfig: &datastream.StreamDestinationConfigArgs{
//					DestinationConnectionProfile: destinationConnectionProfile.ID(),
//					GcsDestinationConfig: &datastream.StreamDestinationConfigGcsDestinationConfigArgs{
//						Path:                 pulumi.String("mydata"),
//						FileRotationMb:       pulumi.Int(200),
//						FileRotationInterval: pulumi.String("900s"),
//						JsonFileFormat: &datastream.StreamDestinationConfigGcsDestinationConfigJsonFileFormatArgs{
//							SchemaFileFormat: pulumi.String("NO_SCHEMA_FILE"),
//							Compression:      pulumi.String("GZIP"),
//						},
//					},
//				},
//				BackfillAll: &datastream.StreamBackfillAllArgs{
//					MysqlExcludedObjects: &datastream.StreamBackfillAllMysqlExcludedObjectsArgs{
//						MysqlDatabases: datastream.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseArray{
//							&datastream.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseArgs{
//								Database: pulumi.String("my-database"),
//								MysqlTables: datastream.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArray{
//									&datastream.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArgs{
//										Table: pulumi.String("excludedTable"),
//										MysqlColumns: datastream.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumnArray{
//											&datastream.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumnArgs{
//												Column:          pulumi.String("excludedColumn"),
//												DataType:        pulumi.String("VARCHAR"),
//												Collation:       pulumi.String("utf8mb4"),
//												PrimaryKey:      pulumi.Bool(false),
//												Nullable:        pulumi.Bool(false),
//												OrdinalPosition: pulumi.Int(0),
//											},
//										},
//									},
//								},
//							},
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
// # Stream can be imported using any of these accepted formats
//
// ```sh
//
//	$ pulumi import gcp:datastream/stream:Stream default projects/{{project}}/locations/{{location}}/streams/{{stream_id}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:datastream/stream:Stream default {{project}}/{{location}}/{{stream_id}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:datastream/stream:Stream default {{location}}/{{stream_id}}
//
// ```
type Stream struct {
	pulumi.CustomResourceState

	// Backfill strategy to automatically backfill the Stream's objects. Specific objects can be excluded.
	// Structure is documented below.
	BackfillAll StreamBackfillAllPtrOutput `pulumi:"backfillAll"`
	// Backfill strategy to disable automatic backfill for the Stream's objects.
	BackfillNone StreamBackfillNonePtrOutput `pulumi:"backfillNone"`
	// Desired state of the Stream. Set this field to `RUNNING` to start the stream, and `PAUSED` to pause the stream.
	DesiredState pulumi.StringPtrOutput `pulumi:"desiredState"`
	// Destination connection profile configuration.
	// Structure is documented below.
	DestinationConfig StreamDestinationConfigOutput `pulumi:"destinationConfig"`
	// Display name.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Labels.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The name of the location this stream is located in.
	Location pulumi.StringOutput `pulumi:"location"`
	// The stream's name.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// Source connection profile configuration.
	// Structure is documented below.
	SourceConfig StreamSourceConfigOutput `pulumi:"sourceConfig"`
	// The state of the stream.
	State pulumi.StringOutput `pulumi:"state"`
	// The stream identifier.
	StreamId pulumi.StringOutput `pulumi:"streamId"`
}

// NewStream registers a new resource with the given unique name, arguments, and options.
func NewStream(ctx *pulumi.Context,
	name string, args *StreamArgs, opts ...pulumi.ResourceOption) (*Stream, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DestinationConfig == nil {
		return nil, errors.New("invalid value for required argument 'DestinationConfig'")
	}
	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	if args.SourceConfig == nil {
		return nil, errors.New("invalid value for required argument 'SourceConfig'")
	}
	if args.StreamId == nil {
		return nil, errors.New("invalid value for required argument 'StreamId'")
	}
	var resource Stream
	err := ctx.RegisterResource("gcp:datastream/stream:Stream", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStream gets an existing Stream resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStream(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StreamState, opts ...pulumi.ResourceOption) (*Stream, error) {
	var resource Stream
	err := ctx.ReadResource("gcp:datastream/stream:Stream", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Stream resources.
type streamState struct {
	// Backfill strategy to automatically backfill the Stream's objects. Specific objects can be excluded.
	// Structure is documented below.
	BackfillAll *StreamBackfillAll `pulumi:"backfillAll"`
	// Backfill strategy to disable automatic backfill for the Stream's objects.
	BackfillNone *StreamBackfillNone `pulumi:"backfillNone"`
	// Desired state of the Stream. Set this field to `RUNNING` to start the stream, and `PAUSED` to pause the stream.
	DesiredState *string `pulumi:"desiredState"`
	// Destination connection profile configuration.
	// Structure is documented below.
	DestinationConfig *StreamDestinationConfig `pulumi:"destinationConfig"`
	// Display name.
	DisplayName *string `pulumi:"displayName"`
	// Labels.
	Labels map[string]string `pulumi:"labels"`
	// The name of the location this stream is located in.
	Location *string `pulumi:"location"`
	// The stream's name.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Source connection profile configuration.
	// Structure is documented below.
	SourceConfig *StreamSourceConfig `pulumi:"sourceConfig"`
	// The state of the stream.
	State *string `pulumi:"state"`
	// The stream identifier.
	StreamId *string `pulumi:"streamId"`
}

type StreamState struct {
	// Backfill strategy to automatically backfill the Stream's objects. Specific objects can be excluded.
	// Structure is documented below.
	BackfillAll StreamBackfillAllPtrInput
	// Backfill strategy to disable automatic backfill for the Stream's objects.
	BackfillNone StreamBackfillNonePtrInput
	// Desired state of the Stream. Set this field to `RUNNING` to start the stream, and `PAUSED` to pause the stream.
	DesiredState pulumi.StringPtrInput
	// Destination connection profile configuration.
	// Structure is documented below.
	DestinationConfig StreamDestinationConfigPtrInput
	// Display name.
	DisplayName pulumi.StringPtrInput
	// Labels.
	Labels pulumi.StringMapInput
	// The name of the location this stream is located in.
	Location pulumi.StringPtrInput
	// The stream's name.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Source connection profile configuration.
	// Structure is documented below.
	SourceConfig StreamSourceConfigPtrInput
	// The state of the stream.
	State pulumi.StringPtrInput
	// The stream identifier.
	StreamId pulumi.StringPtrInput
}

func (StreamState) ElementType() reflect.Type {
	return reflect.TypeOf((*streamState)(nil)).Elem()
}

type streamArgs struct {
	// Backfill strategy to automatically backfill the Stream's objects. Specific objects can be excluded.
	// Structure is documented below.
	BackfillAll *StreamBackfillAll `pulumi:"backfillAll"`
	// Backfill strategy to disable automatic backfill for the Stream's objects.
	BackfillNone *StreamBackfillNone `pulumi:"backfillNone"`
	// Desired state of the Stream. Set this field to `RUNNING` to start the stream, and `PAUSED` to pause the stream.
	DesiredState *string `pulumi:"desiredState"`
	// Destination connection profile configuration.
	// Structure is documented below.
	DestinationConfig StreamDestinationConfig `pulumi:"destinationConfig"`
	// Display name.
	DisplayName string `pulumi:"displayName"`
	// Labels.
	Labels map[string]string `pulumi:"labels"`
	// The name of the location this stream is located in.
	Location string `pulumi:"location"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// Source connection profile configuration.
	// Structure is documented below.
	SourceConfig StreamSourceConfig `pulumi:"sourceConfig"`
	// The stream identifier.
	StreamId string `pulumi:"streamId"`
}

// The set of arguments for constructing a Stream resource.
type StreamArgs struct {
	// Backfill strategy to automatically backfill the Stream's objects. Specific objects can be excluded.
	// Structure is documented below.
	BackfillAll StreamBackfillAllPtrInput
	// Backfill strategy to disable automatic backfill for the Stream's objects.
	BackfillNone StreamBackfillNonePtrInput
	// Desired state of the Stream. Set this field to `RUNNING` to start the stream, and `PAUSED` to pause the stream.
	DesiredState pulumi.StringPtrInput
	// Destination connection profile configuration.
	// Structure is documented below.
	DestinationConfig StreamDestinationConfigInput
	// Display name.
	DisplayName pulumi.StringInput
	// Labels.
	Labels pulumi.StringMapInput
	// The name of the location this stream is located in.
	Location pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// Source connection profile configuration.
	// Structure is documented below.
	SourceConfig StreamSourceConfigInput
	// The stream identifier.
	StreamId pulumi.StringInput
}

func (StreamArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*streamArgs)(nil)).Elem()
}

type StreamInput interface {
	pulumi.Input

	ToStreamOutput() StreamOutput
	ToStreamOutputWithContext(ctx context.Context) StreamOutput
}

func (*Stream) ElementType() reflect.Type {
	return reflect.TypeOf((**Stream)(nil)).Elem()
}

func (i *Stream) ToStreamOutput() StreamOutput {
	return i.ToStreamOutputWithContext(context.Background())
}

func (i *Stream) ToStreamOutputWithContext(ctx context.Context) StreamOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamOutput)
}

// StreamArrayInput is an input type that accepts StreamArray and StreamArrayOutput values.
// You can construct a concrete instance of `StreamArrayInput` via:
//
//	StreamArray{ StreamArgs{...} }
type StreamArrayInput interface {
	pulumi.Input

	ToStreamArrayOutput() StreamArrayOutput
	ToStreamArrayOutputWithContext(context.Context) StreamArrayOutput
}

type StreamArray []StreamInput

func (StreamArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Stream)(nil)).Elem()
}

func (i StreamArray) ToStreamArrayOutput() StreamArrayOutput {
	return i.ToStreamArrayOutputWithContext(context.Background())
}

func (i StreamArray) ToStreamArrayOutputWithContext(ctx context.Context) StreamArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamArrayOutput)
}

// StreamMapInput is an input type that accepts StreamMap and StreamMapOutput values.
// You can construct a concrete instance of `StreamMapInput` via:
//
//	StreamMap{ "key": StreamArgs{...} }
type StreamMapInput interface {
	pulumi.Input

	ToStreamMapOutput() StreamMapOutput
	ToStreamMapOutputWithContext(context.Context) StreamMapOutput
}

type StreamMap map[string]StreamInput

func (StreamMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Stream)(nil)).Elem()
}

func (i StreamMap) ToStreamMapOutput() StreamMapOutput {
	return i.ToStreamMapOutputWithContext(context.Background())
}

func (i StreamMap) ToStreamMapOutputWithContext(ctx context.Context) StreamMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamMapOutput)
}

type StreamOutput struct{ *pulumi.OutputState }

func (StreamOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Stream)(nil)).Elem()
}

func (o StreamOutput) ToStreamOutput() StreamOutput {
	return o
}

func (o StreamOutput) ToStreamOutputWithContext(ctx context.Context) StreamOutput {
	return o
}

// Backfill strategy to automatically backfill the Stream's objects. Specific objects can be excluded.
// Structure is documented below.
func (o StreamOutput) BackfillAll() StreamBackfillAllPtrOutput {
	return o.ApplyT(func(v *Stream) StreamBackfillAllPtrOutput { return v.BackfillAll }).(StreamBackfillAllPtrOutput)
}

// Backfill strategy to disable automatic backfill for the Stream's objects.
func (o StreamOutput) BackfillNone() StreamBackfillNonePtrOutput {
	return o.ApplyT(func(v *Stream) StreamBackfillNonePtrOutput { return v.BackfillNone }).(StreamBackfillNonePtrOutput)
}

// Desired state of the Stream. Set this field to `RUNNING` to start the stream, and `PAUSED` to pause the stream.
func (o StreamOutput) DesiredState() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringPtrOutput { return v.DesiredState }).(pulumi.StringPtrOutput)
}

// Destination connection profile configuration.
// Structure is documented below.
func (o StreamOutput) DestinationConfig() StreamDestinationConfigOutput {
	return o.ApplyT(func(v *Stream) StreamDestinationConfigOutput { return v.DestinationConfig }).(StreamDestinationConfigOutput)
}

// Display name.
func (o StreamOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Labels.
func (o StreamOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// The name of the location this stream is located in.
func (o StreamOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The stream's name.
func (o StreamOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o StreamOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Source connection profile configuration.
// Structure is documented below.
func (o StreamOutput) SourceConfig() StreamSourceConfigOutput {
	return o.ApplyT(func(v *Stream) StreamSourceConfigOutput { return v.SourceConfig }).(StreamSourceConfigOutput)
}

// The state of the stream.
func (o StreamOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// The stream identifier.
func (o StreamOutput) StreamId() pulumi.StringOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringOutput { return v.StreamId }).(pulumi.StringOutput)
}

type StreamArrayOutput struct{ *pulumi.OutputState }

func (StreamArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Stream)(nil)).Elem()
}

func (o StreamArrayOutput) ToStreamArrayOutput() StreamArrayOutput {
	return o
}

func (o StreamArrayOutput) ToStreamArrayOutputWithContext(ctx context.Context) StreamArrayOutput {
	return o
}

func (o StreamArrayOutput) Index(i pulumi.IntInput) StreamOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Stream {
		return vs[0].([]*Stream)[vs[1].(int)]
	}).(StreamOutput)
}

type StreamMapOutput struct{ *pulumi.OutputState }

func (StreamMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Stream)(nil)).Elem()
}

func (o StreamMapOutput) ToStreamMapOutput() StreamMapOutput {
	return o
}

func (o StreamMapOutput) ToStreamMapOutputWithContext(ctx context.Context) StreamMapOutput {
	return o
}

func (o StreamMapOutput) MapIndex(k pulumi.StringInput) StreamOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Stream {
		return vs[0].(map[string]*Stream)[vs[1].(string)]
	}).(StreamOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StreamInput)(nil)).Elem(), &Stream{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamArrayInput)(nil)).Elem(), StreamArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamMapInput)(nil)).Elem(), StreamMap{})
	pulumi.RegisterOutputType(StreamOutput{})
	pulumi.RegisterOutputType(StreamArrayOutput{})
	pulumi.RegisterOutputType(StreamMapOutput{})
}