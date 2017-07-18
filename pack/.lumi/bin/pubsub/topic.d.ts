import * as lumi from "@lumi/lumi";
export declare class Topic extends lumi.NamedResource implements TopicArgs {
    readonly topicName?: string;
    readonly project?: string;
    constructor(name: string, args: TopicArgs);
}
export interface TopicArgs {
    readonly topicName?: string;
    readonly project?: string;
}

