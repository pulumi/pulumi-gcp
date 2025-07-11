// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package parametermanager

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
	case "gcp:parametermanager/parameter:Parameter":
		r = &Parameter{}
	case "gcp:parametermanager/parameterVersion:ParameterVersion":
		r = &ParameterVersion{}
	case "gcp:parametermanager/regionalParameter:RegionalParameter":
		r = &RegionalParameter{}
	case "gcp:parametermanager/regionalParameterVersion:RegionalParameterVersion":
		r = &RegionalParameterVersion{}
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
		"parametermanager/parameter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"parametermanager/parameterVersion",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"parametermanager/regionalParameter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"parametermanager/regionalParameterVersion",
		&module{version},
	)
}
