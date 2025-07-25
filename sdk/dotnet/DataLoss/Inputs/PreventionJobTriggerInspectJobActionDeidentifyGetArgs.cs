// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionJobTriggerInspectJobActionDeidentifyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User settable Cloud Storage bucket and folders to store de-identified files.
        /// This field must be set for cloud storage deidentification.
        /// The output Cloud Storage bucket must be different from the input bucket.
        /// De-identified files will overwrite files in the output path.
        /// Form of: gs://bucket/folder/ or gs://bucket
        /// </summary>
        [Input("cloudStorageOutput", required: true)]
        public Input<string> CloudStorageOutput { get; set; } = null!;

        [Input("fileTypesToTransforms")]
        private InputList<string>? _fileTypesToTransforms;

        /// <summary>
        /// List of user-specified file type groups to transform. If specified, only the files with these filetypes will be transformed.
        /// If empty, all supported files will be transformed. Supported types may be automatically added over time.
        /// If a file type is set in this field that isn't supported by the Deidentify action then the job will fail and will not be successfully created/started.
        /// Each value may be one of: `IMAGE`, `TEXT_FILE`, `CSV`, `TSV`.
        /// </summary>
        public InputList<string> FileTypesToTransforms
        {
            get => _fileTypesToTransforms ?? (_fileTypesToTransforms = new InputList<string>());
            set => _fileTypesToTransforms = value;
        }

        /// <summary>
        /// User specified deidentify templates and configs for structured, unstructured, and image files.
        /// Structure is documented below.
        /// </summary>
        [Input("transformationConfig")]
        public Input<Inputs.PreventionJobTriggerInspectJobActionDeidentifyTransformationConfigGetArgs>? TransformationConfig { get; set; }

        /// <summary>
        /// Config for storing transformation details.
        /// Structure is documented below.
        /// </summary>
        [Input("transformationDetailsStorageConfig")]
        public Input<Inputs.PreventionJobTriggerInspectJobActionDeidentifyTransformationDetailsStorageConfigGetArgs>? TransformationDetailsStorageConfig { get; set; }

        public PreventionJobTriggerInspectJobActionDeidentifyGetArgs()
        {
        }
        public static new PreventionJobTriggerInspectJobActionDeidentifyGetArgs Empty => new PreventionJobTriggerInspectJobActionDeidentifyGetArgs();
    }
}
