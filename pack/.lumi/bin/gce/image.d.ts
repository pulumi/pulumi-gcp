import * as lumi from "@lumi/lumi";
export declare class Image extends lumi.NamedResource implements ImageArgs {
    readonly createTimeout?: number;
    readonly description: string;
    readonly family?: string;
    readonly imageName?: string;
    readonly project?: string;
    readonly rawDisk?: {
        containerType?: string;
        sha1?: string;
        source: string;
    }[];
    readonly selfLink: string;
    readonly sourceDisk?: string;
    constructor(name: string, args: ImageArgs);
}
export interface ImageArgs {
    readonly createTimeout?: number;
    readonly family?: string;
    readonly imageName?: string;
    readonly project?: string;
    readonly rawDisk?: {
        containerType?: string;
        sha1?: string;
        source: string;
    }[];
    readonly sourceDisk?: string;
}

