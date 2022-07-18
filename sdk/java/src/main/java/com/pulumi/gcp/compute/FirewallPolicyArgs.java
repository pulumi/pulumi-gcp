// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyArgs Empty = new FirewallPolicyArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The parent of the firewall policy.
     * 
     */
    @Import(name="parent", required=true)
    private Output<String> parent;

    /**
     * @return The parent of the firewall policy.
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }

    /**
     * User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="shortName", required=true)
    private Output<String> shortName;

    /**
     * @return User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> shortName() {
        return this.shortName;
    }

    private FirewallPolicyArgs() {}

    private FirewallPolicyArgs(FirewallPolicyArgs $) {
        this.description = $.description;
        this.parent = $.parent;
        this.shortName = $.shortName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyArgs $;

        public Builder() {
            $ = new FirewallPolicyArgs();
        }

        public Builder(FirewallPolicyArgs defaults) {
            $ = new FirewallPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param parent The parent of the firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder parent(Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The parent of the firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param shortName User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder shortName(Output<String> shortName) {
            $.shortName = shortName;
            return this;
        }

        /**
         * @param shortName User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder shortName(String shortName) {
            return shortName(Output.of(shortName));
        }

        public FirewallPolicyArgs build() {
            $.parent = Objects.requireNonNull($.parent, "expected parameter 'parent' to be non-null");
            $.shortName = Objects.requireNonNull($.shortName, "expected parameter 'shortName' to be non-null");
            return $;
        }
    }

}