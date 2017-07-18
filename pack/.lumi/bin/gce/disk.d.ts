import * as lumi from "@lumi/lumi";
export declare class Disk extends lumi.NamedResource implements DiskArgs {
    readonly diskEncryptionKeyRaw?: string;
    readonly diskEncryptionKeySha256: string;
    readonly image?: string;
    readonly diskName?: string;
    readonly project?: string;
    readonly selfLink: string;
    readonly size: number;
    readonly snapshot?: string;
    readonly type?: string;
    readonly users: string[];
    readonly zone: string;
    constructor(name: string, args: DiskArgs);
}
export interface DiskArgs {
    readonly diskEncryptionKeyRaw?: string;
    readonly image?: string;
    readonly diskName?: string;
    readonly project?: string;
    readonly size?: number;
    readonly snapshot?: string;
    readonly type?: string;
    readonly zone: string;
}

