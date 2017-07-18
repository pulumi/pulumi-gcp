import * as lumi from "@lumi/lumi";
export declare class Snapshot extends lumi.NamedResource implements SnapshotArgs {
    readonly snapshotName?: string;
    readonly project?: string;
    readonly selfLink: string;
    readonly snapshotEncryptionKeyRaw?: string;
    readonly snapshotEncryptionKeySha256: string;
    readonly sourceDisk: string;
    readonly sourceDiskEncryptionKeyRaw?: string;
    readonly sourceDiskEncryptionKeySha256: string;
    readonly sourceDiskLink: string;
    readonly zone: string;
    constructor(name: string, args: SnapshotArgs);
}
export interface SnapshotArgs {
    readonly snapshotName?: string;
    readonly project?: string;
    readonly snapshotEncryptionKeyRaw?: string;
    readonly sourceDisk: string;
    readonly sourceDiskEncryptionKeyRaw?: string;
    readonly zone: string;
}

