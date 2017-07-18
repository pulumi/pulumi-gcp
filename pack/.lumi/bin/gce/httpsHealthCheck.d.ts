import * as lumi from "@lumi/lumi";
export declare class HttpsHealthCheck extends lumi.NamedResource implements HttpsHealthCheckArgs {
    readonly checkIntervalSec?: number;
    readonly description?: string;
    readonly healthyThreshold?: number;
    readonly host?: string;
    readonly httpsHealthCheckName?: string;
    readonly port?: number;
    readonly project?: string;
    readonly requestPath?: string;
    readonly selfLink: string;
    readonly timeoutSec?: number;
    readonly unhealthyThreshold?: number;
    constructor(name: string, args: HttpsHealthCheckArgs);
}
export interface HttpsHealthCheckArgs {
    readonly checkIntervalSec?: number;
    readonly description?: string;
    readonly healthyThreshold?: number;
    readonly host?: string;
    readonly httpsHealthCheckName?: string;
    readonly port?: number;
    readonly project?: string;
    readonly requestPath?: string;
    readonly timeoutSec?: number;
    readonly unhealthyThreshold?: number;
}

