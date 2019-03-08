import * as pulumi from "@pulumi/pulumi";
export declare class IAMAuditConfig extends pulumi.CustomResource {
    /**
     * Get an existing IAMAuditConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IAMAuditConfigState, opts?: pulumi.CustomResourceOptions): IAMAuditConfig;
    readonly auditLogConfigs: pulumi.Output<{
        exemptedMembers?: string[];
        logType: string;
    }[]>;
    readonly etag: pulumi.Output<string>;
    readonly project: pulumi.Output<string | undefined>;
    readonly service: pulumi.Output<string>;
    /**
     * Create a IAMAuditConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IAMAuditConfigArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering IAMAuditConfig resources.
 */
export interface IAMAuditConfigState {
    readonly auditLogConfigs?: pulumi.Input<pulumi.Input<{
        exemptedMembers?: pulumi.Input<pulumi.Input<string>[]>;
        logType: pulumi.Input<string>;
    }>[]>;
    readonly etag?: pulumi.Input<string>;
    readonly project?: pulumi.Input<string>;
    readonly service?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a IAMAuditConfig resource.
 */
export interface IAMAuditConfigArgs {
    readonly auditLogConfigs: pulumi.Input<pulumi.Input<{
        exemptedMembers?: pulumi.Input<pulumi.Input<string>[]>;
        logType: pulumi.Input<string>;
    }>[]>;
    readonly project?: pulumi.Input<string>;
    readonly service: pulumi.Input<string>;
}
