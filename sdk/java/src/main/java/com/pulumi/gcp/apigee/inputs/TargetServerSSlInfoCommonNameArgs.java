// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TargetServerSSlInfoCommonNameArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetServerSSlInfoCommonNameArgs Empty = new TargetServerSSlInfoCommonNameArgs();

    /**
     * The TLS Common Name string of the certificate.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The TLS Common Name string of the certificate.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * Indicates whether the cert should be matched against as a wildcard cert.
     * 
     */
    @Import(name="wildcardMatch")
    private @Nullable Output<Boolean> wildcardMatch;

    /**
     * @return Indicates whether the cert should be matched against as a wildcard cert.
     * 
     */
    public Optional<Output<Boolean>> wildcardMatch() {
        return Optional.ofNullable(this.wildcardMatch);
    }

    private TargetServerSSlInfoCommonNameArgs() {}

    private TargetServerSSlInfoCommonNameArgs(TargetServerSSlInfoCommonNameArgs $) {
        this.value = $.value;
        this.wildcardMatch = $.wildcardMatch;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetServerSSlInfoCommonNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetServerSSlInfoCommonNameArgs $;

        public Builder() {
            $ = new TargetServerSSlInfoCommonNameArgs();
        }

        public Builder(TargetServerSSlInfoCommonNameArgs defaults) {
            $ = new TargetServerSSlInfoCommonNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param value The TLS Common Name string of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The TLS Common Name string of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param wildcardMatch Indicates whether the cert should be matched against as a wildcard cert.
         * 
         * @return builder
         * 
         */
        public Builder wildcardMatch(@Nullable Output<Boolean> wildcardMatch) {
            $.wildcardMatch = wildcardMatch;
            return this;
        }

        /**
         * @param wildcardMatch Indicates whether the cert should be matched against as a wildcard cert.
         * 
         * @return builder
         * 
         */
        public Builder wildcardMatch(Boolean wildcardMatch) {
            return wildcardMatch(Output.of(wildcardMatch));
        }

        public TargetServerSSlInfoCommonNameArgs build() {
            return $;
        }
    }

}