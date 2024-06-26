// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.privilegedaccessmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementPrivilegedAccessGcpIamAccessRoleBindingArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class EntitlementPrivilegedAccessGcpIamAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final EntitlementPrivilegedAccessGcpIamAccessArgs Empty = new EntitlementPrivilegedAccessGcpIamAccessArgs();

    /**
     * Name of the resource.
     * 
     */
    @Import(name="resource", required=true)
    private Output<String> resource;

    /**
     * @return Name of the resource.
     * 
     */
    public Output<String> resource() {
        return this.resource;
    }

    /**
     * The type of this resource.
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    /**
     * @return The type of this resource.
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }

    /**
     * Role bindings to be created on successful grant.
     * Structure is documented below.
     * 
     */
    @Import(name="roleBindings", required=true)
    private Output<List<EntitlementPrivilegedAccessGcpIamAccessRoleBindingArgs>> roleBindings;

    /**
     * @return Role bindings to be created on successful grant.
     * Structure is documented below.
     * 
     */
    public Output<List<EntitlementPrivilegedAccessGcpIamAccessRoleBindingArgs>> roleBindings() {
        return this.roleBindings;
    }

    private EntitlementPrivilegedAccessGcpIamAccessArgs() {}

    private EntitlementPrivilegedAccessGcpIamAccessArgs(EntitlementPrivilegedAccessGcpIamAccessArgs $) {
        this.resource = $.resource;
        this.resourceType = $.resourceType;
        this.roleBindings = $.roleBindings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntitlementPrivilegedAccessGcpIamAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntitlementPrivilegedAccessGcpIamAccessArgs $;

        public Builder() {
            $ = new EntitlementPrivilegedAccessGcpIamAccessArgs();
        }

        public Builder(EntitlementPrivilegedAccessGcpIamAccessArgs defaults) {
            $ = new EntitlementPrivilegedAccessGcpIamAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resource Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resource(Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param resourceType The type of this resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The type of this resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param roleBindings Role bindings to be created on successful grant.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder roleBindings(Output<List<EntitlementPrivilegedAccessGcpIamAccessRoleBindingArgs>> roleBindings) {
            $.roleBindings = roleBindings;
            return this;
        }

        /**
         * @param roleBindings Role bindings to be created on successful grant.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder roleBindings(List<EntitlementPrivilegedAccessGcpIamAccessRoleBindingArgs> roleBindings) {
            return roleBindings(Output.of(roleBindings));
        }

        /**
         * @param roleBindings Role bindings to be created on successful grant.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder roleBindings(EntitlementPrivilegedAccessGcpIamAccessRoleBindingArgs... roleBindings) {
            return roleBindings(List.of(roleBindings));
        }

        public EntitlementPrivilegedAccessGcpIamAccessArgs build() {
            if ($.resource == null) {
                throw new MissingRequiredPropertyException("EntitlementPrivilegedAccessGcpIamAccessArgs", "resource");
            }
            if ($.resourceType == null) {
                throw new MissingRequiredPropertyException("EntitlementPrivilegedAccessGcpIamAccessArgs", "resourceType");
            }
            if ($.roleBindings == null) {
                throw new MissingRequiredPropertyException("EntitlementPrivilegedAccessGcpIamAccessArgs", "roleBindings");
            }
            return $;
        }
    }

}
