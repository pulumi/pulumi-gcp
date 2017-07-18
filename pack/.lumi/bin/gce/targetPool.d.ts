import * as lumi from "@lumi/lumi";
export declare class TargetPool extends lumi.NamedResource implements TargetPoolArgs {
    readonly backupPool?: string;
    readonly description?: string;
    readonly failoverRatio?: number;
    readonly healthChecks?: string[];
    readonly instances: string[];
    readonly targetPoolName?: string;
    readonly project: string;
    readonly region: string;
    readonly selfLink: string;
    readonly sessionAffinity?: string;
    constructor(name: string, args: TargetPoolArgs);
}
export interface TargetPoolArgs {
    readonly backupPool?: string;
    readonly description?: string;
    readonly failoverRatio?: number;
    readonly healthChecks?: string[];
    readonly instances?: string[];
    readonly targetPoolName?: string;
    readonly project?: string;
    readonly region?: string;
    readonly sessionAffinity?: string;
}

