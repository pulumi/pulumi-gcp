// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Projects.Inputs
{

    public sealed class ApiKeyRestrictionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Android apps that are allowed to use the key.
        /// </summary>
        [Input("androidKeyRestrictions")]
        public Input<Inputs.ApiKeyRestrictionsAndroidKeyRestrictionsArgs>? AndroidKeyRestrictions { get; set; }

        [Input("apiTargets")]
        private InputList<Inputs.ApiKeyRestrictionsApiTargetArgs>? _apiTargets;

        /// <summary>
        /// A restriction for a specific service and optionally one or more specific methods. Requests are allowed if they match any of these restrictions. If no restrictions are specified, all targets are allowed.
        /// </summary>
        public InputList<Inputs.ApiKeyRestrictionsApiTargetArgs> ApiTargets
        {
            get => _apiTargets ?? (_apiTargets = new InputList<Inputs.ApiKeyRestrictionsApiTargetArgs>());
            set => _apiTargets = value;
        }

        /// <summary>
        /// The HTTP referrers (websites) that are allowed to use the key.
        /// </summary>
        [Input("browserKeyRestrictions")]
        public Input<Inputs.ApiKeyRestrictionsBrowserKeyRestrictionsArgs>? BrowserKeyRestrictions { get; set; }

        /// <summary>
        /// The iOS apps that are allowed to use the key.
        /// </summary>
        [Input("iosKeyRestrictions")]
        public Input<Inputs.ApiKeyRestrictionsIosKeyRestrictionsArgs>? IosKeyRestrictions { get; set; }

        /// <summary>
        /// The IP addresses of callers that are allowed to use the key.
        /// </summary>
        [Input("serverKeyRestrictions")]
        public Input<Inputs.ApiKeyRestrictionsServerKeyRestrictionsArgs>? ServerKeyRestrictions { get; set; }

        public ApiKeyRestrictionsArgs()
        {
        }
        public static new ApiKeyRestrictionsArgs Empty => new ApiKeyRestrictionsArgs();
    }
}
