import * as lumi from "@lumi/lumi";
export declare class Router extends lumi.NamedResource implements RouterArgs {
    readonly bgp: {
        asn: number;
    }[];
    readonly description?: string;
    readonly routerName?: string;
    readonly network: string;
    readonly project: string;
    readonly region: string;
    readonly selfLink: string;
    constructor(name: string, args: RouterArgs);
}
export interface RouterArgs {
    readonly bgp: {
        asn: number;
    }[];
    readonly description?: string;
    readonly routerName?: string;
    readonly network: string;
    readonly project?: string;
    readonly region?: string;
}

