// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.vertex.outputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceFeatureGroup;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AiFeatureOnlineStoreFeatureviewFeatureRegistrySource {
    /**
     * @return List of features that need to be synced to Online Store.
     * Structure is documented below.
     * 
     */
    private List<AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceFeatureGroup> featureGroups;

    private AiFeatureOnlineStoreFeatureviewFeatureRegistrySource() {}
    /**
     * @return List of features that need to be synced to Online Store.
     * Structure is documented below.
     * 
     */
    public List<AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceFeatureGroup> featureGroups() {
        return this.featureGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiFeatureOnlineStoreFeatureviewFeatureRegistrySource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceFeatureGroup> featureGroups;
        public Builder() {}
        public Builder(AiFeatureOnlineStoreFeatureviewFeatureRegistrySource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureGroups = defaults.featureGroups;
        }

        @CustomType.Setter
        public Builder featureGroups(List<AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceFeatureGroup> featureGroups) {
            if (featureGroups == null) {
              throw new MissingRequiredPropertyException("AiFeatureOnlineStoreFeatureviewFeatureRegistrySource", "featureGroups");
            }
            this.featureGroups = featureGroups;
            return this;
        }
        public Builder featureGroups(AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceFeatureGroup... featureGroups) {
            return featureGroups(List.of(featureGroups));
        }
        public AiFeatureOnlineStoreFeatureviewFeatureRegistrySource build() {
            final var _resultValue = new AiFeatureOnlineStoreFeatureviewFeatureRegistrySource();
            _resultValue.featureGroups = featureGroups;
            return _resultValue;
        }
    }
}
