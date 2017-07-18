import * as lumi from "@lumi/lumi";
export declare class NodePool extends lumi.NamedResource implements NodePoolArgs {
    readonly cluster: string;
    readonly initialNodeCount: number;
    readonly nodePoolName: string;
    readonly namePrefix?: string;
    readonly project?: string;
    readonly zone: string;
    constructor(name: string, args: NodePoolArgs);
}
export interface NodePoolArgs {
    readonly cluster: string;
    readonly initialNodeCount: number;
    readonly nodePoolName?: string;
    readonly namePrefix?: string;
    readonly project?: string;
    readonly zone: string;
}

