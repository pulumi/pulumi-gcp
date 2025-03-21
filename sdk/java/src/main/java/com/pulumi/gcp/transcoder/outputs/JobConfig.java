// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.transcoder.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.transcoder.outputs.JobConfigAdBreak;
import com.pulumi.gcp.transcoder.outputs.JobConfigEditList;
import com.pulumi.gcp.transcoder.outputs.JobConfigElementaryStream;
import com.pulumi.gcp.transcoder.outputs.JobConfigEncryption;
import com.pulumi.gcp.transcoder.outputs.JobConfigInput;
import com.pulumi.gcp.transcoder.outputs.JobConfigManifest;
import com.pulumi.gcp.transcoder.outputs.JobConfigMuxStream;
import com.pulumi.gcp.transcoder.outputs.JobConfigOutput;
import com.pulumi.gcp.transcoder.outputs.JobConfigOverlay;
import com.pulumi.gcp.transcoder.outputs.JobConfigPubsubDestination;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobConfig {
    /**
     * @return Ad break.
     * Structure is documented below.
     * 
     */
    private @Nullable List<JobConfigAdBreak> adBreaks;
    /**
     * @return List of input assets stored in Cloud Storage.
     * Structure is documented below.
     * 
     */
    private @Nullable List<JobConfigEditList> editLists;
    /**
     * @return List of input assets stored in Cloud Storage.
     * Structure is documented below.
     * 
     */
    private @Nullable List<JobConfigElementaryStream> elementaryStreams;
    /**
     * @return List of encryption configurations for the content.
     * Structure is documented below.
     * 
     */
    private @Nullable List<JobConfigEncryption> encryptions;
    /**
     * @return List of input assets stored in Cloud Storage.
     * Structure is documented below.
     * 
     */
    private @Nullable List<JobConfigInput> inputs;
    /**
     * @return Manifest configuration.
     * Structure is documented below.
     * 
     */
    private @Nullable List<JobConfigManifest> manifests;
    /**
     * @return Multiplexing settings for output stream.
     * Structure is documented below.
     * 
     */
    private @Nullable List<JobConfigMuxStream> muxStreams;
    /**
     * @return Location of output file(s) in a Cloud Storage bucket.
     * Structure is documented below.
     * 
     */
    private @Nullable JobConfigOutput output;
    /**
     * @return List of overlays on the output video, in descending Z-order.
     * Structure is documented below.
     * 
     */
    private @Nullable List<JobConfigOverlay> overlays;
    /**
     * @return Pub/Sub destination.
     * Structure is documented below.
     * 
     */
    private @Nullable JobConfigPubsubDestination pubsubDestination;

    private JobConfig() {}
    /**
     * @return Ad break.
     * Structure is documented below.
     * 
     */
    public List<JobConfigAdBreak> adBreaks() {
        return this.adBreaks == null ? List.of() : this.adBreaks;
    }
    /**
     * @return List of input assets stored in Cloud Storage.
     * Structure is documented below.
     * 
     */
    public List<JobConfigEditList> editLists() {
        return this.editLists == null ? List.of() : this.editLists;
    }
    /**
     * @return List of input assets stored in Cloud Storage.
     * Structure is documented below.
     * 
     */
    public List<JobConfigElementaryStream> elementaryStreams() {
        return this.elementaryStreams == null ? List.of() : this.elementaryStreams;
    }
    /**
     * @return List of encryption configurations for the content.
     * Structure is documented below.
     * 
     */
    public List<JobConfigEncryption> encryptions() {
        return this.encryptions == null ? List.of() : this.encryptions;
    }
    /**
     * @return List of input assets stored in Cloud Storage.
     * Structure is documented below.
     * 
     */
    public List<JobConfigInput> inputs() {
        return this.inputs == null ? List.of() : this.inputs;
    }
    /**
     * @return Manifest configuration.
     * Structure is documented below.
     * 
     */
    public List<JobConfigManifest> manifests() {
        return this.manifests == null ? List.of() : this.manifests;
    }
    /**
     * @return Multiplexing settings for output stream.
     * Structure is documented below.
     * 
     */
    public List<JobConfigMuxStream> muxStreams() {
        return this.muxStreams == null ? List.of() : this.muxStreams;
    }
    /**
     * @return Location of output file(s) in a Cloud Storage bucket.
     * Structure is documented below.
     * 
     */
    public Optional<JobConfigOutput> output() {
        return Optional.ofNullable(this.output);
    }
    /**
     * @return List of overlays on the output video, in descending Z-order.
     * Structure is documented below.
     * 
     */
    public List<JobConfigOverlay> overlays() {
        return this.overlays == null ? List.of() : this.overlays;
    }
    /**
     * @return Pub/Sub destination.
     * Structure is documented below.
     * 
     */
    public Optional<JobConfigPubsubDestination> pubsubDestination() {
        return Optional.ofNullable(this.pubsubDestination);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<JobConfigAdBreak> adBreaks;
        private @Nullable List<JobConfigEditList> editLists;
        private @Nullable List<JobConfigElementaryStream> elementaryStreams;
        private @Nullable List<JobConfigEncryption> encryptions;
        private @Nullable List<JobConfigInput> inputs;
        private @Nullable List<JobConfigManifest> manifests;
        private @Nullable List<JobConfigMuxStream> muxStreams;
        private @Nullable JobConfigOutput output;
        private @Nullable List<JobConfigOverlay> overlays;
        private @Nullable JobConfigPubsubDestination pubsubDestination;
        public Builder() {}
        public Builder(JobConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adBreaks = defaults.adBreaks;
    	      this.editLists = defaults.editLists;
    	      this.elementaryStreams = defaults.elementaryStreams;
    	      this.encryptions = defaults.encryptions;
    	      this.inputs = defaults.inputs;
    	      this.manifests = defaults.manifests;
    	      this.muxStreams = defaults.muxStreams;
    	      this.output = defaults.output;
    	      this.overlays = defaults.overlays;
    	      this.pubsubDestination = defaults.pubsubDestination;
        }

        @CustomType.Setter
        public Builder adBreaks(@Nullable List<JobConfigAdBreak> adBreaks) {

            this.adBreaks = adBreaks;
            return this;
        }
        public Builder adBreaks(JobConfigAdBreak... adBreaks) {
            return adBreaks(List.of(adBreaks));
        }
        @CustomType.Setter
        public Builder editLists(@Nullable List<JobConfigEditList> editLists) {

            this.editLists = editLists;
            return this;
        }
        public Builder editLists(JobConfigEditList... editLists) {
            return editLists(List.of(editLists));
        }
        @CustomType.Setter
        public Builder elementaryStreams(@Nullable List<JobConfigElementaryStream> elementaryStreams) {

            this.elementaryStreams = elementaryStreams;
            return this;
        }
        public Builder elementaryStreams(JobConfigElementaryStream... elementaryStreams) {
            return elementaryStreams(List.of(elementaryStreams));
        }
        @CustomType.Setter
        public Builder encryptions(@Nullable List<JobConfigEncryption> encryptions) {

            this.encryptions = encryptions;
            return this;
        }
        public Builder encryptions(JobConfigEncryption... encryptions) {
            return encryptions(List.of(encryptions));
        }
        @CustomType.Setter
        public Builder inputs(@Nullable List<JobConfigInput> inputs) {

            this.inputs = inputs;
            return this;
        }
        public Builder inputs(JobConfigInput... inputs) {
            return inputs(List.of(inputs));
        }
        @CustomType.Setter
        public Builder manifests(@Nullable List<JobConfigManifest> manifests) {

            this.manifests = manifests;
            return this;
        }
        public Builder manifests(JobConfigManifest... manifests) {
            return manifests(List.of(manifests));
        }
        @CustomType.Setter
        public Builder muxStreams(@Nullable List<JobConfigMuxStream> muxStreams) {

            this.muxStreams = muxStreams;
            return this;
        }
        public Builder muxStreams(JobConfigMuxStream... muxStreams) {
            return muxStreams(List.of(muxStreams));
        }
        @CustomType.Setter
        public Builder output(@Nullable JobConfigOutput output) {

            this.output = output;
            return this;
        }
        @CustomType.Setter
        public Builder overlays(@Nullable List<JobConfigOverlay> overlays) {

            this.overlays = overlays;
            return this;
        }
        public Builder overlays(JobConfigOverlay... overlays) {
            return overlays(List.of(overlays));
        }
        @CustomType.Setter
        public Builder pubsubDestination(@Nullable JobConfigPubsubDestination pubsubDestination) {

            this.pubsubDestination = pubsubDestination;
            return this;
        }
        public JobConfig build() {
            final var _resultValue = new JobConfig();
            _resultValue.adBreaks = adBreaks;
            _resultValue.editLists = editLists;
            _resultValue.elementaryStreams = elementaryStreams;
            _resultValue.encryptions = encryptions;
            _resultValue.inputs = inputs;
            _resultValue.manifests = manifests;
            _resultValue.muxStreams = muxStreams;
            _resultValue.output = output;
            _resultValue.overlays = overlays;
            _resultValue.pubsubDestination = pubsubDestination;
            return _resultValue;
        }
    }
}
