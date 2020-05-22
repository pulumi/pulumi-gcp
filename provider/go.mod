module github.com/pulumi/pulumi-gcp/provider/v3

go 1.13

require (
	github.com/hashicorp/terraform-plugin-sdk v1.11.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.3.3
	github.com/pulumi/pulumi/pkg/v2 v2.2.2-0.20200522013710-a83df2061170 // indirect
	github.com/pulumi/pulumi/sdk/v2 v2.2.2-0.20200522013710-a83df2061170
	github.com/terraform-providers/terraform-provider-google-beta v0.0.0-20200309221941-5fc1579be217
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-google-beta => github.com/pulumi/terraform-provider-google-beta v0.0.0-20200519155201-7b4585be941e
	google.golang.org/api => google.golang.org/api v0.22.0
)
