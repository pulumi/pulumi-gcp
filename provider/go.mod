module github.com/pulumi/pulumi-gcp/provider/v4

go 1.15

require (
	github.com/hashicorp/terraform-provider-google-beta/v3 v3.51.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.16.0
	github.com/pulumi/pulumi/sdk/v2 v2.15.1-0.20201202214525-260620430c4c
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20200910230100-328eb4ff41df
	github.com/hashicorp/terraform-provider-google-beta/v3 => github.com/pulumi/terraform-provider-google-beta/v3 v3.0.0-20201221155014-6f7c7373cbad
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
