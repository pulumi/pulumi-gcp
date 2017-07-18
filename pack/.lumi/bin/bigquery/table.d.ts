import * as lumi from "@lumi/lumi";
export declare class Table extends lumi.NamedResource implements TableArgs {
    readonly creationTime: number;
    readonly datasetId: string;
    readonly description?: string;
    readonly etag: string;
    readonly expirationTime: number;
    readonly friendlyName?: string;
    readonly labels?: {
        [key: string]: string;
    };
    readonly lastModifiedTime: number;
    readonly location: string;
    readonly numBytes: number;
    readonly numLongTermBytes: number;
    readonly numRows: number;
    readonly project?: string;
    readonly schema: string;
    readonly selfLink: string;
    readonly tableId: string;
    readonly timePartitioning?: {
        expirationMs?: number;
        type: string;
    }[];
    readonly type: string;
    constructor(name: string, args: TableArgs);
}
export interface TableArgs {
    readonly datasetId: string;
    readonly description?: string;
    readonly expirationTime?: number;
    readonly friendlyName?: string;
    readonly labels?: {
        [key: string]: string;
    };
    readonly project?: string;
    readonly schema?: string;
    readonly tableId: string;
    readonly timePartitioning?: {
        expirationMs?: number;
        type: string;
    }[];
}

