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
    public sealed class InstanceClientConnectionConfigSslConfig
    {
        /// <summary>
        /// SSL mode. Specifies client-server SSL/TLS connection behavior.
        /// Possible values are: `ENCRYPTED_ONLY`, `ALLOW_UNENCRYPTED_AND_ENCRYPTED`.
        /// </summary>
        public readonly string? SslMode;

        [OutputConstructor]
        private InstanceClientConnectionConfigSslConfig(string? sslMode)
        {
            SslMode = sslMode;
        }
    }
}