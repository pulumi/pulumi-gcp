// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Outputs
{

    [OutputType]
    public sealed class JobTemplateTemplateNodeSelector
    {
        /// <summary>
        /// The GPU to attach to an instance. See https://cloud.google.com/run/docs/configuring/jobs/gpu for configuring GPU.
        /// </summary>
        public readonly string Accelerator;

        [OutputConstructor]
        private JobTemplateTemplateNodeSelector(string accelerator)
        {
            Accelerator = accelerator;
        }
    }
}
