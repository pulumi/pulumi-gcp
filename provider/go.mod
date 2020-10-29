module github.com/pulumi/pulumi-gcp/provider/v4

go 1.14

require (
	github.com/hashicorp/terraform-provider-google-beta v0.0.0-20200309221941-5fc1579be217
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.11.1-0.20201020163502-64cff1e50894
	github.com/pulumi/pulumi/sdk/v2 v2.12.0
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20200910230100-328eb4ff41df
	github.com/hashicorp/terraform-provider-google-beta => github.com/pulumi/terraform-provider-google-beta v0.0.0-20201029141205-9b8585a89633
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
