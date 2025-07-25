// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity.Outputs
{

    [OutputType]
    public sealed class SecurityProfileThreatPreventionProfile
    {
        /// <summary>
        /// Defines what action to take for antivirus threats per protocol.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.SecurityProfileThreatPreventionProfileAntivirusOverride> AntivirusOverrides;
        /// <summary>
        /// The configuration for overriding threats actions by severity match.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.SecurityProfileThreatPreventionProfileSeverityOverride> SeverityOverrides;
        /// <summary>
        /// The configuration for overriding threats actions by threat id match.
        /// If a threat is matched both by configuration provided in severity overrides
        /// and threat overrides, the threat overrides action is applied.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.SecurityProfileThreatPreventionProfileThreatOverride> ThreatOverrides;

        [OutputConstructor]
        private SecurityProfileThreatPreventionProfile(
            ImmutableArray<Outputs.SecurityProfileThreatPreventionProfileAntivirusOverride> antivirusOverrides,

            ImmutableArray<Outputs.SecurityProfileThreatPreventionProfileSeverityOverride> severityOverrides,

            ImmutableArray<Outputs.SecurityProfileThreatPreventionProfileThreatOverride> threatOverrides)
        {
            AntivirusOverrides = antivirusOverrides;
            SeverityOverrides = severityOverrides;
            ThreatOverrides = threatOverrides;
        }
    }
}
