// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apigee.Inputs
{

    public sealed class KeystoresAliasesSelfSignedCertSubjectAlternativeDnsNamesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Subject Alternative Name
        /// </summary>
        [Input("subjectAlternativeName")]
        public Input<string>? SubjectAlternativeName { get; set; }

        public KeystoresAliasesSelfSignedCertSubjectAlternativeDnsNamesGetArgs()
        {
        }
        public static new KeystoresAliasesSelfSignedCertSubjectAlternativeDnsNamesGetArgs Empty => new KeystoresAliasesSelfSignedCertSubjectAlternativeDnsNamesGetArgs();
    }
}