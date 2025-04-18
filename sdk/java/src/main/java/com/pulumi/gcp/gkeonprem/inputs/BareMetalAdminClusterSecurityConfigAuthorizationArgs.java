// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterSecurityConfigAuthorizationAdminUserArgs;
import java.util.List;
import java.util.Objects;


public final class BareMetalAdminClusterSecurityConfigAuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BareMetalAdminClusterSecurityConfigAuthorizationArgs Empty = new BareMetalAdminClusterSecurityConfigAuthorizationArgs();

    /**
     * Users that will be granted the cluster-admin role on the cluster, providing full access to the cluster.
     * Structure is documented below.
     * 
     */
    @Import(name="adminUsers", required=true)
    private Output<List<BareMetalAdminClusterSecurityConfigAuthorizationAdminUserArgs>> adminUsers;

    /**
     * @return Users that will be granted the cluster-admin role on the cluster, providing full access to the cluster.
     * Structure is documented below.
     * 
     */
    public Output<List<BareMetalAdminClusterSecurityConfigAuthorizationAdminUserArgs>> adminUsers() {
        return this.adminUsers;
    }

    private BareMetalAdminClusterSecurityConfigAuthorizationArgs() {}

    private BareMetalAdminClusterSecurityConfigAuthorizationArgs(BareMetalAdminClusterSecurityConfigAuthorizationArgs $) {
        this.adminUsers = $.adminUsers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BareMetalAdminClusterSecurityConfigAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BareMetalAdminClusterSecurityConfigAuthorizationArgs $;

        public Builder() {
            $ = new BareMetalAdminClusterSecurityConfigAuthorizationArgs();
        }

        public Builder(BareMetalAdminClusterSecurityConfigAuthorizationArgs defaults) {
            $ = new BareMetalAdminClusterSecurityConfigAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminUsers Users that will be granted the cluster-admin role on the cluster, providing full access to the cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder adminUsers(Output<List<BareMetalAdminClusterSecurityConfigAuthorizationAdminUserArgs>> adminUsers) {
            $.adminUsers = adminUsers;
            return this;
        }

        /**
         * @param adminUsers Users that will be granted the cluster-admin role on the cluster, providing full access to the cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder adminUsers(List<BareMetalAdminClusterSecurityConfigAuthorizationAdminUserArgs> adminUsers) {
            return adminUsers(Output.of(adminUsers));
        }

        /**
         * @param adminUsers Users that will be granted the cluster-admin role on the cluster, providing full access to the cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder adminUsers(BareMetalAdminClusterSecurityConfigAuthorizationAdminUserArgs... adminUsers) {
            return adminUsers(List.of(adminUsers));
        }

        public BareMetalAdminClusterSecurityConfigAuthorizationArgs build() {
            if ($.adminUsers == null) {
                throw new MissingRequiredPropertyException("BareMetalAdminClusterSecurityConfigAuthorizationArgs", "adminUsers");
            }
            return $;
        }
    }

}
