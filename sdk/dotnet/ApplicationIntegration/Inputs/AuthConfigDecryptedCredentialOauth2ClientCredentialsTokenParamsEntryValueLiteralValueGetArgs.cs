// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ApplicationIntegration.Inputs
{

    public sealed class AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryValueLiteralValueGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// String.
        /// </summary>
        [Input("stringValue")]
        public Input<string>? StringValue { get; set; }

        public AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryValueLiteralValueGetArgs()
        {
        }
        public static new AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryValueLiteralValueGetArgs Empty => new AuthConfigDecryptedCredentialOauth2ClientCredentialsTokenParamsEntryValueLiteralValueGetArgs();
    }
}
