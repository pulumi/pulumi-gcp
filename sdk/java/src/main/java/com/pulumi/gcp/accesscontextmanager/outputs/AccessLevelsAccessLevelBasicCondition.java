// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.accesscontextmanager.outputs.AccessLevelsAccessLevelBasicConditionDevicePolicy;
import com.pulumi.gcp.accesscontextmanager.outputs.AccessLevelsAccessLevelBasicConditionVpcNetworkSource;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessLevelsAccessLevelBasicCondition {
    /**
     * @return Device specific restrictions, all restrictions must hold for
     * the Condition to be true. If not specified, all devices are
     * allowed.
     * Structure is documented below.
     * 
     */
    private @Nullable AccessLevelsAccessLevelBasicConditionDevicePolicy devicePolicy;
    /**
     * @return A list of CIDR block IP subnetwork specification. May be IPv4
     * or IPv6.
     * Note that for a CIDR IP address block, the specified IP address
     * portion must be properly truncated (i.e. all the host bits must
     * be zero) or the input is considered malformed. For example,
     * &#34;192.0.2.0/24&#34; is accepted but &#34;192.0.2.1/24&#34; is not. Similarly,
     * for IPv6, &#34;2001:db8::/32&#34; is accepted whereas &#34;2001:db8::1/32&#34;
     * is not. The originating IP of a request must be in one of the
     * listed subnets in order for this Condition to be true.
     * If empty, all IP addresses are allowed.
     * 
     */
    private @Nullable List<String> ipSubnetworks;
    /**
     * @return An allowed list of members (users, service accounts).
     * Using groups is not supported yet.
     * The signed-in user originating the request must be a part of one
     * of the provided members. If not specified, a request may come
     * from any user (logged in/not logged in, not present in any
     * groups, etc.).
     * Formats: `user:{emailid}`, `serviceAccount:{emailid}`
     * 
     */
    private @Nullable List<String> members;
    /**
     * @return Whether to negate the Condition. If true, the Condition becomes
     * a NAND over its non-empty fields, each field must be false for
     * the Condition overall to be satisfied. Defaults to false.
     * 
     */
    private @Nullable Boolean negate;
    /**
     * @return The request must originate from one of the provided
     * countries/regions.
     * Format: A valid ISO 3166-1 alpha-2 code.
     * 
     */
    private @Nullable List<String> regions;
    /**
     * @return A list of other access levels defined in the same Policy,
     * referenced by resource name. Referencing an AccessLevel which
     * does not exist is an error. All access levels listed must be
     * granted for the Condition to be true.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     * 
     */
    private @Nullable List<String> requiredAccessLevels;
    /**
     * @return The request must originate from one of the provided VPC networks in Google Cloud. Cannot specify this field together with `ip_subnetworks`.
     * Structure is documented below.
     * 
     */
    private @Nullable List<AccessLevelsAccessLevelBasicConditionVpcNetworkSource> vpcNetworkSources;

    private AccessLevelsAccessLevelBasicCondition() {}
    /**
     * @return Device specific restrictions, all restrictions must hold for
     * the Condition to be true. If not specified, all devices are
     * allowed.
     * Structure is documented below.
     * 
     */
    public Optional<AccessLevelsAccessLevelBasicConditionDevicePolicy> devicePolicy() {
        return Optional.ofNullable(this.devicePolicy);
    }
    /**
     * @return A list of CIDR block IP subnetwork specification. May be IPv4
     * or IPv6.
     * Note that for a CIDR IP address block, the specified IP address
     * portion must be properly truncated (i.e. all the host bits must
     * be zero) or the input is considered malformed. For example,
     * &#34;192.0.2.0/24&#34; is accepted but &#34;192.0.2.1/24&#34; is not. Similarly,
     * for IPv6, &#34;2001:db8::/32&#34; is accepted whereas &#34;2001:db8::1/32&#34;
     * is not. The originating IP of a request must be in one of the
     * listed subnets in order for this Condition to be true.
     * If empty, all IP addresses are allowed.
     * 
     */
    public List<String> ipSubnetworks() {
        return this.ipSubnetworks == null ? List.of() : this.ipSubnetworks;
    }
    /**
     * @return An allowed list of members (users, service accounts).
     * Using groups is not supported yet.
     * The signed-in user originating the request must be a part of one
     * of the provided members. If not specified, a request may come
     * from any user (logged in/not logged in, not present in any
     * groups, etc.).
     * Formats: `user:{emailid}`, `serviceAccount:{emailid}`
     * 
     */
    public List<String> members() {
        return this.members == null ? List.of() : this.members;
    }
    /**
     * @return Whether to negate the Condition. If true, the Condition becomes
     * a NAND over its non-empty fields, each field must be false for
     * the Condition overall to be satisfied. Defaults to false.
     * 
     */
    public Optional<Boolean> negate() {
        return Optional.ofNullable(this.negate);
    }
    /**
     * @return The request must originate from one of the provided
     * countries/regions.
     * Format: A valid ISO 3166-1 alpha-2 code.
     * 
     */
    public List<String> regions() {
        return this.regions == null ? List.of() : this.regions;
    }
    /**
     * @return A list of other access levels defined in the same Policy,
     * referenced by resource name. Referencing an AccessLevel which
     * does not exist is an error. All access levels listed must be
     * granted for the Condition to be true.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     * 
     */
    public List<String> requiredAccessLevels() {
        return this.requiredAccessLevels == null ? List.of() : this.requiredAccessLevels;
    }
    /**
     * @return The request must originate from one of the provided VPC networks in Google Cloud. Cannot specify this field together with `ip_subnetworks`.
     * Structure is documented below.
     * 
     */
    public List<AccessLevelsAccessLevelBasicConditionVpcNetworkSource> vpcNetworkSources() {
        return this.vpcNetworkSources == null ? List.of() : this.vpcNetworkSources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelsAccessLevelBasicCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AccessLevelsAccessLevelBasicConditionDevicePolicy devicePolicy;
        private @Nullable List<String> ipSubnetworks;
        private @Nullable List<String> members;
        private @Nullable Boolean negate;
        private @Nullable List<String> regions;
        private @Nullable List<String> requiredAccessLevels;
        private @Nullable List<AccessLevelsAccessLevelBasicConditionVpcNetworkSource> vpcNetworkSources;
        public Builder() {}
        public Builder(AccessLevelsAccessLevelBasicCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devicePolicy = defaults.devicePolicy;
    	      this.ipSubnetworks = defaults.ipSubnetworks;
    	      this.members = defaults.members;
    	      this.negate = defaults.negate;
    	      this.regions = defaults.regions;
    	      this.requiredAccessLevels = defaults.requiredAccessLevels;
    	      this.vpcNetworkSources = defaults.vpcNetworkSources;
        }

        @CustomType.Setter
        public Builder devicePolicy(@Nullable AccessLevelsAccessLevelBasicConditionDevicePolicy devicePolicy) {

            this.devicePolicy = devicePolicy;
            return this;
        }
        @CustomType.Setter
        public Builder ipSubnetworks(@Nullable List<String> ipSubnetworks) {

            this.ipSubnetworks = ipSubnetworks;
            return this;
        }
        public Builder ipSubnetworks(String... ipSubnetworks) {
            return ipSubnetworks(List.of(ipSubnetworks));
        }
        @CustomType.Setter
        public Builder members(@Nullable List<String> members) {

            this.members = members;
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        @CustomType.Setter
        public Builder negate(@Nullable Boolean negate) {

            this.negate = negate;
            return this;
        }
        @CustomType.Setter
        public Builder regions(@Nullable List<String> regions) {

            this.regions = regions;
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }
        @CustomType.Setter
        public Builder requiredAccessLevels(@Nullable List<String> requiredAccessLevels) {

            this.requiredAccessLevels = requiredAccessLevels;
            return this;
        }
        public Builder requiredAccessLevels(String... requiredAccessLevels) {
            return requiredAccessLevels(List.of(requiredAccessLevels));
        }
        @CustomType.Setter
        public Builder vpcNetworkSources(@Nullable List<AccessLevelsAccessLevelBasicConditionVpcNetworkSource> vpcNetworkSources) {

            this.vpcNetworkSources = vpcNetworkSources;
            return this;
        }
        public Builder vpcNetworkSources(AccessLevelsAccessLevelBasicConditionVpcNetworkSource... vpcNetworkSources) {
            return vpcNetworkSources(List.of(vpcNetworkSources));
        }
        public AccessLevelsAccessLevelBasicCondition build() {
            final var _resultValue = new AccessLevelsAccessLevelBasicCondition();
            _resultValue.devicePolicy = devicePolicy;
            _resultValue.ipSubnetworks = ipSubnetworks;
            _resultValue.members = members;
            _resultValue.negate = negate;
            _resultValue.regions = regions;
            _resultValue.requiredAccessLevels = requiredAccessLevels;
            _resultValue.vpcNetworkSources = vpcNetworkSources;
            return _resultValue;
        }
    }
}
