import * as lumi from "@lumi/lumi";
export declare class TargetHttpsProxy extends lumi.NamedResource implements TargetHttpsProxyArgs {
    readonly description?: string;
    readonly proxyId: string;
    readonly targetHttpsProxyName?: string;
    readonly project?: string;
    readonly selfLink: string;
    readonly sslCertificates: string[];
    readonly urlMap: string;
    constructor(name: string, args: TargetHttpsProxyArgs);
}
export interface TargetHttpsProxyArgs {
    readonly description?: string;
    readonly targetHttpsProxyName?: string;
    readonly project?: string;
    readonly sslCertificates: string[];
    readonly urlMap: string;
}

