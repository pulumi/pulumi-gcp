// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tpu.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V2VmDataDisk {
    /**
     * @return The mode in which to attach this disk. If not specified, the default is READ_WRITE
     * mode. Only applicable to dataDisks.
     * Default value is `READ_WRITE`.
     * Possible values are: `READ_WRITE`, `READ_ONLY`.
     * 
     */
    private @Nullable String mode;
    /**
     * @return Specifies the full path to an existing disk. For example:
     * &#34;projects/my-project/zones/us-central1-c/disks/my-disk&#34;.
     * 
     */
    private String sourceDisk;

    private V2VmDataDisk() {}
    /**
     * @return The mode in which to attach this disk. If not specified, the default is READ_WRITE
     * mode. Only applicable to dataDisks.
     * Default value is `READ_WRITE`.
     * Possible values are: `READ_WRITE`, `READ_ONLY`.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return Specifies the full path to an existing disk. For example:
     * &#34;projects/my-project/zones/us-central1-c/disks/my-disk&#34;.
     * 
     */
    public String sourceDisk() {
        return this.sourceDisk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2VmDataDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mode;
        private String sourceDisk;
        public Builder() {}
        public Builder(V2VmDataDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.sourceDisk = defaults.sourceDisk;
        }

        @CustomType.Setter
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder sourceDisk(String sourceDisk) {
            this.sourceDisk = Objects.requireNonNull(sourceDisk);
            return this;
        }
        public V2VmDataDisk build() {
            final var o = new V2VmDataDisk();
            o.mode = mode;
            o.sourceDisk = sourceDisk;
            return o;
        }
    }
}