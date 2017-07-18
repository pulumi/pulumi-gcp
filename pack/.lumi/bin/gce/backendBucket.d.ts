import * as lumi from "@lumi/lumi";
export declare class BackendBucket extends lumi.NamedResource implements BackendBucketArgs {
    readonly bucketName: string;
    readonly description?: string;
    readonly enableCdn?: boolean;
    readonly backendBucketName?: string;
    readonly project?: string;
    readonly selfLink: string;
    constructor(name: string, args: BackendBucketArgs);
}
export interface BackendBucketArgs {
    readonly bucketName: string;
    readonly description?: string;
    readonly enableCdn?: boolean;
    readonly backendBucketName?: string;
    readonly project?: string;
}

