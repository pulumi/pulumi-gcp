// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Outputs
{

    [OutputType]
    public sealed class OsPolicyAssignmentOsPolicyResourceGroupResourcePkg
    {
        /// <summary>
        /// A package managed by Apt. Structure is
        /// documented below.
        /// </summary>
        public readonly Outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgApt? Apt;
        /// <summary>
        /// A deb package file. Structure is
        /// documented below.
        /// </summary>
        public readonly Outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDeb? Deb;
        /// <summary>
        /// The desired state the agent should maintain for
        /// this package. Possible values are: `DESIRED_STATE_UNSPECIFIED`, `INSTALLED`,
        /// `REMOVED`.
        /// </summary>
        public readonly string DesiredState;
        /// <summary>
        /// A package managed by GooGet. Structure is
        /// documented below.
        /// </summary>
        public readonly Outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGooget? Googet;
        /// <summary>
        /// An MSI package. Structure is
        /// documented below.
        /// </summary>
        public readonly Outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsi? Msi;
        /// <summary>
        /// An rpm package file. Structure is
        /// documented below.
        /// </summary>
        public readonly Outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpm? Rpm;
        /// <summary>
        /// A package managed by YUM. Structure is
        /// documented below.
        /// </summary>
        public readonly Outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYum? Yum;
        /// <summary>
        /// A package managed by Zypper. Structure is
        /// documented below.
        /// </summary>
        public readonly Outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypper? Zypper;

        [OutputConstructor]
        private OsPolicyAssignmentOsPolicyResourceGroupResourcePkg(
            Outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgApt? apt,

            Outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDeb? deb,

            string desiredState,

            Outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGooget? googet,

            Outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsi? msi,

            Outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpm? rpm,

            Outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYum? yum,

            Outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypper? zypper)
        {
            Apt = apt;
            Deb = deb;
            DesiredState = desiredState;
            Googet = googet;
            Msi = msi;
            Rpm = rpm;
            Yum = yum;
            Zypper = zypper;
        }
    }
}
