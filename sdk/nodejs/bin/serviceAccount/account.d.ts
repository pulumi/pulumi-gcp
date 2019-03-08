import * as pulumi from "@pulumi/pulumi";
/**
 * Allows management of a [Google Cloud Platform service account](https://cloud.google.com/compute/docs/access/service-accounts)
 *
 * > Creation of service accounts is eventually consistent, and that can lead to
 * errors when you try to apply ACLs to service accounts immediately after
 * creation. If using these resources in the same config, you can add a
 * [`sleep` using `local-exec`](https://github.com/hashicorp/terraform/issues/17726#issuecomment-377357866).
 *
 * ## Example Usage
 *
 * This snippet creates a service account, then gives it objectViewer
 * permission in a project.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const objectViewer = new gcp.serviceAccount.Account("object_viewer", {
 *     accountId: "object-viewer",
 *     displayName: "Object viewer",
 * });
 * ```
 */
export declare class Account extends pulumi.CustomResource {
    /**
     * Get an existing Account resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountState, opts?: pulumi.CustomResourceOptions): Account;
    /**
     * The account id that is used to generate the service
     * account email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression `a-z`
     * to comply with RFC1035. Changing this forces a new service account to be created.
     */
    readonly accountId: pulumi.Output<string>;
    /**
     * The display name for the service account.
     * Can be updated without creating a new resource.
     */
    readonly displayName: pulumi.Output<string | undefined>;
    /**
     * The e-mail address of the service account. This value
     * should be referenced from any `google_iam_policy` data sources
     * that would grant the service account privileges.
     */
    readonly email: pulumi.Output<string>;
    /**
     * The fully-qualified name of the service account.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project that the service account will be created in.
     * Defaults to the provider project configuration.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The unique id of the service account.
     */
    readonly uniqueId: pulumi.Output<string>;
    /**
     * Create a Account resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccountArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Account resources.
 */
export interface AccountState {
    /**
     * The account id that is used to generate the service
     * account email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression `a-z`
     * to comply with RFC1035. Changing this forces a new service account to be created.
     */
    readonly accountId?: pulumi.Input<string>;
    /**
     * The display name for the service account.
     * Can be updated without creating a new resource.
     */
    readonly displayName?: pulumi.Input<string>;
    /**
     * The e-mail address of the service account. This value
     * should be referenced from any `google_iam_policy` data sources
     * that would grant the service account privileges.
     */
    readonly email?: pulumi.Input<string>;
    /**
     * The fully-qualified name of the service account.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project that the service account will be created in.
     * Defaults to the provider project configuration.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The unique id of the service account.
     */
    readonly uniqueId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Account resource.
 */
export interface AccountArgs {
    /**
     * The account id that is used to generate the service
     * account email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression `a-z`
     * to comply with RFC1035. Changing this forces a new service account to be created.
     */
    readonly accountId: pulumi.Input<string>;
    /**
     * The display name for the service account.
     * Can be updated without creating a new resource.
     */
    readonly displayName?: pulumi.Input<string>;
    /**
     * The ID of the project that the service account will be created in.
     * Defaults to the provider project configuration.
     */
    readonly project?: pulumi.Input<string>;
}
