import * as lumi from "@lumi/lumi";
export declare class UrlMap extends lumi.NamedResource implements UrlMapArgs {
    readonly defaultService: string;
    readonly description?: string;
    readonly fingerprint: string;
    readonly hostRule?: {
        description?: string;
        hosts: string[];
        pathMatcher: string;
    }[];
    readonly mapId: string;
    readonly urlMapName?: string;
    readonly pathMatcher?: {
        defaultService: string;
        description?: string;
        name: string;
        pathRule?: {
            paths: string[];
            service: string;
        }[];
    }[];
    readonly project?: string;
    readonly selfLink: string;
    readonly test?: {
        description?: string;
        host: string;
        path: string;
        service: string;
    }[];
    constructor(name: string, args: UrlMapArgs);
}
export interface UrlMapArgs {
    readonly defaultService: string;
    readonly description?: string;
    readonly hostRule?: {
        description?: string;
        hosts: string[];
        pathMatcher: string;
    }[];
    readonly urlMapName?: string;
    readonly pathMatcher?: {
        defaultService: string;
        description?: string;
        name: string;
        pathRule?: {
            paths: string[];
            service: string;
        }[];
    }[];
    readonly project?: string;
    readonly test?: {
        description?: string;
        host: string;
        path: string;
        service: string;
    }[];
}

