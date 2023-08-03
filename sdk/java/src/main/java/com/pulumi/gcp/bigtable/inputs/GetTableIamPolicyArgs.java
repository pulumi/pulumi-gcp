// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTableIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTableIamPolicyArgs Empty = new GetTableIamPolicyArgs();

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

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
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

    private GetTableIamPolicyArgs() {}

    private GetTableIamPolicyArgs(GetTableIamPolicyArgs $) {
        this.instance = $.instance;
        this.project = $.project;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableIamPolicyArgs $;

        public Builder() {
            $ = new GetTableIamPolicyArgs();
        }

        public Builder(GetTableIamPolicyArgs defaults) {
            $ = new GetTableIamPolicyArgs(Objects.requireNonNull(defaults));
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

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
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

        public GetTableIamPolicyArgs build() {
            $.instance = Objects.requireNonNull($.instance, "expected parameter 'instance' to be non-null");
            $.table = Objects.requireNonNull($.table, "expected parameter 'table' to be non-null");
            return $;
        }
    }

}