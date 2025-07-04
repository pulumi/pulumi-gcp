// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Iap.Outputs
{

    [OutputType]
    public sealed class SettingsAccessSettingsCorsSettings
    {
        /// <summary>
        /// Configuration to allow HTTP OPTIONS calls to skip authorization.
        /// If undefined, IAP will not apply any special logic to OPTIONS requests.
        /// </summary>
        public readonly bool? AllowHttpOptions;

        [OutputConstructor]
        private SettingsAccessSettingsCorsSettings(bool? allowHttpOptions)
        {
            AllowHttpOptions = allowHttpOptions;
        }
    }
}
