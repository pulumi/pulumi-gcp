module github.com/pulumi/pulumi-gcp/examples/v2

go 1.13

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/pulumi/pulumi-gcp/sdk => ../sdk

)

require (
	github.com/pulumi/pulumi/pkg v1.13.1
	github.com/stretchr/testify v1.5.1
)
