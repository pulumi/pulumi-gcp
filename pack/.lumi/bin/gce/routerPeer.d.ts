import * as lumi from "@lumi/lumi";
export declare class RouterPeer extends lumi.NamedResource implements RouterPeerArgs {
    readonly advertisedRoutePriority?: number;
    readonly interface: string;
    readonly ipAddress: string;
    readonly routerPeerName?: string;
    readonly peerAsn: number;
    readonly peerIpAddress?: string;
    readonly project: string;
    readonly region: string;
    readonly router: string;
    constructor(name: string, args: RouterPeerArgs);
}
export interface RouterPeerArgs {
    readonly advertisedRoutePriority?: number;
    readonly interface: string;
    readonly routerPeerName?: string;
    readonly peerAsn: number;
    readonly peerIpAddress?: string;
    readonly project?: string;
    readonly region?: string;
    readonly router: string;
}

