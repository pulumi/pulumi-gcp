// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.identityplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.identityplatform.inputs.ProjectDefaultConfigSignInAnonymousArgs;
import com.pulumi.gcp.identityplatform.inputs.ProjectDefaultConfigSignInEmailArgs;
import com.pulumi.gcp.identityplatform.inputs.ProjectDefaultConfigSignInHashConfigArgs;
import com.pulumi.gcp.identityplatform.inputs.ProjectDefaultConfigSignInPhoneNumberArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectDefaultConfigSignInArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectDefaultConfigSignInArgs Empty = new ProjectDefaultConfigSignInArgs();

    /**
     * Whether to allow more than one account to have the same email.
     * 
     */
    @Import(name="allowDuplicateEmails")
    private @Nullable Output<Boolean> allowDuplicateEmails;

    /**
     * @return Whether to allow more than one account to have the same email.
     * 
     */
    public Optional<Output<Boolean>> allowDuplicateEmails() {
        return Optional.ofNullable(this.allowDuplicateEmails);
    }

    /**
     * Configuration options related to authenticating an anonymous user.
     * Structure is documented below.
     * 
     */
    @Import(name="anonymous")
    private @Nullable Output<ProjectDefaultConfigSignInAnonymousArgs> anonymous;

    /**
     * @return Configuration options related to authenticating an anonymous user.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ProjectDefaultConfigSignInAnonymousArgs>> anonymous() {
        return Optional.ofNullable(this.anonymous);
    }

    /**
     * Configuration options related to authenticating a user by their email address.
     * Structure is documented below.
     * 
     */
    @Import(name="email")
    private @Nullable Output<ProjectDefaultConfigSignInEmailArgs> email;

    /**
     * @return Configuration options related to authenticating a user by their email address.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ProjectDefaultConfigSignInEmailArgs>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * - 
     * Output only. Hash config information.
     * Structure is documented below.
     * 
     */
    @Import(name="hashConfigs")
    private @Nullable Output<List<ProjectDefaultConfigSignInHashConfigArgs>> hashConfigs;

    /**
     * @return -
     * Output only. Hash config information.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ProjectDefaultConfigSignInHashConfigArgs>>> hashConfigs() {
        return Optional.ofNullable(this.hashConfigs);
    }

    /**
     * Configuration options related to authenticated a user by their phone number.
     * Structure is documented below.
     * 
     */
    @Import(name="phoneNumber")
    private @Nullable Output<ProjectDefaultConfigSignInPhoneNumberArgs> phoneNumber;

    /**
     * @return Configuration options related to authenticated a user by their phone number.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ProjectDefaultConfigSignInPhoneNumberArgs>> phoneNumber() {
        return Optional.ofNullable(this.phoneNumber);
    }

    private ProjectDefaultConfigSignInArgs() {}

    private ProjectDefaultConfigSignInArgs(ProjectDefaultConfigSignInArgs $) {
        this.allowDuplicateEmails = $.allowDuplicateEmails;
        this.anonymous = $.anonymous;
        this.email = $.email;
        this.hashConfigs = $.hashConfigs;
        this.phoneNumber = $.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectDefaultConfigSignInArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectDefaultConfigSignInArgs $;

        public Builder() {
            $ = new ProjectDefaultConfigSignInArgs();
        }

        public Builder(ProjectDefaultConfigSignInArgs defaults) {
            $ = new ProjectDefaultConfigSignInArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowDuplicateEmails Whether to allow more than one account to have the same email.
         * 
         * @return builder
         * 
         */
        public Builder allowDuplicateEmails(@Nullable Output<Boolean> allowDuplicateEmails) {
            $.allowDuplicateEmails = allowDuplicateEmails;
            return this;
        }

        /**
         * @param allowDuplicateEmails Whether to allow more than one account to have the same email.
         * 
         * @return builder
         * 
         */
        public Builder allowDuplicateEmails(Boolean allowDuplicateEmails) {
            return allowDuplicateEmails(Output.of(allowDuplicateEmails));
        }

        /**
         * @param anonymous Configuration options related to authenticating an anonymous user.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder anonymous(@Nullable Output<ProjectDefaultConfigSignInAnonymousArgs> anonymous) {
            $.anonymous = anonymous;
            return this;
        }

        /**
         * @param anonymous Configuration options related to authenticating an anonymous user.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder anonymous(ProjectDefaultConfigSignInAnonymousArgs anonymous) {
            return anonymous(Output.of(anonymous));
        }

        /**
         * @param email Configuration options related to authenticating a user by their email address.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<ProjectDefaultConfigSignInEmailArgs> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email Configuration options related to authenticating a user by their email address.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder email(ProjectDefaultConfigSignInEmailArgs email) {
            return email(Output.of(email));
        }

        /**
         * @param hashConfigs -
         * Output only. Hash config information.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hashConfigs(@Nullable Output<List<ProjectDefaultConfigSignInHashConfigArgs>> hashConfigs) {
            $.hashConfigs = hashConfigs;
            return this;
        }

        /**
         * @param hashConfigs -
         * Output only. Hash config information.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hashConfigs(List<ProjectDefaultConfigSignInHashConfigArgs> hashConfigs) {
            return hashConfigs(Output.of(hashConfigs));
        }

        /**
         * @param hashConfigs -
         * Output only. Hash config information.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hashConfigs(ProjectDefaultConfigSignInHashConfigArgs... hashConfigs) {
            return hashConfigs(List.of(hashConfigs));
        }

        /**
         * @param phoneNumber Configuration options related to authenticated a user by their phone number.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder phoneNumber(@Nullable Output<ProjectDefaultConfigSignInPhoneNumberArgs> phoneNumber) {
            $.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * @param phoneNumber Configuration options related to authenticated a user by their phone number.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder phoneNumber(ProjectDefaultConfigSignInPhoneNumberArgs phoneNumber) {
            return phoneNumber(Output.of(phoneNumber));
        }

        public ProjectDefaultConfigSignInArgs build() {
            return $;
        }
    }

}