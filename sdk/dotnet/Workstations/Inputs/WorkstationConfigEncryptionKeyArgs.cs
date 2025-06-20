// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Workstations.Inputs
{

    public sealed class WorkstationConfigEncryptionKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Google Cloud KMS encryption key.
        /// </summary>
        [Input("kmsKey", required: true)]
        public Input<string> KmsKey { get; set; } = null!;

        /// <summary>
        /// The service account to use with the specified KMS key.
        /// </summary>
        [Input("kmsKeyServiceAccount", required: true)]
        public Input<string> KmsKeyServiceAccount { get; set; } = null!;

        public WorkstationConfigEncryptionKeyArgs()
        {
        }
        public static new WorkstationConfigEncryptionKeyArgs Empty => new WorkstationConfigEncryptionKeyArgs();
    }
}
