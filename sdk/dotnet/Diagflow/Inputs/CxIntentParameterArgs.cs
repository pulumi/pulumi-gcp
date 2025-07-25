// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxIntentParameterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The entity type of the parameter.
        /// Format: projects/-/locations/-/agents/-/entityTypes/&lt;System Entity Type ID&gt; for system entity types (for example, projects/-/locations/-/agents/-/entityTypes/sys.date), or projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/entityTypes/&lt;Entity Type ID&gt; for developer entity types.
        /// </summary>
        [Input("entityType", required: true)]
        public Input<string> EntityType { get; set; } = null!;

        /// <summary>
        /// The unique identifier of the parameter. This field is used by training phrases to annotate their parts.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// Indicates whether the parameter represents a list of values.
        /// </summary>
        [Input("isList")]
        public Input<bool>? IsList { get; set; }

        /// <summary>
        /// Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging.
        /// Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
        /// </summary>
        [Input("redact")]
        public Input<bool>? Redact { get; set; }

        public CxIntentParameterArgs()
        {
        }
        public static new CxIntentParameterArgs Empty => new CxIntentParameterArgs();
    }
}
