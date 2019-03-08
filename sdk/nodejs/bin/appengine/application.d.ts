import * as pulumi from "@pulumi/pulumi";
/**
 * Allows creation and management of an App Engine application.
 *
 * > App Engine applications cannot be deleted once they're created; you have to delete the
 *    entire project to delete the application. Terraform will report the application has been
 *    successfully deleted; this is a limitation of Terraform, and will go away in the future.
 *    Terraform is not able to delete App Engine applications.
 */
export declare class Application extends pulumi.CustomResource {
    /**
     * Get an existing Application resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplicationState, opts?: pulumi.CustomResourceOptions): Application;
    /**
     * The domain to authenticate users with when using App Engine's User API.
     */
    readonly authDomain: pulumi.Output<string>;
    /**
     * The GCS bucket code is being stored in for this app.
     */
    readonly codeBucket: pulumi.Output<string>;
    /**
     * The GCS bucket content is being stored in for this app.
     */
    readonly defaultBucket: pulumi.Output<string>;
    /**
     * The default hostname for this app.
     */
    readonly defaultHostname: pulumi.Output<string>;
    /**
     * A block of optional settings to configure specific App Engine features:
     */
    readonly featureSettings: pulumi.Output<{
        splitHealthChecks?: boolean;
    }>;
    /**
     * The GCR domain used for storing managed Docker images for this app.
     */
    readonly gcrDomain: pulumi.Output<string>;
    /**
     * The [location](https://cloud.google.com/appengine/docs/locations)
     * to serve the app from.
     */
    readonly locationId: pulumi.Output<string>;
    /**
     * Unique name of the app, usually `apps/{PROJECT_ID}`
     */
    readonly name: pulumi.Output<string>;
    readonly project: pulumi.Output<string>;
    /**
     * The serving status of the app.
     */
    readonly servingStatus: pulumi.Output<string>;
    /**
     * A list of dispatch rule blocks. Each block has a `domain`, `path`, and `service` field.
     */
    readonly urlDispatchRules: pulumi.Output<{
        domain: string;
        path: string;
        service: string;
    }[]>;
    /**
     * Create a Application resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplicationArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Application resources.
 */
export interface ApplicationState {
    /**
     * The domain to authenticate users with when using App Engine's User API.
     */
    readonly authDomain?: pulumi.Input<string>;
    /**
     * The GCS bucket code is being stored in for this app.
     */
    readonly codeBucket?: pulumi.Input<string>;
    /**
     * The GCS bucket content is being stored in for this app.
     */
    readonly defaultBucket?: pulumi.Input<string>;
    /**
     * The default hostname for this app.
     */
    readonly defaultHostname?: pulumi.Input<string>;
    /**
     * A block of optional settings to configure specific App Engine features:
     */
    readonly featureSettings?: pulumi.Input<{
        splitHealthChecks?: pulumi.Input<boolean>;
    }>;
    /**
     * The GCR domain used for storing managed Docker images for this app.
     */
    readonly gcrDomain?: pulumi.Input<string>;
    /**
     * The [location](https://cloud.google.com/appengine/docs/locations)
     * to serve the app from.
     */
    readonly locationId?: pulumi.Input<string>;
    /**
     * Unique name of the app, usually `apps/{PROJECT_ID}`
     */
    readonly name?: pulumi.Input<string>;
    readonly project?: pulumi.Input<string>;
    /**
     * The serving status of the app.
     */
    readonly servingStatus?: pulumi.Input<string>;
    /**
     * A list of dispatch rule blocks. Each block has a `domain`, `path`, and `service` field.
     */
    readonly urlDispatchRules?: pulumi.Input<pulumi.Input<{
        domain?: pulumi.Input<string>;
        path?: pulumi.Input<string>;
        service?: pulumi.Input<string>;
    }>[]>;
}
/**
 * The set of arguments for constructing a Application resource.
 */
export interface ApplicationArgs {
    /**
     * The domain to authenticate users with when using App Engine's User API.
     */
    readonly authDomain?: pulumi.Input<string>;
    /**
     * A block of optional settings to configure specific App Engine features:
     */
    readonly featureSettings?: pulumi.Input<{
        splitHealthChecks?: pulumi.Input<boolean>;
    }>;
    /**
     * The [location](https://cloud.google.com/appengine/docs/locations)
     * to serve the app from.
     */
    readonly locationId: pulumi.Input<string>;
    readonly project?: pulumi.Input<string>;
    /**
     * The serving status of the app.
     */
    readonly servingStatus?: pulumi.Input<string>;
}
