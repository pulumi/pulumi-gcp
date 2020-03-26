module github.com/pulumi/pulumi-gcp/examples

go 1.13

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/pulumi/pulumi-gcp/sdk => ../sdk

)

require (
	github.com/pulumi/pulumi/pkg v0.0.0-20200325225746-80f1989600a3
	github.com/stretchr/testify v1.5.1
)
