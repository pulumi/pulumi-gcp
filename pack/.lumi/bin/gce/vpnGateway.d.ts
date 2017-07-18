import * as lumi from "@lumi/lumi";
export declare class VpnGateway extends lumi.NamedResource implements VpnGatewayArgs {
    readonly description?: string;
    readonly vpnGatewayName?: string;
    readonly network: string;
    readonly project?: string;
    readonly region?: string;
    readonly selfLink: string;
    constructor(name: string, args: VpnGatewayArgs);
}
export interface VpnGatewayArgs {
    readonly description?: string;
    readonly vpnGatewayName?: string;
    readonly network: string;
    readonly project?: string;
    readonly region?: string;
}

