// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.GdcApplicationEnvironmentSparkApplicationEnvironmentConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GdcApplicationEnvironmentState extends com.pulumi.resources.ResourceArgs {

    public static final GdcApplicationEnvironmentState Empty = new GdcApplicationEnvironmentState();

    /**
     * The annotations to associate with this application environment. Annotations may be used to store client information, but are not used by the server.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return The annotations to associate with this application environment. Annotations may be used to store client information, but are not used by the server.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The id of the application environment
     * 
     */
    @Import(name="applicationEnvironmentId")
    private @Nullable Output<String> applicationEnvironmentId;

    /**
     * @return The id of the application environment
     * 
     */
    public Optional<Output<String>> applicationEnvironmentId() {
        return Optional.ofNullable(this.applicationEnvironmentId);
    }

    /**
     * The timestamp when the resource was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The timestamp when the resource was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
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

    @Import(name="effectiveAnnotations")
    private @Nullable Output<Map<String,String>> effectiveAnnotations;

    public Optional<Output<Map<String,String>>> effectiveAnnotations() {
        return Optional.ofNullable(this.effectiveAnnotations);
    }

    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Import(name="effectiveLabels")
    private @Nullable Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Optional<Output<Map<String,String>>> effectiveLabels() {
        return Optional.ofNullable(this.effectiveLabels);
    }

    /**
     * The labels to associate with this application environment. Labels may be used for filtering and billing tracking.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The labels to associate with this application environment. Labels may be used for filtering and billing tracking.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location of the application environment
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the application environment
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Identifier. The name of the application environment. Format: projects/{project}/locations/{location}/serviceInstances/{service_instance}/applicationEnvironments/{application_environment_id}
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Identifier. The name of the application environment. Format: projects/{project}/locations/{location}/serviceInstances/{service_instance}/applicationEnvironments/{application_environment_id}
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the namespace in which to create this ApplicationEnvironment. This namespace must already exist in the cluster
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The name of the namespace in which to create this ApplicationEnvironment. This namespace must already exist in the cluster
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
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Import(name="pulumiLabels")
    private @Nullable Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Optional<Output<Map<String,String>>> pulumiLabels() {
        return Optional.ofNullable(this.pulumiLabels);
    }

    /**
     * The id of the service instance to which this application environment belongs.
     * 
     */
    @Import(name="serviceinstance")
    private @Nullable Output<String> serviceinstance;

    /**
     * @return The id of the service instance to which this application environment belongs.
     * 
     */
    public Optional<Output<String>> serviceinstance() {
        return Optional.ofNullable(this.serviceinstance);
    }

    /**
     * Represents the SparkApplicationEnvironmentConfig.
     * Structure is documented below.
     * 
     */
    @Import(name="sparkApplicationEnvironmentConfig")
    private @Nullable Output<GdcApplicationEnvironmentSparkApplicationEnvironmentConfigArgs> sparkApplicationEnvironmentConfig;

    /**
     * @return Represents the SparkApplicationEnvironmentConfig.
     * Structure is documented below.
     * 
     */
    public Optional<Output<GdcApplicationEnvironmentSparkApplicationEnvironmentConfigArgs>> sparkApplicationEnvironmentConfig() {
        return Optional.ofNullable(this.sparkApplicationEnvironmentConfig);
    }

    /**
     * System generated unique identifier for this application environment, formatted as UUID4.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return System generated unique identifier for this application environment, formatted as UUID4.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    /**
     * The timestamp when the resource was most recently updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The timestamp when the resource was most recently updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private GdcApplicationEnvironmentState() {}

    private GdcApplicationEnvironmentState(GdcApplicationEnvironmentState $) {
        this.annotations = $.annotations;
        this.applicationEnvironmentId = $.applicationEnvironmentId;
        this.createTime = $.createTime;
        this.displayName = $.displayName;
        this.effectiveAnnotations = $.effectiveAnnotations;
        this.effectiveLabels = $.effectiveLabels;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.namespace = $.namespace;
        this.project = $.project;
        this.pulumiLabels = $.pulumiLabels;
        this.serviceinstance = $.serviceinstance;
        this.sparkApplicationEnvironmentConfig = $.sparkApplicationEnvironmentConfig;
        this.uid = $.uid;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GdcApplicationEnvironmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GdcApplicationEnvironmentState $;

        public Builder() {
            $ = new GdcApplicationEnvironmentState();
        }

        public Builder(GdcApplicationEnvironmentState defaults) {
            $ = new GdcApplicationEnvironmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations The annotations to associate with this application environment. Annotations may be used to store client information, but are not used by the server.
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
         * @param annotations The annotations to associate with this application environment. Annotations may be used to store client information, but are not used by the server.
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
         * @param applicationEnvironmentId The id of the application environment
         * 
         * @return builder
         * 
         */
        public Builder applicationEnvironmentId(@Nullable Output<String> applicationEnvironmentId) {
            $.applicationEnvironmentId = applicationEnvironmentId;
            return this;
        }

        /**
         * @param applicationEnvironmentId The id of the application environment
         * 
         * @return builder
         * 
         */
        public Builder applicationEnvironmentId(String applicationEnvironmentId) {
            return applicationEnvironmentId(Output.of(applicationEnvironmentId));
        }

        /**
         * @param createTime The timestamp when the resource was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The timestamp when the resource was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
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

        public Builder effectiveAnnotations(@Nullable Output<Map<String,String>> effectiveAnnotations) {
            $.effectiveAnnotations = effectiveAnnotations;
            return this;
        }

        public Builder effectiveAnnotations(Map<String,String> effectiveAnnotations) {
            return effectiveAnnotations(Output.of(effectiveAnnotations));
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(@Nullable Output<Map<String,String>> effectiveLabels) {
            $.effectiveLabels = effectiveLabels;
            return this;
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            return effectiveLabels(Output.of(effectiveLabels));
        }

        /**
         * @param labels The labels to associate with this application environment. Labels may be used for filtering and billing tracking.
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
         * @param labels The labels to associate with this application environment. Labels may be used for filtering and billing tracking.
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
         * @param location The location of the application environment
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the application environment
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Identifier. The name of the application environment. Format: projects/{project}/locations/{location}/serviceInstances/{service_instance}/applicationEnvironments/{application_environment_id}
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Identifier. The name of the application environment. Format: projects/{project}/locations/{location}/serviceInstances/{service_instance}/applicationEnvironments/{application_environment_id}
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace The name of the namespace in which to create this ApplicationEnvironment. This namespace must already exist in the cluster
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The name of the namespace in which to create this ApplicationEnvironment. This namespace must already exist in the cluster
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
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(@Nullable Output<Map<String,String>> pulumiLabels) {
            $.pulumiLabels = pulumiLabels;
            return this;
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            return pulumiLabels(Output.of(pulumiLabels));
        }

        /**
         * @param serviceinstance The id of the service instance to which this application environment belongs.
         * 
         * @return builder
         * 
         */
        public Builder serviceinstance(@Nullable Output<String> serviceinstance) {
            $.serviceinstance = serviceinstance;
            return this;
        }

        /**
         * @param serviceinstance The id of the service instance to which this application environment belongs.
         * 
         * @return builder
         * 
         */
        public Builder serviceinstance(String serviceinstance) {
            return serviceinstance(Output.of(serviceinstance));
        }

        /**
         * @param sparkApplicationEnvironmentConfig Represents the SparkApplicationEnvironmentConfig.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sparkApplicationEnvironmentConfig(@Nullable Output<GdcApplicationEnvironmentSparkApplicationEnvironmentConfigArgs> sparkApplicationEnvironmentConfig) {
            $.sparkApplicationEnvironmentConfig = sparkApplicationEnvironmentConfig;
            return this;
        }

        /**
         * @param sparkApplicationEnvironmentConfig Represents the SparkApplicationEnvironmentConfig.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sparkApplicationEnvironmentConfig(GdcApplicationEnvironmentSparkApplicationEnvironmentConfigArgs sparkApplicationEnvironmentConfig) {
            return sparkApplicationEnvironmentConfig(Output.of(sparkApplicationEnvironmentConfig));
        }

        /**
         * @param uid System generated unique identifier for this application environment, formatted as UUID4.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid System generated unique identifier for this application environment, formatted as UUID4.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        /**
         * @param updateTime The timestamp when the resource was most recently updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The timestamp when the resource was most recently updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public GdcApplicationEnvironmentState build() {
            return $;
        }
    }

}
