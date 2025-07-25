// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogicalViewArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogicalViewArgs Empty = new LogicalViewArgs();

    /**
     * Set to true to make the logical view protected against deletion.
     * 
     */
    @Import(name="deletionProtection")
    private @Nullable Output<Boolean> deletionProtection;

    /**
     * @return Set to true to make the logical view protected against deletion.
     * 
     */
    public Optional<Output<Boolean>> deletionProtection() {
        return Optional.ofNullable(this.deletionProtection);
    }

    /**
     * The name of the instance to create the logical view within.
     * 
     */
    @Import(name="instance")
    private @Nullable Output<String> instance;

    /**
     * @return The name of the instance to create the logical view within.
     * 
     */
    public Optional<Output<String>> instance() {
        return Optional.ofNullable(this.instance);
    }

    /**
     * The unique name of the logical view in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
     * 
     */
    @Import(name="logicalViewId", required=true)
    private Output<String> logicalViewId;

    /**
     * @return The unique name of the logical view in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
     * 
     */
    public Output<String> logicalViewId() {
        return this.logicalViewId;
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
     * The logical view&#39;s select query.
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    /**
     * @return The logical view&#39;s select query.
     * 
     */
    public Output<String> query() {
        return this.query;
    }

    private LogicalViewArgs() {}

    private LogicalViewArgs(LogicalViewArgs $) {
        this.deletionProtection = $.deletionProtection;
        this.instance = $.instance;
        this.logicalViewId = $.logicalViewId;
        this.project = $.project;
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogicalViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogicalViewArgs $;

        public Builder() {
            $ = new LogicalViewArgs();
        }

        public Builder(LogicalViewArgs defaults) {
            $ = new LogicalViewArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deletionProtection Set to true to make the logical view protected against deletion.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            $.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * @param deletionProtection Set to true to make the logical view protected against deletion.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            return deletionProtection(Output.of(deletionProtection));
        }

        /**
         * @param instance The name of the instance to create the logical view within.
         * 
         * @return builder
         * 
         */
        public Builder instance(@Nullable Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance The name of the instance to create the logical view within.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        /**
         * @param logicalViewId The unique name of the logical view in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
         * 
         * @return builder
         * 
         */
        public Builder logicalViewId(Output<String> logicalViewId) {
            $.logicalViewId = logicalViewId;
            return this;
        }

        /**
         * @param logicalViewId The unique name of the logical view in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
         * 
         * @return builder
         * 
         */
        public Builder logicalViewId(String logicalViewId) {
            return logicalViewId(Output.of(logicalViewId));
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
         * @param query The logical view&#39;s select query.
         * 
         * @return builder
         * 
         */
        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query The logical view&#39;s select query.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        public LogicalViewArgs build() {
            if ($.logicalViewId == null) {
                throw new MissingRequiredPropertyException("LogicalViewArgs", "logicalViewId");
            }
            if ($.query == null) {
                throw new MissingRequiredPropertyException("LogicalViewArgs", "query");
            }
            return $;
        }
    }

}
