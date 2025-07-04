// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Outputs
{

    [OutputType]
    public sealed class PreventionInspectTemplateInspectConfigCustomInfoTypeStoredType
    {
        /// <summary>
        /// Resource name of the requested StoredInfoType, for example `organizations/433245324/storedInfoTypes/432452342`
        /// or `projects/project-id/storedInfoTypes/432452342`.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private PreventionInspectTemplateInspectConfigCustomInfoTypeStoredType(string name)
        {
            Name = name;
        }
    }
}
