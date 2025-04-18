// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterNodePoolNodeConfigTaint {
    /**
     * @return Effect for taint. Accepted values are `NO_SCHEDULE`, `PREFER_NO_SCHEDULE`, and `NO_EXECUTE`.
     * 
     */
    private String effect;
    /**
     * @return Key for taint.
     * 
     */
    private String key;
    /**
     * @return Value for taint.
     * 
     */
    private String value;

    private ClusterNodePoolNodeConfigTaint() {}
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

    public static Builder builder(ClusterNodePoolNodeConfigTaint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String effect;
        private String key;
        private String value;
        public Builder() {}
        public Builder(ClusterNodePoolNodeConfigTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder effect(String effect) {
            if (effect == null) {
              throw new MissingRequiredPropertyException("ClusterNodePoolNodeConfigTaint", "effect");
            }
            this.effect = effect;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("ClusterNodePoolNodeConfigTaint", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("ClusterNodePoolNodeConfigTaint", "value");
            }
            this.value = value;
            return this;
        }
        public ClusterNodePoolNodeConfigTaint build() {
            final var _resultValue = new ClusterNodePoolNodeConfigTaint();
            _resultValue.effect = effect;
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
