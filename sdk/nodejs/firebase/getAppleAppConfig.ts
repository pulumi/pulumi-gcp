// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export function getAppleAppConfig(args: GetAppleAppConfigArgs, opts?: pulumi.InvokeOptions): Promise<GetAppleAppConfigResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:firebase/getAppleAppConfig:getAppleAppConfig", {
        "appId": args.appId,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppleAppConfig.
 */
export interface GetAppleAppConfigArgs {
    /**
     * The id of the Firebase iOS App.
     */
    appId: string;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: string;
}

/**
 * A collection of values returned by getAppleAppConfig.
 */
export interface GetAppleAppConfigResult {
    readonly appId: string;
    /**
     * The content of the XML configuration file as a base64-encoded string.
     */
    readonly configFileContents: string;
    /**
     * The filename that the configuration artifact for the IosApp is typically saved as.
     */
    readonly configFilename: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly project?: string;
}
export function getAppleAppConfigOutput(args: GetAppleAppConfigOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAppleAppConfigResult> {
    return pulumi.output(args).apply((a: any) => getAppleAppConfig(a, opts))
}

/**
 * A collection of arguments for invoking getAppleAppConfig.
 */
export interface GetAppleAppConfigOutputArgs {
    /**
     * The id of the Firebase iOS App.
     */
    appId: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}