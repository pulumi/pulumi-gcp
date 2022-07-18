// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DicomStoreIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DicomStoreIamPolicyArgs Empty = new DicomStoreIamPolicyArgs();

    /**
     * The DICOM store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
     * `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider&#39;s
     * project setting will be used as a fallback.
     * 
     */
    @Import(name="dicomStoreId", required=true)
    private Output<String> dicomStoreId;

    /**
     * @return The DICOM store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
     * `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider&#39;s
     * project setting will be used as a fallback.
     * 
     */
    public Output<String> dicomStoreId() {
        return this.dicomStoreId;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> policyData() {
        return this.policyData;
    }

    private DicomStoreIamPolicyArgs() {}

    private DicomStoreIamPolicyArgs(DicomStoreIamPolicyArgs $) {
        this.dicomStoreId = $.dicomStoreId;
        this.policyData = $.policyData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DicomStoreIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DicomStoreIamPolicyArgs $;

        public Builder() {
            $ = new DicomStoreIamPolicyArgs();
        }

        public Builder(DicomStoreIamPolicyArgs defaults) {
            $ = new DicomStoreIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dicomStoreId The DICOM store ID, in the form
         * `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
         * `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider&#39;s
         * project setting will be used as a fallback.
         * 
         * @return builder
         * 
         */
        public Builder dicomStoreId(Output<String> dicomStoreId) {
            $.dicomStoreId = dicomStoreId;
            return this;
        }

        /**
         * @param dicomStoreId The DICOM store ID, in the form
         * `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
         * `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider&#39;s
         * project setting will be used as a fallback.
         * 
         * @return builder
         * 
         */
        public Builder dicomStoreId(String dicomStoreId) {
            return dicomStoreId(Output.of(dicomStoreId));
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public DicomStoreIamPolicyArgs build() {
            $.dicomStoreId = Objects.requireNonNull($.dicomStoreId, "expected parameter 'dicomStoreId' to be non-null");
            $.policyData = Objects.requireNonNull($.policyData, "expected parameter 'policyData' to be non-null");
            return $;
        }
    }

}