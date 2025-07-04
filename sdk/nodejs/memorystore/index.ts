// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { GetInstanceArgs, GetInstanceResult, GetInstanceOutputArgs } from "./getInstance";
export const getInstance: typeof import("./getInstance").getInstance = null as any;
export const getInstanceOutput: typeof import("./getInstance").getInstanceOutput = null as any;
utilities.lazyLoad(exports, ["getInstance","getInstanceOutput"], () => require("./getInstance"));

export { InstanceArgs, InstanceState } from "./instance";
export type Instance = import("./instance").Instance;
export const Instance: typeof import("./instance").Instance = null as any;
utilities.lazyLoad(exports, ["Instance"], () => require("./instance"));

export { InstanceDesiredUserCreatedEndpointsArgs, InstanceDesiredUserCreatedEndpointsState } from "./instanceDesiredUserCreatedEndpoints";
export type InstanceDesiredUserCreatedEndpoints = import("./instanceDesiredUserCreatedEndpoints").InstanceDesiredUserCreatedEndpoints;
export const InstanceDesiredUserCreatedEndpoints: typeof import("./instanceDesiredUserCreatedEndpoints").InstanceDesiredUserCreatedEndpoints = null as any;
utilities.lazyLoad(exports, ["InstanceDesiredUserCreatedEndpoints"], () => require("./instanceDesiredUserCreatedEndpoints"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "gcp:memorystore/instance:Instance":
                return new Instance(name, <any>undefined, { urn })
            case "gcp:memorystore/instanceDesiredUserCreatedEndpoints:InstanceDesiredUserCreatedEndpoints":
                return new InstanceDesiredUserCreatedEndpoints(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("gcp", "memorystore/instance", _module)
pulumi.runtime.registerResourceModule("gcp", "memorystore/instanceDesiredUserCreatedEndpoints", _module)
