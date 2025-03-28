// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.bigtable.inputs.InstanceIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceIamBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceIamBindingArgs Empty = new InstanceIamBindingArgs();

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<InstanceIamBindingConditionArgs> condition;

    /**
     * @return An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
     * 
     */
    public Optional<Output<InstanceIamBindingConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * The name or relative resource id of the instance to manage IAM policies for.
     * 
     * For `gcp.bigtable.InstanceIamMember` or `gcp.bigtable.InstanceIamBinding`:
     * 
     */
    @Import(name="instance", required=true)
    private Output<String> instance;

    /**
     * @return The name or relative resource id of the instance to manage IAM policies for.
     * 
     * For `gcp.bigtable.InstanceIamMember` or `gcp.bigtable.InstanceIamBinding`:
     * 
     */
    public Output<String> instance() {
        return this.instance;
    }

    /**
     * Identities that will be granted the privilege in `role`.
     * Each entry can have one of the following values:
     * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
     * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice{@literal @}gmail.com or joe{@literal @}example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app{@literal @}appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins{@literal @}example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * 
     */
    @Import(name="members", required=true)
    private Output<List<String>> members;

    /**
     * @return Identities that will be granted the privilege in `role`.
     * Each entry can have one of the following values:
     * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
     * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice{@literal @}gmail.com or joe{@literal @}example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app{@literal @}appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins{@literal @}example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * 
     */
    public Output<List<String>> members() {
        return this.members;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.bigtable.InstanceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.bigtable.InstanceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    private InstanceIamBindingArgs() {}

    private InstanceIamBindingArgs(InstanceIamBindingArgs $) {
        this.condition = $.condition;
        this.instance = $.instance;
        this.members = $.members;
        this.project = $.project;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceIamBindingArgs $;

        public Builder() {
            $ = new InstanceIamBindingArgs();
        }

        public Builder(InstanceIamBindingArgs defaults) {
            $ = new InstanceIamBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<InstanceIamBindingConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder condition(InstanceIamBindingConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param instance The name or relative resource id of the instance to manage IAM policies for.
         * 
         * For `gcp.bigtable.InstanceIamMember` or `gcp.bigtable.InstanceIamBinding`:
         * 
         * @return builder
         * 
         */
        public Builder instance(Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance The name or relative resource id of the instance to manage IAM policies for.
         * 
         * For `gcp.bigtable.InstanceIamMember` or `gcp.bigtable.InstanceIamBinding`:
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        /**
         * @param members Identities that will be granted the privilege in `role`.
         * Each entry can have one of the following values:
         * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
         * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
         * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice{@literal @}gmail.com or joe{@literal @}example.com.
         * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app{@literal @}appspot.gserviceaccount.com.
         * * **group:{emailid}**: An email address that represents a Google group. For example, admins{@literal @}example.com.
         * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
         * 
         * @return builder
         * 
         */
        public Builder members(Output<List<String>> members) {
            $.members = members;
            return this;
        }

        /**
         * @param members Identities that will be granted the privilege in `role`.
         * Each entry can have one of the following values:
         * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
         * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
         * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice{@literal @}gmail.com or joe{@literal @}example.com.
         * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app{@literal @}appspot.gserviceaccount.com.
         * * **group:{emailid}**: An email address that represents a Google group. For example, admins{@literal @}example.com.
         * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
         * 
         * @return builder
         * 
         */
        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        /**
         * @param members Identities that will be granted the privilege in `role`.
         * Each entry can have one of the following values:
         * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
         * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
         * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice{@literal @}gmail.com or joe{@literal @}example.com.
         * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app{@literal @}appspot.gserviceaccount.com.
         * * **group:{emailid}**: An email address that represents a Google group. For example, admins{@literal @}example.com.
         * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
         * 
         * @return builder
         * 
         */
        public Builder members(String... members) {
            return members(List.of(members));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.bigtable.InstanceIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.bigtable.InstanceIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public InstanceIamBindingArgs build() {
            if ($.instance == null) {
                throw new MissingRequiredPropertyException("InstanceIamBindingArgs", "instance");
            }
            if ($.members == null) {
                throw new MissingRequiredPropertyException("InstanceIamBindingArgs", "members");
            }
            if ($.role == null) {
                throw new MissingRequiredPropertyException("InstanceIamBindingArgs", "role");
            }
            return $;
        }
    }

}
