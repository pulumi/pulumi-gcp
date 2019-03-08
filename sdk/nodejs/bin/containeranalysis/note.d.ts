import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a detailed description of a Note.
 *
 * > **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
 * See [Provider Versions](https://terraform.io/docs/providers/google/provider_versions.html) for more details on beta resources.
 *
 * To get more information about Note, see:
 *
 * * [API documentation](https://cloud.google.com/container-analysis/api/reference/rest/)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/container-analysis/)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=container_analysis_note_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Container Analysis Note Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const note = new gcp.containeranalysis.Note("note", {
 *     attestationAuthority: {
 *         hint: {
 *             humanReadableName: "Attestor Note",
 *         },
 *     },
 * });
 * ```
 */
export declare class Note extends pulumi.CustomResource {
    /**
     * Get an existing Note resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NoteState, opts?: pulumi.CustomResourceOptions): Note;
    readonly attestationAuthority: pulumi.Output<{
        hint: {
            humanReadableName: string;
        };
    }>;
    readonly name: pulumi.Output<string>;
    readonly project: pulumi.Output<string>;
    /**
     * Create a Note resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NoteArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Note resources.
 */
export interface NoteState {
    readonly attestationAuthority?: pulumi.Input<{
        hint: pulumi.Input<{
            humanReadableName: pulumi.Input<string>;
        }>;
    }>;
    readonly name?: pulumi.Input<string>;
    readonly project?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Note resource.
 */
export interface NoteArgs {
    readonly attestationAuthority: pulumi.Input<{
        hint: pulumi.Input<{
            humanReadableName: pulumi.Input<string>;
        }>;
    }>;
    readonly name?: pulumi.Input<string>;
    readonly project?: pulumi.Input<string>;
}
