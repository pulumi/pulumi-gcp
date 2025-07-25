// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Inputs
{

    public sealed class GuestPoliciesRecipeArtifactGcsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Bucket of the Google Cloud Storage object. Given an example URL: https://storage.googleapis.com/my-bucket/foo/bar#1234567
        /// this value would be my-bucket.
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// Must be provided if allowInsecure is false. Generation number of the Google Cloud Storage object.
        /// https://storage.googleapis.com/my-bucket/foo/bar#1234567 this value would be 1234567.
        /// </summary>
        [Input("generation")]
        public Input<int>? Generation { get; set; }

        /// <summary>
        /// Name of the Google Cloud Storage object. Given an example URL: https://storage.googleapis.com/my-bucket/foo/bar#1234567
        /// this value would be foo/bar.
        /// </summary>
        [Input("object")]
        public Input<string>? Object { get; set; }

        public GuestPoliciesRecipeArtifactGcsGetArgs()
        {
        }
        public static new GuestPoliciesRecipeArtifactGcsGetArgs Empty => new GuestPoliciesRecipeArtifactGcsGetArgs();
    }
}
