// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryCleanupPolicyConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryCleanupPolicyConditionArgs Empty = new RepositoryCleanupPolicyConditionArgs();

    /**
     * Match versions newer than a duration.
     * 
     */
    @Import(name="newerThan")
    private @Nullable Output<String> newerThan;

    /**
     * @return Match versions newer than a duration.
     * 
     */
    public Optional<Output<String>> newerThan() {
        return Optional.ofNullable(this.newerThan);
    }

    /**
     * Match versions older than a duration.
     * 
     */
    @Import(name="olderThan")
    private @Nullable Output<String> olderThan;

    /**
     * @return Match versions older than a duration.
     * 
     */
    public Optional<Output<String>> olderThan() {
        return Optional.ofNullable(this.olderThan);
    }

    /**
     * Match versions by package prefix. Applied on any prefix match.
     * 
     */
    @Import(name="packageNamePrefixes")
    private @Nullable Output<List<String>> packageNamePrefixes;

    /**
     * @return Match versions by package prefix. Applied on any prefix match.
     * 
     */
    public Optional<Output<List<String>>> packageNamePrefixes() {
        return Optional.ofNullable(this.packageNamePrefixes);
    }

    /**
     * Match versions by tag prefix. Applied on any prefix match.
     * 
     */
    @Import(name="tagPrefixes")
    private @Nullable Output<List<String>> tagPrefixes;

    /**
     * @return Match versions by tag prefix. Applied on any prefix match.
     * 
     */
    public Optional<Output<List<String>>> tagPrefixes() {
        return Optional.ofNullable(this.tagPrefixes);
    }

    /**
     * Match versions by tag status.
     * Default value is `ANY`.
     * Possible values are: `TAGGED`, `UNTAGGED`, `ANY`.
     * 
     */
    @Import(name="tagState")
    private @Nullable Output<String> tagState;

    /**
     * @return Match versions by tag status.
     * Default value is `ANY`.
     * Possible values are: `TAGGED`, `UNTAGGED`, `ANY`.
     * 
     */
    public Optional<Output<String>> tagState() {
        return Optional.ofNullable(this.tagState);
    }

    /**
     * Match versions by version name prefix. Applied on any prefix match.
     * 
     */
    @Import(name="versionNamePrefixes")
    private @Nullable Output<List<String>> versionNamePrefixes;

    /**
     * @return Match versions by version name prefix. Applied on any prefix match.
     * 
     */
    public Optional<Output<List<String>>> versionNamePrefixes() {
        return Optional.ofNullable(this.versionNamePrefixes);
    }

    private RepositoryCleanupPolicyConditionArgs() {}

    private RepositoryCleanupPolicyConditionArgs(RepositoryCleanupPolicyConditionArgs $) {
        this.newerThan = $.newerThan;
        this.olderThan = $.olderThan;
        this.packageNamePrefixes = $.packageNamePrefixes;
        this.tagPrefixes = $.tagPrefixes;
        this.tagState = $.tagState;
        this.versionNamePrefixes = $.versionNamePrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryCleanupPolicyConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryCleanupPolicyConditionArgs $;

        public Builder() {
            $ = new RepositoryCleanupPolicyConditionArgs();
        }

        public Builder(RepositoryCleanupPolicyConditionArgs defaults) {
            $ = new RepositoryCleanupPolicyConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param newerThan Match versions newer than a duration.
         * 
         * @return builder
         * 
         */
        public Builder newerThan(@Nullable Output<String> newerThan) {
            $.newerThan = newerThan;
            return this;
        }

        /**
         * @param newerThan Match versions newer than a duration.
         * 
         * @return builder
         * 
         */
        public Builder newerThan(String newerThan) {
            return newerThan(Output.of(newerThan));
        }

        /**
         * @param olderThan Match versions older than a duration.
         * 
         * @return builder
         * 
         */
        public Builder olderThan(@Nullable Output<String> olderThan) {
            $.olderThan = olderThan;
            return this;
        }

        /**
         * @param olderThan Match versions older than a duration.
         * 
         * @return builder
         * 
         */
        public Builder olderThan(String olderThan) {
            return olderThan(Output.of(olderThan));
        }

        /**
         * @param packageNamePrefixes Match versions by package prefix. Applied on any prefix match.
         * 
         * @return builder
         * 
         */
        public Builder packageNamePrefixes(@Nullable Output<List<String>> packageNamePrefixes) {
            $.packageNamePrefixes = packageNamePrefixes;
            return this;
        }

        /**
         * @param packageNamePrefixes Match versions by package prefix. Applied on any prefix match.
         * 
         * @return builder
         * 
         */
        public Builder packageNamePrefixes(List<String> packageNamePrefixes) {
            return packageNamePrefixes(Output.of(packageNamePrefixes));
        }

        /**
         * @param packageNamePrefixes Match versions by package prefix. Applied on any prefix match.
         * 
         * @return builder
         * 
         */
        public Builder packageNamePrefixes(String... packageNamePrefixes) {
            return packageNamePrefixes(List.of(packageNamePrefixes));
        }

        /**
         * @param tagPrefixes Match versions by tag prefix. Applied on any prefix match.
         * 
         * @return builder
         * 
         */
        public Builder tagPrefixes(@Nullable Output<List<String>> tagPrefixes) {
            $.tagPrefixes = tagPrefixes;
            return this;
        }

        /**
         * @param tagPrefixes Match versions by tag prefix. Applied on any prefix match.
         * 
         * @return builder
         * 
         */
        public Builder tagPrefixes(List<String> tagPrefixes) {
            return tagPrefixes(Output.of(tagPrefixes));
        }

        /**
         * @param tagPrefixes Match versions by tag prefix. Applied on any prefix match.
         * 
         * @return builder
         * 
         */
        public Builder tagPrefixes(String... tagPrefixes) {
            return tagPrefixes(List.of(tagPrefixes));
        }

        /**
         * @param tagState Match versions by tag status.
         * Default value is `ANY`.
         * Possible values are: `TAGGED`, `UNTAGGED`, `ANY`.
         * 
         * @return builder
         * 
         */
        public Builder tagState(@Nullable Output<String> tagState) {
            $.tagState = tagState;
            return this;
        }

        /**
         * @param tagState Match versions by tag status.
         * Default value is `ANY`.
         * Possible values are: `TAGGED`, `UNTAGGED`, `ANY`.
         * 
         * @return builder
         * 
         */
        public Builder tagState(String tagState) {
            return tagState(Output.of(tagState));
        }

        /**
         * @param versionNamePrefixes Match versions by version name prefix. Applied on any prefix match.
         * 
         * @return builder
         * 
         */
        public Builder versionNamePrefixes(@Nullable Output<List<String>> versionNamePrefixes) {
            $.versionNamePrefixes = versionNamePrefixes;
            return this;
        }

        /**
         * @param versionNamePrefixes Match versions by version name prefix. Applied on any prefix match.
         * 
         * @return builder
         * 
         */
        public Builder versionNamePrefixes(List<String> versionNamePrefixes) {
            return versionNamePrefixes(Output.of(versionNamePrefixes));
        }

        /**
         * @param versionNamePrefixes Match versions by version name prefix. Applied on any prefix match.
         * 
         * @return builder
         * 
         */
        public Builder versionNamePrefixes(String... versionNamePrefixes) {
            return versionNamePrefixes(List.of(versionNamePrefixes));
        }

        public RepositoryCleanupPolicyConditionArgs build() {
            return $;
        }
    }

}
