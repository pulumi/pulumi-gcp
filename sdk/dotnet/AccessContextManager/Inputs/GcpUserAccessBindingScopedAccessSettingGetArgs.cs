// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AccessContextManager.Inputs
{

    public sealed class GcpUserAccessBindingScopedAccessSettingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. Access settings for this scoped access settings. This field may be empty if dryRunSettings is set.
        /// Structure is documented below.
        /// </summary>
        [Input("activeSettings")]
        public Input<Inputs.GcpUserAccessBindingScopedAccessSettingActiveSettingsGetArgs>? ActiveSettings { get; set; }

        /// <summary>
        /// Optional. Dry-run access settings for this scoped access settings. This field may be empty if activeSettings is set. Cannot contain session settings.
        /// Structure is documented below.
        /// </summary>
        [Input("dryRunSettings")]
        public Input<Inputs.GcpUserAccessBindingScopedAccessSettingDryRunSettingsGetArgs>? DryRunSettings { get; set; }

        /// <summary>
        /// Optional. Application, etc. to which the access settings will be applied to. Implicitly, this is the scoped access settings key; as such, it must be unique and non-empty.
        /// Structure is documented below.
        /// </summary>
        [Input("scope")]
        public Input<Inputs.GcpUserAccessBindingScopedAccessSettingScopeGetArgs>? Scope { get; set; }

        public GcpUserAccessBindingScopedAccessSettingGetArgs()
        {
        }
        public static new GcpUserAccessBindingScopedAccessSettingGetArgs Empty => new GcpUserAccessBindingScopedAccessSettingGetArgs();
    }
}
