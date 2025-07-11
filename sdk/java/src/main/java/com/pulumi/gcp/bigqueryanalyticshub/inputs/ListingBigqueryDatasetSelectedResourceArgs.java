// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigqueryanalyticshub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListingBigqueryDatasetSelectedResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListingBigqueryDatasetSelectedResourceArgs Empty = new ListingBigqueryDatasetSelectedResourceArgs();

    /**
     * Format: For table: projects/{projectId}/datasets/{datasetId}/tables/{tableId} Example:&#34;projects/test_project/datasets/test_dataset/tables/test_table&#34;
     * 
     */
    @Import(name="table")
    private @Nullable Output<String> table;

    /**
     * @return Format: For table: projects/{projectId}/datasets/{datasetId}/tables/{tableId} Example:&#34;projects/test_project/datasets/test_dataset/tables/test_table&#34;
     * 
     */
    public Optional<Output<String>> table() {
        return Optional.ofNullable(this.table);
    }

    private ListingBigqueryDatasetSelectedResourceArgs() {}

    private ListingBigqueryDatasetSelectedResourceArgs(ListingBigqueryDatasetSelectedResourceArgs $) {
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListingBigqueryDatasetSelectedResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListingBigqueryDatasetSelectedResourceArgs $;

        public Builder() {
            $ = new ListingBigqueryDatasetSelectedResourceArgs();
        }

        public Builder(ListingBigqueryDatasetSelectedResourceArgs defaults) {
            $ = new ListingBigqueryDatasetSelectedResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param table Format: For table: projects/{projectId}/datasets/{datasetId}/tables/{tableId} Example:&#34;projects/test_project/datasets/test_dataset/tables/test_table&#34;
         * 
         * @return builder
         * 
         */
        public Builder table(@Nullable Output<String> table) {
            $.table = table;
            return this;
        }

        /**
         * @param table Format: For table: projects/{projectId}/datasets/{datasetId}/tables/{tableId} Example:&#34;projects/test_project/datasets/test_dataset/tables/test_table&#34;
         * 
         * @return builder
         * 
         */
        public Builder table(String table) {
            return table(Output.of(table));
        }

        public ListingBigqueryDatasetSelectedResourceArgs build() {
            return $;
        }
    }

}
