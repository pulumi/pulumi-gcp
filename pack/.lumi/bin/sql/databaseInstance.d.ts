import * as lumi from "@lumi/lumi";
export declare class DatabaseInstance extends lumi.NamedResource implements DatabaseInstanceArgs {
    readonly databaseVersion?: string;
    readonly ipAddress: {
        ipAddress: string;
        timeToRetire: string;
    }[];
    readonly masterInstanceName: string;
    readonly databaseInstanceName: string;
    readonly project?: string;
    readonly region: string;
    readonly replicaConfiguration?: {
        caCertificate?: string;
        clientCertificate?: string;
        clientKey?: string;
        connectRetryInterval?: number;
        dumpFilePath?: string;
        failoverTarget?: boolean;
        masterHeartbeatPeriod?: number;
        password?: string;
        sslCipher?: string;
        username?: string;
        verifyServerCertificate?: boolean;
    }[];
    readonly selfLink: string;
    readonly settings: {
        activationPolicy?: string;
        authorizedGaeApplications?: string[];
        backupConfiguration?: {
            binaryLogEnabled?: boolean;
            enabled?: boolean;
            startTime?: string;
        }[];
        crashSafeReplication: boolean;
        databaseFlags?: {
            name?: string;
            value?: string;
        }[];
        diskAutoresize?: boolean;
        diskSize?: number;
        diskType?: string;
        ipConfiguration?: {
            authorizedNetworks?: {
                expirationTime?: string;
                name?: string;
                value?: string;
            }[];
            ipv4Enabled?: boolean;
            requireSsl?: boolean;
        }[];
        locationPreference?: {
            followGaeApplication?: string;
            zone?: string;
        }[];
        maintenanceWindow?: {
            day?: number;
            hour?: number;
            updateTrack?: string;
        }[];
        pricingPlan?: string;
        replicationType?: string;
        tier: string;
        version: number;
    }[];
    constructor(name: string, args: DatabaseInstanceArgs);
}
export interface DatabaseInstanceArgs {
    readonly databaseVersion?: string;
    readonly masterInstanceName?: string;
    readonly databaseInstanceName?: string;
    readonly project?: string;
    readonly region: string;
    readonly replicaConfiguration?: {
        caCertificate?: string;
        clientCertificate?: string;
        clientKey?: string;
        connectRetryInterval?: number;
        dumpFilePath?: string;
        failoverTarget?: boolean;
        masterHeartbeatPeriod?: number;
        password?: string;
        sslCipher?: string;
        username?: string;
        verifyServerCertificate?: boolean;
    }[];
    readonly settings: {
        activationPolicy?: string;
        authorizedGaeApplications?: string[];
        backupConfiguration?: {
            binaryLogEnabled?: boolean;
            enabled?: boolean;
            startTime?: string;
        }[];
        crashSafeReplication: boolean;
        databaseFlags?: {
            name?: string;
            value?: string;
        }[];
        diskAutoresize?: boolean;
        diskSize?: number;
        diskType?: string;
        ipConfiguration?: {
            authorizedNetworks?: {
                expirationTime?: string;
                name?: string;
                value?: string;
            }[];
            ipv4Enabled?: boolean;
            requireSsl?: boolean;
        }[];
        locationPreference?: {
            followGaeApplication?: string;
            zone?: string;
        }[];
        maintenanceWindow?: {
            day?: number;
            hour?: number;
            updateTrack?: string;
        }[];
        pricingPlan?: string;
        replicationType?: string;
        tier: string;
        version: number;
    }[];
}

