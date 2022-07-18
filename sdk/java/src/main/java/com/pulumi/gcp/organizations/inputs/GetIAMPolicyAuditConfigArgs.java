// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfigAuditLogConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetIAMPolicyAuditConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetIAMPolicyAuditConfigArgs Empty = new GetIAMPolicyAuditConfigArgs();

    /**
     * A nested block that defines the operations you&#39;d like to log.
     * 
     */
    @Import(name="auditLogConfigs", required=true)
    private Output<List<GetIAMPolicyAuditConfigAuditLogConfigArgs>> auditLogConfigs;

    /**
     * @return A nested block that defines the operations you&#39;d like to log.
     * 
     */
    public Output<List<GetIAMPolicyAuditConfigAuditLogConfigArgs>> auditLogConfigs() {
        return this.auditLogConfigs;
    }

    /**
     * Defines a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return Defines a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    private GetIAMPolicyAuditConfigArgs() {}

    private GetIAMPolicyAuditConfigArgs(GetIAMPolicyAuditConfigArgs $) {
        this.auditLogConfigs = $.auditLogConfigs;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIAMPolicyAuditConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIAMPolicyAuditConfigArgs $;

        public Builder() {
            $ = new GetIAMPolicyAuditConfigArgs();
        }

        public Builder(GetIAMPolicyAuditConfigArgs defaults) {
            $ = new GetIAMPolicyAuditConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auditLogConfigs A nested block that defines the operations you&#39;d like to log.
         * 
         * @return builder
         * 
         */
        public Builder auditLogConfigs(Output<List<GetIAMPolicyAuditConfigAuditLogConfigArgs>> auditLogConfigs) {
            $.auditLogConfigs = auditLogConfigs;
            return this;
        }

        /**
         * @param auditLogConfigs A nested block that defines the operations you&#39;d like to log.
         * 
         * @return builder
         * 
         */
        public Builder auditLogConfigs(List<GetIAMPolicyAuditConfigAuditLogConfigArgs> auditLogConfigs) {
            return auditLogConfigs(Output.of(auditLogConfigs));
        }

        /**
         * @param auditLogConfigs A nested block that defines the operations you&#39;d like to log.
         * 
         * @return builder
         * 
         */
        public Builder auditLogConfigs(GetIAMPolicyAuditConfigAuditLogConfigArgs... auditLogConfigs) {
            return auditLogConfigs(List.of(auditLogConfigs));
        }

        /**
         * @param service Defines a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Defines a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public GetIAMPolicyAuditConfigArgs build() {
            $.auditLogConfigs = Objects.requireNonNull($.auditLogConfigs, "expected parameter 'auditLogConfigs' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}