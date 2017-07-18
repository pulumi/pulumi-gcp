import * as lumi from "@lumi/lumi";
export declare class Project extends lumi.NamedResource implements ProjectArgs {
    readonly billingAccount?: string;
    readonly projectName?: string;
    readonly number: string;
    readonly orgId: string;
    readonly projectId: string;
    readonly skipDelete: boolean;
    constructor(name: string, args: ProjectArgs);
}
export interface ProjectArgs {
    readonly billingAccount?: string;
    readonly projectName?: string;
    readonly orgId: string;
    readonly projectId: string;
    readonly skipDelete?: boolean;
}

