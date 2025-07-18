// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "gcp:compute/address:Address":
		r = &Address{}
	case "gcp:compute/attachedDisk:AttachedDisk":
		r = &AttachedDisk{}
	case "gcp:compute/autoscaler:Autoscaler":
		r = &Autoscaler{}
	case "gcp:compute/backendBucket:BackendBucket":
		r = &BackendBucket{}
	case "gcp:compute/backendBucketIamBinding:BackendBucketIamBinding":
		r = &BackendBucketIamBinding{}
	case "gcp:compute/backendBucketIamMember:BackendBucketIamMember":
		r = &BackendBucketIamMember{}
	case "gcp:compute/backendBucketIamPolicy:BackendBucketIamPolicy":
		r = &BackendBucketIamPolicy{}
	case "gcp:compute/backendBucketSignedUrlKey:BackendBucketSignedUrlKey":
		r = &BackendBucketSignedUrlKey{}
	case "gcp:compute/backendService:BackendService":
		r = &BackendService{}
	case "gcp:compute/backendServiceIamBinding:BackendServiceIamBinding":
		r = &BackendServiceIamBinding{}
	case "gcp:compute/backendServiceIamMember:BackendServiceIamMember":
		r = &BackendServiceIamMember{}
	case "gcp:compute/backendServiceIamPolicy:BackendServiceIamPolicy":
		r = &BackendServiceIamPolicy{}
	case "gcp:compute/backendServiceSignedUrlKey:BackendServiceSignedUrlKey":
		r = &BackendServiceSignedUrlKey{}
	case "gcp:compute/caExternalAccountKey:CaExternalAccountKey":
		r = &CaExternalAccountKey{}
	case "gcp:compute/crossSiteNetwork:CrossSiteNetwork":
		r = &CrossSiteNetwork{}
	case "gcp:compute/disk:Disk":
		r = &Disk{}
	case "gcp:compute/diskAsyncReplication:DiskAsyncReplication":
		r = &DiskAsyncReplication{}
	case "gcp:compute/diskIamBinding:DiskIamBinding":
		r = &DiskIamBinding{}
	case "gcp:compute/diskIamMember:DiskIamMember":
		r = &DiskIamMember{}
	case "gcp:compute/diskIamPolicy:DiskIamPolicy":
		r = &DiskIamPolicy{}
	case "gcp:compute/diskResourcePolicyAttachment:DiskResourcePolicyAttachment":
		r = &DiskResourcePolicyAttachment{}
	case "gcp:compute/externalVpnGateway:ExternalVpnGateway":
		r = &ExternalVpnGateway{}
	case "gcp:compute/firewall:Firewall":
		r = &Firewall{}
	case "gcp:compute/firewallPolicy:FirewallPolicy":
		r = &FirewallPolicy{}
	case "gcp:compute/firewallPolicyAssociation:FirewallPolicyAssociation":
		r = &FirewallPolicyAssociation{}
	case "gcp:compute/firewallPolicyRule:FirewallPolicyRule":
		r = &FirewallPolicyRule{}
	case "gcp:compute/firewallPolicyWithRules:FirewallPolicyWithRules":
		r = &FirewallPolicyWithRules{}
	case "gcp:compute/forwardingRule:ForwardingRule":
		r = &ForwardingRule{}
	case "gcp:compute/futureReservation:FutureReservation":
		r = &FutureReservation{}
	case "gcp:compute/globalAddress:GlobalAddress":
		r = &GlobalAddress{}
	case "gcp:compute/globalForwardingRule:GlobalForwardingRule":
		r = &GlobalForwardingRule{}
	case "gcp:compute/globalNetworkEndpoint:GlobalNetworkEndpoint":
		r = &GlobalNetworkEndpoint{}
	case "gcp:compute/globalNetworkEndpointGroup:GlobalNetworkEndpointGroup":
		r = &GlobalNetworkEndpointGroup{}
	case "gcp:compute/haVpnGateway:HaVpnGateway":
		r = &HaVpnGateway{}
	case "gcp:compute/healthCheck:HealthCheck":
		r = &HealthCheck{}
	case "gcp:compute/httpHealthCheck:HttpHealthCheck":
		r = &HttpHealthCheck{}
	case "gcp:compute/httpsHealthCheck:HttpsHealthCheck":
		r = &HttpsHealthCheck{}
	case "gcp:compute/image:Image":
		r = &Image{}
	case "gcp:compute/imageIamBinding:ImageIamBinding":
		r = &ImageIamBinding{}
	case "gcp:compute/imageIamMember:ImageIamMember":
		r = &ImageIamMember{}
	case "gcp:compute/imageIamPolicy:ImageIamPolicy":
		r = &ImageIamPolicy{}
	case "gcp:compute/instance:Instance":
		r = &Instance{}
	case "gcp:compute/instanceFromMachineImage:InstanceFromMachineImage":
		r = &InstanceFromMachineImage{}
	case "gcp:compute/instanceFromTemplate:InstanceFromTemplate":
		r = &InstanceFromTemplate{}
	case "gcp:compute/instanceGroup:InstanceGroup":
		r = &InstanceGroup{}
	case "gcp:compute/instanceGroupManager:InstanceGroupManager":
		r = &InstanceGroupManager{}
	case "gcp:compute/instanceGroupMembership:InstanceGroupMembership":
		r = &InstanceGroupMembership{}
	case "gcp:compute/instanceGroupNamedPort:InstanceGroupNamedPort":
		r = &InstanceGroupNamedPort{}
	case "gcp:compute/instanceIAMBinding:InstanceIAMBinding":
		r = &InstanceIAMBinding{}
	case "gcp:compute/instanceIAMMember:InstanceIAMMember":
		r = &InstanceIAMMember{}
	case "gcp:compute/instanceIAMPolicy:InstanceIAMPolicy":
		r = &InstanceIAMPolicy{}
	case "gcp:compute/instanceSettings:InstanceSettings":
		r = &InstanceSettings{}
	case "gcp:compute/instanceTemplate:InstanceTemplate":
		r = &InstanceTemplate{}
	case "gcp:compute/instanceTemplateIamBinding:InstanceTemplateIamBinding":
		r = &InstanceTemplateIamBinding{}
	case "gcp:compute/instanceTemplateIamMember:InstanceTemplateIamMember":
		r = &InstanceTemplateIamMember{}
	case "gcp:compute/instanceTemplateIamPolicy:InstanceTemplateIamPolicy":
		r = &InstanceTemplateIamPolicy{}
	case "gcp:compute/instantSnapshot:InstantSnapshot":
		r = &InstantSnapshot{}
	case "gcp:compute/instantSnapshotIamBinding:InstantSnapshotIamBinding":
		r = &InstantSnapshotIamBinding{}
	case "gcp:compute/instantSnapshotIamMember:InstantSnapshotIamMember":
		r = &InstantSnapshotIamMember{}
	case "gcp:compute/instantSnapshotIamPolicy:InstantSnapshotIamPolicy":
		r = &InstantSnapshotIamPolicy{}
	case "gcp:compute/interconnect:Interconnect":
		r = &Interconnect{}
	case "gcp:compute/interconnectAttachment:InterconnectAttachment":
		r = &InterconnectAttachment{}
	case "gcp:compute/interconnectAttachmentGroup:InterconnectAttachmentGroup":
		r = &InterconnectAttachmentGroup{}
	case "gcp:compute/interconnectGroup:InterconnectGroup":
		r = &InterconnectGroup{}
	case "gcp:compute/machineImage:MachineImage":
		r = &MachineImage{}
	case "gcp:compute/machineImageIamBinding:MachineImageIamBinding":
		r = &MachineImageIamBinding{}
	case "gcp:compute/machineImageIamMember:MachineImageIamMember":
		r = &MachineImageIamMember{}
	case "gcp:compute/machineImageIamPolicy:MachineImageIamPolicy":
		r = &MachineImageIamPolicy{}
	case "gcp:compute/managedSslCertificate:ManagedSslCertificate":
		r = &ManagedSslCertificate{}
	case "gcp:compute/mangedSslCertificate:MangedSslCertificate":
		r = &MangedSslCertificate{}
	case "gcp:compute/network:Network":
		r = &Network{}
	case "gcp:compute/networkAttachment:NetworkAttachment":
		r = &NetworkAttachment{}
	case "gcp:compute/networkEdgeSecurityService:NetworkEdgeSecurityService":
		r = &NetworkEdgeSecurityService{}
	case "gcp:compute/networkEndpoint:NetworkEndpoint":
		r = &NetworkEndpoint{}
	case "gcp:compute/networkEndpointGroup:NetworkEndpointGroup":
		r = &NetworkEndpointGroup{}
	case "gcp:compute/networkEndpointList:NetworkEndpointList":
		r = &NetworkEndpointList{}
	case "gcp:compute/networkFirewallPolicy:NetworkFirewallPolicy":
		r = &NetworkFirewallPolicy{}
	case "gcp:compute/networkFirewallPolicyAssociation:NetworkFirewallPolicyAssociation":
		r = &NetworkFirewallPolicyAssociation{}
	case "gcp:compute/networkFirewallPolicyPacketMirroringRule:NetworkFirewallPolicyPacketMirroringRule":
		r = &NetworkFirewallPolicyPacketMirroringRule{}
	case "gcp:compute/networkFirewallPolicyRule:NetworkFirewallPolicyRule":
		r = &NetworkFirewallPolicyRule{}
	case "gcp:compute/networkFirewallPolicyWithRules:NetworkFirewallPolicyWithRules":
		r = &NetworkFirewallPolicyWithRules{}
	case "gcp:compute/networkPeering:NetworkPeering":
		r = &NetworkPeering{}
	case "gcp:compute/networkPeeringRoutesConfig:NetworkPeeringRoutesConfig":
		r = &NetworkPeeringRoutesConfig{}
	case "gcp:compute/nodeGroup:NodeGroup":
		r = &NodeGroup{}
	case "gcp:compute/nodeTemplate:NodeTemplate":
		r = &NodeTemplate{}
	case "gcp:compute/organizationSecurityPolicy:OrganizationSecurityPolicy":
		r = &OrganizationSecurityPolicy{}
	case "gcp:compute/organizationSecurityPolicyAssociation:OrganizationSecurityPolicyAssociation":
		r = &OrganizationSecurityPolicyAssociation{}
	case "gcp:compute/organizationSecurityPolicyRule:OrganizationSecurityPolicyRule":
		r = &OrganizationSecurityPolicyRule{}
	case "gcp:compute/packetMirroring:PacketMirroring":
		r = &PacketMirroring{}
	case "gcp:compute/perInstanceConfig:PerInstanceConfig":
		r = &PerInstanceConfig{}
	case "gcp:compute/projectCloudArmorTier:ProjectCloudArmorTier":
		r = &ProjectCloudArmorTier{}
	case "gcp:compute/projectDefaultNetworkTier:ProjectDefaultNetworkTier":
		r = &ProjectDefaultNetworkTier{}
	case "gcp:compute/projectMetadata:ProjectMetadata":
		r = &ProjectMetadata{}
	case "gcp:compute/projectMetadataItem:ProjectMetadataItem":
		r = &ProjectMetadataItem{}
	case "gcp:compute/publicAdvertisedPrefix:PublicAdvertisedPrefix":
		r = &PublicAdvertisedPrefix{}
	case "gcp:compute/publicDelegatedPrefix:PublicDelegatedPrefix":
		r = &PublicDelegatedPrefix{}
	case "gcp:compute/regionAutoscaler:RegionAutoscaler":
		r = &RegionAutoscaler{}
	case "gcp:compute/regionBackendService:RegionBackendService":
		r = &RegionBackendService{}
	case "gcp:compute/regionBackendServiceIamBinding:RegionBackendServiceIamBinding":
		r = &RegionBackendServiceIamBinding{}
	case "gcp:compute/regionBackendServiceIamMember:RegionBackendServiceIamMember":
		r = &RegionBackendServiceIamMember{}
	case "gcp:compute/regionBackendServiceIamPolicy:RegionBackendServiceIamPolicy":
		r = &RegionBackendServiceIamPolicy{}
	case "gcp:compute/regionCommitment:RegionCommitment":
		r = &RegionCommitment{}
	case "gcp:compute/regionDisk:RegionDisk":
		r = &RegionDisk{}
	case "gcp:compute/regionDiskIamBinding:RegionDiskIamBinding":
		r = &RegionDiskIamBinding{}
	case "gcp:compute/regionDiskIamMember:RegionDiskIamMember":
		r = &RegionDiskIamMember{}
	case "gcp:compute/regionDiskIamPolicy:RegionDiskIamPolicy":
		r = &RegionDiskIamPolicy{}
	case "gcp:compute/regionDiskResourcePolicyAttachment:RegionDiskResourcePolicyAttachment":
		r = &RegionDiskResourcePolicyAttachment{}
	case "gcp:compute/regionHealthCheck:RegionHealthCheck":
		r = &RegionHealthCheck{}
	case "gcp:compute/regionInstanceGroupManager:RegionInstanceGroupManager":
		r = &RegionInstanceGroupManager{}
	case "gcp:compute/regionInstanceTemplate:RegionInstanceTemplate":
		r = &RegionInstanceTemplate{}
	case "gcp:compute/regionNetworkEndpoint:RegionNetworkEndpoint":
		r = &RegionNetworkEndpoint{}
	case "gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup":
		r = &RegionNetworkEndpointGroup{}
	case "gcp:compute/regionNetworkFirewallPolicy:RegionNetworkFirewallPolicy":
		r = &RegionNetworkFirewallPolicy{}
	case "gcp:compute/regionNetworkFirewallPolicyAssociation:RegionNetworkFirewallPolicyAssociation":
		r = &RegionNetworkFirewallPolicyAssociation{}
	case "gcp:compute/regionNetworkFirewallPolicyRule:RegionNetworkFirewallPolicyRule":
		r = &RegionNetworkFirewallPolicyRule{}
	case "gcp:compute/regionNetworkFirewallPolicyWithRules:RegionNetworkFirewallPolicyWithRules":
		r = &RegionNetworkFirewallPolicyWithRules{}
	case "gcp:compute/regionPerInstanceConfig:RegionPerInstanceConfig":
		r = &RegionPerInstanceConfig{}
	case "gcp:compute/regionResizeRequest:RegionResizeRequest":
		r = &RegionResizeRequest{}
	case "gcp:compute/regionSecurityPolicy:RegionSecurityPolicy":
		r = &RegionSecurityPolicy{}
	case "gcp:compute/regionSecurityPolicyRule:RegionSecurityPolicyRule":
		r = &RegionSecurityPolicyRule{}
	case "gcp:compute/regionSslCertificate:RegionSslCertificate":
		r = &RegionSslCertificate{}
	case "gcp:compute/regionSslPolicy:RegionSslPolicy":
		r = &RegionSslPolicy{}
	case "gcp:compute/regionTargetHttpProxy:RegionTargetHttpProxy":
		r = &RegionTargetHttpProxy{}
	case "gcp:compute/regionTargetHttpsProxy:RegionTargetHttpsProxy":
		r = &RegionTargetHttpsProxy{}
	case "gcp:compute/regionTargetTcpProxy:RegionTargetTcpProxy":
		r = &RegionTargetTcpProxy{}
	case "gcp:compute/regionUrlMap:RegionUrlMap":
		r = &RegionUrlMap{}
	case "gcp:compute/reservation:Reservation":
		r = &Reservation{}
	case "gcp:compute/resizeRequest:ResizeRequest":
		r = &ResizeRequest{}
	case "gcp:compute/resourcePolicy:ResourcePolicy":
		r = &ResourcePolicy{}
	case "gcp:compute/resourcePolicyAttachment:ResourcePolicyAttachment":
		r = &ResourcePolicyAttachment{}
	case "gcp:compute/route:Route":
		r = &Route{}
	case "gcp:compute/router:Router":
		r = &Router{}
	case "gcp:compute/routerInterface:RouterInterface":
		r = &RouterInterface{}
	case "gcp:compute/routerNat:RouterNat":
		r = &RouterNat{}
	case "gcp:compute/routerNatAddress:RouterNatAddress":
		r = &RouterNatAddress{}
	case "gcp:compute/routerPeer:RouterPeer":
		r = &RouterPeer{}
	case "gcp:compute/routerRoutePolicy:RouterRoutePolicy":
		r = &RouterRoutePolicy{}
	case "gcp:compute/sSLCertificate:SSLCertificate":
		r = &SSLCertificate{}
	case "gcp:compute/sSLPolicy:SSLPolicy":
		r = &SSLPolicy{}
	case "gcp:compute/securityPolicy:SecurityPolicy":
		r = &SecurityPolicy{}
	case "gcp:compute/securityPolicyRule:SecurityPolicyRule":
		r = &SecurityPolicyRule{}
	case "gcp:compute/securityScanConfig:SecurityScanConfig":
		r = &SecurityScanConfig{}
	case "gcp:compute/serviceAttachment:ServiceAttachment":
		r = &ServiceAttachment{}
	case "gcp:compute/sharedVPCHostProject:SharedVPCHostProject":
		r = &SharedVPCHostProject{}
	case "gcp:compute/sharedVPCServiceProject:SharedVPCServiceProject":
		r = &SharedVPCServiceProject{}
	case "gcp:compute/snapshot:Snapshot":
		r = &Snapshot{}
	case "gcp:compute/snapshotIamBinding:SnapshotIamBinding":
		r = &SnapshotIamBinding{}
	case "gcp:compute/snapshotIamMember:SnapshotIamMember":
		r = &SnapshotIamMember{}
	case "gcp:compute/snapshotIamPolicy:SnapshotIamPolicy":
		r = &SnapshotIamPolicy{}
	case "gcp:compute/snapshotSettings:SnapshotSettings":
		r = &SnapshotSettings{}
	case "gcp:compute/storagePool:StoragePool":
		r = &StoragePool{}
	case "gcp:compute/storagePoolIamBinding:StoragePoolIamBinding":
		r = &StoragePoolIamBinding{}
	case "gcp:compute/storagePoolIamMember:StoragePoolIamMember":
		r = &StoragePoolIamMember{}
	case "gcp:compute/storagePoolIamPolicy:StoragePoolIamPolicy":
		r = &StoragePoolIamPolicy{}
	case "gcp:compute/subnetwork:Subnetwork":
		r = &Subnetwork{}
	case "gcp:compute/subnetworkIAMBinding:SubnetworkIAMBinding":
		r = &SubnetworkIAMBinding{}
	case "gcp:compute/subnetworkIAMMember:SubnetworkIAMMember":
		r = &SubnetworkIAMMember{}
	case "gcp:compute/subnetworkIAMPolicy:SubnetworkIAMPolicy":
		r = &SubnetworkIAMPolicy{}
	case "gcp:compute/targetGrpcProxy:TargetGrpcProxy":
		r = &TargetGrpcProxy{}
	case "gcp:compute/targetHttpProxy:TargetHttpProxy":
		r = &TargetHttpProxy{}
	case "gcp:compute/targetHttpsProxy:TargetHttpsProxy":
		r = &TargetHttpsProxy{}
	case "gcp:compute/targetInstance:TargetInstance":
		r = &TargetInstance{}
	case "gcp:compute/targetPool:TargetPool":
		r = &TargetPool{}
	case "gcp:compute/targetSSLProxy:TargetSSLProxy":
		r = &TargetSSLProxy{}
	case "gcp:compute/targetTCPProxy:TargetTCPProxy":
		r = &TargetTCPProxy{}
	case "gcp:compute/uRLMap:URLMap":
		r = &URLMap{}
	case "gcp:compute/vPNGateway:VPNGateway":
		r = &VPNGateway{}
	case "gcp:compute/vPNTunnel:VPNTunnel":
		r = &VPNTunnel{}
	case "gcp:compute/wireGroup:WireGroup":
		r = &WireGroup{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/address",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/attachedDisk",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/autoscaler",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/backendBucket",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/backendBucketIamBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/backendBucketIamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/backendBucketIamPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/backendBucketSignedUrlKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/backendService",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/backendServiceIamBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/backendServiceIamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/backendServiceIamPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/backendServiceSignedUrlKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/caExternalAccountKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/crossSiteNetwork",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/disk",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/diskAsyncReplication",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/diskIamBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/diskIamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/diskIamPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/diskResourcePolicyAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/externalVpnGateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/firewall",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/firewallPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/firewallPolicyAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/firewallPolicyRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/firewallPolicyWithRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/forwardingRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/futureReservation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/globalAddress",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/globalForwardingRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/globalNetworkEndpoint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/globalNetworkEndpointGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/haVpnGateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/healthCheck",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/httpHealthCheck",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/httpsHealthCheck",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/image",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/imageIamBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/imageIamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/imageIamPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instanceFromMachineImage",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instanceFromTemplate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instanceGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instanceGroupManager",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instanceGroupMembership",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instanceGroupNamedPort",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instanceIAMBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instanceIAMMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instanceIAMPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instanceSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instanceTemplate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instanceTemplateIamBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instanceTemplateIamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instanceTemplateIamPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instantSnapshot",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instantSnapshotIamBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instantSnapshotIamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/instantSnapshotIamPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/interconnect",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/interconnectAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/interconnectAttachmentGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/interconnectGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/machineImage",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/machineImageIamBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/machineImageIamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/machineImageIamPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/managedSslCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/mangedSslCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/network",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/networkAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/networkEdgeSecurityService",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/networkEndpoint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/networkEndpointGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/networkEndpointList",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/networkFirewallPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/networkFirewallPolicyAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/networkFirewallPolicyPacketMirroringRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/networkFirewallPolicyRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/networkFirewallPolicyWithRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/networkPeering",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/networkPeeringRoutesConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/nodeGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/nodeTemplate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/organizationSecurityPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/organizationSecurityPolicyAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/organizationSecurityPolicyRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/packetMirroring",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/perInstanceConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/projectCloudArmorTier",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/projectDefaultNetworkTier",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/projectMetadata",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/projectMetadataItem",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/publicAdvertisedPrefix",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/publicDelegatedPrefix",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionAutoscaler",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionBackendService",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionBackendServiceIamBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionBackendServiceIamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionBackendServiceIamPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionCommitment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionDisk",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionDiskIamBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionDiskIamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionDiskIamPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionDiskResourcePolicyAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionHealthCheck",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionInstanceGroupManager",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionInstanceTemplate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionNetworkEndpoint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionNetworkEndpointGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionNetworkFirewallPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionNetworkFirewallPolicyAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionNetworkFirewallPolicyRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionNetworkFirewallPolicyWithRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionPerInstanceConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionResizeRequest",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionSecurityPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionSecurityPolicyRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionSslCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionSslPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionTargetHttpProxy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionTargetHttpsProxy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionTargetTcpProxy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/regionUrlMap",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/reservation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/resizeRequest",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/resourcePolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/resourcePolicyAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/route",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/router",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/routerInterface",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/routerNat",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/routerNatAddress",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/routerPeer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/routerRoutePolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/sSLCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/sSLPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/securityPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/securityPolicyRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/securityScanConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/serviceAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/sharedVPCHostProject",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/sharedVPCServiceProject",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/snapshot",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/snapshotIamBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/snapshotIamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/snapshotIamPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/snapshotSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/storagePool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/storagePoolIamBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/storagePoolIamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/storagePoolIamPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/subnetwork",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/subnetworkIAMBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/subnetworkIAMMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/subnetworkIAMPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/targetGrpcProxy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/targetHttpProxy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/targetHttpsProxy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/targetInstance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/targetPool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/targetSSLProxy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/targetTCPProxy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/uRLMap",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/vPNGateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/vPNTunnel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"compute/wireGroup",
		&module{version},
	)
}
