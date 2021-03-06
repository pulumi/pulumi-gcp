// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information about a HealthCheck.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-gcp/sdk/v5/go/gcp/compute"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := compute.LookupHealthCheck(ctx, &compute.LookupHealthCheckArgs{
// 			Name: "my-hc",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupHealthCheck(ctx *pulumi.Context, args *LookupHealthCheckArgs, opts ...pulumi.InvokeOption) (*LookupHealthCheckResult, error) {
	var rv LookupHealthCheckResult
	err := ctx.Invoke("gcp:compute/getHealthCheck:getHealthCheck", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHealthCheck.
type LookupHealthCheckArgs struct {
	// Name of the resource.
	Name string `pulumi:"name"`
	// The ID of the project in which the resource belongs. If it
	// is not provided, the provider project is used.
	Project *string `pulumi:"project"`
}

// A collection of values returned by getHealthCheck.
type LookupHealthCheckResult struct {
	CheckIntervalSec  int                              `pulumi:"checkIntervalSec"`
	CreationTimestamp string                           `pulumi:"creationTimestamp"`
	Description       string                           `pulumi:"description"`
	GrpcHealthChecks  []GetHealthCheckGrpcHealthCheck  `pulumi:"grpcHealthChecks"`
	HealthyThreshold  int                              `pulumi:"healthyThreshold"`
	Http2HealthChecks []GetHealthCheckHttp2HealthCheck `pulumi:"http2HealthChecks"`
	HttpHealthChecks  []GetHealthCheckHttpHealthCheck  `pulumi:"httpHealthChecks"`
	HttpsHealthChecks []GetHealthCheckHttpsHealthCheck `pulumi:"httpsHealthChecks"`
	// The provider-assigned unique ID for this managed resource.
	Id                 string                         `pulumi:"id"`
	LogConfigs         []GetHealthCheckLogConfig      `pulumi:"logConfigs"`
	Name               string                         `pulumi:"name"`
	Project            *string                        `pulumi:"project"`
	SelfLink           string                         `pulumi:"selfLink"`
	SslHealthChecks    []GetHealthCheckSslHealthCheck `pulumi:"sslHealthChecks"`
	TcpHealthChecks    []GetHealthCheckTcpHealthCheck `pulumi:"tcpHealthChecks"`
	TimeoutSec         int                            `pulumi:"timeoutSec"`
	Type               string                         `pulumi:"type"`
	UnhealthyThreshold int                            `pulumi:"unhealthyThreshold"`
}
