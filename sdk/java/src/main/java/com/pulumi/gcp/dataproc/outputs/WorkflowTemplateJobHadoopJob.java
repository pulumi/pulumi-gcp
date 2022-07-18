// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobHadoopJobLoggingConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplateJobHadoopJob {
    /**
     * @return Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    private final @Nullable List<String> archiveUris;
    /**
     * @return Optional. The arguments to pass to the driver. Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    private final @Nullable List<String> args;
    /**
     * @return Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    private final @Nullable List<String> fileUris;
    /**
     * @return Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    private final @Nullable List<String> jarFileUris;
    /**
     * @return Optional. The runtime log config for job execution.
     * 
     */
    private final @Nullable WorkflowTemplateJobHadoopJobLoggingConfig loggingConfig;
    /**
     * @return The name of the driver&#39;s main class. The jar file that contains the class must be in the default CLASSPATH or specified in `jar_file_uris`.
     * 
     */
    private final @Nullable String mainClass;
    /**
     * @return The HCFS URI of the jar file that contains the main class.
     * 
     */
    private final @Nullable String mainJarFileUri;
    /**
     * @return Optional. The properties to set on daemon config files. Property keys are specified in `prefix:property` format, for example `core:hadoop.tmp.dir`. The following are supported prefixes and their mappings: * capacity-scheduler: `capacity-scheduler.xml` * core: `core-site.xml` * distcp: `distcp-default.xml` * hdfs: `hdfs-site.xml` * hive: `hive-site.xml` * mapred: `mapred-site.xml` * pig: `pig.properties` * spark: `spark-defaults.conf` * yarn: `yarn-site.xml` For more information, see (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    private final @Nullable Map<String,String> properties;

    @CustomType.Constructor
    private WorkflowTemplateJobHadoopJob(
        @CustomType.Parameter("archiveUris") @Nullable List<String> archiveUris,
        @CustomType.Parameter("args") @Nullable List<String> args,
        @CustomType.Parameter("fileUris") @Nullable List<String> fileUris,
        @CustomType.Parameter("jarFileUris") @Nullable List<String> jarFileUris,
        @CustomType.Parameter("loggingConfig") @Nullable WorkflowTemplateJobHadoopJobLoggingConfig loggingConfig,
        @CustomType.Parameter("mainClass") @Nullable String mainClass,
        @CustomType.Parameter("mainJarFileUri") @Nullable String mainJarFileUri,
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties) {
        this.archiveUris = archiveUris;
        this.args = args;
        this.fileUris = fileUris;
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.mainClass = mainClass;
        this.mainJarFileUri = mainJarFileUri;
        this.properties = properties;
    }

    /**
     * @return Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    public List<String> archiveUris() {
        return this.archiveUris == null ? List.of() : this.archiveUris;
    }
    /**
     * @return Optional. The arguments to pass to the driver. Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    public List<String> args() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * @return Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    public List<String> fileUris() {
        return this.fileUris == null ? List.of() : this.fileUris;
    }
    /**
     * @return Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    public List<String> jarFileUris() {
        return this.jarFileUris == null ? List.of() : this.jarFileUris;
    }
    /**
     * @return Optional. The runtime log config for job execution.
     * 
     */
    public Optional<WorkflowTemplateJobHadoopJobLoggingConfig> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }
    /**
     * @return The name of the driver&#39;s main class. The jar file that contains the class must be in the default CLASSPATH or specified in `jar_file_uris`.
     * 
     */
    public Optional<String> mainClass() {
        return Optional.ofNullable(this.mainClass);
    }
    /**
     * @return The HCFS URI of the jar file that contains the main class.
     * 
     */
    public Optional<String> mainJarFileUri() {
        return Optional.ofNullable(this.mainJarFileUri);
    }
    /**
     * @return Optional. The properties to set on daemon config files. Property keys are specified in `prefix:property` format, for example `core:hadoop.tmp.dir`. The following are supported prefixes and their mappings: * capacity-scheduler: `capacity-scheduler.xml` * core: `core-site.xml` * distcp: `distcp-default.xml` * hdfs: `hdfs-site.xml` * hive: `hive-site.xml` * mapred: `mapred-site.xml` * pig: `pig.properties` * spark: `spark-defaults.conf` * yarn: `yarn-site.xml` For more information, see (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobHadoopJob defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> archiveUris;
        private @Nullable List<String> args;
        private @Nullable List<String> fileUris;
        private @Nullable List<String> jarFileUris;
        private @Nullable WorkflowTemplateJobHadoopJobLoggingConfig loggingConfig;
        private @Nullable String mainClass;
        private @Nullable String mainJarFileUri;
        private @Nullable Map<String,String> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobHadoopJob defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.mainClass = defaults.mainClass;
    	      this.mainJarFileUri = defaults.mainJarFileUri;
    	      this.properties = defaults.properties;
        }

        public Builder archiveUris(@Nullable List<String> archiveUris) {
            this.archiveUris = archiveUris;
            return this;
        }
        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }
        public Builder args(@Nullable List<String> args) {
            this.args = args;
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder fileUris(@Nullable List<String> fileUris) {
            this.fileUris = fileUris;
            return this;
        }
        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }
        public Builder jarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }
        public Builder loggingConfig(@Nullable WorkflowTemplateJobHadoopJobLoggingConfig loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }
        public Builder mainClass(@Nullable String mainClass) {
            this.mainClass = mainClass;
            return this;
        }
        public Builder mainJarFileUri(@Nullable String mainJarFileUri) {
            this.mainJarFileUri = mainJarFileUri;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }        public WorkflowTemplateJobHadoopJob build() {
            return new WorkflowTemplateJobHadoopJob(archiveUris, args, fileUris, jarFileUris, loggingConfig, mainClass, mainJarFileUri, properties);
        }
    }
}