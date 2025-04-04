// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class BackendServiceCustomMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceCustomMetricArgs Empty = new BackendServiceCustomMetricArgs();

    /**
     * If true, the metric data is not used for load balancing.
     * 
     */
    @Import(name="dryRun", required=true)
    private Output<Boolean> dryRun;

    /**
     * @return If true, the metric data is not used for load balancing.
     * 
     */
    public Output<Boolean> dryRun() {
        return this.dryRun;
    }

    /**
     * Name of a custom utilization signal. The name must be 1-64 characters
     * long and match the regular expression a-z? which
     * means the first character must be a lowercase letter, and all following
     * characters must be a dash, period, underscore, lowercase letter, or
     * digit, except the last character, which cannot be a dash, period, or
     * underscore. For usage guidelines, see Custom Metrics balancing mode. This
     * field can only be used for a global or regional backend service with the
     * loadBalancingScheme set to &lt;code&gt;EXTERNAL_MANAGED&lt;/code&gt;,
     * &lt;code&gt;INTERNAL_MANAGED&lt;/code&gt; &lt;code&gt;INTERNAL_SELF_MANAGED&lt;/code&gt;.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of a custom utilization signal. The name must be 1-64 characters
     * long and match the regular expression a-z? which
     * means the first character must be a lowercase letter, and all following
     * characters must be a dash, period, underscore, lowercase letter, or
     * digit, except the last character, which cannot be a dash, period, or
     * underscore. For usage guidelines, see Custom Metrics balancing mode. This
     * field can only be used for a global or regional backend service with the
     * loadBalancingScheme set to &lt;code&gt;EXTERNAL_MANAGED&lt;/code&gt;,
     * &lt;code&gt;INTERNAL_MANAGED&lt;/code&gt; &lt;code&gt;INTERNAL_SELF_MANAGED&lt;/code&gt;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private BackendServiceCustomMetricArgs() {}

    private BackendServiceCustomMetricArgs(BackendServiceCustomMetricArgs $) {
        this.dryRun = $.dryRun;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceCustomMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceCustomMetricArgs $;

        public Builder() {
            $ = new BackendServiceCustomMetricArgs();
        }

        public Builder(BackendServiceCustomMetricArgs defaults) {
            $ = new BackendServiceCustomMetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dryRun If true, the metric data is not used for load balancing.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun If true, the metric data is not used for load balancing.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param name Name of a custom utilization signal. The name must be 1-64 characters
         * long and match the regular expression a-z? which
         * means the first character must be a lowercase letter, and all following
         * characters must be a dash, period, underscore, lowercase letter, or
         * digit, except the last character, which cannot be a dash, period, or
         * underscore. For usage guidelines, see Custom Metrics balancing mode. This
         * field can only be used for a global or regional backend service with the
         * loadBalancingScheme set to &lt;code&gt;EXTERNAL_MANAGED&lt;/code&gt;,
         * &lt;code&gt;INTERNAL_MANAGED&lt;/code&gt; &lt;code&gt;INTERNAL_SELF_MANAGED&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of a custom utilization signal. The name must be 1-64 characters
         * long and match the regular expression a-z? which
         * means the first character must be a lowercase letter, and all following
         * characters must be a dash, period, underscore, lowercase letter, or
         * digit, except the last character, which cannot be a dash, period, or
         * underscore. For usage guidelines, see Custom Metrics balancing mode. This
         * field can only be used for a global or regional backend service with the
         * loadBalancingScheme set to &lt;code&gt;EXTERNAL_MANAGED&lt;/code&gt;,
         * &lt;code&gt;INTERNAL_MANAGED&lt;/code&gt; &lt;code&gt;INTERNAL_SELF_MANAGED&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public BackendServiceCustomMetricArgs build() {
            if ($.dryRun == null) {
                throw new MissingRequiredPropertyException("BackendServiceCustomMetricArgs", "dryRun");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("BackendServiceCustomMetricArgs", "name");
            }
            return $;
        }
    }

}
