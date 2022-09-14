// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Inputs
{

    public sealed class ConnectionProfileGcsProfileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Cloud Storage bucket name.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// The root path inside the Cloud Storage bucket.
        /// </summary>
        [Input("rootPath")]
        public Input<string>? RootPath { get; set; }

        public ConnectionProfileGcsProfileArgs()
        {
        }
        public static new ConnectionProfileGcsProfileArgs Empty => new ConnectionProfileGcsProfileArgs();
    }
}