// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.serviceusage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConsumerQuotaOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConsumerQuotaOverrideArgs Empty = new ConsumerQuotaOverrideArgs();

    /**
     * If this map is nonempty, then this override applies only to specific values for dimensions defined in the limit unit.
     * 
     */
    @Import(name="dimensions")
    private @Nullable Output<Map<String,String>> dimensions;

    /**
     * @return If this map is nonempty, then this override applies only to specific values for dimensions defined in the limit unit.
     * 
     */
    public Optional<Output<Map<String,String>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * If the new quota would decrease the existing quota by more than 10%, the request is rejected.
     * If `force` is `true`, that safety check is ignored.
     * 
     */
    @Import(name="force")
    private @Nullable Output<Boolean> force;

    /**
     * @return If the new quota would decrease the existing quota by more than 10%, the request is rejected.
     * If `force` is `true`, that safety check is ignored.
     * 
     */
    public Optional<Output<Boolean>> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * The limit on the metric, e.g. `/project/region`.
     * 
     */
    @Import(name="limit", required=true)
    private Output<String> limit;

    /**
     * @return The limit on the metric, e.g. `/project/region`.
     * 
     */
    public Output<String> limit() {
        return this.limit;
    }

    /**
     * The metric that should be limited, e.g. `compute.googleapis.com/cpus`.
     * 
     */
    @Import(name="metric", required=true)
    private Output<String> metric;

    /**
     * @return The metric that should be limited, e.g. `compute.googleapis.com/cpus`.
     * 
     */
    public Output<String> metric() {
        return this.metric;
    }

    /**
     * The overriding quota limit value. Can be any nonnegative integer, or -1 (unlimited quota).
     * 
     */
    @Import(name="overrideValue", required=true)
    private Output<String> overrideValue;

    /**
     * @return The overriding quota limit value. Can be any nonnegative integer, or -1 (unlimited quota).
     * 
     */
    public Output<String> overrideValue() {
        return this.overrideValue;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The service that the metrics belong to, e.g. `compute.googleapis.com`.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return The service that the metrics belong to, e.g. `compute.googleapis.com`.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    private ConsumerQuotaOverrideArgs() {}

    private ConsumerQuotaOverrideArgs(ConsumerQuotaOverrideArgs $) {
        this.dimensions = $.dimensions;
        this.force = $.force;
        this.limit = $.limit;
        this.metric = $.metric;
        this.overrideValue = $.overrideValue;
        this.project = $.project;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConsumerQuotaOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConsumerQuotaOverrideArgs $;

        public Builder() {
            $ = new ConsumerQuotaOverrideArgs();
        }

        public Builder(ConsumerQuotaOverrideArgs defaults) {
            $ = new ConsumerQuotaOverrideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dimensions If this map is nonempty, then this override applies only to specific values for dimensions defined in the limit unit.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(@Nullable Output<Map<String,String>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        /**
         * @param dimensions If this map is nonempty, then this override applies only to specific values for dimensions defined in the limit unit.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(Map<String,String> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        /**
         * @param force If the new quota would decrease the existing quota by more than 10%, the request is rejected.
         * If `force` is `true`, that safety check is ignored.
         * 
         * @return builder
         * 
         */
        public Builder force(@Nullable Output<Boolean> force) {
            $.force = force;
            return this;
        }

        /**
         * @param force If the new quota would decrease the existing quota by more than 10%, the request is rejected.
         * If `force` is `true`, that safety check is ignored.
         * 
         * @return builder
         * 
         */
        public Builder force(Boolean force) {
            return force(Output.of(force));
        }

        /**
         * @param limit The limit on the metric, e.g. `/project/region`.
         * 
         * @return builder
         * 
         */
        public Builder limit(Output<String> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit The limit on the metric, e.g. `/project/region`.
         * 
         * @return builder
         * 
         */
        public Builder limit(String limit) {
            return limit(Output.of(limit));
        }

        /**
         * @param metric The metric that should be limited, e.g. `compute.googleapis.com/cpus`.
         * 
         * @return builder
         * 
         */
        public Builder metric(Output<String> metric) {
            $.metric = metric;
            return this;
        }

        /**
         * @param metric The metric that should be limited, e.g. `compute.googleapis.com/cpus`.
         * 
         * @return builder
         * 
         */
        public Builder metric(String metric) {
            return metric(Output.of(metric));
        }

        /**
         * @param overrideValue The overriding quota limit value. Can be any nonnegative integer, or -1 (unlimited quota).
         * 
         * @return builder
         * 
         */
        public Builder overrideValue(Output<String> overrideValue) {
            $.overrideValue = overrideValue;
            return this;
        }

        /**
         * @param overrideValue The overriding quota limit value. Can be any nonnegative integer, or -1 (unlimited quota).
         * 
         * @return builder
         * 
         */
        public Builder overrideValue(String overrideValue) {
            return overrideValue(Output.of(overrideValue));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param service The service that the metrics belong to, e.g. `compute.googleapis.com`.
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The service that the metrics belong to, e.g. `compute.googleapis.com`.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public ConsumerQuotaOverrideArgs build() {
            $.limit = Objects.requireNonNull($.limit, "expected parameter 'limit' to be non-null");
            $.metric = Objects.requireNonNull($.metric, "expected parameter 'metric' to be non-null");
            $.overrideValue = Objects.requireNonNull($.overrideValue, "expected parameter 'overrideValue' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}