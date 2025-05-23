// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromSourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimeterSpecEgressPolicyEgressFromArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterSpecEgressPolicyEgressFromArgs Empty = new ServicePerimeterSpecEgressPolicyEgressFromArgs();

    /**
     * A list of identities that are allowed access through this `EgressPolicy`.
     * Should be in the format of email address. The email address should
     * represent individual user or service account only.
     * 
     */
    @Import(name="identities")
    private @Nullable Output<List<String>> identities;

    /**
     * @return A list of identities that are allowed access through this `EgressPolicy`.
     * Should be in the format of email address. The email address should
     * represent individual user or service account only.
     * 
     */
    public Optional<Output<List<String>>> identities() {
        return Optional.ofNullable(this.identities);
    }

    /**
     * Specifies the type of identities that are allowed access to outside the
     * perimeter. If left unspecified, then members of `identities` field will
     * be allowed access.
     * Possible values are: `IDENTITY_TYPE_UNSPECIFIED`, `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, `ANY_SERVICE_ACCOUNT`.
     * 
     */
    @Import(name="identityType")
    private @Nullable Output<String> identityType;

    /**
     * @return Specifies the type of identities that are allowed access to outside the
     * perimeter. If left unspecified, then members of `identities` field will
     * be allowed access.
     * Possible values are: `IDENTITY_TYPE_UNSPECIFIED`, `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, `ANY_SERVICE_ACCOUNT`.
     * 
     */
    public Optional<Output<String>> identityType() {
        return Optional.ofNullable(this.identityType);
    }

    /**
     * Whether to enforce traffic restrictions based on `sources` field. If the `sources` field is non-empty, then this field must be set to `SOURCE_RESTRICTION_ENABLED`.
     * Possible values are: `SOURCE_RESTRICTION_UNSPECIFIED`, `SOURCE_RESTRICTION_ENABLED`, `SOURCE_RESTRICTION_DISABLED`.
     * 
     */
    @Import(name="sourceRestriction")
    private @Nullable Output<String> sourceRestriction;

    /**
     * @return Whether to enforce traffic restrictions based on `sources` field. If the `sources` field is non-empty, then this field must be set to `SOURCE_RESTRICTION_ENABLED`.
     * Possible values are: `SOURCE_RESTRICTION_UNSPECIFIED`, `SOURCE_RESTRICTION_ENABLED`, `SOURCE_RESTRICTION_DISABLED`.
     * 
     */
    public Optional<Output<String>> sourceRestriction() {
        return Optional.ofNullable(this.sourceRestriction);
    }

    /**
     * Sources that this EgressPolicy authorizes access from.
     * Structure is documented below.
     * 
     */
    @Import(name="sources")
    private @Nullable Output<List<ServicePerimeterSpecEgressPolicyEgressFromSourceArgs>> sources;

    /**
     * @return Sources that this EgressPolicy authorizes access from.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ServicePerimeterSpecEgressPolicyEgressFromSourceArgs>>> sources() {
        return Optional.ofNullable(this.sources);
    }

    private ServicePerimeterSpecEgressPolicyEgressFromArgs() {}

    private ServicePerimeterSpecEgressPolicyEgressFromArgs(ServicePerimeterSpecEgressPolicyEgressFromArgs $) {
        this.identities = $.identities;
        this.identityType = $.identityType;
        this.sourceRestriction = $.sourceRestriction;
        this.sources = $.sources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterSpecEgressPolicyEgressFromArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterSpecEgressPolicyEgressFromArgs $;

        public Builder() {
            $ = new ServicePerimeterSpecEgressPolicyEgressFromArgs();
        }

        public Builder(ServicePerimeterSpecEgressPolicyEgressFromArgs defaults) {
            $ = new ServicePerimeterSpecEgressPolicyEgressFromArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identities A list of identities that are allowed access through this `EgressPolicy`.
         * Should be in the format of email address. The email address should
         * represent individual user or service account only.
         * 
         * @return builder
         * 
         */
        public Builder identities(@Nullable Output<List<String>> identities) {
            $.identities = identities;
            return this;
        }

        /**
         * @param identities A list of identities that are allowed access through this `EgressPolicy`.
         * Should be in the format of email address. The email address should
         * represent individual user or service account only.
         * 
         * @return builder
         * 
         */
        public Builder identities(List<String> identities) {
            return identities(Output.of(identities));
        }

        /**
         * @param identities A list of identities that are allowed access through this `EgressPolicy`.
         * Should be in the format of email address. The email address should
         * represent individual user or service account only.
         * 
         * @return builder
         * 
         */
        public Builder identities(String... identities) {
            return identities(List.of(identities));
        }

        /**
         * @param identityType Specifies the type of identities that are allowed access to outside the
         * perimeter. If left unspecified, then members of `identities` field will
         * be allowed access.
         * Possible values are: `IDENTITY_TYPE_UNSPECIFIED`, `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, `ANY_SERVICE_ACCOUNT`.
         * 
         * @return builder
         * 
         */
        public Builder identityType(@Nullable Output<String> identityType) {
            $.identityType = identityType;
            return this;
        }

        /**
         * @param identityType Specifies the type of identities that are allowed access to outside the
         * perimeter. If left unspecified, then members of `identities` field will
         * be allowed access.
         * Possible values are: `IDENTITY_TYPE_UNSPECIFIED`, `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, `ANY_SERVICE_ACCOUNT`.
         * 
         * @return builder
         * 
         */
        public Builder identityType(String identityType) {
            return identityType(Output.of(identityType));
        }

        /**
         * @param sourceRestriction Whether to enforce traffic restrictions based on `sources` field. If the `sources` field is non-empty, then this field must be set to `SOURCE_RESTRICTION_ENABLED`.
         * Possible values are: `SOURCE_RESTRICTION_UNSPECIFIED`, `SOURCE_RESTRICTION_ENABLED`, `SOURCE_RESTRICTION_DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder sourceRestriction(@Nullable Output<String> sourceRestriction) {
            $.sourceRestriction = sourceRestriction;
            return this;
        }

        /**
         * @param sourceRestriction Whether to enforce traffic restrictions based on `sources` field. If the `sources` field is non-empty, then this field must be set to `SOURCE_RESTRICTION_ENABLED`.
         * Possible values are: `SOURCE_RESTRICTION_UNSPECIFIED`, `SOURCE_RESTRICTION_ENABLED`, `SOURCE_RESTRICTION_DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder sourceRestriction(String sourceRestriction) {
            return sourceRestriction(Output.of(sourceRestriction));
        }

        /**
         * @param sources Sources that this EgressPolicy authorizes access from.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sources(@Nullable Output<List<ServicePerimeterSpecEgressPolicyEgressFromSourceArgs>> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources Sources that this EgressPolicy authorizes access from.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sources(List<ServicePerimeterSpecEgressPolicyEgressFromSourceArgs> sources) {
            return sources(Output.of(sources));
        }

        /**
         * @param sources Sources that this EgressPolicy authorizes access from.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sources(ServicePerimeterSpecEgressPolicyEgressFromSourceArgs... sources) {
            return sources(List.of(sources));
        }

        public ServicePerimeterSpecEgressPolicyEgressFromArgs build() {
            return $;
        }
    }

}
