// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { GetRepositoryIamPolicyArgs, GetRepositoryIamPolicyResult, GetRepositoryIamPolicyOutputArgs } from "./getRepositoryIamPolicy";
export const getRepositoryIamPolicy: typeof import("./getRepositoryIamPolicy").getRepositoryIamPolicy = null as any;
export const getRepositoryIamPolicyOutput: typeof import("./getRepositoryIamPolicy").getRepositoryIamPolicyOutput = null as any;
utilities.lazyLoad(exports, ["getRepositoryIamPolicy","getRepositoryIamPolicyOutput"], () => require("./getRepositoryIamPolicy"));

export { RepositoryArgs, RepositoryState } from "./repository";
export type Repository = import("./repository").Repository;
export const Repository: typeof import("./repository").Repository = null as any;
utilities.lazyLoad(exports, ["Repository"], () => require("./repository"));

export { RepositoryIamBindingArgs, RepositoryIamBindingState } from "./repositoryIamBinding";
export type RepositoryIamBinding = import("./repositoryIamBinding").RepositoryIamBinding;
export const RepositoryIamBinding: typeof import("./repositoryIamBinding").RepositoryIamBinding = null as any;
utilities.lazyLoad(exports, ["RepositoryIamBinding"], () => require("./repositoryIamBinding"));

export { RepositoryIamMemberArgs, RepositoryIamMemberState } from "./repositoryIamMember";
export type RepositoryIamMember = import("./repositoryIamMember").RepositoryIamMember;
export const RepositoryIamMember: typeof import("./repositoryIamMember").RepositoryIamMember = null as any;
utilities.lazyLoad(exports, ["RepositoryIamMember"], () => require("./repositoryIamMember"));

export { RepositoryIamPolicyArgs, RepositoryIamPolicyState } from "./repositoryIamPolicy";
export type RepositoryIamPolicy = import("./repositoryIamPolicy").RepositoryIamPolicy;
export const RepositoryIamPolicy: typeof import("./repositoryIamPolicy").RepositoryIamPolicy = null as any;
utilities.lazyLoad(exports, ["RepositoryIamPolicy"], () => require("./repositoryIamPolicy"));

export { RepositoryReleaseConfigArgs, RepositoryReleaseConfigState } from "./repositoryReleaseConfig";
export type RepositoryReleaseConfig = import("./repositoryReleaseConfig").RepositoryReleaseConfig;
export const RepositoryReleaseConfig: typeof import("./repositoryReleaseConfig").RepositoryReleaseConfig = null as any;
utilities.lazyLoad(exports, ["RepositoryReleaseConfig"], () => require("./repositoryReleaseConfig"));

export { RepositoryWorkflowConfigArgs, RepositoryWorkflowConfigState } from "./repositoryWorkflowConfig";
export type RepositoryWorkflowConfig = import("./repositoryWorkflowConfig").RepositoryWorkflowConfig;
export const RepositoryWorkflowConfig: typeof import("./repositoryWorkflowConfig").RepositoryWorkflowConfig = null as any;
utilities.lazyLoad(exports, ["RepositoryWorkflowConfig"], () => require("./repositoryWorkflowConfig"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "gcp:dataform/repository:Repository":
                return new Repository(name, <any>undefined, { urn })
            case "gcp:dataform/repositoryIamBinding:RepositoryIamBinding":
                return new RepositoryIamBinding(name, <any>undefined, { urn })
            case "gcp:dataform/repositoryIamMember:RepositoryIamMember":
                return new RepositoryIamMember(name, <any>undefined, { urn })
            case "gcp:dataform/repositoryIamPolicy:RepositoryIamPolicy":
                return new RepositoryIamPolicy(name, <any>undefined, { urn })
            case "gcp:dataform/repositoryReleaseConfig:RepositoryReleaseConfig":
                return new RepositoryReleaseConfig(name, <any>undefined, { urn })
            case "gcp:dataform/repositoryWorkflowConfig:RepositoryWorkflowConfig":
                return new RepositoryWorkflowConfig(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("gcp", "dataform/repository", _module)
pulumi.runtime.registerResourceModule("gcp", "dataform/repositoryIamBinding", _module)
pulumi.runtime.registerResourceModule("gcp", "dataform/repositoryIamMember", _module)
pulumi.runtime.registerResourceModule("gcp", "dataform/repositoryIamPolicy", _module)
pulumi.runtime.registerResourceModule("gcp", "dataform/repositoryReleaseConfig", _module)
pulumi.runtime.registerResourceModule("gcp", "dataform/repositoryWorkflowConfig", _module)
