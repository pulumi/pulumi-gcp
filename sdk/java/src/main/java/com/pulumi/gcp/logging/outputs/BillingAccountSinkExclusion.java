// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BillingAccountSinkExclusion {
    /**
     * @return A description of this exclusion.
     * 
     */
    private final @Nullable String description;
    /**
     * @return If set to True, then this exclusion is disabled and it does not exclude any log entries.
     * 
     */
    private final @Nullable Boolean disabled;
    /**
     * @return An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    private final String filter;
    /**
     * @return A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private BillingAccountSinkExclusion(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("disabled") @Nullable Boolean disabled,
        @CustomType.Parameter("filter") String filter,
        @CustomType.Parameter("name") String name) {
        this.description = description;
        this.disabled = disabled;
        this.filter = filter;
        this.name = name;
    }

    /**
     * @return A description of this exclusion.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return If set to True, then this exclusion is disabled and it does not exclude any log entries.
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    public String filter() {
        return this.filter;
    }
    /**
     * @return A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingAccountSinkExclusion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Boolean disabled;
        private String filter;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingAccountSinkExclusion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public BillingAccountSinkExclusion build() {
            return new BillingAccountSinkExclusion(description, disabled, filter, name);
        }
    }
}