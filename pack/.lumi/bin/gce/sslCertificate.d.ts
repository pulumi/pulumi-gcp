import * as lumi from "@lumi/lumi";
export declare class SslCertificate extends lumi.NamedResource implements SslCertificateArgs {
    readonly certificate: string;
    readonly description?: string;
    readonly certificateId: string;
    readonly sslCertificateName: string;
    readonly namePrefix?: string;
    readonly privateKey: string;
    readonly project?: string;
    readonly selfLink: string;
    constructor(name: string, args: SslCertificateArgs);
}
export interface SslCertificateArgs {
    readonly certificate: string;
    readonly description?: string;
    readonly sslCertificateName?: string;
    readonly namePrefix?: string;
    readonly privateKey: string;
    readonly project?: string;
}

