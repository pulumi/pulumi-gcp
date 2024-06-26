// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.netapp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeMountOption {
    /**
     * @return (Output)
     * Export path of the volume.
     * 
     */
    private @Nullable String export;
    /**
     * @return (Output)
     * Full export path of the volume.
     * Format for NFS volumes: `&lt;export_ip&gt;:/&lt;shareName&gt;`
     * Format for SMB volumes: `\\\\netbios_prefix-four_random_hex_letters.domain_name\\shareName`
     * 
     */
    private @Nullable String exportFull;
    /**
     * @return (Output)
     * Human-readable mount instructions.
     * 
     */
    private @Nullable String instructions;
    /**
     * @return (Output)
     * Protocol to mount with.
     * 
     */
    private @Nullable String protocol;

    private VolumeMountOption() {}
    /**
     * @return (Output)
     * Export path of the volume.
     * 
     */
    public Optional<String> export() {
        return Optional.ofNullable(this.export);
    }
    /**
     * @return (Output)
     * Full export path of the volume.
     * Format for NFS volumes: `&lt;export_ip&gt;:/&lt;shareName&gt;`
     * Format for SMB volumes: `\\\\netbios_prefix-four_random_hex_letters.domain_name\\shareName`
     * 
     */
    public Optional<String> exportFull() {
        return Optional.ofNullable(this.exportFull);
    }
    /**
     * @return (Output)
     * Human-readable mount instructions.
     * 
     */
    public Optional<String> instructions() {
        return Optional.ofNullable(this.instructions);
    }
    /**
     * @return (Output)
     * Protocol to mount with.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeMountOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String export;
        private @Nullable String exportFull;
        private @Nullable String instructions;
        private @Nullable String protocol;
        public Builder() {}
        public Builder(VolumeMountOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.export = defaults.export;
    	      this.exportFull = defaults.exportFull;
    	      this.instructions = defaults.instructions;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder export(@Nullable String export) {

            this.export = export;
            return this;
        }
        @CustomType.Setter
        public Builder exportFull(@Nullable String exportFull) {

            this.exportFull = exportFull;
            return this;
        }
        @CustomType.Setter
        public Builder instructions(@Nullable String instructions) {

            this.instructions = instructions;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {

            this.protocol = protocol;
            return this;
        }
        public VolumeMountOption build() {
            final var _resultValue = new VolumeMountOption();
            _resultValue.export = export;
            _resultValue.exportFull = exportFull;
            _resultValue.instructions = instructions;
            _resultValue.protocol = protocol;
            return _resultValue;
        }
    }
}
