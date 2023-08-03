// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHl7V2StoreIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHl7V2StoreIamPolicyArgs Empty = new GetHl7V2StoreIamPolicyArgs();

    /**
     * The HL7v2 store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
     * `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider&#39;s
     * project setting will be used as a fallback.
     * 
     */
    @Import(name="hl7V2StoreId", required=true)
    private Output<String> hl7V2StoreId;

    /**
     * @return The HL7v2 store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
     * `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider&#39;s
     * project setting will be used as a fallback.
     * 
     */
    public Output<String> hl7V2StoreId() {
        return this.hl7V2StoreId;
    }

    private GetHl7V2StoreIamPolicyArgs() {}

    private GetHl7V2StoreIamPolicyArgs(GetHl7V2StoreIamPolicyArgs $) {
        this.hl7V2StoreId = $.hl7V2StoreId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHl7V2StoreIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHl7V2StoreIamPolicyArgs $;

        public Builder() {
            $ = new GetHl7V2StoreIamPolicyArgs();
        }

        public Builder(GetHl7V2StoreIamPolicyArgs defaults) {
            $ = new GetHl7V2StoreIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hl7V2StoreId The HL7v2 store ID, in the form
         * `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
         * `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider&#39;s
         * project setting will be used as a fallback.
         * 
         * @return builder
         * 
         */
        public Builder hl7V2StoreId(Output<String> hl7V2StoreId) {
            $.hl7V2StoreId = hl7V2StoreId;
            return this;
        }

        /**
         * @param hl7V2StoreId The HL7v2 store ID, in the form
         * `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
         * `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider&#39;s
         * project setting will be used as a fallback.
         * 
         * @return builder
         * 
         */
        public Builder hl7V2StoreId(String hl7V2StoreId) {
            return hl7V2StoreId(Output.of(hl7V2StoreId));
        }

        public GetHl7V2StoreIamPolicyArgs build() {
            $.hl7V2StoreId = Objects.requireNonNull($.hl7V2StoreId, "expected parameter 'hl7V2StoreId' to be non-null");
            return $;
        }
    }

}