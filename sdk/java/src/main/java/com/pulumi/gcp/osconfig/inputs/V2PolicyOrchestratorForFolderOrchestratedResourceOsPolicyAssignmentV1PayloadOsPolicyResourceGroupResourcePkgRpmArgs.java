// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs Empty = new V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs();

    /**
     * Whether dependencies should also be installed.
     * - install when false: `rpm --upgrade --replacepkgs package.rpm`
     * - install when true: `yum -y install package.rpm` or
     *   `zypper -y install package.rpm`
     * 
     */
    @Import(name="pullDeps")
    private @Nullable Output<Boolean> pullDeps;

    /**
     * @return Whether dependencies should also be installed.
     * - install when false: `rpm --upgrade --replacepkgs package.rpm`
     * - install when true: `yum -y install package.rpm` or
     *   `zypper -y install package.rpm`
     * 
     */
    public Optional<Output<Boolean>> pullDeps() {
        return Optional.ofNullable(this.pullDeps);
    }

    /**
     * A remote or local file.
     * Structure is documented below.
     * 
     */
    @Import(name="source", required=true)
    private Output<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs> source;

    /**
     * @return A remote or local file.
     * Structure is documented below.
     * 
     */
    public Output<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs> source() {
        return this.source;
    }

    private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs() {}

    private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs $) {
        this.pullDeps = $.pullDeps;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs $;

        public Builder() {
            $ = new V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs();
        }

        public Builder(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs defaults) {
            $ = new V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pullDeps Whether dependencies should also be installed.
         * - install when false: `rpm --upgrade --replacepkgs package.rpm`
         * - install when true: `yum -y install package.rpm` or
         *   `zypper -y install package.rpm`
         * 
         * @return builder
         * 
         */
        public Builder pullDeps(@Nullable Output<Boolean> pullDeps) {
            $.pullDeps = pullDeps;
            return this;
        }

        /**
         * @param pullDeps Whether dependencies should also be installed.
         * - install when false: `rpm --upgrade --replacepkgs package.rpm`
         * - install when true: `yum -y install package.rpm` or
         *   `zypper -y install package.rpm`
         * 
         * @return builder
         * 
         */
        public Builder pullDeps(Boolean pullDeps) {
            return pullDeps(Output.of(pullDeps));
        }

        /**
         * @param source A remote or local file.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder source(Output<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source A remote or local file.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder source(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs source) {
            return source(Output.of(source));
        }

        public V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs build() {
            if ($.source == null) {
                throw new MissingRequiredPropertyException("V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs", "source");
            }
            return $;
        }
    }

}
