// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apigee.Inputs
{

    public sealed class KeystoresAliasesSelfSignedCertSubjectAlternativeDnsNamesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Subject Alternative Name
        /// </summary>
        [Input("subjectAlternativeName")]
        public Input<string>? SubjectAlternativeName { get; set; }

        public KeystoresAliasesSelfSignedCertSubjectAlternativeDnsNamesArgs()
        {
        }
        public static new KeystoresAliasesSelfSignedCertSubjectAlternativeDnsNamesArgs Empty => new KeystoresAliasesSelfSignedCertSubjectAlternativeDnsNamesArgs();
    }
}
