// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputArgs;
import com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxTestCaseLastTestResultConversationTurnArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxTestCaseLastTestResultConversationTurnArgs Empty = new CxTestCaseLastTestResultConversationTurnArgs();

    /**
     * The user input.
     * Structure is documented below.
     * 
     */
    @Import(name="userInput")
    private @Nullable Output<CxTestCaseLastTestResultConversationTurnUserInputArgs> userInput;

    /**
     * @return The user input.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CxTestCaseLastTestResultConversationTurnUserInputArgs>> userInput() {
        return Optional.ofNullable(this.userInput);
    }

    /**
     * The virtual agent output.
     * Structure is documented below.
     * 
     */
    @Import(name="virtualAgentOutput")
    private @Nullable Output<CxTestCaseLastTestResultConversationTurnVirtualAgentOutputArgs> virtualAgentOutput;

    /**
     * @return The virtual agent output.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CxTestCaseLastTestResultConversationTurnVirtualAgentOutputArgs>> virtualAgentOutput() {
        return Optional.ofNullable(this.virtualAgentOutput);
    }

    private CxTestCaseLastTestResultConversationTurnArgs() {}

    private CxTestCaseLastTestResultConversationTurnArgs(CxTestCaseLastTestResultConversationTurnArgs $) {
        this.userInput = $.userInput;
        this.virtualAgentOutput = $.virtualAgentOutput;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxTestCaseLastTestResultConversationTurnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxTestCaseLastTestResultConversationTurnArgs $;

        public Builder() {
            $ = new CxTestCaseLastTestResultConversationTurnArgs();
        }

        public Builder(CxTestCaseLastTestResultConversationTurnArgs defaults) {
            $ = new CxTestCaseLastTestResultConversationTurnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param userInput The user input.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder userInput(@Nullable Output<CxTestCaseLastTestResultConversationTurnUserInputArgs> userInput) {
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
        public Builder userInput(CxTestCaseLastTestResultConversationTurnUserInputArgs userInput) {
            return userInput(Output.of(userInput));
        }

        /**
         * @param virtualAgentOutput The virtual agent output.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder virtualAgentOutput(@Nullable Output<CxTestCaseLastTestResultConversationTurnVirtualAgentOutputArgs> virtualAgentOutput) {
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
        public Builder virtualAgentOutput(CxTestCaseLastTestResultConversationTurnVirtualAgentOutputArgs virtualAgentOutput) {
            return virtualAgentOutput(Output.of(virtualAgentOutput));
        }

        public CxTestCaseLastTestResultConversationTurnArgs build() {
            return $;
        }
    }

}