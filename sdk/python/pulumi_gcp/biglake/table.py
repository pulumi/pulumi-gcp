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

__all__ = ['TableArgs', 'Table']

@pulumi.input_type
class TableArgs:
    def __init__(__self__, *,
                 database: Optional[pulumi.Input[str]] = None,
                 hive_options: Optional[pulumi.Input['TableHiveOptionsArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Table resource.
        :param pulumi.Input[str] database: The id of the parent database.
        :param pulumi.Input['TableHiveOptionsArgs'] hive_options: Options of a Hive table.
               Structure is documented below.
        :param pulumi.Input[str] name: Output only. The name of the Table. Format:
               projects/{project_id_or_number}/locations/{locationId}/catalogs/{catalogId}/databases/{databaseId}/tables/{tableId}
               
               
               - - -
        :param pulumi.Input[str] type: The database type.
               Possible values are: `HIVE`.
        """
        if database is not None:
            pulumi.set(__self__, "database", database)
        if hive_options is not None:
            pulumi.set(__self__, "hive_options", hive_options)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the parent database.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="hiveOptions")
    def hive_options(self) -> Optional[pulumi.Input['TableHiveOptionsArgs']]:
        """
        Options of a Hive table.
        Structure is documented below.
        """
        return pulumi.get(self, "hive_options")

    @hive_options.setter
    def hive_options(self, value: Optional[pulumi.Input['TableHiveOptionsArgs']]):
        pulumi.set(self, "hive_options", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Output only. The name of the Table. Format:
        projects/{project_id_or_number}/locations/{locationId}/catalogs/{catalogId}/databases/{databaseId}/tables/{tableId}


        - - -
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The database type.
        Possible values are: `HIVE`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _TableState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 delete_time: Optional[pulumi.Input[str]] = None,
                 etag: Optional[pulumi.Input[str]] = None,
                 expire_time: Optional[pulumi.Input[str]] = None,
                 hive_options: Optional[pulumi.Input['TableHiveOptionsArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 update_time: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Table resources.
        :param pulumi.Input[str] create_time: Output only. The creation time of the table. A timestamp in RFC3339 UTC
               "Zulu" format, with nanosecond resolution and up to nine fractional
               digits. Examples: "2014-10-02T15:01:23Z" and
               "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input[str] database: The id of the parent database.
        :param pulumi.Input[str] delete_time: Output only. The deletion time of the table. Only set after the
               table is deleted. A timestamp in RFC3339 UTC "Zulu" format, with
               nanosecond resolution and up to nine fractional digits. Examples:
               "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input[str] etag: The checksum of a table object computed by the server based on the value
               of other fields. It may be sent on update requests to ensure the client
               has an up-to-date value before proceeding. It is only checked for update
               table operations.
        :param pulumi.Input[str] expire_time: Output only. The time when this table is considered expired. Only set
               after the table is deleted. A timestamp in RFC3339 UTC "Zulu" format,
               with nanosecond resolution and up to nine fractional digits. Examples:
               "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input['TableHiveOptionsArgs'] hive_options: Options of a Hive table.
               Structure is documented below.
        :param pulumi.Input[str] name: Output only. The name of the Table. Format:
               projects/{project_id_or_number}/locations/{locationId}/catalogs/{catalogId}/databases/{databaseId}/tables/{tableId}
               
               
               - - -
        :param pulumi.Input[str] type: The database type.
               Possible values are: `HIVE`.
        :param pulumi.Input[str] update_time: Output only. The last modification time of the table. A timestamp in
               RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
               fractional digits. Examples: "2014-10-02T15:01:23Z" and
               "2014-10-02T15:01:23.045123456Z".
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if delete_time is not None:
            pulumi.set(__self__, "delete_time", delete_time)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if expire_time is not None:
            pulumi.set(__self__, "expire_time", expire_time)
        if hive_options is not None:
            pulumi.set(__self__, "hive_options", hive_options)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        Output only. The creation time of the table. A timestamp in RFC3339 UTC
        "Zulu" format, with nanosecond resolution and up to nine fractional
        digits. Examples: "2014-10-02T15:01:23Z" and
        "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the parent database.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="deleteTime")
    def delete_time(self) -> Optional[pulumi.Input[str]]:
        """
        Output only. The deletion time of the table. Only set after the
        table is deleted. A timestamp in RFC3339 UTC "Zulu" format, with
        nanosecond resolution and up to nine fractional digits. Examples:
        "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "delete_time")

    @delete_time.setter
    def delete_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delete_time", value)

    @property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[str]]:
        """
        The checksum of a table object computed by the server based on the value
        of other fields. It may be sent on update requests to ensure the client
        has an up-to-date value before proceeding. It is only checked for update
        table operations.
        """
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "etag", value)

    @property
    @pulumi.getter(name="expireTime")
    def expire_time(self) -> Optional[pulumi.Input[str]]:
        """
        Output only. The time when this table is considered expired. Only set
        after the table is deleted. A timestamp in RFC3339 UTC "Zulu" format,
        with nanosecond resolution and up to nine fractional digits. Examples:
        "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "expire_time")

    @expire_time.setter
    def expire_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expire_time", value)

    @property
    @pulumi.getter(name="hiveOptions")
    def hive_options(self) -> Optional[pulumi.Input['TableHiveOptionsArgs']]:
        """
        Options of a Hive table.
        Structure is documented below.
        """
        return pulumi.get(self, "hive_options")

    @hive_options.setter
    def hive_options(self, value: Optional[pulumi.Input['TableHiveOptionsArgs']]):
        pulumi.set(self, "hive_options", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Output only. The name of the Table. Format:
        projects/{project_id_or_number}/locations/{locationId}/catalogs/{catalogId}/databases/{databaseId}/tables/{tableId}


        - - -
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The database type.
        Possible values are: `HIVE`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[str]]:
        """
        Output only. The last modification time of the table. A timestamp in
        RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
        fractional digits. Examples: "2014-10-02T15:01:23Z" and
        "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "update_time", value)


class Table(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 hive_options: Optional[pulumi.Input[pulumi.InputType['TableHiveOptionsArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Represents a table.

        To get more information about Table, see:

        * [API documentation](https://cloud.google.com/bigquery/docs/reference/biglake/rest/v1/projects.locations.catalogs.databases.tables)
        * How-to Guides
            * [Manage open source metadata with BigLake Metastore](https://cloud.google.com/bigquery/docs/manage-open-source-metadata#create_tables)

        ## Example Usage
        ### Biglake Table

        ```python
        import pulumi
        import pulumi_gcp as gcp

        catalog = gcp.biglake.Catalog("catalog", location="US")
        bucket = gcp.storage.Bucket("bucket",
            location="US",
            force_destroy=True,
            uniform_bucket_level_access=True)
        metadata_folder = gcp.storage.BucketObject("metadataFolder",
            content=" ",
            bucket=bucket.name)
        data_folder = gcp.storage.BucketObject("dataFolder",
            content=" ",
            bucket=bucket.name)
        database = gcp.biglake.Database("database",
            catalog=catalog.id,
            type="HIVE",
            hive_options=gcp.biglake.DatabaseHiveOptionsArgs(
                location_uri=pulumi.Output.all(bucket.name, metadata_folder.name).apply(lambda bucketName, metadataFolderName: f"gs://{bucket_name}/{metadata_folder_name}"),
                parameters={
                    "owner": "Alex",
                },
            ))
        table = gcp.biglake.Table("table",
            database=database.id,
            type="HIVE",
            hive_options=gcp.biglake.TableHiveOptionsArgs(
                table_type="MANAGED_TABLE",
                storage_descriptor=gcp.biglake.TableHiveOptionsStorageDescriptorArgs(
                    location_uri=pulumi.Output.all(bucket.name, data_folder.name).apply(lambda bucketName, dataFolderName: f"gs://{bucket_name}/{data_folder_name}"),
                    input_format="org.apache.hadoop.mapred.SequenceFileInputFormat",
                    output_format="org.apache.hadoop.hive.ql.io.HiveSequenceFileOutputFormat",
                ),
                parameters={
                    "spark.sql.create.version": "3.1.3",
                    "spark.sql.sources.schema.numParts": "1",
                    "transient_lastDdlTime": "1680894197",
                    "spark.sql.partitionProvider": "catalog",
                    "owner": "John Doe",
                    "spark.sql.sources.schema.part.0": "{\\"type\\":\\"struct\\",\\"fields\\":[{\\"name\\":\\"id\\",\\"type\\":\\"integer\\",\\"nullable\\":true,\\"metadata\\":{}},{\\"name\\":\\"name\\",\\"type\\":\\"string\\",\\"nullable\\":true,\\"metadata\\":{}},{\\"name\\":\\"age\\",\\"type\\":\\"integer\\",\\"nullable\\":true,\\"metadata\\":{}}]}",
                    "spark.sql.sources.provider": "iceberg",
                    "provider": "iceberg",
                },
            ))
        ```

        ## Import

        Table can be imported using any of these accepted formats:

        ```sh
         $ pulumi import gcp:biglake/table:Table default {{database}}/tables/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] database: The id of the parent database.
        :param pulumi.Input[pulumi.InputType['TableHiveOptionsArgs']] hive_options: Options of a Hive table.
               Structure is documented below.
        :param pulumi.Input[str] name: Output only. The name of the Table. Format:
               projects/{project_id_or_number}/locations/{locationId}/catalogs/{catalogId}/databases/{databaseId}/tables/{tableId}
               
               
               - - -
        :param pulumi.Input[str] type: The database type.
               Possible values are: `HIVE`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[TableArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Represents a table.

        To get more information about Table, see:

        * [API documentation](https://cloud.google.com/bigquery/docs/reference/biglake/rest/v1/projects.locations.catalogs.databases.tables)
        * How-to Guides
            * [Manage open source metadata with BigLake Metastore](https://cloud.google.com/bigquery/docs/manage-open-source-metadata#create_tables)

        ## Example Usage
        ### Biglake Table

        ```python
        import pulumi
        import pulumi_gcp as gcp

        catalog = gcp.biglake.Catalog("catalog", location="US")
        bucket = gcp.storage.Bucket("bucket",
            location="US",
            force_destroy=True,
            uniform_bucket_level_access=True)
        metadata_folder = gcp.storage.BucketObject("metadataFolder",
            content=" ",
            bucket=bucket.name)
        data_folder = gcp.storage.BucketObject("dataFolder",
            content=" ",
            bucket=bucket.name)
        database = gcp.biglake.Database("database",
            catalog=catalog.id,
            type="HIVE",
            hive_options=gcp.biglake.DatabaseHiveOptionsArgs(
                location_uri=pulumi.Output.all(bucket.name, metadata_folder.name).apply(lambda bucketName, metadataFolderName: f"gs://{bucket_name}/{metadata_folder_name}"),
                parameters={
                    "owner": "Alex",
                },
            ))
        table = gcp.biglake.Table("table",
            database=database.id,
            type="HIVE",
            hive_options=gcp.biglake.TableHiveOptionsArgs(
                table_type="MANAGED_TABLE",
                storage_descriptor=gcp.biglake.TableHiveOptionsStorageDescriptorArgs(
                    location_uri=pulumi.Output.all(bucket.name, data_folder.name).apply(lambda bucketName, dataFolderName: f"gs://{bucket_name}/{data_folder_name}"),
                    input_format="org.apache.hadoop.mapred.SequenceFileInputFormat",
                    output_format="org.apache.hadoop.hive.ql.io.HiveSequenceFileOutputFormat",
                ),
                parameters={
                    "spark.sql.create.version": "3.1.3",
                    "spark.sql.sources.schema.numParts": "1",
                    "transient_lastDdlTime": "1680894197",
                    "spark.sql.partitionProvider": "catalog",
                    "owner": "John Doe",
                    "spark.sql.sources.schema.part.0": "{\\"type\\":\\"struct\\",\\"fields\\":[{\\"name\\":\\"id\\",\\"type\\":\\"integer\\",\\"nullable\\":true,\\"metadata\\":{}},{\\"name\\":\\"name\\",\\"type\\":\\"string\\",\\"nullable\\":true,\\"metadata\\":{}},{\\"name\\":\\"age\\",\\"type\\":\\"integer\\",\\"nullable\\":true,\\"metadata\\":{}}]}",
                    "spark.sql.sources.provider": "iceberg",
                    "provider": "iceberg",
                },
            ))
        ```

        ## Import

        Table can be imported using any of these accepted formats:

        ```sh
         $ pulumi import gcp:biglake/table:Table default {{database}}/tables/{{name}}
        ```

        :param str resource_name: The name of the resource.
        :param TableArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TableArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 hive_options: Optional[pulumi.Input[pulumi.InputType['TableHiveOptionsArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TableArgs.__new__(TableArgs)

            __props__.__dict__["database"] = database
            __props__.__dict__["hive_options"] = hive_options
            __props__.__dict__["name"] = name
            __props__.__dict__["type"] = type
            __props__.__dict__["create_time"] = None
            __props__.__dict__["delete_time"] = None
            __props__.__dict__["etag"] = None
            __props__.__dict__["expire_time"] = None
            __props__.__dict__["update_time"] = None
        super(Table, __self__).__init__(
            'gcp:biglake/table:Table',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            database: Optional[pulumi.Input[str]] = None,
            delete_time: Optional[pulumi.Input[str]] = None,
            etag: Optional[pulumi.Input[str]] = None,
            expire_time: Optional[pulumi.Input[str]] = None,
            hive_options: Optional[pulumi.Input[pulumi.InputType['TableHiveOptionsArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            update_time: Optional[pulumi.Input[str]] = None) -> 'Table':
        """
        Get an existing Table resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] create_time: Output only. The creation time of the table. A timestamp in RFC3339 UTC
               "Zulu" format, with nanosecond resolution and up to nine fractional
               digits. Examples: "2014-10-02T15:01:23Z" and
               "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input[str] database: The id of the parent database.
        :param pulumi.Input[str] delete_time: Output only. The deletion time of the table. Only set after the
               table is deleted. A timestamp in RFC3339 UTC "Zulu" format, with
               nanosecond resolution and up to nine fractional digits. Examples:
               "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input[str] etag: The checksum of a table object computed by the server based on the value
               of other fields. It may be sent on update requests to ensure the client
               has an up-to-date value before proceeding. It is only checked for update
               table operations.
        :param pulumi.Input[str] expire_time: Output only. The time when this table is considered expired. Only set
               after the table is deleted. A timestamp in RFC3339 UTC "Zulu" format,
               with nanosecond resolution and up to nine fractional digits. Examples:
               "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input[pulumi.InputType['TableHiveOptionsArgs']] hive_options: Options of a Hive table.
               Structure is documented below.
        :param pulumi.Input[str] name: Output only. The name of the Table. Format:
               projects/{project_id_or_number}/locations/{locationId}/catalogs/{catalogId}/databases/{databaseId}/tables/{tableId}
               
               
               - - -
        :param pulumi.Input[str] type: The database type.
               Possible values are: `HIVE`.
        :param pulumi.Input[str] update_time: Output only. The last modification time of the table. A timestamp in
               RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
               fractional digits. Examples: "2014-10-02T15:01:23Z" and
               "2014-10-02T15:01:23.045123456Z".
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TableState.__new__(_TableState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["database"] = database
        __props__.__dict__["delete_time"] = delete_time
        __props__.__dict__["etag"] = etag
        __props__.__dict__["expire_time"] = expire_time
        __props__.__dict__["hive_options"] = hive_options
        __props__.__dict__["name"] = name
        __props__.__dict__["type"] = type
        __props__.__dict__["update_time"] = update_time
        return Table(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        Output only. The creation time of the table. A timestamp in RFC3339 UTC
        "Zulu" format, with nanosecond resolution and up to nine fractional
        digits. Examples: "2014-10-02T15:01:23Z" and
        "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[Optional[str]]:
        """
        The id of the parent database.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter(name="deleteTime")
    def delete_time(self) -> pulumi.Output[str]:
        """
        Output only. The deletion time of the table. Only set after the
        table is deleted. A timestamp in RFC3339 UTC "Zulu" format, with
        nanosecond resolution and up to nine fractional digits. Examples:
        "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "delete_time")

    @property
    @pulumi.getter
    def etag(self) -> pulumi.Output[str]:
        """
        The checksum of a table object computed by the server based on the value
        of other fields. It may be sent on update requests to ensure the client
        has an up-to-date value before proceeding. It is only checked for update
        table operations.
        """
        return pulumi.get(self, "etag")

    @property
    @pulumi.getter(name="expireTime")
    def expire_time(self) -> pulumi.Output[str]:
        """
        Output only. The time when this table is considered expired. Only set
        after the table is deleted. A timestamp in RFC3339 UTC "Zulu" format,
        with nanosecond resolution and up to nine fractional digits. Examples:
        "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "expire_time")

    @property
    @pulumi.getter(name="hiveOptions")
    def hive_options(self) -> pulumi.Output[Optional['outputs.TableHiveOptions']]:
        """
        Options of a Hive table.
        Structure is documented below.
        """
        return pulumi.get(self, "hive_options")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Output only. The name of the Table. Format:
        projects/{project_id_or_number}/locations/{locationId}/catalogs/{catalogId}/databases/{databaseId}/tables/{tableId}


        - - -
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        The database type.
        Possible values are: `HIVE`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[str]:
        """
        Output only. The last modification time of the table. A timestamp in
        RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
        fractional digits. Examples: "2014-10-02T15:01:23Z" and
        "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "update_time")
