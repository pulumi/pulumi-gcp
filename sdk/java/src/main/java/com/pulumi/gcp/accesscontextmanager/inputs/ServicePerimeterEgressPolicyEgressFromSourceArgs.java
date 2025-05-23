// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimeterEgressPolicyEgressFromSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterEgressPolicyEgressFromSourceArgs Empty = new ServicePerimeterEgressPolicyEgressFromSourceArgs();

    /**
     * An AccessLevel resource name that allows resources outside the ServicePerimeter to be accessed from the inside.
     * 
     */
    @Import(name="accessLevel")
    private @Nullable Output<String> accessLevel;

    /**
     * @return An AccessLevel resource name that allows resources outside the ServicePerimeter to be accessed from the inside.
     * 
     */
    public Optional<Output<String>> accessLevel() {
        return Optional.ofNullable(this.accessLevel);
    }

    /**
     * A Google Cloud resource that is allowed to egress the perimeter.
     * Requests from these resources are allowed to access data outside the perimeter.
     * Currently only projects are allowed. Project format: `projects/{project_number}`.
     * The resource may be in any Google Cloud organization, not just the
     * organization that the perimeter is defined in. `*` is not allowed, the
     * case of allowing all Google Cloud resources only is not supported.
     * 
     */
    @Import(name="resource")
    private @Nullable Output<String> resource;

    /**
     * @return A Google Cloud resource that is allowed to egress the perimeter.
     * Requests from these resources are allowed to access data outside the perimeter.
     * Currently only projects are allowed. Project format: `projects/{project_number}`.
     * The resource may be in any Google Cloud organization, not just the
     * organization that the perimeter is defined in. `*` is not allowed, the
     * case of allowing all Google Cloud resources only is not supported.
     * 
     */
    public Optional<Output<String>> resource() {
        return Optional.ofNullable(this.resource);
    }

    private ServicePerimeterEgressPolicyEgressFromSourceArgs() {}

    private ServicePerimeterEgressPolicyEgressFromSourceArgs(ServicePerimeterEgressPolicyEgressFromSourceArgs $) {
        this.accessLevel = $.accessLevel;
        this.resource = $.resource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterEgressPolicyEgressFromSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterEgressPolicyEgressFromSourceArgs $;

        public Builder() {
            $ = new ServicePerimeterEgressPolicyEgressFromSourceArgs();
        }

        public Builder(ServicePerimeterEgressPolicyEgressFromSourceArgs defaults) {
            $ = new ServicePerimeterEgressPolicyEgressFromSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLevel An AccessLevel resource name that allows resources outside the ServicePerimeter to be accessed from the inside.
         * 
         * @return builder
         * 
         */
        public Builder accessLevel(@Nullable Output<String> accessLevel) {
            $.accessLevel = accessLevel;
            return this;
        }

        /**
         * @param accessLevel An AccessLevel resource name that allows resources outside the ServicePerimeter to be accessed from the inside.
         * 
         * @return builder
         * 
         */
        public Builder accessLevel(String accessLevel) {
            return accessLevel(Output.of(accessLevel));
        }

        /**
         * @param resource A Google Cloud resource that is allowed to egress the perimeter.
         * Requests from these resources are allowed to access data outside the perimeter.
         * Currently only projects are allowed. Project format: `projects/{project_number}`.
         * The resource may be in any Google Cloud organization, not just the
         * organization that the perimeter is defined in. `*` is not allowed, the
         * case of allowing all Google Cloud resources only is not supported.
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource A Google Cloud resource that is allowed to egress the perimeter.
         * Requests from these resources are allowed to access data outside the perimeter.
         * Currently only projects are allowed. Project format: `projects/{project_number}`.
         * The resource may be in any Google Cloud organization, not just the
         * organization that the perimeter is defined in. `*` is not allowed, the
         * case of allowing all Google Cloud resources only is not supported.
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        public ServicePerimeterEgressPolicyEgressFromSourceArgs build() {
            return $;
        }
    }

}
