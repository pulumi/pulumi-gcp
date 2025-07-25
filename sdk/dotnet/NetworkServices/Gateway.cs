// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkServices
{
    /// <summary>
    /// Gateway represents the configuration for a proxy, typically a load balancer.
    /// It captures the ip:port over which the services are exposed by the proxy,
    /// along with any policy configurations. Routes have reference to to Gateways
    /// to dictate how requests should be routed by this Gateway.
    /// 
    /// To get more information about Gateway, see:
    /// 
    /// * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1/projects.locations.gateways)
    /// 
    /// ## Example Usage
    /// 
    /// ### Network Services Gateway Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.NetworkServices.Gateway("default", new()
    ///     {
    ///         Name = "my-gateway",
    ///         Scope = "default-scope-basic",
    ///         Type = "OPEN_MESH",
    ///         Ports = new[]
    ///         {
    ///             443,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Network Services Gateway Advanced
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.NetworkServices.Gateway("default", new()
    ///     {
    ///         Name = "my-gateway",
    ///         Labels = 
    ///         {
    ///             { "foo", "bar" },
    ///         },
    ///         Description = "my description",
    ///         Type = "OPEN_MESH",
    ///         Ports = new[]
    ///         {
    ///             443,
    ///         },
    ///         Scope = "default-scope-advance",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Network Services Gateway Secure Web Proxy
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.CertificateManager.Certificate("default", new()
    ///     {
    ///         Name = "my-certificate",
    ///         Location = "us-central1",
    ///         SelfManaged = new Gcp.CertificateManager.Inputs.CertificateSelfManagedArgs
    ///         {
    ///             PemCertificate = Std.File.Invoke(new()
    ///             {
    ///                 Input = "test-fixtures/cert.pem",
    ///             }).Apply(invoke =&gt; invoke.Result),
    ///             PemPrivateKey = Std.File.Invoke(new()
    ///             {
    ///                 Input = "test-fixtures/private-key.pem",
    ///             }).Apply(invoke =&gt; invoke.Result),
    ///         },
    ///     });
    /// 
    ///     var defaultNetwork = new Gcp.Compute.Network("default", new()
    ///     {
    ///         Name = "my-network",
    ///         RoutingMode = "REGIONAL",
    ///         AutoCreateSubnetworks = false,
    ///     });
    /// 
    ///     var defaultSubnetwork = new Gcp.Compute.Subnetwork("default", new()
    ///     {
    ///         Name = "my-subnetwork-name",
    ///         Purpose = "PRIVATE",
    ///         IpCidrRange = "10.128.0.0/20",
    ///         Region = "us-central1",
    ///         Network = defaultNetwork.Id,
    ///         Role = "ACTIVE",
    ///     });
    /// 
    ///     var proxyonlysubnet = new Gcp.Compute.Subnetwork("proxyonlysubnet", new()
    ///     {
    ///         Name = "my-proxy-only-subnetwork",
    ///         Purpose = "REGIONAL_MANAGED_PROXY",
    ///         IpCidrRange = "192.168.0.0/23",
    ///         Region = "us-central1",
    ///         Network = defaultNetwork.Id,
    ///         Role = "ACTIVE",
    ///     });
    /// 
    ///     var defaultGatewaySecurityPolicy = new Gcp.NetworkSecurity.GatewaySecurityPolicy("default", new()
    ///     {
    ///         Name = "my-policy-name",
    ///         Location = "us-central1",
    ///     });
    /// 
    ///     var defaultGatewaySecurityPolicyRule = new Gcp.NetworkSecurity.GatewaySecurityPolicyRule("default", new()
    ///     {
    ///         Name = "my-policyrule-name",
    ///         Location = "us-central1",
    ///         GatewaySecurityPolicy = defaultGatewaySecurityPolicy.Name,
    ///         Enabled = true,
    ///         Priority = 1,
    ///         SessionMatcher = "host() == 'example.com'",
    ///         BasicProfile = "ALLOW",
    ///     });
    /// 
    ///     var defaultGateway = new Gcp.NetworkServices.Gateway("default", new()
    ///     {
    ///         Name = "my-gateway1",
    ///         Location = "us-central1",
    ///         Addresses = new[]
    ///         {
    ///             "10.128.0.99",
    ///         },
    ///         Type = "SECURE_WEB_GATEWAY",
    ///         Ports = new[]
    ///         {
    ///             443,
    ///         },
    ///         Scope = "my-default-scope1",
    ///         CertificateUrls = new[]
    ///         {
    ///             @default.Id,
    ///         },
    ///         GatewaySecurityPolicy = defaultGatewaySecurityPolicy.Id,
    ///         Network = defaultNetwork.Id,
    ///         Subnetwork = defaultSubnetwork.Id,
    ///         DeleteSwgAutogenRouterOnDestroy = true,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             proxyonlysubnet,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Network Services Gateway Multiple Swp Same Network
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.CertificateManager.Certificate("default", new()
    ///     {
    ///         Name = "my-certificate",
    ///         Location = "us-south1",
    ///         SelfManaged = new Gcp.CertificateManager.Inputs.CertificateSelfManagedArgs
    ///         {
    ///             PemCertificate = Std.File.Invoke(new()
    ///             {
    ///                 Input = "test-fixtures/cert.pem",
    ///             }).Apply(invoke =&gt; invoke.Result),
    ///             PemPrivateKey = Std.File.Invoke(new()
    ///             {
    ///                 Input = "test-fixtures/private-key.pem",
    ///             }).Apply(invoke =&gt; invoke.Result),
    ///         },
    ///     });
    /// 
    ///     var defaultNetwork = new Gcp.Compute.Network("default", new()
    ///     {
    ///         Name = "my-network",
    ///         RoutingMode = "REGIONAL",
    ///         AutoCreateSubnetworks = false,
    ///     });
    /// 
    ///     var defaultSubnetwork = new Gcp.Compute.Subnetwork("default", new()
    ///     {
    ///         Name = "my-subnetwork-name",
    ///         Purpose = "PRIVATE",
    ///         IpCidrRange = "10.128.0.0/20",
    ///         Region = "us-south1",
    ///         Network = defaultNetwork.Id,
    ///         Role = "ACTIVE",
    ///     });
    /// 
    ///     var proxyonlysubnet = new Gcp.Compute.Subnetwork("proxyonlysubnet", new()
    ///     {
    ///         Name = "my-proxy-only-subnetwork",
    ///         Purpose = "REGIONAL_MANAGED_PROXY",
    ///         IpCidrRange = "192.168.0.0/23",
    ///         Region = "us-south1",
    ///         Network = defaultNetwork.Id,
    ///         Role = "ACTIVE",
    ///     });
    /// 
    ///     var defaultGatewaySecurityPolicy = new Gcp.NetworkSecurity.GatewaySecurityPolicy("default", new()
    ///     {
    ///         Name = "my-policy-name",
    ///         Location = "us-south1",
    ///     });
    /// 
    ///     var defaultGatewaySecurityPolicyRule = new Gcp.NetworkSecurity.GatewaySecurityPolicyRule("default", new()
    ///     {
    ///         Name = "my-policyrule-name",
    ///         Location = "us-south1",
    ///         GatewaySecurityPolicy = defaultGatewaySecurityPolicy.Name,
    ///         Enabled = true,
    ///         Priority = 1,
    ///         SessionMatcher = "host() == 'example.com'",
    ///         BasicProfile = "ALLOW",
    ///     });
    /// 
    ///     var defaultGateway = new Gcp.NetworkServices.Gateway("default", new()
    ///     {
    ///         Name = "my-gateway1",
    ///         Location = "us-south1",
    ///         Addresses = new[]
    ///         {
    ///             "10.128.0.99",
    ///         },
    ///         Type = "SECURE_WEB_GATEWAY",
    ///         Ports = new[]
    ///         {
    ///             443,
    ///         },
    ///         Scope = "my-default-scope1",
    ///         CertificateUrls = new[]
    ///         {
    ///             @default.Id,
    ///         },
    ///         GatewaySecurityPolicy = defaultGatewaySecurityPolicy.Id,
    ///         Network = defaultNetwork.Id,
    ///         Subnetwork = defaultSubnetwork.Id,
    ///         DeleteSwgAutogenRouterOnDestroy = true,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             proxyonlysubnet,
    ///         },
    ///     });
    /// 
    ///     var gateway2 = new Gcp.NetworkServices.Gateway("gateway2", new()
    ///     {
    ///         Name = "my-gateway2",
    ///         Location = "us-south1",
    ///         Addresses = new[]
    ///         {
    ///             "10.128.0.98",
    ///         },
    ///         Type = "SECURE_WEB_GATEWAY",
    ///         Ports = new[]
    ///         {
    ///             443,
    ///         },
    ///         Scope = "my-default-scope2",
    ///         CertificateUrls = new[]
    ///         {
    ///             @default.Id,
    ///         },
    ///         GatewaySecurityPolicy = defaultGatewaySecurityPolicy.Id,
    ///         Network = defaultNetwork.Id,
    ///         Subnetwork = defaultSubnetwork.Id,
    ///         DeleteSwgAutogenRouterOnDestroy = true,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             proxyonlysubnet,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Gateway can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/gateways/{{name}}`
    /// 
    /// * `{{project}}/{{location}}/{{name}}`
    /// 
    /// * `{{location}}/{{name}}`
    /// 
    /// When using the `pulumi import` command, Gateway can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:networkservices/gateway:Gateway default projects/{{project}}/locations/{{location}}/gateways/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:networkservices/gateway:Gateway default {{project}}/{{location}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:networkservices/gateway:Gateway default {{location}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:networkservices/gateway:Gateway")]
    public partial class Gateway : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Zero or one IPv4 or IPv6 address on which the Gateway will receive the traffic.
        /// When no address is provided, an IP from the subnetwork is allocated.
        /// This field only applies to gateways of type 'SECURE_WEB_GATEWAY'.
        /// Gateways of type 'OPEN_MESH' listen on 0.0.0.0 for IPv4 and :: for IPv6.
        /// </summary>
        [Output("addresses")]
        public Output<ImmutableArray<string>> Addresses { get; private set; } = null!;

        /// <summary>
        /// A fully-qualified Certificates URL reference. The proxy presents a Certificate (selected based on SNI) when establishing a TLS connection.
        /// This feature only applies to gateways of type 'SECURE_WEB_GATEWAY'.
        /// </summary>
        [Output("certificateUrls")]
        public Output<ImmutableArray<string>> CertificateUrls { get; private set; } = null!;

        /// <summary>
        /// The timestamp when the resource was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// When deleting a gateway of type 'SECURE_WEB_GATEWAY', this boolean option will also delete auto generated router by the gateway creation.
        /// If there is no other gateway of type 'SECURE_WEB_GATEWAY' remaining for that region and network it will be deleted.
        /// </summary>
        [Output("deleteSwgAutogenRouterOnDestroy")]
        public Output<bool?> DeleteSwgAutogenRouterOnDestroy { get; private set; } = null!;

        /// <summary>
        /// A free-text description of the resource. Max length 1024 characters.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// Determines if envoy will insert internal debug headers into upstream requests.
        /// Other Envoy headers may still be injected.
        /// By default, envoy will not insert any debug headers.
        /// Possible values are: `NONE`, `DEBUG_HEADERS`.
        /// </summary>
        [Output("envoyHeaders")]
        public Output<string?> EnvoyHeaders { get; private set; } = null!;

        /// <summary>
        /// A fully-qualified GatewaySecurityPolicy URL reference. Defines how a server should apply security policy to inbound (VM to Proxy) initiated connections.
        /// For example: 'projects/*/locations/*/gatewaySecurityPolicies/swg-policy'.
        /// This policy is specific to gateways of type 'SECURE_WEB_GATEWAY'.
        /// </summary>
        [Output("gatewaySecurityPolicy")]
        public Output<string?> GatewaySecurityPolicy { get; private set; } = null!;

        /// <summary>
        /// The IP Version that will be used by this gateway.
        /// Possible values are: `IPV4`, `IPV6`.
        /// </summary>
        [Output("ipVersion")]
        public Output<string?> IpVersion { get; private set; } = null!;

        /// <summary>
        /// Set of label tags associated with the Gateway resource.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// The location of the gateway.
        /// The default value is `global`.
        /// </summary>
        [Output("location")]
        public Output<string?> Location { get; private set; } = null!;

        /// <summary>
        /// Name of the Gateway resource.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The relative resource name identifying the VPC network that is using this configuration.
        /// For example: 'projects/*/global/networks/network-1'.
        /// Currently, this field is specific to gateways of type 'SECURE_WEB_GATEWAY'.
        /// </summary>
        [Output("network")]
        public Output<string?> Network { get; private set; } = null!;

        /// <summary>
        /// One or more port numbers (1-65535), on which the Gateway will receive traffic.
        /// The proxy binds to the specified ports. Gateways of type 'SECURE_WEB_GATEWAY' are limited to 1 port.
        /// Gateways of type 'OPEN_MESH' listen on 0.0.0.0 for IPv4 and :: for IPv6 and support multiple ports.
        /// </summary>
        [Output("ports")]
        public Output<ImmutableArray<int>> Ports { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The combination of labels configured directly on the resource
        /// and default labels configured on the provider.
        /// </summary>
        [Output("pulumiLabels")]
        public Output<ImmutableDictionary<string, string>> PulumiLabels { get; private set; } = null!;

        /// <summary>
        /// The routing mode of the Gateway. This field is configurable only for gateways of type SECURE_WEB_GATEWAY. This field is required for gateways of type SECURE_WEB_GATEWAY.
        /// Possible values are: `NEXT_HOP_ROUTING_MODE`.
        /// </summary>
        [Output("routingMode")]
        public Output<string?> RoutingMode { get; private set; } = null!;

        /// <summary>
        /// Immutable. Scope determines how configuration across multiple Gateway instances are merged.
        /// The configuration for multiple Gateway instances with the same scope will be merged as presented as a single coniguration to the proxy/load balancer.
        /// Max length 64 characters. Scope should start with a letter and can only have letters, numbers, hyphens.
        /// </summary>
        [Output("scope")]
        public Output<string?> Scope { get; private set; } = null!;

        /// <summary>
        /// Server-defined URL of this resource.
        /// </summary>
        [Output("selfLink")]
        public Output<string> SelfLink { get; private set; } = null!;

        /// <summary>
        /// A fully-qualified ServerTLSPolicy URL reference. Specifies how TLS traffic is terminated. If empty, TLS termination is disabled.
        /// </summary>
        [Output("serverTlsPolicy")]
        public Output<string?> ServerTlsPolicy { get; private set; } = null!;

        /// <summary>
        /// The relative resource name identifying the subnetwork in which this SWG is allocated.
        /// For example: projects/*/regions/us-central1/subnetworks/network-1.
        /// Currently, this field is specific to gateways of type 'SECURE_WEB_GATEWAY'.
        /// </summary>
        [Output("subnetwork")]
        public Output<string?> Subnetwork { get; private set; } = null!;

        /// <summary>
        /// Immutable. The type of the customer managed gateway.
        /// Possible values are: `OPEN_MESH`, `SECURE_WEB_GATEWAY`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The timestamp when the resource was updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a Gateway resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Gateway(string name, GatewayArgs args, CustomResourceOptions? options = null)
            : base("gcp:networkservices/gateway:Gateway", name, args ?? new GatewayArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Gateway(string name, Input<string> id, GatewayState? state = null, CustomResourceOptions? options = null)
            : base("gcp:networkservices/gateway:Gateway", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "effectiveLabels",
                    "pulumiLabels",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Gateway resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Gateway Get(string name, Input<string> id, GatewayState? state = null, CustomResourceOptions? options = null)
        {
            return new Gateway(name, id, state, options);
        }
    }

    public sealed class GatewayArgs : global::Pulumi.ResourceArgs
    {
        [Input("addresses")]
        private InputList<string>? _addresses;

        /// <summary>
        /// Zero or one IPv4 or IPv6 address on which the Gateway will receive the traffic.
        /// When no address is provided, an IP from the subnetwork is allocated.
        /// This field only applies to gateways of type 'SECURE_WEB_GATEWAY'.
        /// Gateways of type 'OPEN_MESH' listen on 0.0.0.0 for IPv4 and :: for IPv6.
        /// </summary>
        public InputList<string> Addresses
        {
            get => _addresses ?? (_addresses = new InputList<string>());
            set => _addresses = value;
        }

        [Input("certificateUrls")]
        private InputList<string>? _certificateUrls;

        /// <summary>
        /// A fully-qualified Certificates URL reference. The proxy presents a Certificate (selected based on SNI) when establishing a TLS connection.
        /// This feature only applies to gateways of type 'SECURE_WEB_GATEWAY'.
        /// </summary>
        public InputList<string> CertificateUrls
        {
            get => _certificateUrls ?? (_certificateUrls = new InputList<string>());
            set => _certificateUrls = value;
        }

        /// <summary>
        /// When deleting a gateway of type 'SECURE_WEB_GATEWAY', this boolean option will also delete auto generated router by the gateway creation.
        /// If there is no other gateway of type 'SECURE_WEB_GATEWAY' remaining for that region and network it will be deleted.
        /// </summary>
        [Input("deleteSwgAutogenRouterOnDestroy")]
        public Input<bool>? DeleteSwgAutogenRouterOnDestroy { get; set; }

        /// <summary>
        /// A free-text description of the resource. Max length 1024 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Determines if envoy will insert internal debug headers into upstream requests.
        /// Other Envoy headers may still be injected.
        /// By default, envoy will not insert any debug headers.
        /// Possible values are: `NONE`, `DEBUG_HEADERS`.
        /// </summary>
        [Input("envoyHeaders")]
        public Input<string>? EnvoyHeaders { get; set; }

        /// <summary>
        /// A fully-qualified GatewaySecurityPolicy URL reference. Defines how a server should apply security policy to inbound (VM to Proxy) initiated connections.
        /// For example: 'projects/*/locations/*/gatewaySecurityPolicies/swg-policy'.
        /// This policy is specific to gateways of type 'SECURE_WEB_GATEWAY'.
        /// </summary>
        [Input("gatewaySecurityPolicy")]
        public Input<string>? GatewaySecurityPolicy { get; set; }

        /// <summary>
        /// The IP Version that will be used by this gateway.
        /// Possible values are: `IPV4`, `IPV6`.
        /// </summary>
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Set of label tags associated with the Gateway resource.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The location of the gateway.
        /// The default value is `global`.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Name of the Gateway resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The relative resource name identifying the VPC network that is using this configuration.
        /// For example: 'projects/*/global/networks/network-1'.
        /// Currently, this field is specific to gateways of type 'SECURE_WEB_GATEWAY'.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        [Input("ports", required: true)]
        private InputList<int>? _ports;

        /// <summary>
        /// One or more port numbers (1-65535), on which the Gateway will receive traffic.
        /// The proxy binds to the specified ports. Gateways of type 'SECURE_WEB_GATEWAY' are limited to 1 port.
        /// Gateways of type 'OPEN_MESH' listen on 0.0.0.0 for IPv4 and :: for IPv6 and support multiple ports.
        /// </summary>
        public InputList<int> Ports
        {
            get => _ports ?? (_ports = new InputList<int>());
            set => _ports = value;
        }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The routing mode of the Gateway. This field is configurable only for gateways of type SECURE_WEB_GATEWAY. This field is required for gateways of type SECURE_WEB_GATEWAY.
        /// Possible values are: `NEXT_HOP_ROUTING_MODE`.
        /// </summary>
        [Input("routingMode")]
        public Input<string>? RoutingMode { get; set; }

        /// <summary>
        /// Immutable. Scope determines how configuration across multiple Gateway instances are merged.
        /// The configuration for multiple Gateway instances with the same scope will be merged as presented as a single coniguration to the proxy/load balancer.
        /// Max length 64 characters. Scope should start with a letter and can only have letters, numbers, hyphens.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        /// <summary>
        /// A fully-qualified ServerTLSPolicy URL reference. Specifies how TLS traffic is terminated. If empty, TLS termination is disabled.
        /// </summary>
        [Input("serverTlsPolicy")]
        public Input<string>? ServerTlsPolicy { get; set; }

        /// <summary>
        /// The relative resource name identifying the subnetwork in which this SWG is allocated.
        /// For example: projects/*/regions/us-central1/subnetworks/network-1.
        /// Currently, this field is specific to gateways of type 'SECURE_WEB_GATEWAY'.
        /// </summary>
        [Input("subnetwork")]
        public Input<string>? Subnetwork { get; set; }

        /// <summary>
        /// Immutable. The type of the customer managed gateway.
        /// Possible values are: `OPEN_MESH`, `SECURE_WEB_GATEWAY`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GatewayArgs()
        {
        }
        public static new GatewayArgs Empty => new GatewayArgs();
    }

    public sealed class GatewayState : global::Pulumi.ResourceArgs
    {
        [Input("addresses")]
        private InputList<string>? _addresses;

        /// <summary>
        /// Zero or one IPv4 or IPv6 address on which the Gateway will receive the traffic.
        /// When no address is provided, an IP from the subnetwork is allocated.
        /// This field only applies to gateways of type 'SECURE_WEB_GATEWAY'.
        /// Gateways of type 'OPEN_MESH' listen on 0.0.0.0 for IPv4 and :: for IPv6.
        /// </summary>
        public InputList<string> Addresses
        {
            get => _addresses ?? (_addresses = new InputList<string>());
            set => _addresses = value;
        }

        [Input("certificateUrls")]
        private InputList<string>? _certificateUrls;

        /// <summary>
        /// A fully-qualified Certificates URL reference. The proxy presents a Certificate (selected based on SNI) when establishing a TLS connection.
        /// This feature only applies to gateways of type 'SECURE_WEB_GATEWAY'.
        /// </summary>
        public InputList<string> CertificateUrls
        {
            get => _certificateUrls ?? (_certificateUrls = new InputList<string>());
            set => _certificateUrls = value;
        }

        /// <summary>
        /// The timestamp when the resource was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// When deleting a gateway of type 'SECURE_WEB_GATEWAY', this boolean option will also delete auto generated router by the gateway creation.
        /// If there is no other gateway of type 'SECURE_WEB_GATEWAY' remaining for that region and network it will be deleted.
        /// </summary>
        [Input("deleteSwgAutogenRouterOnDestroy")]
        public Input<bool>? DeleteSwgAutogenRouterOnDestroy { get; set; }

        /// <summary>
        /// A free-text description of the resource. Max length 1024 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("effectiveLabels")]
        private InputMap<string>? _effectiveLabels;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        public InputMap<string> EffectiveLabels
        {
            get => _effectiveLabels ?? (_effectiveLabels = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _effectiveLabels = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// Determines if envoy will insert internal debug headers into upstream requests.
        /// Other Envoy headers may still be injected.
        /// By default, envoy will not insert any debug headers.
        /// Possible values are: `NONE`, `DEBUG_HEADERS`.
        /// </summary>
        [Input("envoyHeaders")]
        public Input<string>? EnvoyHeaders { get; set; }

        /// <summary>
        /// A fully-qualified GatewaySecurityPolicy URL reference. Defines how a server should apply security policy to inbound (VM to Proxy) initiated connections.
        /// For example: 'projects/*/locations/*/gatewaySecurityPolicies/swg-policy'.
        /// This policy is specific to gateways of type 'SECURE_WEB_GATEWAY'.
        /// </summary>
        [Input("gatewaySecurityPolicy")]
        public Input<string>? GatewaySecurityPolicy { get; set; }

        /// <summary>
        /// The IP Version that will be used by this gateway.
        /// Possible values are: `IPV4`, `IPV6`.
        /// </summary>
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Set of label tags associated with the Gateway resource.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The location of the gateway.
        /// The default value is `global`.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Name of the Gateway resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The relative resource name identifying the VPC network that is using this configuration.
        /// For example: 'projects/*/global/networks/network-1'.
        /// Currently, this field is specific to gateways of type 'SECURE_WEB_GATEWAY'.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        [Input("ports")]
        private InputList<int>? _ports;

        /// <summary>
        /// One or more port numbers (1-65535), on which the Gateway will receive traffic.
        /// The proxy binds to the specified ports. Gateways of type 'SECURE_WEB_GATEWAY' are limited to 1 port.
        /// Gateways of type 'OPEN_MESH' listen on 0.0.0.0 for IPv4 and :: for IPv6 and support multiple ports.
        /// </summary>
        public InputList<int> Ports
        {
            get => _ports ?? (_ports = new InputList<int>());
            set => _ports = value;
        }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("pulumiLabels")]
        private InputMap<string>? _pulumiLabels;

        /// <summary>
        /// The combination of labels configured directly on the resource
        /// and default labels configured on the provider.
        /// </summary>
        public InputMap<string> PulumiLabels
        {
            get => _pulumiLabels ?? (_pulumiLabels = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _pulumiLabels = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// The routing mode of the Gateway. This field is configurable only for gateways of type SECURE_WEB_GATEWAY. This field is required for gateways of type SECURE_WEB_GATEWAY.
        /// Possible values are: `NEXT_HOP_ROUTING_MODE`.
        /// </summary>
        [Input("routingMode")]
        public Input<string>? RoutingMode { get; set; }

        /// <summary>
        /// Immutable. Scope determines how configuration across multiple Gateway instances are merged.
        /// The configuration for multiple Gateway instances with the same scope will be merged as presented as a single coniguration to the proxy/load balancer.
        /// Max length 64 characters. Scope should start with a letter and can only have letters, numbers, hyphens.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        /// <summary>
        /// Server-defined URL of this resource.
        /// </summary>
        [Input("selfLink")]
        public Input<string>? SelfLink { get; set; }

        /// <summary>
        /// A fully-qualified ServerTLSPolicy URL reference. Specifies how TLS traffic is terminated. If empty, TLS termination is disabled.
        /// </summary>
        [Input("serverTlsPolicy")]
        public Input<string>? ServerTlsPolicy { get; set; }

        /// <summary>
        /// The relative resource name identifying the subnetwork in which this SWG is allocated.
        /// For example: projects/*/regions/us-central1/subnetworks/network-1.
        /// Currently, this field is specific to gateways of type 'SECURE_WEB_GATEWAY'.
        /// </summary>
        [Input("subnetwork")]
        public Input<string>? Subnetwork { get; set; }

        /// <summary>
        /// Immutable. The type of the customer managed gateway.
        /// Possible values are: `OPEN_MESH`, `SECURE_WEB_GATEWAY`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The timestamp when the resource was updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public GatewayState()
        {
        }
        public static new GatewayState Empty => new GatewayState();
    }
}
