// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class AttachedClusterLoggingConfigComponentConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enableComponents")]
        private InputList<string>? _enableComponents;

        /// <summary>
        /// The components to be enabled.
        /// Each value may be one of: `SYSTEM_COMPONENTS`, `WORKLOADS`.
        /// </summary>
        public InputList<string> EnableComponents
        {
            get => _enableComponents ?? (_enableComponents = new InputList<string>());
            set => _enableComponents = value;
        }

        public AttachedClusterLoggingConfigComponentConfigGetArgs()
        {
        }
        public static new AttachedClusterLoggingConfigComponentConfigGetArgs Empty => new AttachedClusterLoggingConfigComponentConfigGetArgs();
    }
}
