// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apigee
{
    /// <summary>
    /// Configures the add-ons for the Apigee organization. The existing add-on configuration will be fully replaced.
    /// 
    /// To get more information about AddonsConfig, see:
    /// 
    /// * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations#setaddons)
    /// * How-to Guides
    ///     * [Creating an API organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org)
    /// 
    /// ## Example Usage
    /// ### Apigee Addons Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testOrganization = new Gcp.Apigee.AddonsConfig("testOrganization", new()
    ///     {
    ///         AddonsConfigDetails = new Gcp.Apigee.Inputs.AddonsConfigAddonsConfigArgs
    ///         {
    ///             ApiSecurityConfig = new Gcp.Apigee.Inputs.AddonsConfigAddonsConfigApiSecurityConfigArgs
    ///             {
    ///                 Enabled = true,
    ///             },
    ///             MonetizationConfig = new Gcp.Apigee.Inputs.AddonsConfigAddonsConfigMonetizationConfigArgs
    ///             {
    ///                 Enabled = true,
    ///             },
    ///         },
    ///         Org = "test_organization",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Apigee Addons Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var current = Gcp.Organizations.GetClientConfig.Invoke();
    /// 
    ///     var apigee = new Gcp.Projects.Service("apigee", new()
    ///     {
    ///         Project = current.Apply(getClientConfigResult =&gt; getClientConfigResult.Project),
    ///         ServiceName = "apigee.googleapis.com",
    ///     });
    /// 
    ///     var compute = new Gcp.Projects.Service("compute", new()
    ///     {
    ///         Project = current.Apply(getClientConfigResult =&gt; getClientConfigResult.Project),
    ///         ServiceName = "compute.googleapis.com",
    ///     });
    /// 
    ///     var servicenetworking = new Gcp.Projects.Service("servicenetworking", new()
    ///     {
    ///         Project = current.Apply(getClientConfigResult =&gt; getClientConfigResult.Project),
    ///         ServiceName = "servicenetworking.googleapis.com",
    ///     });
    /// 
    ///     var apigeeNetwork = new Gcp.Compute.Network("apigeeNetwork", new()
    ///     {
    ///         Project = current.Apply(getClientConfigResult =&gt; getClientConfigResult.Project),
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             compute,
    ///         },
    ///     });
    /// 
    ///     var apigeeRange = new Gcp.Compute.GlobalAddress("apigeeRange", new()
    ///     {
    ///         Purpose = "VPC_PEERING",
    ///         AddressType = "INTERNAL",
    ///         PrefixLength = 16,
    ///         Network = apigeeNetwork.Id,
    ///         Project = current.Apply(getClientConfigResult =&gt; getClientConfigResult.Project),
    ///     });
    /// 
    ///     var apigeeVpcConnection = new Gcp.ServiceNetworking.Connection("apigeeVpcConnection", new()
    ///     {
    ///         Network = apigeeNetwork.Id,
    ///         Service = "servicenetworking.googleapis.com",
    ///         ReservedPeeringRanges = new[]
    ///         {
    ///             apigeeRange.Name,
    ///         },
    ///     });
    /// 
    ///     var org = new Gcp.Apigee.Organization("org", new()
    ///     {
    ///         AnalyticsRegion = "us-central1",
    ///         ProjectId = current.Apply(getClientConfigResult =&gt; getClientConfigResult.Project),
    ///         AuthorizedNetwork = apigeeNetwork.Id,
    ///         BillingType = "EVALUATION",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             apigeeVpcConnection,
    ///             apigee,
    ///         },
    ///     });
    /// 
    ///     var testOrganization = new Gcp.Apigee.AddonsConfig("testOrganization", new()
    ///     {
    ///         Org = org.Name,
    ///         AddonsConfigDetails = new Gcp.Apigee.Inputs.AddonsConfigAddonsConfigArgs
    ///         {
    ///             IntegrationConfig = new Gcp.Apigee.Inputs.AddonsConfigAddonsConfigIntegrationConfigArgs
    ///             {
    ///                 Enabled = true,
    ///             },
    ///             ApiSecurityConfig = new Gcp.Apigee.Inputs.AddonsConfigAddonsConfigApiSecurityConfigArgs
    ///             {
    ///                 Enabled = true,
    ///             },
    ///             ConnectorsPlatformConfig = new Gcp.Apigee.Inputs.AddonsConfigAddonsConfigConnectorsPlatformConfigArgs
    ///             {
    ///                 Enabled = true,
    ///             },
    ///             MonetizationConfig = new Gcp.Apigee.Inputs.AddonsConfigAddonsConfigMonetizationConfigArgs
    ///             {
    ///                 Enabled = true,
    ///             },
    ///             AdvancedApiOpsConfig = new Gcp.Apigee.Inputs.AddonsConfigAddonsConfigAdvancedApiOpsConfigArgs
    ///             {
    ///                 Enabled = true,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// AddonsConfig can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:apigee/addonsConfig:AddonsConfig default organizations/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:apigee/addonsConfig:AddonsConfig default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:apigee/addonsConfig:AddonsConfig")]
    public partial class AddonsConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Addon configurations of the Apigee organization.
        /// Structure is documented below.
        /// </summary>
        [Output("addonsConfig")]
        public Output<Outputs.AddonsConfigAddonsConfig?> AddonsConfigDetails { get; private set; } = null!;

        /// <summary>
        /// Name of the Apigee organization.
        /// </summary>
        [Output("org")]
        public Output<string> Org { get; private set; } = null!;


        /// <summary>
        /// Create a AddonsConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AddonsConfig(string name, AddonsConfigArgs args, CustomResourceOptions? options = null)
            : base("gcp:apigee/addonsConfig:AddonsConfig", name, args ?? new AddonsConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AddonsConfig(string name, Input<string> id, AddonsConfigState? state = null, CustomResourceOptions? options = null)
            : base("gcp:apigee/addonsConfig:AddonsConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AddonsConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AddonsConfig Get(string name, Input<string> id, AddonsConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new AddonsConfig(name, id, state, options);
        }
    }

    public sealed class AddonsConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Addon configurations of the Apigee organization.
        /// Structure is documented below.
        /// </summary>
        [Input("addonsConfig")]
        public Input<Inputs.AddonsConfigAddonsConfigArgs>? AddonsConfigDetails { get; set; }

        /// <summary>
        /// Name of the Apigee organization.
        /// </summary>
        [Input("org", required: true)]
        public Input<string> Org { get; set; } = null!;

        public AddonsConfigArgs()
        {
        }
        public static new AddonsConfigArgs Empty => new AddonsConfigArgs();
    }

    public sealed class AddonsConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Addon configurations of the Apigee organization.
        /// Structure is documented below.
        /// </summary>
        [Input("addonsConfig")]
        public Input<Inputs.AddonsConfigAddonsConfigGetArgs>? AddonsConfigDetails { get; set; }

        /// <summary>
        /// Name of the Apigee organization.
        /// </summary>
        [Input("org")]
        public Input<string>? Org { get; set; }

        public AddonsConfigState()
        {
        }
        public static new AddonsConfigState Empty => new AddonsConfigState();
    }
}