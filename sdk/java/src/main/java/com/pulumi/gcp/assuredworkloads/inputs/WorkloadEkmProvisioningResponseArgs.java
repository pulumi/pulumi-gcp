// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.assuredworkloads.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadEkmProvisioningResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadEkmProvisioningResponseArgs Empty = new WorkloadEkmProvisioningResponseArgs();

    /**
     * Indicates Ekm provisioning error if any. Possible values: EKM_PROVISIONING_ERROR_DOMAIN_UNSPECIFIED, UNSPECIFIED_ERROR, GOOGLE_SERVER_ERROR, EXTERNAL_USER_ERROR, EXTERNAL_PARTNER_ERROR, TIMEOUT_ERROR
     * 
     */
    @Import(name="ekmProvisioningErrorDomain")
    private @Nullable Output<String> ekmProvisioningErrorDomain;

    /**
     * @return Indicates Ekm provisioning error if any. Possible values: EKM_PROVISIONING_ERROR_DOMAIN_UNSPECIFIED, UNSPECIFIED_ERROR, GOOGLE_SERVER_ERROR, EXTERNAL_USER_ERROR, EXTERNAL_PARTNER_ERROR, TIMEOUT_ERROR
     * 
     */
    public Optional<Output<String>> ekmProvisioningErrorDomain() {
        return Optional.ofNullable(this.ekmProvisioningErrorDomain);
    }

    /**
     * Detailed error message if Ekm provisioning fails Possible values: EKM_PROVISIONING_ERROR_MAPPING_UNSPECIFIED, INVALID_SERVICE_ACCOUNT, MISSING_METRICS_SCOPE_ADMIN_PERMISSION, MISSING_EKM_CONNECTION_ADMIN_PERMISSION
     * 
     */
    @Import(name="ekmProvisioningErrorMapping")
    private @Nullable Output<String> ekmProvisioningErrorMapping;

    /**
     * @return Detailed error message if Ekm provisioning fails Possible values: EKM_PROVISIONING_ERROR_MAPPING_UNSPECIFIED, INVALID_SERVICE_ACCOUNT, MISSING_METRICS_SCOPE_ADMIN_PERMISSION, MISSING_EKM_CONNECTION_ADMIN_PERMISSION
     * 
     */
    public Optional<Output<String>> ekmProvisioningErrorMapping() {
        return Optional.ofNullable(this.ekmProvisioningErrorMapping);
    }

    /**
     * Indicates Ekm enrollment Provisioning of a given workload. Possible values: EKM_PROVISIONING_STATE_UNSPECIFIED, EKM_PROVISIONING_STATE_PENDING, EKM_PROVISIONING_STATE_FAILED, EKM_PROVISIONING_STATE_COMPLETED
     * 
     */
    @Import(name="ekmProvisioningState")
    private @Nullable Output<String> ekmProvisioningState;

    /**
     * @return Indicates Ekm enrollment Provisioning of a given workload. Possible values: EKM_PROVISIONING_STATE_UNSPECIFIED, EKM_PROVISIONING_STATE_PENDING, EKM_PROVISIONING_STATE_FAILED, EKM_PROVISIONING_STATE_COMPLETED
     * 
     */
    public Optional<Output<String>> ekmProvisioningState() {
        return Optional.ofNullable(this.ekmProvisioningState);
    }

    private WorkloadEkmProvisioningResponseArgs() {}

    private WorkloadEkmProvisioningResponseArgs(WorkloadEkmProvisioningResponseArgs $) {
        this.ekmProvisioningErrorDomain = $.ekmProvisioningErrorDomain;
        this.ekmProvisioningErrorMapping = $.ekmProvisioningErrorMapping;
        this.ekmProvisioningState = $.ekmProvisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadEkmProvisioningResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadEkmProvisioningResponseArgs $;

        public Builder() {
            $ = new WorkloadEkmProvisioningResponseArgs();
        }

        public Builder(WorkloadEkmProvisioningResponseArgs defaults) {
            $ = new WorkloadEkmProvisioningResponseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ekmProvisioningErrorDomain Indicates Ekm provisioning error if any. Possible values: EKM_PROVISIONING_ERROR_DOMAIN_UNSPECIFIED, UNSPECIFIED_ERROR, GOOGLE_SERVER_ERROR, EXTERNAL_USER_ERROR, EXTERNAL_PARTNER_ERROR, TIMEOUT_ERROR
         * 
         * @return builder
         * 
         */
        public Builder ekmProvisioningErrorDomain(@Nullable Output<String> ekmProvisioningErrorDomain) {
            $.ekmProvisioningErrorDomain = ekmProvisioningErrorDomain;
            return this;
        }

        /**
         * @param ekmProvisioningErrorDomain Indicates Ekm provisioning error if any. Possible values: EKM_PROVISIONING_ERROR_DOMAIN_UNSPECIFIED, UNSPECIFIED_ERROR, GOOGLE_SERVER_ERROR, EXTERNAL_USER_ERROR, EXTERNAL_PARTNER_ERROR, TIMEOUT_ERROR
         * 
         * @return builder
         * 
         */
        public Builder ekmProvisioningErrorDomain(String ekmProvisioningErrorDomain) {
            return ekmProvisioningErrorDomain(Output.of(ekmProvisioningErrorDomain));
        }

        /**
         * @param ekmProvisioningErrorMapping Detailed error message if Ekm provisioning fails Possible values: EKM_PROVISIONING_ERROR_MAPPING_UNSPECIFIED, INVALID_SERVICE_ACCOUNT, MISSING_METRICS_SCOPE_ADMIN_PERMISSION, MISSING_EKM_CONNECTION_ADMIN_PERMISSION
         * 
         * @return builder
         * 
         */
        public Builder ekmProvisioningErrorMapping(@Nullable Output<String> ekmProvisioningErrorMapping) {
            $.ekmProvisioningErrorMapping = ekmProvisioningErrorMapping;
            return this;
        }

        /**
         * @param ekmProvisioningErrorMapping Detailed error message if Ekm provisioning fails Possible values: EKM_PROVISIONING_ERROR_MAPPING_UNSPECIFIED, INVALID_SERVICE_ACCOUNT, MISSING_METRICS_SCOPE_ADMIN_PERMISSION, MISSING_EKM_CONNECTION_ADMIN_PERMISSION
         * 
         * @return builder
         * 
         */
        public Builder ekmProvisioningErrorMapping(String ekmProvisioningErrorMapping) {
            return ekmProvisioningErrorMapping(Output.of(ekmProvisioningErrorMapping));
        }

        /**
         * @param ekmProvisioningState Indicates Ekm enrollment Provisioning of a given workload. Possible values: EKM_PROVISIONING_STATE_UNSPECIFIED, EKM_PROVISIONING_STATE_PENDING, EKM_PROVISIONING_STATE_FAILED, EKM_PROVISIONING_STATE_COMPLETED
         * 
         * @return builder
         * 
         */
        public Builder ekmProvisioningState(@Nullable Output<String> ekmProvisioningState) {
            $.ekmProvisioningState = ekmProvisioningState;
            return this;
        }

        /**
         * @param ekmProvisioningState Indicates Ekm enrollment Provisioning of a given workload. Possible values: EKM_PROVISIONING_STATE_UNSPECIFIED, EKM_PROVISIONING_STATE_PENDING, EKM_PROVISIONING_STATE_FAILED, EKM_PROVISIONING_STATE_COMPLETED
         * 
         * @return builder
         * 
         */
        public Builder ekmProvisioningState(String ekmProvisioningState) {
            return ekmProvisioningState(Output.of(ekmProvisioningState));
        }

        public WorkloadEkmProvisioningResponseArgs build() {
            return $;
        }
    }

}
