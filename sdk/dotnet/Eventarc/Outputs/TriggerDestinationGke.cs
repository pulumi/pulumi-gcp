// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Eventarc.Outputs
{

    [OutputType]
    public sealed class TriggerDestinationGke
    {
        /// <summary>
        /// Required. The name of the cluster the GKE service is running in. The cluster must be running in the same project as the trigger being created.
        /// </summary>
        public readonly string Cluster;
        /// <summary>
        /// Required. The name of the Google Compute Engine in which the cluster resides, which can either be compute zone (for example, us-central1-a) for the zonal clusters or region (for example, us-central1) for regional clusters.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// Required. The namespace the GKE service is running in.
        /// </summary>
        public readonly string Namespace;
        /// <summary>
        /// Optional. The relative path on the GKE service the events should be sent to. The value must conform to the definition of a URI path segment (section 3.3 of RFC2396). Examples: "/route", "route", "route/subroute".
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// Required. Name of the GKE service.
        /// </summary>
        public readonly string Service;

        [OutputConstructor]
        private TriggerDestinationGke(
            string cluster,

            string location,

            string @namespace,

            string? path,

            string service)
        {
            Cluster = cluster;
            Location = location;
            Namespace = @namespace;
            Path = path;
            Service = service;
        }
    }
}
