// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AiIndexMetadataConfigAlgorithmConfigTreeAhConfig {
    /**
     * @return Number of embeddings on each leaf node. The default value is 1000 if not set.
     * 
     */
    private @Nullable Integer leafNodeEmbeddingCount;
    /**
     * @return The default percentage of leaf nodes that any query may be searched. Must be in
     * range 1-100, inclusive. The default value is 10 (means 10%) if not set.
     * 
     */
    private @Nullable Integer leafNodesToSearchPercent;

    private AiIndexMetadataConfigAlgorithmConfigTreeAhConfig() {}
    /**
     * @return Number of embeddings on each leaf node. The default value is 1000 if not set.
     * 
     */
    public Optional<Integer> leafNodeEmbeddingCount() {
        return Optional.ofNullable(this.leafNodeEmbeddingCount);
    }
    /**
     * @return The default percentage of leaf nodes that any query may be searched. Must be in
     * range 1-100, inclusive. The default value is 10 (means 10%) if not set.
     * 
     */
    public Optional<Integer> leafNodesToSearchPercent() {
        return Optional.ofNullable(this.leafNodesToSearchPercent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiIndexMetadataConfigAlgorithmConfigTreeAhConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer leafNodeEmbeddingCount;
        private @Nullable Integer leafNodesToSearchPercent;
        public Builder() {}
        public Builder(AiIndexMetadataConfigAlgorithmConfigTreeAhConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.leafNodeEmbeddingCount = defaults.leafNodeEmbeddingCount;
    	      this.leafNodesToSearchPercent = defaults.leafNodesToSearchPercent;
        }

        @CustomType.Setter
        public Builder leafNodeEmbeddingCount(@Nullable Integer leafNodeEmbeddingCount) {
            this.leafNodeEmbeddingCount = leafNodeEmbeddingCount;
            return this;
        }
        @CustomType.Setter
        public Builder leafNodesToSearchPercent(@Nullable Integer leafNodesToSearchPercent) {
            this.leafNodesToSearchPercent = leafNodesToSearchPercent;
            return this;
        }
        public AiIndexMetadataConfigAlgorithmConfigTreeAhConfig build() {
            final var o = new AiIndexMetadataConfigAlgorithmConfigTreeAhConfig();
            o.leafNodeEmbeddingCount = leafNodeEmbeddingCount;
            o.leafNodesToSearchPercent = leafNodesToSearchPercent;
            return o;
        }
    }
}