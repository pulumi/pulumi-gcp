// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigquery.inputs.TableExternalCatalogTableOptionsStorageDescriptorArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableExternalCatalogTableOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableExternalCatalogTableOptionsArgs Empty = new TableExternalCatalogTableOptionsArgs();

    /**
     * The connection specifying the credentials to be
     * used to read external storage, such as Azure Blob, Cloud Storage, or S3. The
     * connection is needed to read the open source table from BigQuery Engine. The
     * connection_id can have the form `&lt;project_id&gt;.&lt;location_id&gt;.&lt;connection_id&gt;`
     * or `projects/&lt;project_id&gt;/locations/&lt;location_id&gt;/connections/&lt;connection_id&gt;`.
     * 
     */
    @Import(name="connectionId")
    private @Nullable Output<String> connectionId;

    /**
     * @return The connection specifying the credentials to be
     * used to read external storage, such as Azure Blob, Cloud Storage, or S3. The
     * connection is needed to read the open source table from BigQuery Engine. The
     * connection_id can have the form `&lt;project_id&gt;.&lt;location_id&gt;.&lt;connection_id&gt;`
     * or `projects/&lt;project_id&gt;/locations/&lt;location_id&gt;/connections/&lt;connection_id&gt;`.
     * 
     */
    public Optional<Output<String>> connectionId() {
        return Optional.ofNullable(this.connectionId);
    }

    /**
     * A map of key value pairs defining the parameters and
     * properties of the open source table. Corresponds with hive meta store table
     * parameters. Maximum size of 4Mib.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of key value pairs defining the parameters and
     * properties of the open source table. Corresponds with hive meta store table
     * parameters. Maximum size of 4Mib.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * A storage descriptor containing information
     * about the physical storage of this table. Structure is documented below.
     * 
     */
    @Import(name="storageDescriptor")
    private @Nullable Output<TableExternalCatalogTableOptionsStorageDescriptorArgs> storageDescriptor;

    /**
     * @return A storage descriptor containing information
     * about the physical storage of this table. Structure is documented below.
     * 
     */
    public Optional<Output<TableExternalCatalogTableOptionsStorageDescriptorArgs>> storageDescriptor() {
        return Optional.ofNullable(this.storageDescriptor);
    }

    private TableExternalCatalogTableOptionsArgs() {}

    private TableExternalCatalogTableOptionsArgs(TableExternalCatalogTableOptionsArgs $) {
        this.connectionId = $.connectionId;
        this.parameters = $.parameters;
        this.storageDescriptor = $.storageDescriptor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableExternalCatalogTableOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableExternalCatalogTableOptionsArgs $;

        public Builder() {
            $ = new TableExternalCatalogTableOptionsArgs();
        }

        public Builder(TableExternalCatalogTableOptionsArgs defaults) {
            $ = new TableExternalCatalogTableOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionId The connection specifying the credentials to be
         * used to read external storage, such as Azure Blob, Cloud Storage, or S3. The
         * connection is needed to read the open source table from BigQuery Engine. The
         * connection_id can have the form `&lt;project_id&gt;.&lt;location_id&gt;.&lt;connection_id&gt;`
         * or `projects/&lt;project_id&gt;/locations/&lt;location_id&gt;/connections/&lt;connection_id&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(@Nullable Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param connectionId The connection specifying the credentials to be
         * used to read external storage, such as Azure Blob, Cloud Storage, or S3. The
         * connection is needed to read the open source table from BigQuery Engine. The
         * connection_id can have the form `&lt;project_id&gt;.&lt;location_id&gt;.&lt;connection_id&gt;`
         * or `projects/&lt;project_id&gt;/locations/&lt;location_id&gt;/connections/&lt;connection_id&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        /**
         * @param parameters A map of key value pairs defining the parameters and
         * properties of the open source table. Corresponds with hive meta store table
         * parameters. Maximum size of 4Mib.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of key value pairs defining the parameters and
         * properties of the open source table. Corresponds with hive meta store table
         * parameters. Maximum size of 4Mib.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param storageDescriptor A storage descriptor containing information
         * about the physical storage of this table. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder storageDescriptor(@Nullable Output<TableExternalCatalogTableOptionsStorageDescriptorArgs> storageDescriptor) {
            $.storageDescriptor = storageDescriptor;
            return this;
        }

        /**
         * @param storageDescriptor A storage descriptor containing information
         * about the physical storage of this table. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder storageDescriptor(TableExternalCatalogTableOptionsStorageDescriptorArgs storageDescriptor) {
            return storageDescriptor(Output.of(storageDescriptor));
        }

        public TableExternalCatalogTableOptionsArgs build() {
            return $;
        }
    }

}
