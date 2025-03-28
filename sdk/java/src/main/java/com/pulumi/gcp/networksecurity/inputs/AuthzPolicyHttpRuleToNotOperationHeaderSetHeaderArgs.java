// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networksecurity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderValueArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs Empty = new AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs();

    /**
     * Specifies the name of the header in the request.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the header in the request.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies how the header match will be performed.
     * Structure is documented below.
     * 
     */
    @Import(name="value")
    private @Nullable Output<AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderValueArgs> value;

    /**
     * @return Specifies how the header match will be performed.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderValueArgs>> value() {
        return Optional.ofNullable(this.value);
    }

    private AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs() {}

    private AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs(AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs $;

        public Builder() {
            $ = new AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs();
        }

        public Builder(AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs defaults) {
            $ = new AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the header in the request.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the header in the request.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Specifies how the header match will be performed.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderValueArgs> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Specifies how the header match will be performed.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder value(AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderValueArgs value) {
            return value(Output.of(value));
        }

        public AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs build() {
            return $;
        }
    }

}
