// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AppEngine
{
    /// <summary>
    /// A NetworkSettings resource is a container for ingress settings for a version or service.
    /// 
    /// To get more information about ServiceNetworkSettings, see:
    /// 
    /// * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services)
    /// 
    /// ## Example Usage
    /// 
    /// ### App Engine Service Network Settings
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var bucket = new Gcp.Storage.Bucket("bucket", new()
    ///     {
    ///         Name = "appengine-static-content",
    ///         Location = "US",
    ///     });
    /// 
    ///     var @object = new Gcp.Storage.BucketObject("object", new()
    ///     {
    ///         Name = "hello-world.zip",
    ///         Bucket = bucket.Name,
    ///         Source = new FileAsset("./test-fixtures/hello-world.zip"),
    ///     });
    /// 
    ///     var internalapp = new Gcp.AppEngine.StandardAppVersion("internalapp", new()
    ///     {
    ///         VersionId = "v1",
    ///         Service = "internalapp",
    ///         DeleteServiceOnDestroy = true,
    ///         Runtime = "nodejs20",
    ///         Entrypoint = new Gcp.AppEngine.Inputs.StandardAppVersionEntrypointArgs
    ///         {
    ///             Shell = "node ./app.js",
    ///         },
    ///         Deployment = new Gcp.AppEngine.Inputs.StandardAppVersionDeploymentArgs
    ///         {
    ///             Zip = new Gcp.AppEngine.Inputs.StandardAppVersionDeploymentZipArgs
    ///             {
    ///                 SourceUrl = Output.Tuple(bucket.Name, @object.Name).Apply(values =&gt;
    ///                 {
    ///                     var bucketName = values.Item1;
    ///                     var objectName = values.Item2;
    ///                     return $"https://storage.googleapis.com/{bucketName}/{objectName}";
    ///                 }),
    ///             },
    ///         },
    ///         EnvVariables = 
    ///         {
    ///             { "port", "8080" },
    ///         },
    ///     });
    /// 
    ///     var internalappServiceNetworkSettings = new Gcp.AppEngine.ServiceNetworkSettings("internalapp", new()
    ///     {
    ///         Service = internalapp.Service,
    ///         NetworkSettings = new Gcp.AppEngine.Inputs.ServiceNetworkSettingsNetworkSettingsArgs
    ///         {
    ///             IngressTrafficAllowed = "INGRESS_TRAFFIC_ALLOWED_INTERNAL_ONLY",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ServiceNetworkSettings can be imported using any of these accepted formats:
    /// 
    /// * `apps/{{project}}/services/{{service}}`
    /// 
    /// * `{{project}}/{{service}}`
    /// 
    /// * `{{service}}`
    /// 
    /// When using the `pulumi import` command, ServiceNetworkSettings can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:appengine/serviceNetworkSettings:ServiceNetworkSettings default apps/{{project}}/services/{{service}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:appengine/serviceNetworkSettings:ServiceNetworkSettings default {{project}}/{{service}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:appengine/serviceNetworkSettings:ServiceNetworkSettings default {{service}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:appengine/serviceNetworkSettings:ServiceNetworkSettings")]
    public partial class ServiceNetworkSettings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Ingress settings for this service. Will apply to all versions.
        /// Structure is documented below.
        /// </summary>
        [Output("networkSettings")]
        public Output<Outputs.ServiceNetworkSettingsNetworkSettings> NetworkSettings { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The name of the service these settings apply to.
        /// </summary>
        [Output("service")]
        public Output<string> Service { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceNetworkSettings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceNetworkSettings(string name, ServiceNetworkSettingsArgs args, CustomResourceOptions? options = null)
            : base("gcp:appengine/serviceNetworkSettings:ServiceNetworkSettings", name, args ?? new ServiceNetworkSettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceNetworkSettings(string name, Input<string> id, ServiceNetworkSettingsState? state = null, CustomResourceOptions? options = null)
            : base("gcp:appengine/serviceNetworkSettings:ServiceNetworkSettings", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServiceNetworkSettings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceNetworkSettings Get(string name, Input<string> id, ServiceNetworkSettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceNetworkSettings(name, id, state, options);
        }
    }

    public sealed class ServiceNetworkSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Ingress settings for this service. Will apply to all versions.
        /// Structure is documented below.
        /// </summary>
        [Input("networkSettings", required: true)]
        public Input<Inputs.ServiceNetworkSettingsNetworkSettingsArgs> NetworkSettings { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The name of the service these settings apply to.
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        public ServiceNetworkSettingsArgs()
        {
        }
        public static new ServiceNetworkSettingsArgs Empty => new ServiceNetworkSettingsArgs();
    }

    public sealed class ServiceNetworkSettingsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Ingress settings for this service. Will apply to all versions.
        /// Structure is documented below.
        /// </summary>
        [Input("networkSettings")]
        public Input<Inputs.ServiceNetworkSettingsNetworkSettingsGetArgs>? NetworkSettings { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The name of the service these settings apply to.
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

        public ServiceNetworkSettingsState()
        {
        }
        public static new ServiceNetworkSettingsState Empty => new ServiceNetworkSettingsState();
    }
}
