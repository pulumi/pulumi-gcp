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
    public sealed class JobTemplateConfigElementaryStreamVideoStream
    {
        /// <summary>
        /// H264 codec settings
        /// Structure is documented below.
        /// 
        /// 
        /// &lt;a name="nested_config_elementary_streams_elementary_streams_video_stream_h264"&gt;&lt;/a&gt;The `h264` block supports:
        /// </summary>
        public readonly Outputs.JobTemplateConfigElementaryStreamVideoStreamH264? H264;

        [OutputConstructor]
        private JobTemplateConfigElementaryStreamVideoStream(Outputs.JobTemplateConfigElementaryStreamVideoStreamH264? h264)
        {
            H264 = h264;
        }
    }
}
