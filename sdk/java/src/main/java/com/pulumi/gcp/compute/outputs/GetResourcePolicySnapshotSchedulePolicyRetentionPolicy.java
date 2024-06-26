// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResourcePolicySnapshotSchedulePolicyRetentionPolicy {
    /**
     * @return Maximum age of the snapshot that is allowed to be kept.
     * 
     */
    private Integer maxRetentionDays;
    /**
     * @return Specifies the behavior to apply to scheduled snapshots when
     * the source disk is deleted. Default value: &#34;KEEP_AUTO_SNAPSHOTS&#34; Possible values: [&#34;KEEP_AUTO_SNAPSHOTS&#34;, &#34;APPLY_RETENTION_POLICY&#34;]
     * 
     */
    private String onSourceDiskDelete;

    private GetResourcePolicySnapshotSchedulePolicyRetentionPolicy() {}
    /**
     * @return Maximum age of the snapshot that is allowed to be kept.
     * 
     */
    public Integer maxRetentionDays() {
        return this.maxRetentionDays;
    }
    /**
     * @return Specifies the behavior to apply to scheduled snapshots when
     * the source disk is deleted. Default value: &#34;KEEP_AUTO_SNAPSHOTS&#34; Possible values: [&#34;KEEP_AUTO_SNAPSHOTS&#34;, &#34;APPLY_RETENTION_POLICY&#34;]
     * 
     */
    public String onSourceDiskDelete() {
        return this.onSourceDiskDelete;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicySnapshotSchedulePolicyRetentionPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maxRetentionDays;
        private String onSourceDiskDelete;
        public Builder() {}
        public Builder(GetResourcePolicySnapshotSchedulePolicyRetentionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRetentionDays = defaults.maxRetentionDays;
    	      this.onSourceDiskDelete = defaults.onSourceDiskDelete;
        }

        @CustomType.Setter
        public Builder maxRetentionDays(Integer maxRetentionDays) {
            if (maxRetentionDays == null) {
              throw new MissingRequiredPropertyException("GetResourcePolicySnapshotSchedulePolicyRetentionPolicy", "maxRetentionDays");
            }
            this.maxRetentionDays = maxRetentionDays;
            return this;
        }
        @CustomType.Setter
        public Builder onSourceDiskDelete(String onSourceDiskDelete) {
            if (onSourceDiskDelete == null) {
              throw new MissingRequiredPropertyException("GetResourcePolicySnapshotSchedulePolicyRetentionPolicy", "onSourceDiskDelete");
            }
            this.onSourceDiskDelete = onSourceDiskDelete;
            return this;
        }
        public GetResourcePolicySnapshotSchedulePolicyRetentionPolicy build() {
            final var _resultValue = new GetResourcePolicySnapshotSchedulePolicyRetentionPolicy();
            _resultValue.maxRetentionDays = maxRetentionDays;
            _resultValue.onSourceDiskDelete = onSourceDiskDelete;
            return _resultValue;
        }
    }
}
