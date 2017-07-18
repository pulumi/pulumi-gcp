import * as lumi from "@lumi/lumi";
export declare class ManagedZone extends lumi.NamedResource implements ManagedZoneArgs {
    readonly description?: string;
    readonly dnsName: string;
    readonly managedZoneName?: string;
    readonly nameServers: string[];
    readonly project?: string;
    constructor(name: string, args: ManagedZoneArgs);
}
export interface ManagedZoneArgs {
    readonly description?: string;
    readonly dnsName: string;
    readonly managedZoneName?: string;
    readonly project?: string;
}

