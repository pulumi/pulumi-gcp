// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.serviceAccount.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IAMBindingCondition {
    /**
     * @return An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     * &gt; **Warning:** This provider considers the `role` and condition contents (`title`+`description`+`expression`) as the
     * identifier for the binding. This means that if any part of the condition is changed out-of-band, the provider will
     * consider it to be an entirely different resource and will treat it as such.
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

    private IAMBindingCondition() {}
    /**
     * @return An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     * &gt; **Warning:** This provider considers the `role` and condition contents (`title`+`description`+`expression`) as the
     * identifier for the binding. This means that if any part of the condition is changed out-of-band, the provider will
     * consider it to be an entirely different resource and will treat it as such.
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

    public static Builder builder(IAMBindingCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private String expression;
        private String title;
        public Builder() {}
        public Builder(IAMBindingCondition defaults) {
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
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public IAMBindingCondition build() {
            final var o = new IAMBindingCondition();
            o.description = description;
            o.expression = expression;
            o.title = title;
            return o;
        }
    }
}