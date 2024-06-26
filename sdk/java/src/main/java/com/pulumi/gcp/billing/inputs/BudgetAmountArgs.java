// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.billing.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.billing.inputs.BudgetAmountSpecifiedAmountArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BudgetAmountArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetAmountArgs Empty = new BudgetAmountArgs();

    /**
     * Configures a budget amount that is automatically set to 100% of
     * last period&#39;s spend.
     * Boolean. Set value to true to use. Do not set to false, instead
     * use the `specified_amount` block.
     * 
     */
    @Import(name="lastPeriodAmount")
    private @Nullable Output<Boolean> lastPeriodAmount;

    /**
     * @return Configures a budget amount that is automatically set to 100% of
     * last period&#39;s spend.
     * Boolean. Set value to true to use. Do not set to false, instead
     * use the `specified_amount` block.
     * 
     */
    public Optional<Output<Boolean>> lastPeriodAmount() {
        return Optional.ofNullable(this.lastPeriodAmount);
    }

    /**
     * A specified amount to use as the budget. currencyCode is
     * optional. If specified, it must match the currency of the
     * billing account. The currencyCode is provided on output.
     * Structure is documented below.
     * 
     */
    @Import(name="specifiedAmount")
    private @Nullable Output<BudgetAmountSpecifiedAmountArgs> specifiedAmount;

    /**
     * @return A specified amount to use as the budget. currencyCode is
     * optional. If specified, it must match the currency of the
     * billing account. The currencyCode is provided on output.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BudgetAmountSpecifiedAmountArgs>> specifiedAmount() {
        return Optional.ofNullable(this.specifiedAmount);
    }

    private BudgetAmountArgs() {}

    private BudgetAmountArgs(BudgetAmountArgs $) {
        this.lastPeriodAmount = $.lastPeriodAmount;
        this.specifiedAmount = $.specifiedAmount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetAmountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetAmountArgs $;

        public Builder() {
            $ = new BudgetAmountArgs();
        }

        public Builder(BudgetAmountArgs defaults) {
            $ = new BudgetAmountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lastPeriodAmount Configures a budget amount that is automatically set to 100% of
         * last period&#39;s spend.
         * Boolean. Set value to true to use. Do not set to false, instead
         * use the `specified_amount` block.
         * 
         * @return builder
         * 
         */
        public Builder lastPeriodAmount(@Nullable Output<Boolean> lastPeriodAmount) {
            $.lastPeriodAmount = lastPeriodAmount;
            return this;
        }

        /**
         * @param lastPeriodAmount Configures a budget amount that is automatically set to 100% of
         * last period&#39;s spend.
         * Boolean. Set value to true to use. Do not set to false, instead
         * use the `specified_amount` block.
         * 
         * @return builder
         * 
         */
        public Builder lastPeriodAmount(Boolean lastPeriodAmount) {
            return lastPeriodAmount(Output.of(lastPeriodAmount));
        }

        /**
         * @param specifiedAmount A specified amount to use as the budget. currencyCode is
         * optional. If specified, it must match the currency of the
         * billing account. The currencyCode is provided on output.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder specifiedAmount(@Nullable Output<BudgetAmountSpecifiedAmountArgs> specifiedAmount) {
            $.specifiedAmount = specifiedAmount;
            return this;
        }

        /**
         * @param specifiedAmount A specified amount to use as the budget. currencyCode is
         * optional. If specified, it must match the currency of the
         * billing account. The currencyCode is provided on output.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder specifiedAmount(BudgetAmountSpecifiedAmountArgs specifiedAmount) {
            return specifiedAmount(Output.of(specifiedAmount));
        }

        public BudgetAmountArgs build() {
            return $;
        }
    }

}
