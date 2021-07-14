module github.com/pulumi/pulumi-gcp/provider/v5

go 1.16

require (
	github.com/hashicorp/terraform-provider-google-beta v1.20.1-0.20210315160117-642085ce9b99
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.4.1-0.20210714215802-5020116ac4e6
	github.com/pulumi/pulumi/pkg/v3 v3.7.1-0.20210714212650-083fc64ff547 // indirect
	github.com/pulumi/pulumi/sdk/v3 v3.7.0
)

replace (
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20201218231525-9cca98608a5e
	github.com/hashicorp/terraform-provider-google-beta => github.com/pulumi/terraform-provider-google-beta v0.0.0-20210713093432-cd048da8bf5b
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
