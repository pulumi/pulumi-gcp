module github.com/pulumi/pulumi-gcp/provider/v5

go 1.16

require (
	cloud.google.com/go/kms v1.0.0 // indirect
	github.com/hashicorp/terraform-provider-google-beta v1.20.1-0.20210315160117-642085ce9b99
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.9.0
	github.com/pulumi/pulumi/sdk/v3 v3.14.1-0.20211007222624-789e39219452
)

replace (
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20201218231525-9cca98608a5e
	github.com/hashicorp/terraform-provider-google-beta => github.com/pulumi/terraform-provider-google-beta v0.0.0-20211007130031-53788bbfc3d1
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
