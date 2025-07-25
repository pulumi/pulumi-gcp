// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IdentityPlatform.Inputs
{

    public sealed class ConfigSignInPhoneNumberGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether phone number auth is enabled for the project or not.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("testPhoneNumbers")]
        private InputMap<string>? _testPhoneNumbers;

        /// <summary>
        /// A map of &lt;test phone number, fake code&gt; that can be used for phone auth testing.
        /// </summary>
        public InputMap<string> TestPhoneNumbers
        {
            get => _testPhoneNumbers ?? (_testPhoneNumbers = new InputMap<string>());
            set => _testPhoneNumbers = value;
        }

        public ConfigSignInPhoneNumberGetArgs()
        {
        }
        public static new ConfigSignInPhoneNumberGetArgs Empty => new ConfigSignInPhoneNumberGetArgs();
    }
}
