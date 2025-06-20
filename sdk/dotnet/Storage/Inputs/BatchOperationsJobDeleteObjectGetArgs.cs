// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Inputs
{

    public sealed class BatchOperationsJobDeleteObjectGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enable flag to permanently delete object and all object versions if versioning is enabled on bucket.
        /// </summary>
        [Input("permanentObjectDeletionEnabled", required: true)]
        public Input<bool> PermanentObjectDeletionEnabled { get; set; } = null!;

        public BatchOperationsJobDeleteObjectGetArgs()
        {
        }
        public static new BatchOperationsJobDeleteObjectGetArgs Empty => new BatchOperationsJobDeleteObjectGetArgs();
    }
}
