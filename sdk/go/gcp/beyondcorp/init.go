// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package beyondcorp

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-gcp/sdk/v8/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "gcp:beyondcorp/appConnection:AppConnection":
		r = &AppConnection{}
	case "gcp:beyondcorp/appConnector:AppConnector":
		r = &AppConnector{}
	case "gcp:beyondcorp/appGateway:AppGateway":
		r = &AppGateway{}
	case "gcp:beyondcorp/application:Application":
		r = &Application{}
	case "gcp:beyondcorp/applicationIamBinding:ApplicationIamBinding":
		r = &ApplicationIamBinding{}
	case "gcp:beyondcorp/applicationIamMember:ApplicationIamMember":
		r = &ApplicationIamMember{}
	case "gcp:beyondcorp/applicationIamPolicy:ApplicationIamPolicy":
		r = &ApplicationIamPolicy{}
	case "gcp:beyondcorp/securityGateway:SecurityGateway":
		r = &SecurityGateway{}
	case "gcp:beyondcorp/securityGatewayApplication:SecurityGatewayApplication":
		r = &SecurityGatewayApplication{}
	case "gcp:beyondcorp/securityGatewayApplicationIamBinding:SecurityGatewayApplicationIamBinding":
		r = &SecurityGatewayApplicationIamBinding{}
	case "gcp:beyondcorp/securityGatewayApplicationIamMember:SecurityGatewayApplicationIamMember":
		r = &SecurityGatewayApplicationIamMember{}
	case "gcp:beyondcorp/securityGatewayApplicationIamPolicy:SecurityGatewayApplicationIamPolicy":
		r = &SecurityGatewayApplicationIamPolicy{}
	case "gcp:beyondcorp/securityGatewayIamBinding:SecurityGatewayIamBinding":
		r = &SecurityGatewayIamBinding{}
	case "gcp:beyondcorp/securityGatewayIamMember:SecurityGatewayIamMember":
		r = &SecurityGatewayIamMember{}
	case "gcp:beyondcorp/securityGatewayIamPolicy:SecurityGatewayIamPolicy":
		r = &SecurityGatewayIamPolicy{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"gcp",
		"beyondcorp/appConnection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"beyondcorp/appConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"beyondcorp/appGateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"beyondcorp/application",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"beyondcorp/applicationIamBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"beyondcorp/applicationIamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"beyondcorp/applicationIamPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"beyondcorp/securityGateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"beyondcorp/securityGatewayApplication",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"beyondcorp/securityGatewayApplicationIamBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"beyondcorp/securityGatewayApplicationIamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"beyondcorp/securityGatewayApplicationIamPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"beyondcorp/securityGatewayIamBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"beyondcorp/securityGatewayIamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"beyondcorp/securityGatewayIamPolicy",
		&module{version},
	)
}
