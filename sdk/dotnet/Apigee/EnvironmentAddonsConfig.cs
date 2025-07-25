// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apigee
{
    /// <summary>
    /// Enable/Disable add-ons for an Apigee environment.
    /// 
    /// To get more information about EnvironmentAddonsConfig, see:
    /// 
    /// * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.addonsConfig/setAddonEnablement)
    /// * How-to Guides
    ///     * [Enable Analytics Add-On](https://cloud.google.com/apigee/docs/api-platform/reference/manage-analytics-add-on)
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// EnvironmentAddonsConfig can be imported using any of these accepted formats:
    /// 
    /// * `{{env_id}}`
    /// 
    /// When using the `pulumi import` command, EnvironmentAddonsConfig can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:apigee/environmentAddonsConfig:EnvironmentAddonsConfig default {{env_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:apigee/environmentAddonsConfig:EnvironmentAddonsConfig")]
    public partial class EnvironmentAddonsConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Flag to enable/disable Analytics.
        /// </summary>
        [Output("analyticsEnabled")]
        public Output<bool?> AnalyticsEnabled { get; private set; } = null!;

        /// <summary>
        /// The Apigee environment group associated with the Apigee environment,
        /// in the format `organizations/{{org_name}}/environments/{{env_name}}`.
        /// </summary>
        [Output("envId")]
        public Output<string> EnvId { get; private set; } = null!;


        /// <summary>
        /// Create a EnvironmentAddonsConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EnvironmentAddonsConfig(string name, EnvironmentAddonsConfigArgs args, CustomResourceOptions? options = null)
            : base("gcp:apigee/environmentAddonsConfig:EnvironmentAddonsConfig", name, args ?? new EnvironmentAddonsConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EnvironmentAddonsConfig(string name, Input<string> id, EnvironmentAddonsConfigState? state = null, CustomResourceOptions? options = null)
            : base("gcp:apigee/environmentAddonsConfig:EnvironmentAddonsConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EnvironmentAddonsConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EnvironmentAddonsConfig Get(string name, Input<string> id, EnvironmentAddonsConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new EnvironmentAddonsConfig(name, id, state, options);
        }
    }

    public sealed class EnvironmentAddonsConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Flag to enable/disable Analytics.
        /// </summary>
        [Input("analyticsEnabled")]
        public Input<bool>? AnalyticsEnabled { get; set; }

        /// <summary>
        /// The Apigee environment group associated with the Apigee environment,
        /// in the format `organizations/{{org_name}}/environments/{{env_name}}`.
        /// </summary>
        [Input("envId", required: true)]
        public Input<string> EnvId { get; set; } = null!;

        public EnvironmentAddonsConfigArgs()
        {
        }
        public static new EnvironmentAddonsConfigArgs Empty => new EnvironmentAddonsConfigArgs();
    }

    public sealed class EnvironmentAddonsConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Flag to enable/disable Analytics.
        /// </summary>
        [Input("analyticsEnabled")]
        public Input<bool>? AnalyticsEnabled { get; set; }

        /// <summary>
        /// The Apigee environment group associated with the Apigee environment,
        /// in the format `organizations/{{org_name}}/environments/{{env_name}}`.
        /// </summary>
        [Input("envId")]
        public Input<string>? EnvId { get; set; }

        public EnvironmentAddonsConfigState()
        {
        }
        public static new EnvironmentAddonsConfigState Empty => new EnvironmentAddonsConfigState();
    }
}
