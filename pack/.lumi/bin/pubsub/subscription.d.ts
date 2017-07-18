import * as lumi from "@lumi/lumi";
export declare class Subscription extends lumi.NamedResource implements SubscriptionArgs {
    readonly ackDeadlineSeconds?: number;
    readonly subscriptionName?: string;
    readonly path: string;
    readonly project?: string;
    readonly pushConfig?: {
        attributes?: {
            [key: string]: string;
        };
        pushEndpoint?: string;
    }[];
    readonly topic: string;
    constructor(name: string, args: SubscriptionArgs);
}
export interface SubscriptionArgs {
    readonly ackDeadlineSeconds?: number;
    readonly subscriptionName?: string;
    readonly project?: string;
    readonly pushConfig?: {
        attributes?: {
            [key: string]: string;
        };
        pushEndpoint?: string;
    }[];
    readonly topic: string;
}

