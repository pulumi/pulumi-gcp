// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CertificateAuthority.Inputs
{

    public sealed class CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdArgs : global::Pulumi.ResourceArgs
    {
        [Input("objectIdPaths", required: true)]
        private InputList<int>? _objectIdPaths;

        /// <summary>
        /// Required. The parts of an OID path. The most significant parts of the path come first.
        /// </summary>
        public InputList<int> ObjectIdPaths
        {
            get => _objectIdPaths ?? (_objectIdPaths = new InputList<int>());
            set => _objectIdPaths = value;
        }

        public CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdArgs()
        {
        }
        public static new CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdArgs Empty => new CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdArgs();
    }
}
