// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.cloudrunv2.outputs.GetWorkerPoolTemplateContainerEnv;
import com.pulumi.gcp.cloudrunv2.outputs.GetWorkerPoolTemplateContainerResource;
import com.pulumi.gcp.cloudrunv2.outputs.GetWorkerPoolTemplateContainerVolumeMount;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWorkerPoolTemplateContainer {
    /**
     * @return Arguments to the entrypoint. The docker image&#39;s CMD is used if this is not provided. Variable references are not supported in Cloud Run.
     * 
     */
    private List<String> args;
    /**
     * @return Entrypoint array. Not executed within a shell. The docker image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    private List<String> commands;
    /**
     * @return Containers which should be started before this container. If specified the container will wait to start until all containers with the listed names are healthy.
     * 
     */
    private List<String> dependsOns;
    /**
     * @return List of environment variables to set in the container.
     * 
     */
    private List<GetWorkerPoolTemplateContainerEnv> envs;
    /**
     * @return URL of the Container image in Google Container Registry or Google Artifact Registry. More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    private String image;
    /**
     * @return The name of the Cloud Run v2 Worker Pool.
     * 
     */
    private String name;
    /**
     * @return Compute Resource requirements by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * 
     */
    private List<GetWorkerPoolTemplateContainerResource> resources;
    /**
     * @return Volume to mount into the container&#39;s filesystem.
     * 
     */
    private List<GetWorkerPoolTemplateContainerVolumeMount> volumeMounts;
    /**
     * @return Container&#39;s working directory. If not specified, the container runtime&#39;s default will be used, which might be configured in the container image.
     * 
     */
    private String workingDir;

    private GetWorkerPoolTemplateContainer() {}
    /**
     * @return Arguments to the entrypoint. The docker image&#39;s CMD is used if this is not provided. Variable references are not supported in Cloud Run.
     * 
     */
    public List<String> args() {
        return this.args;
    }
    /**
     * @return Entrypoint array. Not executed within a shell. The docker image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    public List<String> commands() {
        return this.commands;
    }
    /**
     * @return Containers which should be started before this container. If specified the container will wait to start until all containers with the listed names are healthy.
     * 
     */
    public List<String> dependsOns() {
        return this.dependsOns;
    }
    /**
     * @return List of environment variables to set in the container.
     * 
     */
    public List<GetWorkerPoolTemplateContainerEnv> envs() {
        return this.envs;
    }
    /**
     * @return URL of the Container image in Google Container Registry or Google Artifact Registry. More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    public String image() {
        return this.image;
    }
    /**
     * @return The name of the Cloud Run v2 Worker Pool.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Compute Resource requirements by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * 
     */
    public List<GetWorkerPoolTemplateContainerResource> resources() {
        return this.resources;
    }
    /**
     * @return Volume to mount into the container&#39;s filesystem.
     * 
     */
    public List<GetWorkerPoolTemplateContainerVolumeMount> volumeMounts() {
        return this.volumeMounts;
    }
    /**
     * @return Container&#39;s working directory. If not specified, the container runtime&#39;s default will be used, which might be configured in the container image.
     * 
     */
    public String workingDir() {
        return this.workingDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkerPoolTemplateContainer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> args;
        private List<String> commands;
        private List<String> dependsOns;
        private List<GetWorkerPoolTemplateContainerEnv> envs;
        private String image;
        private String name;
        private List<GetWorkerPoolTemplateContainerResource> resources;
        private List<GetWorkerPoolTemplateContainerVolumeMount> volumeMounts;
        private String workingDir;
        public Builder() {}
        public Builder(GetWorkerPoolTemplateContainer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.commands = defaults.commands;
    	      this.dependsOns = defaults.dependsOns;
    	      this.envs = defaults.envs;
    	      this.image = defaults.image;
    	      this.name = defaults.name;
    	      this.resources = defaults.resources;
    	      this.volumeMounts = defaults.volumeMounts;
    	      this.workingDir = defaults.workingDir;
        }

        @CustomType.Setter
        public Builder args(List<String> args) {
            if (args == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolTemplateContainer", "args");
            }
            this.args = args;
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        @CustomType.Setter
        public Builder commands(List<String> commands) {
            if (commands == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolTemplateContainer", "commands");
            }
            this.commands = commands;
            return this;
        }
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }
        @CustomType.Setter
        public Builder dependsOns(List<String> dependsOns) {
            if (dependsOns == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolTemplateContainer", "dependsOns");
            }
            this.dependsOns = dependsOns;
            return this;
        }
        public Builder dependsOns(String... dependsOns) {
            return dependsOns(List.of(dependsOns));
        }
        @CustomType.Setter
        public Builder envs(List<GetWorkerPoolTemplateContainerEnv> envs) {
            if (envs == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolTemplateContainer", "envs");
            }
            this.envs = envs;
            return this;
        }
        public Builder envs(GetWorkerPoolTemplateContainerEnv... envs) {
            return envs(List.of(envs));
        }
        @CustomType.Setter
        public Builder image(String image) {
            if (image == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolTemplateContainer", "image");
            }
            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolTemplateContainer", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resources(List<GetWorkerPoolTemplateContainerResource> resources) {
            if (resources == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolTemplateContainer", "resources");
            }
            this.resources = resources;
            return this;
        }
        public Builder resources(GetWorkerPoolTemplateContainerResource... resources) {
            return resources(List.of(resources));
        }
        @CustomType.Setter
        public Builder volumeMounts(List<GetWorkerPoolTemplateContainerVolumeMount> volumeMounts) {
            if (volumeMounts == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolTemplateContainer", "volumeMounts");
            }
            this.volumeMounts = volumeMounts;
            return this;
        }
        public Builder volumeMounts(GetWorkerPoolTemplateContainerVolumeMount... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }
        @CustomType.Setter
        public Builder workingDir(String workingDir) {
            if (workingDir == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolTemplateContainer", "workingDir");
            }
            this.workingDir = workingDir;
            return this;
        }
        public GetWorkerPoolTemplateContainer build() {
            final var _resultValue = new GetWorkerPoolTemplateContainer();
            _resultValue.args = args;
            _resultValue.commands = commands;
            _resultValue.dependsOns = dependsOns;
            _resultValue.envs = envs;
            _resultValue.image = image;
            _resultValue.name = name;
            _resultValue.resources = resources;
            _resultValue.volumeMounts = volumeMounts;
            _resultValue.workingDir = workingDir;
            return _resultValue;
        }
    }
}
