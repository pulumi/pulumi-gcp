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
    public sealed class PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSet
    {
        /// <summary>
        /// The regex-filtered set of files to scan.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSet? RegexFileSet;
        /// <summary>
        /// The Cloud Storage url of the file(s) to scan, in the format `gs://&lt;bucket&gt;/&lt;path&gt;`. Trailing wildcard
        /// in the path is allowed.
        /// If the url ends in a trailing slash, the bucket or directory represented by the url will be scanned
        /// non-recursively (content in sub-directories will not be scanned). This means that `gs://mybucket/` is
        /// equivalent to `gs://mybucket/*`, and `gs://mybucket/directory/` is equivalent to `gs://mybucket/directory/*`.
        /// </summary>
        public readonly string? Url;

        [OutputConstructor]
        private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSet(
            Outputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSet? regexFileSet,

            string? url)
        {
            RegexFileSet = regexFileSet;
            Url = url;
        }
    }
}
