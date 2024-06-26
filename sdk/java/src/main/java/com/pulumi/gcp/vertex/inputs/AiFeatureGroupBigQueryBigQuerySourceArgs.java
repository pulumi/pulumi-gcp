// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AiFeatureGroupBigQueryBigQuerySourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AiFeatureGroupBigQueryBigQuerySourceArgs Empty = new AiFeatureGroupBigQueryBigQuerySourceArgs();

    /**
     * BigQuery URI to a table, up to 2000 characters long. For example: `bq://projectId.bqDatasetId.bqTableId.`
     * 
     */
    @Import(name="inputUri", required=true)
    private Output<String> inputUri;

    /**
     * @return BigQuery URI to a table, up to 2000 characters long. For example: `bq://projectId.bqDatasetId.bqTableId.`
     * 
     */
    public Output<String> inputUri() {
        return this.inputUri;
    }

    private AiFeatureGroupBigQueryBigQuerySourceArgs() {}

    private AiFeatureGroupBigQueryBigQuerySourceArgs(AiFeatureGroupBigQueryBigQuerySourceArgs $) {
        this.inputUri = $.inputUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AiFeatureGroupBigQueryBigQuerySourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AiFeatureGroupBigQueryBigQuerySourceArgs $;

        public Builder() {
            $ = new AiFeatureGroupBigQueryBigQuerySourceArgs();
        }

        public Builder(AiFeatureGroupBigQueryBigQuerySourceArgs defaults) {
            $ = new AiFeatureGroupBigQueryBigQuerySourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inputUri BigQuery URI to a table, up to 2000 characters long. For example: `bq://projectId.bqDatasetId.bqTableId.`
         * 
         * @return builder
         * 
         */
        public Builder inputUri(Output<String> inputUri) {
            $.inputUri = inputUri;
            return this;
        }

        /**
         * @param inputUri BigQuery URI to a table, up to 2000 characters long. For example: `bq://projectId.bqDatasetId.bqTableId.`
         * 
         * @return builder
         * 
         */
        public Builder inputUri(String inputUri) {
            return inputUri(Output.of(inputUri));
        }

        public AiFeatureGroupBigQueryBigQuerySourceArgs build() {
            if ($.inputUri == null) {
                throw new MissingRequiredPropertyException("AiFeatureGroupBigQueryBigQuerySourceArgs", "inputUri");
            }
            return $;
        }
    }

}
