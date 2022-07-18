// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxPageFormParameterFillBehaviorArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxPageFormParameterFillBehaviorArgs Empty = new CxPageFormParameterFillBehaviorArgs();

    /**
     * The fulfillment to provide the initial prompt that the agent can present to the user in order to fill the parameter.
     * Structure is documented below.
     * 
     */
    @Import(name="initialPromptFulfillment")
    private @Nullable Output<CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs> initialPromptFulfillment;

    /**
     * @return The fulfillment to provide the initial prompt that the agent can present to the user in order to fill the parameter.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs>> initialPromptFulfillment() {
        return Optional.ofNullable(this.initialPromptFulfillment);
    }

    private CxPageFormParameterFillBehaviorArgs() {}

    private CxPageFormParameterFillBehaviorArgs(CxPageFormParameterFillBehaviorArgs $) {
        this.initialPromptFulfillment = $.initialPromptFulfillment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxPageFormParameterFillBehaviorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxPageFormParameterFillBehaviorArgs $;

        public Builder() {
            $ = new CxPageFormParameterFillBehaviorArgs();
        }

        public Builder(CxPageFormParameterFillBehaviorArgs defaults) {
            $ = new CxPageFormParameterFillBehaviorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param initialPromptFulfillment The fulfillment to provide the initial prompt that the agent can present to the user in order to fill the parameter.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder initialPromptFulfillment(@Nullable Output<CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs> initialPromptFulfillment) {
            $.initialPromptFulfillment = initialPromptFulfillment;
            return this;
        }

        /**
         * @param initialPromptFulfillment The fulfillment to provide the initial prompt that the agent can present to the user in order to fill the parameter.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder initialPromptFulfillment(CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs initialPromptFulfillment) {
            return initialPromptFulfillment(Output.of(initialPromptFulfillment));
        }

        public CxPageFormParameterFillBehaviorArgs build() {
            return $;
        }
    }

}