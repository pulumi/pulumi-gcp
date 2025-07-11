// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AccessContextManager.Inputs
{

    public sealed class GcpUserAccessBindingScopedAccessSettingScopeClientScopeRestrictedClientApplicationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The OAuth client ID of the application.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        public GcpUserAccessBindingScopedAccessSettingScopeClientScopeRestrictedClientApplicationGetArgs()
        {
        }
        public static new GcpUserAccessBindingScopedAccessSettingScopeClientScopeRestrictedClientApplicationGetArgs Empty => new GcpUserAccessBindingScopedAccessSettingScopeClientScopeRestrictedClientApplicationGetArgs();
    }
}
