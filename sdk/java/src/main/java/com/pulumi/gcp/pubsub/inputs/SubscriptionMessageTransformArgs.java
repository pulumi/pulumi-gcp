// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformJavascriptUdfArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionMessageTransformArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionMessageTransformArgs Empty = new SubscriptionMessageTransformArgs();

    /**
     * Controls whether or not to use this transform. If not set or `false`,
     * the transform will be applied to messages. Default: `true`.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Controls whether or not to use this transform. If not set or `false`,
     * the transform will be applied to messages. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * Javascript User Defined Function. If multiple Javascript UDFs are specified on a resource,
     * each one must have a unique `function_name`.
     * Structure is documented below.
     * 
     */
    @Import(name="javascriptUdf")
    private @Nullable Output<SubscriptionMessageTransformJavascriptUdfArgs> javascriptUdf;

    /**
     * @return Javascript User Defined Function. If multiple Javascript UDFs are specified on a resource,
     * each one must have a unique `function_name`.
     * Structure is documented below.
     * 
     */
    public Optional<Output<SubscriptionMessageTransformJavascriptUdfArgs>> javascriptUdf() {
        return Optional.ofNullable(this.javascriptUdf);
    }

    private SubscriptionMessageTransformArgs() {}

    private SubscriptionMessageTransformArgs(SubscriptionMessageTransformArgs $) {
        this.disabled = $.disabled;
        this.javascriptUdf = $.javascriptUdf;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionMessageTransformArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionMessageTransformArgs $;

        public Builder() {
            $ = new SubscriptionMessageTransformArgs();
        }

        public Builder(SubscriptionMessageTransformArgs defaults) {
            $ = new SubscriptionMessageTransformArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disabled Controls whether or not to use this transform. If not set or `false`,
         * the transform will be applied to messages. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Controls whether or not to use this transform. If not set or `false`,
         * the transform will be applied to messages. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param javascriptUdf Javascript User Defined Function. If multiple Javascript UDFs are specified on a resource,
         * each one must have a unique `function_name`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder javascriptUdf(@Nullable Output<SubscriptionMessageTransformJavascriptUdfArgs> javascriptUdf) {
            $.javascriptUdf = javascriptUdf;
            return this;
        }

        /**
         * @param javascriptUdf Javascript User Defined Function. If multiple Javascript UDFs are specified on a resource,
         * each one must have a unique `function_name`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder javascriptUdf(SubscriptionMessageTransformJavascriptUdfArgs javascriptUdf) {
            return javascriptUdf(Output.of(javascriptUdf));
        }

        public SubscriptionMessageTransformArgs build() {
            return $;
        }
    }

}
