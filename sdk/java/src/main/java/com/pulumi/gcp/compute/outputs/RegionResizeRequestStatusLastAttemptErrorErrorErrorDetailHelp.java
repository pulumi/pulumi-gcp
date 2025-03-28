// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpLink;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelp {
    /**
     * @return (Output)
     * A nested object resource.
     * Structure is documented below.
     * 
     */
    private @Nullable List<RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpLink> links;

    private RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelp() {}
    /**
     * @return (Output)
     * A nested object resource.
     * Structure is documented below.
     * 
     */
    public List<RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpLink> links() {
        return this.links == null ? List.of() : this.links;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpLink> links;
        public Builder() {}
        public Builder(RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.links = defaults.links;
        }

        @CustomType.Setter
        public Builder links(@Nullable List<RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpLink> links) {

            this.links = links;
            return this;
        }
        public Builder links(RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpLink... links) {
            return links(List.of(links));
        }
        public RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelp build() {
            final var _resultValue = new RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelp();
            _resultValue.links = links;
            return _resultValue;
        }
    }
}
