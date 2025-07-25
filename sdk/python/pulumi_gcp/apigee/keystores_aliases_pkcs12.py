# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['KeystoresAliasesPkcs12Args', 'KeystoresAliasesPkcs12']

@pulumi.input_type
class KeystoresAliasesPkcs12Args:
    def __init__(__self__, *,
                 alias: pulumi.Input[_builtins.str],
                 environment: pulumi.Input[_builtins.str],
                 file: pulumi.Input[_builtins.str],
                 filehash: pulumi.Input[_builtins.str],
                 keystore: pulumi.Input[_builtins.str],
                 org_id: pulumi.Input[_builtins.str],
                 password: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a KeystoresAliasesPkcs12 resource.
        :param pulumi.Input[_builtins.str] alias: Alias Name
        :param pulumi.Input[_builtins.str] environment: Environment associated with the alias
        :param pulumi.Input[_builtins.str] file: PKCS12 file content
               
               - - -
        :param pulumi.Input[_builtins.str] filehash: Hash of the pkcs file
        :param pulumi.Input[_builtins.str] keystore: Keystore Name
        :param pulumi.Input[_builtins.str] org_id: Organization ID associated with the alias, without organization/ prefix
        :param pulumi.Input[_builtins.str] password: Password for the PKCS12 file if it's encrypted
        """
        pulumi.set(__self__, "alias", alias)
        pulumi.set(__self__, "environment", environment)
        pulumi.set(__self__, "file", file)
        pulumi.set(__self__, "filehash", filehash)
        pulumi.set(__self__, "keystore", keystore)
        pulumi.set(__self__, "org_id", org_id)
        if password is not None:
            pulumi.set(__self__, "password", password)

    @_builtins.property
    @pulumi.getter
    def alias(self) -> pulumi.Input[_builtins.str]:
        """
        Alias Name
        """
        return pulumi.get(self, "alias")

    @alias.setter
    def alias(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "alias", value)

    @_builtins.property
    @pulumi.getter
    def environment(self) -> pulumi.Input[_builtins.str]:
        """
        Environment associated with the alias
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "environment", value)

    @_builtins.property
    @pulumi.getter
    def file(self) -> pulumi.Input[_builtins.str]:
        """
        PKCS12 file content

        - - -
        """
        return pulumi.get(self, "file")

    @file.setter
    def file(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "file", value)

    @_builtins.property
    @pulumi.getter
    def filehash(self) -> pulumi.Input[_builtins.str]:
        """
        Hash of the pkcs file
        """
        return pulumi.get(self, "filehash")

    @filehash.setter
    def filehash(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "filehash", value)

    @_builtins.property
    @pulumi.getter
    def keystore(self) -> pulumi.Input[_builtins.str]:
        """
        Keystore Name
        """
        return pulumi.get(self, "keystore")

    @keystore.setter
    def keystore(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "keystore", value)

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[_builtins.str]:
        """
        Organization ID associated with the alias, without organization/ prefix
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "org_id", value)

    @_builtins.property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Password for the PKCS12 file if it's encrypted
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "password", value)


@pulumi.input_type
class _KeystoresAliasesPkcs12State:
    def __init__(__self__, *,
                 alias: Optional[pulumi.Input[_builtins.str]] = None,
                 certs_infos: Optional[pulumi.Input[Sequence[pulumi.Input['KeystoresAliasesPkcs12CertsInfoArgs']]]] = None,
                 environment: Optional[pulumi.Input[_builtins.str]] = None,
                 file: Optional[pulumi.Input[_builtins.str]] = None,
                 filehash: Optional[pulumi.Input[_builtins.str]] = None,
                 keystore: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 password: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering KeystoresAliasesPkcs12 resources.
        :param pulumi.Input[_builtins.str] alias: Alias Name
        :param pulumi.Input[Sequence[pulumi.Input['KeystoresAliasesPkcs12CertsInfoArgs']]] certs_infos: Chain of certificates under this alias.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] environment: Environment associated with the alias
        :param pulumi.Input[_builtins.str] file: PKCS12 file content
               
               - - -
        :param pulumi.Input[_builtins.str] filehash: Hash of the pkcs file
        :param pulumi.Input[_builtins.str] keystore: Keystore Name
        :param pulumi.Input[_builtins.str] org_id: Organization ID associated with the alias, without organization/ prefix
        :param pulumi.Input[_builtins.str] password: Password for the PKCS12 file if it's encrypted
        :param pulumi.Input[_builtins.str] type: Optional.Type of Alias
        """
        if alias is not None:
            pulumi.set(__self__, "alias", alias)
        if certs_infos is not None:
            pulumi.set(__self__, "certs_infos", certs_infos)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if file is not None:
            pulumi.set(__self__, "file", file)
        if filehash is not None:
            pulumi.set(__self__, "filehash", filehash)
        if keystore is not None:
            pulumi.set(__self__, "keystore", keystore)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter
    def alias(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Alias Name
        """
        return pulumi.get(self, "alias")

    @alias.setter
    def alias(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "alias", value)

    @_builtins.property
    @pulumi.getter(name="certsInfos")
    def certs_infos(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['KeystoresAliasesPkcs12CertsInfoArgs']]]]:
        """
        Chain of certificates under this alias.
        Structure is documented below.
        """
        return pulumi.get(self, "certs_infos")

    @certs_infos.setter
    def certs_infos(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['KeystoresAliasesPkcs12CertsInfoArgs']]]]):
        pulumi.set(self, "certs_infos", value)

    @_builtins.property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Environment associated with the alias
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "environment", value)

    @_builtins.property
    @pulumi.getter
    def file(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        PKCS12 file content

        - - -
        """
        return pulumi.get(self, "file")

    @file.setter
    def file(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "file", value)

    @_builtins.property
    @pulumi.getter
    def filehash(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Hash of the pkcs file
        """
        return pulumi.get(self, "filehash")

    @filehash.setter
    def filehash(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "filehash", value)

    @_builtins.property
    @pulumi.getter
    def keystore(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Keystore Name
        """
        return pulumi.get(self, "keystore")

    @keystore.setter
    def keystore(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "keystore", value)

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Organization ID associated with the alias, without organization/ prefix
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "org_id", value)

    @_builtins.property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Password for the PKCS12 file if it's encrypted
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "password", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Optional.Type of Alias
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)


@pulumi.type_token("gcp:apigee/keystoresAliasesPkcs12:KeystoresAliasesPkcs12")
class KeystoresAliasesPkcs12(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alias: Optional[pulumi.Input[_builtins.str]] = None,
                 environment: Optional[pulumi.Input[_builtins.str]] = None,
                 file: Optional[pulumi.Input[_builtins.str]] = None,
                 filehash: Optional[pulumi.Input[_builtins.str]] = None,
                 keystore: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 password: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        An alias from a pkcs12 file.

        To get more information about KeystoresAliasesPkcs12, see:

        * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.keystores.aliases)
        * How-to Guides
            * [Keystores Aliases](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.keystores.aliases)

        ## Import

        KeystoresAliasesPkcs12 can be imported using any of these accepted formats:

        * `organizations/{{org_id}}/environments/{{environment}}/keystores/{{keystore}}/aliases/{{alias}}`

        * `{{org_id}}/{{environment}}/{{keystore}}/{{alias}}`

        When using the `pulumi import` command, KeystoresAliasesPkcs12 can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:apigee/keystoresAliasesPkcs12:KeystoresAliasesPkcs12 default organizations/{{org_id}}/environments/{{environment}}/keystores/{{keystore}}/aliases/{{alias}}
        ```

        ```sh
        $ pulumi import gcp:apigee/keystoresAliasesPkcs12:KeystoresAliasesPkcs12 default {{org_id}}/{{environment}}/{{keystore}}/{{alias}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] alias: Alias Name
        :param pulumi.Input[_builtins.str] environment: Environment associated with the alias
        :param pulumi.Input[_builtins.str] file: PKCS12 file content
               
               - - -
        :param pulumi.Input[_builtins.str] filehash: Hash of the pkcs file
        :param pulumi.Input[_builtins.str] keystore: Keystore Name
        :param pulumi.Input[_builtins.str] org_id: Organization ID associated with the alias, without organization/ prefix
        :param pulumi.Input[_builtins.str] password: Password for the PKCS12 file if it's encrypted
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KeystoresAliasesPkcs12Args,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        An alias from a pkcs12 file.

        To get more information about KeystoresAliasesPkcs12, see:

        * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.keystores.aliases)
        * How-to Guides
            * [Keystores Aliases](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.keystores.aliases)

        ## Import

        KeystoresAliasesPkcs12 can be imported using any of these accepted formats:

        * `organizations/{{org_id}}/environments/{{environment}}/keystores/{{keystore}}/aliases/{{alias}}`

        * `{{org_id}}/{{environment}}/{{keystore}}/{{alias}}`

        When using the `pulumi import` command, KeystoresAliasesPkcs12 can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:apigee/keystoresAliasesPkcs12:KeystoresAliasesPkcs12 default organizations/{{org_id}}/environments/{{environment}}/keystores/{{keystore}}/aliases/{{alias}}
        ```

        ```sh
        $ pulumi import gcp:apigee/keystoresAliasesPkcs12:KeystoresAliasesPkcs12 default {{org_id}}/{{environment}}/{{keystore}}/{{alias}}
        ```

        :param str resource_name: The name of the resource.
        :param KeystoresAliasesPkcs12Args args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KeystoresAliasesPkcs12Args, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alias: Optional[pulumi.Input[_builtins.str]] = None,
                 environment: Optional[pulumi.Input[_builtins.str]] = None,
                 file: Optional[pulumi.Input[_builtins.str]] = None,
                 filehash: Optional[pulumi.Input[_builtins.str]] = None,
                 keystore: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 password: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KeystoresAliasesPkcs12Args.__new__(KeystoresAliasesPkcs12Args)

            if alias is None and not opts.urn:
                raise TypeError("Missing required property 'alias'")
            __props__.__dict__["alias"] = alias
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            if file is None and not opts.urn:
                raise TypeError("Missing required property 'file'")
            __props__.__dict__["file"] = file
            if filehash is None and not opts.urn:
                raise TypeError("Missing required property 'filehash'")
            __props__.__dict__["filehash"] = filehash
            if keystore is None and not opts.urn:
                raise TypeError("Missing required property 'keystore'")
            __props__.__dict__["keystore"] = keystore
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["password"] = password
            __props__.__dict__["certs_infos"] = None
            __props__.__dict__["type"] = None
        super(KeystoresAliasesPkcs12, __self__).__init__(
            'gcp:apigee/keystoresAliasesPkcs12:KeystoresAliasesPkcs12',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alias: Optional[pulumi.Input[_builtins.str]] = None,
            certs_infos: Optional[pulumi.Input[Sequence[pulumi.Input[Union['KeystoresAliasesPkcs12CertsInfoArgs', 'KeystoresAliasesPkcs12CertsInfoArgsDict']]]]] = None,
            environment: Optional[pulumi.Input[_builtins.str]] = None,
            file: Optional[pulumi.Input[_builtins.str]] = None,
            filehash: Optional[pulumi.Input[_builtins.str]] = None,
            keystore: Optional[pulumi.Input[_builtins.str]] = None,
            org_id: Optional[pulumi.Input[_builtins.str]] = None,
            password: Optional[pulumi.Input[_builtins.str]] = None,
            type: Optional[pulumi.Input[_builtins.str]] = None) -> 'KeystoresAliasesPkcs12':
        """
        Get an existing KeystoresAliasesPkcs12 resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] alias: Alias Name
        :param pulumi.Input[Sequence[pulumi.Input[Union['KeystoresAliasesPkcs12CertsInfoArgs', 'KeystoresAliasesPkcs12CertsInfoArgsDict']]]] certs_infos: Chain of certificates under this alias.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] environment: Environment associated with the alias
        :param pulumi.Input[_builtins.str] file: PKCS12 file content
               
               - - -
        :param pulumi.Input[_builtins.str] filehash: Hash of the pkcs file
        :param pulumi.Input[_builtins.str] keystore: Keystore Name
        :param pulumi.Input[_builtins.str] org_id: Organization ID associated with the alias, without organization/ prefix
        :param pulumi.Input[_builtins.str] password: Password for the PKCS12 file if it's encrypted
        :param pulumi.Input[_builtins.str] type: Optional.Type of Alias
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KeystoresAliasesPkcs12State.__new__(_KeystoresAliasesPkcs12State)

        __props__.__dict__["alias"] = alias
        __props__.__dict__["certs_infos"] = certs_infos
        __props__.__dict__["environment"] = environment
        __props__.__dict__["file"] = file
        __props__.__dict__["filehash"] = filehash
        __props__.__dict__["keystore"] = keystore
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["password"] = password
        __props__.__dict__["type"] = type
        return KeystoresAliasesPkcs12(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def alias(self) -> pulumi.Output[_builtins.str]:
        """
        Alias Name
        """
        return pulumi.get(self, "alias")

    @_builtins.property
    @pulumi.getter(name="certsInfos")
    def certs_infos(self) -> pulumi.Output[Sequence['outputs.KeystoresAliasesPkcs12CertsInfo']]:
        """
        Chain of certificates under this alias.
        Structure is documented below.
        """
        return pulumi.get(self, "certs_infos")

    @_builtins.property
    @pulumi.getter
    def environment(self) -> pulumi.Output[_builtins.str]:
        """
        Environment associated with the alias
        """
        return pulumi.get(self, "environment")

    @_builtins.property
    @pulumi.getter
    def file(self) -> pulumi.Output[_builtins.str]:
        """
        PKCS12 file content

        - - -
        """
        return pulumi.get(self, "file")

    @_builtins.property
    @pulumi.getter
    def filehash(self) -> pulumi.Output[_builtins.str]:
        """
        Hash of the pkcs file
        """
        return pulumi.get(self, "filehash")

    @_builtins.property
    @pulumi.getter
    def keystore(self) -> pulumi.Output[_builtins.str]:
        """
        Keystore Name
        """
        return pulumi.get(self, "keystore")

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[_builtins.str]:
        """
        Organization ID associated with the alias, without organization/ prefix
        """
        return pulumi.get(self, "org_id")

    @_builtins.property
    @pulumi.getter
    def password(self) -> pulumi.Output[_builtins.str]:
        """
        Password for the PKCS12 file if it's encrypted
        """
        return pulumi.get(self, "password")

    @_builtins.property
    @pulumi.getter
    def type(self) -> pulumi.Output[_builtins.str]:
        """
        Optional.Type of Alias
        """
        return pulumi.get(self, "type")

