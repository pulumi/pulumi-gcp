// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs Empty = new OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs();

    /**
     * Name of the property for the custom output.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the property for the custom output.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The CEL expression for the custom output. A resource property can be specified
     * to return the value of the property or a text string enclosed in quotation marks.
     * Structure is documented below.
     * 
     */
    @Import(name="valueExpression")
    private @Nullable Output<OrganizationCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs> valueExpression;

    /**
     * @return The CEL expression for the custom output. A resource property can be specified
     * to return the value of the property or a text string enclosed in quotation marks.
     * Structure is documented below.
     * 
     */
    public Optional<Output<OrganizationCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs>> valueExpression() {
        return Optional.ofNullable(this.valueExpression);
    }

    private OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs() {}

    private OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs(OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs $) {
        this.name = $.name;
        this.valueExpression = $.valueExpression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs $;

        public Builder() {
            $ = new OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs();
        }

        public Builder(OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs defaults) {
            $ = new OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the property for the custom output.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the property for the custom output.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param valueExpression The CEL expression for the custom output. A resource property can be specified
         * to return the value of the property or a text string enclosed in quotation marks.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder valueExpression(@Nullable Output<OrganizationCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs> valueExpression) {
            $.valueExpression = valueExpression;
            return this;
        }

        /**
         * @param valueExpression The CEL expression for the custom output. A resource property can be specified
         * to return the value of the property or a text string enclosed in quotation marks.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder valueExpression(OrganizationCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs valueExpression) {
            return valueExpression(Output.of(valueExpression));
        }

        public OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs build() {
            return $;
        }
    }

}
