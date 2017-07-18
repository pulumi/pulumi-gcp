import * as lumi from "@lumi/lumi";
export declare class ServiceAccount extends lumi.NamedResource implements ServiceAccountArgs {
    readonly accountId: string;
    readonly displayName?: string;
    readonly email: string;
    readonly serviceAccountName: string;
    readonly policyData?: string;
    readonly project?: string;
    readonly uniqueId: string;
    constructor(name: string, args: ServiceAccountArgs);
}
export interface ServiceAccountArgs {
    readonly accountId: string;
    readonly displayName?: string;
    readonly policyData?: string;
    readonly project?: string;
}

