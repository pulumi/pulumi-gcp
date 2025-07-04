// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Chronicle.Inputs
{

    public sealed class ReferenceListScopeInfoArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ReferenceListScope specifies the list of scope names of the reference list.
        /// Structure is documented below.
        /// </summary>
        [Input("referenceListScope", required: true)]
        public Input<Inputs.ReferenceListScopeInfoReferenceListScopeArgs> ReferenceListScope { get; set; } = null!;

        public ReferenceListScopeInfoArgs()
        {
        }
        public static new ReferenceListScopeInfoArgs Empty => new ReferenceListScopeInfoArgs();
    }
}
