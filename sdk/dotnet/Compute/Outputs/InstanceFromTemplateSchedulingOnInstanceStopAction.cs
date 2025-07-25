// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class InstanceFromTemplateSchedulingOnInstanceStopAction
    {
        /// <summary>
        /// If true, the contents of any attached Local SSD disks will be discarded.
        /// </summary>
        public readonly bool? DiscardLocalSsd;

        [OutputConstructor]
        private InstanceFromTemplateSchedulingOnInstanceStopAction(bool? discardLocalSsd)
        {
            DiscardLocalSsd = discardLocalSsd;
        }
    }
}
