// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostingVersionConfigRewriteRunArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostingVersionConfigRewriteRunArgs Empty = new HostingVersionConfigRewriteRunArgs();

    /**
     * Optional. User-provided region where the Cloud Run service is hosted. Defaults to `us-central1` if not supplied.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Optional. User-provided region where the Cloud Run service is hosted. Defaults to `us-central1` if not supplied.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * User-defined ID of the Cloud Run service.
     * 
     */
    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    /**
     * @return User-defined ID of the Cloud Run service.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    private HostingVersionConfigRewriteRunArgs() {}

    private HostingVersionConfigRewriteRunArgs(HostingVersionConfigRewriteRunArgs $) {
        this.region = $.region;
        this.serviceId = $.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostingVersionConfigRewriteRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostingVersionConfigRewriteRunArgs $;

        public Builder() {
            $ = new HostingVersionConfigRewriteRunArgs();
        }

        public Builder(HostingVersionConfigRewriteRunArgs defaults) {
            $ = new HostingVersionConfigRewriteRunArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param region Optional. User-provided region where the Cloud Run service is hosted. Defaults to `us-central1` if not supplied.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Optional. User-provided region where the Cloud Run service is hosted. Defaults to `us-central1` if not supplied.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param serviceId User-defined ID of the Cloud Run service.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId User-defined ID of the Cloud Run service.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        public HostingVersionConfigRewriteRunArgs build() {
            $.serviceId = Objects.requireNonNull($.serviceId, "expected parameter 'serviceId' to be non-null");
            return $;
        }
    }

}