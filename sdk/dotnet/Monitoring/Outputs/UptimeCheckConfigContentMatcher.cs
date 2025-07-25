// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Monitoring.Outputs
{

    [OutputType]
    public sealed class UptimeCheckConfigContentMatcher
    {
        /// <summary>
        /// String or regex content to match (max 1024 bytes)
        /// </summary>
        public readonly string Content;
        /// <summary>
        /// Information needed to perform a JSONPath content match. Used for `ContentMatcherOption::MATCHES_JSON_PATH` and `ContentMatcherOption::NOT_MATCHES_JSON_PATH`.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.UptimeCheckConfigContentMatcherJsonPathMatcher? JsonPathMatcher;
        /// <summary>
        /// The type of content matcher that will be applied to the server output, compared to the content string when the check is run.
        /// Default value is `CONTAINS_STRING`.
        /// Possible values are: `CONTAINS_STRING`, `NOT_CONTAINS_STRING`, `MATCHES_REGEX`, `NOT_MATCHES_REGEX`, `MATCHES_JSON_PATH`, `NOT_MATCHES_JSON_PATH`.
        /// </summary>
        public readonly string? Matcher;

        [OutputConstructor]
        private UptimeCheckConfigContentMatcher(
            string content,

            Outputs.UptimeCheckConfigContentMatcherJsonPathMatcher? jsonPathMatcher,

            string? matcher)
        {
            Content = content;
            JsonPathMatcher = jsonPathMatcher;
            Matcher = matcher;
        }
    }
}
