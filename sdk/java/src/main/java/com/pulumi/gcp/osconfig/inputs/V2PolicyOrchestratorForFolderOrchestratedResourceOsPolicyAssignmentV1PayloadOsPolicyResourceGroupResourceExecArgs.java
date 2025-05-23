// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceArgs;
import com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs Empty = new V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs();

    /**
     * A file or script to execute.
     * Structure is documented below.
     * 
     */
    @Import(name="enforce")
    private @Nullable Output<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceArgs> enforce;

    /**
     * @return A file or script to execute.
     * Structure is documented below.
     * 
     */
    public Optional<Output<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceArgs>> enforce() {
        return Optional.ofNullable(this.enforce);
    }

    /**
     * A file or script to execute.
     * Structure is documented below.
     * 
     */
    @Import(name="validate", required=true)
    private Output<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateArgs> validate;

    /**
     * @return A file or script to execute.
     * Structure is documented below.
     * 
     */
    public Output<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateArgs> validate() {
        return this.validate;
    }

    private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs() {}

    private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs $) {
        this.enforce = $.enforce;
        this.validate = $.validate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs $;

        public Builder() {
            $ = new V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs();
        }

        public Builder(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs defaults) {
            $ = new V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enforce A file or script to execute.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder enforce(@Nullable Output<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceArgs> enforce) {
            $.enforce = enforce;
            return this;
        }

        /**
         * @param enforce A file or script to execute.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder enforce(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceArgs enforce) {
            return enforce(Output.of(enforce));
        }

        /**
         * @param validate A file or script to execute.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder validate(Output<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateArgs> validate) {
            $.validate = validate;
            return this;
        }

        /**
         * @param validate A file or script to execute.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder validate(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateArgs validate) {
            return validate(Output.of(validate));
        }

        public V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs build() {
            if ($.validate == null) {
                throw new MissingRequiredPropertyException("V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs", "validate");
            }
            return $;
        }
    }

}
