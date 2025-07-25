// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    public static class GetGlobalAddress
    {
        /// <summary>
        /// Get the IP address from a static address reserved for a Global Forwarding Rule which are only used for HTTP load balancing. For more information see
        /// the official [API](https://cloud.google.com/compute/docs/reference/latest/globalAddresses) documentation.
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
        ///     var myAddress = Gcp.Compute.GetGlobalAddress.Invoke(new()
        ///     {
        ///         Name = "foobar",
        ///     });
        /// 
        ///     var prod = new Gcp.Dns.ManagedZone("prod", new()
        ///     {
        ///         Name = "prod-zone",
        ///         DnsName = "prod.mydomain.com.",
        ///     });
        /// 
        ///     var frontend = new Gcp.Dns.RecordSet("frontend", new()
        ///     {
        ///         Name = prod.DnsName.Apply(dnsName =&gt; $"lb.{dnsName}"),
        ///         Type = "A",
        ///         Ttl = 300,
        ///         ManagedZone = prod.Name,
        ///         Rrdatas = new[]
        ///         {
        ///             myAddress.Apply(getGlobalAddressResult =&gt; getGlobalAddressResult.Address),
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetGlobalAddressResult> InvokeAsync(GetGlobalAddressArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGlobalAddressResult>("gcp:compute/getGlobalAddress:getGlobalAddress", args ?? new GetGlobalAddressArgs(), options.WithDefaults());

        /// <summary>
        /// Get the IP address from a static address reserved for a Global Forwarding Rule which are only used for HTTP load balancing. For more information see
        /// the official [API](https://cloud.google.com/compute/docs/reference/latest/globalAddresses) documentation.
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
        ///     var myAddress = Gcp.Compute.GetGlobalAddress.Invoke(new()
        ///     {
        ///         Name = "foobar",
        ///     });
        /// 
        ///     var prod = new Gcp.Dns.ManagedZone("prod", new()
        ///     {
        ///         Name = "prod-zone",
        ///         DnsName = "prod.mydomain.com.",
        ///     });
        /// 
        ///     var frontend = new Gcp.Dns.RecordSet("frontend", new()
        ///     {
        ///         Name = prod.DnsName.Apply(dnsName =&gt; $"lb.{dnsName}"),
        ///         Type = "A",
        ///         Ttl = 300,
        ///         ManagedZone = prod.Name,
        ///         Rrdatas = new[]
        ///         {
        ///             myAddress.Apply(getGlobalAddressResult =&gt; getGlobalAddressResult.Address),
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGlobalAddressResult> Invoke(GetGlobalAddressInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGlobalAddressResult>("gcp:compute/getGlobalAddress:getGlobalAddress", args ?? new GetGlobalAddressInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get the IP address from a static address reserved for a Global Forwarding Rule which are only used for HTTP load balancing. For more information see
        /// the official [API](https://cloud.google.com/compute/docs/reference/latest/globalAddresses) documentation.
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
        ///     var myAddress = Gcp.Compute.GetGlobalAddress.Invoke(new()
        ///     {
        ///         Name = "foobar",
        ///     });
        /// 
        ///     var prod = new Gcp.Dns.ManagedZone("prod", new()
        ///     {
        ///         Name = "prod-zone",
        ///         DnsName = "prod.mydomain.com.",
        ///     });
        /// 
        ///     var frontend = new Gcp.Dns.RecordSet("frontend", new()
        ///     {
        ///         Name = prod.DnsName.Apply(dnsName =&gt; $"lb.{dnsName}"),
        ///         Type = "A",
        ///         Ttl = 300,
        ///         ManagedZone = prod.Name,
        ///         Rrdatas = new[]
        ///         {
        ///             myAddress.Apply(getGlobalAddressResult =&gt; getGlobalAddressResult.Address),
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGlobalAddressResult> Invoke(GetGlobalAddressInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetGlobalAddressResult>("gcp:compute/getGlobalAddress:getGlobalAddress", args ?? new GetGlobalAddressInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGlobalAddressArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A unique name for the resource, required by GCE.
        /// 
        /// - - -
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        public GetGlobalAddressArgs()
        {
        }
        public static new GetGlobalAddressArgs Empty => new GetGlobalAddressArgs();
    }

    public sealed class GetGlobalAddressInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A unique name for the resource, required by GCE.
        /// 
        /// - - -
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetGlobalAddressInvokeArgs()
        {
        }
        public static new GetGlobalAddressInvokeArgs Empty => new GetGlobalAddressInvokeArgs();
    }


    [OutputType]
    public sealed class GetGlobalAddressResult
    {
        /// <summary>
        /// The IP of the created resource.
        /// </summary>
        public readonly string Address;
        public readonly string AddressType;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string Network;
        public readonly string NetworkTier;
        public readonly int PrefixLength;
        public readonly string Project;
        public readonly string Purpose;
        /// <summary>
        /// The URI of the created resource.
        /// </summary>
        public readonly string SelfLink;
        /// <summary>
        /// Indicates if the address is used. Possible values are: RESERVED or IN_USE.
        /// </summary>
        public readonly string Status;
        public readonly string Subnetwork;
        public readonly string Users;

        [OutputConstructor]
        private GetGlobalAddressResult(
            string address,

            string addressType,

            string id,

            string name,

            string network,

            string networkTier,

            int prefixLength,

            string project,

            string purpose,

            string selfLink,

            string status,

            string subnetwork,

            string users)
        {
            Address = address;
            AddressType = addressType;
            Id = id;
            Name = name;
            Network = network;
            NetworkTier = networkTier;
            PrefixLength = prefixLength;
            Project = project;
            Purpose = purpose;
            SelfLink = selfLink;
            Status = status;
            Subnetwork = subnetwork;
            Users = users;
        }
    }
}
