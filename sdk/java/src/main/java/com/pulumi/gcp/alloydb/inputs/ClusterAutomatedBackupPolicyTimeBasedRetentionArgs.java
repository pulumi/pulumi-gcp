// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterAutomatedBackupPolicyTimeBasedRetentionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterAutomatedBackupPolicyTimeBasedRetentionArgs Empty = new ClusterAutomatedBackupPolicyTimeBasedRetentionArgs();

    /**
     * The retention period.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="retentionPeriod")
    private @Nullable Output<String> retentionPeriod;

    /**
     * @return The retention period.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<Output<String>> retentionPeriod() {
        return Optional.ofNullable(this.retentionPeriod);
    }

    private ClusterAutomatedBackupPolicyTimeBasedRetentionArgs() {}

    private ClusterAutomatedBackupPolicyTimeBasedRetentionArgs(ClusterAutomatedBackupPolicyTimeBasedRetentionArgs $) {
        this.retentionPeriod = $.retentionPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterAutomatedBackupPolicyTimeBasedRetentionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterAutomatedBackupPolicyTimeBasedRetentionArgs $;

        public Builder() {
            $ = new ClusterAutomatedBackupPolicyTimeBasedRetentionArgs();
        }

        public Builder(ClusterAutomatedBackupPolicyTimeBasedRetentionArgs defaults) {
            $ = new ClusterAutomatedBackupPolicyTimeBasedRetentionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param retentionPeriod The retention period.
         * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder retentionPeriod(@Nullable Output<String> retentionPeriod) {
            $.retentionPeriod = retentionPeriod;
            return this;
        }

        /**
         * @param retentionPeriod The retention period.
         * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder retentionPeriod(String retentionPeriod) {
            return retentionPeriod(Output.of(retentionPeriod));
        }

        public ClusterAutomatedBackupPolicyTimeBasedRetentionArgs build() {
            return $;
        }
    }

}