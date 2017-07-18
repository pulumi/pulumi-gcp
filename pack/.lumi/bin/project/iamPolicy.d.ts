import * as lumi from "@lumi/lumi";
export declare class IamPolicy extends lumi.NamedResource implements IamPolicyArgs {
    readonly authoritative?: boolean;
    readonly disableProject?: boolean;
    readonly etag: string;
    readonly policyData: string;
    readonly project: string;
    readonly restorePolicy: string;
    constructor(name: string, args: IamPolicyArgs);
}
export interface IamPolicyArgs {
    readonly authoritative?: boolean;
    readonly disableProject?: boolean;
    readonly policyData: string;
    readonly project: string;
}

