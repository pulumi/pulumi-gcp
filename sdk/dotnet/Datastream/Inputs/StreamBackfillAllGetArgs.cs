// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Inputs
{

    public sealed class StreamBackfillAllGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// MySQL data source objects to avoid backfilling.
        /// Structure is documented below.
        /// </summary>
        [Input("mysqlExcludedObjects")]
        public Input<Inputs.StreamBackfillAllMysqlExcludedObjectsGetArgs>? MysqlExcludedObjects { get; set; }

        public StreamBackfillAllGetArgs()
        {
        }
        public static new StreamBackfillAllGetArgs Empty => new StreamBackfillAllGetArgs();
    }
}