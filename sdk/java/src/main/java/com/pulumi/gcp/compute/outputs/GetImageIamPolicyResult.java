// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
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
            if (etag == null) {
              throw new MissingRequiredPropertyException("GetImageIamPolicyResult", "etag");
            }
            this.etag = etag;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetImageIamPolicyResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder image(String image) {
            if (image == null) {
              throw new MissingRequiredPropertyException("GetImageIamPolicyResult", "image");
            }
            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder policyData(String policyData) {
            if (policyData == null) {
              throw new MissingRequiredPropertyException("GetImageIamPolicyResult", "policyData");
            }
            this.policyData = policyData;
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            if (project == null) {
              throw new MissingRequiredPropertyException("GetImageIamPolicyResult", "project");
            }
            this.project = project;
            return this;
        }
        public GetImageIamPolicyResult build() {
            final var _resultValue = new GetImageIamPolicyResult();
            _resultValue.etag = etag;
            _resultValue.id = id;
            _resultValue.image = image;
            _resultValue.policyData = policyData;
            _resultValue.project = project;
            return _resultValue;
        }
    }
}
