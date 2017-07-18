import * as lumi from "@lumi/lumi";
export declare class Cluster extends lumi.NamedResource implements ClusterArgs {
    readonly additionalZones: string[];
    readonly addonsConfig?: {
        horizontalPodAutoscaling?: {
            disabled?: boolean;
        }[];
        httpLoadBalancing?: {
            disabled?: boolean;
        }[];
    }[];
    readonly clusterIpv4Cidr: string;
    readonly description?: string;
    readonly endpoint: string;
    readonly initialNodeCount?: number;
    readonly instanceGroupUrls: string[];
    readonly loggingService: string;
    readonly masterAuth: {
        clientCertificate: string;
        clientKey: string;
        clusterCaCertificate: string;
        password: string;
        username: string;
    }[];
    readonly monitoringService: string;
    readonly clusterName?: string;
    readonly network?: string;
    readonly nodeConfig: {
        diskSizeGb: number;
        imageType: string;
        labels?: {
            [key: string]: string;
        };
        localSsdCount: number;
        machineType: string;
        metadata?: {
            [key: string]: string;
        };
        oauthScopes: string[];
        serviceAccount: string;
        tags?: string[];
    }[];
    readonly nodePool: {
        initialNodeCount: number;
        name: string;
        namePrefix?: string;
    }[];
    readonly nodeVersion: string;
    readonly project?: string;
    readonly subnetwork?: string;
    readonly zone: string;
    constructor(name: string, args: ClusterArgs);
}
export interface ClusterArgs {
    readonly additionalZones?: string[];
    readonly addonsConfig?: {
        horizontalPodAutoscaling?: {
            disabled?: boolean;
        }[];
        httpLoadBalancing?: {
            disabled?: boolean;
        }[];
    }[];
    readonly clusterIpv4Cidr?: string;
    readonly description?: string;
    readonly initialNodeCount?: number;
    readonly loggingService?: string;
    readonly masterAuth?: {
        clientCertificate: string;
        clientKey: string;
        clusterCaCertificate: string;
        password: string;
        username: string;
    }[];
    readonly monitoringService?: string;
    readonly clusterName?: string;
    readonly network?: string;
    readonly nodeConfig?: {
        diskSizeGb: number;
        imageType: string;
        labels?: {
            [key: string]: string;
        };
        localSsdCount: number;
        machineType: string;
        metadata?: {
            [key: string]: string;
        };
        oauthScopes: string[];
        serviceAccount: string;
        tags?: string[];
    }[];
    readonly nodePool?: {
        initialNodeCount: number;
        name: string;
        namePrefix?: string;
    }[];
    readonly nodeVersion?: string;
    readonly project?: string;
    readonly subnetwork?: string;
    readonly zone: string;
}

