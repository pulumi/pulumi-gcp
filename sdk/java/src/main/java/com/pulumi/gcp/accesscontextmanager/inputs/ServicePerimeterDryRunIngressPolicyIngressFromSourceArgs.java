// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs Empty = new ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs();

    /**
     * An `AccessLevel` resource name that allow resources within the
     * `ServicePerimeters` to be accessed from the internet. `AccessLevels` listed
     * must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent
     * `AccessLevel` will cause an error. If no `AccessLevel` names are listed,
     * resources within the perimeter can only be accessed via Google Cloud calls
     * with request origins within the perimeter.
     * Example `accessPolicies/MY_POLICY/accessLevels/MY_LEVEL.`
     * If * is specified, then all IngressSources will be allowed.
     * 
     */
    @Import(name="accessLevel")
    private @Nullable Output<String> accessLevel;

    /**
     * @return An `AccessLevel` resource name that allow resources within the
     * `ServicePerimeters` to be accessed from the internet. `AccessLevels` listed
     * must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent
     * `AccessLevel` will cause an error. If no `AccessLevel` names are listed,
     * resources within the perimeter can only be accessed via Google Cloud calls
     * with request origins within the perimeter.
     * Example `accessPolicies/MY_POLICY/accessLevels/MY_LEVEL.`
     * If * is specified, then all IngressSources will be allowed.
     * 
     */
    public Optional<Output<String>> accessLevel() {
        return Optional.ofNullable(this.accessLevel);
    }

    /**
     * A Google Cloud resource that is allowed to ingress the perimeter.
     * Requests from these resources will be allowed to access perimeter data.
     * Currently only projects are allowed. Format `projects/{project_number}`
     * The project may be in any Google Cloud organization, not just the
     * organization that the perimeter is defined in. `*` is not allowed, the case
     * of allowing all Google Cloud resources only is not supported.
     * 
     */
    @Import(name="resource")
    private @Nullable Output<String> resource;

    /**
     * @return A Google Cloud resource that is allowed to ingress the perimeter.
     * Requests from these resources will be allowed to access perimeter data.
     * Currently only projects are allowed. Format `projects/{project_number}`
     * The project may be in any Google Cloud organization, not just the
     * organization that the perimeter is defined in. `*` is not allowed, the case
     * of allowing all Google Cloud resources only is not supported.
     * 
     */
    public Optional<Output<String>> resource() {
        return Optional.ofNullable(this.resource);
    }

    private ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs() {}

    private ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs(ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs $) {
        this.accessLevel = $.accessLevel;
        this.resource = $.resource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs $;

        public Builder() {
            $ = new ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs();
        }

        public Builder(ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs defaults) {
            $ = new ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLevel An `AccessLevel` resource name that allow resources within the
         * `ServicePerimeters` to be accessed from the internet. `AccessLevels` listed
         * must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent
         * `AccessLevel` will cause an error. If no `AccessLevel` names are listed,
         * resources within the perimeter can only be accessed via Google Cloud calls
         * with request origins within the perimeter.
         * Example `accessPolicies/MY_POLICY/accessLevels/MY_LEVEL.`
         * If * is specified, then all IngressSources will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder accessLevel(@Nullable Output<String> accessLevel) {
            $.accessLevel = accessLevel;
            return this;
        }

        /**
         * @param accessLevel An `AccessLevel` resource name that allow resources within the
         * `ServicePerimeters` to be accessed from the internet. `AccessLevels` listed
         * must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent
         * `AccessLevel` will cause an error. If no `AccessLevel` names are listed,
         * resources within the perimeter can only be accessed via Google Cloud calls
         * with request origins within the perimeter.
         * Example `accessPolicies/MY_POLICY/accessLevels/MY_LEVEL.`
         * If * is specified, then all IngressSources will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder accessLevel(String accessLevel) {
            return accessLevel(Output.of(accessLevel));
        }

        /**
         * @param resource A Google Cloud resource that is allowed to ingress the perimeter.
         * Requests from these resources will be allowed to access perimeter data.
         * Currently only projects are allowed. Format `projects/{project_number}`
         * The project may be in any Google Cloud organization, not just the
         * organization that the perimeter is defined in. `*` is not allowed, the case
         * of allowing all Google Cloud resources only is not supported.
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource A Google Cloud resource that is allowed to ingress the perimeter.
         * Requests from these resources will be allowed to access perimeter data.
         * Currently only projects are allowed. Format `projects/{project_number}`
         * The project may be in any Google Cloud organization, not just the
         * organization that the perimeter is defined in. `*` is not allowed, the case
         * of allowing all Google Cloud resources only is not supported.
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        public ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs build() {
            return $;
        }
    }

}
