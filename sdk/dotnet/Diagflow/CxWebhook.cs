// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow
{
    /// <summary>
    /// Webhooks host the developer's business logic. During a session, webhooks allow the developer to use the data extracted by Dialogflow's natural language processing to generate dynamic responses, validate collected data, or trigger actions on the backend.
    /// 
    /// To get more information about Webhook, see:
    /// 
    /// * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.webhooks)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
    /// 
    /// ## Example Usage
    /// ### Dialogflowcx Webhook Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var agent = new Gcp.Diagflow.CxAgent("agent", new()
    ///     {
    ///         DisplayName = "dialogflowcx-agent",
    ///         Location = "global",
    ///         DefaultLanguageCode = "en",
    ///         SupportedLanguageCodes = new[]
    ///         {
    ///             "it",
    ///             "de",
    ///             "es",
    ///         },
    ///         TimeZone = "America/New_York",
    ///         Description = "Example description.",
    ///         AvatarUri = "https://cloud.google.com/_static/images/cloud/icons/favicons/onecloud/super_cloud.png",
    ///         EnableStackdriverLogging = true,
    ///         EnableSpellCorrection = true,
    ///         SpeechToTextSettings = new Gcp.Diagflow.Inputs.CxAgentSpeechToTextSettingsArgs
    ///         {
    ///             EnableSpeechAdaptation = true,
    ///         },
    ///     });
    /// 
    ///     var basicWebhook = new Gcp.Diagflow.CxWebhook("basicWebhook", new()
    ///     {
    ///         Parent = agent.Id,
    ///         DisplayName = "MyFlow",
    ///         GenericWebService = new Gcp.Diagflow.Inputs.CxWebhookGenericWebServiceArgs
    ///         {
    ///             Uri = "https://example.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Webhook can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:diagflow/cxWebhook:CxWebhook default {{parent}}/webhooks/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:diagflow/cxWebhook:CxWebhook default {{parent}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:diagflow/cxWebhook:CxWebhook")]
    public partial class CxWebhook : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Indicates whether the webhook is disabled.
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// The human-readable name of the webhook, unique within the agent.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Indicates if automatic spell correction is enabled in detect intent requests.
        /// </summary>
        [Output("enableSpellCorrection")]
        public Output<bool?> EnableSpellCorrection { get; private set; } = null!;

        /// <summary>
        /// Determines whether this agent should log conversation queries.
        /// </summary>
        [Output("enableStackdriverLogging")]
        public Output<bool?> EnableStackdriverLogging { get; private set; } = null!;

        /// <summary>
        /// The name of Service Directory service.
        /// Structure is documented below.
        /// </summary>
        [Output("genericWebService")]
        public Output<Outputs.CxWebhookGenericWebService?> GenericWebService { get; private set; } = null!;

        /// <summary>
        /// The unique identifier of the webhook. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
        /// ID&gt;/webhooks/&lt;Webhook ID&gt;.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The agent to create a webhook for.
        /// Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
        /// </summary>
        [Output("parent")]
        public Output<string?> Parent { get; private set; } = null!;

        /// <summary>
        /// Name of the SecuritySettings reference for the agent. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/securitySettings/&lt;Security Settings ID&gt;.
        /// </summary>
        [Output("securitySettings")]
        public Output<string?> SecuritySettings { get; private set; } = null!;

        /// <summary>
        /// Configuration for a Service Directory service.
        /// Structure is documented below.
        /// </summary>
        [Output("serviceDirectory")]
        public Output<Outputs.CxWebhookServiceDirectory?> ServiceDirectory { get; private set; } = null!;

        /// <summary>
        /// Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only
        /// be deleted by deleting the agent. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow
        /// ID&gt;.
        /// </summary>
        [Output("startFlow")]
        public Output<string> StartFlow { get; private set; } = null!;

        /// <summary>
        /// Webhook execution timeout.
        /// </summary>
        [Output("timeout")]
        public Output<string?> Timeout { get; private set; } = null!;


        /// <summary>
        /// Create a CxWebhook resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CxWebhook(string name, CxWebhookArgs args, CustomResourceOptions? options = null)
            : base("gcp:diagflow/cxWebhook:CxWebhook", name, args ?? new CxWebhookArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CxWebhook(string name, Input<string> id, CxWebhookState? state = null, CustomResourceOptions? options = null)
            : base("gcp:diagflow/cxWebhook:CxWebhook", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CxWebhook resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CxWebhook Get(string name, Input<string> id, CxWebhookState? state = null, CustomResourceOptions? options = null)
        {
            return new CxWebhook(name, id, state, options);
        }
    }

    public sealed class CxWebhookArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether the webhook is disabled.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The human-readable name of the webhook, unique within the agent.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// Indicates if automatic spell correction is enabled in detect intent requests.
        /// </summary>
        [Input("enableSpellCorrection")]
        public Input<bool>? EnableSpellCorrection { get; set; }

        /// <summary>
        /// Determines whether this agent should log conversation queries.
        /// </summary>
        [Input("enableStackdriverLogging")]
        public Input<bool>? EnableStackdriverLogging { get; set; }

        /// <summary>
        /// The name of Service Directory service.
        /// Structure is documented below.
        /// </summary>
        [Input("genericWebService")]
        public Input<Inputs.CxWebhookGenericWebServiceArgs>? GenericWebService { get; set; }

        /// <summary>
        /// The agent to create a webhook for.
        /// Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
        /// </summary>
        [Input("parent")]
        public Input<string>? Parent { get; set; }

        /// <summary>
        /// Name of the SecuritySettings reference for the agent. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/securitySettings/&lt;Security Settings ID&gt;.
        /// </summary>
        [Input("securitySettings")]
        public Input<string>? SecuritySettings { get; set; }

        /// <summary>
        /// Configuration for a Service Directory service.
        /// Structure is documented below.
        /// </summary>
        [Input("serviceDirectory")]
        public Input<Inputs.CxWebhookServiceDirectoryArgs>? ServiceDirectory { get; set; }

        /// <summary>
        /// Webhook execution timeout.
        /// </summary>
        [Input("timeout")]
        public Input<string>? Timeout { get; set; }

        public CxWebhookArgs()
        {
        }
        public static new CxWebhookArgs Empty => new CxWebhookArgs();
    }

    public sealed class CxWebhookState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether the webhook is disabled.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The human-readable name of the webhook, unique within the agent.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Indicates if automatic spell correction is enabled in detect intent requests.
        /// </summary>
        [Input("enableSpellCorrection")]
        public Input<bool>? EnableSpellCorrection { get; set; }

        /// <summary>
        /// Determines whether this agent should log conversation queries.
        /// </summary>
        [Input("enableStackdriverLogging")]
        public Input<bool>? EnableStackdriverLogging { get; set; }

        /// <summary>
        /// The name of Service Directory service.
        /// Structure is documented below.
        /// </summary>
        [Input("genericWebService")]
        public Input<Inputs.CxWebhookGenericWebServiceGetArgs>? GenericWebService { get; set; }

        /// <summary>
        /// The unique identifier of the webhook. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
        /// ID&gt;/webhooks/&lt;Webhook ID&gt;.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The agent to create a webhook for.
        /// Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
        /// </summary>
        [Input("parent")]
        public Input<string>? Parent { get; set; }

        /// <summary>
        /// Name of the SecuritySettings reference for the agent. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/securitySettings/&lt;Security Settings ID&gt;.
        /// </summary>
        [Input("securitySettings")]
        public Input<string>? SecuritySettings { get; set; }

        /// <summary>
        /// Configuration for a Service Directory service.
        /// Structure is documented below.
        /// </summary>
        [Input("serviceDirectory")]
        public Input<Inputs.CxWebhookServiceDirectoryGetArgs>? ServiceDirectory { get; set; }

        /// <summary>
        /// Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only
        /// be deleted by deleting the agent. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow
        /// ID&gt;.
        /// </summary>
        [Input("startFlow")]
        public Input<string>? StartFlow { get; set; }

        /// <summary>
        /// Webhook execution timeout.
        /// </summary>
        [Input("timeout")]
        public Input<string>? Timeout { get; set; }

        public CxWebhookState()
        {
        }
        public static new CxWebhookState Empty => new CxWebhookState();
    }
}