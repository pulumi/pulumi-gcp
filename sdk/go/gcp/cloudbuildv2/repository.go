// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudbuildv2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Beta only: The Cloudbuildv2 Repository resource
//
// ## Example Usage
// ### Ghe
// ```go
// package main
//
// import (
//
//	"os"
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/cloudbuildv2"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/secretmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func readFileOrPanic(path string) pulumi.StringPtrInput {
//		data, err := os.ReadFile(path)
//		if err != nil {
//			panic(err.Error())
//		}
//		return pulumi.String(string(data))
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := secretmanager.NewSecret(ctx, "private-key-secret", &secretmanager.SecretArgs{
//				SecretId: pulumi.String("ghe-pk-secret"),
//				Replication: &secretmanager.SecretReplicationArgs{
//					Automatic: pulumi.Bool(true),
//				},
//			}, pulumi.Provider(google_beta))
//			if err != nil {
//				return err
//			}
//			_, err = secretmanager.NewSecretVersion(ctx, "private-key-secret-version", &secretmanager.SecretVersionArgs{
//				Secret:     private_key_secret.ID(),
//				SecretData: readFileOrPanic("private-key.pem"),
//			}, pulumi.Provider(google_beta))
//			if err != nil {
//				return err
//			}
//			_, err = secretmanager.NewSecret(ctx, "webhook-secret-secret", &secretmanager.SecretArgs{
//				SecretId: pulumi.String("github-token-secret"),
//				Replication: &secretmanager.SecretReplicationArgs{
//					Automatic: pulumi.Bool(true),
//				},
//			}, pulumi.Provider(google_beta))
//			if err != nil {
//				return err
//			}
//			_, err = secretmanager.NewSecretVersion(ctx, "webhook-secret-secret-version", &secretmanager.SecretVersionArgs{
//				Secret:     webhook_secret_secret.ID(),
//				SecretData: pulumi.String("<webhook-secret-data>"),
//			}, pulumi.Provider(google_beta))
//			if err != nil {
//				return err
//			}
//			p4sa_secretAccessor, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
//				Bindings: []organizations.GetIAMPolicyBinding{
//					{
//						Role: "roles/secretmanager.secretAccessor",
//						Members: []string{
//							"serviceAccount:service-123456789@gcp-sa-cloudbuild.iam.gserviceaccount.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = secretmanager.NewSecretIamPolicy(ctx, "policy-pk", &secretmanager.SecretIamPolicyArgs{
//				SecretId:   private_key_secret.SecretId,
//				PolicyData: *pulumi.String(p4sa_secretAccessor.PolicyData),
//			}, pulumi.Provider(google_beta))
//			if err != nil {
//				return err
//			}
//			_, err = secretmanager.NewSecretIamPolicy(ctx, "policy-whs", &secretmanager.SecretIamPolicyArgs{
//				SecretId:   webhook_secret_secret.SecretId,
//				PolicyData: *pulumi.String(p4sa_secretAccessor.PolicyData),
//			}, pulumi.Provider(google_beta))
//			if err != nil {
//				return err
//			}
//			_, err = cloudbuildv2.NewConnection(ctx, "my-connection", &cloudbuildv2.ConnectionArgs{
//				Location: pulumi.String("us-central1"),
//				GithubEnterpriseConfig: &cloudbuildv2.ConnectionGithubEnterpriseConfigArgs{
//					HostUri:                    pulumi.String("https://ghe.com"),
//					PrivateKeySecretVersion:    private_key_secret_version.ID(),
//					WebhookSecretSecretVersion: webhook_secret_secret_version.ID(),
//					AppId:                      pulumi.Int(200),
//					AppSlug:                    pulumi.String("gcb-app"),
//					AppInstallationId:          pulumi.Int(300),
//				},
//			}, pulumi.Provider(google_beta), pulumi.DependsOn([]pulumi.Resource{
//				policy_pk,
//				policy_whs,
//			}))
//			if err != nil {
//				return err
//			}
//			_, err = cloudbuildv2.NewRepository(ctx, "my-repository", &cloudbuildv2.RepositoryArgs{
//				Location:         pulumi.String("us-central1"),
//				ParentConnection: my_connection.ID(),
//				RemoteUri:        pulumi.String("https://ghe.com/hashicorp/terraform-provider-google.git"),
//			}, pulumi.Provider(google_beta))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Repository In GitHub Connection
// Creates a Repository resource inside a Connection to github.com
// ```go
// package main
//
// import (
//
//	"os"
//
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/cloudbuildv2"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/organizations"
//	"github.com/pulumi/pulumi-gcp/sdk/v6/go/gcp/secretmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func readFileOrPanic(path string) pulumi.StringPtrInput {
//		data, err := os.ReadFile(path)
//		if err != nil {
//			panic(err.Error())
//		}
//		return pulumi.String(string(data))
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := secretmanager.NewSecret(ctx, "github-token-secret", &secretmanager.SecretArgs{
//				SecretId: pulumi.String("github-token-secret"),
//				Replication: &secretmanager.SecretReplicationArgs{
//					Automatic: pulumi.Bool(true),
//				},
//			}, pulumi.Provider(google_beta))
//			if err != nil {
//				return err
//			}
//			_, err = secretmanager.NewSecretVersion(ctx, "github-token-secret-version", &secretmanager.SecretVersionArgs{
//				Secret:     github_token_secret.ID(),
//				SecretData: readFileOrPanic("my-github-token.txt"),
//			}, pulumi.Provider(google_beta))
//			if err != nil {
//				return err
//			}
//			p4sa_secretAccessor, err := organizations.LookupIAMPolicy(ctx, &organizations.LookupIAMPolicyArgs{
//				Bindings: []organizations.GetIAMPolicyBinding{
//					{
//						Role: "roles/secretmanager.secretAccessor",
//						Members: []string{
//							"serviceAccount:service-123456789@gcp-sa-cloudbuild.iam.gserviceaccount.com",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = secretmanager.NewSecretIamPolicy(ctx, "policy", &secretmanager.SecretIamPolicyArgs{
//				SecretId:   github_token_secret.SecretId,
//				PolicyData: *pulumi.String(p4sa_secretAccessor.PolicyData),
//			}, pulumi.Provider(google_beta))
//			if err != nil {
//				return err
//			}
//			_, err = cloudbuildv2.NewConnection(ctx, "my-connection", &cloudbuildv2.ConnectionArgs{
//				Location: pulumi.String("us-west1"),
//				GithubConfig: &cloudbuildv2.ConnectionGithubConfigArgs{
//					AppInstallationId: pulumi.Int(123123),
//					AuthorizerCredential: &cloudbuildv2.ConnectionGithubConfigAuthorizerCredentialArgs{
//						OauthTokenSecretVersion: github_token_secret_version.ID(),
//					},
//				},
//			}, pulumi.Provider(google_beta))
//			if err != nil {
//				return err
//			}
//			_, err = cloudbuildv2.NewRepository(ctx, "my-repository", &cloudbuildv2.RepositoryArgs{
//				Location:         pulumi.String("us-west1"),
//				ParentConnection: my_connection.Name,
//				RemoteUri:        pulumi.String("https://github.com/myuser/myrepo.git"),
//			}, pulumi.Provider(google_beta))
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
// # Repository can be imported using any of these accepted formats
//
// ```sh
//
//	$ pulumi import gcp:cloudbuildv2/repository:Repository default projects/{{project}}/locations/{{location}}/connections/{{parent_connection}}/repositories/{{name}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:cloudbuildv2/repository:Repository default {{project}}/{{location}}/{{parent_connection}}/{{name}}
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:cloudbuildv2/repository:Repository default {{location}}/{{parent_connection}}/{{name}}
//
// ```
type Repository struct {
	pulumi.CustomResourceState

	// Allows clients to store small amounts of arbitrary data.
	Annotations pulumi.StringMapOutput `pulumi:"annotations"`
	// Output only. Server assigned timestamp for when the connection was created.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The location for the resource
	Location pulumi.StringOutput `pulumi:"location"`
	// Name of the repository.
	Name pulumi.StringOutput `pulumi:"name"`
	// The connection for the resource
	ParentConnection pulumi.StringOutput `pulumi:"parentConnection"`
	// The project for the resource
	Project pulumi.StringOutput `pulumi:"project"`
	// Required. Git Clone HTTPS URI.
	RemoteUri pulumi.StringOutput `pulumi:"remoteUri"`
	// Output only. Server assigned timestamp for when the connection was updated.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewRepository registers a new resource with the given unique name, arguments, and options.
func NewRepository(ctx *pulumi.Context,
	name string, args *RepositoryArgs, opts ...pulumi.ResourceOption) (*Repository, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ParentConnection == nil {
		return nil, errors.New("invalid value for required argument 'ParentConnection'")
	}
	if args.RemoteUri == nil {
		return nil, errors.New("invalid value for required argument 'RemoteUri'")
	}
	var resource Repository
	err := ctx.RegisterResource("gcp:cloudbuildv2/repository:Repository", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRepository gets an existing Repository resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRepository(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RepositoryState, opts ...pulumi.ResourceOption) (*Repository, error) {
	var resource Repository
	err := ctx.ReadResource("gcp:cloudbuildv2/repository:Repository", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Repository resources.
type repositoryState struct {
	// Allows clients to store small amounts of arbitrary data.
	Annotations map[string]string `pulumi:"annotations"`
	// Output only. Server assigned timestamp for when the connection was created.
	CreateTime *string `pulumi:"createTime"`
	// This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
	Etag *string `pulumi:"etag"`
	// The location for the resource
	Location *string `pulumi:"location"`
	// Name of the repository.
	Name *string `pulumi:"name"`
	// The connection for the resource
	ParentConnection *string `pulumi:"parentConnection"`
	// The project for the resource
	Project *string `pulumi:"project"`
	// Required. Git Clone HTTPS URI.
	RemoteUri *string `pulumi:"remoteUri"`
	// Output only. Server assigned timestamp for when the connection was updated.
	UpdateTime *string `pulumi:"updateTime"`
}

type RepositoryState struct {
	// Allows clients to store small amounts of arbitrary data.
	Annotations pulumi.StringMapInput
	// Output only. Server assigned timestamp for when the connection was created.
	CreateTime pulumi.StringPtrInput
	// This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
	Etag pulumi.StringPtrInput
	// The location for the resource
	Location pulumi.StringPtrInput
	// Name of the repository.
	Name pulumi.StringPtrInput
	// The connection for the resource
	ParentConnection pulumi.StringPtrInput
	// The project for the resource
	Project pulumi.StringPtrInput
	// Required. Git Clone HTTPS URI.
	RemoteUri pulumi.StringPtrInput
	// Output only. Server assigned timestamp for when the connection was updated.
	UpdateTime pulumi.StringPtrInput
}

func (RepositoryState) ElementType() reflect.Type {
	return reflect.TypeOf((*repositoryState)(nil)).Elem()
}

type repositoryArgs struct {
	// Allows clients to store small amounts of arbitrary data.
	Annotations map[string]string `pulumi:"annotations"`
	// The location for the resource
	Location *string `pulumi:"location"`
	// Name of the repository.
	Name *string `pulumi:"name"`
	// The connection for the resource
	ParentConnection string `pulumi:"parentConnection"`
	// The project for the resource
	Project *string `pulumi:"project"`
	// Required. Git Clone HTTPS URI.
	RemoteUri string `pulumi:"remoteUri"`
}

// The set of arguments for constructing a Repository resource.
type RepositoryArgs struct {
	// Allows clients to store small amounts of arbitrary data.
	Annotations pulumi.StringMapInput
	// The location for the resource
	Location pulumi.StringPtrInput
	// Name of the repository.
	Name pulumi.StringPtrInput
	// The connection for the resource
	ParentConnection pulumi.StringInput
	// The project for the resource
	Project pulumi.StringPtrInput
	// Required. Git Clone HTTPS URI.
	RemoteUri pulumi.StringInput
}

func (RepositoryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*repositoryArgs)(nil)).Elem()
}

type RepositoryInput interface {
	pulumi.Input

	ToRepositoryOutput() RepositoryOutput
	ToRepositoryOutputWithContext(ctx context.Context) RepositoryOutput
}

func (*Repository) ElementType() reflect.Type {
	return reflect.TypeOf((**Repository)(nil)).Elem()
}

func (i *Repository) ToRepositoryOutput() RepositoryOutput {
	return i.ToRepositoryOutputWithContext(context.Background())
}

func (i *Repository) ToRepositoryOutputWithContext(ctx context.Context) RepositoryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryOutput)
}

// RepositoryArrayInput is an input type that accepts RepositoryArray and RepositoryArrayOutput values.
// You can construct a concrete instance of `RepositoryArrayInput` via:
//
//	RepositoryArray{ RepositoryArgs{...} }
type RepositoryArrayInput interface {
	pulumi.Input

	ToRepositoryArrayOutput() RepositoryArrayOutput
	ToRepositoryArrayOutputWithContext(context.Context) RepositoryArrayOutput
}

type RepositoryArray []RepositoryInput

func (RepositoryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Repository)(nil)).Elem()
}

func (i RepositoryArray) ToRepositoryArrayOutput() RepositoryArrayOutput {
	return i.ToRepositoryArrayOutputWithContext(context.Background())
}

func (i RepositoryArray) ToRepositoryArrayOutputWithContext(ctx context.Context) RepositoryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryArrayOutput)
}

// RepositoryMapInput is an input type that accepts RepositoryMap and RepositoryMapOutput values.
// You can construct a concrete instance of `RepositoryMapInput` via:
//
//	RepositoryMap{ "key": RepositoryArgs{...} }
type RepositoryMapInput interface {
	pulumi.Input

	ToRepositoryMapOutput() RepositoryMapOutput
	ToRepositoryMapOutputWithContext(context.Context) RepositoryMapOutput
}

type RepositoryMap map[string]RepositoryInput

func (RepositoryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Repository)(nil)).Elem()
}

func (i RepositoryMap) ToRepositoryMapOutput() RepositoryMapOutput {
	return i.ToRepositoryMapOutputWithContext(context.Background())
}

func (i RepositoryMap) ToRepositoryMapOutputWithContext(ctx context.Context) RepositoryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryMapOutput)
}

type RepositoryOutput struct{ *pulumi.OutputState }

func (RepositoryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Repository)(nil)).Elem()
}

func (o RepositoryOutput) ToRepositoryOutput() RepositoryOutput {
	return o
}

func (o RepositoryOutput) ToRepositoryOutputWithContext(ctx context.Context) RepositoryOutput {
	return o
}

// Allows clients to store small amounts of arbitrary data.
func (o RepositoryOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Repository) pulumi.StringMapOutput { return v.Annotations }).(pulumi.StringMapOutput)
}

// Output only. Server assigned timestamp for when the connection was created.
func (o RepositoryOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Repository) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
func (o RepositoryOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *Repository) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The location for the resource
func (o RepositoryOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Repository) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Name of the repository.
func (o RepositoryOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Repository) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The connection for the resource
func (o RepositoryOutput) ParentConnection() pulumi.StringOutput {
	return o.ApplyT(func(v *Repository) pulumi.StringOutput { return v.ParentConnection }).(pulumi.StringOutput)
}

// The project for the resource
func (o RepositoryOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *Repository) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Required. Git Clone HTTPS URI.
func (o RepositoryOutput) RemoteUri() pulumi.StringOutput {
	return o.ApplyT(func(v *Repository) pulumi.StringOutput { return v.RemoteUri }).(pulumi.StringOutput)
}

// Output only. Server assigned timestamp for when the connection was updated.
func (o RepositoryOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Repository) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type RepositoryArrayOutput struct{ *pulumi.OutputState }

func (RepositoryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Repository)(nil)).Elem()
}

func (o RepositoryArrayOutput) ToRepositoryArrayOutput() RepositoryArrayOutput {
	return o
}

func (o RepositoryArrayOutput) ToRepositoryArrayOutputWithContext(ctx context.Context) RepositoryArrayOutput {
	return o
}

func (o RepositoryArrayOutput) Index(i pulumi.IntInput) RepositoryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Repository {
		return vs[0].([]*Repository)[vs[1].(int)]
	}).(RepositoryOutput)
}

type RepositoryMapOutput struct{ *pulumi.OutputState }

func (RepositoryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Repository)(nil)).Elem()
}

func (o RepositoryMapOutput) ToRepositoryMapOutput() RepositoryMapOutput {
	return o
}

func (o RepositoryMapOutput) ToRepositoryMapOutputWithContext(ctx context.Context) RepositoryMapOutput {
	return o
}

func (o RepositoryMapOutput) MapIndex(k pulumi.StringInput) RepositoryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Repository {
		return vs[0].(map[string]*Repository)[vs[1].(string)]
	}).(RepositoryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryInput)(nil)).Elem(), &Repository{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryArrayInput)(nil)).Elem(), RepositoryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryMapInput)(nil)).Elem(), RepositoryMap{})
	pulumi.RegisterOutputType(RepositoryOutput{})
	pulumi.RegisterOutputType(RepositoryArrayOutput{})
	pulumi.RegisterOutputType(RepositoryMapOutput{})
}