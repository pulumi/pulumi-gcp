// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apigee

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// An alias from a key/certificate pair.
//
// To get more information about KeystoresAliasesKeyCertFile, see:
//
// * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.keystores.aliases)
// * How-to Guides
//   - [Keystores Aliases](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.keystores.aliases)
//
// ## Import
//
// KeystoresAliasesKeyCertFile can be imported using any of these accepted formats:
//
// * `organizations/{{org_id}}/environments/{{environment}}/keystores/{{keystore}}/aliases/{{alias}}`
//
// * `{{org_id}}/{{environment}}/{{keystore}}/{{alias}}`
//
// When using the `pulumi import` command, KeystoresAliasesKeyCertFile can be imported using one of the formats above. For example:
//
// ```sh
// $ pulumi import gcp:apigee/keystoresAliasesKeyCertFile:KeystoresAliasesKeyCertFile default organizations/{{org_id}}/environments/{{environment}}/keystores/{{keystore}}/aliases/{{alias}}
// ```
//
// ```sh
// $ pulumi import gcp:apigee/keystoresAliasesKeyCertFile:KeystoresAliasesKeyCertFile default {{org_id}}/{{environment}}/{{keystore}}/{{alias}}
// ```
type KeystoresAliasesKeyCertFile struct {
	pulumi.CustomResourceState

	// Alias Name
	Alias pulumi.StringOutput `pulumi:"alias"`
	// Cert content
	//
	// ***
	Cert pulumi.StringOutput `pulumi:"cert"`
	// Chain of certificates under this alias.
	// Structure is documented below.
	CertsInfo KeystoresAliasesKeyCertFileCertsInfoOutput `pulumi:"certsInfo"`
	// Environment associated with the alias
	Environment pulumi.StringOutput `pulumi:"environment"`
	// Private Key content, omit if uploading to truststore
	Key pulumi.StringPtrOutput `pulumi:"key"`
	// Keystore Name
	Keystore pulumi.StringOutput `pulumi:"keystore"`
	// Organization ID associated with the alias, without organization/ prefix
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// Password for the Private Key if it's encrypted
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// Optional.Type of Alias
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewKeystoresAliasesKeyCertFile registers a new resource with the given unique name, arguments, and options.
func NewKeystoresAliasesKeyCertFile(ctx *pulumi.Context,
	name string, args *KeystoresAliasesKeyCertFileArgs, opts ...pulumi.ResourceOption) (*KeystoresAliasesKeyCertFile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Alias == nil {
		return nil, errors.New("invalid value for required argument 'Alias'")
	}
	if args.Cert == nil {
		return nil, errors.New("invalid value for required argument 'Cert'")
	}
	if args.Environment == nil {
		return nil, errors.New("invalid value for required argument 'Environment'")
	}
	if args.Keystore == nil {
		return nil, errors.New("invalid value for required argument 'Keystore'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.Key != nil {
		args.Key = pulumi.ToSecret(args.Key).(pulumi.StringPtrInput)
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"key",
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource KeystoresAliasesKeyCertFile
	err := ctx.RegisterResource("gcp:apigee/keystoresAliasesKeyCertFile:KeystoresAliasesKeyCertFile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKeystoresAliasesKeyCertFile gets an existing KeystoresAliasesKeyCertFile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKeystoresAliasesKeyCertFile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KeystoresAliasesKeyCertFileState, opts ...pulumi.ResourceOption) (*KeystoresAliasesKeyCertFile, error) {
	var resource KeystoresAliasesKeyCertFile
	err := ctx.ReadResource("gcp:apigee/keystoresAliasesKeyCertFile:KeystoresAliasesKeyCertFile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KeystoresAliasesKeyCertFile resources.
type keystoresAliasesKeyCertFileState struct {
	// Alias Name
	Alias *string `pulumi:"alias"`
	// Cert content
	//
	// ***
	Cert *string `pulumi:"cert"`
	// Chain of certificates under this alias.
	// Structure is documented below.
	CertsInfo *KeystoresAliasesKeyCertFileCertsInfo `pulumi:"certsInfo"`
	// Environment associated with the alias
	Environment *string `pulumi:"environment"`
	// Private Key content, omit if uploading to truststore
	Key *string `pulumi:"key"`
	// Keystore Name
	Keystore *string `pulumi:"keystore"`
	// Organization ID associated with the alias, without organization/ prefix
	OrgId *string `pulumi:"orgId"`
	// Password for the Private Key if it's encrypted
	Password *string `pulumi:"password"`
	// Optional.Type of Alias
	Type *string `pulumi:"type"`
}

type KeystoresAliasesKeyCertFileState struct {
	// Alias Name
	Alias pulumi.StringPtrInput
	// Cert content
	//
	// ***
	Cert pulumi.StringPtrInput
	// Chain of certificates under this alias.
	// Structure is documented below.
	CertsInfo KeystoresAliasesKeyCertFileCertsInfoPtrInput
	// Environment associated with the alias
	Environment pulumi.StringPtrInput
	// Private Key content, omit if uploading to truststore
	Key pulumi.StringPtrInput
	// Keystore Name
	Keystore pulumi.StringPtrInput
	// Organization ID associated with the alias, without organization/ prefix
	OrgId pulumi.StringPtrInput
	// Password for the Private Key if it's encrypted
	Password pulumi.StringPtrInput
	// Optional.Type of Alias
	Type pulumi.StringPtrInput
}

func (KeystoresAliasesKeyCertFileState) ElementType() reflect.Type {
	return reflect.TypeOf((*keystoresAliasesKeyCertFileState)(nil)).Elem()
}

type keystoresAliasesKeyCertFileArgs struct {
	// Alias Name
	Alias string `pulumi:"alias"`
	// Cert content
	//
	// ***
	Cert string `pulumi:"cert"`
	// Chain of certificates under this alias.
	// Structure is documented below.
	CertsInfo *KeystoresAliasesKeyCertFileCertsInfo `pulumi:"certsInfo"`
	// Environment associated with the alias
	Environment string `pulumi:"environment"`
	// Private Key content, omit if uploading to truststore
	Key *string `pulumi:"key"`
	// Keystore Name
	Keystore string `pulumi:"keystore"`
	// Organization ID associated with the alias, without organization/ prefix
	OrgId string `pulumi:"orgId"`
	// Password for the Private Key if it's encrypted
	Password *string `pulumi:"password"`
}

// The set of arguments for constructing a KeystoresAliasesKeyCertFile resource.
type KeystoresAliasesKeyCertFileArgs struct {
	// Alias Name
	Alias pulumi.StringInput
	// Cert content
	//
	// ***
	Cert pulumi.StringInput
	// Chain of certificates under this alias.
	// Structure is documented below.
	CertsInfo KeystoresAliasesKeyCertFileCertsInfoPtrInput
	// Environment associated with the alias
	Environment pulumi.StringInput
	// Private Key content, omit if uploading to truststore
	Key pulumi.StringPtrInput
	// Keystore Name
	Keystore pulumi.StringInput
	// Organization ID associated with the alias, without organization/ prefix
	OrgId pulumi.StringInput
	// Password for the Private Key if it's encrypted
	Password pulumi.StringPtrInput
}

func (KeystoresAliasesKeyCertFileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*keystoresAliasesKeyCertFileArgs)(nil)).Elem()
}

type KeystoresAliasesKeyCertFileInput interface {
	pulumi.Input

	ToKeystoresAliasesKeyCertFileOutput() KeystoresAliasesKeyCertFileOutput
	ToKeystoresAliasesKeyCertFileOutputWithContext(ctx context.Context) KeystoresAliasesKeyCertFileOutput
}

func (*KeystoresAliasesKeyCertFile) ElementType() reflect.Type {
	return reflect.TypeOf((**KeystoresAliasesKeyCertFile)(nil)).Elem()
}

func (i *KeystoresAliasesKeyCertFile) ToKeystoresAliasesKeyCertFileOutput() KeystoresAliasesKeyCertFileOutput {
	return i.ToKeystoresAliasesKeyCertFileOutputWithContext(context.Background())
}

func (i *KeystoresAliasesKeyCertFile) ToKeystoresAliasesKeyCertFileOutputWithContext(ctx context.Context) KeystoresAliasesKeyCertFileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KeystoresAliasesKeyCertFileOutput)
}

// KeystoresAliasesKeyCertFileArrayInput is an input type that accepts KeystoresAliasesKeyCertFileArray and KeystoresAliasesKeyCertFileArrayOutput values.
// You can construct a concrete instance of `KeystoresAliasesKeyCertFileArrayInput` via:
//
//	KeystoresAliasesKeyCertFileArray{ KeystoresAliasesKeyCertFileArgs{...} }
type KeystoresAliasesKeyCertFileArrayInput interface {
	pulumi.Input

	ToKeystoresAliasesKeyCertFileArrayOutput() KeystoresAliasesKeyCertFileArrayOutput
	ToKeystoresAliasesKeyCertFileArrayOutputWithContext(context.Context) KeystoresAliasesKeyCertFileArrayOutput
}

type KeystoresAliasesKeyCertFileArray []KeystoresAliasesKeyCertFileInput

func (KeystoresAliasesKeyCertFileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KeystoresAliasesKeyCertFile)(nil)).Elem()
}

func (i KeystoresAliasesKeyCertFileArray) ToKeystoresAliasesKeyCertFileArrayOutput() KeystoresAliasesKeyCertFileArrayOutput {
	return i.ToKeystoresAliasesKeyCertFileArrayOutputWithContext(context.Background())
}

func (i KeystoresAliasesKeyCertFileArray) ToKeystoresAliasesKeyCertFileArrayOutputWithContext(ctx context.Context) KeystoresAliasesKeyCertFileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KeystoresAliasesKeyCertFileArrayOutput)
}

// KeystoresAliasesKeyCertFileMapInput is an input type that accepts KeystoresAliasesKeyCertFileMap and KeystoresAliasesKeyCertFileMapOutput values.
// You can construct a concrete instance of `KeystoresAliasesKeyCertFileMapInput` via:
//
//	KeystoresAliasesKeyCertFileMap{ "key": KeystoresAliasesKeyCertFileArgs{...} }
type KeystoresAliasesKeyCertFileMapInput interface {
	pulumi.Input

	ToKeystoresAliasesKeyCertFileMapOutput() KeystoresAliasesKeyCertFileMapOutput
	ToKeystoresAliasesKeyCertFileMapOutputWithContext(context.Context) KeystoresAliasesKeyCertFileMapOutput
}

type KeystoresAliasesKeyCertFileMap map[string]KeystoresAliasesKeyCertFileInput

func (KeystoresAliasesKeyCertFileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KeystoresAliasesKeyCertFile)(nil)).Elem()
}

func (i KeystoresAliasesKeyCertFileMap) ToKeystoresAliasesKeyCertFileMapOutput() KeystoresAliasesKeyCertFileMapOutput {
	return i.ToKeystoresAliasesKeyCertFileMapOutputWithContext(context.Background())
}

func (i KeystoresAliasesKeyCertFileMap) ToKeystoresAliasesKeyCertFileMapOutputWithContext(ctx context.Context) KeystoresAliasesKeyCertFileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KeystoresAliasesKeyCertFileMapOutput)
}

type KeystoresAliasesKeyCertFileOutput struct{ *pulumi.OutputState }

func (KeystoresAliasesKeyCertFileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KeystoresAliasesKeyCertFile)(nil)).Elem()
}

func (o KeystoresAliasesKeyCertFileOutput) ToKeystoresAliasesKeyCertFileOutput() KeystoresAliasesKeyCertFileOutput {
	return o
}

func (o KeystoresAliasesKeyCertFileOutput) ToKeystoresAliasesKeyCertFileOutputWithContext(ctx context.Context) KeystoresAliasesKeyCertFileOutput {
	return o
}

// Alias Name
func (o KeystoresAliasesKeyCertFileOutput) Alias() pulumi.StringOutput {
	return o.ApplyT(func(v *KeystoresAliasesKeyCertFile) pulumi.StringOutput { return v.Alias }).(pulumi.StringOutput)
}

// Cert content
//
// ***
func (o KeystoresAliasesKeyCertFileOutput) Cert() pulumi.StringOutput {
	return o.ApplyT(func(v *KeystoresAliasesKeyCertFile) pulumi.StringOutput { return v.Cert }).(pulumi.StringOutput)
}

// Chain of certificates under this alias.
// Structure is documented below.
func (o KeystoresAliasesKeyCertFileOutput) CertsInfo() KeystoresAliasesKeyCertFileCertsInfoOutput {
	return o.ApplyT(func(v *KeystoresAliasesKeyCertFile) KeystoresAliasesKeyCertFileCertsInfoOutput { return v.CertsInfo }).(KeystoresAliasesKeyCertFileCertsInfoOutput)
}

// Environment associated with the alias
func (o KeystoresAliasesKeyCertFileOutput) Environment() pulumi.StringOutput {
	return o.ApplyT(func(v *KeystoresAliasesKeyCertFile) pulumi.StringOutput { return v.Environment }).(pulumi.StringOutput)
}

// Private Key content, omit if uploading to truststore
func (o KeystoresAliasesKeyCertFileOutput) Key() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KeystoresAliasesKeyCertFile) pulumi.StringPtrOutput { return v.Key }).(pulumi.StringPtrOutput)
}

// Keystore Name
func (o KeystoresAliasesKeyCertFileOutput) Keystore() pulumi.StringOutput {
	return o.ApplyT(func(v *KeystoresAliasesKeyCertFile) pulumi.StringOutput { return v.Keystore }).(pulumi.StringOutput)
}

// Organization ID associated with the alias, without organization/ prefix
func (o KeystoresAliasesKeyCertFileOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *KeystoresAliasesKeyCertFile) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Password for the Private Key if it's encrypted
func (o KeystoresAliasesKeyCertFileOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KeystoresAliasesKeyCertFile) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// Optional.Type of Alias
func (o KeystoresAliasesKeyCertFileOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *KeystoresAliasesKeyCertFile) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type KeystoresAliasesKeyCertFileArrayOutput struct{ *pulumi.OutputState }

func (KeystoresAliasesKeyCertFileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KeystoresAliasesKeyCertFile)(nil)).Elem()
}

func (o KeystoresAliasesKeyCertFileArrayOutput) ToKeystoresAliasesKeyCertFileArrayOutput() KeystoresAliasesKeyCertFileArrayOutput {
	return o
}

func (o KeystoresAliasesKeyCertFileArrayOutput) ToKeystoresAliasesKeyCertFileArrayOutputWithContext(ctx context.Context) KeystoresAliasesKeyCertFileArrayOutput {
	return o
}

func (o KeystoresAliasesKeyCertFileArrayOutput) Index(i pulumi.IntInput) KeystoresAliasesKeyCertFileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *KeystoresAliasesKeyCertFile {
		return vs[0].([]*KeystoresAliasesKeyCertFile)[vs[1].(int)]
	}).(KeystoresAliasesKeyCertFileOutput)
}

type KeystoresAliasesKeyCertFileMapOutput struct{ *pulumi.OutputState }

func (KeystoresAliasesKeyCertFileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KeystoresAliasesKeyCertFile)(nil)).Elem()
}

func (o KeystoresAliasesKeyCertFileMapOutput) ToKeystoresAliasesKeyCertFileMapOutput() KeystoresAliasesKeyCertFileMapOutput {
	return o
}

func (o KeystoresAliasesKeyCertFileMapOutput) ToKeystoresAliasesKeyCertFileMapOutputWithContext(ctx context.Context) KeystoresAliasesKeyCertFileMapOutput {
	return o
}

func (o KeystoresAliasesKeyCertFileMapOutput) MapIndex(k pulumi.StringInput) KeystoresAliasesKeyCertFileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *KeystoresAliasesKeyCertFile {
		return vs[0].(map[string]*KeystoresAliasesKeyCertFile)[vs[1].(string)]
	}).(KeystoresAliasesKeyCertFileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KeystoresAliasesKeyCertFileInput)(nil)).Elem(), &KeystoresAliasesKeyCertFile{})
	pulumi.RegisterInputType(reflect.TypeOf((*KeystoresAliasesKeyCertFileArrayInput)(nil)).Elem(), KeystoresAliasesKeyCertFileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KeystoresAliasesKeyCertFileMapInput)(nil)).Elem(), KeystoresAliasesKeyCertFileMap{})
	pulumi.RegisterOutputType(KeystoresAliasesKeyCertFileOutput{})
	pulumi.RegisterOutputType(KeystoresAliasesKeyCertFileArrayOutput{})
	pulumi.RegisterOutputType(KeystoresAliasesKeyCertFileMapOutput{})
}
