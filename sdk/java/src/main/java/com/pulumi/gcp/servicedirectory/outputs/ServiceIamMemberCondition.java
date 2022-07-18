// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.servicedirectory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceIamMemberCondition {
    private final @Nullable String description;
    private final String expression;
    private final String title;

    @CustomType.Constructor
    private ServiceIamMemberCondition(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("expression") String expression,
        @CustomType.Parameter("title") String title) {
        this.description = description;
        this.expression = expression;
        this.title = title;
    }

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public String expression() {
        return this.expression;
    }
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIamMemberCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String expression;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceIamMemberCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.title = defaults.title;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public ServiceIamMemberCondition build() {
            return new ServiceIamMemberCondition(description, expression, title);
        }
    }
}