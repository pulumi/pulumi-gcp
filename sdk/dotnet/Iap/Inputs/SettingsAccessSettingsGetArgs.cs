// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Iap.Inputs
{

    public sealed class SettingsAccessSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Settings to configure and enable allowed domains.
        /// Structure is documented below.
        /// </summary>
        [Input("allowedDomainsSettings")]
        public Input<Inputs.SettingsAccessSettingsAllowedDomainsSettingsGetArgs>? AllowedDomainsSettings { get; set; }

        /// <summary>
        /// Configuration to allow cross-origin requests via IAP.
        /// Structure is documented below.
        /// </summary>
        [Input("corsSettings")]
        public Input<Inputs.SettingsAccessSettingsCorsSettingsGetArgs>? CorsSettings { get; set; }

        /// <summary>
        /// GCIP claims and endpoint configurations for 3p identity providers.
        /// * Enabling gcipSetting significantly changes the way IAP authenticates users. Identity Platform does not support IAM, so IAP will not enforce any IAM policies for requests to your application.
        /// Structure is documented below.
        /// </summary>
        [Input("gcipSettings")]
        public Input<Inputs.SettingsAccessSettingsGcipSettingsGetArgs>? GcipSettings { get; set; }

        [Input("identitySources")]
        private InputList<string>? _identitySources;

        /// <summary>
        /// Identity sources that IAP can use to authenticate the end user. Only one identity source
        /// can be configured. The possible values are:
        /// * `WORKFORCE_IDENTITY_FEDERATION`: Use external identities set up on Google Cloud Workforce
        /// Identity Federation.
        /// Each value may be one of: `WORKFORCE_IDENTITY_FEDERATION`.
        /// </summary>
        public InputList<string> IdentitySources
        {
            get => _identitySources ?? (_identitySources = new InputList<string>());
            set => _identitySources = value;
        }

        /// <summary>
        /// Settings to configure IAP's OAuth behavior.
        /// Structure is documented below.
        /// </summary>
        [Input("oauthSettings")]
        public Input<Inputs.SettingsAccessSettingsOauthSettingsGetArgs>? OauthSettings { get; set; }

        /// <summary>
        /// Settings to configure reauthentication policies in IAP.
        /// Structure is documented below.
        /// </summary>
        [Input("reauthSettings")]
        public Input<Inputs.SettingsAccessSettingsReauthSettingsGetArgs>? ReauthSettings { get; set; }

        /// <summary>
        /// Settings to configure the workforce identity federation, including workforce pools
        /// and OAuth 2.0 settings.
        /// Structure is documented below.
        /// </summary>
        [Input("workforceIdentitySettings")]
        public Input<Inputs.SettingsAccessSettingsWorkforceIdentitySettingsGetArgs>? WorkforceIdentitySettings { get; set; }

        public SettingsAccessSettingsGetArgs()
        {
        }
        public static new SettingsAccessSettingsGetArgs Empty => new SettingsAccessSettingsGetArgs();
    }
}
