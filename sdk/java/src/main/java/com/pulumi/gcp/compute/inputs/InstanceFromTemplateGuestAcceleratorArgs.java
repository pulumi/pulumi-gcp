// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InstanceFromTemplateGuestAcceleratorArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateGuestAcceleratorArgs Empty = new InstanceFromTemplateGuestAcceleratorArgs();

    @Import(name="count", required=true)
    private Output<Integer> count;

    public Output<Integer> count() {
        return this.count;
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private InstanceFromTemplateGuestAcceleratorArgs() {}

    private InstanceFromTemplateGuestAcceleratorArgs(InstanceFromTemplateGuestAcceleratorArgs $) {
        this.count = $.count;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromTemplateGuestAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromTemplateGuestAcceleratorArgs $;

        public Builder() {
            $ = new InstanceFromTemplateGuestAcceleratorArgs();
        }

        public Builder(InstanceFromTemplateGuestAcceleratorArgs defaults) {
            $ = new InstanceFromTemplateGuestAcceleratorArgs(Objects.requireNonNull(defaults));
        }

        public Builder count(Output<Integer> count) {
            $.count = count;
            return this;
        }

        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public InstanceFromTemplateGuestAcceleratorArgs build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}