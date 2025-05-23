// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.datastream.inputs.StreamBackfillAllSalesforceExcludedObjectsObjectArgs;
import java.util.List;
import java.util.Objects;


public final class StreamBackfillAllSalesforceExcludedObjectsArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamBackfillAllSalesforceExcludedObjectsArgs Empty = new StreamBackfillAllSalesforceExcludedObjectsArgs();

    /**
     * Salesforce objects in Salesforce Org.
     * Structure is documented below.
     * 
     */
    @Import(name="objects", required=true)
    private Output<List<StreamBackfillAllSalesforceExcludedObjectsObjectArgs>> objects;

    /**
     * @return Salesforce objects in Salesforce Org.
     * Structure is documented below.
     * 
     */
    public Output<List<StreamBackfillAllSalesforceExcludedObjectsObjectArgs>> objects() {
        return this.objects;
    }

    private StreamBackfillAllSalesforceExcludedObjectsArgs() {}

    private StreamBackfillAllSalesforceExcludedObjectsArgs(StreamBackfillAllSalesforceExcludedObjectsArgs $) {
        this.objects = $.objects;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamBackfillAllSalesforceExcludedObjectsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamBackfillAllSalesforceExcludedObjectsArgs $;

        public Builder() {
            $ = new StreamBackfillAllSalesforceExcludedObjectsArgs();
        }

        public Builder(StreamBackfillAllSalesforceExcludedObjectsArgs defaults) {
            $ = new StreamBackfillAllSalesforceExcludedObjectsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param objects Salesforce objects in Salesforce Org.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder objects(Output<List<StreamBackfillAllSalesforceExcludedObjectsObjectArgs>> objects) {
            $.objects = objects;
            return this;
        }

        /**
         * @param objects Salesforce objects in Salesforce Org.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder objects(List<StreamBackfillAllSalesforceExcludedObjectsObjectArgs> objects) {
            return objects(Output.of(objects));
        }

        /**
         * @param objects Salesforce objects in Salesforce Org.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder objects(StreamBackfillAllSalesforceExcludedObjectsObjectArgs... objects) {
            return objects(List.of(objects));
        }

        public StreamBackfillAllSalesforceExcludedObjectsArgs build() {
            if ($.objects == null) {
                throw new MissingRequiredPropertyException("StreamBackfillAllSalesforceExcludedObjectsArgs", "objects");
            }
            return $;
        }
    }

}
