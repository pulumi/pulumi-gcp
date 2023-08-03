// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VMwareNodePoolConfigVsphereConfigTag {
    /**
     * @return (Output)
     * The Vsphere tag category.
     * 
     */
    private @Nullable String category;
    /**
     * @return (Output)
     * The Vsphere tag name.
     * 
     * ***
     * 
     */
    private @Nullable String tag;

    private VMwareNodePoolConfigVsphereConfigTag() {}
    /**
     * @return (Output)
     * The Vsphere tag category.
     * 
     */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }
    /**
     * @return (Output)
     * The Vsphere tag name.
     * 
     * ***
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareNodePoolConfigVsphereConfigTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String category;
        private @Nullable String tag;
        public Builder() {}
        public Builder(VMwareNodePoolConfigVsphereConfigTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.tag = defaults.tag;
        }

        @CustomType.Setter
        public Builder category(@Nullable String category) {
            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }
        public VMwareNodePoolConfigVsphereConfigTag build() {
            final var o = new VMwareNodePoolConfigVsphereConfigTag();
            o.category = category;
            o.tag = tag;
            return o;
        }
    }
}