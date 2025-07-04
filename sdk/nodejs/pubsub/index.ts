// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { GetSchemaIamPolicyArgs, GetSchemaIamPolicyResult, GetSchemaIamPolicyOutputArgs } from "./getSchemaIamPolicy";
export const getSchemaIamPolicy: typeof import("./getSchemaIamPolicy").getSchemaIamPolicy = null as any;
export const getSchemaIamPolicyOutput: typeof import("./getSchemaIamPolicy").getSchemaIamPolicyOutput = null as any;
utilities.lazyLoad(exports, ["getSchemaIamPolicy","getSchemaIamPolicyOutput"], () => require("./getSchemaIamPolicy"));

export { GetSubscriptionArgs, GetSubscriptionResult, GetSubscriptionOutputArgs } from "./getSubscription";
export const getSubscription: typeof import("./getSubscription").getSubscription = null as any;
export const getSubscriptionOutput: typeof import("./getSubscription").getSubscriptionOutput = null as any;
utilities.lazyLoad(exports, ["getSubscription","getSubscriptionOutput"], () => require("./getSubscription"));

export { GetSubscriptionIamPolicyArgs, GetSubscriptionIamPolicyResult, GetSubscriptionIamPolicyOutputArgs } from "./getSubscriptionIamPolicy";
export const getSubscriptionIamPolicy: typeof import("./getSubscriptionIamPolicy").getSubscriptionIamPolicy = null as any;
export const getSubscriptionIamPolicyOutput: typeof import("./getSubscriptionIamPolicy").getSubscriptionIamPolicyOutput = null as any;
utilities.lazyLoad(exports, ["getSubscriptionIamPolicy","getSubscriptionIamPolicyOutput"], () => require("./getSubscriptionIamPolicy"));

export { GetTopicArgs, GetTopicResult, GetTopicOutputArgs } from "./getTopic";
export const getTopic: typeof import("./getTopic").getTopic = null as any;
export const getTopicOutput: typeof import("./getTopic").getTopicOutput = null as any;
utilities.lazyLoad(exports, ["getTopic","getTopicOutput"], () => require("./getTopic"));

export { GetTopicIamPolicyArgs, GetTopicIamPolicyResult, GetTopicIamPolicyOutputArgs } from "./getTopicIamPolicy";
export const getTopicIamPolicy: typeof import("./getTopicIamPolicy").getTopicIamPolicy = null as any;
export const getTopicIamPolicyOutput: typeof import("./getTopicIamPolicy").getTopicIamPolicyOutput = null as any;
utilities.lazyLoad(exports, ["getTopicIamPolicy","getTopicIamPolicyOutput"], () => require("./getTopicIamPolicy"));

export { LiteReservationArgs, LiteReservationState } from "./liteReservation";
export type LiteReservation = import("./liteReservation").LiteReservation;
export const LiteReservation: typeof import("./liteReservation").LiteReservation = null as any;
utilities.lazyLoad(exports, ["LiteReservation"], () => require("./liteReservation"));

export { LiteSubscriptionArgs, LiteSubscriptionState } from "./liteSubscription";
export type LiteSubscription = import("./liteSubscription").LiteSubscription;
export const LiteSubscription: typeof import("./liteSubscription").LiteSubscription = null as any;
utilities.lazyLoad(exports, ["LiteSubscription"], () => require("./liteSubscription"));

export { LiteTopicArgs, LiteTopicState } from "./liteTopic";
export type LiteTopic = import("./liteTopic").LiteTopic;
export const LiteTopic: typeof import("./liteTopic").LiteTopic = null as any;
utilities.lazyLoad(exports, ["LiteTopic"], () => require("./liteTopic"));

export { SchemaArgs, SchemaState } from "./schema";
export type Schema = import("./schema").Schema;
export const Schema: typeof import("./schema").Schema = null as any;
utilities.lazyLoad(exports, ["Schema"], () => require("./schema"));

export { SchemaIamBindingArgs, SchemaIamBindingState } from "./schemaIamBinding";
export type SchemaIamBinding = import("./schemaIamBinding").SchemaIamBinding;
export const SchemaIamBinding: typeof import("./schemaIamBinding").SchemaIamBinding = null as any;
utilities.lazyLoad(exports, ["SchemaIamBinding"], () => require("./schemaIamBinding"));

export { SchemaIamMemberArgs, SchemaIamMemberState } from "./schemaIamMember";
export type SchemaIamMember = import("./schemaIamMember").SchemaIamMember;
export const SchemaIamMember: typeof import("./schemaIamMember").SchemaIamMember = null as any;
utilities.lazyLoad(exports, ["SchemaIamMember"], () => require("./schemaIamMember"));

export { SchemaIamPolicyArgs, SchemaIamPolicyState } from "./schemaIamPolicy";
export type SchemaIamPolicy = import("./schemaIamPolicy").SchemaIamPolicy;
export const SchemaIamPolicy: typeof import("./schemaIamPolicy").SchemaIamPolicy = null as any;
utilities.lazyLoad(exports, ["SchemaIamPolicy"], () => require("./schemaIamPolicy"));

export { SubscriptionArgs, SubscriptionState } from "./subscription";
export type Subscription = import("./subscription").Subscription;
export const Subscription: typeof import("./subscription").Subscription = null as any;
utilities.lazyLoad(exports, ["Subscription"], () => require("./subscription"));

export { SubscriptionIAMBindingArgs, SubscriptionIAMBindingState } from "./subscriptionIAMBinding";
export type SubscriptionIAMBinding = import("./subscriptionIAMBinding").SubscriptionIAMBinding;
export const SubscriptionIAMBinding: typeof import("./subscriptionIAMBinding").SubscriptionIAMBinding = null as any;
utilities.lazyLoad(exports, ["SubscriptionIAMBinding"], () => require("./subscriptionIAMBinding"));

export { SubscriptionIAMMemberArgs, SubscriptionIAMMemberState } from "./subscriptionIAMMember";
export type SubscriptionIAMMember = import("./subscriptionIAMMember").SubscriptionIAMMember;
export const SubscriptionIAMMember: typeof import("./subscriptionIAMMember").SubscriptionIAMMember = null as any;
utilities.lazyLoad(exports, ["SubscriptionIAMMember"], () => require("./subscriptionIAMMember"));

export { SubscriptionIAMPolicyArgs, SubscriptionIAMPolicyState } from "./subscriptionIAMPolicy";
export type SubscriptionIAMPolicy = import("./subscriptionIAMPolicy").SubscriptionIAMPolicy;
export const SubscriptionIAMPolicy: typeof import("./subscriptionIAMPolicy").SubscriptionIAMPolicy = null as any;
utilities.lazyLoad(exports, ["SubscriptionIAMPolicy"], () => require("./subscriptionIAMPolicy"));

export { TopicArgs, TopicState } from "./topic";
export type Topic = import("./topic").Topic;
export const Topic: typeof import("./topic").Topic = null as any;
utilities.lazyLoad(exports, ["Topic"], () => require("./topic"));

export { TopicIAMBindingArgs, TopicIAMBindingState } from "./topicIAMBinding";
export type TopicIAMBinding = import("./topicIAMBinding").TopicIAMBinding;
export const TopicIAMBinding: typeof import("./topicIAMBinding").TopicIAMBinding = null as any;
utilities.lazyLoad(exports, ["TopicIAMBinding"], () => require("./topicIAMBinding"));

export { TopicIAMMemberArgs, TopicIAMMemberState } from "./topicIAMMember";
export type TopicIAMMember = import("./topicIAMMember").TopicIAMMember;
export const TopicIAMMember: typeof import("./topicIAMMember").TopicIAMMember = null as any;
utilities.lazyLoad(exports, ["TopicIAMMember"], () => require("./topicIAMMember"));

export { TopicIAMPolicyArgs, TopicIAMPolicyState } from "./topicIAMPolicy";
export type TopicIAMPolicy = import("./topicIAMPolicy").TopicIAMPolicy;
export const TopicIAMPolicy: typeof import("./topicIAMPolicy").TopicIAMPolicy = null as any;
utilities.lazyLoad(exports, ["TopicIAMPolicy"], () => require("./topicIAMPolicy"));

export * from "./zMixins";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "gcp:pubsub/liteReservation:LiteReservation":
                return new LiteReservation(name, <any>undefined, { urn })
            case "gcp:pubsub/liteSubscription:LiteSubscription":
                return new LiteSubscription(name, <any>undefined, { urn })
            case "gcp:pubsub/liteTopic:LiteTopic":
                return new LiteTopic(name, <any>undefined, { urn })
            case "gcp:pubsub/schema:Schema":
                return new Schema(name, <any>undefined, { urn })
            case "gcp:pubsub/schemaIamBinding:SchemaIamBinding":
                return new SchemaIamBinding(name, <any>undefined, { urn })
            case "gcp:pubsub/schemaIamMember:SchemaIamMember":
                return new SchemaIamMember(name, <any>undefined, { urn })
            case "gcp:pubsub/schemaIamPolicy:SchemaIamPolicy":
                return new SchemaIamPolicy(name, <any>undefined, { urn })
            case "gcp:pubsub/subscription:Subscription":
                return new Subscription(name, <any>undefined, { urn })
            case "gcp:pubsub/subscriptionIAMBinding:SubscriptionIAMBinding":
                return new SubscriptionIAMBinding(name, <any>undefined, { urn })
            case "gcp:pubsub/subscriptionIAMMember:SubscriptionIAMMember":
                return new SubscriptionIAMMember(name, <any>undefined, { urn })
            case "gcp:pubsub/subscriptionIAMPolicy:SubscriptionIAMPolicy":
                return new SubscriptionIAMPolicy(name, <any>undefined, { urn })
            case "gcp:pubsub/topic:Topic":
                return new Topic(name, <any>undefined, { urn })
            case "gcp:pubsub/topicIAMBinding:TopicIAMBinding":
                return new TopicIAMBinding(name, <any>undefined, { urn })
            case "gcp:pubsub/topicIAMMember:TopicIAMMember":
                return new TopicIAMMember(name, <any>undefined, { urn })
            case "gcp:pubsub/topicIAMPolicy:TopicIAMPolicy":
                return new TopicIAMPolicy(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("gcp", "pubsub/liteReservation", _module)
pulumi.runtime.registerResourceModule("gcp", "pubsub/liteSubscription", _module)
pulumi.runtime.registerResourceModule("gcp", "pubsub/liteTopic", _module)
pulumi.runtime.registerResourceModule("gcp", "pubsub/schema", _module)
pulumi.runtime.registerResourceModule("gcp", "pubsub/schemaIamBinding", _module)
pulumi.runtime.registerResourceModule("gcp", "pubsub/schemaIamMember", _module)
pulumi.runtime.registerResourceModule("gcp", "pubsub/schemaIamPolicy", _module)
pulumi.runtime.registerResourceModule("gcp", "pubsub/subscription", _module)
pulumi.runtime.registerResourceModule("gcp", "pubsub/subscriptionIAMBinding", _module)
pulumi.runtime.registerResourceModule("gcp", "pubsub/subscriptionIAMMember", _module)
pulumi.runtime.registerResourceModule("gcp", "pubsub/subscriptionIAMPolicy", _module)
pulumi.runtime.registerResourceModule("gcp", "pubsub/topic", _module)
pulumi.runtime.registerResourceModule("gcp", "pubsub/topicIAMBinding", _module)
pulumi.runtime.registerResourceModule("gcp", "pubsub/topicIAMMember", _module)
pulumi.runtime.registerResourceModule("gcp", "pubsub/topicIAMPolicy", _module)
