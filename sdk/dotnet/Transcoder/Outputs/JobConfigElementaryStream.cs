// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Transcoder.Outputs
{

    [OutputType]
    public sealed class JobConfigElementaryStream
    {
        /// <summary>
        /// Encoding of an audio stream.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.JobConfigElementaryStreamAudioStream? AudioStream;
        /// <summary>
        /// A unique key for this atom.
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// Encoding of a video stream.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.JobConfigElementaryStreamVideoStream? VideoStream;

        [OutputConstructor]
        private JobConfigElementaryStream(
            Outputs.JobConfigElementaryStreamAudioStream? audioStream,

            string? key,

            Outputs.JobConfigElementaryStreamVideoStream? videoStream)
        {
            AudioStream = audioStream;
            Key = key;
            VideoStream = videoStream;
        }
    }
}
