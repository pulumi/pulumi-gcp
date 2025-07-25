// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AccessContextManager.Inputs
{

    public sealed class GcpUserAccessBindingSessionSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. How long a user is allowed to take between actions before a new access token must be issued. Only set for Google Cloud apps.
        /// </summary>
        [Input("maxInactivity")]
        public Input<string>? MaxInactivity { get; set; }

        /// <summary>
        /// Optional. The session length. Setting this field to zero is equal to disabling session. Also can set infinite session by flipping the enabled bit to false below. If useOidcMaxAge is true, for OIDC apps, the session length will be the minimum of this field and OIDC max_age param.
        /// </summary>
        [Input("sessionLength")]
        public Input<string>? SessionLength { get; set; }

        /// <summary>
        /// Optional. This field enables or disables Google Cloud session length. When false, all fields set above will be disregarded and the session length is basically infinite.
        /// </summary>
        [Input("sessionLengthEnabled")]
        public Input<bool>? SessionLengthEnabled { get; set; }

        /// <summary>
        /// Optional. The session challenges proposed to users when the Google Cloud session length is up.
        /// Possible values are: `LOGIN`, `SECURITY_KEY`, `PASSWORD`.
        /// </summary>
        [Input("sessionReauthMethod")]
        public Input<string>? SessionReauthMethod { get; set; }

        /// <summary>
        /// Optional. Only useful for OIDC apps. When false, the OIDC max_age param, if passed in the authentication request will be ignored. When true, the re-auth period will be the minimum of the sessionLength field and the max_age OIDC param.
        /// </summary>
        [Input("useOidcMaxAge")]
        public Input<bool>? UseOidcMaxAge { get; set; }

        public GcpUserAccessBindingSessionSettingsArgs()
        {
        }
        public static new GcpUserAccessBindingSessionSettingsArgs Empty => new GcpUserAccessBindingSessionSettingsArgs();
    }
}
