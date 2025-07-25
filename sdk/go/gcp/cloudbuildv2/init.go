// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudbuildv2

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
	case "gcp:cloudbuildv2/connection:Connection":
		r = &Connection{}
	case "gcp:cloudbuildv2/connectionIAMBinding:ConnectionIAMBinding":
		r = &ConnectionIAMBinding{}
	case "gcp:cloudbuildv2/connectionIAMMember:ConnectionIAMMember":
		r = &ConnectionIAMMember{}
	case "gcp:cloudbuildv2/connectionIAMPolicy:ConnectionIAMPolicy":
		r = &ConnectionIAMPolicy{}
	case "gcp:cloudbuildv2/repository:Repository":
		r = &Repository{}
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
		"cloudbuildv2/connection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"cloudbuildv2/connectionIAMBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"cloudbuildv2/connectionIAMMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"cloudbuildv2/connectionIAMPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"cloudbuildv2/repository",
		&module{version},
	)
}
