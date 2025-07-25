// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BackupDisasterRecovery
{
    /// <summary>
    /// Initializes a Project-level default Backupdr config. It creates default Backupvault and default Backup Plan in same project for customers to protect instances.
    /// 
    /// To get more information about ServiceConfig, see:
    /// 
    /// * [API documentation](https://cloud.google.com/backup-disaster-recovery/docs/reference/rest/v1/projects.locations.serviceConfig)
    /// 
    /// ## Example Usage
    /// 
    /// ### Backup Dr Service Config
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var bpa1 = new Gcp.BackupDisasterRecovery.ServiceConfig("bpa1", new()
    ///     {
    ///         Location = "us-central1",
    ///         ResourceType = "compute.googleapis.com/Instance",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource does not support import.
    /// </summary>
    [GcpResourceType("gcp:backupdisasterrecovery/serviceConfig:ServiceConfig")]
    public partial class ServiceConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The location in which the Service config is to be initialized.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The resource type to which the default service config will be applied.
        /// </summary>
        [Output("resourceType")]
        public Output<string> ResourceType { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceConfig(string name, ServiceConfigArgs args, CustomResourceOptions? options = null)
            : base("gcp:backupdisasterrecovery/serviceConfig:ServiceConfig", name, args ?? new ServiceConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceConfig(string name, Input<string> id, ServiceConfigState? state = null, CustomResourceOptions? options = null)
            : base("gcp:backupdisasterrecovery/serviceConfig:ServiceConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServiceConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceConfig Get(string name, Input<string> id, ServiceConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceConfig(name, id, state, options);
        }
    }

    public sealed class ServiceConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The location in which the Service config is to be initialized.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The resource type to which the default service config will be applied.
        /// </summary>
        [Input("resourceType", required: true)]
        public Input<string> ResourceType { get; set; } = null!;

        public ServiceConfigArgs()
        {
        }
        public static new ServiceConfigArgs Empty => new ServiceConfigArgs();
    }

    public sealed class ServiceConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The location in which the Service config is to be initialized.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The resource type to which the default service config will be applied.
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        public ServiceConfigState()
        {
        }
        public static new ServiceConfigState Empty => new ServiceConfigState();
    }
}
