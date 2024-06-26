// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiIamBindingCondition {
    private @Nullable String description;
    private String expression;
    private String title;

    private ApiIamBindingCondition() {}
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

    public static Builder builder(ApiIamBindingCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private String expression;
        private String title;
        public Builder() {}
        public Builder(ApiIamBindingCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder expression(String expression) {
            if (expression == null) {
              throw new MissingRequiredPropertyException("ApiIamBindingCondition", "expression");
            }
            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            if (title == null) {
              throw new MissingRequiredPropertyException("ApiIamBindingCondition", "title");
            }
            this.title = title;
            return this;
        }
        public ApiIamBindingCondition build() {
            final var _resultValue = new ApiIamBindingCondition();
            _resultValue.description = description;
            _resultValue.expression = expression;
            _resultValue.title = title;
            return _resultValue;
        }
    }
}
