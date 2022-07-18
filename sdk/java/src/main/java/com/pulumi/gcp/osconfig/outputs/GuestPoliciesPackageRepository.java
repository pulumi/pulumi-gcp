// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.osconfig.outputs.GuestPoliciesPackageRepositoryApt;
import com.pulumi.gcp.osconfig.outputs.GuestPoliciesPackageRepositoryGoo;
import com.pulumi.gcp.osconfig.outputs.GuestPoliciesPackageRepositoryYum;
import com.pulumi.gcp.osconfig.outputs.GuestPoliciesPackageRepositoryZypper;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GuestPoliciesPackageRepository {
    /**
     * @return An Apt Repository.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesPackageRepositoryApt apt;
    /**
     * @return A Goo Repository.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesPackageRepositoryGoo goo;
    /**
     * @return A Yum Repository.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesPackageRepositoryYum yum;
    /**
     * @return A Zypper Repository.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesPackageRepositoryZypper zypper;

    @CustomType.Constructor
    private GuestPoliciesPackageRepository(
        @CustomType.Parameter("apt") @Nullable GuestPoliciesPackageRepositoryApt apt,
        @CustomType.Parameter("goo") @Nullable GuestPoliciesPackageRepositoryGoo goo,
        @CustomType.Parameter("yum") @Nullable GuestPoliciesPackageRepositoryYum yum,
        @CustomType.Parameter("zypper") @Nullable GuestPoliciesPackageRepositoryZypper zypper) {
        this.apt = apt;
        this.goo = goo;
        this.yum = yum;
        this.zypper = zypper;
    }

    /**
     * @return An Apt Repository.
     * Structure is documented below.
     * 
     */
    public Optional<GuestPoliciesPackageRepositoryApt> apt() {
        return Optional.ofNullable(this.apt);
    }
    /**
     * @return A Goo Repository.
     * Structure is documented below.
     * 
     */
    public Optional<GuestPoliciesPackageRepositoryGoo> goo() {
        return Optional.ofNullable(this.goo);
    }
    /**
     * @return A Yum Repository.
     * Structure is documented below.
     * 
     */
    public Optional<GuestPoliciesPackageRepositoryYum> yum() {
        return Optional.ofNullable(this.yum);
    }
    /**
     * @return A Zypper Repository.
     * Structure is documented below.
     * 
     */
    public Optional<GuestPoliciesPackageRepositoryZypper> zypper() {
        return Optional.ofNullable(this.zypper);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesPackageRepository defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GuestPoliciesPackageRepositoryApt apt;
        private @Nullable GuestPoliciesPackageRepositoryGoo goo;
        private @Nullable GuestPoliciesPackageRepositoryYum yum;
        private @Nullable GuestPoliciesPackageRepositoryZypper zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesPackageRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.goo = defaults.goo;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder apt(@Nullable GuestPoliciesPackageRepositoryApt apt) {
            this.apt = apt;
            return this;
        }
        public Builder goo(@Nullable GuestPoliciesPackageRepositoryGoo goo) {
            this.goo = goo;
            return this;
        }
        public Builder yum(@Nullable GuestPoliciesPackageRepositoryYum yum) {
            this.yum = yum;
            return this;
        }
        public Builder zypper(@Nullable GuestPoliciesPackageRepositoryZypper zypper) {
            this.zypper = zypper;
            return this;
        }        public GuestPoliciesPackageRepository build() {
            return new GuestPoliciesPackageRepository(apt, goo, yum, zypper);
        }
    }
}