// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    public static class GetNetwork
    {
        /// <summary>
        /// Get a network within GCE from its name.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var my_network = Gcp.Compute.GetNetwork.Invoke(new()
        ///     {
        ///         Name = "default-us-east1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetNetworkResult> InvokeAsync(GetNetworkArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworkResult>("gcp:compute/getNetwork:getNetwork", args ?? new GetNetworkArgs(), options.WithDefaults());

        /// <summary>
        /// Get a network within GCE from its name.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var my_network = Gcp.Compute.GetNetwork.Invoke(new()
        ///     {
        ///         Name = "default-us-east1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetNetworkResult> Invoke(GetNetworkInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkResult>("gcp:compute/getNetwork:getNetwork", args ?? new GetNetworkInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get a network within GCE from its name.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var my_network = Gcp.Compute.GetNetwork.Invoke(new()
        ///     {
        ///         Name = "default-us-east1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetNetworkResult> Invoke(GetNetworkInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkResult>("gcp:compute/getNetwork:getNetwork", args ?? new GetNetworkInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworkArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the network.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// A full or partial URL of the network profile to apply to this network.
        /// </summary>
        [Input("networkProfile")]
        public string? NetworkProfile { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        public GetNetworkArgs()
        {
        }
        public static new GetNetworkArgs Empty => new GetNetworkArgs();
    }

    public sealed class GetNetworkInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the network.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// A full or partial URL of the network profile to apply to this network.
        /// </summary>
        [Input("networkProfile")]
        public Input<string>? NetworkProfile { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetNetworkInvokeArgs()
        {
        }
        public static new GetNetworkInvokeArgs Empty => new GetNetworkInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworkResult
    {
        /// <summary>
        /// Description of this network.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The IP address of the gateway.
        /// </summary>
        public readonly string GatewayIpv4;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ula internal ipv6 range assigned to this network.
        /// </summary>
        public readonly string InternalIpv6Range;
        public readonly string Name;
        /// <summary>
        /// The numeric unique identifier for the resource.
        /// </summary>
        public readonly int NetworkId;
        /// <summary>
        /// A full or partial URL of the network profile to apply to this network.
        /// </summary>
        public readonly string? NetworkProfile;
        /// <summary>
        /// (Deprecated) The numeric unique identifier for the resource. `numeric_id` is deprecated and will be removed in a future major release. Use `network_id` instead.
        /// </summary>
        public readonly string NumericId;
        public readonly string? Project;
        /// <summary>
        /// The URI of the resource.
        /// </summary>
        public readonly string SelfLink;
        /// <summary>
        /// the list of subnetworks which belong to the network
        /// </summary>
        public readonly ImmutableArray<string> SubnetworksSelfLinks;

        [OutputConstructor]
        private GetNetworkResult(
            string description,

            string gatewayIpv4,

            string id,

            string internalIpv6Range,

            string name,

            int networkId,

            string? networkProfile,

            string numericId,

            string? project,

            string selfLink,

            ImmutableArray<string> subnetworksSelfLinks)
        {
            Description = description;
            GatewayIpv4 = gatewayIpv4;
            Id = id;
            InternalIpv6Range = internalIpv6Range;
            Name = name;
            NetworkId = networkId;
            NetworkProfile = networkProfile;
            NumericId = numericId;
            Project = project;
            SelfLink = selfLink;
            SubnetworksSelfLinks = subnetworksSelfLinks;
        }
    }
}
