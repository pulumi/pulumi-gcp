// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.vertex.outputs.AiIndexMetadataConfigAlgorithmConfigBruteForceConfig;
import com.pulumi.gcp.vertex.outputs.AiIndexMetadataConfigAlgorithmConfigTreeAhConfig;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AiIndexMetadataConfigAlgorithmConfig {
    /**
     * @return Configuration options for using brute force search, which simply implements the
     * standard linear search in the database for each query.
     * 
     */
    private @Nullable AiIndexMetadataConfigAlgorithmConfigBruteForceConfig bruteForceConfig;
    /**
     * @return Configuration options for using the tree-AH algorithm (Shallow tree + Asymmetric Hashing).
     * Please refer to this paper for more details: https://arxiv.org/abs/1908.10396
     * Structure is documented below.
     * 
     */
    private @Nullable AiIndexMetadataConfigAlgorithmConfigTreeAhConfig treeAhConfig;

    private AiIndexMetadataConfigAlgorithmConfig() {}
    /**
     * @return Configuration options for using brute force search, which simply implements the
     * standard linear search in the database for each query.
     * 
     */
    public Optional<AiIndexMetadataConfigAlgorithmConfigBruteForceConfig> bruteForceConfig() {
        return Optional.ofNullable(this.bruteForceConfig);
    }
    /**
     * @return Configuration options for using the tree-AH algorithm (Shallow tree + Asymmetric Hashing).
     * Please refer to this paper for more details: https://arxiv.org/abs/1908.10396
     * Structure is documented below.
     * 
     */
    public Optional<AiIndexMetadataConfigAlgorithmConfigTreeAhConfig> treeAhConfig() {
        return Optional.ofNullable(this.treeAhConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiIndexMetadataConfigAlgorithmConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AiIndexMetadataConfigAlgorithmConfigBruteForceConfig bruteForceConfig;
        private @Nullable AiIndexMetadataConfigAlgorithmConfigTreeAhConfig treeAhConfig;
        public Builder() {}
        public Builder(AiIndexMetadataConfigAlgorithmConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bruteForceConfig = defaults.bruteForceConfig;
    	      this.treeAhConfig = defaults.treeAhConfig;
        }

        @CustomType.Setter
        public Builder bruteForceConfig(@Nullable AiIndexMetadataConfigAlgorithmConfigBruteForceConfig bruteForceConfig) {
            this.bruteForceConfig = bruteForceConfig;
            return this;
        }
        @CustomType.Setter
        public Builder treeAhConfig(@Nullable AiIndexMetadataConfigAlgorithmConfigTreeAhConfig treeAhConfig) {
            this.treeAhConfig = treeAhConfig;
            return this;
        }
        public AiIndexMetadataConfigAlgorithmConfig build() {
            final var o = new AiIndexMetadataConfigAlgorithmConfig();
            o.bruteForceConfig = bruteForceConfig;
            o.treeAhConfig = treeAhConfig;
            return o;
        }
    }
}