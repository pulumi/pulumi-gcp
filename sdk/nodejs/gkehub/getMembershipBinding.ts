// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getMembershipBinding(args: GetMembershipBindingArgs, opts?: pulumi.InvokeOptions): Promise<GetMembershipBindingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:gkehub/getMembershipBinding:getMembershipBinding", {
        "location": args.location,
        "membershipBindingId": args.membershipBindingId,
        "membershipId": args.membershipId,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getMembershipBinding.
 */
export interface GetMembershipBindingArgs {
    location: string;
    membershipBindingId: string;
    membershipId: string;
    project?: string;
}

/**
 * A collection of values returned by getMembershipBinding.
 */
export interface GetMembershipBindingResult {
    readonly createTime: string;
    readonly deleteTime: string;
    readonly effectiveLabels: {[key: string]: string};
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly labels: {[key: string]: string};
    readonly location: string;
    readonly membershipBindingId: string;
    readonly membershipId: string;
    readonly name: string;
    readonly project?: string;
    readonly pulumiLabels: {[key: string]: string};
    readonly scope: string;
    readonly states: outputs.gkehub.GetMembershipBindingState[];
    readonly uid: string;
    readonly updateTime: string;
}
export function getMembershipBindingOutput(args: GetMembershipBindingOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetMembershipBindingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:gkehub/getMembershipBinding:getMembershipBinding", {
        "location": args.location,
        "membershipBindingId": args.membershipBindingId,
        "membershipId": args.membershipId,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getMembershipBinding.
 */
export interface GetMembershipBindingOutputArgs {
    location: pulumi.Input<string>;
    membershipBindingId: pulumi.Input<string>;
    membershipId: pulumi.Input<string>;
    project?: pulumi.Input<string>;
}
