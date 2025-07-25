// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketAccessControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketAccessControlArgs Empty = new BucketAccessControlArgs();

    /**
     * The name of the bucket.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return The name of the bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
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
    @Import(name="entity", required=true)
    private Output<String> entity;

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
    public Output<String> entity() {
        return this.entity;
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

    private BucketAccessControlArgs() {}

    private BucketAccessControlArgs(BucketAccessControlArgs $) {
        this.bucket = $.bucket;
        this.entity = $.entity;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketAccessControlArgs $;

        public Builder() {
            $ = new BucketAccessControlArgs();
        }

        public Builder(BucketAccessControlArgs defaults) {
            $ = new BucketAccessControlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
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
        public Builder entity(Output<String> entity) {
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

        public BucketAccessControlArgs build() {
            if ($.bucket == null) {
                throw new MissingRequiredPropertyException("BucketAccessControlArgs", "bucket");
            }
            if ($.entity == null) {
                throw new MissingRequiredPropertyException("BucketAccessControlArgs", "entity");
            }
            return $;
        }
    }

}
