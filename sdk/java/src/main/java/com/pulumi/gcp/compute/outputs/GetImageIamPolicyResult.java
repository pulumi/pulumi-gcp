// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetImageIamPolicyResult {
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
    private String image;
    /**
     * @return (Required only by `gcp.compute.ImageIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    private String policyData;
    private String project;

    private GetImageIamPolicyResult() {}
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
    public String image() {
        return this.image;
    }
    /**
     * @return (Required only by `gcp.compute.ImageIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public String policyData() {
        return this.policyData;
    }
    public String project() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageIamPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String etag;
        private String id;
        private String image;
        private String policyData;
        private String project;
        public Builder() {}
        public Builder(GetImageIamPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.image = defaults.image;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
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
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        @CustomType.Setter
        public Builder policyData(String policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public GetImageIamPolicyResult build() {
            final var o = new GetImageIamPolicyResult();
            o.etag = etag;
            o.id = id;
            o.image = image;
            o.policyData = policyData;
            o.project = project;
            return o;
        }
    }
}