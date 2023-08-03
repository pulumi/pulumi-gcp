// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.gkeonprem.outputs.VMwareNodePoolConfigVsphereConfigTag;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VMwareNodePoolConfigVsphereConfig {
    /**
     * @return (Output)
     * The name of the vCenter datastore. Inherited from the user cluster.
     * 
     */
    private @Nullable String datastore;
    /**
     * @return (Output)
     * Tags to apply to VMs.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nested_tags&#34;&gt;&lt;/a&gt;The `tags` block contains:
     * 
     */
    private @Nullable List<VMwareNodePoolConfigVsphereConfigTag> tags;

    private VMwareNodePoolConfigVsphereConfig() {}
    /**
     * @return (Output)
     * The name of the vCenter datastore. Inherited from the user cluster.
     * 
     */
    public Optional<String> datastore() {
        return Optional.ofNullable(this.datastore);
    }
    /**
     * @return (Output)
     * Tags to apply to VMs.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nested_tags&#34;&gt;&lt;/a&gt;The `tags` block contains:
     * 
     */
    public List<VMwareNodePoolConfigVsphereConfigTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareNodePoolConfigVsphereConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String datastore;
        private @Nullable List<VMwareNodePoolConfigVsphereConfigTag> tags;
        public Builder() {}
        public Builder(VMwareNodePoolConfigVsphereConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastore = defaults.datastore;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder datastore(@Nullable String datastore) {
            this.datastore = datastore;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<VMwareNodePoolConfigVsphereConfigTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(VMwareNodePoolConfigVsphereConfigTag... tags) {
            return tags(List.of(tags));
        }
        public VMwareNodePoolConfigVsphereConfig build() {
            final var o = new VMwareNodePoolConfigVsphereConfig();
            o.datastore = datastore;
            o.tags = tags;
            return o;
        }
    }
}