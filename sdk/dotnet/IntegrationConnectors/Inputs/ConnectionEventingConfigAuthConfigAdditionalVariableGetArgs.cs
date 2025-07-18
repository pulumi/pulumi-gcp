// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IntegrationConnectors.Inputs
{

    public sealed class ConnectionEventingConfigAuthConfigAdditionalVariableGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean Value of configVariable.
        /// </summary>
        [Input("booleanValue")]
        public Input<bool>? BooleanValue { get; set; }

        /// <summary>
        /// Encryption key value of configVariable.
        /// Structure is documented below.
        /// </summary>
        [Input("encryptionKeyValue")]
        public Input<Inputs.ConnectionEventingConfigAuthConfigAdditionalVariableEncryptionKeyValueGetArgs>? EncryptionKeyValue { get; set; }

        /// <summary>
        /// Integer Value of configVariable.
        /// </summary>
        [Input("integerValue")]
        public Input<int>? IntegerValue { get; set; }

        /// <summary>
        /// Key for the configVariable
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Secret value of configVariable
        /// Structure is documented below.
        /// </summary>
        [Input("secretValue")]
        public Input<Inputs.ConnectionEventingConfigAuthConfigAdditionalVariableSecretValueGetArgs>? SecretValue { get; set; }

        /// <summary>
        /// String Value of configVariabley.
        /// </summary>
        [Input("stringValue")]
        public Input<string>? StringValue { get; set; }

        public ConnectionEventingConfigAuthConfigAdditionalVariableGetArgs()
        {
        }
        public static new ConnectionEventingConfigAuthConfigAdditionalVariableGetArgs Empty => new ConnectionEventingConfigAuthConfigAdditionalVariableGetArgs();
    }
}
