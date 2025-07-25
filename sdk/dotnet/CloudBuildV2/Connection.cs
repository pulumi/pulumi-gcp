// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudBuildV2
{
    /// <summary>
    /// A connection to a SCM like GitHub, GitHub Enterprise, Bitbucket Data Center/Cloud or GitLab.
    /// 
    /// To get more information about Connection, see:
    /// 
    /// * [API documentation](https://cloud.google.com/build/docs/api/reference/rest)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/build/docs)
    /// 
    /// ## Example Usage
    /// 
    /// ### Cloudbuildv2 Connection
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var my_connection = new Gcp.CloudBuildV2.Connection("my-connection", new()
    ///     {
    ///         Location = "us-central1",
    ///         Name = "tf-test-connection",
    ///         GithubConfig = new Gcp.CloudBuildV2.Inputs.ConnectionGithubConfigArgs
    ///         {
    ///             AppInstallationId = 0,
    ///             AuthorizerCredential = new Gcp.CloudBuildV2.Inputs.ConnectionGithubConfigAuthorizerCredentialArgs
    ///             {
    ///                 OauthTokenSecretVersion = "projects/gcb-terraform-creds/secrets/github-pat/versions/1",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Cloudbuildv2 Connection Ghe
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var private_key_secret = new Gcp.SecretManager.Secret("private-key-secret", new()
    ///     {
    ///         SecretId = "ghe-pk-secret",
    ///         Replication = new Gcp.SecretManager.Inputs.SecretReplicationArgs
    ///         {
    ///             Auto = null,
    ///         },
    ///     });
    /// 
    ///     var private_key_secret_version = new Gcp.SecretManager.SecretVersion("private-key-secret-version", new()
    ///     {
    ///         Secret = private_key_secret.Id,
    ///         SecretData = Std.File.Invoke(new()
    ///         {
    ///             Input = "private-key.pem",
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///     });
    /// 
    ///     var webhook_secret_secret = new Gcp.SecretManager.Secret("webhook-secret-secret", new()
    ///     {
    ///         SecretId = "github-token-secret",
    ///         Replication = new Gcp.SecretManager.Inputs.SecretReplicationArgs
    ///         {
    ///             Auto = null,
    ///         },
    ///     });
    /// 
    ///     var webhook_secret_secret_version = new Gcp.SecretManager.SecretVersion("webhook-secret-secret-version", new()
    ///     {
    ///         Secret = webhook_secret_secret.Id,
    ///         SecretData = "&lt;webhook-secret-data&gt;",
    ///     });
    /// 
    ///     var p4sa_secretAccessor = Gcp.Organizations.GetIAMPolicy.Invoke(new()
    ///     {
    ///         Bindings = new[]
    ///         {
    ///             new Gcp.Organizations.Inputs.GetIAMPolicyBindingInputArgs
    ///             {
    ///                 Role = "roles/secretmanager.secretAccessor",
    ///                 Members = new[]
    ///                 {
    ///                     "serviceAccount:service-123456789@gcp-sa-cloudbuild.iam.gserviceaccount.com",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var policy_pk = new Gcp.SecretManager.SecretIamPolicy("policy-pk", new()
    ///     {
    ///         SecretId = private_key_secret.SecretId,
    ///         PolicyData = p4sa_secretAccessor.Apply(p4sa_secretAccessor =&gt; p4sa_secretAccessor.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData)),
    ///     });
    /// 
    ///     var policy_whs = new Gcp.SecretManager.SecretIamPolicy("policy-whs", new()
    ///     {
    ///         SecretId = webhook_secret_secret.SecretId,
    ///         PolicyData = p4sa_secretAccessor.Apply(p4sa_secretAccessor =&gt; p4sa_secretAccessor.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData)),
    ///     });
    /// 
    ///     var my_connection = new Gcp.CloudBuildV2.Connection("my-connection", new()
    ///     {
    ///         Location = "us-central1",
    ///         Name = "my-terraform-ghe-connection",
    ///         GithubEnterpriseConfig = new Gcp.CloudBuildV2.Inputs.ConnectionGithubEnterpriseConfigArgs
    ///         {
    ///             HostUri = "https://ghe.com",
    ///             PrivateKeySecretVersion = private_key_secret_version.Id,
    ///             WebhookSecretSecretVersion = webhook_secret_secret_version.Id,
    ///             AppId = 200,
    ///             AppSlug = "gcb-app",
    ///             AppInstallationId = 300,
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             policy_pk,
    ///             policy_whs,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Cloudbuildv2 Connection Github
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var github_token_secret = new Gcp.SecretManager.Secret("github-token-secret", new()
    ///     {
    ///         SecretId = "github-token-secret",
    ///         Replication = new Gcp.SecretManager.Inputs.SecretReplicationArgs
    ///         {
    ///             Auto = null,
    ///         },
    ///     });
    /// 
    ///     var github_token_secret_version = new Gcp.SecretManager.SecretVersion("github-token-secret-version", new()
    ///     {
    ///         Secret = github_token_secret.Id,
    ///         SecretData = Std.File.Invoke(new()
    ///         {
    ///             Input = "my-github-token.txt",
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///     });
    /// 
    ///     var p4sa_secretAccessor = Gcp.Organizations.GetIAMPolicy.Invoke(new()
    ///     {
    ///         Bindings = new[]
    ///         {
    ///             new Gcp.Organizations.Inputs.GetIAMPolicyBindingInputArgs
    ///             {
    ///                 Role = "roles/secretmanager.secretAccessor",
    ///                 Members = new[]
    ///                 {
    ///                     "serviceAccount:service-123456789@gcp-sa-cloudbuild.iam.gserviceaccount.com",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var policy = new Gcp.SecretManager.SecretIamPolicy("policy", new()
    ///     {
    ///         SecretId = github_token_secret.SecretId,
    ///         PolicyData = p4sa_secretAccessor.Apply(p4sa_secretAccessor =&gt; p4sa_secretAccessor.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData)),
    ///     });
    /// 
    ///     var my_connection = new Gcp.CloudBuildV2.Connection("my-connection", new()
    ///     {
    ///         Location = "us-central1",
    ///         Name = "my-connection",
    ///         GithubConfig = new Gcp.CloudBuildV2.Inputs.ConnectionGithubConfigArgs
    ///         {
    ///             AppInstallationId = 123123,
    ///             AuthorizerCredential = new Gcp.CloudBuildV2.Inputs.ConnectionGithubConfigAuthorizerCredentialArgs
    ///             {
    ///                 OauthTokenSecretVersion = github_token_secret_version.Id,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Connection can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/connections/{{name}}`
    /// 
    /// * `{{project}}/{{location}}/{{name}}`
    /// 
    /// * `{{location}}/{{name}}`
    /// 
    /// * `{{name}}`
    /// 
    /// When using the `pulumi import` command, Connection can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:cloudbuildv2/connection:Connection default projects/{{project}}/locations/{{location}}/connections/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:cloudbuildv2/connection:Connection default {{project}}/{{location}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:cloudbuildv2/connection:Connection default {{location}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:cloudbuildv2/connection:Connection default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:cloudbuildv2/connection:Connection")]
    public partial class Connection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Allows clients to store small amounts of arbitrary data.
        /// **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
        /// Please refer to the field `effective_annotations` for all of the annotations present on the resource.
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, string>?> Annotations { get; private set; } = null!;

        /// <summary>
        /// Configuration for connections to Bitbucket Cloud.
        /// Structure is documented below.
        /// </summary>
        [Output("bitbucketCloudConfig")]
        public Output<Outputs.ConnectionBitbucketCloudConfig?> BitbucketCloudConfig { get; private set; } = null!;

        /// <summary>
        /// Configuration for connections to Bitbucket Data Center.
        /// Structure is documented below.
        /// </summary>
        [Output("bitbucketDataCenterConfig")]
        public Output<Outputs.ConnectionBitbucketDataCenterConfig?> BitbucketDataCenterConfig { get; private set; } = null!;

        /// <summary>
        /// Output only. Server assigned timestamp for when the connection was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// If disabled is set to true, functionality is disabled for this connection. Repository based API methods and webhooks processing for repositories in this connection will be disabled.
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        [Output("effectiveAnnotations")]
        public Output<ImmutableDictionary<string, string>> EffectiveAnnotations { get; private set; } = null!;

        /// <summary>
        /// This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// Configuration for connections to github.com.
        /// Structure is documented below.
        /// </summary>
        [Output("githubConfig")]
        public Output<Outputs.ConnectionGithubConfig?> GithubConfig { get; private set; } = null!;

        /// <summary>
        /// Configuration for connections to an instance of GitHub Enterprise.
        /// Structure is documented below.
        /// </summary>
        [Output("githubEnterpriseConfig")]
        public Output<Outputs.ConnectionGithubEnterpriseConfig?> GithubEnterpriseConfig { get; private set; } = null!;

        /// <summary>
        /// Configuration for connections to gitlab.com or an instance of GitLab Enterprise.
        /// Structure is documented below.
        /// </summary>
        [Output("gitlabConfig")]
        public Output<Outputs.ConnectionGitlabConfig?> GitlabConfig { get; private set; } = null!;

        /// <summary>
        /// Output only. Installation state of the Connection.
        /// Structure is documented below.
        /// </summary>
        [Output("installationStates")]
        public Output<ImmutableArray<Outputs.ConnectionInstallationState>> InstallationStates { get; private set; } = null!;

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Immutable. The resource name of the connection.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Output only. Set to true when the connection is being set up or updated in the background.
        /// </summary>
        [Output("reconciling")]
        public Output<bool> Reconciling { get; private set; } = null!;

        /// <summary>
        /// Output only. Server assigned timestamp for when the connection was updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a Connection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Connection(string name, ConnectionArgs args, CustomResourceOptions? options = null)
            : base("gcp:cloudbuildv2/connection:Connection", name, args ?? new ConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Connection(string name, Input<string> id, ConnectionState? state = null, CustomResourceOptions? options = null)
            : base("gcp:cloudbuildv2/connection:Connection", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Connection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Connection Get(string name, Input<string> id, ConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new Connection(name, id, state, options);
        }
    }

    public sealed class ConnectionArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Allows clients to store small amounts of arbitrary data.
        /// **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
        /// Please refer to the field `effective_annotations` for all of the annotations present on the resource.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// Configuration for connections to Bitbucket Cloud.
        /// Structure is documented below.
        /// </summary>
        [Input("bitbucketCloudConfig")]
        public Input<Inputs.ConnectionBitbucketCloudConfigArgs>? BitbucketCloudConfig { get; set; }

        /// <summary>
        /// Configuration for connections to Bitbucket Data Center.
        /// Structure is documented below.
        /// </summary>
        [Input("bitbucketDataCenterConfig")]
        public Input<Inputs.ConnectionBitbucketDataCenterConfigArgs>? BitbucketDataCenterConfig { get; set; }

        /// <summary>
        /// If disabled is set to true, functionality is disabled for this connection. Repository based API methods and webhooks processing for repositories in this connection will be disabled.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Configuration for connections to github.com.
        /// Structure is documented below.
        /// </summary>
        [Input("githubConfig")]
        public Input<Inputs.ConnectionGithubConfigArgs>? GithubConfig { get; set; }

        /// <summary>
        /// Configuration for connections to an instance of GitHub Enterprise.
        /// Structure is documented below.
        /// </summary>
        [Input("githubEnterpriseConfig")]
        public Input<Inputs.ConnectionGithubEnterpriseConfigArgs>? GithubEnterpriseConfig { get; set; }

        /// <summary>
        /// Configuration for connections to gitlab.com or an instance of GitLab Enterprise.
        /// Structure is documented below.
        /// </summary>
        [Input("gitlabConfig")]
        public Input<Inputs.ConnectionGitlabConfigArgs>? GitlabConfig { get; set; }

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// Immutable. The resource name of the connection.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public ConnectionArgs()
        {
        }
        public static new ConnectionArgs Empty => new ConnectionArgs();
    }

    public sealed class ConnectionState : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Allows clients to store small amounts of arbitrary data.
        /// **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
        /// Please refer to the field `effective_annotations` for all of the annotations present on the resource.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// Configuration for connections to Bitbucket Cloud.
        /// Structure is documented below.
        /// </summary>
        [Input("bitbucketCloudConfig")]
        public Input<Inputs.ConnectionBitbucketCloudConfigGetArgs>? BitbucketCloudConfig { get; set; }

        /// <summary>
        /// Configuration for connections to Bitbucket Data Center.
        /// Structure is documented below.
        /// </summary>
        [Input("bitbucketDataCenterConfig")]
        public Input<Inputs.ConnectionBitbucketDataCenterConfigGetArgs>? BitbucketDataCenterConfig { get; set; }

        /// <summary>
        /// Output only. Server assigned timestamp for when the connection was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// If disabled is set to true, functionality is disabled for this connection. Repository based API methods and webhooks processing for repositories in this connection will be disabled.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("effectiveAnnotations")]
        private InputMap<string>? _effectiveAnnotations;
        public InputMap<string> EffectiveAnnotations
        {
            get => _effectiveAnnotations ?? (_effectiveAnnotations = new InputMap<string>());
            set => _effectiveAnnotations = value;
        }

        /// <summary>
        /// This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// Configuration for connections to github.com.
        /// Structure is documented below.
        /// </summary>
        [Input("githubConfig")]
        public Input<Inputs.ConnectionGithubConfigGetArgs>? GithubConfig { get; set; }

        /// <summary>
        /// Configuration for connections to an instance of GitHub Enterprise.
        /// Structure is documented below.
        /// </summary>
        [Input("githubEnterpriseConfig")]
        public Input<Inputs.ConnectionGithubEnterpriseConfigGetArgs>? GithubEnterpriseConfig { get; set; }

        /// <summary>
        /// Configuration for connections to gitlab.com or an instance of GitLab Enterprise.
        /// Structure is documented below.
        /// </summary>
        [Input("gitlabConfig")]
        public Input<Inputs.ConnectionGitlabConfigGetArgs>? GitlabConfig { get; set; }

        [Input("installationStates")]
        private InputList<Inputs.ConnectionInstallationStateGetArgs>? _installationStates;

        /// <summary>
        /// Output only. Installation state of the Connection.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ConnectionInstallationStateGetArgs> InstallationStates
        {
            get => _installationStates ?? (_installationStates = new InputList<Inputs.ConnectionInstallationStateGetArgs>());
            set => _installationStates = value;
        }

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Immutable. The resource name of the connection.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Output only. Set to true when the connection is being set up or updated in the background.
        /// </summary>
        [Input("reconciling")]
        public Input<bool>? Reconciling { get; set; }

        /// <summary>
        /// Output only. Server assigned timestamp for when the connection was updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public ConnectionState()
        {
        }
        public static new ConnectionState Empty => new ConnectionState();
    }
}
