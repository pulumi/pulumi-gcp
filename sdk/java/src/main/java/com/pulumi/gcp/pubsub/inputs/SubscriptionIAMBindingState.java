// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.pubsub.inputs.SubscriptionIAMBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionIAMBindingState extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionIAMBindingState Empty = new SubscriptionIAMBindingState();

    @Import(name="condition")
    private @Nullable Output<SubscriptionIAMBindingConditionArgs> condition;

    public Optional<Output<SubscriptionIAMBindingConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * (Computed) The etag of the subscription&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return (Computed) The etag of the subscription&#39;s IAM policy.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
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
    @Import(name="members")
    private @Nullable Output<List<String>> members;

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
    public Optional<Output<List<String>>> members() {
        return Optional.ofNullable(this.members);
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.pubsub.SubscriptionIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.pubsub.SubscriptionIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * The subscription name or id to bind to attach IAM policy to.
     * 
     */
    @Import(name="subscription")
    private @Nullable Output<String> subscription;

    /**
     * @return The subscription name or id to bind to attach IAM policy to.
     * 
     */
    public Optional<Output<String>> subscription() {
        return Optional.ofNullable(this.subscription);
    }

    private SubscriptionIAMBindingState() {}

    private SubscriptionIAMBindingState(SubscriptionIAMBindingState $) {
        this.condition = $.condition;
        this.etag = $.etag;
        this.members = $.members;
        this.project = $.project;
        this.role = $.role;
        this.subscription = $.subscription;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionIAMBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionIAMBindingState $;

        public Builder() {
            $ = new SubscriptionIAMBindingState();
        }

        public Builder(SubscriptionIAMBindingState defaults) {
            $ = new SubscriptionIAMBindingState(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<SubscriptionIAMBindingConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(SubscriptionIAMBindingConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param etag (Computed) The etag of the subscription&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag (Computed) The etag of the subscription&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
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
        public Builder members(@Nullable Output<List<String>> members) {
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

        /**
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.pubsub.SubscriptionIAMBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.pubsub.SubscriptionIAMBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param subscription The subscription name or id to bind to attach IAM policy to.
         * 
         * @return builder
         * 
         */
        public Builder subscription(@Nullable Output<String> subscription) {
            $.subscription = subscription;
            return this;
        }

        /**
         * @param subscription The subscription name or id to bind to attach IAM policy to.
         * 
         * @return builder
         * 
         */
        public Builder subscription(String subscription) {
            return subscription(Output.of(subscription));
        }

        public SubscriptionIAMBindingState build() {
            return $;
        }
    }

}
