// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionDiscoveryConfigTargetBigQueryTargetConditionsTypesArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionDiscoveryConfigTargetBigQueryTargetConditionsTypesArgs Empty = new PreventionDiscoveryConfigTargetBigQueryTargetConditionsTypesArgs();

    /**
     * A set of BiqQuery table types
     * Each value may be one of: `BIG_QUERY_TABLE_TYPE_TABLE`, `BIG_QUERY_TABLE_TYPE_EXTERNAL_BIG_LAKE`.
     * 
     */
    @Import(name="types")
    private @Nullable Output<List<String>> types;

    /**
     * @return A set of BiqQuery table types
     * Each value may be one of: `BIG_QUERY_TABLE_TYPE_TABLE`, `BIG_QUERY_TABLE_TYPE_EXTERNAL_BIG_LAKE`.
     * 
     */
    public Optional<Output<List<String>>> types() {
        return Optional.ofNullable(this.types);
    }

    private PreventionDiscoveryConfigTargetBigQueryTargetConditionsTypesArgs() {}

    private PreventionDiscoveryConfigTargetBigQueryTargetConditionsTypesArgs(PreventionDiscoveryConfigTargetBigQueryTargetConditionsTypesArgs $) {
        this.types = $.types;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDiscoveryConfigTargetBigQueryTargetConditionsTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDiscoveryConfigTargetBigQueryTargetConditionsTypesArgs $;

        public Builder() {
            $ = new PreventionDiscoveryConfigTargetBigQueryTargetConditionsTypesArgs();
        }

        public Builder(PreventionDiscoveryConfigTargetBigQueryTargetConditionsTypesArgs defaults) {
            $ = new PreventionDiscoveryConfigTargetBigQueryTargetConditionsTypesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param types A set of BiqQuery table types
         * Each value may be one of: `BIG_QUERY_TABLE_TYPE_TABLE`, `BIG_QUERY_TABLE_TYPE_EXTERNAL_BIG_LAKE`.
         * 
         * @return builder
         * 
         */
        public Builder types(@Nullable Output<List<String>> types) {
            $.types = types;
            return this;
        }

        /**
         * @param types A set of BiqQuery table types
         * Each value may be one of: `BIG_QUERY_TABLE_TYPE_TABLE`, `BIG_QUERY_TABLE_TYPE_EXTERNAL_BIG_LAKE`.
         * 
         * @return builder
         * 
         */
        public Builder types(List<String> types) {
            return types(Output.of(types));
        }

        /**
         * @param types A set of BiqQuery table types
         * Each value may be one of: `BIG_QUERY_TABLE_TYPE_TABLE`, `BIG_QUERY_TABLE_TYPE_EXTERNAL_BIG_LAKE`.
         * 
         * @return builder
         * 
         */
        public Builder types(String... types) {
            return types(List.of(types));
        }

        public PreventionDiscoveryConfigTargetBigQueryTargetConditionsTypesArgs build() {
            return $;
        }
    }

}
