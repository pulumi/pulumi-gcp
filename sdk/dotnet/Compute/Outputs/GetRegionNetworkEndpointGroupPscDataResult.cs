// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class GetRegionNetworkEndpointGroupPscDataResult
    {
        /// <summary>
        /// The PSC producer port to use when consumer PSC NEG connects to a producer. If
        /// this flag isn't specified for a PSC NEG with endpoint type
        /// private-service-connect, then PSC NEG will be connected to a first port in the
        /// available PSC producer port range.
        /// </summary>
        public readonly string ProducerPort;

        [OutputConstructor]
        private GetRegionNetworkEndpointGroupPscDataResult(string producerPort)
        {
            ProducerPort = producerPort;
        }
    }
}
