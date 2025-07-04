// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IdentityPlatform.Inputs
{

    public sealed class InboundSamlConfigIdpConfigIdpCertificateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IdP's x509 certificate.
        /// </summary>
        [Input("x509Certificate")]
        public Input<string>? X509Certificate { get; set; }

        public InboundSamlConfigIdpConfigIdpCertificateGetArgs()
        {
        }
        public static new InboundSamlConfigIdpConfigIdpCertificateGetArgs Empty => new InboundSamlConfigIdpConfigIdpCertificateGetArgs();
    }
}
