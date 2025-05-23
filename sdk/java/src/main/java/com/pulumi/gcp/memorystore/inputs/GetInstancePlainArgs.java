// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.memorystore.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstancePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstancePlainArgs Empty = new GetInstancePlainArgs();

    /**
     * The ID of the memorystore instance.
     * &#39;memorystore_instance_id&#39;
     * 
     */
    @Import(name="instanceId", required=true)
    private String instanceId;

    /**
     * @return The ID of the memorystore instance.
     * &#39;memorystore_instance_id&#39;
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * (optional)
     * The canonical id of the location.If it is not provided, the provider project is used. For example: us-east1.
     * 
     */
    @Import(name="location")
    private @Nullable String location;

    /**
     * @return (optional)
     * The canonical id of the location.If it is not provided, the provider project is used. For example: us-east1.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * (optional)
     * The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return (optional)
     * The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetInstancePlainArgs() {}

    private GetInstancePlainArgs(GetInstancePlainArgs $) {
        this.instanceId = $.instanceId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstancePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstancePlainArgs $;

        public Builder() {
            $ = new GetInstancePlainArgs();
        }

        public Builder(GetInstancePlainArgs defaults) {
            $ = new GetInstancePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceId The ID of the memorystore instance.
         * &#39;memorystore_instance_id&#39;
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param location (optional)
         * The canonical id of the location.If it is not provided, the provider project is used. For example: us-east1.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        /**
         * @param project (optional)
         * The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetInstancePlainArgs build() {
            if ($.instanceId == null) {
                throw new MissingRequiredPropertyException("GetInstancePlainArgs", "instanceId");
            }
            return $;
        }
    }

}
