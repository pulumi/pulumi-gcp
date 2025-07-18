// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    /// <summary>
    /// A Region network endpoint represents a IP address/FQDN and port combination that is
    /// part of a specific network endpoint group (NEG).
    /// 
    /// &gt; **NOTE**: Network endpoints cannot be created outside of a network endpoint group.
    /// 
    /// To get more information about RegionNetworkEndpoint, see:
    /// 
    /// * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/regionNetworkEndpointGroups)
    /// * How-to Guides
    ///     * [Internet NEGs Official Documentation](https://cloud.google.com/load-balancing/docs/negs/internet-neg-concepts)
    ///     * [Official Documentation](https://cloud.google.com/load-balancing/docs/negs/)
    /// 
    /// ## Example Usage
    /// 
    /// ### Region Network Endpoint Internet Ip Port
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.Compute.Network("default", new()
    ///     {
    ///         Name = "network",
    ///         AutoCreateSubnetworks = false,
    ///     });
    /// 
    ///     var @group = new Gcp.Compute.RegionNetworkEndpointGroup("group", new()
    ///     {
    ///         Name = "ip-port-neg",
    ///         Network = @default.Id,
    ///         Region = "us-central1",
    ///         NetworkEndpointType = "INTERNET_IP_PORT",
    ///     });
    /// 
    ///     var region_internet_ip_port_endpoint = new Gcp.Compute.RegionNetworkEndpoint("region-internet-ip-port-endpoint", new()
    ///     {
    ///         RegionNetworkEndpointGroup = @group.Name,
    ///         Region = "us-central1",
    ///         IpAddress = "8.8.8.8",
    ///         Port = 443,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Region Network Endpoint Internet Fqdn Port
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.Compute.Network("default", new()
    ///     {
    ///         Name = "network",
    ///         AutoCreateSubnetworks = false,
    ///     });
    /// 
    ///     var @group = new Gcp.Compute.RegionNetworkEndpointGroup("group", new()
    ///     {
    ///         Name = "fqdn-port-neg",
    ///         Network = @default.Id,
    ///         Region = "us-central1",
    ///         NetworkEndpointType = "INTERNET_FQDN_PORT",
    ///     });
    /// 
    ///     var region_internet_fqdn_port_endpoint = new Gcp.Compute.RegionNetworkEndpoint("region-internet-fqdn-port-endpoint", new()
    ///     {
    ///         RegionNetworkEndpointGroup = @group.Name,
    ///         Region = "us-central1",
    ///         Fqdn = "backend.example.com",
    ///         Port = 443,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Region Network Endpoint Portmap
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.Compute.Network("default", new()
    ///     {
    ///         Name = "network",
    ///         AutoCreateSubnetworks = false,
    ///     });
    /// 
    ///     var defaultSubnetwork = new Gcp.Compute.Subnetwork("default", new()
    ///     {
    ///         Name = "subnetwork",
    ///         IpCidrRange = "10.0.0.0/16",
    ///         Region = "us-central1",
    ///         Network = @default.Id,
    ///     });
    /// 
    ///     var defaultRegionNetworkEndpointGroup = new Gcp.Compute.RegionNetworkEndpointGroup("default", new()
    ///     {
    ///         Name = "portmap-neg",
    ///         Region = "us-central1",
    ///         Network = @default.Id,
    ///         Subnetwork = defaultSubnetwork.Id,
    ///         NetworkEndpointType = "GCE_VM_IP_PORTMAP",
    ///     });
    /// 
    ///     var myImage = Gcp.Compute.GetImage.Invoke(new()
    ///     {
    ///         Family = "debian-11",
    ///         Project = "debian-cloud",
    ///     });
    /// 
    ///     var defaultInstance = new Gcp.Compute.Instance("default", new()
    ///     {
    ///         NetworkInterfaces = new[]
    ///         {
    ///             new Gcp.Compute.Inputs.InstanceNetworkInterfaceArgs
    ///             {
    ///                 AccessConfigs = new[]
    ///                 {
    ///                     null,
    ///                 },
    ///                 Subnetwork = defaultSubnetwork.Id,
    ///             },
    ///         },
    ///         Name = "instance",
    ///         MachineType = "e2-medium",
    ///         Zone = "us-central1-a",
    ///         BootDisk = new Gcp.Compute.Inputs.InstanceBootDiskArgs
    ///         {
    ///             InitializeParams = new Gcp.Compute.Inputs.InstanceBootDiskInitializeParamsArgs
    ///             {
    ///                 Image = myImage.Apply(getImageResult =&gt; getImageResult.SelfLink),
    ///             },
    ///         },
    ///     });
    /// 
    ///     var regionNetworkEndpointPortmap = new Gcp.Compute.RegionNetworkEndpoint("region_network_endpoint_portmap", new()
    ///     {
    ///         RegionNetworkEndpointGroup = defaultRegionNetworkEndpointGroup.Name,
    ///         Region = "us-central1",
    ///         Instance = defaultInstance.SelfLink,
    ///         Port = 80,
    ///         IpAddress = defaultInstance.NetworkInterfaces.Apply(networkInterfaces =&gt; networkInterfaces[0].NetworkIp),
    ///         ClientDestinationPort = 8080,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// RegionNetworkEndpoint can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/regions/{{region}}/networkEndpointGroups/{{region_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}`
    /// 
    /// * `{{project}}/{{region}}/{{region_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}`
    /// 
    /// * `{{region}}/{{region_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}`
    /// 
    /// * `{{region_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}`
    /// 
    /// When using the `pulumi import` command, RegionNetworkEndpoint can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/regionNetworkEndpoint:RegionNetworkEndpoint default projects/{{project}}/regions/{{region}}/networkEndpointGroups/{{region_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/regionNetworkEndpoint:RegionNetworkEndpoint default {{project}}/{{region}}/{{region_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/regionNetworkEndpoint:RegionNetworkEndpoint default {{region}}/{{region_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/regionNetworkEndpoint:RegionNetworkEndpoint default {{region_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:compute/regionNetworkEndpoint:RegionNetworkEndpoint")]
    public partial class RegionNetworkEndpoint : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Client destination port for the `GCE_VM_IP_PORTMAP` NEG.
        /// </summary>
        [Output("clientDestinationPort")]
        public Output<int?> ClientDestinationPort { get; private set; } = null!;

        /// <summary>
        /// Fully qualified domain name of network endpoint.
        /// This can only be specified when network_endpoint_type of the NEG is INTERNET_FQDN_PORT.
        /// </summary>
        [Output("fqdn")]
        public Output<string?> Fqdn { get; private set; } = null!;

        /// <summary>
        /// The name for a specific VM instance that the IP address belongs to.
        /// This is required for network endpoints of type GCE_VM_IP_PORTMAP.
        /// </summary>
        [Output("instance")]
        public Output<string?> Instance { get; private set; } = null!;

        /// <summary>
        /// IPv4 address external endpoint.
        /// This can only be specified when network_endpoint_type of the NEG is INTERNET_IP_PORT.
        /// </summary>
        [Output("ipAddress")]
        public Output<string?> IpAddress { get; private set; } = null!;

        /// <summary>
        /// The unique identifier number for the resource. This identifier is defined by the server.
        /// </summary>
        [Output("networkEndpointId")]
        public Output<int> NetworkEndpointId { get; private set; } = null!;

        /// <summary>
        /// Port number of network endpoint.
        /// </summary>
        [Output("port")]
        public Output<int> Port { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Region where the containing network endpoint group is located.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The network endpoint group this endpoint is part of.
        /// </summary>
        [Output("regionNetworkEndpointGroup")]
        public Output<string> RegionNetworkEndpointGroup { get; private set; } = null!;


        /// <summary>
        /// Create a RegionNetworkEndpoint resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RegionNetworkEndpoint(string name, RegionNetworkEndpointArgs args, CustomResourceOptions? options = null)
            : base("gcp:compute/regionNetworkEndpoint:RegionNetworkEndpoint", name, args ?? new RegionNetworkEndpointArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RegionNetworkEndpoint(string name, Input<string> id, RegionNetworkEndpointState? state = null, CustomResourceOptions? options = null)
            : base("gcp:compute/regionNetworkEndpoint:RegionNetworkEndpoint", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing RegionNetworkEndpoint resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RegionNetworkEndpoint Get(string name, Input<string> id, RegionNetworkEndpointState? state = null, CustomResourceOptions? options = null)
        {
            return new RegionNetworkEndpoint(name, id, state, options);
        }
    }

    public sealed class RegionNetworkEndpointArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Client destination port for the `GCE_VM_IP_PORTMAP` NEG.
        /// </summary>
        [Input("clientDestinationPort")]
        public Input<int>? ClientDestinationPort { get; set; }

        /// <summary>
        /// Fully qualified domain name of network endpoint.
        /// This can only be specified when network_endpoint_type of the NEG is INTERNET_FQDN_PORT.
        /// </summary>
        [Input("fqdn")]
        public Input<string>? Fqdn { get; set; }

        /// <summary>
        /// The name for a specific VM instance that the IP address belongs to.
        /// This is required for network endpoints of type GCE_VM_IP_PORTMAP.
        /// </summary>
        [Input("instance")]
        public Input<string>? Instance { get; set; }

        /// <summary>
        /// IPv4 address external endpoint.
        /// This can only be specified when network_endpoint_type of the NEG is INTERNET_IP_PORT.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// Port number of network endpoint.
        /// </summary>
        [Input("port", required: true)]
        public Input<int> Port { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Region where the containing network endpoint group is located.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The network endpoint group this endpoint is part of.
        /// </summary>
        [Input("regionNetworkEndpointGroup", required: true)]
        public Input<string> RegionNetworkEndpointGroup { get; set; } = null!;

        public RegionNetworkEndpointArgs()
        {
        }
        public static new RegionNetworkEndpointArgs Empty => new RegionNetworkEndpointArgs();
    }

    public sealed class RegionNetworkEndpointState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Client destination port for the `GCE_VM_IP_PORTMAP` NEG.
        /// </summary>
        [Input("clientDestinationPort")]
        public Input<int>? ClientDestinationPort { get; set; }

        /// <summary>
        /// Fully qualified domain name of network endpoint.
        /// This can only be specified when network_endpoint_type of the NEG is INTERNET_FQDN_PORT.
        /// </summary>
        [Input("fqdn")]
        public Input<string>? Fqdn { get; set; }

        /// <summary>
        /// The name for a specific VM instance that the IP address belongs to.
        /// This is required for network endpoints of type GCE_VM_IP_PORTMAP.
        /// </summary>
        [Input("instance")]
        public Input<string>? Instance { get; set; }

        /// <summary>
        /// IPv4 address external endpoint.
        /// This can only be specified when network_endpoint_type of the NEG is INTERNET_IP_PORT.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// The unique identifier number for the resource. This identifier is defined by the server.
        /// </summary>
        [Input("networkEndpointId")]
        public Input<int>? NetworkEndpointId { get; set; }

        /// <summary>
        /// Port number of network endpoint.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Region where the containing network endpoint group is located.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The network endpoint group this endpoint is part of.
        /// </summary>
        [Input("regionNetworkEndpointGroup")]
        public Input<string>? RegionNetworkEndpointGroup { get; set; }

        public RegionNetworkEndpointState()
        {
        }
        public static new RegionNetworkEndpointState Empty => new RegionNetworkEndpointState();
    }
}
