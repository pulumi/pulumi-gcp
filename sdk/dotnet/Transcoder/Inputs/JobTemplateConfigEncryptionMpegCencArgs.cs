// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Transcoder.Inputs
{

    public sealed class JobTemplateConfigEncryptionMpegCencArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specify the encryption scheme.
        /// </summary>
        [Input("scheme", required: true)]
        public Input<string> Scheme { get; set; } = null!;

        public JobTemplateConfigEncryptionMpegCencArgs()
        {
        }
        public static new JobTemplateConfigEncryptionMpegCencArgs Empty => new JobTemplateConfigEncryptionMpegCencArgs();
    }
}
