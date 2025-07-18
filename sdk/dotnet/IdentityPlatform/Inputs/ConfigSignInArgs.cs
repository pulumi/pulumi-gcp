// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IdentityPlatform.Inputs
{

    public sealed class ConfigSignInArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to allow more than one account to have the same email.
        /// </summary>
        [Input("allowDuplicateEmails")]
        public Input<bool>? AllowDuplicateEmails { get; set; }

        /// <summary>
        /// Configuration options related to authenticating an anonymous user.
        /// Structure is documented below.
        /// </summary>
        [Input("anonymous")]
        public Input<Inputs.ConfigSignInAnonymousArgs>? Anonymous { get; set; }

        /// <summary>
        /// Configuration options related to authenticating a user by their email address.
        /// Structure is documented below.
        /// </summary>
        [Input("email")]
        public Input<Inputs.ConfigSignInEmailArgs>? Email { get; set; }

        [Input("hashConfigs")]
        private InputList<Inputs.ConfigSignInHashConfigArgs>? _hashConfigs;

        /// <summary>
        /// (Output)
        /// Output only. Hash config information.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ConfigSignInHashConfigArgs> HashConfigs
        {
            get => _hashConfigs ?? (_hashConfigs = new InputList<Inputs.ConfigSignInHashConfigArgs>());
            set => _hashConfigs = value;
        }

        /// <summary>
        /// Configuration options related to authenticated a user by their phone number.
        /// Structure is documented below.
        /// </summary>
        [Input("phoneNumber")]
        public Input<Inputs.ConfigSignInPhoneNumberArgs>? PhoneNumber { get; set; }

        public ConfigSignInArgs()
        {
        }
        public static new ConfigSignInArgs Empty => new ConfigSignInArgs();
    }
}
