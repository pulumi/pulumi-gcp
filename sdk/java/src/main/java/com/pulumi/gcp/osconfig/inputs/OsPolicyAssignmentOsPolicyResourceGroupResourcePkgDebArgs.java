// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs();

    /**
     * Whether dependencies should also be installed. -
     * install when false: `dpkg -i package` - install when true: `apt-get update
     * &amp;&amp; apt-get -y install package.deb`
     * 
     */
    @Import(name="pullDeps")
    private @Nullable Output<Boolean> pullDeps;

    /**
     * @return Whether dependencies should also be installed. -
     * install when false: `dpkg -i package` - install when true: `apt-get update
     * &amp;&amp; apt-get -y install package.deb`
     * 
     */
    public Optional<Output<Boolean>> pullDeps() {
        return Optional.ofNullable(this.pullDeps);
    }

    /**
     * A deb package. Structure is
     * documented below.
     * 
     */
    @Import(name="source", required=true)
    private Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceArgs> source;

    /**
     * @return A deb package. Structure is
     * documented below.
     * 
     */
    public Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceArgs> source() {
        return this.source;
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs() {}

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs $) {
        this.pullDeps = $.pullDeps;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs();
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs defaults) {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pullDeps Whether dependencies should also be installed. -
         * install when false: `dpkg -i package` - install when true: `apt-get update
         * &amp;&amp; apt-get -y install package.deb`
         * 
         * @return builder
         * 
         */
        public Builder pullDeps(@Nullable Output<Boolean> pullDeps) {
            $.pullDeps = pullDeps;
            return this;
        }

        /**
         * @param pullDeps Whether dependencies should also be installed. -
         * install when false: `dpkg -i package` - install when true: `apt-get update
         * &amp;&amp; apt-get -y install package.deb`
         * 
         * @return builder
         * 
         */
        public Builder pullDeps(Boolean pullDeps) {
            return pullDeps(Output.of(pullDeps));
        }

        /**
         * @param source A deb package. Structure is
         * documented below.
         * 
         * @return builder
         * 
         */
        public Builder source(Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceArgs> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source A deb package. Structure is
         * documented below.
         * 
         * @return builder
         * 
         */
        public Builder source(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceArgs source) {
            return source(Output.of(source));
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs build() {
            if ($.source == null) {
                throw new MissingRequiredPropertyException("OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs", "source");
            }
            return $;
        }
    }

}
