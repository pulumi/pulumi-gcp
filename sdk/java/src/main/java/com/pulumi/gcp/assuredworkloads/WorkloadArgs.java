// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.assuredworkloads;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.assuredworkloads.inputs.WorkloadKmsSettingsArgs;
import com.pulumi.gcp.assuredworkloads.inputs.WorkloadPartnerPermissionsArgs;
import com.pulumi.gcp.assuredworkloads.inputs.WorkloadResourceSettingArgs;
import com.pulumi.gcp.assuredworkloads.inputs.WorkloadWorkloadOptionsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadArgs Empty = new WorkloadArgs();

    /**
     * Optional. Input only. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
     * 
     */
    @Import(name="billingAccount")
    private @Nullable Output<String> billingAccount;

    /**
     * @return Optional. Input only. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
     * 
     */
    public Optional<Output<String>> billingAccount() {
        return Optional.ofNullable(this.billingAccount);
    }

    /**
     * Required. Immutable. Compliance Regime associated with this workload. Possible values: COMPLIANCE_REGIME_UNSPECIFIED, IL4, CJIS, FEDRAMP_HIGH, FEDRAMP_MODERATE, US_REGIONAL_ACCESS, HIPAA, HITRUST, EU_REGIONS_AND_SUPPORT, CA_REGIONS_AND_SUPPORT, ITAR, AU_REGIONS_AND_US_SUPPORT, ASSURED_WORKLOADS_FOR_PARTNERS, ISR_REGIONS, ISR_REGIONS_AND_SUPPORT, CA_PROTECTED_B, IL5, IL2, JP_REGIONS_AND_SUPPORT, KSA_REGIONS_AND_SUPPORT_WITH_SOVEREIGNTY_CONTROLS, REGIONAL_CONTROLS, HEALTHCARE_AND_LIFE_SCIENCES_CONTROLS, HEALTHCARE_AND_LIFE_SCIENCES_CONTROLS_US_SUPPORT, IRS_1075
     * 
     */
    @Import(name="complianceRegime", required=true)
    private Output<String> complianceRegime;

    /**
     * @return Required. Immutable. Compliance Regime associated with this workload. Possible values: COMPLIANCE_REGIME_UNSPECIFIED, IL4, CJIS, FEDRAMP_HIGH, FEDRAMP_MODERATE, US_REGIONAL_ACCESS, HIPAA, HITRUST, EU_REGIONS_AND_SUPPORT, CA_REGIONS_AND_SUPPORT, ITAR, AU_REGIONS_AND_US_SUPPORT, ASSURED_WORKLOADS_FOR_PARTNERS, ISR_REGIONS, ISR_REGIONS_AND_SUPPORT, CA_PROTECTED_B, IL5, IL2, JP_REGIONS_AND_SUPPORT, KSA_REGIONS_AND_SUPPORT_WITH_SOVEREIGNTY_CONTROLS, REGIONAL_CONTROLS, HEALTHCARE_AND_LIFE_SCIENCES_CONTROLS, HEALTHCARE_AND_LIFE_SCIENCES_CONTROLS_US_SUPPORT, IRS_1075
     * 
     */
    public Output<String> complianceRegime() {
        return this.complianceRegime;
    }

    /**
     * Required. The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return Required. The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Optional. Indicates the sovereignty status of the given workload. Currently meant to be used by Europe/Canada customers.
     * 
     */
    @Import(name="enableSovereignControls")
    private @Nullable Output<Boolean> enableSovereignControls;

    /**
     * @return Optional. Indicates the sovereignty status of the given workload. Currently meant to be used by Europe/Canada customers.
     * 
     */
    public Optional<Output<Boolean>> enableSovereignControls() {
        return Optional.ofNullable(this.enableSovereignControls);
    }

    /**
     * **DEPRECATED** Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
     * 
     */
    @Import(name="kmsSettings")
    private @Nullable Output<WorkloadKmsSettingsArgs> kmsSettings;

    /**
     * @return **DEPRECATED** Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
     * 
     */
    public Optional<Output<WorkloadKmsSettingsArgs>> kmsSettings() {
        return Optional.ofNullable(this.kmsSettings);
    }

    /**
     * Optional. Labels applied to the workload.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Labels applied to the workload.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The organization for the resource
     * 
     * ***
     * 
     */
    @Import(name="organization", required=true)
    private Output<String> organization;

    /**
     * @return The organization for the resource
     * 
     * ***
     * 
     */
    public Output<String> organization() {
        return this.organization;
    }

    /**
     * Optional. Partner regime associated with this workload. Possible values: PARTNER_UNSPECIFIED, LOCAL_CONTROLS_BY_S3NS, SOVEREIGN_CONTROLS_BY_T_SYSTEMS, SOVEREIGN_CONTROLS_BY_SIA_MINSAIT, SOVEREIGN_CONTROLS_BY_PSN, SOVEREIGN_CONTROLS_BY_CNTXT, SOVEREIGN_CONTROLS_BY_CNTXT_NO_EKM
     * 
     */
    @Import(name="partner")
    private @Nullable Output<String> partner;

    /**
     * @return Optional. Partner regime associated with this workload. Possible values: PARTNER_UNSPECIFIED, LOCAL_CONTROLS_BY_S3NS, SOVEREIGN_CONTROLS_BY_T_SYSTEMS, SOVEREIGN_CONTROLS_BY_SIA_MINSAIT, SOVEREIGN_CONTROLS_BY_PSN, SOVEREIGN_CONTROLS_BY_CNTXT, SOVEREIGN_CONTROLS_BY_CNTXT_NO_EKM
     * 
     */
    public Optional<Output<String>> partner() {
        return Optional.ofNullable(this.partner);
    }

    /**
     * Optional. Permissions granted to the AW Partner SA account for the customer workload
     * 
     */
    @Import(name="partnerPermissions")
    private @Nullable Output<WorkloadPartnerPermissionsArgs> partnerPermissions;

    /**
     * @return Optional. Permissions granted to the AW Partner SA account for the customer workload
     * 
     */
    public Optional<Output<WorkloadPartnerPermissionsArgs>> partnerPermissions() {
        return Optional.ofNullable(this.partnerPermissions);
    }

    /**
     * Optional. Input only. Billing account necessary for purchasing services from Sovereign Partners. This field is required for creating SIA/PSN/CNTXT partner workloads. The caller should have &#39;billing.resourceAssociations.create&#39; IAM permission on this billing-account. The format of this string is billingAccounts/AAAAAA-BBBBBB-CCCCCC.
     * 
     */
    @Import(name="partnerServicesBillingAccount")
    private @Nullable Output<String> partnerServicesBillingAccount;

    /**
     * @return Optional. Input only. Billing account necessary for purchasing services from Sovereign Partners. This field is required for creating SIA/PSN/CNTXT partner workloads. The caller should have &#39;billing.resourceAssociations.create&#39; IAM permission on this billing-account. The format of this string is billingAccounts/AAAAAA-BBBBBB-CCCCCC.
     * 
     */
    public Optional<Output<String>> partnerServicesBillingAccount() {
        return Optional.ofNullable(this.partnerServicesBillingAccount);
    }

    /**
     * Input only. The parent resource for the resources managed by this Assured Workload. May be either empty or a folder resource which is a child of the Workload parent. If not specified all resources are created under the parent organization. Format: folders/{folder_id}
     * 
     */
    @Import(name="provisionedResourcesParent")
    private @Nullable Output<String> provisionedResourcesParent;

    /**
     * @return Input only. The parent resource for the resources managed by this Assured Workload. May be either empty or a folder resource which is a child of the Workload parent. If not specified all resources are created under the parent organization. Format: folders/{folder_id}
     * 
     */
    public Optional<Output<String>> provisionedResourcesParent() {
        return Optional.ofNullable(this.provisionedResourcesParent);
    }

    /**
     * Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
     * 
     */
    @Import(name="resourceSettings")
    private @Nullable Output<List<WorkloadResourceSettingArgs>> resourceSettings;

    /**
     * @return Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
     * 
     */
    public Optional<Output<List<WorkloadResourceSettingArgs>>> resourceSettings() {
        return Optional.ofNullable(this.resourceSettings);
    }

    /**
     * Optional. Indicates whether the e-mail notification for a violation is enabled for a workload. This value will be by default True, and if not present will be considered as true. This should only be updated via updateWorkload call. Any Changes to this field during the createWorkload call will not be honored. This will always be true while creating the workload.
     * 
     */
    @Import(name="violationNotificationsEnabled")
    private @Nullable Output<Boolean> violationNotificationsEnabled;

    /**
     * @return Optional. Indicates whether the e-mail notification for a violation is enabled for a workload. This value will be by default True, and if not present will be considered as true. This should only be updated via updateWorkload call. Any Changes to this field during the createWorkload call will not be honored. This will always be true while creating the workload.
     * 
     */
    public Optional<Output<Boolean>> violationNotificationsEnabled() {
        return Optional.ofNullable(this.violationNotificationsEnabled);
    }

    /**
     * Optional. Used to specify certain options for a workload during workload creation - currently only supporting KAT Optionality for Regional Controls workloads.
     * 
     */
    @Import(name="workloadOptions")
    private @Nullable Output<WorkloadWorkloadOptionsArgs> workloadOptions;

    /**
     * @return Optional. Used to specify certain options for a workload during workload creation - currently only supporting KAT Optionality for Regional Controls workloads.
     * 
     */
    public Optional<Output<WorkloadWorkloadOptionsArgs>> workloadOptions() {
        return Optional.ofNullable(this.workloadOptions);
    }

    private WorkloadArgs() {}

    private WorkloadArgs(WorkloadArgs $) {
        this.billingAccount = $.billingAccount;
        this.complianceRegime = $.complianceRegime;
        this.displayName = $.displayName;
        this.enableSovereignControls = $.enableSovereignControls;
        this.kmsSettings = $.kmsSettings;
        this.labels = $.labels;
        this.location = $.location;
        this.organization = $.organization;
        this.partner = $.partner;
        this.partnerPermissions = $.partnerPermissions;
        this.partnerServicesBillingAccount = $.partnerServicesBillingAccount;
        this.provisionedResourcesParent = $.provisionedResourcesParent;
        this.resourceSettings = $.resourceSettings;
        this.violationNotificationsEnabled = $.violationNotificationsEnabled;
        this.workloadOptions = $.workloadOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadArgs $;

        public Builder() {
            $ = new WorkloadArgs();
        }

        public Builder(WorkloadArgs defaults) {
            $ = new WorkloadArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param billingAccount Optional. Input only. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
         * 
         * @return builder
         * 
         */
        public Builder billingAccount(@Nullable Output<String> billingAccount) {
            $.billingAccount = billingAccount;
            return this;
        }

        /**
         * @param billingAccount Optional. Input only. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
         * 
         * @return builder
         * 
         */
        public Builder billingAccount(String billingAccount) {
            return billingAccount(Output.of(billingAccount));
        }

        /**
         * @param complianceRegime Required. Immutable. Compliance Regime associated with this workload. Possible values: COMPLIANCE_REGIME_UNSPECIFIED, IL4, CJIS, FEDRAMP_HIGH, FEDRAMP_MODERATE, US_REGIONAL_ACCESS, HIPAA, HITRUST, EU_REGIONS_AND_SUPPORT, CA_REGIONS_AND_SUPPORT, ITAR, AU_REGIONS_AND_US_SUPPORT, ASSURED_WORKLOADS_FOR_PARTNERS, ISR_REGIONS, ISR_REGIONS_AND_SUPPORT, CA_PROTECTED_B, IL5, IL2, JP_REGIONS_AND_SUPPORT, KSA_REGIONS_AND_SUPPORT_WITH_SOVEREIGNTY_CONTROLS, REGIONAL_CONTROLS, HEALTHCARE_AND_LIFE_SCIENCES_CONTROLS, HEALTHCARE_AND_LIFE_SCIENCES_CONTROLS_US_SUPPORT, IRS_1075
         * 
         * @return builder
         * 
         */
        public Builder complianceRegime(Output<String> complianceRegime) {
            $.complianceRegime = complianceRegime;
            return this;
        }

        /**
         * @param complianceRegime Required. Immutable. Compliance Regime associated with this workload. Possible values: COMPLIANCE_REGIME_UNSPECIFIED, IL4, CJIS, FEDRAMP_HIGH, FEDRAMP_MODERATE, US_REGIONAL_ACCESS, HIPAA, HITRUST, EU_REGIONS_AND_SUPPORT, CA_REGIONS_AND_SUPPORT, ITAR, AU_REGIONS_AND_US_SUPPORT, ASSURED_WORKLOADS_FOR_PARTNERS, ISR_REGIONS, ISR_REGIONS_AND_SUPPORT, CA_PROTECTED_B, IL5, IL2, JP_REGIONS_AND_SUPPORT, KSA_REGIONS_AND_SUPPORT_WITH_SOVEREIGNTY_CONTROLS, REGIONAL_CONTROLS, HEALTHCARE_AND_LIFE_SCIENCES_CONTROLS, HEALTHCARE_AND_LIFE_SCIENCES_CONTROLS_US_SUPPORT, IRS_1075
         * 
         * @return builder
         * 
         */
        public Builder complianceRegime(String complianceRegime) {
            return complianceRegime(Output.of(complianceRegime));
        }

        /**
         * @param displayName Required. The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Required. The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enableSovereignControls Optional. Indicates the sovereignty status of the given workload. Currently meant to be used by Europe/Canada customers.
         * 
         * @return builder
         * 
         */
        public Builder enableSovereignControls(@Nullable Output<Boolean> enableSovereignControls) {
            $.enableSovereignControls = enableSovereignControls;
            return this;
        }

        /**
         * @param enableSovereignControls Optional. Indicates the sovereignty status of the given workload. Currently meant to be used by Europe/Canada customers.
         * 
         * @return builder
         * 
         */
        public Builder enableSovereignControls(Boolean enableSovereignControls) {
            return enableSovereignControls(Output.of(enableSovereignControls));
        }

        /**
         * @param kmsSettings **DEPRECATED** Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
         * 
         * @return builder
         * 
         */
        public Builder kmsSettings(@Nullable Output<WorkloadKmsSettingsArgs> kmsSettings) {
            $.kmsSettings = kmsSettings;
            return this;
        }

        /**
         * @param kmsSettings **DEPRECATED** Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
         * 
         * @return builder
         * 
         */
        public Builder kmsSettings(WorkloadKmsSettingsArgs kmsSettings) {
            return kmsSettings(Output.of(kmsSettings));
        }

        /**
         * @param labels Optional. Labels applied to the workload.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. Labels applied to the workload.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param organization The organization for the resource
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder organization(Output<String> organization) {
            $.organization = organization;
            return this;
        }

        /**
         * @param organization The organization for the resource
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder organization(String organization) {
            return organization(Output.of(organization));
        }

        /**
         * @param partner Optional. Partner regime associated with this workload. Possible values: PARTNER_UNSPECIFIED, LOCAL_CONTROLS_BY_S3NS, SOVEREIGN_CONTROLS_BY_T_SYSTEMS, SOVEREIGN_CONTROLS_BY_SIA_MINSAIT, SOVEREIGN_CONTROLS_BY_PSN, SOVEREIGN_CONTROLS_BY_CNTXT, SOVEREIGN_CONTROLS_BY_CNTXT_NO_EKM
         * 
         * @return builder
         * 
         */
        public Builder partner(@Nullable Output<String> partner) {
            $.partner = partner;
            return this;
        }

        /**
         * @param partner Optional. Partner regime associated with this workload. Possible values: PARTNER_UNSPECIFIED, LOCAL_CONTROLS_BY_S3NS, SOVEREIGN_CONTROLS_BY_T_SYSTEMS, SOVEREIGN_CONTROLS_BY_SIA_MINSAIT, SOVEREIGN_CONTROLS_BY_PSN, SOVEREIGN_CONTROLS_BY_CNTXT, SOVEREIGN_CONTROLS_BY_CNTXT_NO_EKM
         * 
         * @return builder
         * 
         */
        public Builder partner(String partner) {
            return partner(Output.of(partner));
        }

        /**
         * @param partnerPermissions Optional. Permissions granted to the AW Partner SA account for the customer workload
         * 
         * @return builder
         * 
         */
        public Builder partnerPermissions(@Nullable Output<WorkloadPartnerPermissionsArgs> partnerPermissions) {
            $.partnerPermissions = partnerPermissions;
            return this;
        }

        /**
         * @param partnerPermissions Optional. Permissions granted to the AW Partner SA account for the customer workload
         * 
         * @return builder
         * 
         */
        public Builder partnerPermissions(WorkloadPartnerPermissionsArgs partnerPermissions) {
            return partnerPermissions(Output.of(partnerPermissions));
        }

        /**
         * @param partnerServicesBillingAccount Optional. Input only. Billing account necessary for purchasing services from Sovereign Partners. This field is required for creating SIA/PSN/CNTXT partner workloads. The caller should have &#39;billing.resourceAssociations.create&#39; IAM permission on this billing-account. The format of this string is billingAccounts/AAAAAA-BBBBBB-CCCCCC.
         * 
         * @return builder
         * 
         */
        public Builder partnerServicesBillingAccount(@Nullable Output<String> partnerServicesBillingAccount) {
            $.partnerServicesBillingAccount = partnerServicesBillingAccount;
            return this;
        }

        /**
         * @param partnerServicesBillingAccount Optional. Input only. Billing account necessary for purchasing services from Sovereign Partners. This field is required for creating SIA/PSN/CNTXT partner workloads. The caller should have &#39;billing.resourceAssociations.create&#39; IAM permission on this billing-account. The format of this string is billingAccounts/AAAAAA-BBBBBB-CCCCCC.
         * 
         * @return builder
         * 
         */
        public Builder partnerServicesBillingAccount(String partnerServicesBillingAccount) {
            return partnerServicesBillingAccount(Output.of(partnerServicesBillingAccount));
        }

        /**
         * @param provisionedResourcesParent Input only. The parent resource for the resources managed by this Assured Workload. May be either empty or a folder resource which is a child of the Workload parent. If not specified all resources are created under the parent organization. Format: folders/{folder_id}
         * 
         * @return builder
         * 
         */
        public Builder provisionedResourcesParent(@Nullable Output<String> provisionedResourcesParent) {
            $.provisionedResourcesParent = provisionedResourcesParent;
            return this;
        }

        /**
         * @param provisionedResourcesParent Input only. The parent resource for the resources managed by this Assured Workload. May be either empty or a folder resource which is a child of the Workload parent. If not specified all resources are created under the parent organization. Format: folders/{folder_id}
         * 
         * @return builder
         * 
         */
        public Builder provisionedResourcesParent(String provisionedResourcesParent) {
            return provisionedResourcesParent(Output.of(provisionedResourcesParent));
        }

        /**
         * @param resourceSettings Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
         * 
         * @return builder
         * 
         */
        public Builder resourceSettings(@Nullable Output<List<WorkloadResourceSettingArgs>> resourceSettings) {
            $.resourceSettings = resourceSettings;
            return this;
        }

        /**
         * @param resourceSettings Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
         * 
         * @return builder
         * 
         */
        public Builder resourceSettings(List<WorkloadResourceSettingArgs> resourceSettings) {
            return resourceSettings(Output.of(resourceSettings));
        }

        /**
         * @param resourceSettings Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
         * 
         * @return builder
         * 
         */
        public Builder resourceSettings(WorkloadResourceSettingArgs... resourceSettings) {
            return resourceSettings(List.of(resourceSettings));
        }

        /**
         * @param violationNotificationsEnabled Optional. Indicates whether the e-mail notification for a violation is enabled for a workload. This value will be by default True, and if not present will be considered as true. This should only be updated via updateWorkload call. Any Changes to this field during the createWorkload call will not be honored. This will always be true while creating the workload.
         * 
         * @return builder
         * 
         */
        public Builder violationNotificationsEnabled(@Nullable Output<Boolean> violationNotificationsEnabled) {
            $.violationNotificationsEnabled = violationNotificationsEnabled;
            return this;
        }

        /**
         * @param violationNotificationsEnabled Optional. Indicates whether the e-mail notification for a violation is enabled for a workload. This value will be by default True, and if not present will be considered as true. This should only be updated via updateWorkload call. Any Changes to this field during the createWorkload call will not be honored. This will always be true while creating the workload.
         * 
         * @return builder
         * 
         */
        public Builder violationNotificationsEnabled(Boolean violationNotificationsEnabled) {
            return violationNotificationsEnabled(Output.of(violationNotificationsEnabled));
        }

        /**
         * @param workloadOptions Optional. Used to specify certain options for a workload during workload creation - currently only supporting KAT Optionality for Regional Controls workloads.
         * 
         * @return builder
         * 
         */
        public Builder workloadOptions(@Nullable Output<WorkloadWorkloadOptionsArgs> workloadOptions) {
            $.workloadOptions = workloadOptions;
            return this;
        }

        /**
         * @param workloadOptions Optional. Used to specify certain options for a workload during workload creation - currently only supporting KAT Optionality for Regional Controls workloads.
         * 
         * @return builder
         * 
         */
        public Builder workloadOptions(WorkloadWorkloadOptionsArgs workloadOptions) {
            return workloadOptions(Output.of(workloadOptions));
        }

        public WorkloadArgs build() {
            if ($.complianceRegime == null) {
                throw new MissingRequiredPropertyException("WorkloadArgs", "complianceRegime");
            }
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("WorkloadArgs", "displayName");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("WorkloadArgs", "location");
            }
            if ($.organization == null) {
                throw new MissingRequiredPropertyException("WorkloadArgs", "organization");
            }
            return $;
        }
    }

}
