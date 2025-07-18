// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apigee.Outputs
{

    [OutputType]
    public sealed class KeystoresAliasesKeyCertFileCertsInfo
    {
        /// <summary>
        /// (Output)
        /// List of all properties in the object.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.KeystoresAliasesKeyCertFileCertsInfoCertInfo> CertInfos;

        [OutputConstructor]
        private KeystoresAliasesKeyCertFileCertsInfo(ImmutableArray<Outputs.KeystoresAliasesKeyCertFileCertsInfoCertInfo> certInfos)
        {
            CertInfos = certInfos;
        }
    }
}
