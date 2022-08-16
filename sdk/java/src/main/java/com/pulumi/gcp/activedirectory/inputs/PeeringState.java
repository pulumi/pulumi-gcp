// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.activedirectory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PeeringState extends com.pulumi.resources.ResourceArgs {

    public static final PeeringState Empty = new PeeringState();

    /**
     * The full names of the Google Compute Engine networks to which the instance is connected. Caller needs to make sure that CIDR subnets do not overlap between networks, else peering creation will fail.
     * 
     */
    @Import(name="authorizedNetwork")
    private @Nullable Output<String> authorizedNetwork;

    /**
     * @return The full names of the Google Compute Engine networks to which the instance is connected. Caller needs to make sure that CIDR subnets do not overlap between networks, else peering creation will fail.
     * 
     */
    public Optional<Output<String>> authorizedNetwork() {
        return Optional.ofNullable(this.authorizedNetwork);
    }

    /**
     * Full domain resource path for the Managed AD Domain involved in peering. The resource path should be in the form projects/{projectId}/locations/global/domains/{domainName}
     * 
     */
    @Import(name="domainResource")
    private @Nullable Output<String> domainResource;

    /**
     * @return Full domain resource path for the Managed AD Domain involved in peering. The resource path should be in the form projects/{projectId}/locations/global/domains/{domainName}
     * 
     */
    public Optional<Output<String>> domainResource() {
        return Optional.ofNullable(this.domainResource);
    }

    /**
     * Resource labels that can contain user-provided metadata
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Resource labels that can contain user-provided metadata
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Unique name of the peering in this scope including projects and location using the form:
     * projects/{projectId}/locations/global/peerings/{peeringId}.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique name of the peering in this scope including projects and location using the form:
     * projects/{projectId}/locations/global/peerings/{peeringId}.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * - 
     * (Required)
     * 
     */
    @Import(name="peeringId")
    private @Nullable Output<String> peeringId;

    /**
     * @return -
     * (Required)
     * 
     */
    public Optional<Output<String>> peeringId() {
        return Optional.ofNullable(this.peeringId);
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
     * The current state of this Peering.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The current state of this Peering.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Additional information about the current status of this peering, if available.
     * 
     */
    @Import(name="statusMessage")
    private @Nullable Output<String> statusMessage;

    /**
     * @return Additional information about the current status of this peering, if available.
     * 
     */
    public Optional<Output<String>> statusMessage() {
        return Optional.ofNullable(this.statusMessage);
    }

    private PeeringState() {}

    private PeeringState(PeeringState $) {
        this.authorizedNetwork = $.authorizedNetwork;
        this.domainResource = $.domainResource;
        this.labels = $.labels;
        this.name = $.name;
        this.peeringId = $.peeringId;
        this.project = $.project;
        this.status = $.status;
        this.statusMessage = $.statusMessage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PeeringState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PeeringState $;

        public Builder() {
            $ = new PeeringState();
        }

        public Builder(PeeringState defaults) {
            $ = new PeeringState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizedNetwork The full names of the Google Compute Engine networks to which the instance is connected. Caller needs to make sure that CIDR subnets do not overlap between networks, else peering creation will fail.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetwork(@Nullable Output<String> authorizedNetwork) {
            $.authorizedNetwork = authorizedNetwork;
            return this;
        }

        /**
         * @param authorizedNetwork The full names of the Google Compute Engine networks to which the instance is connected. Caller needs to make sure that CIDR subnets do not overlap between networks, else peering creation will fail.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetwork(String authorizedNetwork) {
            return authorizedNetwork(Output.of(authorizedNetwork));
        }

        /**
         * @param domainResource Full domain resource path for the Managed AD Domain involved in peering. The resource path should be in the form projects/{projectId}/locations/global/domains/{domainName}
         * 
         * @return builder
         * 
         */
        public Builder domainResource(@Nullable Output<String> domainResource) {
            $.domainResource = domainResource;
            return this;
        }

        /**
         * @param domainResource Full domain resource path for the Managed AD Domain involved in peering. The resource path should be in the form projects/{projectId}/locations/global/domains/{domainName}
         * 
         * @return builder
         * 
         */
        public Builder domainResource(String domainResource) {
            return domainResource(Output.of(domainResource));
        }

        /**
         * @param labels Resource labels that can contain user-provided metadata
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Resource labels that can contain user-provided metadata
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Unique name of the peering in this scope including projects and location using the form:
         * projects/{projectId}/locations/global/peerings/{peeringId}.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique name of the peering in this scope including projects and location using the form:
         * projects/{projectId}/locations/global/peerings/{peeringId}.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param peeringId -
         * (Required)
         * 
         * @return builder
         * 
         */
        public Builder peeringId(@Nullable Output<String> peeringId) {
            $.peeringId = peeringId;
            return this;
        }

        /**
         * @param peeringId -
         * (Required)
         * 
         * @return builder
         * 
         */
        public Builder peeringId(String peeringId) {
            return peeringId(Output.of(peeringId));
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
         * @param status The current state of this Peering.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The current state of this Peering.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param statusMessage Additional information about the current status of this peering, if available.
         * 
         * @return builder
         * 
         */
        public Builder statusMessage(@Nullable Output<String> statusMessage) {
            $.statusMessage = statusMessage;
            return this;
        }

        /**
         * @param statusMessage Additional information about the current status of this peering, if available.
         * 
         * @return builder
         * 
         */
        public Builder statusMessage(String statusMessage) {
            return statusMessage(Output.of(statusMessage));
        }

        public PeeringState build() {
            return $;
        }
    }

}