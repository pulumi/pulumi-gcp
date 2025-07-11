// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package securitycenter

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Represents a Data Fusion instance.
//
// To get more information about Instance, see:
//
// * [API documentation](https://cloud.google.com/data-fusion/docs/reference/rest/v1beta1/projects.locations.instances)
// * How-to Guides
//   - [Official Documentation](https://cloud.google.com/data-fusion/docs/)
//
// ## Example Usage
//
// ### Data Fusion Instance Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/datafusion"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := datafusion.NewInstance(ctx, "basic_instance", &datafusion.InstanceArgs{
//				Name:   pulumi.String("my-instance"),
//				Region: pulumi.String("us-central1"),
//				Type:   pulumi.String("BASIC"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Data Fusion Instance Full
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/appengine"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/datafusion"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := appengine.GetDefaultServiceAccount(ctx, &appengine.GetDefaultServiceAccountArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			network, err := compute.NewNetwork(ctx, "network", &compute.NetworkArgs{
//				Name: pulumi.String("datafusion-full-network"),
//			})
//			if err != nil {
//				return err
//			}
//			privateIpAlloc, err := compute.NewGlobalAddress(ctx, "private_ip_alloc", &compute.GlobalAddressArgs{
//				Name:         pulumi.String("datafusion-ip-alloc"),
//				AddressType:  pulumi.String("INTERNAL"),
//				Purpose:      pulumi.String("VPC_PEERING"),
//				PrefixLength: pulumi.Int(22),
//				Network:      network.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = datafusion.NewInstance(ctx, "extended_instance", &datafusion.InstanceArgs{
//				Name:                        pulumi.String("my-instance"),
//				Description:                 pulumi.String("My Data Fusion instance"),
//				DisplayName:                 pulumi.String("My Data Fusion instance"),
//				Region:                      pulumi.String("us-central1"),
//				Type:                        pulumi.String("BASIC"),
//				EnableStackdriverLogging:    pulumi.Bool(true),
//				EnableStackdriverMonitoring: pulumi.Bool(true),
//				PrivateInstance:             pulumi.Bool(true),
//				DataprocServiceAccount:      pulumi.String(_default.Email),
//				Labels: pulumi.StringMap{
//					"example_key": pulumi.String("example_value"),
//				},
//				NetworkConfig: &datafusion.InstanceNetworkConfigArgs{
//					Network: pulumi.String("default"),
//					IpAllocation: pulumi.All(privateIpAlloc.Address, privateIpAlloc.PrefixLength).ApplyT(func(_args []interface{}) (string, error) {
//						address := _args[0].(string)
//						prefixLength := _args[1].(int)
//						return fmt.Sprintf("%v/%v", address, prefixLength), nil
//					}).(pulumi.StringOutput),
//				},
//				Accelerators: datafusion.InstanceAcceleratorArray{
//					&datafusion.InstanceAcceleratorArgs{
//						AcceleratorType: pulumi.String("CDC"),
//						State:           pulumi.String("ENABLED"),
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
// ### Data Fusion Instance Psc
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/compute"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/datafusion"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			psc, err := compute.NewNetwork(ctx, "psc", &compute.NetworkArgs{
//				Name:                  pulumi.String("datafusion-psc-network"),
//				AutoCreateSubnetworks: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			pscSubnetwork, err := compute.NewSubnetwork(ctx, "psc", &compute.SubnetworkArgs{
//				Name:        pulumi.String("datafusion-psc-subnet"),
//				Region:      pulumi.String("us-central1"),
//				Network:     psc.ID(),
//				IpCidrRange: pulumi.String("10.0.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			pscNetworkAttachment, err := compute.NewNetworkAttachment(ctx, "psc", &compute.NetworkAttachmentArgs{
//				Name:                 pulumi.String("datafusion-psc-attachment"),
//				Region:               pulumi.String("us-central1"),
//				ConnectionPreference: pulumi.String("ACCEPT_AUTOMATIC"),
//				Subnetworks: pulumi.StringArray{
//					pscSubnetwork.SelfLink,
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = datafusion.NewInstance(ctx, "psc_instance", &datafusion.InstanceArgs{
//				Name:            pulumi.String("psc-instance"),
//				Region:          pulumi.String("us-central1"),
//				Type:            pulumi.String("BASIC"),
//				PrivateInstance: pulumi.Bool(true),
//				NetworkConfig: &datafusion.InstanceNetworkConfigArgs{
//					ConnectionType: pulumi.String("PRIVATE_SERVICE_CONNECT_INTERFACES"),
//					PrivateServiceConnectConfig: &datafusion.InstanceNetworkConfigPrivateServiceConnectConfigArgs{
//						NetworkAttachment:    pscNetworkAttachment.ID(),
//						UnreachableCidrBlock: pulumi.String("192.168.0.0/25"),
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
// ### Data Fusion Instance Cmek
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/datafusion"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/kms"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			keyRing, err := kms.NewKeyRing(ctx, "key_ring", &kms.KeyRingArgs{
//				Name:     pulumi.String("my-instance"),
//				Location: pulumi.String("us-central1"),
//			})
//			if err != nil {
//				return err
//			}
//			cryptoKey, err := kms.NewCryptoKey(ctx, "crypto_key", &kms.CryptoKeyArgs{
//				Name:    pulumi.String("my-instance"),
//				KeyRing: keyRing.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			project, err := organizations.LookupProject(ctx, &organizations.LookupProjectArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			cryptoKeyMember, err := kms.NewCryptoKeyIAMMember(ctx, "crypto_key_member", &kms.CryptoKeyIAMMemberArgs{
//				CryptoKeyId: cryptoKey.ID(),
//				Role:        pulumi.String("roles/cloudkms.cryptoKeyEncrypterDecrypter"),
//				Member:      pulumi.Sprintf("serviceAccount:service-%v@gcp-sa-datafusion.iam.gserviceaccount.com", project.Number),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = datafusion.NewInstance(ctx, "cmek", &datafusion.InstanceArgs{
//				Name:   pulumi.String("my-instance"),
//				Region: pulumi.String("us-central1"),
//				Type:   pulumi.String("BASIC"),
//				CryptoKeyConfig: &datafusion.InstanceCryptoKeyConfigArgs{
//					KeyReference: cryptoKey.ID(),
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				cryptoKeyMember,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Data Fusion Instance Enterprise
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/datafusion"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := datafusion.NewInstance(ctx, "enterprise_instance", &datafusion.InstanceArgs{
//				Name:       pulumi.String("my-instance"),
//				Region:     pulumi.String("us-central1"),
//				Type:       pulumi.String("ENTERPRISE"),
//				EnableRbac: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Data Fusion Instance Event
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/datafusion"
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/pubsub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			eventTopic, err := pubsub.NewTopic(ctx, "event", &pubsub.TopicArgs{
//				Name: pulumi.String("my-instance"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = datafusion.NewInstance(ctx, "event", &datafusion.InstanceArgs{
//				Name:   pulumi.String("my-instance"),
//				Region: pulumi.String("us-central1"),
//				Type:   pulumi.String("BASIC"),
//				EventPublishConfig: &datafusion.InstanceEventPublishConfigArgs{
//					Enabled: pulumi.Bool(true),
//					Topic:   eventTopic.ID(),
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
// ### Data Fusion Instance Zone
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/datafusion"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := datafusion.NewInstance(ctx, "zone", &datafusion.InstanceArgs{
//				Name:   pulumi.String("my-instance"),
//				Region: pulumi.String("us-central1"),
//				Zone:   pulumi.String("us-central1-a"),
//				Type:   pulumi.String("DEVELOPER"),
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
// Instance can be imported using any of these accepted formats:
//
// * `projects/{{project}}/locations/{{region}}/instances/{{name}}`
//
// * `{{project}}/{{region}}/{{name}}`
//
// * `{{region}}/{{name}}`
//
// * `{{name}}`
//
// When using the `pulumi import` command, Instance can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:securitycenter/instanceIamMember:InstanceIamMember default projects/{{project}}/locations/{{region}}/instances/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:securitycenter/instanceIamMember:InstanceIamMember default {{project}}/{{region}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:securitycenter/instanceIamMember:InstanceIamMember default {{region}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:securitycenter/instanceIamMember:InstanceIamMember default {{name}}
// ```
type InstanceIamMember struct {
	pulumi.CustomResourceState

	Condition InstanceIamMemberConditionPtrOutput `pulumi:"condition"`
	Etag      pulumi.StringOutput                 `pulumi:"etag"`
	Member    pulumi.StringOutput                 `pulumi:"member"`
	// The ID of the instance or a fully qualified identifier for the instance.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The region of the Data Fusion instance.
	Region pulumi.StringOutput `pulumi:"region"`
	Role   pulumi.StringOutput `pulumi:"role"`
}

// NewInstanceIamMember registers a new resource with the given unique name, arguments, and options.
func NewInstanceIamMember(ctx *pulumi.Context,
	name string, args *InstanceIamMemberArgs, opts ...pulumi.ResourceOption) (*InstanceIamMember, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Member == nil {
		return nil, errors.New("invalid value for required argument 'Member'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InstanceIamMember
	err := ctx.RegisterResource("gcp:securitycenter/instanceIamMember:InstanceIamMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstanceIamMember gets an existing InstanceIamMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstanceIamMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceIamMemberState, opts ...pulumi.ResourceOption) (*InstanceIamMember, error) {
	var resource InstanceIamMember
	err := ctx.ReadResource("gcp:securitycenter/instanceIamMember:InstanceIamMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstanceIamMember resources.
type instanceIamMemberState struct {
	Condition *InstanceIamMemberCondition `pulumi:"condition"`
	Etag      *string                     `pulumi:"etag"`
	Member    *string                     `pulumi:"member"`
	// The ID of the instance or a fully qualified identifier for the instance.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The region of the Data Fusion instance.
	Region *string `pulumi:"region"`
	Role   *string `pulumi:"role"`
}

type InstanceIamMemberState struct {
	Condition InstanceIamMemberConditionPtrInput
	Etag      pulumi.StringPtrInput
	Member    pulumi.StringPtrInput
	// The ID of the instance or a fully qualified identifier for the instance.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The region of the Data Fusion instance.
	Region pulumi.StringPtrInput
	Role   pulumi.StringPtrInput
}

func (InstanceIamMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceIamMemberState)(nil)).Elem()
}

type instanceIamMemberArgs struct {
	Condition *InstanceIamMemberCondition `pulumi:"condition"`
	Member    string                      `pulumi:"member"`
	// The ID of the instance or a fully qualified identifier for the instance.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The region of the Data Fusion instance.
	Region *string `pulumi:"region"`
	Role   string  `pulumi:"role"`
}

// The set of arguments for constructing a InstanceIamMember resource.
type InstanceIamMemberArgs struct {
	Condition InstanceIamMemberConditionPtrInput
	Member    pulumi.StringInput
	// The ID of the instance or a fully qualified identifier for the instance.
	Name pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The region of the Data Fusion instance.
	Region pulumi.StringPtrInput
	Role   pulumi.StringInput
}

func (InstanceIamMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceIamMemberArgs)(nil)).Elem()
}

type InstanceIamMemberInput interface {
	pulumi.Input

	ToInstanceIamMemberOutput() InstanceIamMemberOutput
	ToInstanceIamMemberOutputWithContext(ctx context.Context) InstanceIamMemberOutput
}

func (*InstanceIamMember) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceIamMember)(nil)).Elem()
}

func (i *InstanceIamMember) ToInstanceIamMemberOutput() InstanceIamMemberOutput {
	return i.ToInstanceIamMemberOutputWithContext(context.Background())
}

func (i *InstanceIamMember) ToInstanceIamMemberOutputWithContext(ctx context.Context) InstanceIamMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceIamMemberOutput)
}

// InstanceIamMemberArrayInput is an input type that accepts InstanceIamMemberArray and InstanceIamMemberArrayOutput values.
// You can construct a concrete instance of `InstanceIamMemberArrayInput` via:
//
//	InstanceIamMemberArray{ InstanceIamMemberArgs{...} }
type InstanceIamMemberArrayInput interface {
	pulumi.Input

	ToInstanceIamMemberArrayOutput() InstanceIamMemberArrayOutput
	ToInstanceIamMemberArrayOutputWithContext(context.Context) InstanceIamMemberArrayOutput
}

type InstanceIamMemberArray []InstanceIamMemberInput

func (InstanceIamMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceIamMember)(nil)).Elem()
}

func (i InstanceIamMemberArray) ToInstanceIamMemberArrayOutput() InstanceIamMemberArrayOutput {
	return i.ToInstanceIamMemberArrayOutputWithContext(context.Background())
}

func (i InstanceIamMemberArray) ToInstanceIamMemberArrayOutputWithContext(ctx context.Context) InstanceIamMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceIamMemberArrayOutput)
}

// InstanceIamMemberMapInput is an input type that accepts InstanceIamMemberMap and InstanceIamMemberMapOutput values.
// You can construct a concrete instance of `InstanceIamMemberMapInput` via:
//
//	InstanceIamMemberMap{ "key": InstanceIamMemberArgs{...} }
type InstanceIamMemberMapInput interface {
	pulumi.Input

	ToInstanceIamMemberMapOutput() InstanceIamMemberMapOutput
	ToInstanceIamMemberMapOutputWithContext(context.Context) InstanceIamMemberMapOutput
}

type InstanceIamMemberMap map[string]InstanceIamMemberInput

func (InstanceIamMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceIamMember)(nil)).Elem()
}

func (i InstanceIamMemberMap) ToInstanceIamMemberMapOutput() InstanceIamMemberMapOutput {
	return i.ToInstanceIamMemberMapOutputWithContext(context.Background())
}

func (i InstanceIamMemberMap) ToInstanceIamMemberMapOutputWithContext(ctx context.Context) InstanceIamMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceIamMemberMapOutput)
}

type InstanceIamMemberOutput struct{ *pulumi.OutputState }

func (InstanceIamMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceIamMember)(nil)).Elem()
}

func (o InstanceIamMemberOutput) ToInstanceIamMemberOutput() InstanceIamMemberOutput {
	return o
}

func (o InstanceIamMemberOutput) ToInstanceIamMemberOutputWithContext(ctx context.Context) InstanceIamMemberOutput {
	return o
}

func (o InstanceIamMemberOutput) Condition() InstanceIamMemberConditionPtrOutput {
	return o.ApplyT(func(v *InstanceIamMember) InstanceIamMemberConditionPtrOutput { return v.Condition }).(InstanceIamMemberConditionPtrOutput)
}

func (o InstanceIamMemberOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceIamMember) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

func (o InstanceIamMemberOutput) Member() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceIamMember) pulumi.StringOutput { return v.Member }).(pulumi.StringOutput)
}

// The ID of the instance or a fully qualified identifier for the instance.
func (o InstanceIamMemberOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceIamMember) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o InstanceIamMemberOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceIamMember) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The region of the Data Fusion instance.
func (o InstanceIamMemberOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceIamMember) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

func (o InstanceIamMemberOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceIamMember) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type InstanceIamMemberArrayOutput struct{ *pulumi.OutputState }

func (InstanceIamMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceIamMember)(nil)).Elem()
}

func (o InstanceIamMemberArrayOutput) ToInstanceIamMemberArrayOutput() InstanceIamMemberArrayOutput {
	return o
}

func (o InstanceIamMemberArrayOutput) ToInstanceIamMemberArrayOutputWithContext(ctx context.Context) InstanceIamMemberArrayOutput {
	return o
}

func (o InstanceIamMemberArrayOutput) Index(i pulumi.IntInput) InstanceIamMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstanceIamMember {
		return vs[0].([]*InstanceIamMember)[vs[1].(int)]
	}).(InstanceIamMemberOutput)
}

type InstanceIamMemberMapOutput struct{ *pulumi.OutputState }

func (InstanceIamMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceIamMember)(nil)).Elem()
}

func (o InstanceIamMemberMapOutput) ToInstanceIamMemberMapOutput() InstanceIamMemberMapOutput {
	return o
}

func (o InstanceIamMemberMapOutput) ToInstanceIamMemberMapOutputWithContext(ctx context.Context) InstanceIamMemberMapOutput {
	return o
}

func (o InstanceIamMemberMapOutput) MapIndex(k pulumi.StringInput) InstanceIamMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstanceIamMember {
		return vs[0].(map[string]*InstanceIamMember)[vs[1].(string)]
	}).(InstanceIamMemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceIamMemberInput)(nil)).Elem(), &InstanceIamMember{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceIamMemberArrayInput)(nil)).Elem(), InstanceIamMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceIamMemberMapInput)(nil)).Elem(), InstanceIamMemberMap{})
	pulumi.RegisterOutputType(InstanceIamMemberOutput{})
	pulumi.RegisterOutputType(InstanceIamMemberArrayOutput{})
	pulumi.RegisterOutputType(InstanceIamMemberMapOutput{})
}
