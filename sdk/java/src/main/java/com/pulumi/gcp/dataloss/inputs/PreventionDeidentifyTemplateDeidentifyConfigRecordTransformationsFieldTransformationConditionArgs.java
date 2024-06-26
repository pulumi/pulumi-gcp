// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs();

    /**
     * An expression, consisting of an operator and conditions.
     * Structure is documented below.
     * 
     */
    @Import(name="expressions")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsArgs> expressions;

    /**
     * @return An expression, consisting of an operator and conditions.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsArgs>> expressions() {
        return Optional.ofNullable(this.expressions);
    }

    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs() {}

    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs $) {
        this.expressions = $.expressions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs $;

        public Builder() {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs();
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs defaults) {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expressions An expression, consisting of an operator and conditions.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder expressions(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsArgs> expressions) {
            $.expressions = expressions;
            return this;
        }

        /**
         * @param expressions An expression, consisting of an operator and conditions.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder expressions(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsArgs expressions) {
            return expressions(Output.of(expressions));
        }

        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs build() {
            return $;
        }
    }

}
