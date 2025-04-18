// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskSparkInfrastructureSpecContainerImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskSparkInfrastructureSpecContainerImageArgs Empty = new TaskSparkInfrastructureSpecContainerImageArgs();

    /**
     * Container image to use.
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return Container image to use.
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * A list of Java JARS to add to the classpath. Valid input includes Cloud Storage URIs to Jar binaries. For example, gs://bucket-name/my/path/to/file.jar
     * 
     */
    @Import(name="javaJars")
    private @Nullable Output<List<String>> javaJars;

    /**
     * @return A list of Java JARS to add to the classpath. Valid input includes Cloud Storage URIs to Jar binaries. For example, gs://bucket-name/my/path/to/file.jar
     * 
     */
    public Optional<Output<List<String>>> javaJars() {
        return Optional.ofNullable(this.javaJars);
    }

    /**
     * Override to common configuration of open source components installed on the Dataproc cluster. The properties to set on daemon config files. Property keys are specified in prefix:property format, for example core:hadoop.tmp.dir. For more information, see Cluster properties.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return Override to common configuration of open source components installed on the Dataproc cluster. The properties to set on daemon config files. Property keys are specified in prefix:property format, for example core:hadoop.tmp.dir. For more information, see Cluster properties.
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * A list of python packages to be installed. Valid formats include Cloud Storage URI to a PIP installable library. For example, gs://bucket-name/my/path/to/lib.tar.gz
     * 
     */
    @Import(name="pythonPackages")
    private @Nullable Output<List<String>> pythonPackages;

    /**
     * @return A list of python packages to be installed. Valid formats include Cloud Storage URI to a PIP installable library. For example, gs://bucket-name/my/path/to/lib.tar.gz
     * 
     */
    public Optional<Output<List<String>>> pythonPackages() {
        return Optional.ofNullable(this.pythonPackages);
    }

    private TaskSparkInfrastructureSpecContainerImageArgs() {}

    private TaskSparkInfrastructureSpecContainerImageArgs(TaskSparkInfrastructureSpecContainerImageArgs $) {
        this.image = $.image;
        this.javaJars = $.javaJars;
        this.properties = $.properties;
        this.pythonPackages = $.pythonPackages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskSparkInfrastructureSpecContainerImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskSparkInfrastructureSpecContainerImageArgs $;

        public Builder() {
            $ = new TaskSparkInfrastructureSpecContainerImageArgs();
        }

        public Builder(TaskSparkInfrastructureSpecContainerImageArgs defaults) {
            $ = new TaskSparkInfrastructureSpecContainerImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param image Container image to use.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Container image to use.
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param javaJars A list of Java JARS to add to the classpath. Valid input includes Cloud Storage URIs to Jar binaries. For example, gs://bucket-name/my/path/to/file.jar
         * 
         * @return builder
         * 
         */
        public Builder javaJars(@Nullable Output<List<String>> javaJars) {
            $.javaJars = javaJars;
            return this;
        }

        /**
         * @param javaJars A list of Java JARS to add to the classpath. Valid input includes Cloud Storage URIs to Jar binaries. For example, gs://bucket-name/my/path/to/file.jar
         * 
         * @return builder
         * 
         */
        public Builder javaJars(List<String> javaJars) {
            return javaJars(Output.of(javaJars));
        }

        /**
         * @param javaJars A list of Java JARS to add to the classpath. Valid input includes Cloud Storage URIs to Jar binaries. For example, gs://bucket-name/my/path/to/file.jar
         * 
         * @return builder
         * 
         */
        public Builder javaJars(String... javaJars) {
            return javaJars(List.of(javaJars));
        }

        /**
         * @param properties Override to common configuration of open source components installed on the Dataproc cluster. The properties to set on daemon config files. Property keys are specified in prefix:property format, for example core:hadoop.tmp.dir. For more information, see Cluster properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Override to common configuration of open source components installed on the Dataproc cluster. The properties to set on daemon config files. Property keys are specified in prefix:property format, for example core:hadoop.tmp.dir. For more information, see Cluster properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param pythonPackages A list of python packages to be installed. Valid formats include Cloud Storage URI to a PIP installable library. For example, gs://bucket-name/my/path/to/lib.tar.gz
         * 
         * @return builder
         * 
         */
        public Builder pythonPackages(@Nullable Output<List<String>> pythonPackages) {
            $.pythonPackages = pythonPackages;
            return this;
        }

        /**
         * @param pythonPackages A list of python packages to be installed. Valid formats include Cloud Storage URI to a PIP installable library. For example, gs://bucket-name/my/path/to/lib.tar.gz
         * 
         * @return builder
         * 
         */
        public Builder pythonPackages(List<String> pythonPackages) {
            return pythonPackages(Output.of(pythonPackages));
        }

        /**
         * @param pythonPackages A list of python packages to be installed. Valid formats include Cloud Storage URI to a PIP installable library. For example, gs://bucket-name/my/path/to/lib.tar.gz
         * 
         * @return builder
         * 
         */
        public Builder pythonPackages(String... pythonPackages) {
            return pythonPackages(List.of(pythonPackages));
        }

        public TaskSparkInfrastructureSpecContainerImageArgs build() {
            return $;
        }
    }

}
