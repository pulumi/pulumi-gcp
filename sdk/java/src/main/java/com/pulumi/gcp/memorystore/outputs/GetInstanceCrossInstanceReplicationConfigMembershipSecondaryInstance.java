// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.memorystore.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceCrossInstanceReplicationConfigMembershipSecondaryInstance {
    /**
     * @return The full resource path of the secondary instance in the format: projects/{project}/locations/{region}/instance/{instance-id}
     * 
     */
    private String instance;
    /**
     * @return The unique id of the secondary instance.
     * 
     */
    private String uid;

    private GetInstanceCrossInstanceReplicationConfigMembershipSecondaryInstance() {}
    /**
     * @return The full resource path of the secondary instance in the format: projects/{project}/locations/{region}/instance/{instance-id}
     * 
     */
    public String instance() {
        return this.instance;
    }
    /**
     * @return The unique id of the secondary instance.
     * 
     */
    public String uid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceCrossInstanceReplicationConfigMembershipSecondaryInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String instance;
        private String uid;
        public Builder() {}
        public Builder(GetInstanceCrossInstanceReplicationConfigMembershipSecondaryInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.uid = defaults.uid;
        }

        @CustomType.Setter
        public Builder instance(String instance) {
            if (instance == null) {
              throw new MissingRequiredPropertyException("GetInstanceCrossInstanceReplicationConfigMembershipSecondaryInstance", "instance");
            }
            this.instance = instance;
            return this;
        }
        @CustomType.Setter
        public Builder uid(String uid) {
            if (uid == null) {
              throw new MissingRequiredPropertyException("GetInstanceCrossInstanceReplicationConfigMembershipSecondaryInstance", "uid");
            }
            this.uid = uid;
            return this;
        }
        public GetInstanceCrossInstanceReplicationConfigMembershipSecondaryInstance build() {
            final var _resultValue = new GetInstanceCrossInstanceReplicationConfigMembershipSecondaryInstance();
            _resultValue.instance = instance;
            _resultValue.uid = uid;
            return _resultValue;
        }
    }
}
