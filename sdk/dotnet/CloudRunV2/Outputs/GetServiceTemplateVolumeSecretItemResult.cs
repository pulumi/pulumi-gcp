// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Outputs
{

    [OutputType]
    public sealed class GetServiceTemplateVolumeSecretItemResult
    {
        public readonly int Mode;
        public readonly string Path;
        public readonly string Version;

        [OutputConstructor]
        private GetServiceTemplateVolumeSecretItemResult(
            int mode,

            string path,

            string version)
        {
            Mode = mode;
            Path = path;
            Version = version;
        }
    }
}