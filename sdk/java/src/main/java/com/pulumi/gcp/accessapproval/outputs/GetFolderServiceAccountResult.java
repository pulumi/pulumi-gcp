// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accessapproval.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFolderServiceAccountResult {
    /**
     * @return The email address of the service account. This value is
     * often used to refer to the service account in order to grant IAM permissions.
     * 
     */
    private String accountEmail;
    private String folderId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Access Approval service account resource name. Format is &#34;folders/{folder_id}/serviceAccount&#34;.
     * 
     */
    private String name;

    private GetFolderServiceAccountResult() {}
    /**
     * @return The email address of the service account. This value is
     * often used to refer to the service account in order to grant IAM permissions.
     * 
     */
    public String accountEmail() {
        return this.accountEmail;
    }
    public String folderId() {
        return this.folderId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Access Approval service account resource name. Format is &#34;folders/{folder_id}/serviceAccount&#34;.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFolderServiceAccountResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountEmail;
        private String folderId;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetFolderServiceAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountEmail = defaults.accountEmail;
    	      this.folderId = defaults.folderId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder accountEmail(String accountEmail) {
            if (accountEmail == null) {
              throw new MissingRequiredPropertyException("GetFolderServiceAccountResult", "accountEmail");
            }
            this.accountEmail = accountEmail;
            return this;
        }
        @CustomType.Setter
        public Builder folderId(String folderId) {
            if (folderId == null) {
              throw new MissingRequiredPropertyException("GetFolderServiceAccountResult", "folderId");
            }
            this.folderId = folderId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFolderServiceAccountResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFolderServiceAccountResult", "name");
            }
            this.name = name;
            return this;
        }
        public GetFolderServiceAccountResult build() {
            final var _resultValue = new GetFolderServiceAccountResult();
            _resultValue.accountEmail = accountEmail;
            _resultValue.folderId = folderId;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
