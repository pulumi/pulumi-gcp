// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGitArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGitArgs Empty = new FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGitArgs();

    /**
     * The Google Cloud Service Account Email used for auth when secretType is gcpServiceAccount
     * 
     */
    @Import(name="gcpServiceAccountEmail")
    private @Nullable Output<String> gcpServiceAccountEmail;

    /**
     * @return The Google Cloud Service Account Email used for auth when secretType is gcpServiceAccount
     * 
     */
    public Optional<Output<String>> gcpServiceAccountEmail() {
        return Optional.ofNullable(this.gcpServiceAccountEmail);
    }

    /**
     * URL for the HTTPS Proxy to be used when communicating with the Git repo
     * 
     */
    @Import(name="httpsProxy")
    private @Nullable Output<String> httpsProxy;

    /**
     * @return URL for the HTTPS Proxy to be used when communicating with the Git repo
     * 
     */
    public Optional<Output<String>> httpsProxy() {
        return Optional.ofNullable(this.httpsProxy);
    }

    /**
     * The path within the Git repository that represents the top level of the repo to sync
     * 
     */
    @Import(name="policyDir")
    private @Nullable Output<String> policyDir;

    /**
     * @return The path within the Git repository that represents the top level of the repo to sync
     * 
     */
    public Optional<Output<String>> policyDir() {
        return Optional.ofNullable(this.policyDir);
    }

    /**
     * Type of secret configured for access to the Git repo
     * 
     */
    @Import(name="secretType", required=true)
    private Output<String> secretType;

    /**
     * @return Type of secret configured for access to the Git repo
     * 
     */
    public Output<String> secretType() {
        return this.secretType;
    }

    /**
     * The branch of the repository to sync from. Default: master
     * 
     */
    @Import(name="syncBranch")
    private @Nullable Output<String> syncBranch;

    /**
     * @return The branch of the repository to sync from. Default: master
     * 
     */
    public Optional<Output<String>> syncBranch() {
        return Optional.ofNullable(this.syncBranch);
    }

    /**
     * The URL of the Git repository to use as the source of truth
     * 
     */
    @Import(name="syncRepo")
    private @Nullable Output<String> syncRepo;

    /**
     * @return The URL of the Git repository to use as the source of truth
     * 
     */
    public Optional<Output<String>> syncRepo() {
        return Optional.ofNullable(this.syncRepo);
    }

    /**
     * Git revision (tag or hash) to check out. Default HEAD
     * 
     */
    @Import(name="syncRev")
    private @Nullable Output<String> syncRev;

    /**
     * @return Git revision (tag or hash) to check out. Default HEAD
     * 
     */
    public Optional<Output<String>> syncRev() {
        return Optional.ofNullable(this.syncRev);
    }

    /**
     * Period in seconds between consecutive syncs. Default: 15
     * 
     */
    @Import(name="syncWaitSecs")
    private @Nullable Output<String> syncWaitSecs;

    /**
     * @return Period in seconds between consecutive syncs. Default: 15
     * 
     */
    public Optional<Output<String>> syncWaitSecs() {
        return Optional.ofNullable(this.syncWaitSecs);
    }

    private FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGitArgs() {}

    private FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGitArgs(FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGitArgs $) {
        this.gcpServiceAccountEmail = $.gcpServiceAccountEmail;
        this.httpsProxy = $.httpsProxy;
        this.policyDir = $.policyDir;
        this.secretType = $.secretType;
        this.syncBranch = $.syncBranch;
        this.syncRepo = $.syncRepo;
        this.syncRev = $.syncRev;
        this.syncWaitSecs = $.syncWaitSecs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGitArgs $;

        public Builder() {
            $ = new FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGitArgs();
        }

        public Builder(FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGitArgs defaults) {
            $ = new FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gcpServiceAccountEmail The Google Cloud Service Account Email used for auth when secretType is gcpServiceAccount
         * 
         * @return builder
         * 
         */
        public Builder gcpServiceAccountEmail(@Nullable Output<String> gcpServiceAccountEmail) {
            $.gcpServiceAccountEmail = gcpServiceAccountEmail;
            return this;
        }

        /**
         * @param gcpServiceAccountEmail The Google Cloud Service Account Email used for auth when secretType is gcpServiceAccount
         * 
         * @return builder
         * 
         */
        public Builder gcpServiceAccountEmail(String gcpServiceAccountEmail) {
            return gcpServiceAccountEmail(Output.of(gcpServiceAccountEmail));
        }

        /**
         * @param httpsProxy URL for the HTTPS Proxy to be used when communicating with the Git repo
         * 
         * @return builder
         * 
         */
        public Builder httpsProxy(@Nullable Output<String> httpsProxy) {
            $.httpsProxy = httpsProxy;
            return this;
        }

        /**
         * @param httpsProxy URL for the HTTPS Proxy to be used when communicating with the Git repo
         * 
         * @return builder
         * 
         */
        public Builder httpsProxy(String httpsProxy) {
            return httpsProxy(Output.of(httpsProxy));
        }

        /**
         * @param policyDir The path within the Git repository that represents the top level of the repo to sync
         * 
         * @return builder
         * 
         */
        public Builder policyDir(@Nullable Output<String> policyDir) {
            $.policyDir = policyDir;
            return this;
        }

        /**
         * @param policyDir The path within the Git repository that represents the top level of the repo to sync
         * 
         * @return builder
         * 
         */
        public Builder policyDir(String policyDir) {
            return policyDir(Output.of(policyDir));
        }

        /**
         * @param secretType Type of secret configured for access to the Git repo
         * 
         * @return builder
         * 
         */
        public Builder secretType(Output<String> secretType) {
            $.secretType = secretType;
            return this;
        }

        /**
         * @param secretType Type of secret configured for access to the Git repo
         * 
         * @return builder
         * 
         */
        public Builder secretType(String secretType) {
            return secretType(Output.of(secretType));
        }

        /**
         * @param syncBranch The branch of the repository to sync from. Default: master
         * 
         * @return builder
         * 
         */
        public Builder syncBranch(@Nullable Output<String> syncBranch) {
            $.syncBranch = syncBranch;
            return this;
        }

        /**
         * @param syncBranch The branch of the repository to sync from. Default: master
         * 
         * @return builder
         * 
         */
        public Builder syncBranch(String syncBranch) {
            return syncBranch(Output.of(syncBranch));
        }

        /**
         * @param syncRepo The URL of the Git repository to use as the source of truth
         * 
         * @return builder
         * 
         */
        public Builder syncRepo(@Nullable Output<String> syncRepo) {
            $.syncRepo = syncRepo;
            return this;
        }

        /**
         * @param syncRepo The URL of the Git repository to use as the source of truth
         * 
         * @return builder
         * 
         */
        public Builder syncRepo(String syncRepo) {
            return syncRepo(Output.of(syncRepo));
        }

        /**
         * @param syncRev Git revision (tag or hash) to check out. Default HEAD
         * 
         * @return builder
         * 
         */
        public Builder syncRev(@Nullable Output<String> syncRev) {
            $.syncRev = syncRev;
            return this;
        }

        /**
         * @param syncRev Git revision (tag or hash) to check out. Default HEAD
         * 
         * @return builder
         * 
         */
        public Builder syncRev(String syncRev) {
            return syncRev(Output.of(syncRev));
        }

        /**
         * @param syncWaitSecs Period in seconds between consecutive syncs. Default: 15
         * 
         * @return builder
         * 
         */
        public Builder syncWaitSecs(@Nullable Output<String> syncWaitSecs) {
            $.syncWaitSecs = syncWaitSecs;
            return this;
        }

        /**
         * @param syncWaitSecs Period in seconds between consecutive syncs. Default: 15
         * 
         * @return builder
         * 
         */
        public Builder syncWaitSecs(String syncWaitSecs) {
            return syncWaitSecs(Output.of(syncWaitSecs));
        }

        public FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGitArgs build() {
            $.secretType = Objects.requireNonNull($.secretType, "expected parameter 'secretType' to be non-null");
            return $;
        }
    }

}