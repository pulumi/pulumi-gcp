// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IAMAuditConfigState extends com.pulumi.resources.ResourceArgs {

    public static final IAMAuditConfigState Empty = new IAMAuditConfigState();

    /**
     * The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * 
     */
    @Import(name="auditLogConfigs")
    private @Nullable Output<List<IAMAuditConfigAuditLogConfigArgs>> auditLogConfigs;

    /**
     * @return The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * 
     */
    public Optional<Output<List<IAMAuditConfigAuditLogConfigArgs>>> auditLogConfigs() {
        return Optional.ofNullable(this.auditLogConfigs);
    }

    /**
     * (Computed) The etag of the project&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return (Computed) The etag of the project&#39;s IAM policy.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The project id of the target project. This is not
     * inferred from the provider.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project id of the target project. This is not
     * inferred from the provider.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_project\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_project\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    private IAMAuditConfigState() {}

    private IAMAuditConfigState(IAMAuditConfigState $) {
        this.auditLogConfigs = $.auditLogConfigs;
        this.etag = $.etag;
        this.project = $.project;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IAMAuditConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IAMAuditConfigState $;

        public Builder() {
            $ = new IAMAuditConfigState();
        }

        public Builder(IAMAuditConfigState defaults) {
            $ = new IAMAuditConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder auditLogConfigs(@Nullable Output<List<IAMAuditConfigAuditLogConfigArgs>> auditLogConfigs) {
            $.auditLogConfigs = auditLogConfigs;
            return this;
        }

        /**
         * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder auditLogConfigs(List<IAMAuditConfigAuditLogConfigArgs> auditLogConfigs) {
            return auditLogConfigs(Output.of(auditLogConfigs));
        }

        /**
         * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder auditLogConfigs(IAMAuditConfigAuditLogConfigArgs... auditLogConfigs) {
            return auditLogConfigs(List.of(auditLogConfigs));
        }

        /**
         * @param etag (Computed) The etag of the project&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag (Computed) The etag of the project&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param project The project id of the target project. This is not
         * inferred from the provider.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project id of the target project. This is not
         * inferred from the provider.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param service Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_project\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_project\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public IAMAuditConfigState build() {
            return $;
        }
    }

}