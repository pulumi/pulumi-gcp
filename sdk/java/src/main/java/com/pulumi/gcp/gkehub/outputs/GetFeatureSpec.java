// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.gkehub.outputs.GetFeatureSpecClusterupgrade;
import com.pulumi.gcp.gkehub.outputs.GetFeatureSpecFleetobservability;
import com.pulumi.gcp.gkehub.outputs.GetFeatureSpecMulticlusteringress;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFeatureSpec {
    /**
     * @return Clusterupgrade feature spec.
     * 
     */
    private List<GetFeatureSpecClusterupgrade> clusterupgrades;
    /**
     * @return Fleet Observability feature spec.
     * 
     */
    private List<GetFeatureSpecFleetobservability> fleetobservabilities;
    /**
     * @return Multicluster Ingress-specific spec.
     * 
     */
    private List<GetFeatureSpecMulticlusteringress> multiclusteringresses;

    private GetFeatureSpec() {}
    /**
     * @return Clusterupgrade feature spec.
     * 
     */
    public List<GetFeatureSpecClusterupgrade> clusterupgrades() {
        return this.clusterupgrades;
    }
    /**
     * @return Fleet Observability feature spec.
     * 
     */
    public List<GetFeatureSpecFleetobservability> fleetobservabilities() {
        return this.fleetobservabilities;
    }
    /**
     * @return Multicluster Ingress-specific spec.
     * 
     */
    public List<GetFeatureSpecMulticlusteringress> multiclusteringresses() {
        return this.multiclusteringresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFeatureSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetFeatureSpecClusterupgrade> clusterupgrades;
        private List<GetFeatureSpecFleetobservability> fleetobservabilities;
        private List<GetFeatureSpecMulticlusteringress> multiclusteringresses;
        public Builder() {}
        public Builder(GetFeatureSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterupgrades = defaults.clusterupgrades;
    	      this.fleetobservabilities = defaults.fleetobservabilities;
    	      this.multiclusteringresses = defaults.multiclusteringresses;
        }

        @CustomType.Setter
        public Builder clusterupgrades(List<GetFeatureSpecClusterupgrade> clusterupgrades) {
            if (clusterupgrades == null) {
              throw new MissingRequiredPropertyException("GetFeatureSpec", "clusterupgrades");
            }
            this.clusterupgrades = clusterupgrades;
            return this;
        }
        public Builder clusterupgrades(GetFeatureSpecClusterupgrade... clusterupgrades) {
            return clusterupgrades(List.of(clusterupgrades));
        }
        @CustomType.Setter
        public Builder fleetobservabilities(List<GetFeatureSpecFleetobservability> fleetobservabilities) {
            if (fleetobservabilities == null) {
              throw new MissingRequiredPropertyException("GetFeatureSpec", "fleetobservabilities");
            }
            this.fleetobservabilities = fleetobservabilities;
            return this;
        }
        public Builder fleetobservabilities(GetFeatureSpecFleetobservability... fleetobservabilities) {
            return fleetobservabilities(List.of(fleetobservabilities));
        }
        @CustomType.Setter
        public Builder multiclusteringresses(List<GetFeatureSpecMulticlusteringress> multiclusteringresses) {
            if (multiclusteringresses == null) {
              throw new MissingRequiredPropertyException("GetFeatureSpec", "multiclusteringresses");
            }
            this.multiclusteringresses = multiclusteringresses;
            return this;
        }
        public Builder multiclusteringresses(GetFeatureSpecMulticlusteringress... multiclusteringresses) {
            return multiclusteringresses(List.of(multiclusteringresses));
        }
        public GetFeatureSpec build() {
            final var _resultValue = new GetFeatureSpec();
            _resultValue.clusterupgrades = clusterupgrades;
            _resultValue.fleetobservabilities = fleetobservabilities;
            _resultValue.multiclusteringresses = multiclusteringresses;
            return _resultValue;
        }
    }
}
