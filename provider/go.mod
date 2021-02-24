module github.com/pulumi/pulumi-gcp/provider/v4

go 1.15

require (
	github.com/hashicorp/terraform-provider-google-beta/v3 v3.51.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.19.0
	github.com/pulumi/pulumi/sdk/v2 v2.20.1-0.20210212181059-f4b0fa86fedc
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20201218231525-9cca98608a5e
	github.com/hashicorp/terraform-provider-google-beta/v3 => github.com/pulumi/terraform-provider-google-beta/v3 v3.0.0-20210224104146-c00564dc82ae
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
