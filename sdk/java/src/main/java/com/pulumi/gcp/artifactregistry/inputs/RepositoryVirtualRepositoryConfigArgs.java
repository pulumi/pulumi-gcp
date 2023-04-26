// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigUpstreamPolicyArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryVirtualRepositoryConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryVirtualRepositoryConfigArgs Empty = new RepositoryVirtualRepositoryConfigArgs();

    /**
     * Policies that configure the upstream artifacts distributed by the Virtual
     * Repository. Upstream policies cannot be set on a standard repository.
     * Structure is documented below.
     * 
     */
    @Import(name="upstreamPolicies")
    private @Nullable Output<List<RepositoryVirtualRepositoryConfigUpstreamPolicyArgs>> upstreamPolicies;

    /**
     * @return Policies that configure the upstream artifacts distributed by the Virtual
     * Repository. Upstream policies cannot be set on a standard repository.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RepositoryVirtualRepositoryConfigUpstreamPolicyArgs>>> upstreamPolicies() {
        return Optional.ofNullable(this.upstreamPolicies);
    }

    private RepositoryVirtualRepositoryConfigArgs() {}

    private RepositoryVirtualRepositoryConfigArgs(RepositoryVirtualRepositoryConfigArgs $) {
        this.upstreamPolicies = $.upstreamPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryVirtualRepositoryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryVirtualRepositoryConfigArgs $;

        public Builder() {
            $ = new RepositoryVirtualRepositoryConfigArgs();
        }

        public Builder(RepositoryVirtualRepositoryConfigArgs defaults) {
            $ = new RepositoryVirtualRepositoryConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param upstreamPolicies Policies that configure the upstream artifacts distributed by the Virtual
         * Repository. Upstream policies cannot be set on a standard repository.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder upstreamPolicies(@Nullable Output<List<RepositoryVirtualRepositoryConfigUpstreamPolicyArgs>> upstreamPolicies) {
            $.upstreamPolicies = upstreamPolicies;
            return this;
        }

        /**
         * @param upstreamPolicies Policies that configure the upstream artifacts distributed by the Virtual
         * Repository. Upstream policies cannot be set on a standard repository.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder upstreamPolicies(List<RepositoryVirtualRepositoryConfigUpstreamPolicyArgs> upstreamPolicies) {
            return upstreamPolicies(Output.of(upstreamPolicies));
        }

        /**
         * @param upstreamPolicies Policies that configure the upstream artifacts distributed by the Virtual
         * Repository. Upstream policies cannot be set on a standard repository.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder upstreamPolicies(RepositoryVirtualRepositoryConfigUpstreamPolicyArgs... upstreamPolicies) {
            return upstreamPolicies(List.of(upstreamPolicies));
        }

        public RepositoryVirtualRepositoryConfigArgs build() {
            return $;
        }
    }

}