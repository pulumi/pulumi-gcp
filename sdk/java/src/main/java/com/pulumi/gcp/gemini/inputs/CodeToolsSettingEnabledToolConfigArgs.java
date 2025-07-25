// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gemini.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class CodeToolsSettingEnabledToolConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CodeToolsSettingEnabledToolConfigArgs Empty = new CodeToolsSettingEnabledToolConfigArgs();

    /**
     * Key of the configuration item.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Key of the configuration item.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Value of the configuration item.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Value of the configuration item.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private CodeToolsSettingEnabledToolConfigArgs() {}

    private CodeToolsSettingEnabledToolConfigArgs(CodeToolsSettingEnabledToolConfigArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CodeToolsSettingEnabledToolConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CodeToolsSettingEnabledToolConfigArgs $;

        public Builder() {
            $ = new CodeToolsSettingEnabledToolConfigArgs();
        }

        public Builder(CodeToolsSettingEnabledToolConfigArgs defaults) {
            $ = new CodeToolsSettingEnabledToolConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Key of the configuration item.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Key of the configuration item.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Value of the configuration item.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the configuration item.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public CodeToolsSettingEnabledToolConfigArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("CodeToolsSettingEnabledToolConfigArgs", "key");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("CodeToolsSettingEnabledToolConfigArgs", "value");
            }
            return $;
        }
    }

}
