// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CertificateManager.Inputs
{

    public sealed class CertificateSelfManagedGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The certificate chain in PEM-encoded form.
        /// Leaf certificate comes first, followed by intermediate ones if any.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        [Input("certificatePem", required: true)]
        public Input<string> CertificatePem { get; set; } = null!;

        /// <summary>
        /// The private key of the leaf certificate in PEM-encoded form.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        [Input("privateKeyPem", required: true)]
        public Input<string> PrivateKeyPem { get; set; } = null!;

        public CertificateSelfManagedGetArgs()
        {
        }
    }
}