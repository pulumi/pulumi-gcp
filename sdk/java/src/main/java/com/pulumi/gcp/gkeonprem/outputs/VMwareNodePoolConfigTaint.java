// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VMwareNodePoolConfigTaint {
    /**
     * @return Available taint effects.
     * Possible values are: `EFFECT_UNSPECIFIED`, `NO_SCHEDULE`, `PREFER_NO_SCHEDULE`, `NO_EXECUTE`.
     * 
     * &lt;a name=&#34;nested_vsphere_config&#34;&gt;&lt;/a&gt;The `vsphere_config` block contains:
     * 
     */
    private @Nullable String effect;
    /**
     * @return Key associated with the effect.
     * 
     */
    private String key;
    /**
     * @return Value associated with the effect.
     * 
     */
    private String value;

    private VMwareNodePoolConfigTaint() {}
    /**
     * @return Available taint effects.
     * Possible values are: `EFFECT_UNSPECIFIED`, `NO_SCHEDULE`, `PREFER_NO_SCHEDULE`, `NO_EXECUTE`.
     * 
     * &lt;a name=&#34;nested_vsphere_config&#34;&gt;&lt;/a&gt;The `vsphere_config` block contains:
     * 
     */
    public Optional<String> effect() {
        return Optional.ofNullable(this.effect);
    }
    /**
     * @return Key associated with the effect.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Value associated with the effect.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareNodePoolConfigTaint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String effect;
        private String key;
        private String value;
        public Builder() {}
        public Builder(VMwareNodePoolConfigTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder effect(@Nullable String effect) {
            this.effect = effect;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public VMwareNodePoolConfigTaint build() {
            final var o = new VMwareNodePoolConfigTaint();
            o.effect = effect;
            o.key = key;
            o.value = value;
            return o;
        }
    }
}