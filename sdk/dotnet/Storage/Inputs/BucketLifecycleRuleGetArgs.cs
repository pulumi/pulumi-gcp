// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Inputs
{

    public sealed class BucketLifecycleRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Lifecycle Rule's action configuration. A single block of this type is supported. Structure is documented below.
        /// </summary>
        [Input("action", required: true)]
        public Input<Inputs.BucketLifecycleRuleActionGetArgs> Action { get; set; } = null!;

        /// <summary>
        /// The Lifecycle Rule's condition configuration. A single block of this type is supported. Structure is documented below.
        /// </summary>
        [Input("condition", required: true)]
        public Input<Inputs.BucketLifecycleRuleConditionGetArgs> Condition { get; set; } = null!;

        public BucketLifecycleRuleGetArgs()
        {
        }
        public static new BucketLifecycleRuleGetArgs Empty => new BucketLifecycleRuleGetArgs();
    }
}
