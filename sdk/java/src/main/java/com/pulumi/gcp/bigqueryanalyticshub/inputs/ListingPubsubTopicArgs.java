// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigqueryanalyticshub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListingPubsubTopicArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListingPubsubTopicArgs Empty = new ListingPubsubTopicArgs();

    /**
     * Region hint on where the data might be published. Data affinity regions are modifiable.
     * See https://cloud.google.com/about/locations for full listing of possible Cloud regions.
     * 
     */
    @Import(name="dataAffinityRegions")
    private @Nullable Output<List<String>> dataAffinityRegions;

    /**
     * @return Region hint on where the data might be published. Data affinity regions are modifiable.
     * See https://cloud.google.com/about/locations for full listing of possible Cloud regions.
     * 
     */
    public Optional<Output<List<String>>> dataAffinityRegions() {
        return Optional.ofNullable(this.dataAffinityRegions);
    }

    /**
     * Resource name of the Pub/Sub topic source for this listing. e.g. projects/myproject/topics/topicId
     * 
     */
    @Import(name="topic", required=true)
    private Output<String> topic;

    /**
     * @return Resource name of the Pub/Sub topic source for this listing. e.g. projects/myproject/topics/topicId
     * 
     */
    public Output<String> topic() {
        return this.topic;
    }

    private ListingPubsubTopicArgs() {}

    private ListingPubsubTopicArgs(ListingPubsubTopicArgs $) {
        this.dataAffinityRegions = $.dataAffinityRegions;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListingPubsubTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListingPubsubTopicArgs $;

        public Builder() {
            $ = new ListingPubsubTopicArgs();
        }

        public Builder(ListingPubsubTopicArgs defaults) {
            $ = new ListingPubsubTopicArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataAffinityRegions Region hint on where the data might be published. Data affinity regions are modifiable.
         * See https://cloud.google.com/about/locations for full listing of possible Cloud regions.
         * 
         * @return builder
         * 
         */
        public Builder dataAffinityRegions(@Nullable Output<List<String>> dataAffinityRegions) {
            $.dataAffinityRegions = dataAffinityRegions;
            return this;
        }

        /**
         * @param dataAffinityRegions Region hint on where the data might be published. Data affinity regions are modifiable.
         * See https://cloud.google.com/about/locations for full listing of possible Cloud regions.
         * 
         * @return builder
         * 
         */
        public Builder dataAffinityRegions(List<String> dataAffinityRegions) {
            return dataAffinityRegions(Output.of(dataAffinityRegions));
        }

        /**
         * @param dataAffinityRegions Region hint on where the data might be published. Data affinity regions are modifiable.
         * See https://cloud.google.com/about/locations for full listing of possible Cloud regions.
         * 
         * @return builder
         * 
         */
        public Builder dataAffinityRegions(String... dataAffinityRegions) {
            return dataAffinityRegions(List.of(dataAffinityRegions));
        }

        /**
         * @param topic Resource name of the Pub/Sub topic source for this listing. e.g. projects/myproject/topics/topicId
         * 
         * @return builder
         * 
         */
        public Builder topic(Output<String> topic) {
            $.topic = topic;
            return this;
        }

        /**
         * @param topic Resource name of the Pub/Sub topic source for this listing. e.g. projects/myproject/topics/topicId
         * 
         * @return builder
         * 
         */
        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public ListingPubsubTopicArgs build() {
            if ($.topic == null) {
                throw new MissingRequiredPropertyException("ListingPubsubTopicArgs", "topic");
            }
            return $;
        }
    }

}
