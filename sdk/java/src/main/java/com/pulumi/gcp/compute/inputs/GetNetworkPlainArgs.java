// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkPlainArgs Empty = new GetNetworkPlainArgs();

    /**
     * The name of the network.
     * 
     * ***
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the network.
     * 
     * ***
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * A full or partial URL of the network profile to apply to this network.
     * 
     */
    @Import(name="networkProfile")
    private @Nullable String networkProfile;

    /**
     * @return A full or partial URL of the network profile to apply to this network.
     * 
     */
    public Optional<String> networkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetNetworkPlainArgs() {}

    private GetNetworkPlainArgs(GetNetworkPlainArgs $) {
        this.name = $.name;
        this.networkProfile = $.networkProfile;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkPlainArgs $;

        public Builder() {
            $ = new GetNetworkPlainArgs();
        }

        public Builder(GetNetworkPlainArgs defaults) {
            $ = new GetNetworkPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the network.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param networkProfile A full or partial URL of the network profile to apply to this network.
         * 
         * @return builder
         * 
         */
        public Builder networkProfile(@Nullable String networkProfile) {
            $.networkProfile = networkProfile;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetNetworkPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetNetworkPlainArgs", "name");
            }
            return $;
        }
    }

}
