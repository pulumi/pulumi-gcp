import * as lumi from "@lumi/lumi";
export declare class RouterInterface extends lumi.NamedResource implements RouterInterfaceArgs {
    readonly ipRange?: string;
    readonly routerInterfaceName?: string;
    readonly project: string;
    readonly region: string;
    readonly router: string;
    readonly vpnTunnel: string;
    constructor(name: string, args: RouterInterfaceArgs);
}
export interface RouterInterfaceArgs {
    readonly ipRange?: string;
    readonly routerInterfaceName?: string;
    readonly project?: string;
    readonly region?: string;
    readonly router: string;
    readonly vpnTunnel: string;
}

