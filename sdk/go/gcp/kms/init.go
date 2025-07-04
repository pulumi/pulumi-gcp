// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kms

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
	case "gcp:kms/autokeyConfig:AutokeyConfig":
		r = &AutokeyConfig{}
	case "gcp:kms/cryptoKey:CryptoKey":
		r = &CryptoKey{}
	case "gcp:kms/cryptoKeyIAMBinding:CryptoKeyIAMBinding":
		r = &CryptoKeyIAMBinding{}
	case "gcp:kms/cryptoKeyIAMMember:CryptoKeyIAMMember":
		r = &CryptoKeyIAMMember{}
	case "gcp:kms/cryptoKeyIAMPolicy:CryptoKeyIAMPolicy":
		r = &CryptoKeyIAMPolicy{}
	case "gcp:kms/cryptoKeyVersion:CryptoKeyVersion":
		r = &CryptoKeyVersion{}
	case "gcp:kms/ekmConnection:EkmConnection":
		r = &EkmConnection{}
	case "gcp:kms/ekmConnectionIamBinding:EkmConnectionIamBinding":
		r = &EkmConnectionIamBinding{}
	case "gcp:kms/ekmConnectionIamMember:EkmConnectionIamMember":
		r = &EkmConnectionIamMember{}
	case "gcp:kms/ekmConnectionIamPolicy:EkmConnectionIamPolicy":
		r = &EkmConnectionIamPolicy{}
	case "gcp:kms/keyHandle:KeyHandle":
		r = &KeyHandle{}
	case "gcp:kms/keyRing:KeyRing":
		r = &KeyRing{}
	case "gcp:kms/keyRingIAMBinding:KeyRingIAMBinding":
		r = &KeyRingIAMBinding{}
	case "gcp:kms/keyRingIAMMember:KeyRingIAMMember":
		r = &KeyRingIAMMember{}
	case "gcp:kms/keyRingIAMPolicy:KeyRingIAMPolicy":
		r = &KeyRingIAMPolicy{}
	case "gcp:kms/keyRingImportJob:KeyRingImportJob":
		r = &KeyRingImportJob{}
	case "gcp:kms/secretCiphertext:SecretCiphertext":
		r = &SecretCiphertext{}
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
		"kms/autokeyConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"kms/cryptoKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"kms/cryptoKeyIAMBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"kms/cryptoKeyIAMMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"kms/cryptoKeyIAMPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"kms/cryptoKeyVersion",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"kms/ekmConnection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"kms/ekmConnectionIamBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"kms/ekmConnectionIamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"kms/ekmConnectionIamPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"kms/keyHandle",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"kms/keyRing",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"kms/keyRingIAMBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"kms/keyRingIAMMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"kms/keyRingIAMPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"kms/keyRingImportJob",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"gcp",
		"kms/secretCiphertext",
		&module{version},
	)
}
