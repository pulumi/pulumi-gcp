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
public final class MachineImageIamBindingCondition {
    /**
     * @return An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    private @Nullable String description;
    /**
     * @return Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    private String expression;
    /**
     * @return A title for the expression, i.e. a short string describing its purpose.
     * 
     */
    private String title;

    private MachineImageIamBindingCondition() {}
    /**
     * @return An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    public String expression() {
        return this.expression;
    }
    /**
     * @return A title for the expression, i.e. a short string describing its purpose.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineImageIamBindingCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private String expression;
        private String title;
        public Builder() {}
        public Builder(MachineImageIamBindingCondition defaults) {
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
              throw new MissingRequiredPropertyException("MachineImageIamBindingCondition", "expression");
            }
            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            if (title == null) {
              throw new MissingRequiredPropertyException("MachineImageIamBindingCondition", "title");
            }
            this.title = title;
            return this;
        }
        public MachineImageIamBindingCondition build() {
            final var _resultValue = new MachineImageIamBindingCondition();
            _resultValue.description = description;
            _resultValue.expression = expression;
            _resultValue.title = title;
            return _resultValue;
        }
    }
}
