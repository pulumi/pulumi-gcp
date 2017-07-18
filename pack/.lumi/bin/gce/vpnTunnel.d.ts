import * as lumi from "@lumi/lumi";
export declare class VpnTunnel extends lumi.NamedResource implements VpnTunnelArgs {
    readonly description?: string;
    readonly detailedStatus: string;
    readonly ikeVersion?: number;
    readonly localTrafficSelector: string[];
    readonly vpnTunnelName?: string;
    readonly peerIp: string;
    readonly project?: string;
    readonly region?: string;
    readonly remoteTrafficSelector: string[];
    readonly router?: string;
    readonly selfLink: string;
    readonly sharedSecret: string;
    readonly targetVpnGateway: string;
    constructor(name: string, args: VpnTunnelArgs);
}
export interface VpnTunnelArgs {
    readonly description?: string;
    readonly ikeVersion?: number;
    readonly localTrafficSelector?: string[];
    readonly vpnTunnelName?: string;
    readonly peerIp: string;
    readonly project?: string;
    readonly region?: string;
    readonly remoteTrafficSelector?: string[];
    readonly router?: string;
    readonly sharedSecret: string;
    readonly targetVpnGateway: string;
}

