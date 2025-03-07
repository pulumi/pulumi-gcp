// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Colab.Outputs
{

    [OutputType]
    public sealed class RuntimeTemplateSoftwareConfig
    {
        /// <summary>
        /// Environment variables to be passed to the container.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.RuntimeTemplateSoftwareConfigEnv> Envs;
        /// <summary>
        /// Post startup script config.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.RuntimeTemplateSoftwareConfigPostStartupScriptConfig? PostStartupScriptConfig;

        [OutputConstructor]
        private RuntimeTemplateSoftwareConfig(
            ImmutableArray<Outputs.RuntimeTemplateSoftwareConfigEnv> envs,

            Outputs.RuntimeTemplateSoftwareConfigPostStartupScriptConfig? postStartupScriptConfig)
        {
            Envs = envs;
            PostStartupScriptConfig = postStartupScriptConfig;
        }
    }
}
