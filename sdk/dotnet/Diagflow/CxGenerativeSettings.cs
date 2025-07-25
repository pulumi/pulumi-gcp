// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow
{
    /// <summary>
    /// Settings for Generative AI.
    /// 
    /// To get more information about GenerativeSettings, see:
    /// 
    /// * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents/getGenerativeSettings)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
    /// 
    /// ## Example Usage
    /// 
    /// ### Dialogflowcx Generative Settings Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
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
    ///         TimeZone = "America/New_York",
    ///         Description = "Example description.",
    ///     });
    /// 
    ///     var fullGenerativeSettings = new Gcp.Diagflow.CxGenerativeSettings("full_generative_settings", new()
    ///     {
    ///         Parent = agent.Id,
    ///         FallbackSettings = new Gcp.Diagflow.Inputs.CxGenerativeSettingsFallbackSettingsArgs
    ///         {
    ///             SelectedPrompt = "example prompt",
    ///             PromptTemplates = new[]
    ///             {
    ///                 new Gcp.Diagflow.Inputs.CxGenerativeSettingsFallbackSettingsPromptTemplateArgs
    ///                 {
    ///                     DisplayName = "example prompt",
    ///                     PromptText = "example prompt text",
    ///                     Frozen = false,
    ///                 },
    ///             },
    ///         },
    ///         GenerativeSafetySettings = new Gcp.Diagflow.Inputs.CxGenerativeSettingsGenerativeSafetySettingsArgs
    ///         {
    ///             DefaultBannedPhraseMatchStrategy = "PARTIAL_MATCH",
    ///             BannedPhrases = new[]
    ///             {
    ///                 new Gcp.Diagflow.Inputs.CxGenerativeSettingsGenerativeSafetySettingsBannedPhraseArgs
    ///                 {
    ///                     Text = "example text",
    ///                     LanguageCode = "en",
    ///                 },
    ///             },
    ///         },
    ///         KnowledgeConnectorSettings = new Gcp.Diagflow.Inputs.CxGenerativeSettingsKnowledgeConnectorSettingsArgs
    ///         {
    ///             Business = "example business",
    ///             Agent = "example agent",
    ///             AgentIdentity = "virtual agent",
    ///             BusinessDescription = "a family company selling freshly roasted coffee beans",
    ///             AgentScope = "Example company website",
    ///             DisableDataStoreFallback = false,
    ///         },
    ///         LanguageCode = "en",
    ///         LlmModelSettings = new Gcp.Diagflow.Inputs.CxGenerativeSettingsLlmModelSettingsArgs
    ///         {
    ///             Model = "gemini-2.0-flash-001",
    ///             PromptText = "example prompt text",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// GenerativeSettings can be imported using any of these accepted formats:
    /// 
    /// * `{{parent}}/generativeSettings`
    /// 
    /// * `{{parent}}`
    /// 
    /// When using the `pulumi import` command, GenerativeSettings can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:diagflow/cxGenerativeSettings:CxGenerativeSettings default {{parent}}/generativeSettings
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:diagflow/cxGenerativeSettings:CxGenerativeSettings default {{parent}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:diagflow/cxGenerativeSettings:CxGenerativeSettings")]
    public partial class CxGenerativeSettings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Settings for Generative Fallback.
        /// Structure is documented below.
        /// </summary>
        [Output("fallbackSettings")]
        public Output<Outputs.CxGenerativeSettingsFallbackSettings?> FallbackSettings { get; private set; } = null!;

        /// <summary>
        /// Settings for Generative Safety.
        /// w
        /// Structure is documented below.
        /// </summary>
        [Output("generativeSafetySettings")]
        public Output<Outputs.CxGenerativeSettingsGenerativeSafetySettings?> GenerativeSafetySettings { get; private set; } = null!;

        /// <summary>
        /// Settings for knowledge connector.
        /// Structure is documented below.
        /// </summary>
        [Output("knowledgeConnectorSettings")]
        public Output<Outputs.CxGenerativeSettingsKnowledgeConnectorSettings?> KnowledgeConnectorSettings { get; private set; } = null!;

        /// <summary>
        /// Language for this settings.
        /// </summary>
        [Output("languageCode")]
        public Output<string> LanguageCode { get; private set; } = null!;

        /// <summary>
        /// LLM model settings.
        /// Structure is documented below.
        /// </summary>
        [Output("llmModelSettings")]
        public Output<Outputs.CxGenerativeSettingsLlmModelSettings?> LlmModelSettings { get; private set; } = null!;

        /// <summary>
        /// The unique identifier of the generativeSettings.
        /// Format: projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/generativeSettings.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The agent to create a flow for.
        /// Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
        /// </summary>
        [Output("parent")]
        public Output<string?> Parent { get; private set; } = null!;


        /// <summary>
        /// Create a CxGenerativeSettings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CxGenerativeSettings(string name, CxGenerativeSettingsArgs args, CustomResourceOptions? options = null)
            : base("gcp:diagflow/cxGenerativeSettings:CxGenerativeSettings", name, args ?? new CxGenerativeSettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CxGenerativeSettings(string name, Input<string> id, CxGenerativeSettingsState? state = null, CustomResourceOptions? options = null)
            : base("gcp:diagflow/cxGenerativeSettings:CxGenerativeSettings", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CxGenerativeSettings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CxGenerativeSettings Get(string name, Input<string> id, CxGenerativeSettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new CxGenerativeSettings(name, id, state, options);
        }
    }

    public sealed class CxGenerativeSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Settings for Generative Fallback.
        /// Structure is documented below.
        /// </summary>
        [Input("fallbackSettings")]
        public Input<Inputs.CxGenerativeSettingsFallbackSettingsArgs>? FallbackSettings { get; set; }

        /// <summary>
        /// Settings for Generative Safety.
        /// w
        /// Structure is documented below.
        /// </summary>
        [Input("generativeSafetySettings")]
        public Input<Inputs.CxGenerativeSettingsGenerativeSafetySettingsArgs>? GenerativeSafetySettings { get; set; }

        /// <summary>
        /// Settings for knowledge connector.
        /// Structure is documented below.
        /// </summary>
        [Input("knowledgeConnectorSettings")]
        public Input<Inputs.CxGenerativeSettingsKnowledgeConnectorSettingsArgs>? KnowledgeConnectorSettings { get; set; }

        /// <summary>
        /// Language for this settings.
        /// </summary>
        [Input("languageCode", required: true)]
        public Input<string> LanguageCode { get; set; } = null!;

        /// <summary>
        /// LLM model settings.
        /// Structure is documented below.
        /// </summary>
        [Input("llmModelSettings")]
        public Input<Inputs.CxGenerativeSettingsLlmModelSettingsArgs>? LlmModelSettings { get; set; }

        /// <summary>
        /// The agent to create a flow for.
        /// Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
        /// </summary>
        [Input("parent")]
        public Input<string>? Parent { get; set; }

        public CxGenerativeSettingsArgs()
        {
        }
        public static new CxGenerativeSettingsArgs Empty => new CxGenerativeSettingsArgs();
    }

    public sealed class CxGenerativeSettingsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Settings for Generative Fallback.
        /// Structure is documented below.
        /// </summary>
        [Input("fallbackSettings")]
        public Input<Inputs.CxGenerativeSettingsFallbackSettingsGetArgs>? FallbackSettings { get; set; }

        /// <summary>
        /// Settings for Generative Safety.
        /// w
        /// Structure is documented below.
        /// </summary>
        [Input("generativeSafetySettings")]
        public Input<Inputs.CxGenerativeSettingsGenerativeSafetySettingsGetArgs>? GenerativeSafetySettings { get; set; }

        /// <summary>
        /// Settings for knowledge connector.
        /// Structure is documented below.
        /// </summary>
        [Input("knowledgeConnectorSettings")]
        public Input<Inputs.CxGenerativeSettingsKnowledgeConnectorSettingsGetArgs>? KnowledgeConnectorSettings { get; set; }

        /// <summary>
        /// Language for this settings.
        /// </summary>
        [Input("languageCode")]
        public Input<string>? LanguageCode { get; set; }

        /// <summary>
        /// LLM model settings.
        /// Structure is documented below.
        /// </summary>
        [Input("llmModelSettings")]
        public Input<Inputs.CxGenerativeSettingsLlmModelSettingsGetArgs>? LlmModelSettings { get; set; }

        /// <summary>
        /// The unique identifier of the generativeSettings.
        /// Format: projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/generativeSettings.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The agent to create a flow for.
        /// Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
        /// </summary>
        [Input("parent")]
        public Input<string>? Parent { get; set; }

        public CxGenerativeSettingsState()
        {
        }
        public static new CxGenerativeSettingsState Empty => new CxGenerativeSettingsState();
    }
}
