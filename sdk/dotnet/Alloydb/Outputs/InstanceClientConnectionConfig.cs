// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Alloydb.Outputs
{

    [OutputType]
    public sealed class InstanceClientConnectionConfig
    {
        /// <summary>
        /// Configuration to enforce connectors only (ex: AuthProxy) connections to the database.
        /// </summary>
        public readonly bool? RequireConnectors;
        /// <summary>
        /// SSL config option for this instance.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.InstanceClientConnectionConfigSslConfig? SslConfig;

        [OutputConstructor]
        private InstanceClientConnectionConfig(
            bool? requireConnectors,

            Outputs.InstanceClientConnectionConfigSslConfig? sslConfig)
        {
            RequireConnectors = requireConnectors;
            SslConfig = sslConfig;
        }
    }
}