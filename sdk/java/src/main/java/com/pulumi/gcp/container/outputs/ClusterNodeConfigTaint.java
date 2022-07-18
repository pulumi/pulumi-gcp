// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterNodeConfigTaint {
    /**
     * @return Effect for taint. Accepted values are `NO_SCHEDULE`, `PREFER_NO_SCHEDULE`, and `NO_EXECUTE`.
     * 
     */
    private final String effect;
    /**
     * @return Key for taint.
     * 
     */
    private final String key;
    /**
     * @return Value for taint.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ClusterNodeConfigTaint(
        @CustomType.Parameter("effect") String effect,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.effect = effect;
        this.key = key;
        this.value = value;
    }

    /**
     * @return Effect for taint. Accepted values are `NO_SCHEDULE`, `PREFER_NO_SCHEDULE`, and `NO_EXECUTE`.
     * 
     */
    public String effect() {
        return this.effect;
    }
    /**
     * @return Key for taint.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Value for taint.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigTaint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String effect;
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder effect(String effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public ClusterNodeConfigTaint build() {
            return new ClusterNodeConfigTaint(effect, key, value);
        }
    }
}