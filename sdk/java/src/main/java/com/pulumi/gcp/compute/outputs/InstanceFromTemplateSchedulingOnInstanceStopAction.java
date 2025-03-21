// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceFromTemplateSchedulingOnInstanceStopAction {
    /**
     * @return If true, the contents of any attached Local SSD disks will be discarded.
     * 
     */
    private @Nullable Boolean discardLocalSsd;

    private InstanceFromTemplateSchedulingOnInstanceStopAction() {}
    /**
     * @return If true, the contents of any attached Local SSD disks will be discarded.
     * 
     */
    public Optional<Boolean> discardLocalSsd() {
        return Optional.ofNullable(this.discardLocalSsd);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateSchedulingOnInstanceStopAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean discardLocalSsd;
        public Builder() {}
        public Builder(InstanceFromTemplateSchedulingOnInstanceStopAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.discardLocalSsd = defaults.discardLocalSsd;
        }

        @CustomType.Setter
        public Builder discardLocalSsd(@Nullable Boolean discardLocalSsd) {

            this.discardLocalSsd = discardLocalSsd;
            return this;
        }
        public InstanceFromTemplateSchedulingOnInstanceStopAction build() {
            final var _resultValue = new InstanceFromTemplateSchedulingOnInstanceStopAction();
            _resultValue.discardLocalSsd = discardLocalSsd;
            return _resultValue;
        }
    }
}
