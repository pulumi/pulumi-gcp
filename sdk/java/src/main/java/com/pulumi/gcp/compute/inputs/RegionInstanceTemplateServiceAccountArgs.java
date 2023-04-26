// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionInstanceTemplateServiceAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionInstanceTemplateServiceAccountArgs Empty = new RegionInstanceTemplateServiceAccountArgs();

    /**
     * The service account e-mail address. If not given, the
     * default Google Compute Engine service account is used.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return The service account e-mail address. If not given, the
     * default Google Compute Engine service account is used.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * A list of service scopes. Both OAuth2 URLs and gcloud
     * short names are supported. To allow full access to all Cloud APIs, use the
     * `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
     * 
     */
    @Import(name="scopes", required=true)
    private Output<List<String>> scopes;

    /**
     * @return A list of service scopes. Both OAuth2 URLs and gcloud
     * short names are supported. To allow full access to all Cloud APIs, use the
     * `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
     * 
     */
    public Output<List<String>> scopes() {
        return this.scopes;
    }

    private RegionInstanceTemplateServiceAccountArgs() {}

    private RegionInstanceTemplateServiceAccountArgs(RegionInstanceTemplateServiceAccountArgs $) {
        this.email = $.email;
        this.scopes = $.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionInstanceTemplateServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionInstanceTemplateServiceAccountArgs $;

        public Builder() {
            $ = new RegionInstanceTemplateServiceAccountArgs();
        }

        public Builder(RegionInstanceTemplateServiceAccountArgs defaults) {
            $ = new RegionInstanceTemplateServiceAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param email The service account e-mail address. If not given, the
         * default Google Compute Engine service account is used.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The service account e-mail address. If not given, the
         * default Google Compute Engine service account is used.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param scopes A list of service scopes. Both OAuth2 URLs and gcloud
         * short names are supported. To allow full access to all Cloud APIs, use the
         * `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
         * 
         * @return builder
         * 
         */
        public Builder scopes(Output<List<String>> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes A list of service scopes. Both OAuth2 URLs and gcloud
         * short names are supported. To allow full access to all Cloud APIs, use the
         * `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
         * 
         * @return builder
         * 
         */
        public Builder scopes(List<String> scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param scopes A list of service scopes. Both OAuth2 URLs and gcloud
         * short names are supported. To allow full access to all Cloud APIs, use the
         * `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
         * 
         * @return builder
         * 
         */
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        public RegionInstanceTemplateServiceAccountArgs build() {
            $.scopes = Objects.requireNonNull($.scopes, "expected parameter 'scopes' to be non-null");
            return $;
        }
    }

}