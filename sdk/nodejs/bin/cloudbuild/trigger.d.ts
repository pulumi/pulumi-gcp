import * as pulumi from "@pulumi/pulumi";
export declare class Trigger extends pulumi.CustomResource {
    /**
     * Get an existing Trigger resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TriggerState, opts?: pulumi.CustomResourceOptions): Trigger;
    readonly build: pulumi.Output<{
        images?: string[];
        steps?: {
            args?: string[];
            name?: string;
        }[];
        tags?: string[];
    } | undefined>;
    readonly createTime: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly disabled: pulumi.Output<string | undefined>;
    readonly filename: pulumi.Output<string | undefined>;
    readonly ignoredFiles: pulumi.Output<string[] | undefined>;
    readonly includedFiles: pulumi.Output<string[] | undefined>;
    readonly project: pulumi.Output<string>;
    readonly substitutions: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    readonly triggerId: pulumi.Output<string>;
    readonly triggerTemplate: pulumi.Output<{
        branchName?: string;
        commitSha?: string;
        dir?: string;
        projectId: string;
        repoName?: string;
        tagName?: string;
    } | undefined>;
    /**
     * Create a Trigger resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TriggerArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Trigger resources.
 */
export interface TriggerState {
    readonly build?: pulumi.Input<{
        images?: pulumi.Input<pulumi.Input<string>[]>;
        steps?: pulumi.Input<pulumi.Input<{
            args?: pulumi.Input<pulumi.Input<string>[]>;
            name?: pulumi.Input<string>;
        }>[]>;
        tags?: pulumi.Input<pulumi.Input<string>[]>;
    }>;
    readonly createTime?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly disabled?: pulumi.Input<string>;
    readonly filename?: pulumi.Input<string>;
    readonly ignoredFiles?: pulumi.Input<pulumi.Input<string>[]>;
    readonly includedFiles?: pulumi.Input<pulumi.Input<string>[]>;
    readonly project?: pulumi.Input<string>;
    readonly substitutions?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly triggerId?: pulumi.Input<string>;
    readonly triggerTemplate?: pulumi.Input<{
        branchName?: pulumi.Input<string>;
        commitSha?: pulumi.Input<string>;
        dir?: pulumi.Input<string>;
        projectId?: pulumi.Input<string>;
        repoName?: pulumi.Input<string>;
        tagName?: pulumi.Input<string>;
    }>;
}
/**
 * The set of arguments for constructing a Trigger resource.
 */
export interface TriggerArgs {
    readonly build?: pulumi.Input<{
        images?: pulumi.Input<pulumi.Input<string>[]>;
        steps?: pulumi.Input<pulumi.Input<{
            args?: pulumi.Input<pulumi.Input<string>[]>;
            name?: pulumi.Input<string>;
        }>[]>;
        tags?: pulumi.Input<pulumi.Input<string>[]>;
    }>;
    readonly description?: pulumi.Input<string>;
    readonly disabled?: pulumi.Input<string>;
    readonly filename?: pulumi.Input<string>;
    readonly ignoredFiles?: pulumi.Input<pulumi.Input<string>[]>;
    readonly includedFiles?: pulumi.Input<pulumi.Input<string>[]>;
    readonly project?: pulumi.Input<string>;
    readonly substitutions?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly triggerTemplate?: pulumi.Input<{
        branchName?: pulumi.Input<string>;
        commitSha?: pulumi.Input<string>;
        dir?: pulumi.Input<string>;
        projectId?: pulumi.Input<string>;
        repoName?: pulumi.Input<string>;
        tagName?: pulumi.Input<string>;
    }>;
}
