// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigtable.inputs.TableIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableIamBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableIamBindingArgs Empty = new TableIamBindingArgs();

    @Import(name="condition")
    private @Nullable Output<TableIamBindingConditionArgs> condition;

    public Optional<Output<TableIamBindingConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * The name or relative resource id of the instance that owns the table.
     * 
     */
    @Import(name="instance", required=true)
    private Output<String> instance;

    /**
     * @return The name or relative resource id of the instance that owns the table.
     * 
     */
    public Output<String> instance() {
        return this.instance;
    }

    @Import(name="members", required=true)
    private Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }

    /**
     * The project in which the table belongs. If it
     * is not provided, this provider will use the provider default.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project in which the table belongs. If it
     * is not provided, this provider will use the provider default.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     * The name or relative resource id of the table to manage IAM policies for.
     * 
     */
    @Import(name="table", required=true)
    private Output<String> table;

    /**
     * @return The name or relative resource id of the table to manage IAM policies for.
     * 
     */
    public Output<String> table() {
        return this.table;
    }

    private TableIamBindingArgs() {}

    private TableIamBindingArgs(TableIamBindingArgs $) {
        this.condition = $.condition;
        this.instance = $.instance;
        this.members = $.members;
        this.project = $.project;
        this.role = $.role;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableIamBindingArgs $;

        public Builder() {
            $ = new TableIamBindingArgs();
        }

        public Builder(TableIamBindingArgs defaults) {
            $ = new TableIamBindingArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<TableIamBindingConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(TableIamBindingConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param instance The name or relative resource id of the instance that owns the table.
         * 
         * @return builder
         * 
         */
        public Builder instance(Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance The name or relative resource id of the instance that owns the table.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        public Builder members(Output<List<String>> members) {
            $.members = members;
            return this;
        }

        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        public Builder members(String... members) {
            return members(List.of(members));
        }

        /**
         * @param project The project in which the table belongs. If it
         * is not provided, this provider will use the provider default.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project in which the table belongs. If it
         * is not provided, this provider will use the provider default.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
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
         * `gcp.bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param table The name or relative resource id of the table to manage IAM policies for.
         * 
         * @return builder
         * 
         */
        public Builder table(Output<String> table) {
            $.table = table;
            return this;
        }

        /**
         * @param table The name or relative resource id of the table to manage IAM policies for.
         * 
         * @return builder
         * 
         */
        public Builder table(String table) {
            return table(Output.of(table));
        }

        public TableIamBindingArgs build() {
            $.instance = Objects.requireNonNull($.instance, "expected parameter 'instance' to be non-null");
            $.members = Objects.requireNonNull($.members, "expected parameter 'members' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            $.table = Objects.requireNonNull($.table, "expected parameter 'table' to be non-null");
            return $;
        }
    }

}