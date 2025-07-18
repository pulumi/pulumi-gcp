// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CertificateAuthority.Inputs
{

    public sealed class AuthorityUserDefinedAccessUrlsArgs : global::Pulumi.ResourceArgs
    {
        [Input("aiaIssuingCertificateUrls")]
        private InputList<string>? _aiaIssuingCertificateUrls;

        /// <summary>
        /// A list of URLs where this CertificateAuthority's CA certificate is published that is specified by users.
        /// </summary>
        public InputList<string> AiaIssuingCertificateUrls
        {
            get => _aiaIssuingCertificateUrls ?? (_aiaIssuingCertificateUrls = new InputList<string>());
            set => _aiaIssuingCertificateUrls = value;
        }

        [Input("crlAccessUrls")]
        private InputList<string>? _crlAccessUrls;

        /// <summary>
        /// A list of URLs where this CertificateAuthority's CRLs are published that is specified by users.
        /// </summary>
        public InputList<string> CrlAccessUrls
        {
            get => _crlAccessUrls ?? (_crlAccessUrls = new InputList<string>());
            set => _crlAccessUrls = value;
        }

        public AuthorityUserDefinedAccessUrlsArgs()
        {
        }
        public static new AuthorityUserDefinedAccessUrlsArgs Empty => new AuthorityUserDefinedAccessUrlsArgs();
    }
}
