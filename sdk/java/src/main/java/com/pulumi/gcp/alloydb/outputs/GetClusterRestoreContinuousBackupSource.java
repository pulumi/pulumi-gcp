// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterRestoreContinuousBackupSource {
    /**
     * @return The name of the source cluster that this cluster is restored from.
     * 
     */
    private String cluster;
    /**
     * @return The point in time that this cluster is restored to, in RFC 3339 format.
     * 
     */
    private String pointInTime;

    private GetClusterRestoreContinuousBackupSource() {}
    /**
     * @return The name of the source cluster that this cluster is restored from.
     * 
     */
    public String cluster() {
        return this.cluster;
    }
    /**
     * @return The point in time that this cluster is restored to, in RFC 3339 format.
     * 
     */
    public String pointInTime() {
        return this.pointInTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRestoreContinuousBackupSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cluster;
        private String pointInTime;
        public Builder() {}
        public Builder(GetClusterRestoreContinuousBackupSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.pointInTime = defaults.pointInTime;
        }

        @CustomType.Setter
        public Builder cluster(String cluster) {
            if (cluster == null) {
              throw new MissingRequiredPropertyException("GetClusterRestoreContinuousBackupSource", "cluster");
            }
            this.cluster = cluster;
            return this;
        }
        @CustomType.Setter
        public Builder pointInTime(String pointInTime) {
            if (pointInTime == null) {
              throw new MissingRequiredPropertyException("GetClusterRestoreContinuousBackupSource", "pointInTime");
            }
            this.pointInTime = pointInTime;
            return this;
        }
        public GetClusterRestoreContinuousBackupSource build() {
            final var _resultValue = new GetClusterRestoreContinuousBackupSource();
            _resultValue.cluster = cluster;
            _resultValue.pointInTime = pointInTime;
            return _resultValue;
        }
    }
}
