import * as lumi from "@lumi/lumi";
export declare class Object extends lumi.NamedResource implements ObjectArgs {
    readonly bucket: string;
    readonly cacheControl?: string;
    readonly content?: string;
    readonly contentDisposition?: string;
    readonly contentEncoding?: string;
    readonly contentLanguage?: string;
    readonly contentType: string;
    readonly crc32c: string;
    readonly md5hash: string;
    readonly objectName?: string;
    readonly predefinedAcl?: string;
    readonly source?: string;
    readonly storageClass: string;
    constructor(name: string, args: ObjectArgs);
}
export interface ObjectArgs {
    readonly bucket: string;
    readonly cacheControl?: string;
    readonly content?: string;
    readonly contentDisposition?: string;
    readonly contentEncoding?: string;
    readonly contentLanguage?: string;
    readonly contentType?: string;
    readonly objectName?: string;
    readonly predefinedAcl?: string;
    readonly source?: string;
    readonly storageClass?: string;
}

