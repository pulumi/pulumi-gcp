// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ConnectionProfileArgs, ConnectionProfileState } from "./connectionProfile";
export type ConnectionProfile = import("./connectionProfile").ConnectionProfile;
export const ConnectionProfile: typeof import("./connectionProfile").ConnectionProfile = null as any;
utilities.lazyLoad(exports, ["ConnectionProfile"], () => require("./connectionProfile"));

export { GetStaticIpsArgs, GetStaticIpsResult, GetStaticIpsOutputArgs } from "./getStaticIps";
export const getStaticIps: typeof import("./getStaticIps").getStaticIps = null as any;
export const getStaticIpsOutput: typeof import("./getStaticIps").getStaticIpsOutput = null as any;
utilities.lazyLoad(exports, ["getStaticIps","getStaticIpsOutput"], () => require("./getStaticIps"));

export { PrivateConnectionArgs, PrivateConnectionState } from "./privateConnection";
export type PrivateConnection = import("./privateConnection").PrivateConnection;
export const PrivateConnection: typeof import("./privateConnection").PrivateConnection = null as any;
utilities.lazyLoad(exports, ["PrivateConnection"], () => require("./privateConnection"));

export { StreamArgs, StreamState } from "./stream";
export type Stream = import("./stream").Stream;
export const Stream: typeof import("./stream").Stream = null as any;
utilities.lazyLoad(exports, ["Stream"], () => require("./stream"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "gcp:datastream/connectionProfile:ConnectionProfile":
                return new ConnectionProfile(name, <any>undefined, { urn })
            case "gcp:datastream/privateConnection:PrivateConnection":
                return new PrivateConnection(name, <any>undefined, { urn })
            case "gcp:datastream/stream:Stream":
                return new Stream(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("gcp", "datastream/connectionProfile", _module)
pulumi.runtime.registerResourceModule("gcp", "datastream/privateConnection", _module)
pulumi.runtime.registerResourceModule("gcp", "datastream/stream", _module)
