module github.com/pulumi/pulumi-gcp/provider

go 1.13

require (
	github.com/hashicorp/terraform-plugin-sdk v1.4.0
	github.com/pulumi/pulumi-terraform-bridge v1.8.4-0.20200326020012-c5fd7318ced1
	github.com/pulumi/pulumi/sdk v1.13.2-0.20200330065939-846897448c64
	github.com/terraform-providers/terraform-provider-google-beta v0.0.0-20200309221941-5fc1579be217
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-google-beta => github.com/pulumi/terraform-provider-google-beta v0.0.0-20200324140421-7bf2ed0276b7
	google.golang.org/api => google.golang.org/api v0.16.0
)
