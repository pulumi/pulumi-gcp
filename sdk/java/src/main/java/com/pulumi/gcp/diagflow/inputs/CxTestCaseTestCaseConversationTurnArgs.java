// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnUserInputArgs;
import com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnVirtualAgentOutputArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxTestCaseTestCaseConversationTurnArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxTestCaseTestCaseConversationTurnArgs Empty = new CxTestCaseTestCaseConversationTurnArgs();

    /**
     * The user input.
     * Structure is documented below.
     * 
     */
    @Import(name="userInput")
    private @Nullable Output<CxTestCaseTestCaseConversationTurnUserInputArgs> userInput;

    /**
     * @return The user input.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CxTestCaseTestCaseConversationTurnUserInputArgs>> userInput() {
        return Optional.ofNullable(this.userInput);
    }

    /**
     * The virtual agent output.
     * Structure is documented below.
     * 
     */
    @Import(name="virtualAgentOutput")
    private @Nullable Output<CxTestCaseTestCaseConversationTurnVirtualAgentOutputArgs> virtualAgentOutput;

    /**
     * @return The virtual agent output.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CxTestCaseTestCaseConversationTurnVirtualAgentOutputArgs>> virtualAgentOutput() {
        return Optional.ofNullable(this.virtualAgentOutput);
    }

    private CxTestCaseTestCaseConversationTurnArgs() {}

    private CxTestCaseTestCaseConversationTurnArgs(CxTestCaseTestCaseConversationTurnArgs $) {
        this.userInput = $.userInput;
        this.virtualAgentOutput = $.virtualAgentOutput;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxTestCaseTestCaseConversationTurnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxTestCaseTestCaseConversationTurnArgs $;

        public Builder() {
            $ = new CxTestCaseTestCaseConversationTurnArgs();
        }

        public Builder(CxTestCaseTestCaseConversationTurnArgs defaults) {
            $ = new CxTestCaseTestCaseConversationTurnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param userInput The user input.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder userInput(@Nullable Output<CxTestCaseTestCaseConversationTurnUserInputArgs> userInput) {
            $.userInput = userInput;
            return this;
        }

        /**
         * @param userInput The user input.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder userInput(CxTestCaseTestCaseConversationTurnUserInputArgs userInput) {
            return userInput(Output.of(userInput));
        }

        /**
         * @param virtualAgentOutput The virtual agent output.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder virtualAgentOutput(@Nullable Output<CxTestCaseTestCaseConversationTurnVirtualAgentOutputArgs> virtualAgentOutput) {
            $.virtualAgentOutput = virtualAgentOutput;
            return this;
        }

        /**
         * @param virtualAgentOutput The virtual agent output.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder virtualAgentOutput(CxTestCaseTestCaseConversationTurnVirtualAgentOutputArgs virtualAgentOutput) {
            return virtualAgentOutput(Output.of(virtualAgentOutput));
        }

        public CxTestCaseTestCaseConversationTurnArgs build() {
            return $;
        }
    }

}
