// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppCheckDebugTokenState extends com.pulumi.resources.ResourceArgs {

    public static final AppCheckDebugTokenState Empty = new AppCheckDebugTokenState();

    /**
     * The ID of a
     * [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id),
     * [Apple App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.iosApps#IosApp.FIELDS.app_id),
     * or [Android App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.androidApps#AndroidApp.FIELDS.app_id)
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return The ID of a
     * [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id),
     * [Apple App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.iosApps#IosApp.FIELDS.app_id),
     * or [Android App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.androidApps#AndroidApp.FIELDS.app_id)
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * The last segment of the resource name of the debug token.
     * 
     */
    @Import(name="debugTokenId")
    private @Nullable Output<String> debugTokenId;

    /**
     * @return The last segment of the resource name of the debug token.
     * 
     */
    public Optional<Output<String>> debugTokenId() {
        return Optional.ofNullable(this.debugTokenId);
    }

    /**
     * A human readable display name used to identify this debug token.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A human readable display name used to identify this debug token.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
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
     * The secret token itself. Must be provided during creation, and must be a UUID4,
     * case insensitive. You may use a method of your choice such as random/random_uuid
     * to generate the token.
     * This field is immutable once set, and cannot be updated. You can, however, delete
     * this debug token to revoke it.
     * For security reasons, this field will never be populated in any response.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return The secret token itself. Must be provided during creation, and must be a UUID4,
     * case insensitive. You may use a method of your choice such as random/random_uuid
     * to generate the token.
     * This field is immutable once set, and cannot be updated. You can, however, delete
     * this debug token to revoke it.
     * For security reasons, this field will never be populated in any response.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    private AppCheckDebugTokenState() {}

    private AppCheckDebugTokenState(AppCheckDebugTokenState $) {
        this.appId = $.appId;
        this.debugTokenId = $.debugTokenId;
        this.displayName = $.displayName;
        this.project = $.project;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppCheckDebugTokenState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppCheckDebugTokenState $;

        public Builder() {
            $ = new AppCheckDebugTokenState();
        }

        public Builder(AppCheckDebugTokenState defaults) {
            $ = new AppCheckDebugTokenState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The ID of a
         * [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id),
         * [Apple App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.iosApps#IosApp.FIELDS.app_id),
         * or [Android App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.androidApps#AndroidApp.FIELDS.app_id)
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The ID of a
         * [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id),
         * [Apple App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.iosApps#IosApp.FIELDS.app_id),
         * or [Android App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.androidApps#AndroidApp.FIELDS.app_id)
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param debugTokenId The last segment of the resource name of the debug token.
         * 
         * @return builder
         * 
         */
        public Builder debugTokenId(@Nullable Output<String> debugTokenId) {
            $.debugTokenId = debugTokenId;
            return this;
        }

        /**
         * @param debugTokenId The last segment of the resource name of the debug token.
         * 
         * @return builder
         * 
         */
        public Builder debugTokenId(String debugTokenId) {
            return debugTokenId(Output.of(debugTokenId));
        }

        /**
         * @param displayName A human readable display name used to identify this debug token.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A human readable display name used to identify this debug token.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
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
         * @param token The secret token itself. Must be provided during creation, and must be a UUID4,
         * case insensitive. You may use a method of your choice such as random/random_uuid
         * to generate the token.
         * This field is immutable once set, and cannot be updated. You can, however, delete
         * this debug token to revoke it.
         * For security reasons, this field will never be populated in any response.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token The secret token itself. Must be provided during creation, and must be a UUID4,
         * case insensitive. You may use a method of your choice such as random/random_uuid
         * to generate the token.
         * This field is immutable once set, and cannot be updated. You can, however, delete
         * this debug token to revoke it.
         * For security reasons, this field will never be populated in any response.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public AppCheckDebugTokenState build() {
            return $;
        }
    }

}
