// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.PubSub.Outputs
{

    [OutputType]
    public sealed class GetTopicSchemaSettingResult
    {
        /// <summary>
        /// The encoding of messages validated against schema. Default value: "ENCODING_UNSPECIFIED" Possible values: ["ENCODING_UNSPECIFIED", "JSON", "BINARY"]
        /// </summary>
        public readonly string Encoding;
        /// <summary>
        /// The name of the schema that messages published should be
        /// validated against. Format is projects/{project}/schemas/{schema}.
        /// The value of this field will be _deleted-schema_
        /// if the schema has been deleted.
        /// </summary>
        public readonly string Schema;

        [OutputConstructor]
        private GetTopicSchemaSettingResult(
            string encoding,

            string schema)
        {
            Encoding = encoding;
            Schema = schema;
        }
    }
}
