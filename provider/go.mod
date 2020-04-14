module github.com/pulumi/pulumi-gcp/provider/v3

go 1.13

require (
	github.com/hashicorp/terraform-plugin-sdk v1.4.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.0.0-20200414133247-94746eebdf3b
	github.com/pulumi/pulumi/sdk/v2 v2.0.0-beta.3.0.20200412211925-02a8746a9bcc
	github.com/terraform-providers/terraform-provider-google-beta v0.0.0-20200309221941-5fc1579be217
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-google-beta => github.com/pulumi/terraform-provider-google-beta v0.0.0-20200410131929-8df3c970cf0b
	google.golang.org/api => google.golang.org/api v0.16.0
)
