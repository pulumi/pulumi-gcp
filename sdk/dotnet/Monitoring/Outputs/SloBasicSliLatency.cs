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
    public sealed class SloBasicSliLatency
    {
        /// <summary>
        /// A duration string, e.g. 10s.
        /// Good service is defined to be the count of requests made to
        /// this service that return in no more than threshold.
        /// </summary>
        public readonly string Threshold;

        [OutputConstructor]
        private SloBasicSliLatency(string threshold)
        {
            Threshold = threshold;
        }
    }
}
