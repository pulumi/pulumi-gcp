import * as lumi from "@lumi/lumi";
export declare class BackendService extends lumi.NamedResource implements BackendServiceArgs {
    readonly backend?: {
        balancingMode?: string;
        capacityScaler?: number;
        description?: string;
        group?: string;
        maxRate?: number;
        maxRatePerInstance?: number;
        maxUtilization?: number;
    }[];
    readonly connectionDrainingTimeoutSec?: number;
    readonly description?: string;
    readonly enableCdn?: boolean;
    readonly fingerprint: string;
    readonly healthChecks: string[];
    readonly backendServiceName?: string;
    readonly portName: string;
    readonly project?: string;
    readonly protocol: string;
    readonly selfLink: string;
    readonly sessionAffinity: string;
    readonly timeoutSec: number;
    constructor(name: string, args: BackendServiceArgs);
}
export interface BackendServiceArgs {
    readonly backend?: {
        balancingMode?: string;
        capacityScaler?: number;
        description?: string;
        group?: string;
        maxRate?: number;
        maxRatePerInstance?: number;
        maxUtilization?: number;
    }[];
    readonly connectionDrainingTimeoutSec?: number;
    readonly description?: string;
    readonly enableCdn?: boolean;
    readonly healthChecks: string[];
    readonly backendServiceName?: string;
    readonly portName?: string;
    readonly project?: string;
    readonly protocol?: string;
    readonly sessionAffinity?: string;
    readonly timeoutSec?: number;
}

