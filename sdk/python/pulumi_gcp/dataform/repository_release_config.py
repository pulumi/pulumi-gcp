# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['RepositoryReleaseConfigArgs', 'RepositoryReleaseConfig']

@pulumi.input_type
class RepositoryReleaseConfigArgs:
    def __init__(__self__, *,
                 git_commitish: pulumi.Input[str],
                 code_compilation_config: Optional[pulumi.Input['RepositoryReleaseConfigCodeCompilationConfigArgs']] = None,
                 cron_schedule: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a RepositoryReleaseConfig resource.
        :param pulumi.Input[str] git_commitish: Git commit/tag/branch name at which the repository should be compiled. Must exist in the remote repository.
               
               
               - - -
        :param pulumi.Input['RepositoryReleaseConfigCodeCompilationConfigArgs'] code_compilation_config: Optional. If set, fields of codeCompilationConfig override the default compilation settings that are specified in dataform.json.
               Structure is documented below.
        :param pulumi.Input[str] cron_schedule: Optional. Optional schedule (in cron format) for automatic creation of compilation results.
        :param pulumi.Input[str] name: The release's name.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] region: A reference to the region
        :param pulumi.Input[str] repository: A reference to the Dataform repository
        :param pulumi.Input[str] time_zone: Optional. Specifies the time zone to be used when interpreting cronSchedule. Must be a time zone name from the time zone database (https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). If left unspecified, the default is UTC.
        """
        pulumi.set(__self__, "git_commitish", git_commitish)
        if code_compilation_config is not None:
            pulumi.set(__self__, "code_compilation_config", code_compilation_config)
        if cron_schedule is not None:
            pulumi.set(__self__, "cron_schedule", cron_schedule)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if repository is not None:
            pulumi.set(__self__, "repository", repository)
        if time_zone is not None:
            pulumi.set(__self__, "time_zone", time_zone)

    @property
    @pulumi.getter(name="gitCommitish")
    def git_commitish(self) -> pulumi.Input[str]:
        """
        Git commit/tag/branch name at which the repository should be compiled. Must exist in the remote repository.


        - - -
        """
        return pulumi.get(self, "git_commitish")

    @git_commitish.setter
    def git_commitish(self, value: pulumi.Input[str]):
        pulumi.set(self, "git_commitish", value)

    @property
    @pulumi.getter(name="codeCompilationConfig")
    def code_compilation_config(self) -> Optional[pulumi.Input['RepositoryReleaseConfigCodeCompilationConfigArgs']]:
        """
        Optional. If set, fields of codeCompilationConfig override the default compilation settings that are specified in dataform.json.
        Structure is documented below.
        """
        return pulumi.get(self, "code_compilation_config")

    @code_compilation_config.setter
    def code_compilation_config(self, value: Optional[pulumi.Input['RepositoryReleaseConfigCodeCompilationConfigArgs']]):
        pulumi.set(self, "code_compilation_config", value)

    @property
    @pulumi.getter(name="cronSchedule")
    def cron_schedule(self) -> Optional[pulumi.Input[str]]:
        """
        Optional. Optional schedule (in cron format) for automatic creation of compilation results.
        """
        return pulumi.get(self, "cron_schedule")

    @cron_schedule.setter
    def cron_schedule(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cron_schedule", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The release's name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        A reference to the region
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def repository(self) -> Optional[pulumi.Input[str]]:
        """
        A reference to the Dataform repository
        """
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repository", value)

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> Optional[pulumi.Input[str]]:
        """
        Optional. Specifies the time zone to be used when interpreting cronSchedule. Must be a time zone name from the time zone database (https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). If left unspecified, the default is UTC.
        """
        return pulumi.get(self, "time_zone")

    @time_zone.setter
    def time_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "time_zone", value)


@pulumi.input_type
class _RepositoryReleaseConfigState:
    def __init__(__self__, *,
                 code_compilation_config: Optional[pulumi.Input['RepositoryReleaseConfigCodeCompilationConfigArgs']] = None,
                 cron_schedule: Optional[pulumi.Input[str]] = None,
                 git_commitish: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 recent_scheduled_release_records: Optional[pulumi.Input[Sequence[pulumi.Input['RepositoryReleaseConfigRecentScheduledReleaseRecordArgs']]]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RepositoryReleaseConfig resources.
        :param pulumi.Input['RepositoryReleaseConfigCodeCompilationConfigArgs'] code_compilation_config: Optional. If set, fields of codeCompilationConfig override the default compilation settings that are specified in dataform.json.
               Structure is documented below.
        :param pulumi.Input[str] cron_schedule: Optional. Optional schedule (in cron format) for automatic creation of compilation results.
        :param pulumi.Input[str] git_commitish: Git commit/tag/branch name at which the repository should be compiled. Must exist in the remote repository.
               
               
               - - -
        :param pulumi.Input[str] name: The release's name.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[Sequence[pulumi.Input['RepositoryReleaseConfigRecentScheduledReleaseRecordArgs']]] recent_scheduled_release_records: Records of the 10 most recent scheduled release attempts, ordered in in descending order of releaseTime. Updated whenever automatic creation of a compilation result is triggered by cronSchedule.
               Structure is documented below.
        :param pulumi.Input[str] region: A reference to the region
        :param pulumi.Input[str] repository: A reference to the Dataform repository
        :param pulumi.Input[str] time_zone: Optional. Specifies the time zone to be used when interpreting cronSchedule. Must be a time zone name from the time zone database (https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). If left unspecified, the default is UTC.
        """
        if code_compilation_config is not None:
            pulumi.set(__self__, "code_compilation_config", code_compilation_config)
        if cron_schedule is not None:
            pulumi.set(__self__, "cron_schedule", cron_schedule)
        if git_commitish is not None:
            pulumi.set(__self__, "git_commitish", git_commitish)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if recent_scheduled_release_records is not None:
            pulumi.set(__self__, "recent_scheduled_release_records", recent_scheduled_release_records)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if repository is not None:
            pulumi.set(__self__, "repository", repository)
        if time_zone is not None:
            pulumi.set(__self__, "time_zone", time_zone)

    @property
    @pulumi.getter(name="codeCompilationConfig")
    def code_compilation_config(self) -> Optional[pulumi.Input['RepositoryReleaseConfigCodeCompilationConfigArgs']]:
        """
        Optional. If set, fields of codeCompilationConfig override the default compilation settings that are specified in dataform.json.
        Structure is documented below.
        """
        return pulumi.get(self, "code_compilation_config")

    @code_compilation_config.setter
    def code_compilation_config(self, value: Optional[pulumi.Input['RepositoryReleaseConfigCodeCompilationConfigArgs']]):
        pulumi.set(self, "code_compilation_config", value)

    @property
    @pulumi.getter(name="cronSchedule")
    def cron_schedule(self) -> Optional[pulumi.Input[str]]:
        """
        Optional. Optional schedule (in cron format) for automatic creation of compilation results.
        """
        return pulumi.get(self, "cron_schedule")

    @cron_schedule.setter
    def cron_schedule(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cron_schedule", value)

    @property
    @pulumi.getter(name="gitCommitish")
    def git_commitish(self) -> Optional[pulumi.Input[str]]:
        """
        Git commit/tag/branch name at which the repository should be compiled. Must exist in the remote repository.


        - - -
        """
        return pulumi.get(self, "git_commitish")

    @git_commitish.setter
    def git_commitish(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_commitish", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The release's name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter(name="recentScheduledReleaseRecords")
    def recent_scheduled_release_records(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RepositoryReleaseConfigRecentScheduledReleaseRecordArgs']]]]:
        """
        Records of the 10 most recent scheduled release attempts, ordered in in descending order of releaseTime. Updated whenever automatic creation of a compilation result is triggered by cronSchedule.
        Structure is documented below.
        """
        return pulumi.get(self, "recent_scheduled_release_records")

    @recent_scheduled_release_records.setter
    def recent_scheduled_release_records(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RepositoryReleaseConfigRecentScheduledReleaseRecordArgs']]]]):
        pulumi.set(self, "recent_scheduled_release_records", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        A reference to the region
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def repository(self) -> Optional[pulumi.Input[str]]:
        """
        A reference to the Dataform repository
        """
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repository", value)

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> Optional[pulumi.Input[str]]:
        """
        Optional. Specifies the time zone to be used when interpreting cronSchedule. Must be a time zone name from the time zone database (https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). If left unspecified, the default is UTC.
        """
        return pulumi.get(self, "time_zone")

    @time_zone.setter
    def time_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "time_zone", value)


class RepositoryReleaseConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 code_compilation_config: Optional[pulumi.Input[pulumi.InputType['RepositoryReleaseConfigCodeCompilationConfigArgs']]] = None,
                 cron_schedule: Optional[pulumi.Input[str]] = None,
                 git_commitish: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage
        ### Dataform Repository Release Config

        ```python
        import pulumi
        import pulumi_gcp as gcp

        git_repository = gcp.sourcerepo.Repository("gitRepository", opts=pulumi.ResourceOptions(provider=google_beta))
        secret = gcp.secretmanager.Secret("secret",
            secret_id="secret",
            replication=gcp.secretmanager.SecretReplicationArgs(
                automatic=True,
            ),
            opts=pulumi.ResourceOptions(provider=google_beta))
        secret_version = gcp.secretmanager.SecretVersion("secretVersion",
            secret=secret.id,
            secret_data="secret-data",
            opts=pulumi.ResourceOptions(provider=google_beta))
        repository = gcp.dataform.Repository("repository",
            region="us-central1",
            git_remote_settings=gcp.dataform.RepositoryGitRemoteSettingsArgs(
                url=git_repository.url,
                default_branch="main",
                authentication_token_secret_version=secret_version.id,
            ),
            workspace_compilation_overrides=gcp.dataform.RepositoryWorkspaceCompilationOverridesArgs(
                default_database="database",
                schema_suffix="_suffix",
                table_prefix="prefix_",
            ),
            opts=pulumi.ResourceOptions(provider=google_beta))
        release = gcp.dataform.RepositoryReleaseConfig("release",
            project=repository.project,
            region=repository.region,
            repository=repository.name,
            git_commitish="main",
            cron_schedule="0 7 * * *",
            time_zone="America/New_York",
            code_compilation_config=gcp.dataform.RepositoryReleaseConfigCodeCompilationConfigArgs(
                default_database="gcp-example-project",
                default_schema="example-dataset",
                default_location="us-central1",
                assertion_schema="example-assertion-dataset",
                database_suffix="",
                schema_suffix="",
                table_prefix="",
                vars={
                    "var1": "value",
                },
            ),
            opts=pulumi.ResourceOptions(provider=google_beta))
        ```

        ## Import

        RepositoryReleaseConfig can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:dataform/repositoryReleaseConfig:RepositoryReleaseConfig default projects/{{project}}/locations/{{region}}/repositories/{{repository}}/releaseConfigs/{{name}}
        ```

        ```sh
         $ pulumi import gcp:dataform/repositoryReleaseConfig:RepositoryReleaseConfig default {{project}}/{{region}}/{{repository}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:dataform/repositoryReleaseConfig:RepositoryReleaseConfig default {{region}}/{{repository}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:dataform/repositoryReleaseConfig:RepositoryReleaseConfig default {{repository}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['RepositoryReleaseConfigCodeCompilationConfigArgs']] code_compilation_config: Optional. If set, fields of codeCompilationConfig override the default compilation settings that are specified in dataform.json.
               Structure is documented below.
        :param pulumi.Input[str] cron_schedule: Optional. Optional schedule (in cron format) for automatic creation of compilation results.
        :param pulumi.Input[str] git_commitish: Git commit/tag/branch name at which the repository should be compiled. Must exist in the remote repository.
               
               
               - - -
        :param pulumi.Input[str] name: The release's name.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[str] region: A reference to the region
        :param pulumi.Input[str] repository: A reference to the Dataform repository
        :param pulumi.Input[str] time_zone: Optional. Specifies the time zone to be used when interpreting cronSchedule. Must be a time zone name from the time zone database (https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). If left unspecified, the default is UTC.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RepositoryReleaseConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage
        ### Dataform Repository Release Config

        ```python
        import pulumi
        import pulumi_gcp as gcp

        git_repository = gcp.sourcerepo.Repository("gitRepository", opts=pulumi.ResourceOptions(provider=google_beta))
        secret = gcp.secretmanager.Secret("secret",
            secret_id="secret",
            replication=gcp.secretmanager.SecretReplicationArgs(
                automatic=True,
            ),
            opts=pulumi.ResourceOptions(provider=google_beta))
        secret_version = gcp.secretmanager.SecretVersion("secretVersion",
            secret=secret.id,
            secret_data="secret-data",
            opts=pulumi.ResourceOptions(provider=google_beta))
        repository = gcp.dataform.Repository("repository",
            region="us-central1",
            git_remote_settings=gcp.dataform.RepositoryGitRemoteSettingsArgs(
                url=git_repository.url,
                default_branch="main",
                authentication_token_secret_version=secret_version.id,
            ),
            workspace_compilation_overrides=gcp.dataform.RepositoryWorkspaceCompilationOverridesArgs(
                default_database="database",
                schema_suffix="_suffix",
                table_prefix="prefix_",
            ),
            opts=pulumi.ResourceOptions(provider=google_beta))
        release = gcp.dataform.RepositoryReleaseConfig("release",
            project=repository.project,
            region=repository.region,
            repository=repository.name,
            git_commitish="main",
            cron_schedule="0 7 * * *",
            time_zone="America/New_York",
            code_compilation_config=gcp.dataform.RepositoryReleaseConfigCodeCompilationConfigArgs(
                default_database="gcp-example-project",
                default_schema="example-dataset",
                default_location="us-central1",
                assertion_schema="example-assertion-dataset",
                database_suffix="",
                schema_suffix="",
                table_prefix="",
                vars={
                    "var1": "value",
                },
            ),
            opts=pulumi.ResourceOptions(provider=google_beta))
        ```

        ## Import

        RepositoryReleaseConfig can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:dataform/repositoryReleaseConfig:RepositoryReleaseConfig default projects/{{project}}/locations/{{region}}/repositories/{{repository}}/releaseConfigs/{{name}}
        ```

        ```sh
         $ pulumi import gcp:dataform/repositoryReleaseConfig:RepositoryReleaseConfig default {{project}}/{{region}}/{{repository}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:dataform/repositoryReleaseConfig:RepositoryReleaseConfig default {{region}}/{{repository}}/{{name}}
        ```

        ```sh
         $ pulumi import gcp:dataform/repositoryReleaseConfig:RepositoryReleaseConfig default {{repository}}/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param RepositoryReleaseConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RepositoryReleaseConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 code_compilation_config: Optional[pulumi.Input[pulumi.InputType['RepositoryReleaseConfigCodeCompilationConfigArgs']]] = None,
                 cron_schedule: Optional[pulumi.Input[str]] = None,
                 git_commitish: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RepositoryReleaseConfigArgs.__new__(RepositoryReleaseConfigArgs)

            __props__.__dict__["code_compilation_config"] = code_compilation_config
            __props__.__dict__["cron_schedule"] = cron_schedule
            if git_commitish is None and not opts.urn:
                raise TypeError("Missing required property 'git_commitish'")
            __props__.__dict__["git_commitish"] = git_commitish
            __props__.__dict__["name"] = name
            __props__.__dict__["project"] = project
            __props__.__dict__["region"] = region
            __props__.__dict__["repository"] = repository
            __props__.__dict__["time_zone"] = time_zone
            __props__.__dict__["recent_scheduled_release_records"] = None
        super(RepositoryReleaseConfig, __self__).__init__(
            'gcp:dataform/repositoryReleaseConfig:RepositoryReleaseConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            code_compilation_config: Optional[pulumi.Input[pulumi.InputType['RepositoryReleaseConfigCodeCompilationConfigArgs']]] = None,
            cron_schedule: Optional[pulumi.Input[str]] = None,
            git_commitish: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project: Optional[pulumi.Input[str]] = None,
            recent_scheduled_release_records: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RepositoryReleaseConfigRecentScheduledReleaseRecordArgs']]]]] = None,
            region: Optional[pulumi.Input[str]] = None,
            repository: Optional[pulumi.Input[str]] = None,
            time_zone: Optional[pulumi.Input[str]] = None) -> 'RepositoryReleaseConfig':
        """
        Get an existing RepositoryReleaseConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['RepositoryReleaseConfigCodeCompilationConfigArgs']] code_compilation_config: Optional. If set, fields of codeCompilationConfig override the default compilation settings that are specified in dataform.json.
               Structure is documented below.
        :param pulumi.Input[str] cron_schedule: Optional. Optional schedule (in cron format) for automatic creation of compilation results.
        :param pulumi.Input[str] git_commitish: Git commit/tag/branch name at which the repository should be compiled. Must exist in the remote repository.
               
               
               - - -
        :param pulumi.Input[str] name: The release's name.
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RepositoryReleaseConfigRecentScheduledReleaseRecordArgs']]]] recent_scheduled_release_records: Records of the 10 most recent scheduled release attempts, ordered in in descending order of releaseTime. Updated whenever automatic creation of a compilation result is triggered by cronSchedule.
               Structure is documented below.
        :param pulumi.Input[str] region: A reference to the region
        :param pulumi.Input[str] repository: A reference to the Dataform repository
        :param pulumi.Input[str] time_zone: Optional. Specifies the time zone to be used when interpreting cronSchedule. Must be a time zone name from the time zone database (https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). If left unspecified, the default is UTC.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RepositoryReleaseConfigState.__new__(_RepositoryReleaseConfigState)

        __props__.__dict__["code_compilation_config"] = code_compilation_config
        __props__.__dict__["cron_schedule"] = cron_schedule
        __props__.__dict__["git_commitish"] = git_commitish
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["recent_scheduled_release_records"] = recent_scheduled_release_records
        __props__.__dict__["region"] = region
        __props__.__dict__["repository"] = repository
        __props__.__dict__["time_zone"] = time_zone
        return RepositoryReleaseConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="codeCompilationConfig")
    def code_compilation_config(self) -> pulumi.Output[Optional['outputs.RepositoryReleaseConfigCodeCompilationConfig']]:
        """
        Optional. If set, fields of codeCompilationConfig override the default compilation settings that are specified in dataform.json.
        Structure is documented below.
        """
        return pulumi.get(self, "code_compilation_config")

    @property
    @pulumi.getter(name="cronSchedule")
    def cron_schedule(self) -> pulumi.Output[Optional[str]]:
        """
        Optional. Optional schedule (in cron format) for automatic creation of compilation results.
        """
        return pulumi.get(self, "cron_schedule")

    @property
    @pulumi.getter(name="gitCommitish")
    def git_commitish(self) -> pulumi.Output[str]:
        """
        Git commit/tag/branch name at which the repository should be compiled. Must exist in the remote repository.


        - - -
        """
        return pulumi.get(self, "git_commitish")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The release's name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def project(self) -> pulumi.Output[str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="recentScheduledReleaseRecords")
    def recent_scheduled_release_records(self) -> pulumi.Output[Sequence['outputs.RepositoryReleaseConfigRecentScheduledReleaseRecord']]:
        """
        Records of the 10 most recent scheduled release attempts, ordered in in descending order of releaseTime. Updated whenever automatic creation of a compilation result is triggered by cronSchedule.
        Structure is documented below.
        """
        return pulumi.get(self, "recent_scheduled_release_records")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[Optional[str]]:
        """
        A reference to the region
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def repository(self) -> pulumi.Output[Optional[str]]:
        """
        A reference to the Dataform repository
        """
        return pulumi.get(self, "repository")

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> pulumi.Output[Optional[str]]:
        """
        Optional. Specifies the time zone to be used when interpreting cronSchedule. Must be a time zone name from the time zone database (https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). If left unspecified, the default is UTC.
        """
        return pulumi.get(self, "time_zone")
