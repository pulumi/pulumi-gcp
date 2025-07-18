// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Inputs
{

    public sealed class TransferJobTransferSpecGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An AWS S3 data source. Structure documented below.
        /// </summary>
        [Input("awsS3DataSource")]
        public Input<Inputs.TransferJobTransferSpecAwsS3DataSourceGetArgs>? AwsS3DataSource { get; set; }

        /// <summary>
        /// An Azure Blob Storage data source. Structure documented below.
        /// </summary>
        [Input("azureBlobStorageDataSource")]
        public Input<Inputs.TransferJobTransferSpecAzureBlobStorageDataSourceGetArgs>? AzureBlobStorageDataSource { get; set; }

        /// <summary>
        /// A Google Cloud Storage data sink. Structure documented below.
        /// </summary>
        [Input("gcsDataSink")]
        public Input<Inputs.TransferJobTransferSpecGcsDataSinkGetArgs>? GcsDataSink { get; set; }

        /// <summary>
        /// A Google Cloud Storage data source. Structure documented below.
        /// </summary>
        [Input("gcsDataSource")]
        public Input<Inputs.TransferJobTransferSpecGcsDataSourceGetArgs>? GcsDataSource { get; set; }

        /// <summary>
        /// An HDFS data source. Structure documented below.
        /// </summary>
        [Input("hdfsDataSource")]
        public Input<Inputs.TransferJobTransferSpecHdfsDataSourceGetArgs>? HdfsDataSource { get; set; }

        /// <summary>
        /// A HTTP URL data source. Structure documented below.
        /// </summary>
        [Input("httpDataSource")]
        public Input<Inputs.TransferJobTransferSpecHttpDataSourceGetArgs>? HttpDataSource { get; set; }

        /// <summary>
        /// Only objects that satisfy these object conditions are included in the set of data source and data sink objects. Object conditions based on objects' `last_modification_time` do not exclude objects in a data sink. Structure documented below.
        /// </summary>
        [Input("objectConditions")]
        public Input<Inputs.TransferJobTransferSpecObjectConditionsGetArgs>? ObjectConditions { get; set; }

        /// <summary>
        /// A POSIX data sink. Structure documented below.
        /// </summary>
        [Input("posixDataSink")]
        public Input<Inputs.TransferJobTransferSpecPosixDataSinkGetArgs>? PosixDataSink { get; set; }

        /// <summary>
        /// A POSIX filesystem data source. Structure documented below.
        /// </summary>
        [Input("posixDataSource")]
        public Input<Inputs.TransferJobTransferSpecPosixDataSourceGetArgs>? PosixDataSource { get; set; }

        /// <summary>
        /// Specifies the agent pool name associated with the posix data sink. When unspecified, the default name is used.
        /// </summary>
        [Input("sinkAgentPoolName")]
        public Input<string>? SinkAgentPoolName { get; set; }

        /// <summary>
        /// Specifies the agent pool name associated with the posix data source. When unspecified, the default name is used.
        /// </summary>
        [Input("sourceAgentPoolName")]
        public Input<string>? SourceAgentPoolName { get; set; }

        /// <summary>
        /// Characteristics of how to treat files from datasource and sink during job. If the option `delete_objects_unique_in_sink` is true, object conditions based on objects' `last_modification_time` are ignored and do not exclude objects in a data source or a data sink. Structure documented below.
        /// </summary>
        [Input("transferOptions")]
        public Input<Inputs.TransferJobTransferSpecTransferOptionsGetArgs>? TransferOptions { get; set; }

        public TransferJobTransferSpecGetArgs()
        {
        }
        public static new TransferJobTransferSpecGetArgs Empty => new TransferJobTransferSpecGetArgs();
    }
}
