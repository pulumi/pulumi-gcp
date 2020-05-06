module github.com/pulumi/pulumi-gcp/provider/v3

go 1.13

require (
	github.com/hashicorp/terraform-plugin-sdk v1.7.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.3.0
	github.com/pulumi/pulumi/pkg/v2 v2.1.1-0.20200505193935-7b446d6c55ad // indirect
	github.com/pulumi/pulumi/sdk/v2 v2.1.1-0.20200505193935-7b446d6c55ad
	github.com/terraform-providers/terraform-provider-google-beta v0.0.0-20200309221941-5fc1579be217
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-google-beta => github.com/pulumi/terraform-provider-google-beta v0.0.0-20200504225143-360d09016661
	google.golang.org/api => google.golang.org/api v0.22.0
)
