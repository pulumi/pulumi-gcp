import * as lumi from "@lumi/lumi";
export declare class AutoScaler extends lumi.NamedResource implements AutoScalerArgs {
    readonly autoscalingPolicy?: {
        cooldownPeriod?: number;
        cpuUtilization?: {
            target: number;
        }[];
        loadBalancingUtilization?: {
            target: number;
        }[];
        maxReplicas: number;
        metric?: {
            name: string;
            target: number;
            type: string;
        }[];
        minReplicas: number;
    }[];
    readonly description?: string;
    readonly autoScalerName?: string;
    readonly project?: string;
    readonly selfLink: string;
    readonly target: string;
    readonly zone: string;
    constructor(name: string, args: AutoScalerArgs);
}
export interface AutoScalerArgs {
    readonly autoscalingPolicy?: {
        cooldownPeriod?: number;
        cpuUtilization?: {
            target: number;
        }[];
        loadBalancingUtilization?: {
            target: number;
        }[];
        maxReplicas: number;
        metric?: {
            name: string;
            target: number;
            type: string;
        }[];
        minReplicas: number;
    }[];
    readonly description?: string;
    readonly autoScalerName?: string;
    readonly project?: string;
    readonly target: string;
    readonly zone: string;
}

