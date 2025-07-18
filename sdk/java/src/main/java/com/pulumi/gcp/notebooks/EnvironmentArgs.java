// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.notebooks.inputs.EnvironmentContainerImageArgs;
import com.pulumi.gcp.notebooks.inputs.EnvironmentVmImageArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * Use a container image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @Import(name="containerImage")
    private @Nullable Output<EnvironmentContainerImageArgs> containerImage;

    /**
     * @return Use a container image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    public Optional<Output<EnvironmentContainerImageArgs>> containerImage() {
        return Optional.ofNullable(this.containerImage);
    }

    /**
     * A brief description of this environment.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A brief description of this environment.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Display name of this environment for the UI.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Display name of this environment for the UI.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * A reference to the zone where the machine resides.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return A reference to the zone where the machine resides.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The name specified for the Environment instance.
     * Format: projects/{project_id}/locations/{location}/environments/{environmentId}
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name specified for the Environment instance.
     * Format: projects/{project_id}/locations/{location}/environments/{environmentId}
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Path to a Bash script that automatically runs after a notebook instance fully boots up.
     * The path must be a URL or Cloud Storage path. Example: &#34;gs://path-to-file/file-name&#34;
     * 
     */
    @Import(name="postStartupScript")
    private @Nullable Output<String> postStartupScript;

    /**
     * @return Path to a Bash script that automatically runs after a notebook instance fully boots up.
     * The path must be a URL or Cloud Storage path. Example: &#34;gs://path-to-file/file-name&#34;
     * 
     */
    public Optional<Output<String>> postStartupScript() {
        return Optional.ofNullable(this.postStartupScript);
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
     * Use a Compute Engine VM image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @Import(name="vmImage")
    private @Nullable Output<EnvironmentVmImageArgs> vmImage;

    /**
     * @return Use a Compute Engine VM image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    public Optional<Output<EnvironmentVmImageArgs>> vmImage() {
        return Optional.ofNullable(this.vmImage);
    }

    private EnvironmentArgs() {}

    private EnvironmentArgs(EnvironmentArgs $) {
        this.containerImage = $.containerImage;
        this.description = $.description;
        this.displayName = $.displayName;
        this.location = $.location;
        this.name = $.name;
        this.postStartupScript = $.postStartupScript;
        this.project = $.project;
        this.vmImage = $.vmImage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentArgs $;

        public Builder() {
            $ = new EnvironmentArgs();
        }

        public Builder(EnvironmentArgs defaults) {
            $ = new EnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerImage Use a container image to start the notebook instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder containerImage(@Nullable Output<EnvironmentContainerImageArgs> containerImage) {
            $.containerImage = containerImage;
            return this;
        }

        /**
         * @param containerImage Use a container image to start the notebook instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder containerImage(EnvironmentContainerImageArgs containerImage) {
            return containerImage(Output.of(containerImage));
        }

        /**
         * @param description A brief description of this environment.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A brief description of this environment.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Display name of this environment for the UI.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display name of this environment for the UI.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param location A reference to the zone where the machine resides.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location A reference to the zone where the machine resides.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name specified for the Environment instance.
         * Format: projects/{project_id}/locations/{location}/environments/{environmentId}
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name specified for the Environment instance.
         * Format: projects/{project_id}/locations/{location}/environments/{environmentId}
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param postStartupScript Path to a Bash script that automatically runs after a notebook instance fully boots up.
         * The path must be a URL or Cloud Storage path. Example: &#34;gs://path-to-file/file-name&#34;
         * 
         * @return builder
         * 
         */
        public Builder postStartupScript(@Nullable Output<String> postStartupScript) {
            $.postStartupScript = postStartupScript;
            return this;
        }

        /**
         * @param postStartupScript Path to a Bash script that automatically runs after a notebook instance fully boots up.
         * The path must be a URL or Cloud Storage path. Example: &#34;gs://path-to-file/file-name&#34;
         * 
         * @return builder
         * 
         */
        public Builder postStartupScript(String postStartupScript) {
            return postStartupScript(Output.of(postStartupScript));
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
         * @param vmImage Use a Compute Engine VM image to start the notebook instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder vmImage(@Nullable Output<EnvironmentVmImageArgs> vmImage) {
            $.vmImage = vmImage;
            return this;
        }

        /**
         * @param vmImage Use a Compute Engine VM image to start the notebook instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder vmImage(EnvironmentVmImageArgs vmImage) {
            return vmImage(Output.of(vmImage));
        }

        public EnvironmentArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("EnvironmentArgs", "location");
            }
            return $;
        }
    }

}
