// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigContextArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs();

    /**
     * Points to the field that contains the context, for example, an entity id.
     * If set, must also set cryptoKey. If set, shift will be consistent for the given context.
     * Structure is documented below.
     * 
     */
    @Import(name="context")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigContextArgs> context;

    /**
     * @return Points to the field that contains the context, for example, an entity id.
     * If set, must also set cryptoKey. If set, shift will be consistent for the given context.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigContextArgs>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * Causes the shift to be computed based on this key and the context. This results in the same shift for the same context and cryptoKey. If set, must also set context. Can only be applied to table items.
     * Structure is documented below.
     * 
     */
    @Import(name="cryptoKey")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs> cryptoKey;

    /**
     * @return Causes the shift to be computed based on this key and the context. This results in the same shift for the same context and cryptoKey. If set, must also set context. Can only be applied to table items.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs>> cryptoKey() {
        return Optional.ofNullable(this.cryptoKey);
    }

    /**
     * For example, -5 means shift date to at most 5 days back in the past.
     * 
     */
    @Import(name="lowerBoundDays", required=true)
    private Output<Integer> lowerBoundDays;

    /**
     * @return For example, -5 means shift date to at most 5 days back in the past.
     * 
     */
    public Output<Integer> lowerBoundDays() {
        return this.lowerBoundDays;
    }

    /**
     * Range of shift in days. Actual shift will be selected at random within this range (inclusive ends). Negative means shift to earlier in time. Must not be more than 365250 days (1000 years) each direction.
     * For example, 3 means shift date to at most 3 days into the future.
     * 
     */
    @Import(name="upperBoundDays", required=true)
    private Output<Integer> upperBoundDays;

    /**
     * @return Range of shift in days. Actual shift will be selected at random within this range (inclusive ends). Negative means shift to earlier in time. Must not be more than 365250 days (1000 years) each direction.
     * For example, 3 means shift date to at most 3 days into the future.
     * 
     */
    public Output<Integer> upperBoundDays() {
        return this.upperBoundDays;
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs() {}

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs $) {
        this.context = $.context;
        this.cryptoKey = $.cryptoKey;
        this.lowerBoundDays = $.lowerBoundDays;
        this.upperBoundDays = $.upperBoundDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs $;

        public Builder() {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs();
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs defaults) {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param context Points to the field that contains the context, for example, an entity id.
         * If set, must also set cryptoKey. If set, shift will be consistent for the given context.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigContextArgs> context) {
            $.context = context;
            return this;
        }

        /**
         * @param context Points to the field that contains the context, for example, an entity id.
         * If set, must also set cryptoKey. If set, shift will be consistent for the given context.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder context(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigContextArgs context) {
            return context(Output.of(context));
        }

        /**
         * @param cryptoKey Causes the shift to be computed based on this key and the context. This results in the same shift for the same context and cryptoKey. If set, must also set context. Can only be applied to table items.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKey(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs> cryptoKey) {
            $.cryptoKey = cryptoKey;
            return this;
        }

        /**
         * @param cryptoKey Causes the shift to be computed based on this key and the context. This results in the same shift for the same context and cryptoKey. If set, must also set context. Can only be applied to table items.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKey(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs cryptoKey) {
            return cryptoKey(Output.of(cryptoKey));
        }

        /**
         * @param lowerBoundDays For example, -5 means shift date to at most 5 days back in the past.
         * 
         * @return builder
         * 
         */
        public Builder lowerBoundDays(Output<Integer> lowerBoundDays) {
            $.lowerBoundDays = lowerBoundDays;
            return this;
        }

        /**
         * @param lowerBoundDays For example, -5 means shift date to at most 5 days back in the past.
         * 
         * @return builder
         * 
         */
        public Builder lowerBoundDays(Integer lowerBoundDays) {
            return lowerBoundDays(Output.of(lowerBoundDays));
        }

        /**
         * @param upperBoundDays Range of shift in days. Actual shift will be selected at random within this range (inclusive ends). Negative means shift to earlier in time. Must not be more than 365250 days (1000 years) each direction.
         * For example, 3 means shift date to at most 3 days into the future.
         * 
         * @return builder
         * 
         */
        public Builder upperBoundDays(Output<Integer> upperBoundDays) {
            $.upperBoundDays = upperBoundDays;
            return this;
        }

        /**
         * @param upperBoundDays Range of shift in days. Actual shift will be selected at random within this range (inclusive ends). Negative means shift to earlier in time. Must not be more than 365250 days (1000 years) each direction.
         * For example, 3 means shift date to at most 3 days into the future.
         * 
         * @return builder
         * 
         */
        public Builder upperBoundDays(Integer upperBoundDays) {
            return upperBoundDays(Output.of(upperBoundDays));
        }

        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs build() {
            $.lowerBoundDays = Objects.requireNonNull($.lowerBoundDays, "expected parameter 'lowerBoundDays' to be non-null");
            $.upperBoundDays = Objects.requireNonNull($.upperBoundDays, "expected parameter 'upperBoundDays' to be non-null");
            return $;
        }
    }

}