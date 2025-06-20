// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firestore.Inputs
{

    public sealed class FieldTtlConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Output)
        /// The state of TTL (time-to-live) configuration for documents that have this Field set.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public FieldTtlConfigGetArgs()
        {
        }
        public static new FieldTtlConfigGetArgs Empty => new FieldTtlConfigGetArgs();
    }
}
