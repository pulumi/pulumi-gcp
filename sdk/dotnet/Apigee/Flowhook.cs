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
    /// Represents a sharedflow attachment to a flowhook point.
    /// 
    /// To get more information about Flowhook, see:
    /// 
    /// * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.flowhooks#FlowHook)
    /// * How-to Guides
    ///     * [organizations.environments.flowhooks](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.flowhooks#FlowHook)
    /// 
    /// ## Import
    /// 
    /// Flowhook can be imported using any of these accepted formats:
    /// 
    /// * `organizations/{{org_id}}/environments/{{environment}}/flowhooks/{{flow_hook_point}}`
    /// 
    /// * `{{org_id}}/{{environment}}/{{flow_hook_point}}`
    /// 
    /// When using the `pulumi import` command, Flowhook can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:apigee/flowhook:Flowhook default organizations/{{org_id}}/environments/{{environment}}/flowhooks/{{flow_hook_point}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:apigee/flowhook:Flowhook default {{org_id}}/{{environment}}/{{flow_hook_point}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:apigee/flowhook:Flowhook")]
    public partial class Flowhook : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Flag that specifies whether execution should continue if the flow hook throws an exception. Set to true to continue execution. Set to false to stop execution if the flow hook throws an exception. Defaults to true.
        /// </summary>
        [Output("continueOnError")]
        public Output<bool?> ContinueOnError { get; private set; } = null!;

        /// <summary>
        /// Description of the flow hook.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The resource ID of the environment.
        /// </summary>
        [Output("environment")]
        public Output<string> Environment { get; private set; } = null!;

        /// <summary>
        /// Where in the API call flow the flow hook is invoked. Must be one of PreProxyFlowHook, PostProxyFlowHook, PreTargetFlowHook, or PostTargetFlowHook.
        /// </summary>
        [Output("flowHookPoint")]
        public Output<string> FlowHookPoint { get; private set; } = null!;

        /// <summary>
        /// The Apigee Organization associated with the environment
        /// </summary>
        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// Id of the Sharedflow attaching to a flowhook point.
        /// </summary>
        [Output("sharedflow")]
        public Output<string> Sharedflow { get; private set; } = null!;


        /// <summary>
        /// Create a Flowhook resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Flowhook(string name, FlowhookArgs args, CustomResourceOptions? options = null)
            : base("gcp:apigee/flowhook:Flowhook", name, args ?? new FlowhookArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Flowhook(string name, Input<string> id, FlowhookState? state = null, CustomResourceOptions? options = null)
            : base("gcp:apigee/flowhook:Flowhook", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Flowhook resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Flowhook Get(string name, Input<string> id, FlowhookState? state = null, CustomResourceOptions? options = null)
        {
            return new Flowhook(name, id, state, options);
        }
    }

    public sealed class FlowhookArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Flag that specifies whether execution should continue if the flow hook throws an exception. Set to true to continue execution. Set to false to stop execution if the flow hook throws an exception. Defaults to true.
        /// </summary>
        [Input("continueOnError")]
        public Input<bool>? ContinueOnError { get; set; }

        /// <summary>
        /// Description of the flow hook.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The resource ID of the environment.
        /// </summary>
        [Input("environment", required: true)]
        public Input<string> Environment { get; set; } = null!;

        /// <summary>
        /// Where in the API call flow the flow hook is invoked. Must be one of PreProxyFlowHook, PostProxyFlowHook, PreTargetFlowHook, or PostTargetFlowHook.
        /// </summary>
        [Input("flowHookPoint", required: true)]
        public Input<string> FlowHookPoint { get; set; } = null!;

        /// <summary>
        /// The Apigee Organization associated with the environment
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// Id of the Sharedflow attaching to a flowhook point.
        /// </summary>
        [Input("sharedflow", required: true)]
        public Input<string> Sharedflow { get; set; } = null!;

        public FlowhookArgs()
        {
        }
        public static new FlowhookArgs Empty => new FlowhookArgs();
    }

    public sealed class FlowhookState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Flag that specifies whether execution should continue if the flow hook throws an exception. Set to true to continue execution. Set to false to stop execution if the flow hook throws an exception. Defaults to true.
        /// </summary>
        [Input("continueOnError")]
        public Input<bool>? ContinueOnError { get; set; }

        /// <summary>
        /// Description of the flow hook.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The resource ID of the environment.
        /// </summary>
        [Input("environment")]
        public Input<string>? Environment { get; set; }

        /// <summary>
        /// Where in the API call flow the flow hook is invoked. Must be one of PreProxyFlowHook, PostProxyFlowHook, PreTargetFlowHook, or PostTargetFlowHook.
        /// </summary>
        [Input("flowHookPoint")]
        public Input<string>? FlowHookPoint { get; set; }

        /// <summary>
        /// The Apigee Organization associated with the environment
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Id of the Sharedflow attaching to a flowhook point.
        /// </summary>
        [Input("sharedflow")]
        public Input<string>? Sharedflow { get; set; }

        public FlowhookState()
        {
        }
        public static new FlowhookState Empty => new FlowhookState();
    }
}
