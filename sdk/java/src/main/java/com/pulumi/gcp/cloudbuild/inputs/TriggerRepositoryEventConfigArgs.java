// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudbuild.inputs.TriggerRepositoryEventConfigPullRequestArgs;
import com.pulumi.gcp.cloudbuild.inputs.TriggerRepositoryEventConfigPushArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerRepositoryEventConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerRepositoryEventConfigArgs Empty = new TriggerRepositoryEventConfigArgs();

    /**
     * Contains filter properties for matching Pull Requests.
     * Structure is documented below.
     * 
     */
    @Import(name="pullRequest")
    private @Nullable Output<TriggerRepositoryEventConfigPullRequestArgs> pullRequest;

    /**
     * @return Contains filter properties for matching Pull Requests.
     * Structure is documented below.
     * 
     */
    public Optional<Output<TriggerRepositoryEventConfigPullRequestArgs>> pullRequest() {
        return Optional.ofNullable(this.pullRequest);
    }

    /**
     * Contains filter properties for matching git pushes.
     * Structure is documented below.
     * 
     */
    @Import(name="push")
    private @Nullable Output<TriggerRepositoryEventConfigPushArgs> push;

    /**
     * @return Contains filter properties for matching git pushes.
     * Structure is documented below.
     * 
     */
    public Optional<Output<TriggerRepositoryEventConfigPushArgs>> push() {
        return Optional.ofNullable(this.push);
    }

    /**
     * The resource name of the Repo API resource.
     * 
     */
    @Import(name="repository")
    private @Nullable Output<String> repository;

    /**
     * @return The resource name of the Repo API resource.
     * 
     */
    public Optional<Output<String>> repository() {
        return Optional.ofNullable(this.repository);
    }

    private TriggerRepositoryEventConfigArgs() {}

    private TriggerRepositoryEventConfigArgs(TriggerRepositoryEventConfigArgs $) {
        this.pullRequest = $.pullRequest;
        this.push = $.push;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerRepositoryEventConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerRepositoryEventConfigArgs $;

        public Builder() {
            $ = new TriggerRepositoryEventConfigArgs();
        }

        public Builder(TriggerRepositoryEventConfigArgs defaults) {
            $ = new TriggerRepositoryEventConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pullRequest Contains filter properties for matching Pull Requests.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pullRequest(@Nullable Output<TriggerRepositoryEventConfigPullRequestArgs> pullRequest) {
            $.pullRequest = pullRequest;
            return this;
        }

        /**
         * @param pullRequest Contains filter properties for matching Pull Requests.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pullRequest(TriggerRepositoryEventConfigPullRequestArgs pullRequest) {
            return pullRequest(Output.of(pullRequest));
        }

        /**
         * @param push Contains filter properties for matching git pushes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder push(@Nullable Output<TriggerRepositoryEventConfigPushArgs> push) {
            $.push = push;
            return this;
        }

        /**
         * @param push Contains filter properties for matching git pushes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder push(TriggerRepositoryEventConfigPushArgs push) {
            return push(Output.of(push));
        }

        /**
         * @param repository The resource name of the Repo API resource.
         * 
         * @return builder
         * 
         */
        public Builder repository(@Nullable Output<String> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository The resource name of the Repo API resource.
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public TriggerRepositoryEventConfigArgs build() {
            return $;
        }
    }

}