// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkManagement
{
    /// <summary>
    /// VPC Flow Logs Config is a resource that lets you configure Flow Logs for VPC, Interconnect attachments or VPN Tunnels.
    /// 
    /// ## Example Usage
    /// 
    /// ### Network Management Vpc Flow Logs Config Interconnect Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = Gcp.Organizations.GetProject.Invoke();
    /// 
    ///     var network = new Gcp.Compute.Network("network", new()
    ///     {
    ///         Name = "full-interconnect-test-network",
    ///     });
    /// 
    ///     var router = new Gcp.Compute.Router("router", new()
    ///     {
    ///         Name = "full-interconnect-test-router",
    ///         Network = network.Name,
    ///         Bgp = new Gcp.Compute.Inputs.RouterBgpArgs
    ///         {
    ///             Asn = 16550,
    ///         },
    ///     });
    /// 
    ///     var attachment = new Gcp.Compute.InterconnectAttachment("attachment", new()
    ///     {
    ///         Name = "full-interconnect-test-id",
    ///         EdgeAvailabilityDomain = "AVAILABILITY_DOMAIN_1",
    ///         Type = "PARTNER",
    ///         Router = router.Id,
    ///         Mtu = "1500",
    ///     });
    /// 
    ///     var interconnect_test = new Gcp.NetworkManagement.VpcFlowLogsConfig("interconnect-test", new()
    ///     {
    ///         VpcFlowLogsConfigId = "full-interconnect-test-id",
    ///         Location = "global",
    ///         InterconnectAttachment = Output.Tuple(project, attachment.Name).Apply(values =&gt;
    ///         {
    ///             var project = values.Item1;
    ///             var name = values.Item2;
    ///             return $"projects/{project.Apply(getProjectResult =&gt; getProjectResult.Number)}/regions/us-east4/interconnectAttachments/{name}";
    ///         }),
    ///         State = "ENABLED",
    ///         AggregationInterval = "INTERVAL_5_SEC",
    ///         Description = "VPC Flow Logs over a VPN Gateway.",
    ///         FlowSampling = 0.5,
    ///         Metadata = "INCLUDE_ALL_METADATA",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Network Management Vpc Flow Logs Config Interconnect Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = Gcp.Organizations.GetProject.Invoke();
    /// 
    ///     var network = new Gcp.Compute.Network("network", new()
    ///     {
    ///         Name = "basic-interconnect-test-network",
    ///     });
    /// 
    ///     var router = new Gcp.Compute.Router("router", new()
    ///     {
    ///         Name = "basic-interconnect-test-router",
    ///         Network = network.Name,
    ///         Bgp = new Gcp.Compute.Inputs.RouterBgpArgs
    ///         {
    ///             Asn = 16550,
    ///         },
    ///     });
    /// 
    ///     var attachment = new Gcp.Compute.InterconnectAttachment("attachment", new()
    ///     {
    ///         Name = "basic-interconnect-test-id",
    ///         EdgeAvailabilityDomain = "AVAILABILITY_DOMAIN_1",
    ///         Type = "PARTNER",
    ///         Router = router.Id,
    ///         Mtu = "1500",
    ///     });
    /// 
    ///     var interconnect_test = new Gcp.NetworkManagement.VpcFlowLogsConfig("interconnect-test", new()
    ///     {
    ///         VpcFlowLogsConfigId = "basic-interconnect-test-id",
    ///         Location = "global",
    ///         InterconnectAttachment = Output.Tuple(project, attachment.Name).Apply(values =&gt;
    ///         {
    ///             var project = values.Item1;
    ///             var name = values.Item2;
    ///             return $"projects/{project.Apply(getProjectResult =&gt; getProjectResult.Number)}/regions/us-east4/interconnectAttachments/{name}";
    ///         }),
    ///     });
    /// 
    /// });
    /// ```
    /// ### Network Management Vpc Flow Logs Config Vpn Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = Gcp.Organizations.GetProject.Invoke();
    /// 
    ///     var network = new Gcp.Compute.Network("network", new()
    ///     {
    ///         Name = "basic-test-network",
    ///     });
    /// 
    ///     var targetGateway = new Gcp.Compute.VPNGateway("target_gateway", new()
    ///     {
    ///         Name = "basic-test-gateway",
    ///         Network = network.Id,
    ///     });
    /// 
    ///     var vpnStaticIp = new Gcp.Compute.Address("vpn_static_ip", new()
    ///     {
    ///         Name = "basic-test-address",
    ///     });
    /// 
    ///     var frEsp = new Gcp.Compute.ForwardingRule("fr_esp", new()
    ///     {
    ///         Name = "basic-test-fresp",
    ///         IpProtocol = "ESP",
    ///         IpAddress = vpnStaticIp.IPAddress,
    ///         Target = targetGateway.Id,
    ///     });
    /// 
    ///     var frUdp500 = new Gcp.Compute.ForwardingRule("fr_udp500", new()
    ///     {
    ///         Name = "basic-test-fr500",
    ///         IpProtocol = "UDP",
    ///         PortRange = "500",
    ///         IpAddress = vpnStaticIp.IPAddress,
    ///         Target = targetGateway.Id,
    ///     });
    /// 
    ///     var frUdp4500 = new Gcp.Compute.ForwardingRule("fr_udp4500", new()
    ///     {
    ///         Name = "basic-test-fr4500",
    ///         IpProtocol = "UDP",
    ///         PortRange = "4500",
    ///         IpAddress = vpnStaticIp.IPAddress,
    ///         Target = targetGateway.Id,
    ///     });
    /// 
    ///     var tunnel = new Gcp.Compute.VPNTunnel("tunnel", new()
    ///     {
    ///         Name = "basic-test-tunnel",
    ///         PeerIp = "15.0.0.120",
    ///         SharedSecret = "a secret message",
    ///         TargetVpnGateway = targetGateway.Id,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             frEsp,
    ///             frUdp500,
    ///             frUdp4500,
    ///         },
    ///     });
    /// 
    ///     var vpn_test = new Gcp.NetworkManagement.VpcFlowLogsConfig("vpn-test", new()
    ///     {
    ///         VpcFlowLogsConfigId = "basic-test-id",
    ///         Location = "global",
    ///         VpnTunnel = Output.Tuple(project, tunnel.Name).Apply(values =&gt;
    ///         {
    ///             var project = values.Item1;
    ///             var name = values.Item2;
    ///             return $"projects/{project.Apply(getProjectResult =&gt; getProjectResult.Number)}/regions/us-central1/vpnTunnels/{name}";
    ///         }),
    ///     });
    /// 
    ///     var route = new Gcp.Compute.Route("route", new()
    ///     {
    ///         Name = "basic-test-route",
    ///         Network = network.Name,
    ///         DestRange = "15.0.0.0/24",
    ///         Priority = 1000,
    ///         NextHopVpnTunnel = tunnel.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Network Management Vpc Flow Logs Config Vpn Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = Gcp.Organizations.GetProject.Invoke();
    /// 
    ///     var network = new Gcp.Compute.Network("network", new()
    ///     {
    ///         Name = "full-test-network",
    ///     });
    /// 
    ///     var targetGateway = new Gcp.Compute.VPNGateway("target_gateway", new()
    ///     {
    ///         Name = "full-test-gateway",
    ///         Network = network.Id,
    ///     });
    /// 
    ///     var vpnStaticIp = new Gcp.Compute.Address("vpn_static_ip", new()
    ///     {
    ///         Name = "full-test-address",
    ///     });
    /// 
    ///     var frEsp = new Gcp.Compute.ForwardingRule("fr_esp", new()
    ///     {
    ///         Name = "full-test-fresp",
    ///         IpProtocol = "ESP",
    ///         IpAddress = vpnStaticIp.IPAddress,
    ///         Target = targetGateway.Id,
    ///     });
    /// 
    ///     var frUdp500 = new Gcp.Compute.ForwardingRule("fr_udp500", new()
    ///     {
    ///         Name = "full-test-fr500",
    ///         IpProtocol = "UDP",
    ///         PortRange = "500",
    ///         IpAddress = vpnStaticIp.IPAddress,
    ///         Target = targetGateway.Id,
    ///     });
    /// 
    ///     var frUdp4500 = new Gcp.Compute.ForwardingRule("fr_udp4500", new()
    ///     {
    ///         Name = "full-test-fr4500",
    ///         IpProtocol = "UDP",
    ///         PortRange = "4500",
    ///         IpAddress = vpnStaticIp.IPAddress,
    ///         Target = targetGateway.Id,
    ///     });
    /// 
    ///     var tunnel = new Gcp.Compute.VPNTunnel("tunnel", new()
    ///     {
    ///         Name = "full-test-tunnel",
    ///         PeerIp = "15.0.0.120",
    ///         SharedSecret = "a secret message",
    ///         TargetVpnGateway = targetGateway.Id,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             frEsp,
    ///             frUdp500,
    ///             frUdp4500,
    ///         },
    ///     });
    /// 
    ///     var vpn_test = new Gcp.NetworkManagement.VpcFlowLogsConfig("vpn-test", new()
    ///     {
    ///         VpcFlowLogsConfigId = "full-test-id",
    ///         Location = "global",
    ///         VpnTunnel = Output.Tuple(project, tunnel.Name).Apply(values =&gt;
    ///         {
    ///             var project = values.Item1;
    ///             var name = values.Item2;
    ///             return $"projects/{project.Apply(getProjectResult =&gt; getProjectResult.Number)}/regions/us-central1/vpnTunnels/{name}";
    ///         }),
    ///         State = "ENABLED",
    ///         AggregationInterval = "INTERVAL_5_SEC",
    ///         Description = "VPC Flow Logs over a VPN Gateway.",
    ///         FlowSampling = 0.5,
    ///         Metadata = "INCLUDE_ALL_METADATA",
    ///     });
    /// 
    ///     var route = new Gcp.Compute.Route("route", new()
    ///     {
    ///         Name = "full-test-route",
    ///         Network = network.Name,
    ///         DestRange = "15.0.0.0/24",
    ///         Priority = 1000,
    ///         NextHopVpnTunnel = tunnel.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// VpcFlowLogsConfig can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/vpcFlowLogsConfigs/{{vpc_flow_logs_config_id}}`
    /// 
    /// * `{{project}}/{{location}}/{{vpc_flow_logs_config_id}}`
    /// 
    /// * `{{location}}/{{vpc_flow_logs_config_id}}`
    /// 
    /// When using the `pulumi import` command, VpcFlowLogsConfig can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:networkmanagement/vpcFlowLogsConfig:VpcFlowLogsConfig default projects/{{project}}/locations/{{location}}/vpcFlowLogsConfigs/{{vpc_flow_logs_config_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:networkmanagement/vpcFlowLogsConfig:VpcFlowLogsConfig default {{project}}/{{location}}/{{vpc_flow_logs_config_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:networkmanagement/vpcFlowLogsConfig:VpcFlowLogsConfig default {{location}}/{{vpc_flow_logs_config_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:networkmanagement/vpcFlowLogsConfig:VpcFlowLogsConfig")]
    public partial class VpcFlowLogsConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Optional. The aggregation interval for the logs. Default value is
        /// INTERVAL_5_SEC.   Possible values:  AGGREGATION_INTERVAL_UNSPECIFIED INTERVAL_5_SEC INTERVAL_30_SEC INTERVAL_1_MIN INTERVAL_5_MIN INTERVAL_10_MIN INTERVAL_15_MIN"
        /// </summary>
        [Output("aggregationInterval")]
        public Output<string> AggregationInterval { get; private set; } = null!;

        /// <summary>
        /// Output only. The time the config was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Optional. The user-supplied description of the VPC Flow Logs configuration. Maximum
        /// of 512 characters.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// Optional. Export filter used to define which VPC Flow Logs should be logged.
        /// </summary>
        [Output("filterExpr")]
        public Output<string?> FilterExpr { get; private set; } = null!;

        /// <summary>
        /// Optional. The value of the field must be in (0, 1]. The sampling rate
        /// of VPC Flow Logs where 1.0 means all collected logs are reported. Setting the
        /// sampling rate to 0.0 is not allowed. If you want to disable VPC Flow Logs, use
        /// the state field instead. Default value is 1.0.
        /// </summary>
        [Output("flowSampling")]
        public Output<double> FlowSampling { get; private set; } = null!;

        /// <summary>
        /// Traffic will be logged from the Interconnect Attachment. Format: projects/{project_id}/regions/{region}/interconnectAttachments/{name}
        /// </summary>
        [Output("interconnectAttachment")]
        public Output<string?> InterconnectAttachment { get; private set; } = null!;

        /// <summary>
        /// Optional. Resource labels to represent user-provided metadata.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// Resource ID segment making up resource `name`. It identifies the resource
        /// within its parent collection as described in https://google.aip.dev/122. See documentation
        /// for resource type `networkmanagement.googleapis.com/VpcFlowLogsConfig`.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Optional. Configures whether all, none or a subset of metadata fields
        /// should be added to the reported VPC flow logs. Default value is INCLUDE_ALL_METADATA.
        /// Possible values:  METADATA_UNSPECIFIED INCLUDE_ALL_METADATA EXCLUDE_ALL_METADATA CUSTOM_METADATA
        /// </summary>
        [Output("metadata")]
        public Output<string> Metadata { get; private set; } = null!;

        /// <summary>
        /// Optional. Custom metadata fields to include in the reported VPC flow
        /// logs. Can only be specified if \"metadata\" was set to CUSTOM_METADATA.
        /// </summary>
        [Output("metadataFields")]
        public Output<ImmutableArray<string>> MetadataFields { get; private set; } = null!;

        /// <summary>
        /// Identifier. Unique name of the configuration using the form:     `projects/{project_id}/locations/global/vpcFlowLogsConfigs/{vpc_flow_logs_config_id}`
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

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
        /// Optional. The state of the VPC Flow Log configuration. Default value
        /// is ENABLED. When creating a new configuration, it must be enabled.   Possible
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Output only. The time the config was updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;

        /// <summary>
        /// Required. ID of the `VpcFlowLogsConfig`.
        /// </summary>
        [Output("vpcFlowLogsConfigId")]
        public Output<string> VpcFlowLogsConfigId { get; private set; } = null!;

        /// <summary>
        /// Traffic will be logged from the VPN Tunnel. Format: projects/{project_id}/regions/{region}/vpnTunnels/{name}
        /// </summary>
        [Output("vpnTunnel")]
        public Output<string?> VpnTunnel { get; private set; } = null!;


        /// <summary>
        /// Create a VpcFlowLogsConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcFlowLogsConfig(string name, VpcFlowLogsConfigArgs args, CustomResourceOptions? options = null)
            : base("gcp:networkmanagement/vpcFlowLogsConfig:VpcFlowLogsConfig", name, args ?? new VpcFlowLogsConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcFlowLogsConfig(string name, Input<string> id, VpcFlowLogsConfigState? state = null, CustomResourceOptions? options = null)
            : base("gcp:networkmanagement/vpcFlowLogsConfig:VpcFlowLogsConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VpcFlowLogsConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcFlowLogsConfig Get(string name, Input<string> id, VpcFlowLogsConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcFlowLogsConfig(name, id, state, options);
        }
    }

    public sealed class VpcFlowLogsConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. The aggregation interval for the logs. Default value is
        /// INTERVAL_5_SEC.   Possible values:  AGGREGATION_INTERVAL_UNSPECIFIED INTERVAL_5_SEC INTERVAL_30_SEC INTERVAL_1_MIN INTERVAL_5_MIN INTERVAL_10_MIN INTERVAL_15_MIN"
        /// </summary>
        [Input("aggregationInterval")]
        public Input<string>? AggregationInterval { get; set; }

        /// <summary>
        /// Optional. The user-supplied description of the VPC Flow Logs configuration. Maximum
        /// of 512 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Optional. Export filter used to define which VPC Flow Logs should be logged.
        /// </summary>
        [Input("filterExpr")]
        public Input<string>? FilterExpr { get; set; }

        /// <summary>
        /// Optional. The value of the field must be in (0, 1]. The sampling rate
        /// of VPC Flow Logs where 1.0 means all collected logs are reported. Setting the
        /// sampling rate to 0.0 is not allowed. If you want to disable VPC Flow Logs, use
        /// the state field instead. Default value is 1.0.
        /// </summary>
        [Input("flowSampling")]
        public Input<double>? FlowSampling { get; set; }

        /// <summary>
        /// Traffic will be logged from the Interconnect Attachment. Format: projects/{project_id}/regions/{region}/interconnectAttachments/{name}
        /// </summary>
        [Input("interconnectAttachment")]
        public Input<string>? InterconnectAttachment { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Optional. Resource labels to represent user-provided metadata.
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
        /// Resource ID segment making up resource `name`. It identifies the resource
        /// within its parent collection as described in https://google.aip.dev/122. See documentation
        /// for resource type `networkmanagement.googleapis.com/VpcFlowLogsConfig`.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// Optional. Configures whether all, none or a subset of metadata fields
        /// should be added to the reported VPC flow logs. Default value is INCLUDE_ALL_METADATA.
        /// Possible values:  METADATA_UNSPECIFIED INCLUDE_ALL_METADATA EXCLUDE_ALL_METADATA CUSTOM_METADATA
        /// </summary>
        [Input("metadata")]
        public Input<string>? Metadata { get; set; }

        [Input("metadataFields")]
        private InputList<string>? _metadataFields;

        /// <summary>
        /// Optional. Custom metadata fields to include in the reported VPC flow
        /// logs. Can only be specified if \"metadata\" was set to CUSTOM_METADATA.
        /// </summary>
        public InputList<string> MetadataFields
        {
            get => _metadataFields ?? (_metadataFields = new InputList<string>());
            set => _metadataFields = value;
        }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Optional. The state of the VPC Flow Log configuration. Default value
        /// is ENABLED. When creating a new configuration, it must be enabled.   Possible
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// Required. ID of the `VpcFlowLogsConfig`.
        /// </summary>
        [Input("vpcFlowLogsConfigId", required: true)]
        public Input<string> VpcFlowLogsConfigId { get; set; } = null!;

        /// <summary>
        /// Traffic will be logged from the VPN Tunnel. Format: projects/{project_id}/regions/{region}/vpnTunnels/{name}
        /// </summary>
        [Input("vpnTunnel")]
        public Input<string>? VpnTunnel { get; set; }

        public VpcFlowLogsConfigArgs()
        {
        }
        public static new VpcFlowLogsConfigArgs Empty => new VpcFlowLogsConfigArgs();
    }

    public sealed class VpcFlowLogsConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. The aggregation interval for the logs. Default value is
        /// INTERVAL_5_SEC.   Possible values:  AGGREGATION_INTERVAL_UNSPECIFIED INTERVAL_5_SEC INTERVAL_30_SEC INTERVAL_1_MIN INTERVAL_5_MIN INTERVAL_10_MIN INTERVAL_15_MIN"
        /// </summary>
        [Input("aggregationInterval")]
        public Input<string>? AggregationInterval { get; set; }

        /// <summary>
        /// Output only. The time the config was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Optional. The user-supplied description of the VPC Flow Logs configuration. Maximum
        /// of 512 characters.
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
        /// Optional. Export filter used to define which VPC Flow Logs should be logged.
        /// </summary>
        [Input("filterExpr")]
        public Input<string>? FilterExpr { get; set; }

        /// <summary>
        /// Optional. The value of the field must be in (0, 1]. The sampling rate
        /// of VPC Flow Logs where 1.0 means all collected logs are reported. Setting the
        /// sampling rate to 0.0 is not allowed. If you want to disable VPC Flow Logs, use
        /// the state field instead. Default value is 1.0.
        /// </summary>
        [Input("flowSampling")]
        public Input<double>? FlowSampling { get; set; }

        /// <summary>
        /// Traffic will be logged from the Interconnect Attachment. Format: projects/{project_id}/regions/{region}/interconnectAttachments/{name}
        /// </summary>
        [Input("interconnectAttachment")]
        public Input<string>? InterconnectAttachment { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Optional. Resource labels to represent user-provided metadata.
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
        /// Resource ID segment making up resource `name`. It identifies the resource
        /// within its parent collection as described in https://google.aip.dev/122. See documentation
        /// for resource type `networkmanagement.googleapis.com/VpcFlowLogsConfig`.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Optional. Configures whether all, none or a subset of metadata fields
        /// should be added to the reported VPC flow logs. Default value is INCLUDE_ALL_METADATA.
        /// Possible values:  METADATA_UNSPECIFIED INCLUDE_ALL_METADATA EXCLUDE_ALL_METADATA CUSTOM_METADATA
        /// </summary>
        [Input("metadata")]
        public Input<string>? Metadata { get; set; }

        [Input("metadataFields")]
        private InputList<string>? _metadataFields;

        /// <summary>
        /// Optional. Custom metadata fields to include in the reported VPC flow
        /// logs. Can only be specified if \"metadata\" was set to CUSTOM_METADATA.
        /// </summary>
        public InputList<string> MetadataFields
        {
            get => _metadataFields ?? (_metadataFields = new InputList<string>());
            set => _metadataFields = value;
        }

        /// <summary>
        /// Identifier. Unique name of the configuration using the form:     `projects/{project_id}/locations/global/vpcFlowLogsConfigs/{vpc_flow_logs_config_id}`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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
        /// Optional. The state of the VPC Flow Log configuration. Default value
        /// is ENABLED. When creating a new configuration, it must be enabled.   Possible
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// Output only. The time the config was updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        /// <summary>
        /// Required. ID of the `VpcFlowLogsConfig`.
        /// </summary>
        [Input("vpcFlowLogsConfigId")]
        public Input<string>? VpcFlowLogsConfigId { get; set; }

        /// <summary>
        /// Traffic will be logged from the VPN Tunnel. Format: projects/{project_id}/regions/{region}/vpnTunnels/{name}
        /// </summary>
        [Input("vpnTunnel")]
        public Input<string>? VpnTunnel { get; set; }

        public VpcFlowLogsConfigState()
        {
        }
        public static new VpcFlowLogsConfigState Empty => new VpcFlowLogsConfigState();
    }
}
