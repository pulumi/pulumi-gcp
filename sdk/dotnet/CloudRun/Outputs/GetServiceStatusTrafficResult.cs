// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRun.Outputs
{

    [OutputType]
    public sealed class GetServiceStatusTrafficResult
    {
        public readonly bool LatestRevision;
        public readonly int Percent;
        public readonly string RevisionName;
        public readonly string Tag;
        public readonly string Url;

        [OutputConstructor]
        private GetServiceStatusTrafficResult(
            bool latestRevision,

            int percent,

            string revisionName,

            string tag,

            string url)
        {
            LatestRevision = latestRevision;
            Percent = percent;
            RevisionName = revisionName;
            Tag = tag;
            Url = url;
        }
    }
}