// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ApiHub.Outputs
{

    [OutputType]
    public sealed class PluginActionsConfig
    {
        /// <summary>
        /// The description of the operation performed by the action.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The display name of the action.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// The id of the action.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The trigger mode supported by the action.
        /// Possible values:
        /// TRIGGER_MODE_UNSPECIFIED
        /// API_HUB_ON_DEMAND_TRIGGER
        /// API_HUB_SCHEDULE_TRIGGER
        /// NON_API_HUB_MANAGED
        /// </summary>
        public readonly string TriggerMode;

        [OutputConstructor]
        private PluginActionsConfig(
            string description,

            string displayName,

            string id,

            string triggerMode)
        {
            Description = description;
            DisplayName = displayName;
            Id = id;
            TriggerMode = triggerMode;
        }
    }
}
