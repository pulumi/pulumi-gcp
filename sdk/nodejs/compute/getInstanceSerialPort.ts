// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Get the serial port output from a Compute Instance. For more information see
 * the official [API](https://cloud.google.com/compute/docs/instances/viewing-serial-port-output) documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const serial = gcp.compute.getInstanceSerialPort({
 *     instance: "my-instance",
 *     zone: "us-central1-a",
 *     port: 1,
 * });
 * export const serialOut = serial.then(serial => serial.contents);
 * ```
 *
 * Using the serial port output to generate a windows password, derived from the [official guide](https://cloud.google.com/compute/docs/instances/windows/automate-pw-generation):
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const windows = new gcp.compute.Instance("windows", {
 *     networkInterfaces: [{
 *         accessConfigs: [{}],
 *         network: "default",
 *     }],
 *     name: "windows-instance",
 *     machineType: "e2-medium",
 *     zone: "us-central1-a",
 *     bootDisk: {
 *         initializeParams: {
 *             image: "windows-cloud/windows-2019",
 *         },
 *     },
 *     metadata: {
 *         "serial-port-logging-enable": "TRUE",
 *         "windows-keys": JSON.stringify({
 *             email: "example.user@example.com",
 *             expireOn: "2020-04-14T01:37:19Z",
 *             exponent: "AQAB",
 *             modulus: "wgsquN4IBNPqIUnu+h/5Za1kujb2YRhX1vCQVQAkBwnWigcCqOBVfRa5JoZfx6KIvEXjWqa77jPvlsxM4WPqnDIM2qiK36up3SKkYwFjff6F2ni/ry8vrwXCX3sGZ1hbIHlK0O012HpA3ISeEswVZmX2X67naOvJXfY5v0hGPWqCADao+xVxrmxsZD4IWnKl1UaZzI5lhAzr8fw6utHwx1EZ/MSgsEki6tujcZfN+GUDRnmJGQSnPTXmsf7Q4DKreTZk49cuyB3prV91S0x3DYjCUpSXrkVy1Ha5XicGD/q+ystuFsJnrrhbNXJbpSjM6sjo/aduAkZJl4FmOt0R7Q==",
 *             userName: "example-user",
 *         }),
 *     },
 *     serviceAccount: {
 *         scopes: [
 *             "userinfo-email",
 *             "compute-ro",
 *             "storage-ro",
 *         ],
 *     },
 * });
 * const serial = pulumi.all([windows.name, windows.zone]).apply(([name, zone]) => gcp.compute.getInstanceSerialPortOutput({
 *     instance: name,
 *     zone: zone,
 *     port: 4,
 * }));
 * export const serialOut = serial.apply(serial => serial.contents);
 * ```
 */
export function getInstanceSerialPort(args: GetInstanceSerialPortArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceSerialPortResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:compute/getInstanceSerialPort:getInstanceSerialPort", {
        "instance": args.instance,
        "port": args.port,
        "project": args.project,
        "zone": args.zone,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstanceSerialPort.
 */
export interface GetInstanceSerialPortArgs {
    /**
     * The name of the Compute Instance to read output from.
     */
    instance: string;
    /**
     * The number of the serial port to read output from. Possible values are 1-4.
     *
     * - - -
     */
    port: number;
    /**
     * The project in which the Compute Instance exists. If it
     * is not provided, the provider project is used.
     */
    project?: string;
    /**
     * The zone in which the Compute Instance exists.
     * If it is not provided, the provider zone is used.
     */
    zone?: string;
}

/**
 * A collection of values returned by getInstanceSerialPort.
 */
export interface GetInstanceSerialPortResult {
    /**
     * The output of the serial port. Serial port output is available only when the VM instance is running, and logs are limited to the most recent 1 MB of output per port.
     */
    readonly contents: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly instance: string;
    readonly port: number;
    readonly project: string;
    readonly zone: string;
}
/**
 * Get the serial port output from a Compute Instance. For more information see
 * the official [API](https://cloud.google.com/compute/docs/instances/viewing-serial-port-output) documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const serial = gcp.compute.getInstanceSerialPort({
 *     instance: "my-instance",
 *     zone: "us-central1-a",
 *     port: 1,
 * });
 * export const serialOut = serial.then(serial => serial.contents);
 * ```
 *
 * Using the serial port output to generate a windows password, derived from the [official guide](https://cloud.google.com/compute/docs/instances/windows/automate-pw-generation):
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const windows = new gcp.compute.Instance("windows", {
 *     networkInterfaces: [{
 *         accessConfigs: [{}],
 *         network: "default",
 *     }],
 *     name: "windows-instance",
 *     machineType: "e2-medium",
 *     zone: "us-central1-a",
 *     bootDisk: {
 *         initializeParams: {
 *             image: "windows-cloud/windows-2019",
 *         },
 *     },
 *     metadata: {
 *         "serial-port-logging-enable": "TRUE",
 *         "windows-keys": JSON.stringify({
 *             email: "example.user@example.com",
 *             expireOn: "2020-04-14T01:37:19Z",
 *             exponent: "AQAB",
 *             modulus: "wgsquN4IBNPqIUnu+h/5Za1kujb2YRhX1vCQVQAkBwnWigcCqOBVfRa5JoZfx6KIvEXjWqa77jPvlsxM4WPqnDIM2qiK36up3SKkYwFjff6F2ni/ry8vrwXCX3sGZ1hbIHlK0O012HpA3ISeEswVZmX2X67naOvJXfY5v0hGPWqCADao+xVxrmxsZD4IWnKl1UaZzI5lhAzr8fw6utHwx1EZ/MSgsEki6tujcZfN+GUDRnmJGQSnPTXmsf7Q4DKreTZk49cuyB3prV91S0x3DYjCUpSXrkVy1Ha5XicGD/q+ystuFsJnrrhbNXJbpSjM6sjo/aduAkZJl4FmOt0R7Q==",
 *             userName: "example-user",
 *         }),
 *     },
 *     serviceAccount: {
 *         scopes: [
 *             "userinfo-email",
 *             "compute-ro",
 *             "storage-ro",
 *         ],
 *     },
 * });
 * const serial = pulumi.all([windows.name, windows.zone]).apply(([name, zone]) => gcp.compute.getInstanceSerialPortOutput({
 *     instance: name,
 *     zone: zone,
 *     port: 4,
 * }));
 * export const serialOut = serial.apply(serial => serial.contents);
 * ```
 */
export function getInstanceSerialPortOutput(args: GetInstanceSerialPortOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetInstanceSerialPortResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:compute/getInstanceSerialPort:getInstanceSerialPort", {
        "instance": args.instance,
        "port": args.port,
        "project": args.project,
        "zone": args.zone,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstanceSerialPort.
 */
export interface GetInstanceSerialPortOutputArgs {
    /**
     * The name of the Compute Instance to read output from.
     */
    instance: pulumi.Input<string>;
    /**
     * The number of the serial port to read output from. Possible values are 1-4.
     *
     * - - -
     */
    port: pulumi.Input<number>;
    /**
     * The project in which the Compute Instance exists. If it
     * is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The zone in which the Compute Instance exists.
     * If it is not provided, the provider zone is used.
     */
    zone?: pulumi.Input<string>;
}
