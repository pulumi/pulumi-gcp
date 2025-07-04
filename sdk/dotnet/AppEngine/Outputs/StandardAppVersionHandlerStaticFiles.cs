// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AppEngine.Outputs
{

    [OutputType]
    public sealed class StandardAppVersionHandlerStaticFiles
    {
        /// <summary>
        /// Whether files should also be uploaded as code data. By default, files declared in static file handlers are uploaded as
        /// static data and are only served to end users; they cannot be read by the application. If enabled, uploads are charged
        /// against both your code and static data storage resource quotas.
        /// </summary>
        public readonly bool? ApplicationReadable;
        /// <summary>
        /// Time a static file served by this handler should be cached by web proxies and browsers.
        /// A duration in seconds with up to nine fractional digits, terminated by 's'. Example "3.5s".
        /// </summary>
        public readonly string? Expiration;
        /// <summary>
        /// HTTP headers to use for all responses from these URLs.
        /// An object containing a list of "key:value" value pairs.".
        /// </summary>
        public readonly ImmutableDictionary<string, string>? HttpHeaders;
        /// <summary>
        /// MIME type used to serve all files served by this handler.
        /// Defaults to file-specific MIME types, which are derived from each file's filename extension.
        /// </summary>
        public readonly string? MimeType;
        /// <summary>
        /// Path to the static files matched by the URL pattern, from the application root directory. The path can refer to text matched in groupings in the URL pattern.
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// Whether this handler should match the request if the file referenced by the handler does not exist.
        /// </summary>
        public readonly bool? RequireMatchingFile;
        /// <summary>
        /// Regular expression that matches the file paths for all files that should be referenced by this handler.
        /// </summary>
        public readonly string? UploadPathRegex;

        [OutputConstructor]
        private StandardAppVersionHandlerStaticFiles(
            bool? applicationReadable,

            string? expiration,

            ImmutableDictionary<string, string>? httpHeaders,

            string? mimeType,

            string? path,

            bool? requireMatchingFile,

            string? uploadPathRegex)
        {
            ApplicationReadable = applicationReadable;
            Expiration = expiration;
            HttpHeaders = httpHeaders;
            MimeType = mimeType;
            Path = path;
            RequireMatchingFile = requireMatchingFile;
            UploadPathRegex = uploadPathRegex;
        }
    }
}
