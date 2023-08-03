// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.vertex.outputs.GetAiIndexMetadataConfigAlgorithmConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAiIndexMetadataConfig {
    private List<GetAiIndexMetadataConfigAlgorithmConfig> algorithmConfigs;
    private Integer approximateNeighborsCount;
    private Integer dimensions;
    private String distanceMeasureType;
    private String featureNormType;
    private String shardSize;

    private GetAiIndexMetadataConfig() {}
    public List<GetAiIndexMetadataConfigAlgorithmConfig> algorithmConfigs() {
        return this.algorithmConfigs;
    }
    public Integer approximateNeighborsCount() {
        return this.approximateNeighborsCount;
    }
    public Integer dimensions() {
        return this.dimensions;
    }
    public String distanceMeasureType() {
        return this.distanceMeasureType;
    }
    public String featureNormType() {
        return this.featureNormType;
    }
    public String shardSize() {
        return this.shardSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAiIndexMetadataConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAiIndexMetadataConfigAlgorithmConfig> algorithmConfigs;
        private Integer approximateNeighborsCount;
        private Integer dimensions;
        private String distanceMeasureType;
        private String featureNormType;
        private String shardSize;
        public Builder() {}
        public Builder(GetAiIndexMetadataConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithmConfigs = defaults.algorithmConfigs;
    	      this.approximateNeighborsCount = defaults.approximateNeighborsCount;
    	      this.dimensions = defaults.dimensions;
    	      this.distanceMeasureType = defaults.distanceMeasureType;
    	      this.featureNormType = defaults.featureNormType;
    	      this.shardSize = defaults.shardSize;
        }

        @CustomType.Setter
        public Builder algorithmConfigs(List<GetAiIndexMetadataConfigAlgorithmConfig> algorithmConfigs) {
            this.algorithmConfigs = Objects.requireNonNull(algorithmConfigs);
            return this;
        }
        public Builder algorithmConfigs(GetAiIndexMetadataConfigAlgorithmConfig... algorithmConfigs) {
            return algorithmConfigs(List.of(algorithmConfigs));
        }
        @CustomType.Setter
        public Builder approximateNeighborsCount(Integer approximateNeighborsCount) {
            this.approximateNeighborsCount = Objects.requireNonNull(approximateNeighborsCount);
            return this;
        }
        @CustomType.Setter
        public Builder dimensions(Integer dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }
        @CustomType.Setter
        public Builder distanceMeasureType(String distanceMeasureType) {
            this.distanceMeasureType = Objects.requireNonNull(distanceMeasureType);
            return this;
        }
        @CustomType.Setter
        public Builder featureNormType(String featureNormType) {
            this.featureNormType = Objects.requireNonNull(featureNormType);
            return this;
        }
        @CustomType.Setter
        public Builder shardSize(String shardSize) {
            this.shardSize = Objects.requireNonNull(shardSize);
            return this;
        }
        public GetAiIndexMetadataConfig build() {
            final var o = new GetAiIndexMetadataConfig();
            o.algorithmConfigs = algorithmConfigs;
            o.approximateNeighborsCount = approximateNeighborsCount;
            o.dimensions = dimensions;
            o.distanceMeasureType = distanceMeasureType;
            o.featureNormType = featureNormType;
            o.shardSize = shardSize;
            return o;
        }
    }
}