// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIamCustomRolesRole {
    /**
     * @return The current deleted state of the role.
     * 
     */
    private Boolean deleted;
    /**
     * @return A human-readable description for the role.
     * 
     */
    private String description;
    /**
     * @return an identifier for the resource with the format `organizations/{{org_id}}/roles/{{role_id}}`.
     * 
     */
    private String id;
    /**
     * @return The name of the role in the format `organizations/{{org_id}}/roles/{{role_id}}`. Like `id`, this field can be used as a reference in other resources such as IAM role bindings.
     * 
     */
    private String name;
    /**
     * @return The names of the permissions this role grants when bound in an IAM policy.
     * 
     */
    private List<String> permissions;
    /**
     * @return The camel case role id used for this role.
     * 
     */
    private String roleId;
    /**
     * @return The current launch stage of the role. List of possible stages is [here](https://cloud.google.com/iam/reference/rest/v1/organizations.roles#Role.RoleLaunchStage).
     * 
     */
    private String stage;
    /**
     * @return A human-readable title for the role.
     * 
     */
    private String title;

    private GetIamCustomRolesRole() {}
    /**
     * @return The current deleted state of the role.
     * 
     */
    public Boolean deleted() {
        return this.deleted;
    }
    /**
     * @return A human-readable description for the role.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return an identifier for the resource with the format `organizations/{{org_id}}/roles/{{role_id}}`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the role in the format `organizations/{{org_id}}/roles/{{role_id}}`. Like `id`, this field can be used as a reference in other resources such as IAM role bindings.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The names of the permissions this role grants when bound in an IAM policy.
     * 
     */
    public List<String> permissions() {
        return this.permissions;
    }
    /**
     * @return The camel case role id used for this role.
     * 
     */
    public String roleId() {
        return this.roleId;
    }
    /**
     * @return The current launch stage of the role. List of possible stages is [here](https://cloud.google.com/iam/reference/rest/v1/organizations.roles#Role.RoleLaunchStage).
     * 
     */
    public String stage() {
        return this.stage;
    }
    /**
     * @return A human-readable title for the role.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIamCustomRolesRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean deleted;
        private String description;
        private String id;
        private String name;
        private List<String> permissions;
        private String roleId;
        private String stage;
        private String title;
        public Builder() {}
        public Builder(GetIamCustomRolesRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleted = defaults.deleted;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.roleId = defaults.roleId;
    	      this.stage = defaults.stage;
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder deleted(Boolean deleted) {
            if (deleted == null) {
              throw new MissingRequiredPropertyException("GetIamCustomRolesRole", "deleted");
            }
            this.deleted = deleted;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetIamCustomRolesRole", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIamCustomRolesRole", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetIamCustomRolesRole", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder permissions(List<String> permissions) {
            if (permissions == null) {
              throw new MissingRequiredPropertyException("GetIamCustomRolesRole", "permissions");
            }
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        @CustomType.Setter
        public Builder roleId(String roleId) {
            if (roleId == null) {
              throw new MissingRequiredPropertyException("GetIamCustomRolesRole", "roleId");
            }
            this.roleId = roleId;
            return this;
        }
        @CustomType.Setter
        public Builder stage(String stage) {
            if (stage == null) {
              throw new MissingRequiredPropertyException("GetIamCustomRolesRole", "stage");
            }
            this.stage = stage;
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            if (title == null) {
              throw new MissingRequiredPropertyException("GetIamCustomRolesRole", "title");
            }
            this.title = title;
            return this;
        }
        public GetIamCustomRolesRole build() {
            final var _resultValue = new GetIamCustomRolesRole();
            _resultValue.deleted = deleted;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.permissions = permissions;
            _resultValue.roleId = roleId;
            _resultValue.stage = stage;
            _resultValue.title = title;
            return _resultValue;
        }
    }
}
