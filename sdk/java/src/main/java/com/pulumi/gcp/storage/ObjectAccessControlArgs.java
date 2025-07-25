// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ObjectAccessControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectAccessControlArgs Empty = new ObjectAccessControlArgs();

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
     * * user-{{userId}}
     * * user-{{email}} (such as &#34;user-liz{@literal @}example.com&#34;)
     * * group-{{groupId}}
     * * group-{{email}} (such as &#34;group-example{@literal @}googlegroups.com&#34;)
     * * domain-{{domain}} (such as &#34;domain-example.com&#34;)
     * * project-team-{{projectId}}
     * * allUsers
     * * allAuthenticatedUsers
     * 
     */
    @Import(name="entity", required=true)
    private Output<String> entity;

    /**
     * @return The entity holding the permission, in one of the following forms:
     * * user-{{userId}}
     * * user-{{email}} (such as &#34;user-liz{@literal @}example.com&#34;)
     * * group-{{groupId}}
     * * group-{{email}} (such as &#34;group-example{@literal @}googlegroups.com&#34;)
     * * domain-{{domain}} (such as &#34;domain-example.com&#34;)
     * * project-team-{{projectId}}
     * * allUsers
     * * allAuthenticatedUsers
     * 
     */
    public Output<String> entity() {
        return this.entity;
    }

    /**
     * The name of the object to apply the access control to.
     * 
     */
    @Import(name="object", required=true)
    private Output<String> object;

    /**
     * @return The name of the object to apply the access control to.
     * 
     */
    public Output<String> object() {
        return this.object;
    }

    /**
     * The access permission for the entity.
     * Possible values are: `OWNER`, `READER`.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The access permission for the entity.
     * Possible values are: `OWNER`, `READER`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    private ObjectAccessControlArgs() {}

    private ObjectAccessControlArgs(ObjectAccessControlArgs $) {
        this.bucket = $.bucket;
        this.entity = $.entity;
        this.object = $.object;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectAccessControlArgs $;

        public Builder() {
            $ = new ObjectAccessControlArgs();
        }

        public Builder(ObjectAccessControlArgs defaults) {
            $ = new ObjectAccessControlArgs(Objects.requireNonNull(defaults));
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
         * * user-{{userId}}
         * * user-{{email}} (such as &#34;user-liz{@literal @}example.com&#34;)
         * * group-{{groupId}}
         * * group-{{email}} (such as &#34;group-example{@literal @}googlegroups.com&#34;)
         * * domain-{{domain}} (such as &#34;domain-example.com&#34;)
         * * project-team-{{projectId}}
         * * allUsers
         * * allAuthenticatedUsers
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
         * * user-{{userId}}
         * * user-{{email}} (such as &#34;user-liz{@literal @}example.com&#34;)
         * * group-{{groupId}}
         * * group-{{email}} (such as &#34;group-example{@literal @}googlegroups.com&#34;)
         * * domain-{{domain}} (such as &#34;domain-example.com&#34;)
         * * project-team-{{projectId}}
         * * allUsers
         * * allAuthenticatedUsers
         * 
         * @return builder
         * 
         */
        public Builder entity(String entity) {
            return entity(Output.of(entity));
        }

        /**
         * @param object The name of the object to apply the access control to.
         * 
         * @return builder
         * 
         */
        public Builder object(Output<String> object) {
            $.object = object;
            return this;
        }

        /**
         * @param object The name of the object to apply the access control to.
         * 
         * @return builder
         * 
         */
        public Builder object(String object) {
            return object(Output.of(object));
        }

        /**
         * @param role The access permission for the entity.
         * Possible values are: `OWNER`, `READER`.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The access permission for the entity.
         * Possible values are: `OWNER`, `READER`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public ObjectAccessControlArgs build() {
            if ($.bucket == null) {
                throw new MissingRequiredPropertyException("ObjectAccessControlArgs", "bucket");
            }
            if ($.entity == null) {
                throw new MissingRequiredPropertyException("ObjectAccessControlArgs", "entity");
            }
            if ($.object == null) {
                throw new MissingRequiredPropertyException("ObjectAccessControlArgs", "object");
            }
            if ($.role == null) {
                throw new MissingRequiredPropertyException("ObjectAccessControlArgs", "role");
            }
            return $;
        }
    }

}
