import * as lumi from "@lumi/lumi";
export declare class RecordSet extends lumi.NamedResource implements RecordSetArgs {
    readonly managedZone: string;
    readonly recordSetName?: string;
    readonly project?: string;
    readonly rrdatas: string[];
    readonly ttl: number;
    readonly type: string;
    constructor(name: string, args: RecordSetArgs);
}
export interface RecordSetArgs {
    readonly managedZone: string;
    readonly recordSetName?: string;
    readonly project?: string;
    readonly rrdatas: string[];
    readonly ttl: number;
    readonly type: string;
}

