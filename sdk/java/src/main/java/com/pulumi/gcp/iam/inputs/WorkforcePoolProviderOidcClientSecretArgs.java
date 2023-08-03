// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcClientSecretValueArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkforcePoolProviderOidcClientSecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkforcePoolProviderOidcClientSecretArgs Empty = new WorkforcePoolProviderOidcClientSecretArgs();

    /**
     * The value of the client secret.
     * Structure is documented below.
     * 
     */
    @Import(name="value")
    private @Nullable Output<WorkforcePoolProviderOidcClientSecretValueArgs> value;

    /**
     * @return The value of the client secret.
     * Structure is documented below.
     * 
     */
    public Optional<Output<WorkforcePoolProviderOidcClientSecretValueArgs>> value() {
        return Optional.ofNullable(this.value);
    }

    private WorkforcePoolProviderOidcClientSecretArgs() {}

    private WorkforcePoolProviderOidcClientSecretArgs(WorkforcePoolProviderOidcClientSecretArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkforcePoolProviderOidcClientSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkforcePoolProviderOidcClientSecretArgs $;

        public Builder() {
            $ = new WorkforcePoolProviderOidcClientSecretArgs();
        }

        public Builder(WorkforcePoolProviderOidcClientSecretArgs defaults) {
            $ = new WorkforcePoolProviderOidcClientSecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param value The value of the client secret.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<WorkforcePoolProviderOidcClientSecretValueArgs> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the client secret.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder value(WorkforcePoolProviderOidcClientSecretValueArgs value) {
            return value(Output.of(value));
        }

        public WorkforcePoolProviderOidcClientSecretArgs build() {
            return $;
        }
    }

}