import * as lumi from "@lumi/lumi";
export declare class Table extends lumi.NamedResource implements TableArgs {
    readonly instanceName: string;
    readonly tableName?: string;
    readonly project?: string;
    readonly splitKeys?: string[];
    constructor(name: string, args: TableArgs);
}
export interface TableArgs {
    readonly instanceName: string;
    readonly tableName?: string;
    readonly project?: string;
    readonly splitKeys?: string[];
}

