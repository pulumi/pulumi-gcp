// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ConnectionProfileArgs, ConnectionProfileState } from "./connectionProfile";
export type ConnectionProfile = import("./connectionProfile").ConnectionProfile;
export const ConnectionProfile: typeof import("./connectionProfile").ConnectionProfile = null as any;
utilities.lazyLoad(exports, ["ConnectionProfile"], () => require("./connectionProfile"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "gcp:databasemigrationservice/connectionProfile:ConnectionProfile":
                return new ConnectionProfile(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("gcp", "databasemigrationservice/connectionProfile", _module)