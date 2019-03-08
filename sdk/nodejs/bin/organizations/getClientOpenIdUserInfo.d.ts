import * as pulumi from "@pulumi/pulumi";
export declare function getClientOpenIdUserInfo(opts?: pulumi.InvokeOptions): Promise<GetClientOpenIdUserInfoResult>;
/**
 * A collection of values returned by getClientOpenIdUserInfo.
 */
export interface GetClientOpenIdUserInfoResult {
    readonly email: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
