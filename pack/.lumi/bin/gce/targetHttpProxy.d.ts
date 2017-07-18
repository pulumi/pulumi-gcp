import * as lumi from "@lumi/lumi";
export declare class TargetHttpProxy extends lumi.NamedResource implements TargetHttpProxyArgs {
    readonly description?: string;
    readonly proxyId: string;
    readonly targetHttpProxyName?: string;
    readonly project?: string;
    readonly selfLink: string;
    readonly urlMap: string;
    constructor(name: string, args: TargetHttpProxyArgs);
}
export interface TargetHttpProxyArgs {
    readonly description?: string;
    readonly targetHttpProxyName?: string;
    readonly project?: string;
    readonly urlMap: string;
}

