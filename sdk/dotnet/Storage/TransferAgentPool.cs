// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage
{
    /// <summary>
    /// Represents an On-Premises Agent pool.
    /// 
    /// To get more information about AgentPool, see:
    /// 
    /// * [API documentation](https://cloud.google.com/storage-transfer/docs/reference/rest/v1/projects.agentPools)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/storage-transfer/docs/on-prem-agent-pools)
    /// 
    /// ## Example Usage
    /// ### Agent Pool Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = Gcp.Storage.GetTransferProjectServieAccount.Invoke(new()
    ///     {
    ///         Project = "my-project-name",
    ///     });
    /// 
    ///     var pubsubEditorRole = new Gcp.Projects.IAMMember("pubsubEditorRole", new()
    ///     {
    ///         Project = "my-project-name",
    ///         Role = "roles/pubsub.editor",
    ///         Member = @default.Apply(getTransferProjectServieAccountResult =&gt; getTransferProjectServieAccountResult).Apply(@default =&gt; $"serviceAccount:{@default.Apply(getTransferProjectServieAccountResult =&gt; getTransferProjectServieAccountResult.Email)}"),
    ///     });
    /// 
    ///     var example = new Gcp.Storage.TransferAgentPool("example", new()
    ///     {
    ///         DisplayName = "Source A to destination Z",
    ///         BandwidthLimit = new Gcp.Storage.Inputs.TransferAgentPoolBandwidthLimitArgs
    ///         {
    ///             LimitMbps = "120",
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             pubsubEditorRole,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// AgentPool can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:storage/transferAgentPool:TransferAgentPool default projects/{{project}}/agentPools/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:storage/transferAgentPool:TransferAgentPool default {{project}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:storage/transferAgentPool:TransferAgentPool default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:storage/transferAgentPool:TransferAgentPool")]
    public partial class TransferAgentPool : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the bandwidth limit details. If this field is unspecified, the default value is set as 'No Limit'.
        /// Structure is documented below.
        /// </summary>
        [Output("bandwidthLimit")]
        public Output<Outputs.TransferAgentPoolBandwidthLimit?> BandwidthLimit { get; private set; } = null!;

        /// <summary>
        /// Specifies the client-specified AgentPool description.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The ID of the agent pool to create.
        /// The agentPoolId must meet the following requirements:
        /// * Length of 128 characters or less.
        /// * Not start with the string goog.
        /// * Start with a lowercase ASCII character, followed by:
        /// * Zero or more: lowercase Latin alphabet characters, numerals, hyphens (-), periods (.), underscores (_), or tildes (~).
        /// * One or more numerals or lowercase ASCII characters.
        /// As expressed by the regular expression: ^(?!goog)a-z?$.
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
        /// Specifies the state of the AgentPool.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;


        /// <summary>
        /// Create a TransferAgentPool resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TransferAgentPool(string name, TransferAgentPoolArgs? args = null, CustomResourceOptions? options = null)
            : base("gcp:storage/transferAgentPool:TransferAgentPool", name, args ?? new TransferAgentPoolArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TransferAgentPool(string name, Input<string> id, TransferAgentPoolState? state = null, CustomResourceOptions? options = null)
            : base("gcp:storage/transferAgentPool:TransferAgentPool", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TransferAgentPool resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TransferAgentPool Get(string name, Input<string> id, TransferAgentPoolState? state = null, CustomResourceOptions? options = null)
        {
            return new TransferAgentPool(name, id, state, options);
        }
    }

    public sealed class TransferAgentPoolArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the bandwidth limit details. If this field is unspecified, the default value is set as 'No Limit'.
        /// Structure is documented below.
        /// </summary>
        [Input("bandwidthLimit")]
        public Input<Inputs.TransferAgentPoolBandwidthLimitArgs>? BandwidthLimit { get; set; }

        /// <summary>
        /// Specifies the client-specified AgentPool description.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The ID of the agent pool to create.
        /// The agentPoolId must meet the following requirements:
        /// * Length of 128 characters or less.
        /// * Not start with the string goog.
        /// * Start with a lowercase ASCII character, followed by:
        /// * Zero or more: lowercase Latin alphabet characters, numerals, hyphens (-), periods (.), underscores (_), or tildes (~).
        /// * One or more numerals or lowercase ASCII characters.
        /// As expressed by the regular expression: ^(?!goog)a-z?$.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public TransferAgentPoolArgs()
        {
        }
        public static new TransferAgentPoolArgs Empty => new TransferAgentPoolArgs();
    }

    public sealed class TransferAgentPoolState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the bandwidth limit details. If this field is unspecified, the default value is set as 'No Limit'.
        /// Structure is documented below.
        /// </summary>
        [Input("bandwidthLimit")]
        public Input<Inputs.TransferAgentPoolBandwidthLimitGetArgs>? BandwidthLimit { get; set; }

        /// <summary>
        /// Specifies the client-specified AgentPool description.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The ID of the agent pool to create.
        /// The agentPoolId must meet the following requirements:
        /// * Length of 128 characters or less.
        /// * Not start with the string goog.
        /// * Start with a lowercase ASCII character, followed by:
        /// * Zero or more: lowercase Latin alphabet characters, numerals, hyphens (-), periods (.), underscores (_), or tildes (~).
        /// * One or more numerals or lowercase ASCII characters.
        /// As expressed by the regular expression: ^(?!goog)a-z?$.
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
        /// Specifies the state of the AgentPool.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public TransferAgentPoolState()
        {
        }
        public static new TransferAgentPoolState Empty => new TransferAgentPoolState();
    }
}