// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AccessContextManager.Inputs
{

    public sealed class GcpUserAccessBindingScopedAccessSettingScopeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. Client scope for this access scope.
        /// Structure is documented below.
        /// </summary>
        [Input("clientScope")]
        public Input<Inputs.GcpUserAccessBindingScopedAccessSettingScopeClientScopeGetArgs>? ClientScope { get; set; }

        public GcpUserAccessBindingScopedAccessSettingScopeGetArgs()
        {
        }
        public static new GcpUserAccessBindingScopedAccessSettingScopeGetArgs Empty => new GcpUserAccessBindingScopedAccessSettingScopeGetArgs();
    }
}
