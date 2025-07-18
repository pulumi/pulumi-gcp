// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Iap.Inputs
{

    public sealed class SettingsApplicationSettingsAccessDeniedPageSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The URI to be redirected to when access is denied.
        /// </summary>
        [Input("accessDeniedPageUri")]
        public Input<string>? AccessDeniedPageUri { get; set; }

        /// <summary>
        /// Whether to generate a troubleshooting URL on access denied events to this application.
        /// </summary>
        [Input("generateTroubleshootingUri")]
        public Input<bool>? GenerateTroubleshootingUri { get; set; }

        /// <summary>
        /// Whether to generate remediation token on access denied events to this application.
        /// </summary>
        [Input("remediationTokenGenerationEnabled")]
        public Input<bool>? RemediationTokenGenerationEnabled { get; set; }

        public SettingsApplicationSettingsAccessDeniedPageSettingsGetArgs()
        {
        }
        public static new SettingsApplicationSettingsAccessDeniedPageSettingsGetArgs Empty => new SettingsApplicationSettingsAccessDeniedPageSettingsGetArgs();
    }
}
