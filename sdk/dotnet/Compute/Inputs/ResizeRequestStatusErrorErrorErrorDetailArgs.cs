// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class ResizeRequestStatusErrorErrorErrorDetailArgs : global::Pulumi.ResourceArgs
    {
        [Input("errorInfos")]
        private InputList<Inputs.ResizeRequestStatusErrorErrorErrorDetailErrorInfoArgs>? _errorInfos;

        /// <summary>
        /// (Output)
        /// A nested object resource.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ResizeRequestStatusErrorErrorErrorDetailErrorInfoArgs> ErrorInfos
        {
            get => _errorInfos ?? (_errorInfos = new InputList<Inputs.ResizeRequestStatusErrorErrorErrorDetailErrorInfoArgs>());
            set => _errorInfos = value;
        }

        [Input("helps")]
        private InputList<Inputs.ResizeRequestStatusErrorErrorErrorDetailHelpArgs>? _helps;

        /// <summary>
        /// (Output)
        /// A nested object resource.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ResizeRequestStatusErrorErrorErrorDetailHelpArgs> Helps
        {
            get => _helps ?? (_helps = new InputList<Inputs.ResizeRequestStatusErrorErrorErrorDetailHelpArgs>());
            set => _helps = value;
        }

        [Input("localizedMessages")]
        private InputList<Inputs.ResizeRequestStatusErrorErrorErrorDetailLocalizedMessageArgs>? _localizedMessages;

        /// <summary>
        /// (Output)
        /// A nested object resource.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ResizeRequestStatusErrorErrorErrorDetailLocalizedMessageArgs> LocalizedMessages
        {
            get => _localizedMessages ?? (_localizedMessages = new InputList<Inputs.ResizeRequestStatusErrorErrorErrorDetailLocalizedMessageArgs>());
            set => _localizedMessages = value;
        }

        [Input("quotaInfos")]
        private InputList<Inputs.ResizeRequestStatusErrorErrorErrorDetailQuotaInfoArgs>? _quotaInfos;

        /// <summary>
        /// (Output)
        /// A nested object resource.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ResizeRequestStatusErrorErrorErrorDetailQuotaInfoArgs> QuotaInfos
        {
            get => _quotaInfos ?? (_quotaInfos = new InputList<Inputs.ResizeRequestStatusErrorErrorErrorDetailQuotaInfoArgs>());
            set => _quotaInfos = value;
        }

        public ResizeRequestStatusErrorErrorErrorDetailArgs()
        {
        }
        public static new ResizeRequestStatusErrorErrorErrorDetailArgs Empty => new ResizeRequestStatusErrorErrorErrorDetailArgs();
    }
}
