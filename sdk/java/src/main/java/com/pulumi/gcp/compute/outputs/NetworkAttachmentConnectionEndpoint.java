// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkAttachmentConnectionEndpoint {
    /**
     * @return (Output)
     * The IPv4 address assigned to the producer instance network interface. This value will be a range in case of Serverless.
     * 
     */
    private @Nullable String ipAddress;
    /**
     * @return (Output)
     * The project id or number of the interface to which the IP was assigned.
     * 
     */
    private @Nullable String projectIdOrNum;
    /**
     * @return (Output)
     * Alias IP ranges from the same subnetwork.
     * 
     */
    private @Nullable String secondaryIpCidrRanges;
    /**
     * @return (Output)
     * The status of a connected endpoint to this network attachment.
     * 
     */
    private @Nullable String status;
    /**
     * @return (Output)
     * The subnetwork used to assign the IP to the producer instance network interface.
     * 
     */
    private @Nullable String subnetwork;

    private NetworkAttachmentConnectionEndpoint() {}
    /**
     * @return (Output)
     * The IPv4 address assigned to the producer instance network interface. This value will be a range in case of Serverless.
     * 
     */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * @return (Output)
     * The project id or number of the interface to which the IP was assigned.
     * 
     */
    public Optional<String> projectIdOrNum() {
        return Optional.ofNullable(this.projectIdOrNum);
    }
    /**
     * @return (Output)
     * Alias IP ranges from the same subnetwork.
     * 
     */
    public Optional<String> secondaryIpCidrRanges() {
        return Optional.ofNullable(this.secondaryIpCidrRanges);
    }
    /**
     * @return (Output)
     * The status of a connected endpoint to this network attachment.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return (Output)
     * The subnetwork used to assign the IP to the producer instance network interface.
     * 
     */
    public Optional<String> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkAttachmentConnectionEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String ipAddress;
        private @Nullable String projectIdOrNum;
        private @Nullable String secondaryIpCidrRanges;
        private @Nullable String status;
        private @Nullable String subnetwork;
        public Builder() {}
        public Builder(NetworkAttachmentConnectionEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.projectIdOrNum = defaults.projectIdOrNum;
    	      this.secondaryIpCidrRanges = defaults.secondaryIpCidrRanges;
    	      this.status = defaults.status;
    	      this.subnetwork = defaults.subnetwork;
        }

        @CustomType.Setter
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder projectIdOrNum(@Nullable String projectIdOrNum) {
            this.projectIdOrNum = projectIdOrNum;
            return this;
        }
        @CustomType.Setter
        public Builder secondaryIpCidrRanges(@Nullable String secondaryIpCidrRanges) {
            this.secondaryIpCidrRanges = secondaryIpCidrRanges;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }
        public NetworkAttachmentConnectionEndpoint build() {
            final var o = new NetworkAttachmentConnectionEndpoint();
            o.ipAddress = ipAddress;
            o.projectIdOrNum = projectIdOrNum;
            o.secondaryIpCidrRanges = secondaryIpCidrRanges;
            o.status = status;
            o.subnetwork = subnetwork;
            return o;
        }
    }
}