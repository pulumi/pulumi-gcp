// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ChatEngineArgs, ChatEngineState } from "./chatEngine";
export type ChatEngine = import("./chatEngine").ChatEngine;
export const ChatEngine: typeof import("./chatEngine").ChatEngine = null as any;
utilities.lazyLoad(exports, ["ChatEngine"], () => require("./chatEngine"));

export { DataStoreArgs, DataStoreState } from "./dataStore";
export type DataStore = import("./dataStore").DataStore;
export const DataStore: typeof import("./dataStore").DataStore = null as any;
utilities.lazyLoad(exports, ["DataStore"], () => require("./dataStore"));

export { SchemaArgs, SchemaState } from "./schema";
export type Schema = import("./schema").Schema;
export const Schema: typeof import("./schema").Schema = null as any;
utilities.lazyLoad(exports, ["Schema"], () => require("./schema"));

export { SearchEngineArgs, SearchEngineState } from "./searchEngine";
export type SearchEngine = import("./searchEngine").SearchEngine;
export const SearchEngine: typeof import("./searchEngine").SearchEngine = null as any;
utilities.lazyLoad(exports, ["SearchEngine"], () => require("./searchEngine"));

export { SitemapArgs, SitemapState } from "./sitemap";
export type Sitemap = import("./sitemap").Sitemap;
export const Sitemap: typeof import("./sitemap").Sitemap = null as any;
utilities.lazyLoad(exports, ["Sitemap"], () => require("./sitemap"));

export { TargetSiteArgs, TargetSiteState } from "./targetSite";
export type TargetSite = import("./targetSite").TargetSite;
export const TargetSite: typeof import("./targetSite").TargetSite = null as any;
utilities.lazyLoad(exports, ["TargetSite"], () => require("./targetSite"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "gcp:discoveryengine/chatEngine:ChatEngine":
                return new ChatEngine(name, <any>undefined, { urn })
            case "gcp:discoveryengine/dataStore:DataStore":
                return new DataStore(name, <any>undefined, { urn })
            case "gcp:discoveryengine/schema:Schema":
                return new Schema(name, <any>undefined, { urn })
            case "gcp:discoveryengine/searchEngine:SearchEngine":
                return new SearchEngine(name, <any>undefined, { urn })
            case "gcp:discoveryengine/sitemap:Sitemap":
                return new Sitemap(name, <any>undefined, { urn })
            case "gcp:discoveryengine/targetSite:TargetSite":
                return new TargetSite(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("gcp", "discoveryengine/chatEngine", _module)
pulumi.runtime.registerResourceModule("gcp", "discoveryengine/dataStore", _module)
pulumi.runtime.registerResourceModule("gcp", "discoveryengine/schema", _module)
pulumi.runtime.registerResourceModule("gcp", "discoveryengine/searchEngine", _module)
pulumi.runtime.registerResourceModule("gcp", "discoveryengine/sitemap", _module)
pulumi.runtime.registerResourceModule("gcp", "discoveryengine/targetSite", _module)
