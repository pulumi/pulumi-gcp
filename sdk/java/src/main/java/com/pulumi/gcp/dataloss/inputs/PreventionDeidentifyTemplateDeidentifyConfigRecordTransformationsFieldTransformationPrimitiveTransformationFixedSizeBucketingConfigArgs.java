// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs;
import java.lang.Double;
import java.util.Objects;


public final class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs();

    /**
     * Size of each bucket (except for minimum and maximum buckets).
     * So if lower_bound = 10, upper_bound = 89, and bucketSize = 10, then the following buckets would be used: -10, 10-20, 20-30, 30-40, 40-50, 50-60, 60-70, 70-80, 80-89, 89+.
     * Precision up to 2 decimals works.
     * 
     */
    @Import(name="bucketSize", required=true)
    private Output<Double> bucketSize;

    /**
     * @return Size of each bucket (except for minimum and maximum buckets).
     * So if lower_bound = 10, upper_bound = 89, and bucketSize = 10, then the following buckets would be used: -10, 10-20, 20-30, 30-40, 40-50, 50-60, 60-70, 70-80, 80-89, 89+.
     * Precision up to 2 decimals works.
     * 
     */
    public Output<Double> bucketSize() {
        return this.bucketSize;
    }

    /**
     * Lower bound value of buckets.
     * All values less than lower_bound are grouped together into a single bucket; for example if lower_bound = 10, then all values less than 10 are replaced with the value &#34;-10&#34;.
     * The `lower_bound` block must only contain one argument. See the `fixed_size_bucketing_config` block description for more information about choosing a data type.
     * Structure is documented below.
     * 
     */
    @Import(name="lowerBound", required=true)
    private Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundArgs> lowerBound;

    /**
     * @return Lower bound value of buckets.
     * All values less than lower_bound are grouped together into a single bucket; for example if lower_bound = 10, then all values less than 10 are replaced with the value &#34;-10&#34;.
     * The `lower_bound` block must only contain one argument. See the `fixed_size_bucketing_config` block description for more information about choosing a data type.
     * Structure is documented below.
     * 
     */
    public Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundArgs> lowerBound() {
        return this.lowerBound;
    }

    /**
     * Upper bound value of buckets.
     * All values greater than upper_bound are grouped together into a single bucket; for example if upper_bound = 89, then all values greater than 89 are replaced with the value &#34;89+&#34;.
     * The `upper_bound` block must only contain one argument. See the `fixed_size_bucketing_config` block description for more information about choosing a data type.
     * Structure is documented below.
     * 
     */
    @Import(name="upperBound", required=true)
    private Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs> upperBound;

    /**
     * @return Upper bound value of buckets.
     * All values greater than upper_bound are grouped together into a single bucket; for example if upper_bound = 89, then all values greater than 89 are replaced with the value &#34;89+&#34;.
     * The `upper_bound` block must only contain one argument. See the `fixed_size_bucketing_config` block description for more information about choosing a data type.
     * Structure is documented below.
     * 
     */
    public Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs> upperBound() {
        return this.upperBound;
    }

    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs() {}

    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs $) {
        this.bucketSize = $.bucketSize;
        this.lowerBound = $.lowerBound;
        this.upperBound = $.upperBound;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs $;

        public Builder() {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs();
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs defaults) {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketSize Size of each bucket (except for minimum and maximum buckets).
         * So if lower_bound = 10, upper_bound = 89, and bucketSize = 10, then the following buckets would be used: -10, 10-20, 20-30, 30-40, 40-50, 50-60, 60-70, 70-80, 80-89, 89+.
         * Precision up to 2 decimals works.
         * 
         * @return builder
         * 
         */
        public Builder bucketSize(Output<Double> bucketSize) {
            $.bucketSize = bucketSize;
            return this;
        }

        /**
         * @param bucketSize Size of each bucket (except for minimum and maximum buckets).
         * So if lower_bound = 10, upper_bound = 89, and bucketSize = 10, then the following buckets would be used: -10, 10-20, 20-30, 30-40, 40-50, 50-60, 60-70, 70-80, 80-89, 89+.
         * Precision up to 2 decimals works.
         * 
         * @return builder
         * 
         */
        public Builder bucketSize(Double bucketSize) {
            return bucketSize(Output.of(bucketSize));
        }

        /**
         * @param lowerBound Lower bound value of buckets.
         * All values less than lower_bound are grouped together into a single bucket; for example if lower_bound = 10, then all values less than 10 are replaced with the value &#34;-10&#34;.
         * The `lower_bound` block must only contain one argument. See the `fixed_size_bucketing_config` block description for more information about choosing a data type.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder lowerBound(Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundArgs> lowerBound) {
            $.lowerBound = lowerBound;
            return this;
        }

        /**
         * @param lowerBound Lower bound value of buckets.
         * All values less than lower_bound are grouped together into a single bucket; for example if lower_bound = 10, then all values less than 10 are replaced with the value &#34;-10&#34;.
         * The `lower_bound` block must only contain one argument. See the `fixed_size_bucketing_config` block description for more information about choosing a data type.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder lowerBound(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundArgs lowerBound) {
            return lowerBound(Output.of(lowerBound));
        }

        /**
         * @param upperBound Upper bound value of buckets.
         * All values greater than upper_bound are grouped together into a single bucket; for example if upper_bound = 89, then all values greater than 89 are replaced with the value &#34;89+&#34;.
         * The `upper_bound` block must only contain one argument. See the `fixed_size_bucketing_config` block description for more information about choosing a data type.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder upperBound(Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs> upperBound) {
            $.upperBound = upperBound;
            return this;
        }

        /**
         * @param upperBound Upper bound value of buckets.
         * All values greater than upper_bound are grouped together into a single bucket; for example if upper_bound = 89, then all values greater than 89 are replaced with the value &#34;89+&#34;.
         * The `upper_bound` block must only contain one argument. See the `fixed_size_bucketing_config` block description for more information about choosing a data type.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder upperBound(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs upperBound) {
            return upperBound(Output.of(upperBound));
        }

        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs build() {
            $.bucketSize = Objects.requireNonNull($.bucketSize, "expected parameter 'bucketSize' to be non-null");
            $.lowerBound = Objects.requireNonNull($.lowerBound, "expected parameter 'lowerBound' to be non-null");
            $.upperBound = Objects.requireNonNull($.upperBound, "expected parameter 'upperBound' to be non-null");
            return $;
        }
    }

}