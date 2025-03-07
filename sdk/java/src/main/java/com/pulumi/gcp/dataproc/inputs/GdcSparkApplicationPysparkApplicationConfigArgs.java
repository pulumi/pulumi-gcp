// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GdcSparkApplicationPysparkApplicationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GdcSparkApplicationPysparkApplicationConfigArgs Empty = new GdcSparkApplicationPysparkApplicationConfigArgs();

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
     * The arguments to pass to the driver.  Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<String>> args;

    /**
     * @return The arguments to pass to the driver.  Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
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
     * HCFS URIs of jar files to add to the CLASSPATHs of the Python driver and tasks.
     * 
     */
    @Import(name="jarFileUris")
    private @Nullable Output<List<String>> jarFileUris;

    /**
     * @return HCFS URIs of jar files to add to the CLASSPATHs of the Python driver and tasks.
     * 
     */
    public Optional<Output<List<String>>> jarFileUris() {
        return Optional.ofNullable(this.jarFileUris);
    }

    /**
     * The HCFS URI of the main Python file to use as the driver. Must be a .py file.
     * 
     */
    @Import(name="mainPythonFileUri", required=true)
    private Output<String> mainPythonFileUri;

    /**
     * @return The HCFS URI of the main Python file to use as the driver. Must be a .py file.
     * 
     */
    public Output<String> mainPythonFileUri() {
        return this.mainPythonFileUri;
    }

    /**
     * HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
     * 
     */
    @Import(name="pythonFileUris")
    private @Nullable Output<List<String>> pythonFileUris;

    /**
     * @return HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
     * 
     */
    public Optional<Output<List<String>>> pythonFileUris() {
        return Optional.ofNullable(this.pythonFileUris);
    }

    private GdcSparkApplicationPysparkApplicationConfigArgs() {}

    private GdcSparkApplicationPysparkApplicationConfigArgs(GdcSparkApplicationPysparkApplicationConfigArgs $) {
        this.archiveUris = $.archiveUris;
        this.args = $.args;
        this.fileUris = $.fileUris;
        this.jarFileUris = $.jarFileUris;
        this.mainPythonFileUri = $.mainPythonFileUri;
        this.pythonFileUris = $.pythonFileUris;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GdcSparkApplicationPysparkApplicationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GdcSparkApplicationPysparkApplicationConfigArgs $;

        public Builder() {
            $ = new GdcSparkApplicationPysparkApplicationConfigArgs();
        }

        public Builder(GdcSparkApplicationPysparkApplicationConfigArgs defaults) {
            $ = new GdcSparkApplicationPysparkApplicationConfigArgs(Objects.requireNonNull(defaults));
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
         * @param args The arguments to pass to the driver.  Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
         * 
         * @return builder
         * 
         */
        public Builder args(@Nullable Output<List<String>> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args The arguments to pass to the driver.  Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
         * 
         * @return builder
         * 
         */
        public Builder args(List<String> args) {
            return args(Output.of(args));
        }

        /**
         * @param args The arguments to pass to the driver.  Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
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
         * @param jarFileUris HCFS URIs of jar files to add to the CLASSPATHs of the Python driver and tasks.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(@Nullable Output<List<String>> jarFileUris) {
            $.jarFileUris = jarFileUris;
            return this;
        }

        /**
         * @param jarFileUris HCFS URIs of jar files to add to the CLASSPATHs of the Python driver and tasks.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(List<String> jarFileUris) {
            return jarFileUris(Output.of(jarFileUris));
        }

        /**
         * @param jarFileUris HCFS URIs of jar files to add to the CLASSPATHs of the Python driver and tasks.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }

        /**
         * @param mainPythonFileUri The HCFS URI of the main Python file to use as the driver. Must be a .py file.
         * 
         * @return builder
         * 
         */
        public Builder mainPythonFileUri(Output<String> mainPythonFileUri) {
            $.mainPythonFileUri = mainPythonFileUri;
            return this;
        }

        /**
         * @param mainPythonFileUri The HCFS URI of the main Python file to use as the driver. Must be a .py file.
         * 
         * @return builder
         * 
         */
        public Builder mainPythonFileUri(String mainPythonFileUri) {
            return mainPythonFileUri(Output.of(mainPythonFileUri));
        }

        /**
         * @param pythonFileUris HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder pythonFileUris(@Nullable Output<List<String>> pythonFileUris) {
            $.pythonFileUris = pythonFileUris;
            return this;
        }

        /**
         * @param pythonFileUris HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder pythonFileUris(List<String> pythonFileUris) {
            return pythonFileUris(Output.of(pythonFileUris));
        }

        /**
         * @param pythonFileUris HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder pythonFileUris(String... pythonFileUris) {
            return pythonFileUris(List.of(pythonFileUris));
        }

        public GdcSparkApplicationPysparkApplicationConfigArgs build() {
            if ($.mainPythonFileUri == null) {
                throw new MissingRequiredPropertyException("GdcSparkApplicationPysparkApplicationConfigArgs", "mainPythonFileUri");
            }
            return $;
        }
    }

}
