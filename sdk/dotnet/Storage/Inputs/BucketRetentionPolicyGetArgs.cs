// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Inputs
{

    public sealed class BucketRetentionPolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If set to `true`, the bucket will be [locked](https://cloud.google.com/storage/docs/using-bucket-lock#lock-bucket) and permanently restrict edits to the bucket's retention policy.  Caution: Locking a bucket is an irreversible action.
        /// </summary>
        [Input("isLocked")]
        public Input<bool>? IsLocked { get; set; }

        /// <summary>
        /// The period of time, in seconds, that objects in the bucket must be retained and cannot be deleted, overwritten, or archived. The value must be less than 2,147,483,647 seconds.
        /// </summary>
        [Input("retentionPeriod", required: true)]
        public Input<int> RetentionPeriod { get; set; } = null!;

        public BucketRetentionPolicyGetArgs()
        {
        }
        public static new BucketRetentionPolicyGetArgs Empty => new BucketRetentionPolicyGetArgs();
    }
}
