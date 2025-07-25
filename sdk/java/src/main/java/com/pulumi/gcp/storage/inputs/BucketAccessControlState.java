// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketAccessControlState extends com.pulumi.resources.ResourceArgs {

    public static final BucketAccessControlState Empty = new BucketAccessControlState();

    /**
     * The name of the bucket.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The name of the bucket.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * The domain associated with the entity.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The domain associated with the entity.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * The email address associated with the entity.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return The email address associated with the entity.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * The entity holding the permission, in one of the following forms:
     * user-userId
     * user-email
     * group-groupId
     * group-email
     * domain-domain
     * project-team-projectId
     * allUsers
     * allAuthenticatedUsers
     * Examples:
     * The user liz{@literal @}example.com would be user-liz{@literal @}example.com.
     * The group example{@literal @}googlegroups.com would be
     * group-example{@literal @}googlegroups.com.
     * To refer to all members of the Google Apps for Business domain
     * example.com, the entity would be domain-example.com.
     * 
     */
    @Import(name="entity")
    private @Nullable Output<String> entity;

    /**
     * @return The entity holding the permission, in one of the following forms:
     * user-userId
     * user-email
     * group-groupId
     * group-email
     * domain-domain
     * project-team-projectId
     * allUsers
     * allAuthenticatedUsers
     * Examples:
     * The user liz{@literal @}example.com would be user-liz{@literal @}example.com.
     * The group example{@literal @}googlegroups.com would be
     * group-example{@literal @}googlegroups.com.
     * To refer to all members of the Google Apps for Business domain
     * example.com, the entity would be domain-example.com.
     * 
     */
    public Optional<Output<String>> entity() {
        return Optional.ofNullable(this.entity);
    }

    /**
     * The access permission for the entity.
     * Possible values are: `OWNER`, `READER`, `WRITER`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The access permission for the entity.
     * Possible values are: `OWNER`, `READER`, `WRITER`.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private BucketAccessControlState() {}

    private BucketAccessControlState(BucketAccessControlState $) {
        this.bucket = $.bucket;
        this.domain = $.domain;
        this.email = $.email;
        this.entity = $.entity;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketAccessControlState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketAccessControlState $;

        public Builder() {
            $ = new BucketAccessControlState();
        }

        public Builder(BucketAccessControlState defaults) {
            $ = new BucketAccessControlState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param domain The domain associated with the entity.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain associated with the entity.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param email The email address associated with the entity.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email address associated with the entity.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param entity The entity holding the permission, in one of the following forms:
         * user-userId
         * user-email
         * group-groupId
         * group-email
         * domain-domain
         * project-team-projectId
         * allUsers
         * allAuthenticatedUsers
         * Examples:
         * The user liz{@literal @}example.com would be user-liz{@literal @}example.com.
         * The group example{@literal @}googlegroups.com would be
         * group-example{@literal @}googlegroups.com.
         * To refer to all members of the Google Apps for Business domain
         * example.com, the entity would be domain-example.com.
         * 
         * @return builder
         * 
         */
        public Builder entity(@Nullable Output<String> entity) {
            $.entity = entity;
            return this;
        }

        /**
         * @param entity The entity holding the permission, in one of the following forms:
         * user-userId
         * user-email
         * group-groupId
         * group-email
         * domain-domain
         * project-team-projectId
         * allUsers
         * allAuthenticatedUsers
         * Examples:
         * The user liz{@literal @}example.com would be user-liz{@literal @}example.com.
         * The group example{@literal @}googlegroups.com would be
         * group-example{@literal @}googlegroups.com.
         * To refer to all members of the Google Apps for Business domain
         * example.com, the entity would be domain-example.com.
         * 
         * @return builder
         * 
         */
        public Builder entity(String entity) {
            return entity(Output.of(entity));
        }

        /**
         * @param role The access permission for the entity.
         * Possible values are: `OWNER`, `READER`, `WRITER`.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The access permission for the entity.
         * Possible values are: `OWNER`, `READER`, `WRITER`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public BucketAccessControlState build() {
            return $;
        }
    }

}
