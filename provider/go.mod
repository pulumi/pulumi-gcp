module github.com/pulumi/pulumi-gcp/provider

go 1.13

require (
	github.com/hashicorp/terraform-plugin-sdk v1.4.0
	github.com/pulumi/pulumi-terraform-bridge v1.8.3
	github.com/pulumi/pulumi/sdk v0.0.0-20200323215703-1d4a75674b2e
	github.com/terraform-providers/terraform-provider-google-beta v0.0.0-20200309221941-5fc1579be217

)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-google-beta => github.com/pulumi/terraform-provider-google-beta v0.0.0-20200324140421-7bf2ed0276b7
)
