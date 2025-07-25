// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Outputs
{

    [OutputType]
    public sealed class FeatureMembershipPolicycontrollerPolicyControllerHubConfig
    {
        /// <summary>
        /// Sets the interval for Policy Controller Audit Scans (in seconds). When set to 0, this disables audit functionality altogether.
        /// </summary>
        public readonly int? AuditIntervalSeconds;
        /// <summary>
        /// The maximum number of audit violations to be stored in a constraint. If not set, the  default of 20 will be used.
        /// </summary>
        public readonly int? ConstraintViolationLimit;
        /// <summary>
        /// Map of deployment configs to deployments ("admission", "audit", "mutation").
        /// </summary>
        public readonly ImmutableArray<Outputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfig> DeploymentConfigs;
        /// <summary>
        /// The set of namespaces that are excluded from Policy Controller checks. Namespaces do not need to currently exist on the cluster.
        /// </summary>
        public readonly ImmutableArray<string> ExemptableNamespaces;
        /// <summary>
        /// Configures the mode of the Policy Controller installation. Must be one of `INSTALL_SPEC_NOT_INSTALLED`, `INSTALL_SPEC_ENABLED`, `INSTALL_SPEC_SUSPENDED` or `INSTALL_SPEC_DETACHED`.
        /// </summary>
        public readonly string? InstallSpec;
        /// <summary>
        /// Logs all denies and dry run failures.
        /// </summary>
        public readonly bool? LogDeniesEnabled;
        /// <summary>
        /// Specifies the backends Policy Controller should export metrics to. Structure is documented below.
        /// </summary>
        public readonly Outputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigMonitoring? Monitoring;
        /// <summary>
        /// Enables mutation in policy controller. If true, mutation CRDs, webhook, and controller deployment will be deployed to the cluster.
        /// </summary>
        public readonly bool? MutationEnabled;
        /// <summary>
        /// Specifies the desired policy content on the cluster. Structure is documented below.
        /// </summary>
        public readonly Outputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContent? PolicyContent;
        /// <summary>
        /// Enables the ability to use Constraint Templates that reference to objects other than the object currently being evaluated.
        /// </summary>
        public readonly bool? ReferentialRulesEnabled;

        [OutputConstructor]
        private FeatureMembershipPolicycontrollerPolicyControllerHubConfig(
            int? auditIntervalSeconds,

            int? constraintViolationLimit,

            ImmutableArray<Outputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfig> deploymentConfigs,

            ImmutableArray<string> exemptableNamespaces,

            string? installSpec,

            bool? logDeniesEnabled,

            Outputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigMonitoring? monitoring,

            bool? mutationEnabled,

            Outputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContent? policyContent,

            bool? referentialRulesEnabled)
        {
            AuditIntervalSeconds = auditIntervalSeconds;
            ConstraintViolationLimit = constraintViolationLimit;
            DeploymentConfigs = deploymentConfigs;
            ExemptableNamespaces = exemptableNamespaces;
            InstallSpec = installSpec;
            LogDeniesEnabled = logDeniesEnabled;
            Monitoring = monitoring;
            MutationEnabled = mutationEnabled;
            PolicyContent = policyContent;
            ReferentialRulesEnabled = referentialRulesEnabled;
        }
    }
}
