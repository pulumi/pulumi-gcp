// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudtasks

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
	case "gcp:cloudtasks/queue:Queue":
		r = &Queue{}
	case "gcp:cloudtasks/queueIamBinding:QueueIamBinding":
		r = &QueueIamBinding{}
	case "gcp:cloudtasks/queueIamMember:QueueIamMember":
		r = &QueueIamMember{}
	case "gcp:cloudtasks/queueIamPolicy:QueueIamPolicy":
		r = &QueueIamPolicy{}
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
		"cloudtasks/queue",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"cloudtasks/queueIamBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"cloudtasks/queueIamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"cloudtasks/queueIamPolicy",
		&module{version},
	)
}
