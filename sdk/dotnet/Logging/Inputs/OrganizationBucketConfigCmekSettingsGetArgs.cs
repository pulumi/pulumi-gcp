// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Logging.Inputs
{

    public sealed class OrganizationBucketConfigCmekSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("kmsKeyName", required: true)]
        public Input<string> KmsKeyName { get; set; } = null!;

        [Input("kmsKeyVersionName")]
        public Input<string>? KmsKeyVersionName { get; set; }

        /// <summary>
        /// The resource name of the bucket. For example: "organizations/my-organization-id/locations/my-location/buckets/my-bucket-id"
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("serviceAccountId")]
        public Input<string>? ServiceAccountId { get; set; }

        public OrganizationBucketConfigCmekSettingsGetArgs()
        {
        }
        public static new OrganizationBucketConfigCmekSettingsGetArgs Empty => new OrganizationBucketConfigCmekSettingsGetArgs();
    }
}