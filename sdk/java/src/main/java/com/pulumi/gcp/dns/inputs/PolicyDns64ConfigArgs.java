// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.dns.inputs.PolicyDns64ConfigScopeArgs;
import java.util.Objects;


public final class PolicyDns64ConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyDns64ConfigArgs Empty = new PolicyDns64ConfigArgs();

    /**
     * The scope to which DNS64 config will be applied to.
     * 
     */
    @Import(name="scope", required=true)
    private Output<PolicyDns64ConfigScopeArgs> scope;

    /**
     * @return The scope to which DNS64 config will be applied to.
     * 
     */
    public Output<PolicyDns64ConfigScopeArgs> scope() {
        return this.scope;
    }

    private PolicyDns64ConfigArgs() {}

    private PolicyDns64ConfigArgs(PolicyDns64ConfigArgs $) {
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyDns64ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyDns64ConfigArgs $;

        public Builder() {
            $ = new PolicyDns64ConfigArgs();
        }

        public Builder(PolicyDns64ConfigArgs defaults) {
            $ = new PolicyDns64ConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scope The scope to which DNS64 config will be applied to.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<PolicyDns64ConfigScopeArgs> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope to which DNS64 config will be applied to.
         * 
         * @return builder
         * 
         */
        public Builder scope(PolicyDns64ConfigScopeArgs scope) {
            return scope(Output.of(scope));
        }

        public PolicyDns64ConfigArgs build() {
            if ($.scope == null) {
                throw new MissingRequiredPropertyException("PolicyDns64ConfigArgs", "scope");
            }
            return $;
        }
    }

}
