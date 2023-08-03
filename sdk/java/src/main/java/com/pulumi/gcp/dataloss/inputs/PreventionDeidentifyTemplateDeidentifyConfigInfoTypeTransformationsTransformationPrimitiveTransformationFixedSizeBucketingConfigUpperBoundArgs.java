// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs();

    /**
     * A float value.
     * 
     */
    @Import(name="floatValue")
    private @Nullable Output<Double> floatValue;

    /**
     * @return A float value.
     * 
     */
    public Optional<Output<Double>> floatValue() {
        return Optional.ofNullable(this.floatValue);
    }

    /**
     * An integer value (int64 format)
     * 
     */
    @Import(name="integerValue")
    private @Nullable Output<String> integerValue;

    /**
     * @return An integer value (int64 format)
     * 
     */
    public Optional<Output<String>> integerValue() {
        return Optional.ofNullable(this.integerValue);
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs() {}

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs $) {
        this.floatValue = $.floatValue;
        this.integerValue = $.integerValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs $;

        public Builder() {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs();
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs defaults) {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param floatValue A float value.
         * 
         * @return builder
         * 
         */
        public Builder floatValue(@Nullable Output<Double> floatValue) {
            $.floatValue = floatValue;
            return this;
        }

        /**
         * @param floatValue A float value.
         * 
         * @return builder
         * 
         */
        public Builder floatValue(Double floatValue) {
            return floatValue(Output.of(floatValue));
        }

        /**
         * @param integerValue An integer value (int64 format)
         * 
         * @return builder
         * 
         */
        public Builder integerValue(@Nullable Output<String> integerValue) {
            $.integerValue = integerValue;
            return this;
        }

        /**
         * @param integerValue An integer value (int64 format)
         * 
         * @return builder
         * 
         */
        public Builder integerValue(String integerValue) {
            return integerValue(Output.of(integerValue));
        }

        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs build() {
            return $;
        }
    }

}