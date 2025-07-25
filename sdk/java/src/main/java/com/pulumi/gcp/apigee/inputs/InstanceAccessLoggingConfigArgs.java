// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceAccessLoggingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceAccessLoggingConfigArgs Empty = new InstanceAccessLoggingConfigArgs();

    /**
     * Boolean flag that specifies whether the customer access log feature is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Boolean flag that specifies whether the customer access log feature is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Ship the access log entries that match the statusCode defined in the filter.
     * The statusCode is the only expected/supported filter field. (Ex: statusCode)
     * The filter will parse it to the Common Expression Language semantics for expression
     * evaluation to build the filter condition. (Ex: &#34;filter&#34;: statusCode &gt;= 200 &amp;&amp; statusCode &lt; 300 )
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return Ship the access log entries that match the statusCode defined in the filter.
     * The statusCode is the only expected/supported filter field. (Ex: statusCode)
     * The filter will parse it to the Common Expression Language semantics for expression
     * evaluation to build the filter condition. (Ex: &#34;filter&#34;: statusCode &gt;= 200 &amp;&amp; statusCode &lt; 300 )
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    private InstanceAccessLoggingConfigArgs() {}

    private InstanceAccessLoggingConfigArgs(InstanceAccessLoggingConfigArgs $) {
        this.enabled = $.enabled;
        this.filter = $.filter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceAccessLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceAccessLoggingConfigArgs $;

        public Builder() {
            $ = new InstanceAccessLoggingConfigArgs();
        }

        public Builder(InstanceAccessLoggingConfigArgs defaults) {
            $ = new InstanceAccessLoggingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Boolean flag that specifies whether the customer access log feature is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Boolean flag that specifies whether the customer access log feature is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param filter Ship the access log entries that match the statusCode defined in the filter.
         * The statusCode is the only expected/supported filter field. (Ex: statusCode)
         * The filter will parse it to the Common Expression Language semantics for expression
         * evaluation to build the filter condition. (Ex: &#34;filter&#34;: statusCode &gt;= 200 &amp;&amp; statusCode &lt; 300 )
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Ship the access log entries that match the statusCode defined in the filter.
         * The statusCode is the only expected/supported filter field. (Ex: statusCode)
         * The filter will parse it to the Common Expression Language semantics for expression
         * evaluation to build the filter condition. (Ex: &#34;filter&#34;: statusCode &gt;= 200 &amp;&amp; statusCode &lt; 300 )
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        public InstanceAccessLoggingConfigArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("InstanceAccessLoggingConfigArgs", "enabled");
            }
            return $;
        }
    }

}
