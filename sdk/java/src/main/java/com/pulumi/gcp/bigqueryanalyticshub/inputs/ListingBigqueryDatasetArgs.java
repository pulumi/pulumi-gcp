// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigqueryanalyticshub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListingBigqueryDatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListingBigqueryDatasetArgs Empty = new ListingBigqueryDatasetArgs();

    /**
     * Resource name of the dataset source for this listing. e.g. projects/myproject/datasets/123
     * 
     */
    @Import(name="dataset", required=true)
    private Output<String> dataset;

    /**
     * @return Resource name of the dataset source for this listing. e.g. projects/myproject/datasets/123
     * 
     */
    public Output<String> dataset() {
        return this.dataset;
    }

    private ListingBigqueryDatasetArgs() {}

    private ListingBigqueryDatasetArgs(ListingBigqueryDatasetArgs $) {
        this.dataset = $.dataset;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListingBigqueryDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListingBigqueryDatasetArgs $;

        public Builder() {
            $ = new ListingBigqueryDatasetArgs();
        }

        public Builder(ListingBigqueryDatasetArgs defaults) {
            $ = new ListingBigqueryDatasetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataset Resource name of the dataset source for this listing. e.g. projects/myproject/datasets/123
         * 
         * @return builder
         * 
         */
        public Builder dataset(Output<String> dataset) {
            $.dataset = dataset;
            return this;
        }

        /**
         * @param dataset Resource name of the dataset source for this listing. e.g. projects/myproject/datasets/123
         * 
         * @return builder
         * 
         */
        public Builder dataset(String dataset) {
            return dataset(Output.of(dataset));
        }

        public ListingBigqueryDatasetArgs build() {
            $.dataset = Objects.requireNonNull($.dataset, "expected parameter 'dataset' to be non-null");
            return $;
        }
    }

}