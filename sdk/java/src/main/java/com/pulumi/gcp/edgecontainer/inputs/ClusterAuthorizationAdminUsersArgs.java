// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.edgecontainer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClusterAuthorizationAdminUsersArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterAuthorizationAdminUsersArgs Empty = new ClusterAuthorizationAdminUsersArgs();

    /**
     * An active Google username.
     * 
     * ***
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return An active Google username.
     * 
     * ***
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private ClusterAuthorizationAdminUsersArgs() {}

    private ClusterAuthorizationAdminUsersArgs(ClusterAuthorizationAdminUsersArgs $) {
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterAuthorizationAdminUsersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterAuthorizationAdminUsersArgs $;

        public Builder() {
            $ = new ClusterAuthorizationAdminUsersArgs();
        }

        public Builder(ClusterAuthorizationAdminUsersArgs defaults) {
            $ = new ClusterAuthorizationAdminUsersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param username An active Google username.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username An active Google username.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ClusterAuthorizationAdminUsersArgs build() {
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}