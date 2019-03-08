import * as pulumi from "@pulumi/pulumi";
/**
 * Generates an IAM policy document that may be referenced by and applied to
 * other Google Cloud Platform resources, such as the `google_project` resource.
 *
 *
 * This data source is used to define IAM policies to apply to other resources.
 * Currently, defining a policy through a datasource and referencing that policy
 * from another resource is the only way to apply an IAM policy to a resource.
 *
 * **Note:** Several restrictions apply when setting IAM policies through this API.
 * See the [setIamPolicy docs](https://cloud.google.com/resource-manager/reference/rest/v1/projects/setIamPolicy)
 * for a list of these restrictions.
 */
export declare function getIAMPolicy(args: GetIAMPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetIAMPolicyResult>;
/**
 * A collection of arguments for invoking getIAMPolicy.
 */
export interface GetIAMPolicyArgs {
    /**
     * A nested configuration block that defines logging additional configuration for your project.
     */
    readonly auditConfigs?: {
        auditLogConfigs: {
            exemptedMembers?: string[];
            logType: string;
        }[];
        service: string;
    }[];
    /**
     * A nested configuration block (described below)
     * defining a binding to be included in the policy document. Multiple
     * `binding` arguments are supported.
     */
    readonly bindings: {
        members: string[];
        role: string;
    }[];
}
/**
 * A collection of values returned by getIAMPolicy.
 */
export interface GetIAMPolicyResult {
    /**
     * The above bindings serialized in a format suitable for
     * referencing from a resource that supports IAM.
     */
    readonly policyData: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
