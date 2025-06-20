// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Transcoder.Inputs
{

    public sealed class JobTemplateConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("adBreaks")]
        private InputList<Inputs.JobTemplateConfigAdBreakArgs>? _adBreaks;

        /// <summary>
        /// Ad break.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.JobTemplateConfigAdBreakArgs> AdBreaks
        {
            get => _adBreaks ?? (_adBreaks = new InputList<Inputs.JobTemplateConfigAdBreakArgs>());
            set => _adBreaks = value;
        }

        [Input("editLists")]
        private InputList<Inputs.JobTemplateConfigEditListArgs>? _editLists;

        /// <summary>
        /// List of input assets stored in Cloud Storage.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.JobTemplateConfigEditListArgs> EditLists
        {
            get => _editLists ?? (_editLists = new InputList<Inputs.JobTemplateConfigEditListArgs>());
            set => _editLists = value;
        }

        [Input("elementaryStreams")]
        private InputList<Inputs.JobTemplateConfigElementaryStreamArgs>? _elementaryStreams;

        /// <summary>
        /// List of input assets stored in Cloud Storage.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.JobTemplateConfigElementaryStreamArgs> ElementaryStreams
        {
            get => _elementaryStreams ?? (_elementaryStreams = new InputList<Inputs.JobTemplateConfigElementaryStreamArgs>());
            set => _elementaryStreams = value;
        }

        [Input("encryptions")]
        private InputList<Inputs.JobTemplateConfigEncryptionArgs>? _encryptions;

        /// <summary>
        /// List of encryption configurations for the content.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.JobTemplateConfigEncryptionArgs> Encryptions
        {
            get => _encryptions ?? (_encryptions = new InputList<Inputs.JobTemplateConfigEncryptionArgs>());
            set => _encryptions = value;
        }

        [Input("inputs")]
        private InputList<Inputs.JobTemplateConfigInputArgs>? _inputs;

        /// <summary>
        /// List of input assets stored in Cloud Storage.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.JobTemplateConfigInputArgs> Inputs
        {
            get => _inputs ?? (_inputs = new InputList<Inputs.JobTemplateConfigInputArgs>());
            set => _inputs = value;
        }

        [Input("manifests")]
        private InputList<Inputs.JobTemplateConfigManifestArgs>? _manifests;

        /// <summary>
        /// Manifest configuration.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.JobTemplateConfigManifestArgs> Manifests
        {
            get => _manifests ?? (_manifests = new InputList<Inputs.JobTemplateConfigManifestArgs>());
            set => _manifests = value;
        }

        [Input("muxStreams")]
        private InputList<Inputs.JobTemplateConfigMuxStreamArgs>? _muxStreams;

        /// <summary>
        /// Multiplexing settings for output stream.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.JobTemplateConfigMuxStreamArgs> MuxStreams
        {
            get => _muxStreams ?? (_muxStreams = new InputList<Inputs.JobTemplateConfigMuxStreamArgs>());
            set => _muxStreams = value;
        }

        /// <summary>
        /// Location of output file(s) in a Cloud Storage bucket.
        /// Structure is documented below.
        /// </summary>
        [Input("output")]
        public Input<Inputs.JobTemplateConfigOutputArgs>? Output { get; set; }

        [Input("overlays")]
        private InputList<Inputs.JobTemplateConfigOverlayArgs>? _overlays;

        /// <summary>
        /// List of overlays on the output video, in descending Z-order.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.JobTemplateConfigOverlayArgs> Overlays
        {
            get => _overlays ?? (_overlays = new InputList<Inputs.JobTemplateConfigOverlayArgs>());
            set => _overlays = value;
        }

        /// <summary>
        /// Pub/Sub destination.
        /// Structure is documented below.
        /// </summary>
        [Input("pubsubDestination")]
        public Input<Inputs.JobTemplateConfigPubsubDestinationArgs>? PubsubDestination { get; set; }

        public JobTemplateConfigArgs()
        {
        }
        public static new JobTemplateConfigArgs Empty => new JobTemplateConfigArgs();
    }
}
