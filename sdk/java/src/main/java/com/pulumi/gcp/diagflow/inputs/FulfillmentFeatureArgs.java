// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FulfillmentFeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final FulfillmentFeatureArgs Empty = new FulfillmentFeatureArgs();

    /**
     * The type of the feature that enabled for fulfillment.
     * * SMALLTALK: Fulfillment is enabled for SmallTalk.
     *   Possible values are `SMALLTALK`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the feature that enabled for fulfillment.
     * * SMALLTALK: Fulfillment is enabled for SmallTalk.
     *   Possible values are `SMALLTALK`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private FulfillmentFeatureArgs() {}

    private FulfillmentFeatureArgs(FulfillmentFeatureArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FulfillmentFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FulfillmentFeatureArgs $;

        public Builder() {
            $ = new FulfillmentFeatureArgs();
        }

        public Builder(FulfillmentFeatureArgs defaults) {
            $ = new FulfillmentFeatureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of the feature that enabled for fulfillment.
         * * SMALLTALK: Fulfillment is enabled for SmallTalk.
         *   Possible values are `SMALLTALK`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the feature that enabled for fulfillment.
         * * SMALLTALK: Fulfillment is enabled for SmallTalk.
         *   Possible values are `SMALLTALK`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FulfillmentFeatureArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}