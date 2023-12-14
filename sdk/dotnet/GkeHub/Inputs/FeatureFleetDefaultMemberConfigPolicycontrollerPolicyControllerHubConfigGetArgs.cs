// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Inputs
{

    public sealed class FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Interval for Policy Controller Audit scans (in seconds). When set to 0, this disables audit functionality altogether.
        /// </summary>
        [Input("auditIntervalSeconds")]
        public Input<int>? AuditIntervalSeconds { get; set; }

        /// <summary>
        /// The maximum number of audit violations to be stored in a constraint. If not set, the internal default of 20 will be used.
        /// </summary>
        [Input("constraintViolationLimit")]
        public Input<int>? ConstraintViolationLimit { get; set; }

        [Input("deploymentConfigs")]
        private InputList<Inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigGetArgs>? _deploymentConfigs;

        /// <summary>
        /// Map of deployment configs to deployments ("admission", "audit", "mutation").
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigGetArgs> DeploymentConfigs
        {
            get => _deploymentConfigs ?? (_deploymentConfigs = new InputList<Inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigGetArgs>());
            set => _deploymentConfigs = value;
        }

        [Input("exemptableNamespaces")]
        private InputList<string>? _exemptableNamespaces;

        /// <summary>
        /// The set of namespaces that are excluded from Policy Controller checks. Namespaces do not need to currently exist on the cluster.
        /// </summary>
        public InputList<string> ExemptableNamespaces
        {
            get => _exemptableNamespaces ?? (_exemptableNamespaces = new InputList<string>());
            set => _exemptableNamespaces = value;
        }

        /// <summary>
        /// Configures the mode of the Policy Controller installation
        /// Possible values are: `INSTALL_SPEC_UNSPECIFIED`, `INSTALL_SPEC_NOT_INSTALLED`, `INSTALL_SPEC_ENABLED`, `INSTALL_SPEC_SUSPENDED`, `INSTALL_SPEC_DETACHED`.
        /// </summary>
        [Input("installSpec", required: true)]
        public Input<string> InstallSpec { get; set; } = null!;

        /// <summary>
        /// Logs all denies and dry run failures.
        /// </summary>
        [Input("logDeniesEnabled")]
        public Input<bool>? LogDeniesEnabled { get; set; }

        /// <summary>
        /// Monitoring specifies the configuration of monitoring Policy Controller.
        /// Structure is documented below.
        /// </summary>
        [Input("monitoring")]
        public Input<Inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigMonitoringGetArgs>? Monitoring { get; set; }

        /// <summary>
        /// Enables the ability to mutate resources using Policy Controller.
        /// </summary>
        [Input("mutationEnabled")]
        public Input<bool>? MutationEnabled { get; set; }

        /// <summary>
        /// Specifies the desired policy content on the cluster.
        /// Structure is documented below.
        /// </summary>
        [Input("policyContent")]
        public Input<Inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentGetArgs>? PolicyContent { get; set; }

        /// <summary>
        /// Enables the ability to use Constraint Templates that reference to objects other than the object currently being evaluated.
        /// </summary>
        [Input("referentialRulesEnabled")]
        public Input<bool>? ReferentialRulesEnabled { get; set; }

        public FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigGetArgs()
        {
        }
        public static new FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigGetArgs Empty => new FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigGetArgs();
    }
}