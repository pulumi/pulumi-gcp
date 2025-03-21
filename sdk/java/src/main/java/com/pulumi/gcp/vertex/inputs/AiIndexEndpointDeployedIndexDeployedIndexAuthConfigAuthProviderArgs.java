// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProviderArgs Empty = new AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProviderArgs();

    /**
     * A list of allowed JWT issuers. Each entry must be a valid Google service account, in the following format: service-account-name{@literal @}project-id.iam.gserviceaccount.com
     * 
     */
    @Import(name="allowedIssuers")
    private @Nullable Output<List<String>> allowedIssuers;

    /**
     * @return A list of allowed JWT issuers. Each entry must be a valid Google service account, in the following format: service-account-name{@literal @}project-id.iam.gserviceaccount.com
     * 
     */
    public Optional<Output<List<String>>> allowedIssuers() {
        return Optional.ofNullable(this.allowedIssuers);
    }

    /**
     * The list of JWT audiences. that are allowed to access. A JWT containing any of these audiences will be accepted.
     * 
     */
    @Import(name="audiences")
    private @Nullable Output<List<String>> audiences;

    /**
     * @return The list of JWT audiences. that are allowed to access. A JWT containing any of these audiences will be accepted.
     * 
     */
    public Optional<Output<List<String>>> audiences() {
        return Optional.ofNullable(this.audiences);
    }

    private AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProviderArgs() {}

    private AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProviderArgs(AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProviderArgs $) {
        this.allowedIssuers = $.allowedIssuers;
        this.audiences = $.audiences;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProviderArgs $;

        public Builder() {
            $ = new AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProviderArgs();
        }

        public Builder(AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProviderArgs defaults) {
            $ = new AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedIssuers A list of allowed JWT issuers. Each entry must be a valid Google service account, in the following format: service-account-name{@literal @}project-id.iam.gserviceaccount.com
         * 
         * @return builder
         * 
         */
        public Builder allowedIssuers(@Nullable Output<List<String>> allowedIssuers) {
            $.allowedIssuers = allowedIssuers;
            return this;
        }

        /**
         * @param allowedIssuers A list of allowed JWT issuers. Each entry must be a valid Google service account, in the following format: service-account-name{@literal @}project-id.iam.gserviceaccount.com
         * 
         * @return builder
         * 
         */
        public Builder allowedIssuers(List<String> allowedIssuers) {
            return allowedIssuers(Output.of(allowedIssuers));
        }

        /**
         * @param allowedIssuers A list of allowed JWT issuers. Each entry must be a valid Google service account, in the following format: service-account-name{@literal @}project-id.iam.gserviceaccount.com
         * 
         * @return builder
         * 
         */
        public Builder allowedIssuers(String... allowedIssuers) {
            return allowedIssuers(List.of(allowedIssuers));
        }

        /**
         * @param audiences The list of JWT audiences. that are allowed to access. A JWT containing any of these audiences will be accepted.
         * 
         * @return builder
         * 
         */
        public Builder audiences(@Nullable Output<List<String>> audiences) {
            $.audiences = audiences;
            return this;
        }

        /**
         * @param audiences The list of JWT audiences. that are allowed to access. A JWT containing any of these audiences will be accepted.
         * 
         * @return builder
         * 
         */
        public Builder audiences(List<String> audiences) {
            return audiences(Output.of(audiences));
        }

        /**
         * @param audiences The list of JWT audiences. that are allowed to access. A JWT containing any of these audiences will be accepted.
         * 
         * @return builder
         * 
         */
        public Builder audiences(String... audiences) {
            return audiences(List.of(audiences));
        }

        public AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProviderArgs build() {
            return $;
        }
    }

}
