// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VMwareNodePoolConfigTaintArgs extends com.pulumi.resources.ResourceArgs {

    public static final VMwareNodePoolConfigTaintArgs Empty = new VMwareNodePoolConfigTaintArgs();

    /**
     * Available taint effects.
     * Possible values are: `EFFECT_UNSPECIFIED`, `NO_SCHEDULE`, `PREFER_NO_SCHEDULE`, `NO_EXECUTE`.
     * 
     * &lt;a name=&#34;nested_vsphere_config&#34;&gt;&lt;/a&gt;The `vsphere_config` block contains:
     * 
     */
    @Import(name="effect")
    private @Nullable Output<String> effect;

    /**
     * @return Available taint effects.
     * Possible values are: `EFFECT_UNSPECIFIED`, `NO_SCHEDULE`, `PREFER_NO_SCHEDULE`, `NO_EXECUTE`.
     * 
     * &lt;a name=&#34;nested_vsphere_config&#34;&gt;&lt;/a&gt;The `vsphere_config` block contains:
     * 
     */
    public Optional<Output<String>> effect() {
        return Optional.ofNullable(this.effect);
    }

    /**
     * Key associated with the effect.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Key associated with the effect.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Value associated with the effect.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Value associated with the effect.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private VMwareNodePoolConfigTaintArgs() {}

    private VMwareNodePoolConfigTaintArgs(VMwareNodePoolConfigTaintArgs $) {
        this.effect = $.effect;
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VMwareNodePoolConfigTaintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMwareNodePoolConfigTaintArgs $;

        public Builder() {
            $ = new VMwareNodePoolConfigTaintArgs();
        }

        public Builder(VMwareNodePoolConfigTaintArgs defaults) {
            $ = new VMwareNodePoolConfigTaintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param effect Available taint effects.
         * Possible values are: `EFFECT_UNSPECIFIED`, `NO_SCHEDULE`, `PREFER_NO_SCHEDULE`, `NO_EXECUTE`.
         * 
         * &lt;a name=&#34;nested_vsphere_config&#34;&gt;&lt;/a&gt;The `vsphere_config` block contains:
         * 
         * @return builder
         * 
         */
        public Builder effect(@Nullable Output<String> effect) {
            $.effect = effect;
            return this;
        }

        /**
         * @param effect Available taint effects.
         * Possible values are: `EFFECT_UNSPECIFIED`, `NO_SCHEDULE`, `PREFER_NO_SCHEDULE`, `NO_EXECUTE`.
         * 
         * &lt;a name=&#34;nested_vsphere_config&#34;&gt;&lt;/a&gt;The `vsphere_config` block contains:
         * 
         * @return builder
         * 
         */
        public Builder effect(String effect) {
            return effect(Output.of(effect));
        }

        /**
         * @param key Key associated with the effect.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Key associated with the effect.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Value associated with the effect.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value associated with the effect.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public VMwareNodePoolConfigTaintArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}