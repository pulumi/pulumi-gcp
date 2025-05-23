// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.workbench.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGceSetupConfidentialInstanceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGceSetupConfidentialInstanceConfigArgs Empty = new InstanceGceSetupConfidentialInstanceConfigArgs();

    /**
     * Defines the type of technology used by the confidential instance.
     * Possible values are: `SEV`.
     * 
     */
    @Import(name="confidentialInstanceType")
    private @Nullable Output<String> confidentialInstanceType;

    /**
     * @return Defines the type of technology used by the confidential instance.
     * Possible values are: `SEV`.
     * 
     */
    public Optional<Output<String>> confidentialInstanceType() {
        return Optional.ofNullable(this.confidentialInstanceType);
    }

    private InstanceGceSetupConfidentialInstanceConfigArgs() {}

    private InstanceGceSetupConfidentialInstanceConfigArgs(InstanceGceSetupConfidentialInstanceConfigArgs $) {
        this.confidentialInstanceType = $.confidentialInstanceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGceSetupConfidentialInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGceSetupConfidentialInstanceConfigArgs $;

        public Builder() {
            $ = new InstanceGceSetupConfidentialInstanceConfigArgs();
        }

        public Builder(InstanceGceSetupConfidentialInstanceConfigArgs defaults) {
            $ = new InstanceGceSetupConfidentialInstanceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param confidentialInstanceType Defines the type of technology used by the confidential instance.
         * Possible values are: `SEV`.
         * 
         * @return builder
         * 
         */
        public Builder confidentialInstanceType(@Nullable Output<String> confidentialInstanceType) {
            $.confidentialInstanceType = confidentialInstanceType;
            return this;
        }

        /**
         * @param confidentialInstanceType Defines the type of technology used by the confidential instance.
         * Possible values are: `SEV`.
         * 
         * @return builder
         * 
         */
        public Builder confidentialInstanceType(String confidentialInstanceType) {
            return confidentialInstanceType(Output.of(confidentialInstanceType));
        }

        public InstanceGceSetupConfidentialInstanceConfigArgs build() {
            return $;
        }
    }

}
