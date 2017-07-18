import * as lumi from "@lumi/lumi";
export declare class InstanceGroupManager extends lumi.NamedResource implements InstanceGroupManagerArgs {
    readonly baseInstanceName: string;
    readonly description?: string;
    readonly fingerprint: string;
    readonly instanceGroup: string;
    readonly instanceTemplate: string;
    readonly instanceGroupManagerName?: string;
    readonly namedPort?: {
        name: string;
        port: number;
    }[];
    readonly project: string;
    readonly selfLink: string;
    readonly targetPools?: string[];
    readonly targetSize: number;
    readonly updateStrategy?: string;
    readonly zone: string;
    constructor(name: string, args: InstanceGroupManagerArgs);
}
export interface InstanceGroupManagerArgs {
    readonly baseInstanceName: string;
    readonly description?: string;
    readonly instanceTemplate: string;
    readonly instanceGroupManagerName?: string;
    readonly namedPort?: {
        name: string;
        port: number;
    }[];
    readonly project?: string;
    readonly targetPools?: string[];
    readonly targetSize?: number;
    readonly updateStrategy?: string;
    readonly zone: string;
}

