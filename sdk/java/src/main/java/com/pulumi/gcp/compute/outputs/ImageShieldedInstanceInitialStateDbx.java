// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImageShieldedInstanceInitialStateDbx {
    /**
     * @return The raw content in the secure keys file.
     * A base64-encoded string.
     * 
     */
    private String content;
    /**
     * @return The file type of source file.
     * 
     */
    private @Nullable String fileType;

    private ImageShieldedInstanceInitialStateDbx() {}
    /**
     * @return The raw content in the secure keys file.
     * A base64-encoded string.
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return The file type of source file.
     * 
     */
    public Optional<String> fileType() {
        return Optional.ofNullable(this.fileType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageShieldedInstanceInitialStateDbx defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String content;
        private @Nullable String fileType;
        public Builder() {}
        public Builder(ImageShieldedInstanceInitialStateDbx defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.fileType = defaults.fileType;
        }

        @CustomType.Setter
        public Builder content(String content) {
            if (content == null) {
              throw new MissingRequiredPropertyException("ImageShieldedInstanceInitialStateDbx", "content");
            }
            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder fileType(@Nullable String fileType) {

            this.fileType = fileType;
            return this;
        }
        public ImageShieldedInstanceInitialStateDbx build() {
            final var _resultValue = new ImageShieldedInstanceInitialStateDbx();
            _resultValue.content = content;
            _resultValue.fileType = fileType;
            return _resultValue;
        }
    }
}
