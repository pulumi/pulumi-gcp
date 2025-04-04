// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.containeranalysis.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNoteIamPolicyResult {
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
    private String note;
    /**
     * @return (Required only by `gcp.containeranalysis.NoteIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    private String policyData;
    private String project;

    private GetNoteIamPolicyResult() {}
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
    public String note() {
        return this.note;
    }
    /**
     * @return (Required only by `gcp.containeranalysis.NoteIamPolicy`) The policy data generated by
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

    public static Builder builder(GetNoteIamPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String etag;
        private String id;
        private String note;
        private String policyData;
        private String project;
        public Builder() {}
        public Builder(GetNoteIamPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.note = defaults.note;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
        }

        @CustomType.Setter
        public Builder etag(String etag) {
            if (etag == null) {
              throw new MissingRequiredPropertyException("GetNoteIamPolicyResult", "etag");
            }
            this.etag = etag;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNoteIamPolicyResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder note(String note) {
            if (note == null) {
              throw new MissingRequiredPropertyException("GetNoteIamPolicyResult", "note");
            }
            this.note = note;
            return this;
        }
        @CustomType.Setter
        public Builder policyData(String policyData) {
            if (policyData == null) {
              throw new MissingRequiredPropertyException("GetNoteIamPolicyResult", "policyData");
            }
            this.policyData = policyData;
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            if (project == null) {
              throw new MissingRequiredPropertyException("GetNoteIamPolicyResult", "project");
            }
            this.project = project;
            return this;
        }
        public GetNoteIamPolicyResult build() {
            final var _resultValue = new GetNoteIamPolicyResult();
            _resultValue.etag = etag;
            _resultValue.id = id;
            _resultValue.note = note;
            _resultValue.policyData = policyData;
            _resultValue.project = project;
            return _resultValue;
        }
    }
}
