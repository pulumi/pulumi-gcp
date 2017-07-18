import * as lumi from "@lumi/lumi";
export declare class InstanceTemplate extends lumi.NamedResource implements InstanceTemplateArgs {
    readonly automaticRestart?: boolean;
    readonly canIpForward?: boolean;
    readonly description?: string;
    readonly disk: {
        autoDelete?: boolean;
        boot: boolean;
        deviceName?: string;
        diskName?: string;
        diskSizeGb?: number;
        diskType: string;
        interface: string;
        mode: string;
        source?: string;
        sourceImage?: string;
        type: string;
    }[];
    readonly instanceDescription?: string;
    readonly machineType: string;
    readonly metadata?: {
        [key: string]: any;
    };
    readonly metadataFingerprint: string;
    readonly metadataStartupScript?: string;
    readonly instanceTemplateName: string;
    readonly namePrefix?: string;
    readonly networkInterface?: {
        accessConfig?: {
            natIp: string;
        }[];
        network: string;
        networkIp?: string;
        subnetwork?: string;
        subnetworkProject: string;
    }[];
    readonly onHostMaintenance?: string;
    readonly project: string;
    readonly region?: string;
    readonly scheduling: {
        automaticRestart?: boolean;
        onHostMaintenance: string;
        preemptible?: boolean;
    }[];
    readonly selfLink: string;
    readonly serviceAccount?: {
        email: string;
        scopes: string[];
    }[];
    readonly tags?: string[];
    readonly tagsFingerprint: string;
    constructor(name: string, args: InstanceTemplateArgs);
}
export interface InstanceTemplateArgs {
    readonly automaticRestart?: boolean;
    readonly canIpForward?: boolean;
    readonly description?: string;
    readonly disk: {
        autoDelete?: boolean;
        boot: boolean;
        deviceName?: string;
        diskName?: string;
        diskSizeGb?: number;
        diskType: string;
        interface: string;
        mode: string;
        source?: string;
        sourceImage?: string;
        type: string;
    }[];
    readonly instanceDescription?: string;
    readonly machineType: string;
    readonly metadata?: {
        [key: string]: any;
    };
    readonly metadataStartupScript?: string;
    readonly instanceTemplateName?: string;
    readonly namePrefix?: string;
    readonly networkInterface?: {
        accessConfig?: {
            natIp: string;
        }[];
        network: string;
        networkIp?: string;
        subnetwork?: string;
        subnetworkProject: string;
    }[];
    readonly onHostMaintenance?: string;
    readonly project?: string;
    readonly region?: string;
    readonly scheduling?: {
        automaticRestart?: boolean;
        onHostMaintenance: string;
        preemptible?: boolean;
    }[];
    readonly serviceAccount?: {
        email: string;
        scopes: string[];
    }[];
    readonly tags?: string[];
}

