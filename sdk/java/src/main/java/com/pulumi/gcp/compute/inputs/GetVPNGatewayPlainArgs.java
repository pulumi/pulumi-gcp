// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVPNGatewayPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVPNGatewayPlainArgs Empty = new GetVPNGatewayPlainArgs();

    /**
     * The name of the VPN gateway.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the VPN gateway.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region in which the resource belongs. If it
     * is not provided, the project region is used.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return The region in which the resource belongs. If it
     * is not provided, the project region is used.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetVPNGatewayPlainArgs() {}

    private GetVPNGatewayPlainArgs(GetVPNGatewayPlainArgs $) {
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVPNGatewayPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVPNGatewayPlainArgs $;

        public Builder() {
            $ = new GetVPNGatewayPlainArgs();
        }

        public Builder(GetVPNGatewayPlainArgs defaults) {
            $ = new GetVPNGatewayPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the VPN gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param region The region in which the resource belongs. If it
         * is not provided, the project region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetVPNGatewayPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}