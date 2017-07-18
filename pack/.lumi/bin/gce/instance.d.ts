import * as lumi from "@lumi/lumi";
export declare class Instance extends lumi.NamedResource implements InstanceArgs {
    readonly attachedDisk?: {
        deviceName: string;
        diskEncryptionKeyRaw?: string;
        diskEncryptionKeySha256: string;
        source: string;
    }[];
    readonly bootDisk?: {
        autoDelete?: boolean;
        deviceName: string;
        diskEncryptionKeyRaw?: string;
        diskEncryptionKeySha256: string;
        initializeParams?: {
            image?: string;
            size?: number;
            type?: string;
        }[];
        source: string;
    }[];
    readonly canIpForward?: boolean;
    readonly createTimeout?: number;
    readonly description?: string;
    readonly disk?: {
        autoDelete?: boolean;
        deviceName?: string;
        disk?: string;
        diskEncryptionKeyRaw?: string;
        diskEncryptionKeySha256: string;
        image?: string;
        scratch?: boolean;
        size?: number;
        type?: string;
    }[];
    readonly labelFingerprint: string;
    readonly labels?: {
        [key: string]: string;
    };
    readonly machineType: string;
    readonly metadata?: {
        [key: string]: string;
    };
    readonly metadataFingerprint: string;
    readonly metadataStartupScript?: string;
    readonly instanceName?: string;
    readonly network?: {
        address?: string;
        externalAddress: string;
        internalAddress: string;
        name: string;
        source: string;
    }[];
    readonly networkInterface?: {
        accessConfig?: {
            assignedNatIp: string;
            natIp?: string;
        }[];
        address: string;
        name: string;
        network?: string;
        subnetwork?: string;
        subnetworkProject?: string;
    }[];
    readonly project?: string;
    readonly scheduling?: {
        automaticRestart?: boolean;
        onHostMaintenance?: string;
        preemptible?: boolean;
    }[];
    readonly scratchDisk?: {
        interface?: string;
    }[];
    readonly selfLink: string;
    readonly serviceAccount?: {
        email: string;
        scopes: string[];
    }[];
    readonly tags?: string[];
    readonly tagsFingerprint: string;
    readonly zone: string;
    constructor(name: string, args: InstanceArgs);
}
export interface InstanceArgs {
    readonly attachedDisk?: {
        deviceName: string;
        diskEncryptionKeyRaw?: string;
        diskEncryptionKeySha256: string;
        source: string;
    }[];
    readonly bootDisk?: {
        autoDelete?: boolean;
        deviceName: string;
        diskEncryptionKeyRaw?: string;
        diskEncryptionKeySha256: string;
        initializeParams?: {
            image?: string;
            size?: number;
            type?: string;
        }[];
        source: string;
    }[];
    readonly canIpForward?: boolean;
    readonly createTimeout?: number;
    readonly description?: string;
    readonly disk?: {
        autoDelete?: boolean;
        deviceName?: string;
        disk?: string;
        diskEncryptionKeyRaw?: string;
        diskEncryptionKeySha256: string;
        image?: string;
        scratch?: boolean;
        size?: number;
        type?: string;
    }[];
    readonly labels?: {
        [key: string]: string;
    };
    readonly machineType: string;
    readonly metadata?: {
        [key: string]: string;
    };
    readonly metadataStartupScript?: string;
    readonly instanceName?: string;
    readonly network?: {
        address?: string;
        externalAddress: string;
        internalAddress: string;
        name: string;
        source: string;
    }[];
    readonly networkInterface?: {
        accessConfig?: {
            assignedNatIp: string;
            natIp?: string;
        }[];
        address: string;
        name: string;
        network?: string;
        subnetwork?: string;
        subnetworkProject?: string;
    }[];
    readonly project?: string;
    readonly scheduling?: {
        automaticRestart?: boolean;
        onHostMaintenance?: string;
        preemptible?: boolean;
    }[];
    readonly scratchDisk?: {
        interface?: string;
    }[];
    readonly serviceAccount?: {
        email: string;
        scopes: string[];
    }[];
    readonly tags?: string[];
    readonly zone: string;
}

