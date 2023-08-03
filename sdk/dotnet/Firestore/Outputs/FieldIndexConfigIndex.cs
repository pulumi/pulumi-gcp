// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firestore.Outputs
{

    [OutputType]
    public sealed class FieldIndexConfigIndex
    {
        /// <summary>
        /// Indicates that this field supports operations on arrayValues. Only one of `order` and `arrayConfig` can
        /// be specified.
        /// Possible values are: `CONTAINS`.
        /// </summary>
        public readonly string? ArrayConfig;
        /// <summary>
        /// Indicates that this field supports ordering by the specified order or comparing using =, &lt;, &lt;=, &gt;, &gt;=, !=.
        /// Only one of `order` and `arrayConfig` can be specified.
        /// Possible values are: `ASCENDING`, `DESCENDING`.
        /// </summary>
        public readonly string? Order;
        /// <summary>
        /// The scope at which a query is run. Collection scoped queries require you specify
        /// the collection at query time. Collection group scope allows queries across all
        /// collections with the same id.
        /// Default value is `COLLECTION`.
        /// Possible values are: `COLLECTION`, `COLLECTION_GROUP`.
        /// </summary>
        public readonly string? QueryScope;

        [OutputConstructor]
        private FieldIndexConfigIndex(
            string? arrayConfig,

            string? order,

            string? queryScope)
        {
            ArrayConfig = arrayConfig;
            Order = order;
            QueryScope = queryScope;
        }
    }
}