// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CertificateAuthority.Inputs
{

    public sealed class CaPoolPublishingOptionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the encoding format of each CertificateAuthority's CA
        /// certificate and CRLs. If this is omitted, CA certificates and CRLs
        /// will be published in PEM.
        /// Possible values are: `PEM`, `DER`.
        /// </summary>
        [Input("encodingFormat")]
        public Input<string>? EncodingFormat { get; set; }

        /// <summary>
        /// When true, publishes each CertificateAuthority's CA certificate and includes its URL in the "Authority Information Access"
        /// X.509 extension in all issued Certificates. If this is false, the CA certificate will not be published and the corresponding
        /// X.509 extension will not be written in issued certificates.
        /// </summary>
        [Input("publishCaCert", required: true)]
        public Input<bool> PublishCaCert { get; set; } = null!;

        /// <summary>
        /// When true, publishes each CertificateAuthority's CRL and includes its URL in the "CRL Distribution Points" X.509 extension
        /// in all issued Certificates. If this is false, CRLs will not be published and the corresponding X.509 extension will not
        /// be written in issued certificates. CRLs will expire 7 days from their creation. However, we will rebuild daily. CRLs are
        /// also rebuilt shortly after a certificate is revoked.
        /// </summary>
        [Input("publishCrl", required: true)]
        public Input<bool> PublishCrl { get; set; } = null!;

        public CaPoolPublishingOptionsArgs()
        {
        }
        public static new CaPoolPublishingOptionsArgs Empty => new CaPoolPublishingOptionsArgs();
    }
}
