// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CertificateAuthority.Inputs
{

    public sealed class CertificateConfigPublicKeyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The format of the public key. Currently, only PEM format is supported.
        /// Possible values are: `KEY_TYPE_UNSPECIFIED`, `PEM`.
        /// </summary>
        [Input("format", required: true)]
        public Input<string> Format { get; set; } = null!;

        /// <summary>
        /// Required. A public key. When this is specified in a request, the padding and encoding can be any of the options described by the respective 'KeyType' value. When this is generated by the service, it will always be an RFC 5280 SubjectPublicKeyInfo structure containing an algorithm identifier and a key. A base64-encoded string.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        public CertificateConfigPublicKeyGetArgs()
        {
        }
        public static new CertificateConfigPublicKeyGetArgs Empty => new CertificateConfigPublicKeyGetArgs();
    }
}
