import * as lumi from "@lumi/lumi";
export declare class GlobalAddress extends lumi.NamedResource implements GlobalAddressArgs {
    readonly address: string;
    readonly globalAddressName?: string;
    readonly project?: string;
    readonly selfLink: string;
    constructor(name: string, args: GlobalAddressArgs);
}
export interface GlobalAddressArgs {
    readonly globalAddressName?: string;
    readonly project?: string;
}

