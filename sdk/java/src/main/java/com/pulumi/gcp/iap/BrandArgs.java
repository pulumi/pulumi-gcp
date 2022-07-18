// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrandArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrandArgs Empty = new BrandArgs();

    /**
     * Application name displayed on OAuth consent screen.
     * 
     */
    @Import(name="applicationTitle", required=true)
    private Output<String> applicationTitle;

    /**
     * @return Application name displayed on OAuth consent screen.
     * 
     */
    public Output<String> applicationTitle() {
        return this.applicationTitle;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Support email displayed on the OAuth consent screen. Can be either a
     * user or group email. When a user email is specified, the caller must
     * be the user with the associated email address. When a group email is
     * specified, the caller can be either a user or a service account which
     * is an owner of the specified group in Cloud Identity.
     * 
     */
    @Import(name="supportEmail", required=true)
    private Output<String> supportEmail;

    /**
     * @return Support email displayed on the OAuth consent screen. Can be either a
     * user or group email. When a user email is specified, the caller must
     * be the user with the associated email address. When a group email is
     * specified, the caller can be either a user or a service account which
     * is an owner of the specified group in Cloud Identity.
     * 
     */
    public Output<String> supportEmail() {
        return this.supportEmail;
    }

    private BrandArgs() {}

    private BrandArgs(BrandArgs $) {
        this.applicationTitle = $.applicationTitle;
        this.project = $.project;
        this.supportEmail = $.supportEmail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrandArgs $;

        public Builder() {
            $ = new BrandArgs();
        }

        public Builder(BrandArgs defaults) {
            $ = new BrandArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationTitle Application name displayed on OAuth consent screen.
         * 
         * @return builder
         * 
         */
        public Builder applicationTitle(Output<String> applicationTitle) {
            $.applicationTitle = applicationTitle;
            return this;
        }

        /**
         * @param applicationTitle Application name displayed on OAuth consent screen.
         * 
         * @return builder
         * 
         */
        public Builder applicationTitle(String applicationTitle) {
            return applicationTitle(Output.of(applicationTitle));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param supportEmail Support email displayed on the OAuth consent screen. Can be either a
         * user or group email. When a user email is specified, the caller must
         * be the user with the associated email address. When a group email is
         * specified, the caller can be either a user or a service account which
         * is an owner of the specified group in Cloud Identity.
         * 
         * @return builder
         * 
         */
        public Builder supportEmail(Output<String> supportEmail) {
            $.supportEmail = supportEmail;
            return this;
        }

        /**
         * @param supportEmail Support email displayed on the OAuth consent screen. Can be either a
         * user or group email. When a user email is specified, the caller must
         * be the user with the associated email address. When a group email is
         * specified, the caller can be either a user or a service account which
         * is an owner of the specified group in Cloud Identity.
         * 
         * @return builder
         * 
         */
        public Builder supportEmail(String supportEmail) {
            return supportEmail(Output.of(supportEmail));
        }

        public BrandArgs build() {
            $.applicationTitle = Objects.requireNonNull($.applicationTitle, "expected parameter 'applicationTitle' to be non-null");
            $.supportEmail = Objects.requireNonNull($.supportEmail, "expected parameter 'supportEmail' to be non-null");
            return $;
        }
    }

}