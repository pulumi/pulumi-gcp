import * as lumi from "@lumi/lumi";
export declare class Network extends lumi.NamedResource implements NetworkArgs {
    readonly autoCreateSubnetworks?: boolean;
    readonly description?: string;
    readonly gatewayIpv4: string;
    readonly ipv4Range?: string;
    readonly networkName?: string;
    readonly project?: string;
    readonly selfLink: string;
    constructor(name: string, args: NetworkArgs);
}
export interface NetworkArgs {
    readonly autoCreateSubnetworks?: boolean;
    readonly description?: string;
    readonly ipv4Range?: string;
    readonly networkName?: string;
    readonly project?: string;
}

