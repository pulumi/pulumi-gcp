// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securesourcemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.securesourcemanager.inputs.RepositoryInitialConfigArgs;
import com.pulumi.gcp.securesourcemanager.inputs.RepositoryUriArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryState extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryState Empty = new RepositoryState();

    /**
     * Time the repository was created in UTC.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Time the repository was created in UTC.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Description of the repository, which cannot exceed 500 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the repository, which cannot exceed 500 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Initial configurations for the repository.
     * Structure is documented below.
     * 
     */
    @Import(name="initialConfig")
    private @Nullable Output<RepositoryInitialConfigArgs> initialConfig;

    /**
     * @return Initial configurations for the repository.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RepositoryInitialConfigArgs>> initialConfig() {
        return Optional.ofNullable(this.initialConfig);
    }

    /**
     * The name of the instance in which the repository is hosted.
     * 
     */
    @Import(name="instance")
    private @Nullable Output<String> instance;

    /**
     * @return The name of the instance in which the repository is hosted.
     * 
     */
    public Optional<Output<String>> instance() {
        return Optional.ofNullable(this.instance);
    }

    /**
     * The location for the Repository.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location for the Repository.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name for the Repository.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name for the Repository.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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
     * The ID for the Repository.
     * 
     */
    @Import(name="repositoryId")
    private @Nullable Output<String> repositoryId;

    /**
     * @return The ID for the Repository.
     * 
     */
    public Optional<Output<String>> repositoryId() {
        return Optional.ofNullable(this.repositoryId);
    }

    /**
     * Unique identifier of the repository.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return Unique identifier of the repository.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    /**
     * Time the repository was updated in UTC.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Time the repository was updated in UTC.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    /**
     * URIs for the repository.
     * Structure is documented below.
     * 
     */
    @Import(name="uris")
    private @Nullable Output<List<RepositoryUriArgs>> uris;

    /**
     * @return URIs for the repository.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RepositoryUriArgs>>> uris() {
        return Optional.ofNullable(this.uris);
    }

    private RepositoryState() {}

    private RepositoryState(RepositoryState $) {
        this.createTime = $.createTime;
        this.description = $.description;
        this.initialConfig = $.initialConfig;
        this.instance = $.instance;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.repositoryId = $.repositoryId;
        this.uid = $.uid;
        this.updateTime = $.updateTime;
        this.uris = $.uris;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryState $;

        public Builder() {
            $ = new RepositoryState();
        }

        public Builder(RepositoryState defaults) {
            $ = new RepositoryState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Time the repository was created in UTC.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Time the repository was created in UTC.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description Description of the repository, which cannot exceed 500 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the repository, which cannot exceed 500 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param initialConfig Initial configurations for the repository.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder initialConfig(@Nullable Output<RepositoryInitialConfigArgs> initialConfig) {
            $.initialConfig = initialConfig;
            return this;
        }

        /**
         * @param initialConfig Initial configurations for the repository.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder initialConfig(RepositoryInitialConfigArgs initialConfig) {
            return initialConfig(Output.of(initialConfig));
        }

        /**
         * @param instance The name of the instance in which the repository is hosted.
         * 
         * @return builder
         * 
         */
        public Builder instance(@Nullable Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance The name of the instance in which the repository is hosted.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        /**
         * @param location The location for the Repository.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location for the Repository.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource name for the Repository.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name for the Repository.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param repositoryId The ID for the Repository.
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(@Nullable Output<String> repositoryId) {
            $.repositoryId = repositoryId;
            return this;
        }

        /**
         * @param repositoryId The ID for the Repository.
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(String repositoryId) {
            return repositoryId(Output.of(repositoryId));
        }

        /**
         * @param uid Unique identifier of the repository.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid Unique identifier of the repository.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        /**
         * @param updateTime Time the repository was updated in UTC.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Time the repository was updated in UTC.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        /**
         * @param uris URIs for the repository.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder uris(@Nullable Output<List<RepositoryUriArgs>> uris) {
            $.uris = uris;
            return this;
        }

        /**
         * @param uris URIs for the repository.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder uris(List<RepositoryUriArgs> uris) {
            return uris(Output.of(uris));
        }

        /**
         * @param uris URIs for the repository.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder uris(RepositoryUriArgs... uris) {
            return uris(List.of(uris));
        }

        public RepositoryState build() {
            return $;
        }
    }

}
