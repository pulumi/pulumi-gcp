// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InterconnectMacsecArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If set to true, the Interconnect connection is configured with a should-secure
        /// MACsec security policy, that allows the Google router to fallback to cleartext
        /// traffic if the MKA session cannot be established. By default, the Interconnect
        /// connection is configured with a must-secure security policy that drops all traffic
        /// if the MKA session cannot be established with your router.
        /// </summary>
        [Input("failOpen")]
        public Input<bool>? FailOpen { get; set; }

        [Input("preSharedKeys", required: true)]
        private InputList<Inputs.InterconnectMacsecPreSharedKeyArgs>? _preSharedKeys;

        /// <summary>
        /// A keychain placeholder describing a set of named key objects along with their
        /// start times. A MACsec CKN/CAK is generated for each key in the key chain.
        /// Google router automatically picks the key with the most recent startTime when establishing
        /// or re-establishing a MACsec secure link.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.InterconnectMacsecPreSharedKeyArgs> PreSharedKeys
        {
            get => _preSharedKeys ?? (_preSharedKeys = new InputList<Inputs.InterconnectMacsecPreSharedKeyArgs>());
            set => _preSharedKeys = value;
        }

        public InterconnectMacsecArgs()
        {
        }
        public static new InterconnectMacsecArgs Empty => new InterconnectMacsecArgs();
    }
}
