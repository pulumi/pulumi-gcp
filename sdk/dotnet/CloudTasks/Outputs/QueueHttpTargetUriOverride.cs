// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudTasks.Outputs
{

    [OutputType]
    public sealed class QueueHttpTargetUriOverride
    {
        /// <summary>
        /// Host override.
        /// When specified, replaces the host part of the task URL.
        /// For example, if the task URL is "https://www.google.com", and host value
        /// is set to "example.net", the overridden URI will be changed to "https://example.net".
        /// Host value cannot be an empty string (INVALID_ARGUMENT).
        /// </summary>
        public readonly string? Host;
        /// <summary>
        /// URI path.
        /// When specified, replaces the existing path of the task URL.
        /// Setting the path value to an empty string clears the URI path segment.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.QueueHttpTargetUriOverridePathOverride? PathOverride;
        /// <summary>
        /// Port override.
        /// When specified, replaces the port part of the task URI.
        /// For instance, for a URI http://www.google.com/foo and port=123, the overridden URI becomes http://www.google.com:123/foo.
        /// Note that the port value must be a positive integer.
        /// Setting the port to 0 (Zero) clears the URI port.
        /// </summary>
        public readonly string? Port;
        /// <summary>
        /// URI query.
        /// When specified, replaces the query part of the task URI. Setting the query value to an empty string clears the URI query segment.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.QueueHttpTargetUriOverrideQueryOverride? QueryOverride;
        /// <summary>
        /// Scheme override.
        /// When specified, the task URI scheme is replaced by the provided value (HTTP or HTTPS).
        /// Possible values are: `HTTP`, `HTTPS`.
        /// </summary>
        public readonly string? Scheme;
        /// <summary>
        /// URI Override Enforce Mode
        /// When specified, determines the Target UriOverride mode. If not specified, it defaults to ALWAYS.
        /// Possible values are: `ALWAYS`, `IF_NOT_EXISTS`.
        /// </summary>
        public readonly string? UriOverrideEnforceMode;

        [OutputConstructor]
        private QueueHttpTargetUriOverride(
            string? host,

            Outputs.QueueHttpTargetUriOverridePathOverride? pathOverride,

            string? port,

            Outputs.QueueHttpTargetUriOverrideQueryOverride? queryOverride,

            string? scheme,

            string? uriOverrideEnforceMode)
        {
            Host = host;
            PathOverride = pathOverride;
            Port = port;
            QueryOverride = queryOverride;
            Scheme = scheme;
            UriOverrideEnforceMode = uriOverrideEnforceMode;
        }
    }
}
