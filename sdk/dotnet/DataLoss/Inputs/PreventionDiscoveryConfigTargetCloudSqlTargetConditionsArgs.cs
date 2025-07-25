// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDiscoveryConfigTargetCloudSqlTargetConditionsArgs : global::Pulumi.ResourceArgs
    {
        [Input("databaseEngines")]
        private InputList<string>? _databaseEngines;

        /// <summary>
        /// Database engines that should be profiled. Optional. Defaults to ALL_SUPPORTED_DATABASE_ENGINES if unspecified.
        /// Each value may be one of: `ALL_SUPPORTED_DATABASE_ENGINES`, `MYSQL`, `POSTGRES`.
        /// </summary>
        public InputList<string> DatabaseEngines
        {
            get => _databaseEngines ?? (_databaseEngines = new InputList<string>());
            set => _databaseEngines = value;
        }

        [Input("types")]
        private InputList<string>? _types;

        /// <summary>
        /// Data profiles will only be generated for the database resource types specified in this field. If not specified, defaults to [DATABASE_RESOURCE_TYPE_ALL_SUPPORTED_TYPES].
        /// Each value may be one of: `DATABASE_RESOURCE_TYPE_ALL_SUPPORTED_TYPES`, `DATABASE_RESOURCE_TYPE_TABLE`.
        /// </summary>
        public InputList<string> Types
        {
            get => _types ?? (_types = new InputList<string>());
            set => _types = value;
        }

        public PreventionDiscoveryConfigTargetCloudSqlTargetConditionsArgs()
        {
        }
        public static new PreventionDiscoveryConfigTargetCloudSqlTargetConditionsArgs Empty => new PreventionDiscoveryConfigTargetCloudSqlTargetConditionsArgs();
    }
}
