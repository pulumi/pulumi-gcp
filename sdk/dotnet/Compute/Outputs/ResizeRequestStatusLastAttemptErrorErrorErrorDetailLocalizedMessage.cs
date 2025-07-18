// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class ResizeRequestStatusLastAttemptErrorErrorErrorDetailLocalizedMessage
    {
        /// <summary>
        /// (Output)
        /// The locale used following the specification defined at https://www.rfc-editor.org/rfc/bcp/bcp47.txt. Examples are: "en-US", "fr-CH", "es-MX"
        /// </summary>
        public readonly string? Locale;
        /// <summary>
        /// (Output)
        /// The localized error message in the above locale.
        /// </summary>
        public readonly string? Message;

        [OutputConstructor]
        private ResizeRequestStatusLastAttemptErrorErrorErrorDetailLocalizedMessage(
            string? locale,

            string? message)
        {
            Locale = locale;
            Message = message;
        }
    }
}
