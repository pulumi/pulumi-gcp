// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class BackendServiceTlsSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Reference to the BackendAuthenticationConfig resource from the networksecurity.googleapis.com namespace.
        /// Can be used in authenticating TLS connections to the backend, as specified by the authenticationMode field.
        /// Can only be specified if authenticationMode is not NONE.
        /// </summary>
        [Input("authenticationConfig")]
        public Input<string>? AuthenticationConfig { get; set; }

        /// <summary>
        /// Server Name Indication - see RFC3546 section 3.1. If set, the load balancer sends this string as the SNI hostname in the
        /// TLS connection to the backend, and requires that this string match a Subject Alternative Name (SAN) in the backend's
        /// server certificate. With a Regional Internet NEG backend, if the SNI is specified here, the load balancer uses it
        /// regardless of whether the Regional Internet NEG is specified with FQDN or IP address and port.
        /// </summary>
        [Input("sni")]
        public Input<string>? Sni { get; set; }

        [Input("subjectAltNames")]
        private InputList<Inputs.BackendServiceTlsSettingsSubjectAltNameArgs>? _subjectAltNames;

        /// <summary>
        /// A list of Subject Alternative Names (SANs) that the Load Balancer verifies during a TLS handshake with the backend.
        /// When the server presents its X.509 certificate to the Load Balancer, the Load Balancer inspects the certificate's SAN field,
        /// and requires that at least one SAN match one of the subjectAltNames in the list. This field is limited to 5 entries.
        /// When both sni and subjectAltNames are specified, the load balancer matches the backend certificate's SAN only to
        /// subjectAltNames.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.BackendServiceTlsSettingsSubjectAltNameArgs> SubjectAltNames
        {
            get => _subjectAltNames ?? (_subjectAltNames = new InputList<Inputs.BackendServiceTlsSettingsSubjectAltNameArgs>());
            set => _subjectAltNames = value;
        }

        public BackendServiceTlsSettingsArgs()
        {
        }
        public static new BackendServiceTlsSettingsArgs Empty => new BackendServiceTlsSettingsArgs();
    }
}
