// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ApiHub.Inputs
{

    public sealed class PluginConfigTemplateGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalConfigTemplates")]
        private InputList<Inputs.PluginConfigTemplateAdditionalConfigTemplateGetArgs>? _additionalConfigTemplates;

        /// <summary>
        /// The list of additional configuration variables for the plugin's
        /// configuration.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PluginConfigTemplateAdditionalConfigTemplateGetArgs> AdditionalConfigTemplates
        {
            get => _additionalConfigTemplates ?? (_additionalConfigTemplates = new InputList<Inputs.PluginConfigTemplateAdditionalConfigTemplateGetArgs>());
            set => _additionalConfigTemplates = value;
        }

        /// <summary>
        /// AuthConfigTemplate represents the authentication template for a plugin.
        /// Structure is documented below.
        /// </summary>
        [Input("authConfigTemplate")]
        public Input<Inputs.PluginConfigTemplateAuthConfigTemplateGetArgs>? AuthConfigTemplate { get; set; }

        public PluginConfigTemplateGetArgs()
        {
        }
        public static new PluginConfigTemplateGetArgs Empty => new PluginConfigTemplateGetArgs();
    }
}
