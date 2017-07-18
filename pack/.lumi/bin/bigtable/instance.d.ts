import * as lumi from "@lumi/lumi";
export declare class Instance extends lumi.NamedResource implements InstanceArgs {
    readonly clusterId: string;
    readonly displayName: string;
    readonly instanceName?: string;
    readonly numNodes?: number;
    readonly project?: string;
    readonly storageType?: string;
    readonly zone: string;
    constructor(name: string, args: InstanceArgs);
}
export interface InstanceArgs {
    readonly clusterId: string;
    readonly displayName?: string;
    readonly instanceName?: string;
    readonly numNodes?: number;
    readonly project?: string;
    readonly storageType?: string;
    readonly zone: string;
}

