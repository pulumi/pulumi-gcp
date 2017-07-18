import * as lumi from "@lumi/lumi";
export declare class ProjectMetadata extends lumi.NamedResource implements ProjectMetadataArgs {
    readonly metadata: {
        [key: string]: string;
    };
    readonly project?: string;
    constructor(name: string, args: ProjectMetadataArgs);
}
export interface ProjectMetadataArgs {
    readonly metadata: {
        [key: string]: string;
    };
    readonly project?: string;
}

