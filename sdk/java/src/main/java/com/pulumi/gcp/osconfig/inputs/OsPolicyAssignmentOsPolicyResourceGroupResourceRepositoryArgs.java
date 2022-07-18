// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYumArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypperArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs();

    /**
     * An Apt Repository.
     * 
     */
    @Import(name="apt")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs> apt;

    /**
     * @return An Apt Repository.
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs>> apt() {
        return Optional.ofNullable(this.apt);
    }

    /**
     * A Goo Repository.
     * 
     */
    @Import(name="goo")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs> goo;

    /**
     * @return A Goo Repository.
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs>> goo() {
        return Optional.ofNullable(this.goo);
    }

    /**
     * A Yum Repository.
     * 
     */
    @Import(name="yum")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYumArgs> yum;

    /**
     * @return A Yum Repository.
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYumArgs>> yum() {
        return Optional.ofNullable(this.yum);
    }

    /**
     * A Zypper Repository.
     * 
     */
    @Import(name="zypper")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypperArgs> zypper;

    /**
     * @return A Zypper Repository.
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypperArgs>> zypper() {
        return Optional.ofNullable(this.zypper);
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs() {}

    private OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs $) {
        this.apt = $.apt;
        this.goo = $.goo;
        this.yum = $.yum;
        this.zypper = $.zypper;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs();
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs defaults) {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apt An Apt Repository.
         * 
         * @return builder
         * 
         */
        public Builder apt(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs> apt) {
            $.apt = apt;
            return this;
        }

        /**
         * @param apt An Apt Repository.
         * 
         * @return builder
         * 
         */
        public Builder apt(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs apt) {
            return apt(Output.of(apt));
        }

        /**
         * @param goo A Goo Repository.
         * 
         * @return builder
         * 
         */
        public Builder goo(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs> goo) {
            $.goo = goo;
            return this;
        }

        /**
         * @param goo A Goo Repository.
         * 
         * @return builder
         * 
         */
        public Builder goo(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs goo) {
            return goo(Output.of(goo));
        }

        /**
         * @param yum A Yum Repository.
         * 
         * @return builder
         * 
         */
        public Builder yum(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYumArgs> yum) {
            $.yum = yum;
            return this;
        }

        /**
         * @param yum A Yum Repository.
         * 
         * @return builder
         * 
         */
        public Builder yum(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYumArgs yum) {
            return yum(Output.of(yum));
        }

        /**
         * @param zypper A Zypper Repository.
         * 
         * @return builder
         * 
         */
        public Builder zypper(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypperArgs> zypper) {
            $.zypper = zypper;
            return this;
        }

        /**
         * @param zypper A Zypper Repository.
         * 
         * @return builder
         * 
         */
        public Builder zypper(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypperArgs zypper) {
            return zypper(Output.of(zypper));
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs build() {
            return $;
        }
    }

}