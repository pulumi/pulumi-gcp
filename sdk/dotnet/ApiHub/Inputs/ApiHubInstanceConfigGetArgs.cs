// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ApiHub.Inputs
{

    public sealed class ApiHubInstanceConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. The Customer Managed Encryption Key (CMEK) used for data encryption.
        /// The CMEK name should follow the format of
        /// `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`,
        /// where the location must match the instance location.
        /// If the CMEK is not provided, a GMEK will be created for the instance.
        /// </summary>
        [Input("cmekKeyName")]
        public Input<string>? CmekKeyName { get; set; }

        /// <summary>
        /// Optional. If true, the search will be disabled for the instance. The default value
        /// is false.
        /// </summary>
        [Input("disableSearch")]
        public Input<bool>? DisableSearch { get; set; }

        /// <summary>
        /// Optional. Encryption type for the region. If the encryption type is CMEK, the
        /// cmek_key_name must be provided. If no encryption type is provided,
        /// GMEK will be used.
        /// Possible values:
        /// ENCRYPTION_TYPE_UNSPECIFIED
        /// GMEK
        /// CMEK
        /// </summary>
        [Input("encryptionType")]
        public Input<string>? EncryptionType { get; set; }

        /// <summary>
        /// Optional. The name of the Vertex AI location where the data store is stored.
        /// </summary>
        [Input("vertexLocation")]
        public Input<string>? VertexLocation { get; set; }

        public ApiHubInstanceConfigGetArgs()
        {
        }
        public static new ApiHubInstanceConfigGetArgs Empty => new ApiHubInstanceConfigGetArgs();
    }
}
