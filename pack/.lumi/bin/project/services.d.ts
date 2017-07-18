import * as lumi from "@lumi/lumi";
export declare class Services extends lumi.NamedResource implements ServicesArgs {
    readonly project: string;
    readonly services: string[];
    constructor(name: string, args: ServicesArgs);
}
export interface ServicesArgs {
    readonly project: string;
    readonly services: string[];
}

