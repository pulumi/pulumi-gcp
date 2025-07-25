// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IdentityPlatform.Inputs
{

    public sealed class InboundSamlConfigSpConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Callback URI where responses from IDP are handled. Must start with `https://`.
        /// </summary>
        [Input("callbackUri")]
        public Input<string>? CallbackUri { get; set; }

        [Input("spCertificates")]
        private InputList<Inputs.InboundSamlConfigSpConfigSpCertificateArgs>? _spCertificates;

        /// <summary>
        /// (Output)
        /// The IDP's certificate data to verify the signature in the SAMLResponse issued by the IDP.
        /// Structure is documented below.
        /// 
        /// 
        /// &lt;a name="nested_sp_config_sp_certificates"&gt;&lt;/a&gt;The `sp_certificates` block contains:
        /// </summary>
        public InputList<Inputs.InboundSamlConfigSpConfigSpCertificateArgs> SpCertificates
        {
            get => _spCertificates ?? (_spCertificates = new InputList<Inputs.InboundSamlConfigSpConfigSpCertificateArgs>());
            set => _spCertificates = value;
        }

        /// <summary>
        /// Unique identifier for all SAML entities.
        /// </summary>
        [Input("spEntityId")]
        public Input<string>? SpEntityId { get; set; }

        public InboundSamlConfigSpConfigArgs()
        {
        }
        public static new InboundSamlConfigSpConfigArgs Empty => new InboundSamlConfigSpConfigArgs();
    }
}
