// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableIamPolicyArgs Empty = new TableIamPolicyArgs();

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

    /**
     * The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
     * 
     * ***
     * 
     */
    @Import(name="policyData", required=true)
    private Output<String> policyData;

    /**
     * @return The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
     * 
     * ***
     * 
     */
    public Output<String> policyData() {
        return this.policyData;
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
     * The name or relative resource id of the table to manage IAM policies for.
     * 
     * For `gcp.bigtable.TableIamMember` or `gcp.bigtable.TableIamBinding`:
     * 
     */
    @Import(name="table", required=true)
    private Output<String> table;

    /**
     * @return The name or relative resource id of the table to manage IAM policies for.
     * 
     * For `gcp.bigtable.TableIamMember` or `gcp.bigtable.TableIamBinding`:
     * 
     */
    public Output<String> table() {
        return this.table;
    }

    private TableIamPolicyArgs() {}

    private TableIamPolicyArgs(TableIamPolicyArgs $) {
        this.instance = $.instance;
        this.policyData = $.policyData;
        this.project = $.project;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableIamPolicyArgs $;

        public Builder() {
            $ = new TableIamPolicyArgs();
        }

        public Builder(TableIamPolicyArgs defaults) {
            $ = new TableIamPolicyArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param policyData The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder policyData(Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        /**
         * @param policyData The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
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
         * @param table The name or relative resource id of the table to manage IAM policies for.
         * 
         * For `gcp.bigtable.TableIamMember` or `gcp.bigtable.TableIamBinding`:
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
         * For `gcp.bigtable.TableIamMember` or `gcp.bigtable.TableIamBinding`:
         * 
         * @return builder
         * 
         */
        public Builder table(String table) {
            return table(Output.of(table));
        }

        public TableIamPolicyArgs build() {
            if ($.instance == null) {
                throw new MissingRequiredPropertyException("TableIamPolicyArgs", "instance");
            }
            if ($.policyData == null) {
                throw new MissingRequiredPropertyException("TableIamPolicyArgs", "policyData");
            }
            if ($.table == null) {
                throw new MissingRequiredPropertyException("TableIamPolicyArgs", "table");
            }
            return $;
        }
    }

}
