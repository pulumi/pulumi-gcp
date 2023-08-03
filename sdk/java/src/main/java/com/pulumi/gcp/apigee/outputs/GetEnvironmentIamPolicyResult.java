// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEnvironmentIamPolicyResult {
    private String envId;
    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    private String etag;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String orgId;
    /**
     * @return (Required only by `gcp.apigee.EnvironmentIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    private String policyData;

    private GetEnvironmentIamPolicyResult() {}
    public String envId() {
        return this.envId;
    }
    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String orgId() {
        return this.orgId;
    }
    /**
     * @return (Required only by `gcp.apigee.EnvironmentIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public String policyData() {
        return this.policyData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentIamPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String envId;
        private String etag;
        private String id;
        private String orgId;
        private String policyData;
        public Builder() {}
        public Builder(GetEnvironmentIamPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envId = defaults.envId;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.orgId = defaults.orgId;
    	      this.policyData = defaults.policyData;
        }

        @CustomType.Setter
        public Builder envId(String envId) {
            this.envId = Objects.requireNonNull(envId);
            return this;
        }
        @CustomType.Setter
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }
        @CustomType.Setter
        public Builder policyData(String policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }
        public GetEnvironmentIamPolicyResult build() {
            final var o = new GetEnvironmentIamPolicyResult();
            o.envId = envId;
            o.etag = etag;
            o.id = id;
            o.orgId = orgId;
            o.policyData = policyData;
            return o;
        }
    }
}