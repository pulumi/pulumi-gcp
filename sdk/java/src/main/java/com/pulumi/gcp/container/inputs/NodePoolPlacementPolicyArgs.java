// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodePoolPlacementPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolPlacementPolicyArgs Empty = new NodePoolPlacementPolicyArgs();

    /**
     * If set, refers to the name of a custom resource policy supplied by the user.
     * The resource policy must be in the same project and region as the node pool.
     * If not found, InvalidArgument error is returned.
     * 
     */
    @Import(name="policyName")
    private @Nullable Output<String> policyName;

    /**
     * @return If set, refers to the name of a custom resource policy supplied by the user.
     * The resource policy must be in the same project and region as the node pool.
     * If not found, InvalidArgument error is returned.
     * 
     */
    public Optional<Output<String>> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    /**
     * The [TPU topology](https://cloud.google.com/kubernetes-engine/docs/concepts/plan-tpus#topology) like `&#34;2x4&#34;` or `&#34;2x2x2&#34;`.
     * 
     */
    @Import(name="tpuTopology")
    private @Nullable Output<String> tpuTopology;

    /**
     * @return The [TPU topology](https://cloud.google.com/kubernetes-engine/docs/concepts/plan-tpus#topology) like `&#34;2x4&#34;` or `&#34;2x2x2&#34;`.
     * 
     */
    public Optional<Output<String>> tpuTopology() {
        return Optional.ofNullable(this.tpuTopology);
    }

    /**
     * The type of the policy. Supports a single value: COMPACT.
     * Specifying COMPACT placement policy type places node pool&#39;s nodes in a closer
     * physical proximity in order to reduce network latency between nodes.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the policy. Supports a single value: COMPACT.
     * Specifying COMPACT placement policy type places node pool&#39;s nodes in a closer
     * physical proximity in order to reduce network latency between nodes.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private NodePoolPlacementPolicyArgs() {}

    private NodePoolPlacementPolicyArgs(NodePoolPlacementPolicyArgs $) {
        this.policyName = $.policyName;
        this.tpuTopology = $.tpuTopology;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolPlacementPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolPlacementPolicyArgs $;

        public Builder() {
            $ = new NodePoolPlacementPolicyArgs();
        }

        public Builder(NodePoolPlacementPolicyArgs defaults) {
            $ = new NodePoolPlacementPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyName If set, refers to the name of a custom resource policy supplied by the user.
         * The resource policy must be in the same project and region as the node pool.
         * If not found, InvalidArgument error is returned.
         * 
         * @return builder
         * 
         */
        public Builder policyName(@Nullable Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName If set, refers to the name of a custom resource policy supplied by the user.
         * The resource policy must be in the same project and region as the node pool.
         * If not found, InvalidArgument error is returned.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        /**
         * @param tpuTopology The [TPU topology](https://cloud.google.com/kubernetes-engine/docs/concepts/plan-tpus#topology) like `&#34;2x4&#34;` or `&#34;2x2x2&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder tpuTopology(@Nullable Output<String> tpuTopology) {
            $.tpuTopology = tpuTopology;
            return this;
        }

        /**
         * @param tpuTopology The [TPU topology](https://cloud.google.com/kubernetes-engine/docs/concepts/plan-tpus#topology) like `&#34;2x4&#34;` or `&#34;2x2x2&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder tpuTopology(String tpuTopology) {
            return tpuTopology(Output.of(tpuTopology));
        }

        /**
         * @param type The type of the policy. Supports a single value: COMPACT.
         * Specifying COMPACT placement policy type places node pool&#39;s nodes in a closer
         * physical proximity in order to reduce network latency between nodes.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the policy. Supports a single value: COMPACT.
         * Specifying COMPACT placement policy type places node pool&#39;s nodes in a closer
         * physical proximity in order to reduce network latency between nodes.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public NodePoolPlacementPolicyArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("NodePoolPlacementPolicyArgs", "type");
            }
            return $;
        }
    }

}
