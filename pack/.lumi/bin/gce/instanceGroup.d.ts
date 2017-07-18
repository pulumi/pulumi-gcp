import * as lumi from "@lumi/lumi";
export declare class InstanceGroup extends lumi.NamedResource implements InstanceGroupArgs {
    readonly description?: string;
    readonly instances: string[];
    readonly instanceGroupName?: string;
    readonly namedPort?: {
        name: string;
        port: number;
    }[];
    readonly network: string;
    readonly project?: string;
    readonly selfLink: string;
    readonly size: number;
    readonly zone: string;
    constructor(name: string, args: InstanceGroupArgs);
}
export interface InstanceGroupArgs {
    readonly description?: string;
    readonly instances?: string[];
    readonly instanceGroupName?: string;
    readonly namedPort?: {
        name: string;
        port: number;
    }[];
    readonly network?: string;
    readonly project?: string;
    readonly zone: string;
}

