module github.com/pulumi/pulumi-gcp/provider/v5

go 1.16

require (
	github.com/Sirupsen/logrus v1.0.5 // indirect
	github.com/go-ldap/ldap v3.0.2+incompatible // indirect
	github.com/hashicorp/terraform-provider-google-beta v1.20.1-0.20210315160117-642085ce9b99
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.4.0
	github.com/pulumi/pulumi/pkg/v3 v3.6.0
	github.com/pulumi/pulumi/sdk/v3 v3.6.0
	gopkg.in/asn1-ber.v1 v1.0.0-20181015200546-f715ec2f112d // indirect
)

replace (
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20201218231525-9cca98608a5e
	github.com/hashicorp/terraform-provider-google-beta => github.com/pulumi/terraform-provider-google-beta v0.0.0-20210629200043-d28ec8b9f167
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
