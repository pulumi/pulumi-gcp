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
// $ pulumi import gcp:securitycenter/instanceIamPolicy:InstanceIamPolicy default projects/{{project}}/locations/{{region}}/instances/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:securitycenter/instanceIamPolicy:InstanceIamPolicy default {{project}}/{{region}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:securitycenter/instanceIamPolicy:InstanceIamPolicy default {{region}}/{{name}}
// ```
//
// ```sh
// $ pulumi import gcp:securitycenter/instanceIamPolicy:InstanceIamPolicy default {{name}}
// ```
type InstanceIamPolicy struct {
	pulumi.CustomResourceState

	Etag pulumi.StringOutput `pulumi:"etag"`
	// The ID of the instance or a fully qualified identifier for the instance.
	Name       pulumi.StringOutput `pulumi:"name"`
	PolicyData pulumi.StringOutput `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringOutput `pulumi:"project"`
	// The region of the Data Fusion instance.
	Region pulumi.StringOutput `pulumi:"region"`
}

// NewInstanceIamPolicy registers a new resource with the given unique name, arguments, and options.
func NewInstanceIamPolicy(ctx *pulumi.Context,
	name string, args *InstanceIamPolicyArgs, opts ...pulumi.ResourceOption) (*InstanceIamPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PolicyData == nil {
		return nil, errors.New("invalid value for required argument 'PolicyData'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InstanceIamPolicy
	err := ctx.RegisterResource("gcp:securitycenter/instanceIamPolicy:InstanceIamPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstanceIamPolicy gets an existing InstanceIamPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstanceIamPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceIamPolicyState, opts ...pulumi.ResourceOption) (*InstanceIamPolicy, error) {
	var resource InstanceIamPolicy
	err := ctx.ReadResource("gcp:securitycenter/instanceIamPolicy:InstanceIamPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstanceIamPolicy resources.
type instanceIamPolicyState struct {
	Etag *string `pulumi:"etag"`
	// The ID of the instance or a fully qualified identifier for the instance.
	Name       *string `pulumi:"name"`
	PolicyData *string `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The region of the Data Fusion instance.
	Region *string `pulumi:"region"`
}

type InstanceIamPolicyState struct {
	Etag pulumi.StringPtrInput
	// The ID of the instance or a fully qualified identifier for the instance.
	Name       pulumi.StringPtrInput
	PolicyData pulumi.StringPtrInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The region of the Data Fusion instance.
	Region pulumi.StringPtrInput
}

func (InstanceIamPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceIamPolicyState)(nil)).Elem()
}

type instanceIamPolicyArgs struct {
	// The ID of the instance or a fully qualified identifier for the instance.
	Name       *string `pulumi:"name"`
	PolicyData string  `pulumi:"policyData"`
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The region of the Data Fusion instance.
	Region *string `pulumi:"region"`
}

// The set of arguments for constructing a InstanceIamPolicy resource.
type InstanceIamPolicyArgs struct {
	// The ID of the instance or a fully qualified identifier for the instance.
	Name       pulumi.StringPtrInput
	PolicyData pulumi.StringInput
	// The ID of the project in which the resource belongs.
	// If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput
	// The region of the Data Fusion instance.
	Region pulumi.StringPtrInput
}

func (InstanceIamPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceIamPolicyArgs)(nil)).Elem()
}

type InstanceIamPolicyInput interface {
	pulumi.Input

	ToInstanceIamPolicyOutput() InstanceIamPolicyOutput
	ToInstanceIamPolicyOutputWithContext(ctx context.Context) InstanceIamPolicyOutput
}

func (*InstanceIamPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceIamPolicy)(nil)).Elem()
}

func (i *InstanceIamPolicy) ToInstanceIamPolicyOutput() InstanceIamPolicyOutput {
	return i.ToInstanceIamPolicyOutputWithContext(context.Background())
}

func (i *InstanceIamPolicy) ToInstanceIamPolicyOutputWithContext(ctx context.Context) InstanceIamPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceIamPolicyOutput)
}

// InstanceIamPolicyArrayInput is an input type that accepts InstanceIamPolicyArray and InstanceIamPolicyArrayOutput values.
// You can construct a concrete instance of `InstanceIamPolicyArrayInput` via:
//
//	InstanceIamPolicyArray{ InstanceIamPolicyArgs{...} }
type InstanceIamPolicyArrayInput interface {
	pulumi.Input

	ToInstanceIamPolicyArrayOutput() InstanceIamPolicyArrayOutput
	ToInstanceIamPolicyArrayOutputWithContext(context.Context) InstanceIamPolicyArrayOutput
}

type InstanceIamPolicyArray []InstanceIamPolicyInput

func (InstanceIamPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceIamPolicy)(nil)).Elem()
}

func (i InstanceIamPolicyArray) ToInstanceIamPolicyArrayOutput() InstanceIamPolicyArrayOutput {
	return i.ToInstanceIamPolicyArrayOutputWithContext(context.Background())
}

func (i InstanceIamPolicyArray) ToInstanceIamPolicyArrayOutputWithContext(ctx context.Context) InstanceIamPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceIamPolicyArrayOutput)
}

// InstanceIamPolicyMapInput is an input type that accepts InstanceIamPolicyMap and InstanceIamPolicyMapOutput values.
// You can construct a concrete instance of `InstanceIamPolicyMapInput` via:
//
//	InstanceIamPolicyMap{ "key": InstanceIamPolicyArgs{...} }
type InstanceIamPolicyMapInput interface {
	pulumi.Input

	ToInstanceIamPolicyMapOutput() InstanceIamPolicyMapOutput
	ToInstanceIamPolicyMapOutputWithContext(context.Context) InstanceIamPolicyMapOutput
}

type InstanceIamPolicyMap map[string]InstanceIamPolicyInput

func (InstanceIamPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceIamPolicy)(nil)).Elem()
}

func (i InstanceIamPolicyMap) ToInstanceIamPolicyMapOutput() InstanceIamPolicyMapOutput {
	return i.ToInstanceIamPolicyMapOutputWithContext(context.Background())
}

func (i InstanceIamPolicyMap) ToInstanceIamPolicyMapOutputWithContext(ctx context.Context) InstanceIamPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceIamPolicyMapOutput)
}

type InstanceIamPolicyOutput struct{ *pulumi.OutputState }

func (InstanceIamPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceIamPolicy)(nil)).Elem()
}

func (o InstanceIamPolicyOutput) ToInstanceIamPolicyOutput() InstanceIamPolicyOutput {
	return o
}

func (o InstanceIamPolicyOutput) ToInstanceIamPolicyOutputWithContext(ctx context.Context) InstanceIamPolicyOutput {
	return o
}

func (o InstanceIamPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceIamPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The ID of the instance or a fully qualified identifier for the instance.
func (o InstanceIamPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceIamPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o InstanceIamPolicyOutput) PolicyData() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceIamPolicy) pulumi.StringOutput { return v.PolicyData }).(pulumi.StringOutput)
}

// The ID of the project in which the resource belongs.
// If it is not provided, the provider project is used.
func (o InstanceIamPolicyOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceIamPolicy) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The region of the Data Fusion instance.
func (o InstanceIamPolicyOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceIamPolicy) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

type InstanceIamPolicyArrayOutput struct{ *pulumi.OutputState }

func (InstanceIamPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceIamPolicy)(nil)).Elem()
}

func (o InstanceIamPolicyArrayOutput) ToInstanceIamPolicyArrayOutput() InstanceIamPolicyArrayOutput {
	return o
}

func (o InstanceIamPolicyArrayOutput) ToInstanceIamPolicyArrayOutputWithContext(ctx context.Context) InstanceIamPolicyArrayOutput {
	return o
}

func (o InstanceIamPolicyArrayOutput) Index(i pulumi.IntInput) InstanceIamPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstanceIamPolicy {
		return vs[0].([]*InstanceIamPolicy)[vs[1].(int)]
	}).(InstanceIamPolicyOutput)
}

type InstanceIamPolicyMapOutput struct{ *pulumi.OutputState }

func (InstanceIamPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceIamPolicy)(nil)).Elem()
}

func (o InstanceIamPolicyMapOutput) ToInstanceIamPolicyMapOutput() InstanceIamPolicyMapOutput {
	return o
}

func (o InstanceIamPolicyMapOutput) ToInstanceIamPolicyMapOutputWithContext(ctx context.Context) InstanceIamPolicyMapOutput {
	return o
}

func (o InstanceIamPolicyMapOutput) MapIndex(k pulumi.StringInput) InstanceIamPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstanceIamPolicy {
		return vs[0].(map[string]*InstanceIamPolicy)[vs[1].(string)]
	}).(InstanceIamPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceIamPolicyInput)(nil)).Elem(), &InstanceIamPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceIamPolicyArrayInput)(nil)).Elem(), InstanceIamPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceIamPolicyMapInput)(nil)).Elem(), InstanceIamPolicyMap{})
	pulumi.RegisterOutputType(InstanceIamPolicyOutput{})
	pulumi.RegisterOutputType(InstanceIamPolicyArrayOutput{})
	pulumi.RegisterOutputType(InstanceIamPolicyMapOutput{})
}
