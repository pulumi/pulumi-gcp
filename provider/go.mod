module github.com/pulumi/pulumi-gcp/provider/v3

go 1.13

require (
	github.com/hashicorp/terraform-plugin-sdk v1.4.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.2.0
	github.com/pulumi/pulumi/sdk/v2 v2.0.1-0.20200424001829-090f390d7b1a
	github.com/terraform-providers/terraform-provider-google-beta v0.0.0-20200309221941-5fc1579be217
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-google-beta => github.com/pulumi/terraform-provider-google-beta v0.0.0-20200429210723-d7c32193fd04
	google.golang.org/api => google.golang.org/api v0.20.0
)
