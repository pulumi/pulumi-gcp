// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firebase.Outputs
{

    [OutputType]
    public sealed class ExtensionsInstanceConfig
    {
        /// <summary>
        /// List of extension events selected by consumer that extension is allowed to
        /// emit, identified by their types.
        /// </summary>
        public readonly ImmutableArray<string> AllowedEventTypes;
        /// <summary>
        /// (Output)
        /// The time at which the Extension Instance Config was created.
        /// </summary>
        public readonly string? CreateTime;
        /// <summary>
        /// Fully qualified Eventarc resource name that consumers should use for event triggers.
        /// </summary>
        public readonly string? EventarcChannel;
        /// <summary>
        /// The ref of the Extension from the Registry (e.g. publisher-id/awesome-extension)
        /// </summary>
        public readonly string ExtensionRef;
        /// <summary>
        /// The version of the Extension from the Registry (e.g. 1.0.3). If left blank, latest is assumed.
        /// </summary>
        public readonly string? ExtensionVersion;
        /// <summary>
        /// (Output)
        /// The unique identifier for this configuration.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Environment variables that may be configured for the Extension
        /// </summary>
        public readonly ImmutableDictionary<string, string> Params;
        /// <summary>
        /// (Output)
        /// Postinstall instructions to be shown for this Extension, with
        /// template strings representing function and parameter values substituted
        /// with actual values. These strings include: ${param:FOO},
        /// ${function:myFunc.url},
        /// ${function:myFunc.name}, and ${function:myFunc.location}
        /// 
        /// - - -
        /// </summary>
        public readonly string? PopulatedPostinstallContent;
        /// <summary>
        /// Params whose values are only available at deployment time.
        /// Unlike other params, these will not be set as environment variables on
        /// functions.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? SystemParams;

        [OutputConstructor]
        private ExtensionsInstanceConfig(
            ImmutableArray<string> allowedEventTypes,

            string? createTime,

            string? eventarcChannel,

            string extensionRef,

            string? extensionVersion,

            string? name,

            ImmutableDictionary<string, string> @params,

            string? populatedPostinstallContent,

            ImmutableDictionary<string, string>? systemParams)
        {
            AllowedEventTypes = allowedEventTypes;
            CreateTime = createTime;
            EventarcChannel = eventarcChannel;
            ExtensionRef = extensionRef;
            ExtensionVersion = extensionVersion;
            Name = name;
            Params = @params;
            PopulatedPostinstallContent = populatedPostinstallContent;
            SystemParams = systemParams;
        }
    }
}