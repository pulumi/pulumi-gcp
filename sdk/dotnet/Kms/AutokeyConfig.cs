// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Kms
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ### Kms Autokey Config All
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// using Time = Pulumi.Time;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create Folder in GCP Organization
    ///     var autokmsFolder = new Gcp.Organizations.Folder("autokms_folder", new()
    ///     {
    ///         DisplayName = "my-folder",
    ///         Parent = "organizations/123456789",
    ///         DeletionProtection = false,
    ///     });
    /// 
    ///     // Create the key project
    ///     var keyProject = new Gcp.Organizations.Project("key_project", new()
    ///     {
    ///         ProjectId = "key-proj",
    ///         Name = "key-proj",
    ///         FolderId = autokmsFolder.FolderId,
    ///         BillingAccount = "000000-0000000-0000000-000000",
    ///         DeletionPolicy = "DELETE",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             autokmsFolder,
    ///         },
    ///     });
    /// 
    ///     // Enable the Cloud KMS API
    ///     var kmsApiService = new Gcp.Projects.Service("kms_api_service", new()
    ///     {
    ///         ServiceName = "cloudkms.googleapis.com",
    ///         Project = keyProject.ProjectId,
    ///         DisableOnDestroy = false,
    ///         DisableDependentServices = true,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             keyProject,
    ///         },
    ///     });
    /// 
    ///     // Wait delay after enabling APIs
    ///     var waitEnableServiceApi = new Time.Index.Sleep("wait_enable_service_api", new()
    ///     {
    ///         CreateDuration = "30s",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             kmsApiService,
    ///         },
    ///     });
    /// 
    ///     //Create KMS Service Agent
    ///     var kmsServiceAgent = new Gcp.Projects.ServiceIdentity("kms_service_agent", new()
    ///     {
    ///         Service = "cloudkms.googleapis.com",
    ///         Project = keyProject.Number,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             waitEnableServiceApi,
    ///         },
    ///     });
    /// 
    ///     // Wait delay after creating service agent.
    ///     var waitServiceAgent = new Time.Index.Sleep("wait_service_agent", new()
    ///     {
    ///         CreateDuration = "10s",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             kmsServiceAgent,
    ///         },
    ///     });
    /// 
    ///     //Grant the KMS Service Agent the Cloud KMS Admin role
    ///     var autokeyProjectAdmin = new Gcp.Projects.IAMMember("autokey_project_admin", new()
    ///     {
    ///         Project = keyProject.ProjectId,
    ///         Role = "roles/cloudkms.admin",
    ///         Member = keyProject.Number.Apply(number =&gt; $"serviceAccount:service-{number}@gcp-sa-cloudkms.iam.gserviceaccount.com"),
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             waitServiceAgent,
    ///         },
    ///     });
    /// 
    ///     // Wait delay after granting IAM permissions
    ///     var waitSrvAccPermissions = new Time.Index.Sleep("wait_srv_acc_permissions", new()
    ///     {
    ///         CreateDuration = "10s",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             autokeyProjectAdmin,
    ///         },
    ///     });
    /// 
    ///     var example_autokeyconfig = new Gcp.Kms.AutokeyConfig("example-autokeyconfig", new()
    ///     {
    ///         Folder = autokmsFolder.Id,
    ///         KeyProject = keyProject.ProjectId.Apply(projectId =&gt; $"projects/{projectId}"),
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             waitSrvAccPermissions,
    ///         },
    ///     });
    /// 
    ///     // Wait delay after setting AutokeyConfig, to prevent diffs on reapply,
    ///     // because setting the config takes a little to fully propagate.
    ///     var waitAutokeyPropagation = new Time.Index.Sleep("wait_autokey_propagation", new()
    ///     {
    ///         CreateDuration = "30s",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             example_autokeyconfig,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// AutokeyConfig can be imported using any of these accepted formats:
    /// 
    /// * `folders/{{folder}}/autokeyConfig`
    /// 
    /// * `{{folder}}`
    /// 
    /// When using the `pulumi import` command, AutokeyConfig can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:kms/autokeyConfig:AutokeyConfig default folders/{{folder}}/autokeyConfig
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:kms/autokeyConfig:AutokeyConfig default {{folder}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:kms/autokeyConfig:AutokeyConfig")]
    public partial class AutokeyConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The etag of the AutokeyConfig for optimistic concurrency control.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The folder for which to retrieve config.
        /// </summary>
        [Output("folder")]
        public Output<string> Folder { get; private set; } = null!;

        /// <summary>
        /// The target key project for a given folder where KMS Autokey will provision a
        /// CryptoKey for any new KeyHandle the Developer creates. Should have the form
        /// `projects/&lt;project_id_or_number&gt;`.
        /// </summary>
        [Output("keyProject")]
        public Output<string?> KeyProject { get; private set; } = null!;


        /// <summary>
        /// Create a AutokeyConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AutokeyConfig(string name, AutokeyConfigArgs args, CustomResourceOptions? options = null)
            : base("gcp:kms/autokeyConfig:AutokeyConfig", name, args ?? new AutokeyConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AutokeyConfig(string name, Input<string> id, AutokeyConfigState? state = null, CustomResourceOptions? options = null)
            : base("gcp:kms/autokeyConfig:AutokeyConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AutokeyConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AutokeyConfig Get(string name, Input<string> id, AutokeyConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new AutokeyConfig(name, id, state, options);
        }
    }

    public sealed class AutokeyConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The folder for which to retrieve config.
        /// </summary>
        [Input("folder", required: true)]
        public Input<string> Folder { get; set; } = null!;

        /// <summary>
        /// The target key project for a given folder where KMS Autokey will provision a
        /// CryptoKey for any new KeyHandle the Developer creates. Should have the form
        /// `projects/&lt;project_id_or_number&gt;`.
        /// </summary>
        [Input("keyProject")]
        public Input<string>? KeyProject { get; set; }

        public AutokeyConfigArgs()
        {
        }
        public static new AutokeyConfigArgs Empty => new AutokeyConfigArgs();
    }

    public sealed class AutokeyConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The etag of the AutokeyConfig for optimistic concurrency control.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The folder for which to retrieve config.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The target key project for a given folder where KMS Autokey will provision a
        /// CryptoKey for any new KeyHandle the Developer creates. Should have the form
        /// `projects/&lt;project_id_or_number&gt;`.
        /// </summary>
        [Input("keyProject")]
        public Input<string>? KeyProject { get; set; }

        public AutokeyConfigState()
        {
        }
        public static new AutokeyConfigState Empty => new AutokeyConfigState();
    }
}
