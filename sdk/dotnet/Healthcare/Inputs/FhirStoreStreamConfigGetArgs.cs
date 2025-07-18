// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Healthcare.Inputs
{

    public sealed class FhirStoreStreamConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The destination BigQuery structure that contains both the dataset location and corresponding schema config.
        /// The output is organized in one table per resource type. The server reuses the existing tables (if any) that
        /// are named after the resource types, e.g. "Patient", "Observation". When there is no existing table for a given
        /// resource type, the server attempts to create one.
        /// See the [streaming config reference](https://cloud.google.com/healthcare/docs/reference/rest/v1beta1/projects.locations.datasets.fhirStores#streamconfig) for more details.
        /// Structure is documented below.
        /// </summary>
        [Input("bigqueryDestination", required: true)]
        public Input<Inputs.FhirStoreStreamConfigBigqueryDestinationGetArgs> BigqueryDestination { get; set; } = null!;

        [Input("resourceTypes")]
        private InputList<string>? _resourceTypes;

        /// <summary>
        /// Supply a FHIR resource type (such as "Patient" or "Observation"). See
        /// https://www.hl7.org/fhir/valueset-resource-types.html for a list of all FHIR resource types. The server treats
        /// an empty list as an intent to stream all the supported resource types in this FHIR store.
        /// </summary>
        public InputList<string> ResourceTypes
        {
            get => _resourceTypes ?? (_resourceTypes = new InputList<string>());
            set => _resourceTypes = value;
        }

        public FhirStoreStreamConfigGetArgs()
        {
        }
        public static new FhirStoreStreamConfigGetArgs Empty => new FhirStoreStreamConfigGetArgs();
    }
}
