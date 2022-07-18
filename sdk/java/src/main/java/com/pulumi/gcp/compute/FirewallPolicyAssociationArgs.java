// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyAssociationArgs Empty = new FirewallPolicyAssociationArgs();

    /**
     * The target that the firewall policy is attached to.
     * 
     */
    @Import(name="attachmentTarget", required=true)
    private Output<String> attachmentTarget;

    /**
     * @return The target that the firewall policy is attached to.
     * 
     */
    public Output<String> attachmentTarget() {
        return this.attachmentTarget;
    }

    /**
     * The firewall policy ID of the association.
     * 
     */
    @Import(name="firewallPolicy", required=true)
    private Output<String> firewallPolicy;

    /**
     * @return The firewall policy ID of the association.
     * 
     */
    public Output<String> firewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * The name for an association.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for an association.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private FirewallPolicyAssociationArgs() {}

    private FirewallPolicyAssociationArgs(FirewallPolicyAssociationArgs $) {
        this.attachmentTarget = $.attachmentTarget;
        this.firewallPolicy = $.firewallPolicy;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyAssociationArgs $;

        public Builder() {
            $ = new FirewallPolicyAssociationArgs();
        }

        public Builder(FirewallPolicyAssociationArgs defaults) {
            $ = new FirewallPolicyAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attachmentTarget The target that the firewall policy is attached to.
         * 
         * @return builder
         * 
         */
        public Builder attachmentTarget(Output<String> attachmentTarget) {
            $.attachmentTarget = attachmentTarget;
            return this;
        }

        /**
         * @param attachmentTarget The target that the firewall policy is attached to.
         * 
         * @return builder
         * 
         */
        public Builder attachmentTarget(String attachmentTarget) {
            return attachmentTarget(Output.of(attachmentTarget));
        }

        /**
         * @param firewallPolicy The firewall policy ID of the association.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicy(Output<String> firewallPolicy) {
            $.firewallPolicy = firewallPolicy;
            return this;
        }

        /**
         * @param firewallPolicy The firewall policy ID of the association.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicy(String firewallPolicy) {
            return firewallPolicy(Output.of(firewallPolicy));
        }

        /**
         * @param name The name for an association.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for an association.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public FirewallPolicyAssociationArgs build() {
            $.attachmentTarget = Objects.requireNonNull($.attachmentTarget, "expected parameter 'attachmentTarget' to be non-null");
            $.firewallPolicy = Objects.requireNonNull($.firewallPolicy, "expected parameter 'firewallPolicy' to be non-null");
            return $;
        }
    }

}