// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity.Inputs
{

    public sealed class SecurityProfileThreatPreventionProfileArgs : global::Pulumi.ResourceArgs
    {
        [Input("antivirusOverrides")]
        private InputList<Inputs.SecurityProfileThreatPreventionProfileAntivirusOverrideArgs>? _antivirusOverrides;

        /// <summary>
        /// Defines what action to take for antivirus threats per protocol.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.SecurityProfileThreatPreventionProfileAntivirusOverrideArgs> AntivirusOverrides
        {
            get => _antivirusOverrides ?? (_antivirusOverrides = new InputList<Inputs.SecurityProfileThreatPreventionProfileAntivirusOverrideArgs>());
            set => _antivirusOverrides = value;
        }

        [Input("severityOverrides")]
        private InputList<Inputs.SecurityProfileThreatPreventionProfileSeverityOverrideArgs>? _severityOverrides;

        /// <summary>
        /// The configuration for overriding threats actions by severity match.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.SecurityProfileThreatPreventionProfileSeverityOverrideArgs> SeverityOverrides
        {
            get => _severityOverrides ?? (_severityOverrides = new InputList<Inputs.SecurityProfileThreatPreventionProfileSeverityOverrideArgs>());
            set => _severityOverrides = value;
        }

        [Input("threatOverrides")]
        private InputList<Inputs.SecurityProfileThreatPreventionProfileThreatOverrideArgs>? _threatOverrides;

        /// <summary>
        /// The configuration for overriding threats actions by threat id match.
        /// If a threat is matched both by configuration provided in severity overrides
        /// and threat overrides, the threat overrides action is applied.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.SecurityProfileThreatPreventionProfileThreatOverrideArgs> ThreatOverrides
        {
            get => _threatOverrides ?? (_threatOverrides = new InputList<Inputs.SecurityProfileThreatPreventionProfileThreatOverrideArgs>());
            set => _threatOverrides = value;
        }

        public SecurityProfileThreatPreventionProfileArgs()
        {
        }
        public static new SecurityProfileThreatPreventionProfileArgs Empty => new SecurityProfileThreatPreventionProfileArgs();
    }
}
