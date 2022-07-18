// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionAwsAccessRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionAwsAccessRoleArgs Empty = new ConnectionAwsAccessRoleArgs();

    /**
     * The user’s AWS IAM Role that trusts the Google-owned AWS IAM user Connection.
     * 
     */
    @Import(name="iamRoleId", required=true)
    private Output<String> iamRoleId;

    /**
     * @return The user’s AWS IAM Role that trusts the Google-owned AWS IAM user Connection.
     * 
     */
    public Output<String> iamRoleId() {
        return this.iamRoleId;
    }

    /**
     * - 
     * A unique Google-owned and Google-generated identity for the Connection. This identity will be used to access the user&#39;s AWS IAM Role.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<String> identity;

    /**
     * @return -
     * A unique Google-owned and Google-generated identity for the Connection. This identity will be used to access the user&#39;s AWS IAM Role.
     * 
     */
    public Optional<Output<String>> identity() {
        return Optional.ofNullable(this.identity);
    }

    private ConnectionAwsAccessRoleArgs() {}

    private ConnectionAwsAccessRoleArgs(ConnectionAwsAccessRoleArgs $) {
        this.iamRoleId = $.iamRoleId;
        this.identity = $.identity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionAwsAccessRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionAwsAccessRoleArgs $;

        public Builder() {
            $ = new ConnectionAwsAccessRoleArgs();
        }

        public Builder(ConnectionAwsAccessRoleArgs defaults) {
            $ = new ConnectionAwsAccessRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param iamRoleId The user’s AWS IAM Role that trusts the Google-owned AWS IAM user Connection.
         * 
         * @return builder
         * 
         */
        public Builder iamRoleId(Output<String> iamRoleId) {
            $.iamRoleId = iamRoleId;
            return this;
        }

        /**
         * @param iamRoleId The user’s AWS IAM Role that trusts the Google-owned AWS IAM user Connection.
         * 
         * @return builder
         * 
         */
        public Builder iamRoleId(String iamRoleId) {
            return iamRoleId(Output.of(iamRoleId));
        }

        /**
         * @param identity -
         * A unique Google-owned and Google-generated identity for the Connection. This identity will be used to access the user&#39;s AWS IAM Role.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<String> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity -
         * A unique Google-owned and Google-generated identity for the Connection. This identity will be used to access the user&#39;s AWS IAM Role.
         * 
         * @return builder
         * 
         */
        public Builder identity(String identity) {
            return identity(Output.of(identity));
        }

        public ConnectionAwsAccessRoleArgs build() {
            $.iamRoleId = Objects.requireNonNull($.iamRoleId, "expected parameter 'iamRoleId' to be non-null");
            return $;
        }
    }

}