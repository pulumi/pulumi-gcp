import * as lumi from "@lumi/lumi";
export declare class GlobalForwardingRule extends lumi.NamedResource implements GlobalForwardingRuleArgs {
    readonly description?: string;
    readonly ipAddress: string;
    readonly ipProtocol: string;
    readonly globalForwardingRuleName?: string;
    readonly portRange?: string;
    readonly project?: string;
    readonly region?: string;
    readonly selfLink: string;
    readonly target: string;
    constructor(name: string, args: GlobalForwardingRuleArgs);
}
export interface GlobalForwardingRuleArgs {
    readonly description?: string;
    readonly ipAddress?: string;
    readonly ipProtocol?: string;
    readonly globalForwardingRuleName?: string;
    readonly portRange?: string;
    readonly project?: string;
    readonly region?: string;
    readonly target: string;
}

