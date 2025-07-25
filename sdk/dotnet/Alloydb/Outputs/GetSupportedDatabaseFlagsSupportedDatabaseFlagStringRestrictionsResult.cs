// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Alloydb.Outputs
{

    [OutputType]
    public sealed class GetSupportedDatabaseFlagsSupportedDatabaseFlagStringRestrictionsResult
    {
        /// <summary>
        /// The list of allowed values, if bounded. This field will be empty if there is a unbounded number of allowed values.
        /// </summary>
        public readonly ImmutableArray<string> AllowedValues;

        [OutputConstructor]
        private GetSupportedDatabaseFlagsSupportedDatabaseFlagStringRestrictionsResult(ImmutableArray<string> allowedValues)
        {
            AllowedValues = allowedValues;
        }
    }
}
