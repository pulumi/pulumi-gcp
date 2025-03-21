// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubnetworkSecondaryIpRange {
    /**
     * @return The range of IP addresses belonging to this subnetwork secondary
     * range. Provide this property when you create the subnetwork.
     * Ranges must be unique and non-overlapping with all primary and
     * secondary IP ranges within a network. Only IPv4 is supported.
     * Field is optional when `reserved_internal_range` is defined, otherwise required.
     * 
     */
    private @Nullable String ipCidrRange;
    /**
     * @return The name associated with this subnetwork secondary range, used
     * when adding an alias IP range to a VM instance. The name must
     * be 1-63 characters long, and comply with RFC1035. The name
     * must be unique within the subnetwork.
     * 
     */
    private String rangeName;
    /**
     * @return The ID of the reserved internal range. Must be prefixed with `networkconnectivity.googleapis.com`
     * E.g. `networkconnectivity.googleapis.com/projects/{project}/locations/global/internalRanges/{rangeId}`
     * 
     */
    private @Nullable String reservedInternalRange;

    private SubnetworkSecondaryIpRange() {}
    /**
     * @return The range of IP addresses belonging to this subnetwork secondary
     * range. Provide this property when you create the subnetwork.
     * Ranges must be unique and non-overlapping with all primary and
     * secondary IP ranges within a network. Only IPv4 is supported.
     * Field is optional when `reserved_internal_range` is defined, otherwise required.
     * 
     */
    public Optional<String> ipCidrRange() {
        return Optional.ofNullable(this.ipCidrRange);
    }
    /**
     * @return The name associated with this subnetwork secondary range, used
     * when adding an alias IP range to a VM instance. The name must
     * be 1-63 characters long, and comply with RFC1035. The name
     * must be unique within the subnetwork.
     * 
     */
    public String rangeName() {
        return this.rangeName;
    }
    /**
     * @return The ID of the reserved internal range. Must be prefixed with `networkconnectivity.googleapis.com`
     * E.g. `networkconnectivity.googleapis.com/projects/{project}/locations/global/internalRanges/{rangeId}`
     * 
     */
    public Optional<String> reservedInternalRange() {
        return Optional.ofNullable(this.reservedInternalRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkSecondaryIpRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String ipCidrRange;
        private String rangeName;
        private @Nullable String reservedInternalRange;
        public Builder() {}
        public Builder(SubnetworkSecondaryIpRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.rangeName = defaults.rangeName;
    	      this.reservedInternalRange = defaults.reservedInternalRange;
        }

        @CustomType.Setter
        public Builder ipCidrRange(@Nullable String ipCidrRange) {

            this.ipCidrRange = ipCidrRange;
            return this;
        }
        @CustomType.Setter
        public Builder rangeName(String rangeName) {
            if (rangeName == null) {
              throw new MissingRequiredPropertyException("SubnetworkSecondaryIpRange", "rangeName");
            }
            this.rangeName = rangeName;
            return this;
        }
        @CustomType.Setter
        public Builder reservedInternalRange(@Nullable String reservedInternalRange) {

            this.reservedInternalRange = reservedInternalRange;
            return this;
        }
        public SubnetworkSecondaryIpRange build() {
            final var _resultValue = new SubnetworkSecondaryIpRange();
            _resultValue.ipCidrRange = ipCidrRange;
            _resultValue.rangeName = rangeName;
            _resultValue.reservedInternalRange = reservedInternalRange;
            return _resultValue;
        }
    }
}
