// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsAndroidKeyRestrictionsArgs;
import com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsApiTargetArgs;
import com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsBrowserKeyRestrictionsArgs;
import com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsIosKeyRestrictionsArgs;
import com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsServerKeyRestrictionsArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiKeyRestrictionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiKeyRestrictionsArgs Empty = new ApiKeyRestrictionsArgs();

    /**
     * The Android apps that are allowed to use the key.
     * 
     */
    @Import(name="androidKeyRestrictions")
    private @Nullable Output<ApiKeyRestrictionsAndroidKeyRestrictionsArgs> androidKeyRestrictions;

    /**
     * @return The Android apps that are allowed to use the key.
     * 
     */
    public Optional<Output<ApiKeyRestrictionsAndroidKeyRestrictionsArgs>> androidKeyRestrictions() {
        return Optional.ofNullable(this.androidKeyRestrictions);
    }

    /**
     * A restriction for a specific service and optionally one or more specific methods. Requests are allowed if they match any of these restrictions. If no restrictions are specified, all targets are allowed.
     * 
     */
    @Import(name="apiTargets")
    private @Nullable Output<List<ApiKeyRestrictionsApiTargetArgs>> apiTargets;

    /**
     * @return A restriction for a specific service and optionally one or more specific methods. Requests are allowed if they match any of these restrictions. If no restrictions are specified, all targets are allowed.
     * 
     */
    public Optional<Output<List<ApiKeyRestrictionsApiTargetArgs>>> apiTargets() {
        return Optional.ofNullable(this.apiTargets);
    }

    /**
     * The HTTP referrers (websites) that are allowed to use the key.
     * 
     */
    @Import(name="browserKeyRestrictions")
    private @Nullable Output<ApiKeyRestrictionsBrowserKeyRestrictionsArgs> browserKeyRestrictions;

    /**
     * @return The HTTP referrers (websites) that are allowed to use the key.
     * 
     */
    public Optional<Output<ApiKeyRestrictionsBrowserKeyRestrictionsArgs>> browserKeyRestrictions() {
        return Optional.ofNullable(this.browserKeyRestrictions);
    }

    /**
     * The iOS apps that are allowed to use the key.
     * 
     */
    @Import(name="iosKeyRestrictions")
    private @Nullable Output<ApiKeyRestrictionsIosKeyRestrictionsArgs> iosKeyRestrictions;

    /**
     * @return The iOS apps that are allowed to use the key.
     * 
     */
    public Optional<Output<ApiKeyRestrictionsIosKeyRestrictionsArgs>> iosKeyRestrictions() {
        return Optional.ofNullable(this.iosKeyRestrictions);
    }

    /**
     * The IP addresses of callers that are allowed to use the key.
     * 
     */
    @Import(name="serverKeyRestrictions")
    private @Nullable Output<ApiKeyRestrictionsServerKeyRestrictionsArgs> serverKeyRestrictions;

    /**
     * @return The IP addresses of callers that are allowed to use the key.
     * 
     */
    public Optional<Output<ApiKeyRestrictionsServerKeyRestrictionsArgs>> serverKeyRestrictions() {
        return Optional.ofNullable(this.serverKeyRestrictions);
    }

    private ApiKeyRestrictionsArgs() {}

    private ApiKeyRestrictionsArgs(ApiKeyRestrictionsArgs $) {
        this.androidKeyRestrictions = $.androidKeyRestrictions;
        this.apiTargets = $.apiTargets;
        this.browserKeyRestrictions = $.browserKeyRestrictions;
        this.iosKeyRestrictions = $.iosKeyRestrictions;
        this.serverKeyRestrictions = $.serverKeyRestrictions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiKeyRestrictionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiKeyRestrictionsArgs $;

        public Builder() {
            $ = new ApiKeyRestrictionsArgs();
        }

        public Builder(ApiKeyRestrictionsArgs defaults) {
            $ = new ApiKeyRestrictionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param androidKeyRestrictions The Android apps that are allowed to use the key.
         * 
         * @return builder
         * 
         */
        public Builder androidKeyRestrictions(@Nullable Output<ApiKeyRestrictionsAndroidKeyRestrictionsArgs> androidKeyRestrictions) {
            $.androidKeyRestrictions = androidKeyRestrictions;
            return this;
        }

        /**
         * @param androidKeyRestrictions The Android apps that are allowed to use the key.
         * 
         * @return builder
         * 
         */
        public Builder androidKeyRestrictions(ApiKeyRestrictionsAndroidKeyRestrictionsArgs androidKeyRestrictions) {
            return androidKeyRestrictions(Output.of(androidKeyRestrictions));
        }

        /**
         * @param apiTargets A restriction for a specific service and optionally one or more specific methods. Requests are allowed if they match any of these restrictions. If no restrictions are specified, all targets are allowed.
         * 
         * @return builder
         * 
         */
        public Builder apiTargets(@Nullable Output<List<ApiKeyRestrictionsApiTargetArgs>> apiTargets) {
            $.apiTargets = apiTargets;
            return this;
        }

        /**
         * @param apiTargets A restriction for a specific service and optionally one or more specific methods. Requests are allowed if they match any of these restrictions. If no restrictions are specified, all targets are allowed.
         * 
         * @return builder
         * 
         */
        public Builder apiTargets(List<ApiKeyRestrictionsApiTargetArgs> apiTargets) {
            return apiTargets(Output.of(apiTargets));
        }

        /**
         * @param apiTargets A restriction for a specific service and optionally one or more specific methods. Requests are allowed if they match any of these restrictions. If no restrictions are specified, all targets are allowed.
         * 
         * @return builder
         * 
         */
        public Builder apiTargets(ApiKeyRestrictionsApiTargetArgs... apiTargets) {
            return apiTargets(List.of(apiTargets));
        }

        /**
         * @param browserKeyRestrictions The HTTP referrers (websites) that are allowed to use the key.
         * 
         * @return builder
         * 
         */
        public Builder browserKeyRestrictions(@Nullable Output<ApiKeyRestrictionsBrowserKeyRestrictionsArgs> browserKeyRestrictions) {
            $.browserKeyRestrictions = browserKeyRestrictions;
            return this;
        }

        /**
         * @param browserKeyRestrictions The HTTP referrers (websites) that are allowed to use the key.
         * 
         * @return builder
         * 
         */
        public Builder browserKeyRestrictions(ApiKeyRestrictionsBrowserKeyRestrictionsArgs browserKeyRestrictions) {
            return browserKeyRestrictions(Output.of(browserKeyRestrictions));
        }

        /**
         * @param iosKeyRestrictions The iOS apps that are allowed to use the key.
         * 
         * @return builder
         * 
         */
        public Builder iosKeyRestrictions(@Nullable Output<ApiKeyRestrictionsIosKeyRestrictionsArgs> iosKeyRestrictions) {
            $.iosKeyRestrictions = iosKeyRestrictions;
            return this;
        }

        /**
         * @param iosKeyRestrictions The iOS apps that are allowed to use the key.
         * 
         * @return builder
         * 
         */
        public Builder iosKeyRestrictions(ApiKeyRestrictionsIosKeyRestrictionsArgs iosKeyRestrictions) {
            return iosKeyRestrictions(Output.of(iosKeyRestrictions));
        }

        /**
         * @param serverKeyRestrictions The IP addresses of callers that are allowed to use the key.
         * 
         * @return builder
         * 
         */
        public Builder serverKeyRestrictions(@Nullable Output<ApiKeyRestrictionsServerKeyRestrictionsArgs> serverKeyRestrictions) {
            $.serverKeyRestrictions = serverKeyRestrictions;
            return this;
        }

        /**
         * @param serverKeyRestrictions The IP addresses of callers that are allowed to use the key.
         * 
         * @return builder
         * 
         */
        public Builder serverKeyRestrictions(ApiKeyRestrictionsServerKeyRestrictionsArgs serverKeyRestrictions) {
            return serverKeyRestrictions(Output.of(serverKeyRestrictions));
        }

        public ApiKeyRestrictionsArgs build() {
            return $;
        }
    }

}
