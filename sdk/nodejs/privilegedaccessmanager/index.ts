// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { EntitlementArgs, EntitlementState } from "./entitlement";
export type Entitlement = import("./entitlement").Entitlement;
export const Entitlement: typeof import("./entitlement").Entitlement = null as any;
utilities.lazyLoad(exports, ["Entitlement"], () => require("./entitlement"));

export { GetEntitlementArgs, GetEntitlementResult, GetEntitlementOutputArgs } from "./getEntitlement";
export const getEntitlement: typeof import("./getEntitlement").getEntitlement = null as any;
export const getEntitlementOutput: typeof import("./getEntitlement").getEntitlementOutput = null as any;
utilities.lazyLoad(exports, ["getEntitlement","getEntitlementOutput"], () => require("./getEntitlement"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "gcp:privilegedaccessmanager/entitlement:entitlement":
                return new Entitlement(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("gcp", "privilegedaccessmanager/entitlement", _module)
