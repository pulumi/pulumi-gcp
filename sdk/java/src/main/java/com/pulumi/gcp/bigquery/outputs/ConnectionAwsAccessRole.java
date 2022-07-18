// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionAwsAccessRole {
    /**
     * @return The user’s AWS IAM Role that trusts the Google-owned AWS IAM user Connection.
     * 
     */
    private final String iamRoleId;
    /**
     * @return -
     * A unique Google-owned and Google-generated identity for the Connection. This identity will be used to access the user&#39;s AWS IAM Role.
     * 
     */
    private final @Nullable String identity;

    @CustomType.Constructor
    private ConnectionAwsAccessRole(
        @CustomType.Parameter("iamRoleId") String iamRoleId,
        @CustomType.Parameter("identity") @Nullable String identity) {
        this.iamRoleId = iamRoleId;
        this.identity = identity;
    }

    /**
     * @return The user’s AWS IAM Role that trusts the Google-owned AWS IAM user Connection.
     * 
     */
    public String iamRoleId() {
        return this.iamRoleId;
    }
    /**
     * @return -
     * A unique Google-owned and Google-generated identity for the Connection. This identity will be used to access the user&#39;s AWS IAM Role.
     * 
     */
    public Optional<String> identity() {
        return Optional.ofNullable(this.identity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionAwsAccessRole defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String iamRoleId;
        private @Nullable String identity;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionAwsAccessRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamRoleId = defaults.iamRoleId;
    	      this.identity = defaults.identity;
        }

        public Builder iamRoleId(String iamRoleId) {
            this.iamRoleId = Objects.requireNonNull(iamRoleId);
            return this;
        }
        public Builder identity(@Nullable String identity) {
            this.identity = identity;
            return this;
        }        public ConnectionAwsAccessRole build() {
            return new ConnectionAwsAccessRole(iamRoleId, identity);
        }
    }
}