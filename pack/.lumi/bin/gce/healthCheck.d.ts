import * as lumi from "@lumi/lumi";
export declare class HealthCheck extends lumi.NamedResource implements HealthCheckArgs {
    readonly checkIntervalSec?: number;
    readonly description?: string;
    readonly healthyThreshold?: number;
    readonly httpHealthCheck?: {
        host?: string;
        port?: number;
        proxyHeader?: string;
        requestPath?: string;
    }[];
    readonly httpsHealthCheck?: {
        host?: string;
        port?: number;
        proxyHeader?: string;
        requestPath?: string;
    }[];
    readonly healthCheckName?: string;
    readonly project: string;
    readonly selfLink: string;
    readonly sslHealthCheck?: {
        port?: number;
        proxyHeader?: string;
        request?: string;
        response?: string;
    }[];
    readonly tcpHealthCheck?: {
        port?: number;
        proxyHeader?: string;
        request?: string;
        response?: string;
    }[];
    readonly timeoutSec?: number;
    readonly unhealthyThreshold?: number;
    constructor(name: string, args: HealthCheckArgs);
}
export interface HealthCheckArgs {
    readonly checkIntervalSec?: number;
    readonly description?: string;
    readonly healthyThreshold?: number;
    readonly httpHealthCheck?: {
        host?: string;
        port?: number;
        proxyHeader?: string;
        requestPath?: string;
    }[];
    readonly httpsHealthCheck?: {
        host?: string;
        port?: number;
        proxyHeader?: string;
        requestPath?: string;
    }[];
    readonly healthCheckName?: string;
    readonly project?: string;
    readonly sslHealthCheck?: {
        port?: number;
        proxyHeader?: string;
        request?: string;
        response?: string;
    }[];
    readonly tcpHealthCheck?: {
        port?: number;
        proxyHeader?: string;
        request?: string;
        response?: string;
    }[];
    readonly timeoutSec?: number;
    readonly unhealthyThreshold?: number;
}

