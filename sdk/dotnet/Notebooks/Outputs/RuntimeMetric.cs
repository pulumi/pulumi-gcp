// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Notebooks.Outputs
{

    [OutputType]
    public sealed class RuntimeMetric
    {
        public readonly ImmutableDictionary<string, string>? SystemMetrics;

        [OutputConstructor]
        private RuntimeMetric(ImmutableDictionary<string, string>? systemMetrics)
        {
            SystemMetrics = systemMetrics;
        }
    }
}