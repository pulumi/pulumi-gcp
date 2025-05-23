// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.spanner.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabaseIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseIamPolicyPlainArgs Empty = new GetDatabaseIamPolicyPlainArgs();

    /**
     * The name of the Spanner database.
     * 
     */
    @Import(name="database", required=true)
    private String database;

    /**
     * @return The name of the Spanner database.
     * 
     */
    public String database() {
        return this.database;
    }

    /**
     * The name of the Spanner instance the database belongs to.
     * 
     */
    @Import(name="instance", required=true)
    private String instance;

    /**
     * @return The name of the Spanner instance the database belongs to.
     * 
     */
    public String instance() {
        return this.instance;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetDatabaseIamPolicyPlainArgs() {}

    private GetDatabaseIamPolicyPlainArgs(GetDatabaseIamPolicyPlainArgs $) {
        this.database = $.database;
        this.instance = $.instance;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetDatabaseIamPolicyPlainArgs();
        }

        public Builder(GetDatabaseIamPolicyPlainArgs defaults) {
            $ = new GetDatabaseIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database The name of the Spanner database.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            $.database = database;
            return this;
        }

        /**
         * @param instance The name of the Spanner instance the database belongs to.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetDatabaseIamPolicyPlainArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("GetDatabaseIamPolicyPlainArgs", "database");
            }
            if ($.instance == null) {
                throw new MissingRequiredPropertyException("GetDatabaseIamPolicyPlainArgs", "instance");
            }
            return $;
        }
    }

}
