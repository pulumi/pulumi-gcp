// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CertificateAuthority.Inputs
{

    public sealed class AuthorityConfigSubjectKeyIdArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The value of the KeyId in lowercase hexadecimal.
        /// 
        /// &lt;a name="nested_config_x509_config"&gt;&lt;/a&gt;The `x509_config` block supports:
        /// </summary>
        [Input("keyId")]
        public Input<string>? KeyId { get; set; }

        public AuthorityConfigSubjectKeyIdArgs()
        {
        }
        public static new AuthorityConfigSubjectKeyIdArgs Empty => new AuthorityConfigSubjectKeyIdArgs();
    }
}
