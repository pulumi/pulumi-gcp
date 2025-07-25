// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkconnectivity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionalEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionalEndpointArgs Empty = new RegionalEndpointArgs();

    /**
     * The access type of this regional endpoint. This field is reflected in the PSC Forwarding Rule configuration to enable global access.
     * Possible values are: `GLOBAL`, `REGIONAL`.
     * 
     */
    @Import(name="accessType", required=true)
    private Output<String> accessType;

    /**
     * @return The access type of this regional endpoint. This field is reflected in the PSC Forwarding Rule configuration to enable global access.
     * Possible values are: `GLOBAL`, `REGIONAL`.
     * 
     */
    public Output<String> accessType() {
        return this.accessType;
    }

    /**
     * The IP Address of the Regional Endpoint. When no address is provided, an IP from the subnetwork is allocated. Use one of the following formats: * IPv4 address as in `10.0.0.1` * Address resource URI as in `projects/{project}/regions/{region}/addresses/{address_name}`
     * &gt; **Note:** This field accepts both a reference to a Compute Address resource, which is the resource name of which format is given in the description, and IP literal value. If the user chooses to input a reserved address value; they need to make sure that the reserved address is in IPv4 version, its purpose is GCE_ENDPOINT, its type is INTERNAL and its status is RESERVED. If the user chooses to input an IP literal, they need to make sure that it&#39;s a valid IPv4 address (x.x.x.x) within the subnetwork.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The IP Address of the Regional Endpoint. When no address is provided, an IP from the subnetwork is allocated. Use one of the following formats: * IPv4 address as in `10.0.0.1` * Address resource URI as in `projects/{project}/regions/{region}/addresses/{address_name}`
     * &gt; **Note:** This field accepts both a reference to a Compute Address resource, which is the resource name of which format is given in the description, and IP literal value. If the user chooses to input a reserved address value; they need to make sure that the reserved address is in IPv4 version, its purpose is GCE_ENDPOINT, its type is INTERNAL and its status is RESERVED. If the user chooses to input an IP literal, they need to make sure that it&#39;s a valid IPv4 address (x.x.x.x) within the subnetwork.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * A description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User-defined labels.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-defined labels.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location of the RegionalEndpoint.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location of the RegionalEndpoint.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The name of the RegionalEndpoint.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the RegionalEndpoint.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the VPC network for this private regional endpoint. Format: `projects/{project}/global/networks/{network}`
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return The name of the VPC network for this private regional endpoint. Format: `projects/{project}/global/networks/{network}`
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
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
     * The name of the subnetwork from which the IP address will be allocated. Format: `projects/{project}/regions/{region}/subnetworks/{subnetwork}`
     * 
     */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    /**
     * @return The name of the subnetwork from which the IP address will be allocated. Format: `projects/{project}/regions/{region}/subnetworks/{subnetwork}`
     * 
     */
    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    /**
     * The service endpoint this private regional endpoint connects to. Format: `{apiname}.{region}.rep.googleapis.com` Example: \&#34;cloudkms.us-central1.rep.googleapis.com\&#34;.
     * 
     */
    @Import(name="targetGoogleApi", required=true)
    private Output<String> targetGoogleApi;

    /**
     * @return The service endpoint this private regional endpoint connects to. Format: `{apiname}.{region}.rep.googleapis.com` Example: \&#34;cloudkms.us-central1.rep.googleapis.com\&#34;.
     * 
     */
    public Output<String> targetGoogleApi() {
        return this.targetGoogleApi;
    }

    private RegionalEndpointArgs() {}

    private RegionalEndpointArgs(RegionalEndpointArgs $) {
        this.accessType = $.accessType;
        this.address = $.address;
        this.description = $.description;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.network = $.network;
        this.project = $.project;
        this.subnetwork = $.subnetwork;
        this.targetGoogleApi = $.targetGoogleApi;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionalEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionalEndpointArgs $;

        public Builder() {
            $ = new RegionalEndpointArgs();
        }

        public Builder(RegionalEndpointArgs defaults) {
            $ = new RegionalEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessType The access type of this regional endpoint. This field is reflected in the PSC Forwarding Rule configuration to enable global access.
         * Possible values are: `GLOBAL`, `REGIONAL`.
         * 
         * @return builder
         * 
         */
        public Builder accessType(Output<String> accessType) {
            $.accessType = accessType;
            return this;
        }

        /**
         * @param accessType The access type of this regional endpoint. This field is reflected in the PSC Forwarding Rule configuration to enable global access.
         * Possible values are: `GLOBAL`, `REGIONAL`.
         * 
         * @return builder
         * 
         */
        public Builder accessType(String accessType) {
            return accessType(Output.of(accessType));
        }

        /**
         * @param address The IP Address of the Regional Endpoint. When no address is provided, an IP from the subnetwork is allocated. Use one of the following formats: * IPv4 address as in `10.0.0.1` * Address resource URI as in `projects/{project}/regions/{region}/addresses/{address_name}`
         * &gt; **Note:** This field accepts both a reference to a Compute Address resource, which is the resource name of which format is given in the description, and IP literal value. If the user chooses to input a reserved address value; they need to make sure that the reserved address is in IPv4 version, its purpose is GCE_ENDPOINT, its type is INTERNAL and its status is RESERVED. If the user chooses to input an IP literal, they need to make sure that it&#39;s a valid IPv4 address (x.x.x.x) within the subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The IP Address of the Regional Endpoint. When no address is provided, an IP from the subnetwork is allocated. Use one of the following formats: * IPv4 address as in `10.0.0.1` * Address resource URI as in `projects/{project}/regions/{region}/addresses/{address_name}`
         * &gt; **Note:** This field accepts both a reference to a Compute Address resource, which is the resource name of which format is given in the description, and IP literal value. If the user chooses to input a reserved address value; they need to make sure that the reserved address is in IPv4 version, its purpose is GCE_ENDPOINT, its type is INTERNAL and its status is RESERVED. If the user chooses to input an IP literal, they need to make sure that it&#39;s a valid IPv4 address (x.x.x.x) within the subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param description A description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels User-defined labels.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The location of the RegionalEndpoint.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the RegionalEndpoint.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the RegionalEndpoint.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the RegionalEndpoint.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network The name of the VPC network for this private regional endpoint. Format: `projects/{project}/global/networks/{network}`
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The name of the VPC network for this private regional endpoint. Format: `projects/{project}/global/networks/{network}`
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
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
         * @param subnetwork The name of the subnetwork from which the IP address will be allocated. Format: `projects/{project}/regions/{region}/subnetworks/{subnetwork}`
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param subnetwork The name of the subnetwork from which the IP address will be allocated. Format: `projects/{project}/regions/{region}/subnetworks/{subnetwork}`
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        /**
         * @param targetGoogleApi The service endpoint this private regional endpoint connects to. Format: `{apiname}.{region}.rep.googleapis.com` Example: \&#34;cloudkms.us-central1.rep.googleapis.com\&#34;.
         * 
         * @return builder
         * 
         */
        public Builder targetGoogleApi(Output<String> targetGoogleApi) {
            $.targetGoogleApi = targetGoogleApi;
            return this;
        }

        /**
         * @param targetGoogleApi The service endpoint this private regional endpoint connects to. Format: `{apiname}.{region}.rep.googleapis.com` Example: \&#34;cloudkms.us-central1.rep.googleapis.com\&#34;.
         * 
         * @return builder
         * 
         */
        public Builder targetGoogleApi(String targetGoogleApi) {
            return targetGoogleApi(Output.of(targetGoogleApi));
        }

        public RegionalEndpointArgs build() {
            if ($.accessType == null) {
                throw new MissingRequiredPropertyException("RegionalEndpointArgs", "accessType");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("RegionalEndpointArgs", "location");
            }
            if ($.targetGoogleApi == null) {
                throw new MissingRequiredPropertyException("RegionalEndpointArgs", "targetGoogleApi");
            }
            return $;
        }
    }

}
