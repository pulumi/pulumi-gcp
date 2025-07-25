// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AppEngine.Inputs
{

    public sealed class FlexibleAppVersionLivenessCheckGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Interval between health checks.
        /// </summary>
        [Input("checkInterval")]
        public Input<string>? CheckInterval { get; set; }

        /// <summary>
        /// Number of consecutive failed checks required before considering the VM unhealthy. Default: 4.
        /// </summary>
        [Input("failureThreshold")]
        public Input<double>? FailureThreshold { get; set; }

        /// <summary>
        /// Host header to send when performing a HTTP Readiness check. Example: "myapp.appspot.com"
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// The initial delay before starting to execute the checks. Default: "300s"
        /// </summary>
        [Input("initialDelay")]
        public Input<string>? InitialDelay { get; set; }

        /// <summary>
        /// The request path.
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        /// <summary>
        /// Number of consecutive successful checks required before considering the VM healthy. Default: 2.
        /// </summary>
        [Input("successThreshold")]
        public Input<double>? SuccessThreshold { get; set; }

        /// <summary>
        /// Time before the check is considered failed. Default: "4s"
        /// </summary>
        [Input("timeout")]
        public Input<string>? Timeout { get; set; }

        public FlexibleAppVersionLivenessCheckGetArgs()
        {
        }
        public static new FlexibleAppVersionLivenessCheckGetArgs Empty => new FlexibleAppVersionLivenessCheckGetArgs();
    }
}
