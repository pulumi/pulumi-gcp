// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AppConnectorArgs, AppConnectorState } from "./appConnector";
export type AppConnector = import("./appConnector").AppConnector;
export const AppConnector: typeof import("./appConnector").AppConnector = null as any;
utilities.lazyLoad(exports, ["AppConnector"], () => require("./appConnector"));

export { AppGatewayArgs, AppGatewayState } from "./appGateway";
export type AppGateway = import("./appGateway").AppGateway;
export const AppGateway: typeof import("./appGateway").AppGateway = null as any;
utilities.lazyLoad(exports, ["AppGateway"], () => require("./appGateway"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "gcp:beyondcorp/appConnector:AppConnector":
                return new AppConnector(name, <any>undefined, { urn })
            case "gcp:beyondcorp/appGateway:AppGateway":
                return new AppGateway(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("gcp", "beyondcorp/appConnector", _module)
pulumi.runtime.registerResourceModule("gcp", "beyondcorp/appGateway", _module)