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

__all__ = [
    'RepositoryGitRemoteSettings',
    'RepositoryGitRemoteSettingsSshAuthenticationConfig',
    'RepositoryIamBindingCondition',
    'RepositoryIamMemberCondition',
    'RepositoryReleaseConfigCodeCompilationConfig',
    'RepositoryReleaseConfigRecentScheduledReleaseRecord',
    'RepositoryReleaseConfigRecentScheduledReleaseRecordErrorStatus',
    'RepositoryWorkflowConfigInvocationConfig',
    'RepositoryWorkflowConfigInvocationConfigIncludedTarget',
    'RepositoryWorkflowConfigRecentScheduledExecutionRecord',
    'RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatus',
    'RepositoryWorkspaceCompilationOverrides',
]

@pulumi.output_type
class RepositoryGitRemoteSettings(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "defaultBranch":
            suggest = "default_branch"
        elif key == "authenticationTokenSecretVersion":
            suggest = "authentication_token_secret_version"
        elif key == "sshAuthenticationConfig":
            suggest = "ssh_authentication_config"
        elif key == "tokenStatus":
            suggest = "token_status"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RepositoryGitRemoteSettings. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RepositoryGitRemoteSettings.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RepositoryGitRemoteSettings.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 default_branch: _builtins.str,
                 url: _builtins.str,
                 authentication_token_secret_version: Optional[_builtins.str] = None,
                 ssh_authentication_config: Optional['outputs.RepositoryGitRemoteSettingsSshAuthenticationConfig'] = None,
                 token_status: Optional[_builtins.str] = None):
        """
        :param _builtins.str default_branch: The Git remote's default branch name.
        :param _builtins.str url: The Git remote's URL.
        :param _builtins.str authentication_token_secret_version: The name of the Secret Manager secret version to use as an authentication token for Git operations. This secret is for assigning with HTTPS only(for SSH use `ssh_authentication_config`). Must be in the format projects/*/secrets/*/versions/*.
        :param 'RepositoryGitRemoteSettingsSshAuthenticationConfigArgs' ssh_authentication_config: Authentication fields for remote uris using SSH protocol.
               Structure is documented below.
        :param _builtins.str token_status: (Output)
               Indicates the status of the Git access token. https://cloud.google.com/dataform/reference/rest/v1beta1/projects.locations.repositories#TokenStatus
        """
        pulumi.set(__self__, "default_branch", default_branch)
        pulumi.set(__self__, "url", url)
        if authentication_token_secret_version is not None:
            pulumi.set(__self__, "authentication_token_secret_version", authentication_token_secret_version)
        if ssh_authentication_config is not None:
            pulumi.set(__self__, "ssh_authentication_config", ssh_authentication_config)
        if token_status is not None:
            pulumi.set(__self__, "token_status", token_status)

    @_builtins.property
    @pulumi.getter(name="defaultBranch")
    def default_branch(self) -> _builtins.str:
        """
        The Git remote's default branch name.
        """
        return pulumi.get(self, "default_branch")

    @_builtins.property
    @pulumi.getter
    def url(self) -> _builtins.str:
        """
        The Git remote's URL.
        """
        return pulumi.get(self, "url")

    @_builtins.property
    @pulumi.getter(name="authenticationTokenSecretVersion")
    def authentication_token_secret_version(self) -> Optional[_builtins.str]:
        """
        The name of the Secret Manager secret version to use as an authentication token for Git operations. This secret is for assigning with HTTPS only(for SSH use `ssh_authentication_config`). Must be in the format projects/*/secrets/*/versions/*.
        """
        return pulumi.get(self, "authentication_token_secret_version")

    @_builtins.property
    @pulumi.getter(name="sshAuthenticationConfig")
    def ssh_authentication_config(self) -> Optional['outputs.RepositoryGitRemoteSettingsSshAuthenticationConfig']:
        """
        Authentication fields for remote uris using SSH protocol.
        Structure is documented below.
        """
        return pulumi.get(self, "ssh_authentication_config")

    @_builtins.property
    @pulumi.getter(name="tokenStatus")
    def token_status(self) -> Optional[_builtins.str]:
        """
        (Output)
        Indicates the status of the Git access token. https://cloud.google.com/dataform/reference/rest/v1beta1/projects.locations.repositories#TokenStatus
        """
        return pulumi.get(self, "token_status")


@pulumi.output_type
class RepositoryGitRemoteSettingsSshAuthenticationConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "hostPublicKey":
            suggest = "host_public_key"
        elif key == "userPrivateKeySecretVersion":
            suggest = "user_private_key_secret_version"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RepositoryGitRemoteSettingsSshAuthenticationConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RepositoryGitRemoteSettingsSshAuthenticationConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RepositoryGitRemoteSettingsSshAuthenticationConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 host_public_key: _builtins.str,
                 user_private_key_secret_version: _builtins.str):
        """
        :param _builtins.str host_public_key: Content of a public SSH key to verify an identity of a remote Git host.
        :param _builtins.str user_private_key_secret_version: The name of the Secret Manager secret version to use as a ssh private key for Git operations. Must be in the format projects/*/secrets/*/versions/*.
        """
        pulumi.set(__self__, "host_public_key", host_public_key)
        pulumi.set(__self__, "user_private_key_secret_version", user_private_key_secret_version)

    @_builtins.property
    @pulumi.getter(name="hostPublicKey")
    def host_public_key(self) -> _builtins.str:
        """
        Content of a public SSH key to verify an identity of a remote Git host.
        """
        return pulumi.get(self, "host_public_key")

    @_builtins.property
    @pulumi.getter(name="userPrivateKeySecretVersion")
    def user_private_key_secret_version(self) -> _builtins.str:
        """
        The name of the Secret Manager secret version to use as a ssh private key for Git operations. Must be in the format projects/*/secrets/*/versions/*.
        """
        return pulumi.get(self, "user_private_key_secret_version")


@pulumi.output_type
class RepositoryIamBindingCondition(dict):
    def __init__(__self__, *,
                 expression: _builtins.str,
                 title: _builtins.str,
                 description: Optional[_builtins.str] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @_builtins.property
    @pulumi.getter
    def expression(self) -> _builtins.str:
        return pulumi.get(self, "expression")

    @_builtins.property
    @pulumi.getter
    def title(self) -> _builtins.str:
        return pulumi.get(self, "title")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "description")


@pulumi.output_type
class RepositoryIamMemberCondition(dict):
    def __init__(__self__, *,
                 expression: _builtins.str,
                 title: _builtins.str,
                 description: Optional[_builtins.str] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @_builtins.property
    @pulumi.getter
    def expression(self) -> _builtins.str:
        return pulumi.get(self, "expression")

    @_builtins.property
    @pulumi.getter
    def title(self) -> _builtins.str:
        return pulumi.get(self, "title")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "description")


@pulumi.output_type
class RepositoryReleaseConfigCodeCompilationConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "assertionSchema":
            suggest = "assertion_schema"
        elif key == "databaseSuffix":
            suggest = "database_suffix"
        elif key == "defaultDatabase":
            suggest = "default_database"
        elif key == "defaultLocation":
            suggest = "default_location"
        elif key == "defaultSchema":
            suggest = "default_schema"
        elif key == "schemaSuffix":
            suggest = "schema_suffix"
        elif key == "tablePrefix":
            suggest = "table_prefix"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RepositoryReleaseConfigCodeCompilationConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RepositoryReleaseConfigCodeCompilationConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RepositoryReleaseConfigCodeCompilationConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 assertion_schema: Optional[_builtins.str] = None,
                 database_suffix: Optional[_builtins.str] = None,
                 default_database: Optional[_builtins.str] = None,
                 default_location: Optional[_builtins.str] = None,
                 default_schema: Optional[_builtins.str] = None,
                 schema_suffix: Optional[_builtins.str] = None,
                 table_prefix: Optional[_builtins.str] = None,
                 vars: Optional[Mapping[str, _builtins.str]] = None):
        """
        :param _builtins.str assertion_schema: Optional. The default schema (BigQuery dataset ID) for assertions.
        :param _builtins.str database_suffix: Optional. The suffix that should be appended to all database (Google Cloud project ID) names.
        :param _builtins.str default_database: Optional. The default database (Google Cloud project ID).
        :param _builtins.str default_location: Optional. The default BigQuery location to use. Defaults to "US".
               See the BigQuery docs for a full list of locations: https://cloud.google.com/bigquery/docs/locations.
        :param _builtins.str default_schema: Optional. The default schema (BigQuery dataset ID).
        :param _builtins.str schema_suffix: Optional. The suffix that should be appended to all schema (BigQuery dataset ID) names.
        :param _builtins.str table_prefix: Optional. The prefix that should be prepended to all table names.
        :param Mapping[str, _builtins.str] vars: Optional. User-defined variables that are made available to project code during compilation.
               An object containing a list of "key": value pairs.
               Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        """
        if assertion_schema is not None:
            pulumi.set(__self__, "assertion_schema", assertion_schema)
        if database_suffix is not None:
            pulumi.set(__self__, "database_suffix", database_suffix)
        if default_database is not None:
            pulumi.set(__self__, "default_database", default_database)
        if default_location is not None:
            pulumi.set(__self__, "default_location", default_location)
        if default_schema is not None:
            pulumi.set(__self__, "default_schema", default_schema)
        if schema_suffix is not None:
            pulumi.set(__self__, "schema_suffix", schema_suffix)
        if table_prefix is not None:
            pulumi.set(__self__, "table_prefix", table_prefix)
        if vars is not None:
            pulumi.set(__self__, "vars", vars)

    @_builtins.property
    @pulumi.getter(name="assertionSchema")
    def assertion_schema(self) -> Optional[_builtins.str]:
        """
        Optional. The default schema (BigQuery dataset ID) for assertions.
        """
        return pulumi.get(self, "assertion_schema")

    @_builtins.property
    @pulumi.getter(name="databaseSuffix")
    def database_suffix(self) -> Optional[_builtins.str]:
        """
        Optional. The suffix that should be appended to all database (Google Cloud project ID) names.
        """
        return pulumi.get(self, "database_suffix")

    @_builtins.property
    @pulumi.getter(name="defaultDatabase")
    def default_database(self) -> Optional[_builtins.str]:
        """
        Optional. The default database (Google Cloud project ID).
        """
        return pulumi.get(self, "default_database")

    @_builtins.property
    @pulumi.getter(name="defaultLocation")
    def default_location(self) -> Optional[_builtins.str]:
        """
        Optional. The default BigQuery location to use. Defaults to "US".
        See the BigQuery docs for a full list of locations: https://cloud.google.com/bigquery/docs/locations.
        """
        return pulumi.get(self, "default_location")

    @_builtins.property
    @pulumi.getter(name="defaultSchema")
    def default_schema(self) -> Optional[_builtins.str]:
        """
        Optional. The default schema (BigQuery dataset ID).
        """
        return pulumi.get(self, "default_schema")

    @_builtins.property
    @pulumi.getter(name="schemaSuffix")
    def schema_suffix(self) -> Optional[_builtins.str]:
        """
        Optional. The suffix that should be appended to all schema (BigQuery dataset ID) names.
        """
        return pulumi.get(self, "schema_suffix")

    @_builtins.property
    @pulumi.getter(name="tablePrefix")
    def table_prefix(self) -> Optional[_builtins.str]:
        """
        Optional. The prefix that should be prepended to all table names.
        """
        return pulumi.get(self, "table_prefix")

    @_builtins.property
    @pulumi.getter
    def vars(self) -> Optional[Mapping[str, _builtins.str]]:
        """
        Optional. User-defined variables that are made available to project code during compilation.
        An object containing a list of "key": value pairs.
        Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        """
        return pulumi.get(self, "vars")


@pulumi.output_type
class RepositoryReleaseConfigRecentScheduledReleaseRecord(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "compilationResult":
            suggest = "compilation_result"
        elif key == "errorStatuses":
            suggest = "error_statuses"
        elif key == "releaseTime":
            suggest = "release_time"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RepositoryReleaseConfigRecentScheduledReleaseRecord. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RepositoryReleaseConfigRecentScheduledReleaseRecord.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RepositoryReleaseConfigRecentScheduledReleaseRecord.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 compilation_result: Optional[_builtins.str] = None,
                 error_statuses: Optional[Sequence['outputs.RepositoryReleaseConfigRecentScheduledReleaseRecordErrorStatus']] = None,
                 release_time: Optional[_builtins.str] = None):
        """
        :param _builtins.str compilation_result: (Output)
               The name of the created compilation result, if one was successfully created. Must be in the format projects/*/locations/*/repositories/*/compilationResults/*.
        :param Sequence['RepositoryReleaseConfigRecentScheduledReleaseRecordErrorStatusArgs'] error_statuses: (Output)
               The error status encountered upon this attempt to create the compilation result, if the attempt was unsuccessful.
               Structure is documented below.
        :param _builtins.str release_time: (Output)
               The timestamp of this release attempt.
        """
        if compilation_result is not None:
            pulumi.set(__self__, "compilation_result", compilation_result)
        if error_statuses is not None:
            pulumi.set(__self__, "error_statuses", error_statuses)
        if release_time is not None:
            pulumi.set(__self__, "release_time", release_time)

    @_builtins.property
    @pulumi.getter(name="compilationResult")
    def compilation_result(self) -> Optional[_builtins.str]:
        """
        (Output)
        The name of the created compilation result, if one was successfully created. Must be in the format projects/*/locations/*/repositories/*/compilationResults/*.
        """
        return pulumi.get(self, "compilation_result")

    @_builtins.property
    @pulumi.getter(name="errorStatuses")
    def error_statuses(self) -> Optional[Sequence['outputs.RepositoryReleaseConfigRecentScheduledReleaseRecordErrorStatus']]:
        """
        (Output)
        The error status encountered upon this attempt to create the compilation result, if the attempt was unsuccessful.
        Structure is documented below.
        """
        return pulumi.get(self, "error_statuses")

    @_builtins.property
    @pulumi.getter(name="releaseTime")
    def release_time(self) -> Optional[_builtins.str]:
        """
        (Output)
        The timestamp of this release attempt.
        """
        return pulumi.get(self, "release_time")


@pulumi.output_type
class RepositoryReleaseConfigRecentScheduledReleaseRecordErrorStatus(dict):
    def __init__(__self__, *,
                 code: Optional[_builtins.int] = None,
                 message: Optional[_builtins.str] = None):
        """
        :param _builtins.int code: (Output)
               The status code, which should be an enum value of google.rpc.Code.
        :param _builtins.str message: (Output)
               A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
        """
        if code is not None:
            pulumi.set(__self__, "code", code)
        if message is not None:
            pulumi.set(__self__, "message", message)

    @_builtins.property
    @pulumi.getter
    def code(self) -> Optional[_builtins.int]:
        """
        (Output)
        The status code, which should be an enum value of google.rpc.Code.
        """
        return pulumi.get(self, "code")

    @_builtins.property
    @pulumi.getter
    def message(self) -> Optional[_builtins.str]:
        """
        (Output)
        A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
        """
        return pulumi.get(self, "message")


@pulumi.output_type
class RepositoryWorkflowConfigInvocationConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "fullyRefreshIncrementalTablesEnabled":
            suggest = "fully_refresh_incremental_tables_enabled"
        elif key == "includedTags":
            suggest = "included_tags"
        elif key == "includedTargets":
            suggest = "included_targets"
        elif key == "serviceAccount":
            suggest = "service_account"
        elif key == "transitiveDependenciesIncluded":
            suggest = "transitive_dependencies_included"
        elif key == "transitiveDependentsIncluded":
            suggest = "transitive_dependents_included"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RepositoryWorkflowConfigInvocationConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RepositoryWorkflowConfigInvocationConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RepositoryWorkflowConfigInvocationConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 fully_refresh_incremental_tables_enabled: Optional[_builtins.bool] = None,
                 included_tags: Optional[Sequence[_builtins.str]] = None,
                 included_targets: Optional[Sequence['outputs.RepositoryWorkflowConfigInvocationConfigIncludedTarget']] = None,
                 service_account: Optional[_builtins.str] = None,
                 transitive_dependencies_included: Optional[_builtins.bool] = None,
                 transitive_dependents_included: Optional[_builtins.bool] = None):
        """
        :param _builtins.bool fully_refresh_incremental_tables_enabled: Optional. When set to true, any incremental tables will be fully refreshed.
        :param Sequence[_builtins.str] included_tags: Optional. The set of tags to include.
        :param Sequence['RepositoryWorkflowConfigInvocationConfigIncludedTargetArgs'] included_targets: Optional. The set of action identifiers to include.
               Structure is documented below.
        :param _builtins.str service_account: Optional. The service account to run workflow invocations under.
        :param _builtins.bool transitive_dependencies_included: Optional. When set to true, transitive dependencies of included actions will be executed.
        :param _builtins.bool transitive_dependents_included: Optional. When set to true, transitive dependents of included actions will be executed.
        """
        if fully_refresh_incremental_tables_enabled is not None:
            pulumi.set(__self__, "fully_refresh_incremental_tables_enabled", fully_refresh_incremental_tables_enabled)
        if included_tags is not None:
            pulumi.set(__self__, "included_tags", included_tags)
        if included_targets is not None:
            pulumi.set(__self__, "included_targets", included_targets)
        if service_account is not None:
            pulumi.set(__self__, "service_account", service_account)
        if transitive_dependencies_included is not None:
            pulumi.set(__self__, "transitive_dependencies_included", transitive_dependencies_included)
        if transitive_dependents_included is not None:
            pulumi.set(__self__, "transitive_dependents_included", transitive_dependents_included)

    @_builtins.property
    @pulumi.getter(name="fullyRefreshIncrementalTablesEnabled")
    def fully_refresh_incremental_tables_enabled(self) -> Optional[_builtins.bool]:
        """
        Optional. When set to true, any incremental tables will be fully refreshed.
        """
        return pulumi.get(self, "fully_refresh_incremental_tables_enabled")

    @_builtins.property
    @pulumi.getter(name="includedTags")
    def included_tags(self) -> Optional[Sequence[_builtins.str]]:
        """
        Optional. The set of tags to include.
        """
        return pulumi.get(self, "included_tags")

    @_builtins.property
    @pulumi.getter(name="includedTargets")
    def included_targets(self) -> Optional[Sequence['outputs.RepositoryWorkflowConfigInvocationConfigIncludedTarget']]:
        """
        Optional. The set of action identifiers to include.
        Structure is documented below.
        """
        return pulumi.get(self, "included_targets")

    @_builtins.property
    @pulumi.getter(name="serviceAccount")
    def service_account(self) -> Optional[_builtins.str]:
        """
        Optional. The service account to run workflow invocations under.
        """
        return pulumi.get(self, "service_account")

    @_builtins.property
    @pulumi.getter(name="transitiveDependenciesIncluded")
    def transitive_dependencies_included(self) -> Optional[_builtins.bool]:
        """
        Optional. When set to true, transitive dependencies of included actions will be executed.
        """
        return pulumi.get(self, "transitive_dependencies_included")

    @_builtins.property
    @pulumi.getter(name="transitiveDependentsIncluded")
    def transitive_dependents_included(self) -> Optional[_builtins.bool]:
        """
        Optional. When set to true, transitive dependents of included actions will be executed.
        """
        return pulumi.get(self, "transitive_dependents_included")


@pulumi.output_type
class RepositoryWorkflowConfigInvocationConfigIncludedTarget(dict):
    def __init__(__self__, *,
                 database: Optional[_builtins.str] = None,
                 name: Optional[_builtins.str] = None,
                 schema: Optional[_builtins.str] = None):
        """
        :param _builtins.str database: The action's database (Google Cloud project ID).
        :param _builtins.str name: The action's name, within database and schema.
        :param _builtins.str schema: The action's schema (BigQuery dataset ID), within database.
        """
        if database is not None:
            pulumi.set(__self__, "database", database)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)

    @_builtins.property
    @pulumi.getter
    def database(self) -> Optional[_builtins.str]:
        """
        The action's database (Google Cloud project ID).
        """
        return pulumi.get(self, "database")

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[_builtins.str]:
        """
        The action's name, within database and schema.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def schema(self) -> Optional[_builtins.str]:
        """
        The action's schema (BigQuery dataset ID), within database.
        """
        return pulumi.get(self, "schema")


@pulumi.output_type
class RepositoryWorkflowConfigRecentScheduledExecutionRecord(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "errorStatuses":
            suggest = "error_statuses"
        elif key == "executionTime":
            suggest = "execution_time"
        elif key == "workflowInvocation":
            suggest = "workflow_invocation"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RepositoryWorkflowConfigRecentScheduledExecutionRecord. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RepositoryWorkflowConfigRecentScheduledExecutionRecord.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RepositoryWorkflowConfigRecentScheduledExecutionRecord.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 error_statuses: Optional[Sequence['outputs.RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatus']] = None,
                 execution_time: Optional[_builtins.str] = None,
                 workflow_invocation: Optional[_builtins.str] = None):
        """
        :param Sequence['RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatusArgs'] error_statuses: (Output)
               The error status encountered upon this attempt to create the workflow invocation, if the attempt was unsuccessful.
               Structure is documented below.
        :param _builtins.str execution_time: (Output)
               The timestamp of this workflow attempt.
        :param _builtins.str workflow_invocation: (Output)
               The name of the created workflow invocation, if one was successfully created. In the format projects/*/locations/*/repositories/*/workflowInvocations/*.
        """
        if error_statuses is not None:
            pulumi.set(__self__, "error_statuses", error_statuses)
        if execution_time is not None:
            pulumi.set(__self__, "execution_time", execution_time)
        if workflow_invocation is not None:
            pulumi.set(__self__, "workflow_invocation", workflow_invocation)

    @_builtins.property
    @pulumi.getter(name="errorStatuses")
    def error_statuses(self) -> Optional[Sequence['outputs.RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatus']]:
        """
        (Output)
        The error status encountered upon this attempt to create the workflow invocation, if the attempt was unsuccessful.
        Structure is documented below.
        """
        return pulumi.get(self, "error_statuses")

    @_builtins.property
    @pulumi.getter(name="executionTime")
    def execution_time(self) -> Optional[_builtins.str]:
        """
        (Output)
        The timestamp of this workflow attempt.
        """
        return pulumi.get(self, "execution_time")

    @_builtins.property
    @pulumi.getter(name="workflowInvocation")
    def workflow_invocation(self) -> Optional[_builtins.str]:
        """
        (Output)
        The name of the created workflow invocation, if one was successfully created. In the format projects/*/locations/*/repositories/*/workflowInvocations/*.
        """
        return pulumi.get(self, "workflow_invocation")


@pulumi.output_type
class RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatus(dict):
    def __init__(__self__, *,
                 code: Optional[_builtins.int] = None,
                 message: Optional[_builtins.str] = None):
        """
        :param _builtins.int code: (Output)
               The status code, which should be an enum value of google.rpc.Code.
        :param _builtins.str message: (Output)
               A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
        """
        if code is not None:
            pulumi.set(__self__, "code", code)
        if message is not None:
            pulumi.set(__self__, "message", message)

    @_builtins.property
    @pulumi.getter
    def code(self) -> Optional[_builtins.int]:
        """
        (Output)
        The status code, which should be an enum value of google.rpc.Code.
        """
        return pulumi.get(self, "code")

    @_builtins.property
    @pulumi.getter
    def message(self) -> Optional[_builtins.str]:
        """
        (Output)
        A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
        """
        return pulumi.get(self, "message")


@pulumi.output_type
class RepositoryWorkspaceCompilationOverrides(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "defaultDatabase":
            suggest = "default_database"
        elif key == "schemaSuffix":
            suggest = "schema_suffix"
        elif key == "tablePrefix":
            suggest = "table_prefix"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RepositoryWorkspaceCompilationOverrides. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RepositoryWorkspaceCompilationOverrides.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RepositoryWorkspaceCompilationOverrides.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 default_database: Optional[_builtins.str] = None,
                 schema_suffix: Optional[_builtins.str] = None,
                 table_prefix: Optional[_builtins.str] = None):
        """
        :param _builtins.str default_database: The default database (Google Cloud project ID).
        :param _builtins.str schema_suffix: The suffix that should be appended to all schema (BigQuery dataset ID) names.
        :param _builtins.str table_prefix: The prefix that should be prepended to all table names.
        """
        if default_database is not None:
            pulumi.set(__self__, "default_database", default_database)
        if schema_suffix is not None:
            pulumi.set(__self__, "schema_suffix", schema_suffix)
        if table_prefix is not None:
            pulumi.set(__self__, "table_prefix", table_prefix)

    @_builtins.property
    @pulumi.getter(name="defaultDatabase")
    def default_database(self) -> Optional[_builtins.str]:
        """
        The default database (Google Cloud project ID).
        """
        return pulumi.get(self, "default_database")

    @_builtins.property
    @pulumi.getter(name="schemaSuffix")
    def schema_suffix(self) -> Optional[_builtins.str]:
        """
        The suffix that should be appended to all schema (BigQuery dataset ID) names.
        """
        return pulumi.get(self, "schema_suffix")

    @_builtins.property
    @pulumi.getter(name="tablePrefix")
    def table_prefix(self) -> Optional[_builtins.str]:
        """
        The prefix that should be prepended to all table names.
        """
        return pulumi.get(self, "table_prefix")


