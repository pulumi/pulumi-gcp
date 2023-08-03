// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Inputs
{

    public sealed class DatascanDataProfileResultArgs : global::Pulumi.ResourceArgs
    {
        [Input("profiles")]
        private InputList<Inputs.DatascanDataProfileResultProfileArgs>? _profiles;

        /// <summary>
        /// Profile information for the corresponding field.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.DatascanDataProfileResultProfileArgs> Profiles
        {
            get => _profiles ?? (_profiles = new InputList<Inputs.DatascanDataProfileResultProfileArgs>());
            set => _profiles = value;
        }

        /// <summary>
        /// The count of rows scanned.
        /// </summary>
        [Input("rowCount")]
        public Input<string>? RowCount { get; set; }

        [Input("scannedDatas")]
        private InputList<Inputs.DatascanDataProfileResultScannedDataArgs>? _scannedDatas;

        /// <summary>
        /// (Output)
        /// The data scanned for this result.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.DatascanDataProfileResultScannedDataArgs> ScannedDatas
        {
            get => _scannedDatas ?? (_scannedDatas = new InputList<Inputs.DatascanDataProfileResultScannedDataArgs>());
            set => _scannedDatas = value;
        }

        public DatascanDataProfileResultArgs()
        {
        }
        public static new DatascanDataProfileResultArgs Empty => new DatascanDataProfileResultArgs();
    }
}