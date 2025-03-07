// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkJobLoggingConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplateJobSparkJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobSparkJobArgs Empty = new WorkflowTemplateJobSparkJobArgs();

    /**
     * HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @Import(name="archiveUris")
    private @Nullable Output<List<String>> archiveUris;

    /**
     * @return HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    public Optional<Output<List<String>>> archiveUris() {
        return Optional.ofNullable(this.archiveUris);
    }

    /**
     * The arguments to pass to the driver. Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<String>> args;

    /**
     * @return The arguments to pass to the driver. Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    public Optional<Output<List<String>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    @Import(name="fileUris")
    private @Nullable Output<List<String>> fileUris;

    /**
     * @return HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    public Optional<Output<List<String>>> fileUris() {
        return Optional.ofNullable(this.fileUris);
    }

    /**
     * HCFS URIs of jar files to add to the CLASSPATHs of the Spark driver and tasks.
     * 
     */
    @Import(name="jarFileUris")
    private @Nullable Output<List<String>> jarFileUris;

    /**
     * @return HCFS URIs of jar files to add to the CLASSPATHs of the Spark driver and tasks.
     * 
     */
    public Optional<Output<List<String>>> jarFileUris() {
        return Optional.ofNullable(this.jarFileUris);
    }

    /**
     * The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig")
    private @Nullable Output<WorkflowTemplateJobSparkJobLoggingConfigArgs> loggingConfig;

    /**
     * @return The runtime log config for job execution.
     * 
     */
    public Optional<Output<WorkflowTemplateJobSparkJobLoggingConfigArgs>> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }

    /**
     * The name of the driver&#39;s main class. The jar file that contains the class must be in the default CLASSPATH or specified in `jar_file_uris`.
     * 
     */
    @Import(name="mainClass")
    private @Nullable Output<String> mainClass;

    /**
     * @return The name of the driver&#39;s main class. The jar file that contains the class must be in the default CLASSPATH or specified in `jar_file_uris`.
     * 
     */
    public Optional<Output<String>> mainClass() {
        return Optional.ofNullable(this.mainClass);
    }

    /**
     * The HCFS URI of the jar file that contains the main class.
     * 
     */
    @Import(name="mainJarFileUri")
    private @Nullable Output<String> mainJarFileUri;

    /**
     * @return The HCFS URI of the jar file that contains the main class.
     * 
     */
    public Optional<Output<String>> mainJarFileUri() {
        return Optional.ofNullable(this.mainJarFileUri);
    }

    /**
     * A mapping of property names to values, used to configure Spark. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return A mapping of property names to values, used to configure Spark. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private WorkflowTemplateJobSparkJobArgs() {}

    private WorkflowTemplateJobSparkJobArgs(WorkflowTemplateJobSparkJobArgs $) {
        this.archiveUris = $.archiveUris;
        this.args = $.args;
        this.fileUris = $.fileUris;
        this.jarFileUris = $.jarFileUris;
        this.loggingConfig = $.loggingConfig;
        this.mainClass = $.mainClass;
        this.mainJarFileUri = $.mainJarFileUri;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplateJobSparkJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplateJobSparkJobArgs $;

        public Builder() {
            $ = new WorkflowTemplateJobSparkJobArgs();
        }

        public Builder(WorkflowTemplateJobSparkJobArgs defaults) {
            $ = new WorkflowTemplateJobSparkJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param archiveUris HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder archiveUris(@Nullable Output<List<String>> archiveUris) {
            $.archiveUris = archiveUris;
            return this;
        }

        /**
         * @param archiveUris HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder archiveUris(List<String> archiveUris) {
            return archiveUris(Output.of(archiveUris));
        }

        /**
         * @param archiveUris HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }

        /**
         * @param args The arguments to pass to the driver. Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
         * 
         * @return builder
         * 
         */
        public Builder args(@Nullable Output<List<String>> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args The arguments to pass to the driver. Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
         * 
         * @return builder
         * 
         */
        public Builder args(List<String> args) {
            return args(Output.of(args));
        }

        /**
         * @param args The arguments to pass to the driver. Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
         * 
         * @return builder
         * 
         */
        public Builder args(String... args) {
            return args(List.of(args));
        }

        /**
         * @param fileUris HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
         * 
         * @return builder
         * 
         */
        public Builder fileUris(@Nullable Output<List<String>> fileUris) {
            $.fileUris = fileUris;
            return this;
        }

        /**
         * @param fileUris HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
         * 
         * @return builder
         * 
         */
        public Builder fileUris(List<String> fileUris) {
            return fileUris(Output.of(fileUris));
        }

        /**
         * @param fileUris HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
         * 
         * @return builder
         * 
         */
        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }

        /**
         * @param jarFileUris HCFS URIs of jar files to add to the CLASSPATHs of the Spark driver and tasks.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(@Nullable Output<List<String>> jarFileUris) {
            $.jarFileUris = jarFileUris;
            return this;
        }

        /**
         * @param jarFileUris HCFS URIs of jar files to add to the CLASSPATHs of the Spark driver and tasks.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(List<String> jarFileUris) {
            return jarFileUris(Output.of(jarFileUris));
        }

        /**
         * @param jarFileUris HCFS URIs of jar files to add to the CLASSPATHs of the Spark driver and tasks.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }

        /**
         * @param loggingConfig The runtime log config for job execution.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(@Nullable Output<WorkflowTemplateJobSparkJobLoggingConfigArgs> loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        /**
         * @param loggingConfig The runtime log config for job execution.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(WorkflowTemplateJobSparkJobLoggingConfigArgs loggingConfig) {
            return loggingConfig(Output.of(loggingConfig));
        }

        /**
         * @param mainClass The name of the driver&#39;s main class. The jar file that contains the class must be in the default CLASSPATH or specified in `jar_file_uris`.
         * 
         * @return builder
         * 
         */
        public Builder mainClass(@Nullable Output<String> mainClass) {
            $.mainClass = mainClass;
            return this;
        }

        /**
         * @param mainClass The name of the driver&#39;s main class. The jar file that contains the class must be in the default CLASSPATH or specified in `jar_file_uris`.
         * 
         * @return builder
         * 
         */
        public Builder mainClass(String mainClass) {
            return mainClass(Output.of(mainClass));
        }

        /**
         * @param mainJarFileUri The HCFS URI of the jar file that contains the main class.
         * 
         * @return builder
         * 
         */
        public Builder mainJarFileUri(@Nullable Output<String> mainJarFileUri) {
            $.mainJarFileUri = mainJarFileUri;
            return this;
        }

        /**
         * @param mainJarFileUri The HCFS URI of the jar file that contains the main class.
         * 
         * @return builder
         * 
         */
        public Builder mainJarFileUri(String mainJarFileUri) {
            return mainJarFileUri(Output.of(mainJarFileUri));
        }

        /**
         * @param properties A mapping of property names to values, used to configure Spark. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties A mapping of property names to values, used to configure Spark. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        public WorkflowTemplateJobSparkJobArgs build() {
            return $;
        }
    }

}
