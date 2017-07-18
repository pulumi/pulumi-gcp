import * as lumi from "@lumi/lumi";
export declare class ForwardingRule extends lumi.NamedResource implements ForwardingRuleArgs {
    readonly backendService?: string;
    readonly description?: string;
    readonly ipAddress: string;
    readonly ipProtocol: string;
    readonly loadBalancingScheme?: string;
    readonly forwardingRuleName?: string;
    readonly network: string;
    readonly portRange?: string;
    readonly ports?: string[];
    readonly project: string;
    readonly region: string;
    readonly selfLink: string;
    readonly subnetwork: string;
    readonly target?: string;
    constructor(name: string, args: ForwardingRuleArgs);
}
export interface ForwardingRuleArgs {
    readonly backendService?: string;
    readonly description?: string;
    readonly ipAddress?: string;
    readonly ipProtocol?: string;
    readonly loadBalancingScheme?: string;
    readonly forwardingRuleName?: string;
    readonly network?: string;
    readonly portRange?: string;
    readonly ports?: string[];
    readonly project?: string;
    readonly region?: string;
    readonly subnetwork?: string;
    readonly target?: string;
}

