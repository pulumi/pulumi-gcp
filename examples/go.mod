module github.com/pulumi/pulumi-gcp/examples

go 1.13

replace github.com/pulumi/pulumi-gcp/sdk => ../sdk

require (
	github.com/pulumi/pulumi/pkg v0.0.0-20200323215703-1d4a75674b2e
	github.com/stretchr/testify v1.5.1
)
