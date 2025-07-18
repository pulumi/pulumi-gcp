// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ApplicationArgs, ApplicationState } from "./application";
export type Application = import("./application").Application;
export const Application: typeof import("./application").Application = null as any;
utilities.lazyLoad(exports, ["Application"], () => require("./application"));

export { ApplicationUrlDispatchRulesArgs, ApplicationUrlDispatchRulesState } from "./applicationUrlDispatchRules";
export type ApplicationUrlDispatchRules = import("./applicationUrlDispatchRules").ApplicationUrlDispatchRules;
export const ApplicationUrlDispatchRules: typeof import("./applicationUrlDispatchRules").ApplicationUrlDispatchRules = null as any;
utilities.lazyLoad(exports, ["ApplicationUrlDispatchRules"], () => require("./applicationUrlDispatchRules"));

export { DomainMappingArgs, DomainMappingState } from "./domainMapping";
export type DomainMapping = import("./domainMapping").DomainMapping;
export const DomainMapping: typeof import("./domainMapping").DomainMapping = null as any;
utilities.lazyLoad(exports, ["DomainMapping"], () => require("./domainMapping"));

export { EngineSplitTrafficArgs, EngineSplitTrafficState } from "./engineSplitTraffic";
export type EngineSplitTraffic = import("./engineSplitTraffic").EngineSplitTraffic;
export const EngineSplitTraffic: typeof import("./engineSplitTraffic").EngineSplitTraffic = null as any;
utilities.lazyLoad(exports, ["EngineSplitTraffic"], () => require("./engineSplitTraffic"));

export { FirewallRuleArgs, FirewallRuleState } from "./firewallRule";
export type FirewallRule = import("./firewallRule").FirewallRule;
export const FirewallRule: typeof import("./firewallRule").FirewallRule = null as any;
utilities.lazyLoad(exports, ["FirewallRule"], () => require("./firewallRule"));

export { FlexibleAppVersionArgs, FlexibleAppVersionState } from "./flexibleAppVersion";
export type FlexibleAppVersion = import("./flexibleAppVersion").FlexibleAppVersion;
export const FlexibleAppVersion: typeof import("./flexibleAppVersion").FlexibleAppVersion = null as any;
utilities.lazyLoad(exports, ["FlexibleAppVersion"], () => require("./flexibleAppVersion"));

export { GetDefaultServiceAccountArgs, GetDefaultServiceAccountResult, GetDefaultServiceAccountOutputArgs } from "./getDefaultServiceAccount";
export const getDefaultServiceAccount: typeof import("./getDefaultServiceAccount").getDefaultServiceAccount = null as any;
export const getDefaultServiceAccountOutput: typeof import("./getDefaultServiceAccount").getDefaultServiceAccountOutput = null as any;
utilities.lazyLoad(exports, ["getDefaultServiceAccount","getDefaultServiceAccountOutput"], () => require("./getDefaultServiceAccount"));

export { ServiceNetworkSettingsArgs, ServiceNetworkSettingsState } from "./serviceNetworkSettings";
export type ServiceNetworkSettings = import("./serviceNetworkSettings").ServiceNetworkSettings;
export const ServiceNetworkSettings: typeof import("./serviceNetworkSettings").ServiceNetworkSettings = null as any;
utilities.lazyLoad(exports, ["ServiceNetworkSettings"], () => require("./serviceNetworkSettings"));

export { StandardAppVersionArgs, StandardAppVersionState } from "./standardAppVersion";
export type StandardAppVersion = import("./standardAppVersion").StandardAppVersion;
export const StandardAppVersion: typeof import("./standardAppVersion").StandardAppVersion = null as any;
utilities.lazyLoad(exports, ["StandardAppVersion"], () => require("./standardAppVersion"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "gcp:appengine/application:Application":
                return new Application(name, <any>undefined, { urn })
            case "gcp:appengine/applicationUrlDispatchRules:ApplicationUrlDispatchRules":
                return new ApplicationUrlDispatchRules(name, <any>undefined, { urn })
            case "gcp:appengine/domainMapping:DomainMapping":
                return new DomainMapping(name, <any>undefined, { urn })
            case "gcp:appengine/engineSplitTraffic:EngineSplitTraffic":
                return new EngineSplitTraffic(name, <any>undefined, { urn })
            case "gcp:appengine/firewallRule:FirewallRule":
                return new FirewallRule(name, <any>undefined, { urn })
            case "gcp:appengine/flexibleAppVersion:FlexibleAppVersion":
                return new FlexibleAppVersion(name, <any>undefined, { urn })
            case "gcp:appengine/serviceNetworkSettings:ServiceNetworkSettings":
                return new ServiceNetworkSettings(name, <any>undefined, { urn })
            case "gcp:appengine/standardAppVersion:StandardAppVersion":
                return new StandardAppVersion(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("gcp", "appengine/application", _module)
pulumi.runtime.registerResourceModule("gcp", "appengine/applicationUrlDispatchRules", _module)
pulumi.runtime.registerResourceModule("gcp", "appengine/domainMapping", _module)
pulumi.runtime.registerResourceModule("gcp", "appengine/engineSplitTraffic", _module)
pulumi.runtime.registerResourceModule("gcp", "appengine/firewallRule", _module)
pulumi.runtime.registerResourceModule("gcp", "appengine/flexibleAppVersion", _module)
pulumi.runtime.registerResourceModule("gcp", "appengine/serviceNetworkSettings", _module)
pulumi.runtime.registerResourceModule("gcp", "appengine/standardAppVersion", _module)
