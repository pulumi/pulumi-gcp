// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkConnectivity.Outputs
{

    [OutputType]
    public sealed class InternalRangeMigration
    {
        /// <summary>
        /// Resource path as an URI of the source resource, for example a subnet.
        /// The project for the source resource should match the project for the
        /// InternalRange.
        /// An example /projects/{project}/regions/{region}/subnetworks/{subnet}
        /// </summary>
        public readonly string Source;
        /// <summary>
        /// Resource path of the target resource. The target project can be
        /// different, as in the cases when migrating to peer networks. The resource
        /// may not exist yet.
        /// For example /projects/{project}/regions/{region}/subnetworks/{subnet}
        /// </summary>
        public readonly string Target;

        [OutputConstructor]
        private InternalRangeMigration(
            string source,

            string target)
        {
            Source = source;
            Target = target;
        }
    }
}
