// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesPatternArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesPatternArgs Empty = new PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesPatternArgs();

    /**
     * Regex to test the database name against. If empty, all databases match.
     * 
     */
    @Import(name="databaseRegex")
    private @Nullable Output<String> databaseRegex;

    /**
     * @return Regex to test the database name against. If empty, all databases match.
     * 
     */
    public Optional<Output<String>> databaseRegex() {
        return Optional.ofNullable(this.databaseRegex);
    }

    /**
     * Regex to test the database resource&#39;s name against. An example of a database resource name is a table&#39;s name. Other database resource names like view names could be included in the future. If empty, all database resources match.&#39;
     * 
     */
    @Import(name="databaseResourceNameRegex")
    private @Nullable Output<String> databaseResourceNameRegex;

    /**
     * @return Regex to test the database resource&#39;s name against. An example of a database resource name is a table&#39;s name. Other database resource names like view names could be included in the future. If empty, all database resources match.&#39;
     * 
     */
    public Optional<Output<String>> databaseResourceNameRegex() {
        return Optional.ofNullable(this.databaseResourceNameRegex);
    }

    /**
     * Regex to test the instance name against. If empty, all instances match.
     * 
     */
    @Import(name="instanceRegex")
    private @Nullable Output<String> instanceRegex;

    /**
     * @return Regex to test the instance name against. If empty, all instances match.
     * 
     */
    public Optional<Output<String>> instanceRegex() {
        return Optional.ofNullable(this.instanceRegex);
    }

    /**
     * For organizations, if unset, will match all projects. Has no effect for data profile configurations created within a project.
     * 
     */
    @Import(name="projectIdRegex")
    private @Nullable Output<String> projectIdRegex;

    /**
     * @return For organizations, if unset, will match all projects. Has no effect for data profile configurations created within a project.
     * 
     */
    public Optional<Output<String>> projectIdRegex() {
        return Optional.ofNullable(this.projectIdRegex);
    }

    private PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesPatternArgs() {}

    private PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesPatternArgs(PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesPatternArgs $) {
        this.databaseRegex = $.databaseRegex;
        this.databaseResourceNameRegex = $.databaseResourceNameRegex;
        this.instanceRegex = $.instanceRegex;
        this.projectIdRegex = $.projectIdRegex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesPatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesPatternArgs $;

        public Builder() {
            $ = new PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesPatternArgs();
        }

        public Builder(PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesPatternArgs defaults) {
            $ = new PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesPatternArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseRegex Regex to test the database name against. If empty, all databases match.
         * 
         * @return builder
         * 
         */
        public Builder databaseRegex(@Nullable Output<String> databaseRegex) {
            $.databaseRegex = databaseRegex;
            return this;
        }

        /**
         * @param databaseRegex Regex to test the database name against. If empty, all databases match.
         * 
         * @return builder
         * 
         */
        public Builder databaseRegex(String databaseRegex) {
            return databaseRegex(Output.of(databaseRegex));
        }

        /**
         * @param databaseResourceNameRegex Regex to test the database resource&#39;s name against. An example of a database resource name is a table&#39;s name. Other database resource names like view names could be included in the future. If empty, all database resources match.&#39;
         * 
         * @return builder
         * 
         */
        public Builder databaseResourceNameRegex(@Nullable Output<String> databaseResourceNameRegex) {
            $.databaseResourceNameRegex = databaseResourceNameRegex;
            return this;
        }

        /**
         * @param databaseResourceNameRegex Regex to test the database resource&#39;s name against. An example of a database resource name is a table&#39;s name. Other database resource names like view names could be included in the future. If empty, all database resources match.&#39;
         * 
         * @return builder
         * 
         */
        public Builder databaseResourceNameRegex(String databaseResourceNameRegex) {
            return databaseResourceNameRegex(Output.of(databaseResourceNameRegex));
        }

        /**
         * @param instanceRegex Regex to test the instance name against. If empty, all instances match.
         * 
         * @return builder
         * 
         */
        public Builder instanceRegex(@Nullable Output<String> instanceRegex) {
            $.instanceRegex = instanceRegex;
            return this;
        }

        /**
         * @param instanceRegex Regex to test the instance name against. If empty, all instances match.
         * 
         * @return builder
         * 
         */
        public Builder instanceRegex(String instanceRegex) {
            return instanceRegex(Output.of(instanceRegex));
        }

        /**
         * @param projectIdRegex For organizations, if unset, will match all projects. Has no effect for data profile configurations created within a project.
         * 
         * @return builder
         * 
         */
        public Builder projectIdRegex(@Nullable Output<String> projectIdRegex) {
            $.projectIdRegex = projectIdRegex;
            return this;
        }

        /**
         * @param projectIdRegex For organizations, if unset, will match all projects. Has no effect for data profile configurations created within a project.
         * 
         * @return builder
         * 
         */
        public Builder projectIdRegex(String projectIdRegex) {
            return projectIdRegex(Output.of(projectIdRegex));
        }

        public PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesPatternArgs build() {
            return $;
        }
    }

}
