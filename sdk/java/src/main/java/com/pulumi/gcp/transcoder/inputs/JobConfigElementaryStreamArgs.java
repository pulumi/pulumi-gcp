// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.transcoder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamAudioStreamArgs;
import com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamVideoStreamArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobConfigElementaryStreamArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobConfigElementaryStreamArgs Empty = new JobConfigElementaryStreamArgs();

    /**
     * Encoding of an audio stream.
     * Structure is documented below.
     * 
     */
    @Import(name="audioStream")
    private @Nullable Output<JobConfigElementaryStreamAudioStreamArgs> audioStream;

    /**
     * @return Encoding of an audio stream.
     * Structure is documented below.
     * 
     */
    public Optional<Output<JobConfigElementaryStreamAudioStreamArgs>> audioStream() {
        return Optional.ofNullable(this.audioStream);
    }

    /**
     * A unique key for this atom.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return A unique key for this atom.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Encoding of a video stream.
     * Structure is documented below.
     * 
     */
    @Import(name="videoStream")
    private @Nullable Output<JobConfigElementaryStreamVideoStreamArgs> videoStream;

    /**
     * @return Encoding of a video stream.
     * Structure is documented below.
     * 
     */
    public Optional<Output<JobConfigElementaryStreamVideoStreamArgs>> videoStream() {
        return Optional.ofNullable(this.videoStream);
    }

    private JobConfigElementaryStreamArgs() {}

    private JobConfigElementaryStreamArgs(JobConfigElementaryStreamArgs $) {
        this.audioStream = $.audioStream;
        this.key = $.key;
        this.videoStream = $.videoStream;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobConfigElementaryStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobConfigElementaryStreamArgs $;

        public Builder() {
            $ = new JobConfigElementaryStreamArgs();
        }

        public Builder(JobConfigElementaryStreamArgs defaults) {
            $ = new JobConfigElementaryStreamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audioStream Encoding of an audio stream.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder audioStream(@Nullable Output<JobConfigElementaryStreamAudioStreamArgs> audioStream) {
            $.audioStream = audioStream;
            return this;
        }

        /**
         * @param audioStream Encoding of an audio stream.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder audioStream(JobConfigElementaryStreamAudioStreamArgs audioStream) {
            return audioStream(Output.of(audioStream));
        }

        /**
         * @param key A unique key for this atom.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key A unique key for this atom.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param videoStream Encoding of a video stream.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder videoStream(@Nullable Output<JobConfigElementaryStreamVideoStreamArgs> videoStream) {
            $.videoStream = videoStream;
            return this;
        }

        /**
         * @param videoStream Encoding of a video stream.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder videoStream(JobConfigElementaryStreamVideoStreamArgs videoStream) {
            return videoStream(Output.of(videoStream));
        }

        public JobConfigElementaryStreamArgs build() {
            return $;
        }
    }

}
