import * as lumi from "@lumi/lumi";
export declare class Bucket extends lumi.NamedResource implements BucketArgs {
    readonly cors?: {
        maxAgeSeconds?: number;
        method?: string[];
        origin?: string[];
        responseHeader?: string[];
    }[];
    readonly forceDestroy?: boolean;
    readonly location?: string;
    readonly bucketName?: string;
    readonly predefinedAcl?: string;
    readonly project?: string;
    readonly selfLink: string;
    readonly storageClass?: string;
    readonly url: string;
    readonly website?: {
        mainPageSuffix?: string;
        notFoundPage?: string;
    }[];
    constructor(name: string, args: BucketArgs);
}
export interface BucketArgs {
    readonly cors?: {
        maxAgeSeconds?: number;
        method?: string[];
        origin?: string[];
        responseHeader?: string[];
    }[];
    readonly forceDestroy?: boolean;
    readonly location?: string;
    readonly bucketName?: string;
    readonly predefinedAcl?: string;
    readonly project?: string;
    readonly storageClass?: string;
    readonly website?: {
        mainPageSuffix?: string;
        notFoundPage?: string;
    }[];
}

