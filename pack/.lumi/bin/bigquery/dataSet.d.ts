import * as lumi from "@lumi/lumi";
export declare class DataSet extends lumi.NamedResource implements DataSetArgs {
    readonly creationTime: number;
    readonly datasetId: string;
    readonly defaultTableExpirationMs?: number;
    readonly description?: string;
    readonly etag: string;
    readonly friendlyName?: string;
    readonly labels?: {
        [key: string]: string;
    };
    readonly lastModifiedTime: number;
    readonly location?: string;
    readonly project?: string;
    readonly selfLink: string;
    constructor(name: string, args: DataSetArgs);
}
export interface DataSetArgs {
    readonly datasetId: string;
    readonly defaultTableExpirationMs?: number;
    readonly description?: string;
    readonly friendlyName?: string;
    readonly labels?: {
        [key: string]: string;
    };
    readonly location?: string;
    readonly project?: string;
}

