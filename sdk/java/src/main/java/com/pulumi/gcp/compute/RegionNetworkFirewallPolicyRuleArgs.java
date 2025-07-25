// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleMatchArgs;
import com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleTargetSecureTagArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionNetworkFirewallPolicyRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionNetworkFirewallPolicyRuleArgs Empty = new RegionNetworkFirewallPolicyRuleArgs();

    /**
     * The Action to perform when the client connection triggers the rule. Valid actions are &#34;allow&#34;, &#34;deny&#34;, &#34;goto_next&#34; and &#34;apply_security_profile_group&#34;.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return The Action to perform when the client connection triggers the rule. Valid actions are &#34;allow&#34;, &#34;deny&#34;, &#34;goto_next&#34; and &#34;apply_security_profile_group&#34;.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * An optional description for this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description for this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The direction in which this rule applies.
     * Possible values are: `INGRESS`, `EGRESS`.
     * 
     */
    @Import(name="direction", required=true)
    private Output<String> direction;

    /**
     * @return The direction in which this rule applies.
     * Possible values are: `INGRESS`, `EGRESS`.
     * 
     */
    public Output<String> direction() {
        return this.direction;
    }

    /**
     * Denotes whether the firewall policy rule is disabled.
     * When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist.
     * If this is unspecified, the firewall policy rule will be enabled.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Denotes whether the firewall policy rule is disabled.
     * When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist.
     * If this is unspecified, the firewall policy rule will be enabled.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * Denotes whether to enable logging for a particular rule.
     * If logging is enabled, logs will be exported to the configured export destination in Stackdriver.
     * Logs may be exported to BigQuery or Pub/Sub.
     * Note: you cannot enable logging on &#34;goto_next&#34; rules.
     * 
     */
    @Import(name="enableLogging")
    private @Nullable Output<Boolean> enableLogging;

    /**
     * @return Denotes whether to enable logging for a particular rule.
     * If logging is enabled, logs will be exported to the configured export destination in Stackdriver.
     * Logs may be exported to BigQuery or Pub/Sub.
     * Note: you cannot enable logging on &#34;goto_next&#34; rules.
     * 
     */
    public Optional<Output<Boolean>> enableLogging() {
        return Optional.ofNullable(this.enableLogging);
    }

    /**
     * The firewall policy of the resource.
     * 
     */
    @Import(name="firewallPolicy", required=true)
    private Output<String> firewallPolicy;

    /**
     * @return The firewall policy of the resource.
     * 
     */
    public Output<String> firewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * 
     */
    @Import(name="match", required=true)
    private Output<RegionNetworkFirewallPolicyRuleMatchArgs> match;

    /**
     * @return A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * 
     */
    public Output<RegionNetworkFirewallPolicyRuleMatchArgs> match() {
        return this.match;
    }

    /**
     * An integer indicating the priority of a rule in the list.
     * The priority must be a positive value between 0 and 2147483647.
     * Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest prority.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    /**
     * @return An integer indicating the priority of a rule in the list.
     * The priority must be a positive value between 0 and 2147483647.
     * Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest prority.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The location of this resource.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The location of this resource.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * An optional name for the rule. This field is not a unique identifier and can be updated.
     * 
     */
    @Import(name="ruleName")
    private @Nullable Output<String> ruleName;

    /**
     * @return An optional name for the rule. This field is not a unique identifier and can be updated.
     * 
     */
    public Optional<Output<String>> ruleName() {
        return Optional.ofNullable(this.ruleName);
    }

    /**
     * A fully-qualified URL of a SecurityProfile resource instance.
     * Example: https://networksecurity.googleapis.com/v1/projects/{project}/locations/{location}/securityProfileGroups/my-security-profile-group
     * Must be specified if action = &#39;apply_security_profile_group&#39; and cannot be specified for other actions.
     * Security Profile Group and Firewall Policy Rule must be in the same scope.
     * 
     */
    @Import(name="securityProfileGroup")
    private @Nullable Output<String> securityProfileGroup;

    /**
     * @return A fully-qualified URL of a SecurityProfile resource instance.
     * Example: https://networksecurity.googleapis.com/v1/projects/{project}/locations/{location}/securityProfileGroups/my-security-profile-group
     * Must be specified if action = &#39;apply_security_profile_group&#39; and cannot be specified for other actions.
     * Security Profile Group and Firewall Policy Rule must be in the same scope.
     * 
     */
    public Optional<Output<String>> securityProfileGroup() {
        return Optional.ofNullable(this.securityProfileGroup);
    }

    /**
     * A list of secure tags that controls which instances the firewall rule applies to.
     * If targetSecureTag are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the targetSecureTag are in INEFFECTIVE state, then this rule will be ignored.
     * targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
     * Structure is documented below.
     * 
     */
    @Import(name="targetSecureTags")
    private @Nullable Output<List<RegionNetworkFirewallPolicyRuleTargetSecureTagArgs>> targetSecureTags;

    /**
     * @return A list of secure tags that controls which instances the firewall rule applies to.
     * If targetSecureTag are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the targetSecureTag are in INEFFECTIVE state, then this rule will be ignored.
     * targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionNetworkFirewallPolicyRuleTargetSecureTagArgs>>> targetSecureTags() {
        return Optional.ofNullable(this.targetSecureTags);
    }

    /**
     * A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
     */
    @Import(name="targetServiceAccounts")
    private @Nullable Output<List<String>> targetServiceAccounts;

    /**
     * @return A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
     */
    public Optional<Output<List<String>>> targetServiceAccounts() {
        return Optional.ofNullable(this.targetServiceAccounts);
    }

    /**
     * Boolean flag indicating if the traffic should be TLS decrypted.
     * Can be set only if action = &#39;apply_security_profile_group&#39; and cannot be set for other actions.
     * 
     */
    @Import(name="tlsInspect")
    private @Nullable Output<Boolean> tlsInspect;

    /**
     * @return Boolean flag indicating if the traffic should be TLS decrypted.
     * Can be set only if action = &#39;apply_security_profile_group&#39; and cannot be set for other actions.
     * 
     */
    public Optional<Output<Boolean>> tlsInspect() {
        return Optional.ofNullable(this.tlsInspect);
    }

    private RegionNetworkFirewallPolicyRuleArgs() {}

    private RegionNetworkFirewallPolicyRuleArgs(RegionNetworkFirewallPolicyRuleArgs $) {
        this.action = $.action;
        this.description = $.description;
        this.direction = $.direction;
        this.disabled = $.disabled;
        this.enableLogging = $.enableLogging;
        this.firewallPolicy = $.firewallPolicy;
        this.match = $.match;
        this.priority = $.priority;
        this.project = $.project;
        this.region = $.region;
        this.ruleName = $.ruleName;
        this.securityProfileGroup = $.securityProfileGroup;
        this.targetSecureTags = $.targetSecureTags;
        this.targetServiceAccounts = $.targetServiceAccounts;
        this.tlsInspect = $.tlsInspect;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionNetworkFirewallPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionNetworkFirewallPolicyRuleArgs $;

        public Builder() {
            $ = new RegionNetworkFirewallPolicyRuleArgs();
        }

        public Builder(RegionNetworkFirewallPolicyRuleArgs defaults) {
            $ = new RegionNetworkFirewallPolicyRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The Action to perform when the client connection triggers the rule. Valid actions are &#34;allow&#34;, &#34;deny&#34;, &#34;goto_next&#34; and &#34;apply_security_profile_group&#34;.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The Action to perform when the client connection triggers the rule. Valid actions are &#34;allow&#34;, &#34;deny&#34;, &#34;goto_next&#34; and &#34;apply_security_profile_group&#34;.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param description An optional description for this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description for this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param direction The direction in which this rule applies.
         * Possible values are: `INGRESS`, `EGRESS`.
         * 
         * @return builder
         * 
         */
        public Builder direction(Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction The direction in which this rule applies.
         * Possible values are: `INGRESS`, `EGRESS`.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param disabled Denotes whether the firewall policy rule is disabled.
         * When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist.
         * If this is unspecified, the firewall policy rule will be enabled.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Denotes whether the firewall policy rule is disabled.
         * When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist.
         * If this is unspecified, the firewall policy rule will be enabled.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param enableLogging Denotes whether to enable logging for a particular rule.
         * If logging is enabled, logs will be exported to the configured export destination in Stackdriver.
         * Logs may be exported to BigQuery or Pub/Sub.
         * Note: you cannot enable logging on &#34;goto_next&#34; rules.
         * 
         * @return builder
         * 
         */
        public Builder enableLogging(@Nullable Output<Boolean> enableLogging) {
            $.enableLogging = enableLogging;
            return this;
        }

        /**
         * @param enableLogging Denotes whether to enable logging for a particular rule.
         * If logging is enabled, logs will be exported to the configured export destination in Stackdriver.
         * Logs may be exported to BigQuery or Pub/Sub.
         * Note: you cannot enable logging on &#34;goto_next&#34; rules.
         * 
         * @return builder
         * 
         */
        public Builder enableLogging(Boolean enableLogging) {
            return enableLogging(Output.of(enableLogging));
        }

        /**
         * @param firewallPolicy The firewall policy of the resource.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicy(Output<String> firewallPolicy) {
            $.firewallPolicy = firewallPolicy;
            return this;
        }

        /**
         * @param firewallPolicy The firewall policy of the resource.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicy(String firewallPolicy) {
            return firewallPolicy(Output.of(firewallPolicy));
        }

        /**
         * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder match(Output<RegionNetworkFirewallPolicyRuleMatchArgs> match) {
            $.match = match;
            return this;
        }

        /**
         * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder match(RegionNetworkFirewallPolicyRuleMatchArgs match) {
            return match(Output.of(match));
        }

        /**
         * @param priority An integer indicating the priority of a rule in the list.
         * The priority must be a positive value between 0 and 2147483647.
         * Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest prority.
         * 
         * @return builder
         * 
         */
        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority An integer indicating the priority of a rule in the list.
         * The priority must be a positive value between 0 and 2147483647.
         * Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest prority.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region The location of this resource.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The location of this resource.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param ruleName An optional name for the rule. This field is not a unique identifier and can be updated.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(@Nullable Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        /**
         * @param ruleName An optional name for the rule. This field is not a unique identifier and can be updated.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
        }

        /**
         * @param securityProfileGroup A fully-qualified URL of a SecurityProfile resource instance.
         * Example: https://networksecurity.googleapis.com/v1/projects/{project}/locations/{location}/securityProfileGroups/my-security-profile-group
         * Must be specified if action = &#39;apply_security_profile_group&#39; and cannot be specified for other actions.
         * Security Profile Group and Firewall Policy Rule must be in the same scope.
         * 
         * @return builder
         * 
         */
        public Builder securityProfileGroup(@Nullable Output<String> securityProfileGroup) {
            $.securityProfileGroup = securityProfileGroup;
            return this;
        }

        /**
         * @param securityProfileGroup A fully-qualified URL of a SecurityProfile resource instance.
         * Example: https://networksecurity.googleapis.com/v1/projects/{project}/locations/{location}/securityProfileGroups/my-security-profile-group
         * Must be specified if action = &#39;apply_security_profile_group&#39; and cannot be specified for other actions.
         * Security Profile Group and Firewall Policy Rule must be in the same scope.
         * 
         * @return builder
         * 
         */
        public Builder securityProfileGroup(String securityProfileGroup) {
            return securityProfileGroup(Output.of(securityProfileGroup));
        }

        /**
         * @param targetSecureTags A list of secure tags that controls which instances the firewall rule applies to.
         * If targetSecureTag are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the targetSecureTag are in INEFFECTIVE state, then this rule will be ignored.
         * targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder targetSecureTags(@Nullable Output<List<RegionNetworkFirewallPolicyRuleTargetSecureTagArgs>> targetSecureTags) {
            $.targetSecureTags = targetSecureTags;
            return this;
        }

        /**
         * @param targetSecureTags A list of secure tags that controls which instances the firewall rule applies to.
         * If targetSecureTag are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the targetSecureTag are in INEFFECTIVE state, then this rule will be ignored.
         * targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder targetSecureTags(List<RegionNetworkFirewallPolicyRuleTargetSecureTagArgs> targetSecureTags) {
            return targetSecureTags(Output.of(targetSecureTags));
        }

        /**
         * @param targetSecureTags A list of secure tags that controls which instances the firewall rule applies to.
         * If targetSecureTag are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the targetSecureTag are in INEFFECTIVE state, then this rule will be ignored.
         * targetSecureTag may not be set at the same time as targetServiceAccounts. If neither targetServiceAccounts nor targetSecureTag are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder targetSecureTags(RegionNetworkFirewallPolicyRuleTargetSecureTagArgs... targetSecureTags) {
            return targetSecureTags(List.of(targetSecureTags));
        }

        /**
         * @param targetServiceAccounts A list of service accounts indicating the sets of instances that are applied with this rule.
         * 
         * @return builder
         * 
         */
        public Builder targetServiceAccounts(@Nullable Output<List<String>> targetServiceAccounts) {
            $.targetServiceAccounts = targetServiceAccounts;
            return this;
        }

        /**
         * @param targetServiceAccounts A list of service accounts indicating the sets of instances that are applied with this rule.
         * 
         * @return builder
         * 
         */
        public Builder targetServiceAccounts(List<String> targetServiceAccounts) {
            return targetServiceAccounts(Output.of(targetServiceAccounts));
        }

        /**
         * @param targetServiceAccounts A list of service accounts indicating the sets of instances that are applied with this rule.
         * 
         * @return builder
         * 
         */
        public Builder targetServiceAccounts(String... targetServiceAccounts) {
            return targetServiceAccounts(List.of(targetServiceAccounts));
        }

        /**
         * @param tlsInspect Boolean flag indicating if the traffic should be TLS decrypted.
         * Can be set only if action = &#39;apply_security_profile_group&#39; and cannot be set for other actions.
         * 
         * @return builder
         * 
         */
        public Builder tlsInspect(@Nullable Output<Boolean> tlsInspect) {
            $.tlsInspect = tlsInspect;
            return this;
        }

        /**
         * @param tlsInspect Boolean flag indicating if the traffic should be TLS decrypted.
         * Can be set only if action = &#39;apply_security_profile_group&#39; and cannot be set for other actions.
         * 
         * @return builder
         * 
         */
        public Builder tlsInspect(Boolean tlsInspect) {
            return tlsInspect(Output.of(tlsInspect));
        }

        public RegionNetworkFirewallPolicyRuleArgs build() {
            if ($.action == null) {
                throw new MissingRequiredPropertyException("RegionNetworkFirewallPolicyRuleArgs", "action");
            }
            if ($.direction == null) {
                throw new MissingRequiredPropertyException("RegionNetworkFirewallPolicyRuleArgs", "direction");
            }
            if ($.firewallPolicy == null) {
                throw new MissingRequiredPropertyException("RegionNetworkFirewallPolicyRuleArgs", "firewallPolicy");
            }
            if ($.match == null) {
                throw new MissingRequiredPropertyException("RegionNetworkFirewallPolicyRuleArgs", "match");
            }
            if ($.priority == null) {
                throw new MissingRequiredPropertyException("RegionNetworkFirewallPolicyRuleArgs", "priority");
            }
            return $;
        }
    }

}
