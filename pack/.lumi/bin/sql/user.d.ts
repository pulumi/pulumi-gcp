import * as lumi from "@lumi/lumi";
export declare class User extends lumi.NamedResource implements UserArgs {
    readonly host: string;
    readonly instance: string;
    readonly userName?: string;
    readonly password: string;
    readonly project?: string;
    constructor(name: string, args: UserArgs);
}
export interface UserArgs {
    readonly host: string;
    readonly instance: string;
    readonly userName?: string;
    readonly password: string;
    readonly project?: string;
}

