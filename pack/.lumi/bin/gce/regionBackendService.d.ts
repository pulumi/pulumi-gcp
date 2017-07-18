import * as lumi from "@lumi/lumi";
export declare class RegionBackendService extends lumi.NamedResource implements RegionBackendServiceArgs {
    readonly backend?: {
        description?: string;
        group?: string;
    }[];
    readonly connectionDrainingTimeoutSec?: number;
    readonly description?: string;
    readonly fingerprint: string;
    readonly healthChecks: string[];
    readonly regionBackendServiceName?: string;
    readonly project?: string;
    readonly protocol: string;
    readonly region?: string;
    readonly selfLink: string;
    readonly sessionAffinity: string;
    readonly timeoutSec: number;
    constructor(name: string, args: RegionBackendServiceArgs);
}
export interface RegionBackendServiceArgs {
    readonly backend?: {
        description?: string;
        group?: string;
    }[];
    readonly connectionDrainingTimeoutSec?: number;
    readonly description?: string;
    readonly healthChecks: string[];
    readonly regionBackendServiceName?: string;
    readonly project?: string;
    readonly protocol?: string;
    readonly region?: string;
    readonly sessionAffinity?: string;
    readonly timeoutSec?: number;
}

