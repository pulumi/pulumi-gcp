// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Kms.Inputs
{

    public sealed class KeyRingImportJobPublicKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Output)
        /// The public key, encoded in PEM format. For more information, see the RFC 7468 sections
        /// for General Considerations and Textual Encoding of Subject Public Key Info.
        /// </summary>
        [Input("pem")]
        public Input<string>? Pem { get; set; }

        public KeyRingImportJobPublicKeyArgs()
        {
        }
        public static new KeyRingImportJobPublicKeyArgs Empty => new KeyRingImportJobPublicKeyArgs();
    }
}
