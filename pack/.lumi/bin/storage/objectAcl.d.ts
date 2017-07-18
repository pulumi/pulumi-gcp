import * as lumi from "@lumi/lumi";
export declare class ObjectAcl extends lumi.NamedResource implements ObjectAclArgs {
    readonly bucket: string;
    readonly object: string;
    readonly predefinedAcl?: string;
    readonly roleEntity?: string[];
    constructor(name: string, args: ObjectAclArgs);
}
export interface ObjectAclArgs {
    readonly bucket: string;
    readonly object: string;
    readonly predefinedAcl?: string;
    readonly roleEntity?: string[];
}

