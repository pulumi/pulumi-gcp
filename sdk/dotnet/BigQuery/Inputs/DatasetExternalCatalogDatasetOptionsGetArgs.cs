// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Inputs
{

    public sealed class DatasetExternalCatalogDatasetOptionsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The storage location URI for all tables in the dataset. Equivalent to hive metastore's
        /// database locationUri. Maximum length of 1024 characters.
        /// </summary>
        [Input("defaultStorageLocationUri")]
        public Input<string>? DefaultStorageLocationUri { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// A map of key value pairs defining the parameters and properties of the open source schema.
        /// Maximum size of 2Mib.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        public DatasetExternalCatalogDatasetOptionsGetArgs()
        {
        }
        public static new DatasetExternalCatalogDatasetOptionsGetArgs Empty => new DatasetExternalCatalogDatasetOptionsGetArgs();
    }
}
