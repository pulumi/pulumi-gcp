// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RouterRoutePolicyTermAction {
    /**
     * @return Description of the expression
     * 
     */
    private @Nullable String description;
    /**
     * @return Textual representation of an expression in Common Expression
     * Language syntax.
     * 
     */
    private String expression;
    /**
     * @return String indicating the location of the expression for error
     * reporting, e.g. a file name and a position in the file
     * 
     */
    private @Nullable String location;
    /**
     * @return Title for the expression, i.e. a short string describing its
     * purpose.
     * 
     */
    private @Nullable String title;

    private RouterRoutePolicyTermAction() {}
    /**
     * @return Description of the expression
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Textual representation of an expression in Common Expression
     * Language syntax.
     * 
     */
    public String expression() {
        return this.expression;
    }
    /**
     * @return String indicating the location of the expression for error
     * reporting, e.g. a file name and a position in the file
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Title for the expression, i.e. a short string describing its
     * purpose.
     * 
     */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterRoutePolicyTermAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private String expression;
        private @Nullable String location;
        private @Nullable String title;
        public Builder() {}
        public Builder(RouterRoutePolicyTermAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.location = defaults.location;
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
              throw new MissingRequiredPropertyException("RouterRoutePolicyTermAction", "expression");
            }
            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable String location) {

            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {

            this.title = title;
            return this;
        }
        public RouterRoutePolicyTermAction build() {
            final var _resultValue = new RouterRoutePolicyTermAction();
            _resultValue.description = description;
            _resultValue.expression = expression;
            _resultValue.location = location;
            _resultValue.title = title;
            return _resultValue;
        }
    }
}
