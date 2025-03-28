// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.composer.outputs.EnvironmentConfigDataRetentionConfigAirflowMetadataRetentionConfig;
import com.pulumi.gcp.composer.outputs.EnvironmentConfigDataRetentionConfigTaskLogsRetentionConfig;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentConfigDataRetentionConfig {
    /**
     * @return Optional. The policy for airflow metadata database retention.
     * 
     */
    private @Nullable List<EnvironmentConfigDataRetentionConfigAirflowMetadataRetentionConfig> airflowMetadataRetentionConfigs;
    /**
     * @return Optional. The configuration setting for Task Logs.
     * 
     */
    private @Nullable List<EnvironmentConfigDataRetentionConfigTaskLogsRetentionConfig> taskLogsRetentionConfigs;

    private EnvironmentConfigDataRetentionConfig() {}
    /**
     * @return Optional. The policy for airflow metadata database retention.
     * 
     */
    public List<EnvironmentConfigDataRetentionConfigAirflowMetadataRetentionConfig> airflowMetadataRetentionConfigs() {
        return this.airflowMetadataRetentionConfigs == null ? List.of() : this.airflowMetadataRetentionConfigs;
    }
    /**
     * @return Optional. The configuration setting for Task Logs.
     * 
     */
    public List<EnvironmentConfigDataRetentionConfigTaskLogsRetentionConfig> taskLogsRetentionConfigs() {
        return this.taskLogsRetentionConfigs == null ? List.of() : this.taskLogsRetentionConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigDataRetentionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<EnvironmentConfigDataRetentionConfigAirflowMetadataRetentionConfig> airflowMetadataRetentionConfigs;
        private @Nullable List<EnvironmentConfigDataRetentionConfigTaskLogsRetentionConfig> taskLogsRetentionConfigs;
        public Builder() {}
        public Builder(EnvironmentConfigDataRetentionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowMetadataRetentionConfigs = defaults.airflowMetadataRetentionConfigs;
    	      this.taskLogsRetentionConfigs = defaults.taskLogsRetentionConfigs;
        }

        @CustomType.Setter
        public Builder airflowMetadataRetentionConfigs(@Nullable List<EnvironmentConfigDataRetentionConfigAirflowMetadataRetentionConfig> airflowMetadataRetentionConfigs) {

            this.airflowMetadataRetentionConfigs = airflowMetadataRetentionConfigs;
            return this;
        }
        public Builder airflowMetadataRetentionConfigs(EnvironmentConfigDataRetentionConfigAirflowMetadataRetentionConfig... airflowMetadataRetentionConfigs) {
            return airflowMetadataRetentionConfigs(List.of(airflowMetadataRetentionConfigs));
        }
        @CustomType.Setter
        public Builder taskLogsRetentionConfigs(@Nullable List<EnvironmentConfigDataRetentionConfigTaskLogsRetentionConfig> taskLogsRetentionConfigs) {

            this.taskLogsRetentionConfigs = taskLogsRetentionConfigs;
            return this;
        }
        public Builder taskLogsRetentionConfigs(EnvironmentConfigDataRetentionConfigTaskLogsRetentionConfig... taskLogsRetentionConfigs) {
            return taskLogsRetentionConfigs(List.of(taskLogsRetentionConfigs));
        }
        public EnvironmentConfigDataRetentionConfig build() {
            final var _resultValue = new EnvironmentConfigDataRetentionConfig();
            _resultValue.airflowMetadataRetentionConfigs = airflowMetadataRetentionConfigs;
            _resultValue.taskLogsRetentionConfigs = taskLogsRetentionConfigs;
            return _resultValue;
        }
    }
}
