// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class InstanceFromMachineImageSchedulingNodeAffinityArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageSchedulingNodeAffinityArgs Empty = new InstanceFromMachineImageSchedulingNodeAffinityArgs();

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="operator", required=true)
    private Output<String> operator;

    public Output<String> operator() {
        return this.operator;
    }

    @Import(name="values", required=true)
    private Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    private InstanceFromMachineImageSchedulingNodeAffinityArgs() {}

    private InstanceFromMachineImageSchedulingNodeAffinityArgs(InstanceFromMachineImageSchedulingNodeAffinityArgs $) {
        this.key = $.key;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromMachineImageSchedulingNodeAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromMachineImageSchedulingNodeAffinityArgs $;

        public Builder() {
            $ = new InstanceFromMachineImageSchedulingNodeAffinityArgs();
        }

        public Builder(InstanceFromMachineImageSchedulingNodeAffinityArgs defaults) {
            $ = new InstanceFromMachineImageSchedulingNodeAffinityArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public InstanceFromMachineImageSchedulingNodeAffinityArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}