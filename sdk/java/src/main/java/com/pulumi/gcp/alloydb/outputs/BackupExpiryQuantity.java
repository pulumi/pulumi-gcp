// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackupExpiryQuantity {
    /**
     * @return (Output)
     * Output only. The backup&#39;s position among its backups with the same source cluster and type, by descending chronological order create time (i.e. newest first).
     * 
     */
    private @Nullable Integer retentionCount;
    /**
     * @return (Output)
     * Output only. The length of the quantity-based queue, specified by the backup&#39;s retention policy.
     * 
     */
    private @Nullable Integer totalRetentionCount;

    private BackupExpiryQuantity() {}
    /**
     * @return (Output)
     * Output only. The backup&#39;s position among its backups with the same source cluster and type, by descending chronological order create time (i.e. newest first).
     * 
     */
    public Optional<Integer> retentionCount() {
        return Optional.ofNullable(this.retentionCount);
    }
    /**
     * @return (Output)
     * Output only. The length of the quantity-based queue, specified by the backup&#39;s retention policy.
     * 
     */
    public Optional<Integer> totalRetentionCount() {
        return Optional.ofNullable(this.totalRetentionCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupExpiryQuantity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer retentionCount;
        private @Nullable Integer totalRetentionCount;
        public Builder() {}
        public Builder(BackupExpiryQuantity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retentionCount = defaults.retentionCount;
    	      this.totalRetentionCount = defaults.totalRetentionCount;
        }

        @CustomType.Setter
        public Builder retentionCount(@Nullable Integer retentionCount) {
            this.retentionCount = retentionCount;
            return this;
        }
        @CustomType.Setter
        public Builder totalRetentionCount(@Nullable Integer totalRetentionCount) {
            this.totalRetentionCount = totalRetentionCount;
            return this;
        }
        public BackupExpiryQuantity build() {
            final var o = new BackupExpiryQuantity();
            o.retentionCount = retentionCount;
            o.totalRetentionCount = totalRetentionCount;
            return o;
        }
    }
}