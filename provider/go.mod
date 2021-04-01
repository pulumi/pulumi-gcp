module github.com/pulumi/pulumi-gcp/provider/v5

go 1.16

require (
	github.com/hashicorp/terraform-provider-google-beta v1.20.1-0.20210315160117-642085ce9b99
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.0.0-20210325101119-03683ad99004
	github.com/pulumi/pulumi/sdk/v3 v3.0.0-beta.1
	github.com/pulumi/pulumi/pkg/v3 v3.0.0-beta.1
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20201218231525-9cca98608a5e
	github.com/hashicorp/terraform-provider-google-beta => github.com/pulumi/terraform-provider-google-beta v0.0.0-20210330102137-ce4ce5c6aec9
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
