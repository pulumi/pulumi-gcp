import * as lumi from "@lumi/lumi";
export declare class SubNetwork extends lumi.NamedResource implements SubNetworkArgs {
    readonly description?: string;
    readonly gatewayAddress: string;
    readonly ipCidrRange: string;
    readonly subNetworkName?: string;
    readonly network: string;
    readonly privateIpGoogleAccess?: boolean;
    readonly project?: string;
    readonly region?: string;
    readonly selfLink: string;
    constructor(name: string, args: SubNetworkArgs);
}
export interface SubNetworkArgs {
    readonly description?: string;
    readonly ipCidrRange: string;
    readonly subNetworkName?: string;
    readonly network: string;
    readonly privateIpGoogleAccess?: boolean;
    readonly project?: string;
    readonly region?: string;
}

