// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecurityCenter
{
    /// <summary>
    /// Represents an instance of an Event Threat Detection custom module, including
    /// its full module name, display name, enablement state, andlast updated time.
    /// You can create a custom module at the organization level only.
    /// 
    /// To get more information about EventThreatDetectionCustomModule, see:
    /// 
    /// * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.eventThreatDetectionSettings.customModules)
    /// * How-to Guides
    ///     * [Overview of custom modules for Event Threat Detection](https://cloud.google.com/security-command-center/docs/custom-modules-etd-overview)
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// EventThreatDetectionCustomModule can be imported using any of these accepted formats:
    /// 
    /// * `organizations/{{organization}}/eventThreatDetectionSettings/customModules/{{name}}`
    /// 
    /// * `{{organization}}/{{name}}`
    /// 
    /// When using the `pulumi import` command, EventThreatDetectionCustomModule can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:securitycenter/eventThreatDetectionCustomModule:EventThreatDetectionCustomModule default organizations/{{organization}}/eventThreatDetectionSettings/customModules/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:securitycenter/eventThreatDetectionCustomModule:EventThreatDetectionCustomModule default {{organization}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:securitycenter/eventThreatDetectionCustomModule:EventThreatDetectionCustomModule")]
    public partial class EventThreatDetectionCustomModule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Config for the module. For the resident module, its config value is defined at this level.
        /// For the inherited module, its config value is inherited from the ancestor module.
        /// </summary>
        [Output("config")]
        public Output<string> Config { get; private set; } = null!;

        /// <summary>
        /// The human readable name to be displayed for the module.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The state of enablement for the module at the given level of the hierarchy.
        /// Possible values are: `ENABLED`, `DISABLED`.
        /// </summary>
        [Output("enablementState")]
        public Output<string> EnablementState { get; private set; } = null!;

        /// <summary>
        /// The editor that last updated the custom module
        /// </summary>
        [Output("lastEditor")]
        public Output<string> LastEditor { get; private set; } = null!;

        /// <summary>
        /// The resource name of the Event Threat Detection custom module.
        /// Its format is "organizations/{organization}/eventThreatDetectionSettings/customModules/{module}".
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Numerical ID of the parent organization.
        /// </summary>
        [Output("organization")]
        public Output<string> Organization { get; private set; } = null!;

        /// <summary>
        /// Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The time at which the custom module was last updated.
        /// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
        /// up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a EventThreatDetectionCustomModule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EventThreatDetectionCustomModule(string name, EventThreatDetectionCustomModuleArgs args, CustomResourceOptions? options = null)
            : base("gcp:securitycenter/eventThreatDetectionCustomModule:EventThreatDetectionCustomModule", name, args ?? new EventThreatDetectionCustomModuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EventThreatDetectionCustomModule(string name, Input<string> id, EventThreatDetectionCustomModuleState? state = null, CustomResourceOptions? options = null)
            : base("gcp:securitycenter/eventThreatDetectionCustomModule:EventThreatDetectionCustomModule", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing EventThreatDetectionCustomModule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EventThreatDetectionCustomModule Get(string name, Input<string> id, EventThreatDetectionCustomModuleState? state = null, CustomResourceOptions? options = null)
        {
            return new EventThreatDetectionCustomModule(name, id, state, options);
        }
    }

    public sealed class EventThreatDetectionCustomModuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Config for the module. For the resident module, its config value is defined at this level.
        /// For the inherited module, its config value is inherited from the ancestor module.
        /// </summary>
        [Input("config", required: true)]
        public Input<string> Config { get; set; } = null!;

        /// <summary>
        /// The human readable name to be displayed for the module.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The state of enablement for the module at the given level of the hierarchy.
        /// Possible values are: `ENABLED`, `DISABLED`.
        /// </summary>
        [Input("enablementState", required: true)]
        public Input<string> EnablementState { get; set; } = null!;

        /// <summary>
        /// Numerical ID of the parent organization.
        /// </summary>
        [Input("organization", required: true)]
        public Input<string> Organization { get; set; } = null!;

        /// <summary>
        /// Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public EventThreatDetectionCustomModuleArgs()
        {
        }
        public static new EventThreatDetectionCustomModuleArgs Empty => new EventThreatDetectionCustomModuleArgs();
    }

    public sealed class EventThreatDetectionCustomModuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Config for the module. For the resident module, its config value is defined at this level.
        /// For the inherited module, its config value is inherited from the ancestor module.
        /// </summary>
        [Input("config")]
        public Input<string>? Config { get; set; }

        /// <summary>
        /// The human readable name to be displayed for the module.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The state of enablement for the module at the given level of the hierarchy.
        /// Possible values are: `ENABLED`, `DISABLED`.
        /// </summary>
        [Input("enablementState")]
        public Input<string>? EnablementState { get; set; }

        /// <summary>
        /// The editor that last updated the custom module
        /// </summary>
        [Input("lastEditor")]
        public Input<string>? LastEditor { get; set; }

        /// <summary>
        /// The resource name of the Event Threat Detection custom module.
        /// Its format is "organizations/{organization}/eventThreatDetectionSettings/customModules/{module}".
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Numerical ID of the parent organization.
        /// </summary>
        [Input("organization")]
        public Input<string>? Organization { get; set; }

        /// <summary>
        /// Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The time at which the custom module was last updated.
        /// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
        /// up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public EventThreatDetectionCustomModuleState()
        {
        }
        public static new EventThreatDetectionCustomModuleState Empty => new EventThreatDetectionCustomModuleState();
    }
}
