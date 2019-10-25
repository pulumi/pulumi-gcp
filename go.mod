module github.com/pulumi/pulumi-gcp

go 1.12

require (
	github.com/hashicorp/terraform-plugin-sdk v1.1.1
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.2.0
	github.com/pulumi/pulumi-terraform-bridge v1.1.0
	github.com/stoewer/go-strcase v1.0.2 // indirect
	github.com/stretchr/testify v1.4.0
	github.com/terraform-providers/terraform-provider-google-beta v1.20.0
	github.com/xanzy/ssh-agent v0.2.1 // indirect
)

replace github.com/terraform-providers/terraform-provider-google-beta => github.com/pulumi/terraform-provider-google-beta v0.0.0-20191024092752-92b196bbc9b6
