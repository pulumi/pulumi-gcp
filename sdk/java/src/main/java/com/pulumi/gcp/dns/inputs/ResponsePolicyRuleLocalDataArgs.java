// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dns.inputs.ResponsePolicyRuleLocalDataLocalDataArgs;
import java.util.List;
import java.util.Objects;


public final class ResponsePolicyRuleLocalDataArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponsePolicyRuleLocalDataArgs Empty = new ResponsePolicyRuleLocalDataArgs();

    /**
     * All resource record sets for this selector, one per resource record type. The name must match the dns_name.
     * Structure is documented below.
     * 
     */
    @Import(name="localDatas", required=true)
    private Output<List<ResponsePolicyRuleLocalDataLocalDataArgs>> localDatas;

    /**
     * @return All resource record sets for this selector, one per resource record type. The name must match the dns_name.
     * Structure is documented below.
     * 
     */
    public Output<List<ResponsePolicyRuleLocalDataLocalDataArgs>> localDatas() {
        return this.localDatas;
    }

    private ResponsePolicyRuleLocalDataArgs() {}

    private ResponsePolicyRuleLocalDataArgs(ResponsePolicyRuleLocalDataArgs $) {
        this.localDatas = $.localDatas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponsePolicyRuleLocalDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponsePolicyRuleLocalDataArgs $;

        public Builder() {
            $ = new ResponsePolicyRuleLocalDataArgs();
        }

        public Builder(ResponsePolicyRuleLocalDataArgs defaults) {
            $ = new ResponsePolicyRuleLocalDataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param localDatas All resource record sets for this selector, one per resource record type. The name must match the dns_name.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder localDatas(Output<List<ResponsePolicyRuleLocalDataLocalDataArgs>> localDatas) {
            $.localDatas = localDatas;
            return this;
        }

        /**
         * @param localDatas All resource record sets for this selector, one per resource record type. The name must match the dns_name.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder localDatas(List<ResponsePolicyRuleLocalDataLocalDataArgs> localDatas) {
            return localDatas(Output.of(localDatas));
        }

        /**
         * @param localDatas All resource record sets for this selector, one per resource record type. The name must match the dns_name.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder localDatas(ResponsePolicyRuleLocalDataLocalDataArgs... localDatas) {
            return localDatas(List.of(localDatas));
        }

        public ResponsePolicyRuleLocalDataArgs build() {
            $.localDatas = Objects.requireNonNull($.localDatas, "expected parameter 'localDatas' to be non-null");
            return $;
        }
    }

}