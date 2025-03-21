// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FolderSinkExclusionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FolderSinkExclusionArgs Empty = new FolderSinkExclusionArgs();

    /**
     * A description of this exclusion.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of this exclusion.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * If set to True, then this exclusion is disabled and it does not exclude any log entries.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return If set to True, then this exclusion is disabled and it does not exclude any log entries.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    @Import(name="filter", required=true)
    private Output<String> filter;

    /**
     * @return An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    public Output<String> filter() {
        return this.filter;
    }

    /**
     * A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private FolderSinkExclusionArgs() {}

    private FolderSinkExclusionArgs(FolderSinkExclusionArgs $) {
        this.description = $.description;
        this.disabled = $.disabled;
        this.filter = $.filter;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FolderSinkExclusionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FolderSinkExclusionArgs $;

        public Builder() {
            $ = new FolderSinkExclusionArgs();
        }

        public Builder(FolderSinkExclusionArgs defaults) {
            $ = new FolderSinkExclusionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of this exclusion.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of this exclusion.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disabled If set to True, then this exclusion is disabled and it does not exclude any log entries.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled If set to True, then this exclusion is disabled and it does not exclude any log entries.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param filter An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
         * write a filter.
         * 
         * @return builder
         * 
         */
        public Builder filter(Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
         * write a filter.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param name A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public FolderSinkExclusionArgs build() {
            if ($.filter == null) {
                throw new MissingRequiredPropertyException("FolderSinkExclusionArgs", "filter");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("FolderSinkExclusionArgs", "name");
            }
            return $;
        }
    }

}
