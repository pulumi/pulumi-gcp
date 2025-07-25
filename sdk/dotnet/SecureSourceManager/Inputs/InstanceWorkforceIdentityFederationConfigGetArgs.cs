// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecureSourceManager.Inputs
{

    public sealed class InstanceWorkforceIdentityFederationConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// 'Whether Workforce Identity Federation is enabled.'
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public InstanceWorkforceIdentityFederationConfigGetArgs()
        {
        }
        public static new InstanceWorkforceIdentityFederationConfigGetArgs Empty => new InstanceWorkforceIdentityFederationConfigGetArgs();
    }
}
