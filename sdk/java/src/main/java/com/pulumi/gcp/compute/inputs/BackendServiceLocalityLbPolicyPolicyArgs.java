// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BackendServiceLocalityLbPolicyPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceLocalityLbPolicyPolicyArgs Empty = new BackendServiceLocalityLbPolicyPolicyArgs();

    /**
     * The name of a locality load balancer policy to be used. The value
     * should be one of the predefined ones as supported by localityLbPolicy,
     * although at the moment only ROUND_ROBIN is supported.
     * This field should only be populated when the customPolicy field is not
     * used.
     * Note that specifying the same policy more than once for a backend is
     * not a valid configuration and will be rejected.
     * The possible values are:
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of a locality load balancer policy to be used. The value
     * should be one of the predefined ones as supported by localityLbPolicy,
     * although at the moment only ROUND_ROBIN is supported.
     * This field should only be populated when the customPolicy field is not
     * used.
     * Note that specifying the same policy more than once for a backend is
     * not a valid configuration and will be rejected.
     * The possible values are:
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private BackendServiceLocalityLbPolicyPolicyArgs() {}

    private BackendServiceLocalityLbPolicyPolicyArgs(BackendServiceLocalityLbPolicyPolicyArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceLocalityLbPolicyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceLocalityLbPolicyPolicyArgs $;

        public Builder() {
            $ = new BackendServiceLocalityLbPolicyPolicyArgs();
        }

        public Builder(BackendServiceLocalityLbPolicyPolicyArgs defaults) {
            $ = new BackendServiceLocalityLbPolicyPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of a locality load balancer policy to be used. The value
         * should be one of the predefined ones as supported by localityLbPolicy,
         * although at the moment only ROUND_ROBIN is supported.
         * This field should only be populated when the customPolicy field is not
         * used.
         * Note that specifying the same policy more than once for a backend is
         * not a valid configuration and will be rejected.
         * The possible values are:
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of a locality load balancer policy to be used. The value
         * should be one of the predefined ones as supported by localityLbPolicy,
         * although at the moment only ROUND_ROBIN is supported.
         * This field should only be populated when the customPolicy field is not
         * used.
         * Note that specifying the same policy more than once for a backend is
         * not a valid configuration and will be rejected.
         * The possible values are:
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public BackendServiceLocalityLbPolicyPolicyArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}