// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryState extends com.pulumi.resources.ResourceArgs {

    public static final RegistryState Empty = new RegistryState();

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="bucketSelfLink")
    private @Nullable Output<String> bucketSelfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Optional<Output<String>> bucketSelfLink() {
        return Optional.ofNullable(this.bucketSelfLink);
    }

    /**
     * The location of the registry. One of `ASIA`, `EU`, `US` or not specified. See [the official documentation](https://cloud.google.com/container-registry/docs/pushing-and-pulling#pushing_an_image_to_a_registry) for more information on registry locations.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the registry. One of `ASIA`, `EU`, `US` or not specified. See [the official documentation](https://cloud.google.com/container-registry/docs/pushing-and-pulling#pushing_an_image_to_a_registry) for more information on registry locations.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private RegistryState() {}

    private RegistryState(RegistryState $) {
        this.bucketSelfLink = $.bucketSelfLink;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryState $;

        public Builder() {
            $ = new RegistryState();
        }

        public Builder(RegistryState defaults) {
            $ = new RegistryState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketSelfLink The URI of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder bucketSelfLink(@Nullable Output<String> bucketSelfLink) {
            $.bucketSelfLink = bucketSelfLink;
            return this;
        }

        /**
         * @param bucketSelfLink The URI of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder bucketSelfLink(String bucketSelfLink) {
            return bucketSelfLink(Output.of(bucketSelfLink));
        }

        /**
         * @param location The location of the registry. One of `ASIA`, `EU`, `US` or not specified. See [the official documentation](https://cloud.google.com/container-registry/docs/pushing-and-pulling#pushing_an_image_to_a_registry) for more information on registry locations.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the registry. One of `ASIA`, `EU`, `US` or not specified. See [the official documentation](https://cloud.google.com/container-registry/docs/pushing-and-pulling#pushing_an_image_to_a_registry) for more information on registry locations.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public RegistryState build() {
            return $;
        }
    }

}
