// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firestore.Inputs
{

    public sealed class FieldIndexConfigIndexGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates that this field supports operations on arrayValues. Only one of `order` and `arrayConfig` can
        /// be specified.
        /// Possible values are: `CONTAINS`.
        /// </summary>
        [Input("arrayConfig")]
        public Input<string>? ArrayConfig { get; set; }

        /// <summary>
        /// Indicates that this field supports ordering by the specified order or comparing using =, &lt;, &lt;=, &gt;, &gt;=, !=.
        /// Only one of `order` and `arrayConfig` can be specified.
        /// Possible values are: `ASCENDING`, `DESCENDING`.
        /// </summary>
        [Input("order")]
        public Input<string>? Order { get; set; }

        /// <summary>
        /// The scope at which a query is run. Collection scoped queries require you specify
        /// the collection at query time. Collection group scope allows queries across all
        /// collections with the same id.
        /// Default value is `COLLECTION`.
        /// Possible values are: `COLLECTION`, `COLLECTION_GROUP`.
        /// </summary>
        [Input("queryScope")]
        public Input<string>? QueryScope { get; set; }

        public FieldIndexConfigIndexGetArgs()
        {
        }
        public static new FieldIndexConfigIndexGetArgs Empty => new FieldIndexConfigIndexGetArgs();
    }
}