import * as lumi from "@lumi/lumi";
export declare class Database extends lumi.NamedResource implements DatabaseArgs {
    readonly instance: string;
    readonly databaseName?: string;
    readonly project?: string;
    readonly selfLink: string;
    constructor(name: string, args: DatabaseArgs);
}
export interface DatabaseArgs {
    readonly instance: string;
    readonly databaseName?: string;
    readonly project?: string;
}

