// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apigee.Inputs
{

    public sealed class AddonsConfigAddonsConfigIntegrationConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Flag that specifies whether the Integration add-on is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public AddonsConfigAddonsConfigIntegrationConfigGetArgs()
        {
        }
        public static new AddonsConfigAddonsConfigIntegrationConfigGetArgs Empty => new AddonsConfigAddonsConfigIntegrationConfigGetArgs();
    }
}
