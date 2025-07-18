// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationPysparkApplicationConfigArgs;
import com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkApplicationConfigArgs;
import com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkRApplicationConfigArgs;
import com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkSqlApplicationConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GdcSparkApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GdcSparkApplicationArgs Empty = new GdcSparkApplicationArgs();

    /**
     * The annotations to associate with this application. Annotations may be used to store client information, but are not used by the server.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return The annotations to associate with this application. Annotations may be used to store client information, but are not used by the server.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * An ApplicationEnvironment from which to inherit configuration properties.
     * 
     */
    @Import(name="applicationEnvironment")
    private @Nullable Output<String> applicationEnvironment;

    /**
     * @return An ApplicationEnvironment from which to inherit configuration properties.
     * 
     */
    public Optional<Output<String>> applicationEnvironment() {
        return Optional.ofNullable(this.applicationEnvironment);
    }

    /**
     * List of container image uris for additional file dependencies. Dependent files are sequentially copied from each image. If a file with the same name exists in 2 images then the file from later image is used.
     * 
     */
    @Import(name="dependencyImages")
    private @Nullable Output<List<String>> dependencyImages;

    /**
     * @return List of container image uris for additional file dependencies. Dependent files are sequentially copied from each image. If a file with the same name exists in 2 images then the file from later image is used.
     * 
     */
    public Optional<Output<List<String>>> dependencyImages() {
        return Optional.ofNullable(this.dependencyImages);
    }

    /**
     * User-provided human-readable name to be used in user interfaces.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return User-provided human-readable name to be used in user interfaces.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The labels to associate with this application. Labels may be used for filtering and billing tracking.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The labels to associate with this application. Labels may be used for filtering and billing tracking.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location of the spark application.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location of the spark application.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The Kubernetes namespace in which to create the application. This namespace must already exist on the cluster.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The Kubernetes namespace in which to create the application. This namespace must already exist on the cluster.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * application-specific properties.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return application-specific properties.
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Represents the PySparkApplicationConfig.
     * Structure is documented below.
     * 
     */
    @Import(name="pysparkApplicationConfig")
    private @Nullable Output<GdcSparkApplicationPysparkApplicationConfigArgs> pysparkApplicationConfig;

    /**
     * @return Represents the PySparkApplicationConfig.
     * Structure is documented below.
     * 
     */
    public Optional<Output<GdcSparkApplicationPysparkApplicationConfigArgs>> pysparkApplicationConfig() {
        return Optional.ofNullable(this.pysparkApplicationConfig);
    }

    /**
     * The id of the service instance to which this spark application belongs.
     * 
     */
    @Import(name="serviceinstance", required=true)
    private Output<String> serviceinstance;

    /**
     * @return The id of the service instance to which this spark application belongs.
     * 
     */
    public Output<String> serviceinstance() {
        return this.serviceinstance;
    }

    /**
     * Represents the SparkApplicationConfig.
     * Structure is documented below.
     * 
     */
    @Import(name="sparkApplicationConfig")
    private @Nullable Output<GdcSparkApplicationSparkApplicationConfigArgs> sparkApplicationConfig;

    /**
     * @return Represents the SparkApplicationConfig.
     * Structure is documented below.
     * 
     */
    public Optional<Output<GdcSparkApplicationSparkApplicationConfigArgs>> sparkApplicationConfig() {
        return Optional.ofNullable(this.sparkApplicationConfig);
    }

    /**
     * The id of the application
     * 
     */
    @Import(name="sparkApplicationId", required=true)
    private Output<String> sparkApplicationId;

    /**
     * @return The id of the application
     * 
     */
    public Output<String> sparkApplicationId() {
        return this.sparkApplicationId;
    }

    /**
     * Represents the SparkRApplicationConfig.
     * Structure is documented below.
     * 
     */
    @Import(name="sparkRApplicationConfig")
    private @Nullable Output<GdcSparkApplicationSparkRApplicationConfigArgs> sparkRApplicationConfig;

    /**
     * @return Represents the SparkRApplicationConfig.
     * Structure is documented below.
     * 
     */
    public Optional<Output<GdcSparkApplicationSparkRApplicationConfigArgs>> sparkRApplicationConfig() {
        return Optional.ofNullable(this.sparkRApplicationConfig);
    }

    /**
     * Represents the SparkRApplicationConfig.
     * Structure is documented below.
     * 
     */
    @Import(name="sparkSqlApplicationConfig")
    private @Nullable Output<GdcSparkApplicationSparkSqlApplicationConfigArgs> sparkSqlApplicationConfig;

    /**
     * @return Represents the SparkRApplicationConfig.
     * Structure is documented below.
     * 
     */
    public Optional<Output<GdcSparkApplicationSparkSqlApplicationConfigArgs>> sparkSqlApplicationConfig() {
        return Optional.ofNullable(this.sparkSqlApplicationConfig);
    }

    /**
     * The Dataproc version of this application.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The Dataproc version of this application.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private GdcSparkApplicationArgs() {}

    private GdcSparkApplicationArgs(GdcSparkApplicationArgs $) {
        this.annotations = $.annotations;
        this.applicationEnvironment = $.applicationEnvironment;
        this.dependencyImages = $.dependencyImages;
        this.displayName = $.displayName;
        this.labels = $.labels;
        this.location = $.location;
        this.namespace = $.namespace;
        this.project = $.project;
        this.properties = $.properties;
        this.pysparkApplicationConfig = $.pysparkApplicationConfig;
        this.serviceinstance = $.serviceinstance;
        this.sparkApplicationConfig = $.sparkApplicationConfig;
        this.sparkApplicationId = $.sparkApplicationId;
        this.sparkRApplicationConfig = $.sparkRApplicationConfig;
        this.sparkSqlApplicationConfig = $.sparkSqlApplicationConfig;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GdcSparkApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GdcSparkApplicationArgs $;

        public Builder() {
            $ = new GdcSparkApplicationArgs();
        }

        public Builder(GdcSparkApplicationArgs defaults) {
            $ = new GdcSparkApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations The annotations to associate with this application. Annotations may be used to store client information, but are not used by the server.
         * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
         * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations The annotations to associate with this application. Annotations may be used to store client information, but are not used by the server.
         * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
         * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param applicationEnvironment An ApplicationEnvironment from which to inherit configuration properties.
         * 
         * @return builder
         * 
         */
        public Builder applicationEnvironment(@Nullable Output<String> applicationEnvironment) {
            $.applicationEnvironment = applicationEnvironment;
            return this;
        }

        /**
         * @param applicationEnvironment An ApplicationEnvironment from which to inherit configuration properties.
         * 
         * @return builder
         * 
         */
        public Builder applicationEnvironment(String applicationEnvironment) {
            return applicationEnvironment(Output.of(applicationEnvironment));
        }

        /**
         * @param dependencyImages List of container image uris for additional file dependencies. Dependent files are sequentially copied from each image. If a file with the same name exists in 2 images then the file from later image is used.
         * 
         * @return builder
         * 
         */
        public Builder dependencyImages(@Nullable Output<List<String>> dependencyImages) {
            $.dependencyImages = dependencyImages;
            return this;
        }

        /**
         * @param dependencyImages List of container image uris for additional file dependencies. Dependent files are sequentially copied from each image. If a file with the same name exists in 2 images then the file from later image is used.
         * 
         * @return builder
         * 
         */
        public Builder dependencyImages(List<String> dependencyImages) {
            return dependencyImages(Output.of(dependencyImages));
        }

        /**
         * @param dependencyImages List of container image uris for additional file dependencies. Dependent files are sequentially copied from each image. If a file with the same name exists in 2 images then the file from later image is used.
         * 
         * @return builder
         * 
         */
        public Builder dependencyImages(String... dependencyImages) {
            return dependencyImages(List.of(dependencyImages));
        }

        /**
         * @param displayName User-provided human-readable name to be used in user interfaces.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName User-provided human-readable name to be used in user interfaces.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param labels The labels to associate with this application. Labels may be used for filtering and billing tracking.
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The labels to associate with this application. Labels may be used for filtering and billing tracking.
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The location of the spark application.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the spark application.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param namespace The Kubernetes namespace in which to create the application. This namespace must already exist on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The Kubernetes namespace in which to create the application. This namespace must already exist on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param properties application-specific properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties application-specific properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param pysparkApplicationConfig Represents the PySparkApplicationConfig.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pysparkApplicationConfig(@Nullable Output<GdcSparkApplicationPysparkApplicationConfigArgs> pysparkApplicationConfig) {
            $.pysparkApplicationConfig = pysparkApplicationConfig;
            return this;
        }

        /**
         * @param pysparkApplicationConfig Represents the PySparkApplicationConfig.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pysparkApplicationConfig(GdcSparkApplicationPysparkApplicationConfigArgs pysparkApplicationConfig) {
            return pysparkApplicationConfig(Output.of(pysparkApplicationConfig));
        }

        /**
         * @param serviceinstance The id of the service instance to which this spark application belongs.
         * 
         * @return builder
         * 
         */
        public Builder serviceinstance(Output<String> serviceinstance) {
            $.serviceinstance = serviceinstance;
            return this;
        }

        /**
         * @param serviceinstance The id of the service instance to which this spark application belongs.
         * 
         * @return builder
         * 
         */
        public Builder serviceinstance(String serviceinstance) {
            return serviceinstance(Output.of(serviceinstance));
        }

        /**
         * @param sparkApplicationConfig Represents the SparkApplicationConfig.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sparkApplicationConfig(@Nullable Output<GdcSparkApplicationSparkApplicationConfigArgs> sparkApplicationConfig) {
            $.sparkApplicationConfig = sparkApplicationConfig;
            return this;
        }

        /**
         * @param sparkApplicationConfig Represents the SparkApplicationConfig.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sparkApplicationConfig(GdcSparkApplicationSparkApplicationConfigArgs sparkApplicationConfig) {
            return sparkApplicationConfig(Output.of(sparkApplicationConfig));
        }

        /**
         * @param sparkApplicationId The id of the application
         * 
         * @return builder
         * 
         */
        public Builder sparkApplicationId(Output<String> sparkApplicationId) {
            $.sparkApplicationId = sparkApplicationId;
            return this;
        }

        /**
         * @param sparkApplicationId The id of the application
         * 
         * @return builder
         * 
         */
        public Builder sparkApplicationId(String sparkApplicationId) {
            return sparkApplicationId(Output.of(sparkApplicationId));
        }

        /**
         * @param sparkRApplicationConfig Represents the SparkRApplicationConfig.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sparkRApplicationConfig(@Nullable Output<GdcSparkApplicationSparkRApplicationConfigArgs> sparkRApplicationConfig) {
            $.sparkRApplicationConfig = sparkRApplicationConfig;
            return this;
        }

        /**
         * @param sparkRApplicationConfig Represents the SparkRApplicationConfig.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sparkRApplicationConfig(GdcSparkApplicationSparkRApplicationConfigArgs sparkRApplicationConfig) {
            return sparkRApplicationConfig(Output.of(sparkRApplicationConfig));
        }

        /**
         * @param sparkSqlApplicationConfig Represents the SparkRApplicationConfig.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sparkSqlApplicationConfig(@Nullable Output<GdcSparkApplicationSparkSqlApplicationConfigArgs> sparkSqlApplicationConfig) {
            $.sparkSqlApplicationConfig = sparkSqlApplicationConfig;
            return this;
        }

        /**
         * @param sparkSqlApplicationConfig Represents the SparkRApplicationConfig.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sparkSqlApplicationConfig(GdcSparkApplicationSparkSqlApplicationConfigArgs sparkSqlApplicationConfig) {
            return sparkSqlApplicationConfig(Output.of(sparkSqlApplicationConfig));
        }

        /**
         * @param version The Dataproc version of this application.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The Dataproc version of this application.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public GdcSparkApplicationArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("GdcSparkApplicationArgs", "location");
            }
            if ($.serviceinstance == null) {
                throw new MissingRequiredPropertyException("GdcSparkApplicationArgs", "serviceinstance");
            }
            if ($.sparkApplicationId == null) {
                throw new MissingRequiredPropertyException("GdcSparkApplicationArgs", "sparkApplicationId");
            }
            return $;
        }
    }

}
