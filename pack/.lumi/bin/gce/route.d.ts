import * as lumi from "@lumi/lumi";
export declare class Route extends lumi.NamedResource implements RouteArgs {
    readonly destRange: string;
    readonly routeName?: string;
    readonly network: string;
    readonly nextHopGateway?: string;
    readonly nextHopInstance?: string;
    readonly nextHopInstanceZone?: string;
    readonly nextHopIp?: string;
    readonly nextHopNetwork: string;
    readonly nextHopVpnTunnel?: string;
    readonly priority: number;
    readonly project?: string;
    readonly selfLink: string;
    readonly tags?: string[];
    constructor(name: string, args: RouteArgs);
}
export interface RouteArgs {
    readonly destRange: string;
    readonly routeName?: string;
    readonly network: string;
    readonly nextHopGateway?: string;
    readonly nextHopInstance?: string;
    readonly nextHopInstanceZone?: string;
    readonly nextHopIp?: string;
    readonly nextHopVpnTunnel?: string;
    readonly priority: number;
    readonly project?: string;
    readonly tags?: string[];
}

