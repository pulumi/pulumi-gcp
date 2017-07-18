import * as lumi from "@lumi/lumi";
export declare class Firewall extends lumi.NamedResource implements FirewallArgs {
    readonly allow: {
        ports?: string[];
        protocol: string;
    }[];
    readonly description?: string;
    readonly firewallName?: string;
    readonly network: string;
    readonly project: string;
    readonly selfLink: string;
    readonly sourceRanges: string[];
    readonly sourceTags?: string[];
    readonly targetTags?: string[];
    constructor(name: string, args: FirewallArgs);
}
export interface FirewallArgs {
    readonly allow: {
        ports?: string[];
        protocol: string;
    }[];
    readonly description?: string;
    readonly firewallName?: string;
    readonly network: string;
    readonly project?: string;
    readonly sourceRanges?: string[];
    readonly sourceTags?: string[];
    readonly targetTags?: string[];
}

