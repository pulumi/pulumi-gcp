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

__all__ = ['PreventionStoredInfoTypeArgs', 'PreventionStoredInfoType']

@pulumi.input_type
class PreventionStoredInfoTypeArgs:
    def __init__(__self__, *,
                 parent: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 dictionary: Optional[pulumi.Input['PreventionStoredInfoTypeDictionaryArgs']] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 large_custom_dictionary: Optional[pulumi.Input['PreventionStoredInfoTypeLargeCustomDictionaryArgs']] = None,
                 regex: Optional[pulumi.Input['PreventionStoredInfoTypeRegexArgs']] = None,
                 stored_info_type_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a PreventionStoredInfoType resource.
        :param pulumi.Input[_builtins.str] parent: The parent of the info type in any of the following formats:
               * `projects/{{project}}`
               * `projects/{{project}}/locations/{{location}}`
               * `organizations/{{organization_id}}`
               * `organizations/{{organization_id}}/locations/{{location}}`
        :param pulumi.Input[_builtins.str] description: A description of the info type.
        :param pulumi.Input['PreventionStoredInfoTypeDictionaryArgs'] dictionary: Dictionary which defines the rule.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] display_name: User set display name of the info type.
        :param pulumi.Input['PreventionStoredInfoTypeLargeCustomDictionaryArgs'] large_custom_dictionary: Dictionary which defines the rule.
               Structure is documented below.
        :param pulumi.Input['PreventionStoredInfoTypeRegexArgs'] regex: Regular expression which defines the rule.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] stored_info_type_id: The storedInfoType ID can contain uppercase and lowercase letters, numbers, and hyphens;
               that is, it must match the regular expression: [a-zA-Z\\d-_]+. The maximum length is 100
               characters. Can be empty to allow the system to generate one.
        """
        pulumi.set(__self__, "parent", parent)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if dictionary is not None:
            pulumi.set(__self__, "dictionary", dictionary)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if large_custom_dictionary is not None:
            pulumi.set(__self__, "large_custom_dictionary", large_custom_dictionary)
        if regex is not None:
            pulumi.set(__self__, "regex", regex)
        if stored_info_type_id is not None:
            pulumi.set(__self__, "stored_info_type_id", stored_info_type_id)

    @_builtins.property
    @pulumi.getter
    def parent(self) -> pulumi.Input[_builtins.str]:
        """
        The parent of the info type in any of the following formats:
        * `projects/{{project}}`
        * `projects/{{project}}/locations/{{location}}`
        * `organizations/{{organization_id}}`
        * `organizations/{{organization_id}}/locations/{{location}}`
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "parent", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A description of the info type.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def dictionary(self) -> Optional[pulumi.Input['PreventionStoredInfoTypeDictionaryArgs']]:
        """
        Dictionary which defines the rule.
        Structure is documented below.
        """
        return pulumi.get(self, "dictionary")

    @dictionary.setter
    def dictionary(self, value: Optional[pulumi.Input['PreventionStoredInfoTypeDictionaryArgs']]):
        pulumi.set(self, "dictionary", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        User set display name of the info type.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter(name="largeCustomDictionary")
    def large_custom_dictionary(self) -> Optional[pulumi.Input['PreventionStoredInfoTypeLargeCustomDictionaryArgs']]:
        """
        Dictionary which defines the rule.
        Structure is documented below.
        """
        return pulumi.get(self, "large_custom_dictionary")

    @large_custom_dictionary.setter
    def large_custom_dictionary(self, value: Optional[pulumi.Input['PreventionStoredInfoTypeLargeCustomDictionaryArgs']]):
        pulumi.set(self, "large_custom_dictionary", value)

    @_builtins.property
    @pulumi.getter
    def regex(self) -> Optional[pulumi.Input['PreventionStoredInfoTypeRegexArgs']]:
        """
        Regular expression which defines the rule.
        Structure is documented below.
        """
        return pulumi.get(self, "regex")

    @regex.setter
    def regex(self, value: Optional[pulumi.Input['PreventionStoredInfoTypeRegexArgs']]):
        pulumi.set(self, "regex", value)

    @_builtins.property
    @pulumi.getter(name="storedInfoTypeId")
    def stored_info_type_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The storedInfoType ID can contain uppercase and lowercase letters, numbers, and hyphens;
        that is, it must match the regular expression: [a-zA-Z\\d-_]+. The maximum length is 100
        characters. Can be empty to allow the system to generate one.
        """
        return pulumi.get(self, "stored_info_type_id")

    @stored_info_type_id.setter
    def stored_info_type_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "stored_info_type_id", value)


@pulumi.input_type
class _PreventionStoredInfoTypeState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 dictionary: Optional[pulumi.Input['PreventionStoredInfoTypeDictionaryArgs']] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 large_custom_dictionary: Optional[pulumi.Input['PreventionStoredInfoTypeLargeCustomDictionaryArgs']] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 parent: Optional[pulumi.Input[_builtins.str]] = None,
                 regex: Optional[pulumi.Input['PreventionStoredInfoTypeRegexArgs']] = None,
                 stored_info_type_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering PreventionStoredInfoType resources.
        :param pulumi.Input[_builtins.str] description: A description of the info type.
        :param pulumi.Input['PreventionStoredInfoTypeDictionaryArgs'] dictionary: Dictionary which defines the rule.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] display_name: User set display name of the info type.
        :param pulumi.Input['PreventionStoredInfoTypeLargeCustomDictionaryArgs'] large_custom_dictionary: Dictionary which defines the rule.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] name: The resource name of the info type. Set by the server.
        :param pulumi.Input[_builtins.str] parent: The parent of the info type in any of the following formats:
               * `projects/{{project}}`
               * `projects/{{project}}/locations/{{location}}`
               * `organizations/{{organization_id}}`
               * `organizations/{{organization_id}}/locations/{{location}}`
        :param pulumi.Input['PreventionStoredInfoTypeRegexArgs'] regex: Regular expression which defines the rule.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] stored_info_type_id: The storedInfoType ID can contain uppercase and lowercase letters, numbers, and hyphens;
               that is, it must match the regular expression: [a-zA-Z\\d-_]+. The maximum length is 100
               characters. Can be empty to allow the system to generate one.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if dictionary is not None:
            pulumi.set(__self__, "dictionary", dictionary)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if large_custom_dictionary is not None:
            pulumi.set(__self__, "large_custom_dictionary", large_custom_dictionary)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent is not None:
            pulumi.set(__self__, "parent", parent)
        if regex is not None:
            pulumi.set(__self__, "regex", regex)
        if stored_info_type_id is not None:
            pulumi.set(__self__, "stored_info_type_id", stored_info_type_id)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A description of the info type.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def dictionary(self) -> Optional[pulumi.Input['PreventionStoredInfoTypeDictionaryArgs']]:
        """
        Dictionary which defines the rule.
        Structure is documented below.
        """
        return pulumi.get(self, "dictionary")

    @dictionary.setter
    def dictionary(self, value: Optional[pulumi.Input['PreventionStoredInfoTypeDictionaryArgs']]):
        pulumi.set(self, "dictionary", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        User set display name of the info type.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter(name="largeCustomDictionary")
    def large_custom_dictionary(self) -> Optional[pulumi.Input['PreventionStoredInfoTypeLargeCustomDictionaryArgs']]:
        """
        Dictionary which defines the rule.
        Structure is documented below.
        """
        return pulumi.get(self, "large_custom_dictionary")

    @large_custom_dictionary.setter
    def large_custom_dictionary(self, value: Optional[pulumi.Input['PreventionStoredInfoTypeLargeCustomDictionaryArgs']]):
        pulumi.set(self, "large_custom_dictionary", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The resource name of the info type. Set by the server.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def parent(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The parent of the info type in any of the following formats:
        * `projects/{{project}}`
        * `projects/{{project}}/locations/{{location}}`
        * `organizations/{{organization_id}}`
        * `organizations/{{organization_id}}/locations/{{location}}`
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "parent", value)

    @_builtins.property
    @pulumi.getter
    def regex(self) -> Optional[pulumi.Input['PreventionStoredInfoTypeRegexArgs']]:
        """
        Regular expression which defines the rule.
        Structure is documented below.
        """
        return pulumi.get(self, "regex")

    @regex.setter
    def regex(self, value: Optional[pulumi.Input['PreventionStoredInfoTypeRegexArgs']]):
        pulumi.set(self, "regex", value)

    @_builtins.property
    @pulumi.getter(name="storedInfoTypeId")
    def stored_info_type_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The storedInfoType ID can contain uppercase and lowercase letters, numbers, and hyphens;
        that is, it must match the regular expression: [a-zA-Z\\d-_]+. The maximum length is 100
        characters. Can be empty to allow the system to generate one.
        """
        return pulumi.get(self, "stored_info_type_id")

    @stored_info_type_id.setter
    def stored_info_type_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "stored_info_type_id", value)


@pulumi.type_token("gcp:dataloss/preventionStoredInfoType:PreventionStoredInfoType")
class PreventionStoredInfoType(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 dictionary: Optional[pulumi.Input[Union['PreventionStoredInfoTypeDictionaryArgs', 'PreventionStoredInfoTypeDictionaryArgsDict']]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 large_custom_dictionary: Optional[pulumi.Input[Union['PreventionStoredInfoTypeLargeCustomDictionaryArgs', 'PreventionStoredInfoTypeLargeCustomDictionaryArgsDict']]] = None,
                 parent: Optional[pulumi.Input[_builtins.str]] = None,
                 regex: Optional[pulumi.Input[Union['PreventionStoredInfoTypeRegexArgs', 'PreventionStoredInfoTypeRegexArgsDict']]] = None,
                 stored_info_type_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Allows creation of custom info types.

        To get more information about StoredInfoType, see:

        * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.storedInfoTypes)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/dlp/docs/creating-stored-infotypes)

        ## Example Usage

        ### Dlp Stored Info Type Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        basic = gcp.dataloss.PreventionStoredInfoType("basic",
            parent="projects/my-project-name",
            description="Description",
            display_name="Displayname",
            regex={
                "pattern": "patient",
                "group_indexes": [2],
            })
        ```
        ### Dlp Stored Info Type Dictionary

        ```python
        import pulumi
        import pulumi_gcp as gcp

        dictionary = gcp.dataloss.PreventionStoredInfoType("dictionary",
            parent="projects/my-project-name",
            description="Description",
            display_name="Displayname",
            dictionary={
                "word_list": {
                    "words": [
                        "word",
                        "word2",
                    ],
                },
            })
        ```
        ### Dlp Stored Info Type Large Custom Dictionary

        ```python
        import pulumi
        import pulumi_gcp as gcp

        bucket = gcp.storage.Bucket("bucket",
            name="tf-test-bucket",
            location="US",
            force_destroy=True)
        object = gcp.storage.BucketObject("object",
            name="tf-test-object",
            bucket=bucket.name,
            source=pulumi.FileAsset("./test-fixtures/words.txt"))
        large = gcp.dataloss.PreventionStoredInfoType("large",
            parent="projects/my-project-name",
            description="Description",
            display_name="Displayname",
            large_custom_dictionary={
                "cloud_storage_file_set": {
                    "url": pulumi.Output.all(
                        bucketName=bucket.name,
                        objectName=object.name
        ).apply(lambda resolved_outputs: f"gs://{resolved_outputs['bucketName']}/{resolved_outputs['objectName']}")
        ,
                },
                "output_path": {
                    "path": bucket.name.apply(lambda name: f"gs://{name}/output/dictionary.txt"),
                },
            })
        ```
        ### Dlp Stored Info Type With Id

        ```python
        import pulumi
        import pulumi_gcp as gcp

        with_stored_info_type_id = gcp.dataloss.PreventionStoredInfoType("with_stored_info_type_id",
            parent="projects/my-project-name",
            description="Description",
            display_name="Displayname",
            stored_info_type_id="id-",
            regex={
                "pattern": "patient",
                "group_indexes": [2],
            })
        ```

        ## Import

        StoredInfoType can be imported using any of these accepted formats:

        * `{{parent}}/storedInfoTypes/{{name}}`

        * `{{parent}}/{{name}}`

        When using the `pulumi import` command, StoredInfoType can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:dataloss/preventionStoredInfoType:PreventionStoredInfoType default {{parent}}/storedInfoTypes/{{name}}
        ```

        ```sh
        $ pulumi import gcp:dataloss/preventionStoredInfoType:PreventionStoredInfoType default {{parent}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: A description of the info type.
        :param pulumi.Input[Union['PreventionStoredInfoTypeDictionaryArgs', 'PreventionStoredInfoTypeDictionaryArgsDict']] dictionary: Dictionary which defines the rule.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] display_name: User set display name of the info type.
        :param pulumi.Input[Union['PreventionStoredInfoTypeLargeCustomDictionaryArgs', 'PreventionStoredInfoTypeLargeCustomDictionaryArgsDict']] large_custom_dictionary: Dictionary which defines the rule.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] parent: The parent of the info type in any of the following formats:
               * `projects/{{project}}`
               * `projects/{{project}}/locations/{{location}}`
               * `organizations/{{organization_id}}`
               * `organizations/{{organization_id}}/locations/{{location}}`
        :param pulumi.Input[Union['PreventionStoredInfoTypeRegexArgs', 'PreventionStoredInfoTypeRegexArgsDict']] regex: Regular expression which defines the rule.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] stored_info_type_id: The storedInfoType ID can contain uppercase and lowercase letters, numbers, and hyphens;
               that is, it must match the regular expression: [a-zA-Z\\d-_]+. The maximum length is 100
               characters. Can be empty to allow the system to generate one.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PreventionStoredInfoTypeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Allows creation of custom info types.

        To get more information about StoredInfoType, see:

        * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.storedInfoTypes)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/dlp/docs/creating-stored-infotypes)

        ## Example Usage

        ### Dlp Stored Info Type Basic

        ```python
        import pulumi
        import pulumi_gcp as gcp

        basic = gcp.dataloss.PreventionStoredInfoType("basic",
            parent="projects/my-project-name",
            description="Description",
            display_name="Displayname",
            regex={
                "pattern": "patient",
                "group_indexes": [2],
            })
        ```
        ### Dlp Stored Info Type Dictionary

        ```python
        import pulumi
        import pulumi_gcp as gcp

        dictionary = gcp.dataloss.PreventionStoredInfoType("dictionary",
            parent="projects/my-project-name",
            description="Description",
            display_name="Displayname",
            dictionary={
                "word_list": {
                    "words": [
                        "word",
                        "word2",
                    ],
                },
            })
        ```
        ### Dlp Stored Info Type Large Custom Dictionary

        ```python
        import pulumi
        import pulumi_gcp as gcp

        bucket = gcp.storage.Bucket("bucket",
            name="tf-test-bucket",
            location="US",
            force_destroy=True)
        object = gcp.storage.BucketObject("object",
            name="tf-test-object",
            bucket=bucket.name,
            source=pulumi.FileAsset("./test-fixtures/words.txt"))
        large = gcp.dataloss.PreventionStoredInfoType("large",
            parent="projects/my-project-name",
            description="Description",
            display_name="Displayname",
            large_custom_dictionary={
                "cloud_storage_file_set": {
                    "url": pulumi.Output.all(
                        bucketName=bucket.name,
                        objectName=object.name
        ).apply(lambda resolved_outputs: f"gs://{resolved_outputs['bucketName']}/{resolved_outputs['objectName']}")
        ,
                },
                "output_path": {
                    "path": bucket.name.apply(lambda name: f"gs://{name}/output/dictionary.txt"),
                },
            })
        ```
        ### Dlp Stored Info Type With Id

        ```python
        import pulumi
        import pulumi_gcp as gcp

        with_stored_info_type_id = gcp.dataloss.PreventionStoredInfoType("with_stored_info_type_id",
            parent="projects/my-project-name",
            description="Description",
            display_name="Displayname",
            stored_info_type_id="id-",
            regex={
                "pattern": "patient",
                "group_indexes": [2],
            })
        ```

        ## Import

        StoredInfoType can be imported using any of these accepted formats:

        * `{{parent}}/storedInfoTypes/{{name}}`

        * `{{parent}}/{{name}}`

        When using the `pulumi import` command, StoredInfoType can be imported using one of the formats above. For example:

        ```sh
        $ pulumi import gcp:dataloss/preventionStoredInfoType:PreventionStoredInfoType default {{parent}}/storedInfoTypes/{{name}}
        ```

        ```sh
        $ pulumi import gcp:dataloss/preventionStoredInfoType:PreventionStoredInfoType default {{parent}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param PreventionStoredInfoTypeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PreventionStoredInfoTypeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 dictionary: Optional[pulumi.Input[Union['PreventionStoredInfoTypeDictionaryArgs', 'PreventionStoredInfoTypeDictionaryArgsDict']]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 large_custom_dictionary: Optional[pulumi.Input[Union['PreventionStoredInfoTypeLargeCustomDictionaryArgs', 'PreventionStoredInfoTypeLargeCustomDictionaryArgsDict']]] = None,
                 parent: Optional[pulumi.Input[_builtins.str]] = None,
                 regex: Optional[pulumi.Input[Union['PreventionStoredInfoTypeRegexArgs', 'PreventionStoredInfoTypeRegexArgsDict']]] = None,
                 stored_info_type_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PreventionStoredInfoTypeArgs.__new__(PreventionStoredInfoTypeArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["dictionary"] = dictionary
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["large_custom_dictionary"] = large_custom_dictionary
            if parent is None and not opts.urn:
                raise TypeError("Missing required property 'parent'")
            __props__.__dict__["parent"] = parent
            __props__.__dict__["regex"] = regex
            __props__.__dict__["stored_info_type_id"] = stored_info_type_id
            __props__.__dict__["name"] = None
        super(PreventionStoredInfoType, __self__).__init__(
            'gcp:dataloss/preventionStoredInfoType:PreventionStoredInfoType',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            dictionary: Optional[pulumi.Input[Union['PreventionStoredInfoTypeDictionaryArgs', 'PreventionStoredInfoTypeDictionaryArgsDict']]] = None,
            display_name: Optional[pulumi.Input[_builtins.str]] = None,
            large_custom_dictionary: Optional[pulumi.Input[Union['PreventionStoredInfoTypeLargeCustomDictionaryArgs', 'PreventionStoredInfoTypeLargeCustomDictionaryArgsDict']]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            parent: Optional[pulumi.Input[_builtins.str]] = None,
            regex: Optional[pulumi.Input[Union['PreventionStoredInfoTypeRegexArgs', 'PreventionStoredInfoTypeRegexArgsDict']]] = None,
            stored_info_type_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'PreventionStoredInfoType':
        """
        Get an existing PreventionStoredInfoType resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: A description of the info type.
        :param pulumi.Input[Union['PreventionStoredInfoTypeDictionaryArgs', 'PreventionStoredInfoTypeDictionaryArgsDict']] dictionary: Dictionary which defines the rule.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] display_name: User set display name of the info type.
        :param pulumi.Input[Union['PreventionStoredInfoTypeLargeCustomDictionaryArgs', 'PreventionStoredInfoTypeLargeCustomDictionaryArgsDict']] large_custom_dictionary: Dictionary which defines the rule.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] name: The resource name of the info type. Set by the server.
        :param pulumi.Input[_builtins.str] parent: The parent of the info type in any of the following formats:
               * `projects/{{project}}`
               * `projects/{{project}}/locations/{{location}}`
               * `organizations/{{organization_id}}`
               * `organizations/{{organization_id}}/locations/{{location}}`
        :param pulumi.Input[Union['PreventionStoredInfoTypeRegexArgs', 'PreventionStoredInfoTypeRegexArgsDict']] regex: Regular expression which defines the rule.
               Structure is documented below.
        :param pulumi.Input[_builtins.str] stored_info_type_id: The storedInfoType ID can contain uppercase and lowercase letters, numbers, and hyphens;
               that is, it must match the regular expression: [a-zA-Z\\d-_]+. The maximum length is 100
               characters. Can be empty to allow the system to generate one.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PreventionStoredInfoTypeState.__new__(_PreventionStoredInfoTypeState)

        __props__.__dict__["description"] = description
        __props__.__dict__["dictionary"] = dictionary
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["large_custom_dictionary"] = large_custom_dictionary
        __props__.__dict__["name"] = name
        __props__.__dict__["parent"] = parent
        __props__.__dict__["regex"] = regex
        __props__.__dict__["stored_info_type_id"] = stored_info_type_id
        return PreventionStoredInfoType(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        A description of the info type.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def dictionary(self) -> pulumi.Output[Optional['outputs.PreventionStoredInfoTypeDictionary']]:
        """
        Dictionary which defines the rule.
        Structure is documented below.
        """
        return pulumi.get(self, "dictionary")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        User set display name of the info type.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter(name="largeCustomDictionary")
    def large_custom_dictionary(self) -> pulumi.Output[Optional['outputs.PreventionStoredInfoTypeLargeCustomDictionary']]:
        """
        Dictionary which defines the rule.
        Structure is documented below.
        """
        return pulumi.get(self, "large_custom_dictionary")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The resource name of the info type. Set by the server.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def parent(self) -> pulumi.Output[_builtins.str]:
        """
        The parent of the info type in any of the following formats:
        * `projects/{{project}}`
        * `projects/{{project}}/locations/{{location}}`
        * `organizations/{{organization_id}}`
        * `organizations/{{organization_id}}/locations/{{location}}`
        """
        return pulumi.get(self, "parent")

    @_builtins.property
    @pulumi.getter
    def regex(self) -> pulumi.Output[Optional['outputs.PreventionStoredInfoTypeRegex']]:
        """
        Regular expression which defines the rule.
        Structure is documented below.
        """
        return pulumi.get(self, "regex")

    @_builtins.property
    @pulumi.getter(name="storedInfoTypeId")
    def stored_info_type_id(self) -> pulumi.Output[_builtins.str]:
        """
        The storedInfoType ID can contain uppercase and lowercase letters, numbers, and hyphens;
        that is, it must match the regular expression: [a-zA-Z\\d-_]+. The maximum length is 100
        characters. Can be empty to allow the system to generate one.
        """
        return pulumi.get(self, "stored_info_type_id")

