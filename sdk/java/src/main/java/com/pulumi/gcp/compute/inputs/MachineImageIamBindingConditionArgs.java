// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MachineImageIamBindingConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final MachineImageIamBindingConditionArgs Empty = new MachineImageIamBindingConditionArgs();

    /**
     * An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    /**
     * A title for the expression, i.e. a short string describing its purpose.
     * 
     */
    @Import(name="title", required=true)
    private Output<String> title;

    /**
     * @return A title for the expression, i.e. a short string describing its purpose.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    private MachineImageIamBindingConditionArgs() {}

    private MachineImageIamBindingConditionArgs(MachineImageIamBindingConditionArgs $) {
        this.description = $.description;
        this.expression = $.expression;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MachineImageIamBindingConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MachineImageIamBindingConditionArgs $;

        public Builder() {
            $ = new MachineImageIamBindingConditionArgs();
        }

        public Builder(MachineImageIamBindingConditionArgs defaults) {
            $ = new MachineImageIamBindingConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expression Textual representation of an expression in Common Expression Language syntax.
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression Textual representation of an expression in Common Expression Language syntax.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param title A title for the expression, i.e. a short string describing its purpose.
         * 
         * @return builder
         * 
         */
        public Builder title(Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title A title for the expression, i.e. a short string describing its purpose.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public MachineImageIamBindingConditionArgs build() {
            if ($.expression == null) {
                throw new MissingRequiredPropertyException("MachineImageIamBindingConditionArgs", "expression");
            }
            if ($.title == null) {
                throw new MissingRequiredPropertyException("MachineImageIamBindingConditionArgs", "title");
            }
            return $;
        }
    }

}
