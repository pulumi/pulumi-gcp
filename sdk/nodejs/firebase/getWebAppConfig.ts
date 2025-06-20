// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * A Google Cloud Firebase web application configuration
 *
 * To get more information about WebApp, see:
 *
 * * [API documentation](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps)
 * * How-to Guides
 *     * [Official Documentation](https://firebase.google.com/)
 */
export function getWebAppConfig(args: GetWebAppConfigArgs, opts?: pulumi.InvokeOptions): Promise<GetWebAppConfigResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:firebase/getWebAppConfig:getWebAppConfig", {
        "project": args.project,
        "webAppId": args.webAppId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWebAppConfig.
 */
export interface GetWebAppConfigArgs {
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: string;
    /**
     * the id of the firebase web app
     *
     * - - -
     */
    webAppId: string;
}

/**
 * A collection of values returned by getWebAppConfig.
 */
export interface GetWebAppConfigResult {
    /**
     * The API key associated with the web App.
     */
    readonly apiKey: string;
    /**
     * The domain Firebase Auth configures for OAuth redirects, in the format:
     * projectId.firebaseapp.com
     */
    readonly authDomain: string;
    /**
     * The default Firebase Realtime Database URL.
     */
    readonly databaseUrl: string;
    readonly id: string;
    /**
     * The ID of the project's default GCP resource location. The location is one of the available GCP resource
     * locations.
     * This field is omitted if the default GCP resource location has not been finalized yet. To set your project's
     * default GCP resource location, call defaultLocation.finalize after you add Firebase services to your project.
     */
    readonly locationId: string;
    /**
     * The unique Google-assigned identifier of the Google Analytics web stream associated with the Firebase Web App.
     * Firebase SDKs use this ID to interact with Google Analytics APIs.
     * This field is only present if the App is linked to a web stream in a Google Analytics App + Web property.
     * Learn more about this ID and Google Analytics web streams in the Analytics documentation.
     * To generate a measurementId and link the Web App with a Google Analytics web stream,
     * call projects.addGoogleAnalytics.
     */
    readonly measurementId: string;
    /**
     * The sender ID for use with Firebase Cloud Messaging.
     */
    readonly messagingSenderId: string;
    readonly project?: string;
    /**
     * The default Cloud Storage for Firebase storage bucket name.
     */
    readonly storageBucket: string;
    readonly webAppId: string;
}
/**
 * A Google Cloud Firebase web application configuration
 *
 * To get more information about WebApp, see:
 *
 * * [API documentation](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps)
 * * How-to Guides
 *     * [Official Documentation](https://firebase.google.com/)
 */
export function getWebAppConfigOutput(args: GetWebAppConfigOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetWebAppConfigResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:firebase/getWebAppConfig:getWebAppConfig", {
        "project": args.project,
        "webAppId": args.webAppId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWebAppConfig.
 */
export interface GetWebAppConfigOutputArgs {
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * the id of the firebase web app
     *
     * - - -
     */
    webAppId: pulumi.Input<string>;
}
