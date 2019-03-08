import * as pulumi from "@pulumi/pulumi";
/**
 * A single firewall rule that is evaluated against incoming traffic
 * and provides an action to take on matched requests.
 *
 *
 * To get more information about FirewallRule, see:
 *
 * * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.firewall.ingressRules)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/appengine/docs/standard/python/creating-firewalls#creating_firewall_rules)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=app_engine_firewall_rule_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - App Engine Firewall Rule Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myProject = new gcp.organizations.Project("my_project", {
 *     orgId: "123456789",
 *     projectId: "test-project",
 * });
 * const app = new gcp.appengine.Application("app", {
 *     locationId: "us-central",
 *     project: myProject.projectId,
 * });
 * const rule = new gcp.appengine.FirewallRule("rule", {
 *     action: "ALLOW",
 *     priority: 1000,
 *     project: app.project,
 *     sourceRange: "*",
 * });
 * ```
 */
export declare class FirewallRule extends pulumi.CustomResource {
    /**
     * Get an existing FirewallRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FirewallRuleState, opts?: pulumi.CustomResourceOptions): FirewallRule;
    readonly action: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly priority: pulumi.Output<number | undefined>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly sourceRange: pulumi.Output<string>;
    /**
     * Create a FirewallRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FirewallRuleArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering FirewallRule resources.
 */
export interface FirewallRuleState {
    readonly action?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly priority?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly sourceRange?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a FirewallRule resource.
 */
export interface FirewallRuleArgs {
    readonly action: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly priority?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly sourceRange: pulumi.Input<string>;
}
