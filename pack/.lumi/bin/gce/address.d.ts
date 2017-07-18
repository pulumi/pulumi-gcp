import * as lumi from "@lumi/lumi";
export declare class Address extends lumi.NamedResource implements AddressArgs {
    readonly address: string;
    readonly addressName?: string;
    readonly project?: string;
    readonly region?: string;
    readonly selfLink: string;
    constructor(name: string, args: AddressArgs);
}
export interface AddressArgs {
    readonly addressName?: string;
    readonly project?: string;
    readonly region?: string;
}

