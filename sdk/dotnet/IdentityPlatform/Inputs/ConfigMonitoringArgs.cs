// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IdentityPlatform.Inputs
{

    public sealed class ConfigMonitoringArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration for logging requests made to this project to Stackdriver Logging
        /// Structure is documented below.
        /// </summary>
        [Input("requestLogging")]
        public Input<Inputs.ConfigMonitoringRequestLoggingArgs>? RequestLogging { get; set; }

        public ConfigMonitoringArgs()
        {
        }
        public static new ConfigMonitoringArgs Empty => new ConfigMonitoringArgs();
    }
}
