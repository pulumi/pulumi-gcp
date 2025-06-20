// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Outputs
{

    [OutputType]
    public sealed class StreamBackfillAllSalesforceExcludedObjects
    {
        /// <summary>
        /// Salesforce objects in Salesforce Org.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.StreamBackfillAllSalesforceExcludedObjectsObject> Objects;

        [OutputConstructor]
        private StreamBackfillAllSalesforceExcludedObjects(ImmutableArray<Outputs.StreamBackfillAllSalesforceExcludedObjectsObject> objects)
        {
            Objects = objects;
        }
    }
}
