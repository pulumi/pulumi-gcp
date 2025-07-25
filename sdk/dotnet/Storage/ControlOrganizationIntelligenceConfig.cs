// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ### Storage Control Organization Intelligence Config Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Gcp.Storage.ControlOrganizationIntelligenceConfig("example", new()
    ///     {
    ///         Name = "12345678",
    ///         EditionConfig = "STANDARD",
    ///         Filter = new Gcp.Storage.Inputs.ControlOrganizationIntelligenceConfigFilterArgs
    ///         {
    ///             ExcludedCloudStorageBuckets = new Gcp.Storage.Inputs.ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageBucketsArgs
    ///             {
    ///                 BucketIdRegexes = new[]
    ///                 {
    ///                     "test-id-1*",
    ///                     "test-id-2*",
    ///                 },
    ///             },
    ///             IncludedCloudStorageLocations = new Gcp.Storage.Inputs.ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageLocationsArgs
    ///             {
    ///                 Locations = new[]
    ///                 {
    ///                     "test-location-1*",
    ///                     "test-locations-2*",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// OrganizationIntelligenceConfig can be imported using any of these accepted formats:
    /// 
    /// * `organizations/{{name}}/locations/global/intelligenceConfig`
    /// 
    /// * `{{name}}`
    /// 
    /// When using the `pulumi import` command, OrganizationIntelligenceConfig can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:storage/controlOrganizationIntelligenceConfig:ControlOrganizationIntelligenceConfig default organizations/{{name}}/locations/global/intelligenceConfig
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:storage/controlOrganizationIntelligenceConfig:ControlOrganizationIntelligenceConfig default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:storage/controlOrganizationIntelligenceConfig:ControlOrganizationIntelligenceConfig")]
    public partial class ControlOrganizationIntelligenceConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Edition configuration of the Storage Intelligence resource. Valid values are INHERIT, DISABLED, TRIAL and STANDARD.
        /// </summary>
        [Output("editionConfig")]
        public Output<string> EditionConfig { get; private set; } = null!;

        /// <summary>
        /// The Intelligence config that is effective for the resource.
        /// Structure is documented below.
        /// </summary>
        [Output("effectiveIntelligenceConfigs")]
        public Output<ImmutableArray<Outputs.ControlOrganizationIntelligenceConfigEffectiveIntelligenceConfig>> EffectiveIntelligenceConfigs { get; private set; } = null!;

        /// <summary>
        /// Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
        /// Structure is documented below.
        /// </summary>
        [Output("filter")]
        public Output<Outputs.ControlOrganizationIntelligenceConfigFilter?> Filter { get; private set; } = null!;

        /// <summary>
        /// Identifier of the GCP Organization. For GCP org, this field should be organization number.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The trial configuration of the Storage Intelligence resource.
        /// Structure is documented below.
        /// </summary>
        [Output("trialConfigs")]
        public Output<ImmutableArray<Outputs.ControlOrganizationIntelligenceConfigTrialConfig>> TrialConfigs { get; private set; } = null!;

        /// <summary>
        /// The time at which the Storage Intelligence Config resource is last updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a ControlOrganizationIntelligenceConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ControlOrganizationIntelligenceConfig(string name, ControlOrganizationIntelligenceConfigArgs? args = null, CustomResourceOptions? options = null)
            : base("gcp:storage/controlOrganizationIntelligenceConfig:ControlOrganizationIntelligenceConfig", name, args ?? new ControlOrganizationIntelligenceConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ControlOrganizationIntelligenceConfig(string name, Input<string> id, ControlOrganizationIntelligenceConfigState? state = null, CustomResourceOptions? options = null)
            : base("gcp:storage/controlOrganizationIntelligenceConfig:ControlOrganizationIntelligenceConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ControlOrganizationIntelligenceConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ControlOrganizationIntelligenceConfig Get(string name, Input<string> id, ControlOrganizationIntelligenceConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new ControlOrganizationIntelligenceConfig(name, id, state, options);
        }
    }

    public sealed class ControlOrganizationIntelligenceConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Edition configuration of the Storage Intelligence resource. Valid values are INHERIT, DISABLED, TRIAL and STANDARD.
        /// </summary>
        [Input("editionConfig")]
        public Input<string>? EditionConfig { get; set; }

        /// <summary>
        /// Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
        /// Structure is documented below.
        /// </summary>
        [Input("filter")]
        public Input<Inputs.ControlOrganizationIntelligenceConfigFilterArgs>? Filter { get; set; }

        /// <summary>
        /// Identifier of the GCP Organization. For GCP org, this field should be organization number.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ControlOrganizationIntelligenceConfigArgs()
        {
        }
        public static new ControlOrganizationIntelligenceConfigArgs Empty => new ControlOrganizationIntelligenceConfigArgs();
    }

    public sealed class ControlOrganizationIntelligenceConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Edition configuration of the Storage Intelligence resource. Valid values are INHERIT, DISABLED, TRIAL and STANDARD.
        /// </summary>
        [Input("editionConfig")]
        public Input<string>? EditionConfig { get; set; }

        [Input("effectiveIntelligenceConfigs")]
        private InputList<Inputs.ControlOrganizationIntelligenceConfigEffectiveIntelligenceConfigGetArgs>? _effectiveIntelligenceConfigs;

        /// <summary>
        /// The Intelligence config that is effective for the resource.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ControlOrganizationIntelligenceConfigEffectiveIntelligenceConfigGetArgs> EffectiveIntelligenceConfigs
        {
            get => _effectiveIntelligenceConfigs ?? (_effectiveIntelligenceConfigs = new InputList<Inputs.ControlOrganizationIntelligenceConfigEffectiveIntelligenceConfigGetArgs>());
            set => _effectiveIntelligenceConfigs = value;
        }

        /// <summary>
        /// Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
        /// Structure is documented below.
        /// </summary>
        [Input("filter")]
        public Input<Inputs.ControlOrganizationIntelligenceConfigFilterGetArgs>? Filter { get; set; }

        /// <summary>
        /// Identifier of the GCP Organization. For GCP org, this field should be organization number.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("trialConfigs")]
        private InputList<Inputs.ControlOrganizationIntelligenceConfigTrialConfigGetArgs>? _trialConfigs;

        /// <summary>
        /// The trial configuration of the Storage Intelligence resource.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ControlOrganizationIntelligenceConfigTrialConfigGetArgs> TrialConfigs
        {
            get => _trialConfigs ?? (_trialConfigs = new InputList<Inputs.ControlOrganizationIntelligenceConfigTrialConfigGetArgs>());
            set => _trialConfigs = value;
        }

        /// <summary>
        /// The time at which the Storage Intelligence Config resource is last updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public ControlOrganizationIntelligenceConfigState()
        {
        }
        public static new ControlOrganizationIntelligenceConfigState Empty => new ControlOrganizationIntelligenceConfigState();
    }
}
