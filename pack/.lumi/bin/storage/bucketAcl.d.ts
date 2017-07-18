import * as lumi from "@lumi/lumi";
export declare class BucketAcl extends lumi.NamedResource implements BucketAclArgs {
    readonly bucket: string;
    readonly defaultAcl?: string;
    readonly predefinedAcl?: string;
    readonly roleEntity?: string[];
    constructor(name: string, args: BucketAclArgs);
}
export interface BucketAclArgs {
    readonly bucket: string;
    readonly defaultAcl?: string;
    readonly predefinedAcl?: string;
    readonly roleEntity?: string[];
}

