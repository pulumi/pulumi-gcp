// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Outputs
{

    [OutputType]
    public sealed class MetastoreServiceTelemetryConfig
    {
        /// <summary>
        /// The output format of the Dataproc Metastore service's logs.
        /// Default value is `JSON`.
        /// Possible values are `LEGACY` and `JSON`.
        /// </summary>
        public readonly string? LogFormat;

        [OutputConstructor]
        private MetastoreServiceTelemetryConfig(string? logFormat)
        {
            LogFormat = logFormat;
        }
    }
}