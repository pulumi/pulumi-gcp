module github.com/pulumi/pulumi-gcp/provider/v3

go 1.14

require (
	github.com/hashicorp/terraform-provider-google-beta v0.0.0-20200309221941-5fc1579be217
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.11.0
	github.com/pulumi/pulumi/sdk/v2 v2.11.3-0.20201009201355-249140242ebb
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20200910230100-328eb4ff41df
	github.com/hashicorp/terraform-provider-google-beta => github.com/pulumi/terraform-provider-google-beta v0.0.0-20201012143323-50a6b1bb4a90
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	google.golang.org/api => google.golang.org/api v0.31.1-0.20200914161323-7b3b1fe2dc94
)
