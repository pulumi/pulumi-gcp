// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Sql.Inputs
{

    public sealed class DatabaseInstanceSettingsDataCacheConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether data cache is enabled for the instance. Defaults to `false`
        /// Can only be used with MYSQL.
        /// </summary>
        [Input("dataCacheEnabled")]
        public Input<bool>? DataCacheEnabled { get; set; }

        public DatabaseInstanceSettingsDataCacheConfigArgs()
        {
        }
        public static new DatabaseInstanceSettingsDataCacheConfigArgs Empty => new DatabaseInstanceSettingsDataCacheConfigArgs();
    }
}