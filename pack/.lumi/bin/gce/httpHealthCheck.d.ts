import * as lumi from "@lumi/lumi";
export declare class HttpHealthCheck extends lumi.NamedResource implements HttpHealthCheckArgs {
    readonly checkIntervalSec?: number;
    readonly description?: string;
    readonly healthyThreshold?: number;
    readonly host?: string;
    readonly httpHealthCheckName?: string;
    readonly port?: number;
    readonly project: string;
    readonly requestPath?: string;
    readonly selfLink: string;
    readonly timeoutSec?: number;
    readonly unhealthyThreshold?: number;
    constructor(name: string, args: HttpHealthCheckArgs);
}
export interface HttpHealthCheckArgs {
    readonly checkIntervalSec?: number;
    readonly description?: string;
    readonly healthyThreshold?: number;
    readonly host?: string;
    readonly httpHealthCheckName?: string;
    readonly port?: number;
    readonly project?: string;
    readonly requestPath?: string;
    readonly timeoutSec?: number;
    readonly unhealthyThreshold?: number;
}

