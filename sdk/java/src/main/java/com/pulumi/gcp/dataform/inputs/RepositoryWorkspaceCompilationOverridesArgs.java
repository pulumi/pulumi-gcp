// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryWorkspaceCompilationOverridesArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryWorkspaceCompilationOverridesArgs Empty = new RepositoryWorkspaceCompilationOverridesArgs();

    /**
     * The default database (Google Cloud project ID).
     * 
     */
    @Import(name="defaultDatabase")
    private @Nullable Output<String> defaultDatabase;

    /**
     * @return The default database (Google Cloud project ID).
     * 
     */
    public Optional<Output<String>> defaultDatabase() {
        return Optional.ofNullable(this.defaultDatabase);
    }

    /**
     * The suffix that should be appended to all schema (BigQuery dataset ID) names.
     * 
     */
    @Import(name="schemaSuffix")
    private @Nullable Output<String> schemaSuffix;

    /**
     * @return The suffix that should be appended to all schema (BigQuery dataset ID) names.
     * 
     */
    public Optional<Output<String>> schemaSuffix() {
        return Optional.ofNullable(this.schemaSuffix);
    }

    /**
     * The prefix that should be prepended to all table names.
     * 
     */
    @Import(name="tablePrefix")
    private @Nullable Output<String> tablePrefix;

    /**
     * @return The prefix that should be prepended to all table names.
     * 
     */
    public Optional<Output<String>> tablePrefix() {
        return Optional.ofNullable(this.tablePrefix);
    }

    private RepositoryWorkspaceCompilationOverridesArgs() {}

    private RepositoryWorkspaceCompilationOverridesArgs(RepositoryWorkspaceCompilationOverridesArgs $) {
        this.defaultDatabase = $.defaultDatabase;
        this.schemaSuffix = $.schemaSuffix;
        this.tablePrefix = $.tablePrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryWorkspaceCompilationOverridesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryWorkspaceCompilationOverridesArgs $;

        public Builder() {
            $ = new RepositoryWorkspaceCompilationOverridesArgs();
        }

        public Builder(RepositoryWorkspaceCompilationOverridesArgs defaults) {
            $ = new RepositoryWorkspaceCompilationOverridesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultDatabase The default database (Google Cloud project ID).
         * 
         * @return builder
         * 
         */
        public Builder defaultDatabase(@Nullable Output<String> defaultDatabase) {
            $.defaultDatabase = defaultDatabase;
            return this;
        }

        /**
         * @param defaultDatabase The default database (Google Cloud project ID).
         * 
         * @return builder
         * 
         */
        public Builder defaultDatabase(String defaultDatabase) {
            return defaultDatabase(Output.of(defaultDatabase));
        }

        /**
         * @param schemaSuffix The suffix that should be appended to all schema (BigQuery dataset ID) names.
         * 
         * @return builder
         * 
         */
        public Builder schemaSuffix(@Nullable Output<String> schemaSuffix) {
            $.schemaSuffix = schemaSuffix;
            return this;
        }

        /**
         * @param schemaSuffix The suffix that should be appended to all schema (BigQuery dataset ID) names.
         * 
         * @return builder
         * 
         */
        public Builder schemaSuffix(String schemaSuffix) {
            return schemaSuffix(Output.of(schemaSuffix));
        }

        /**
         * @param tablePrefix The prefix that should be prepended to all table names.
         * 
         * @return builder
         * 
         */
        public Builder tablePrefix(@Nullable Output<String> tablePrefix) {
            $.tablePrefix = tablePrefix;
            return this;
        }

        /**
         * @param tablePrefix The prefix that should be prepended to all table names.
         * 
         * @return builder
         * 
         */
        public Builder tablePrefix(String tablePrefix) {
            return tablePrefix(Output.of(tablePrefix));
        }

        public RepositoryWorkspaceCompilationOverridesArgs build() {
            return $;
        }
    }

}
