// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetInstanceBootDiskInitializeParam {
    /**
     * @return The image from which this disk was initialised.
     * 
     */
    private final String image;
    /**
     * @return A set of key/value label pairs assigned to the instance.
     * 
     */
    private final Map<String,Object> labels;
    /**
     * @return The size of the image in gigabytes.
     * 
     */
    private final Integer size;
    /**
     * @return The accelerator type resource exposed to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetInstanceBootDiskInitializeParam(
        @CustomType.Parameter("image") String image,
        @CustomType.Parameter("labels") Map<String,Object> labels,
        @CustomType.Parameter("size") Integer size,
        @CustomType.Parameter("type") String type) {
        this.image = image;
        this.labels = labels;
        this.size = size;
        this.type = type;
    }

    /**
     * @return The image from which this disk was initialised.
     * 
     */
    public String image() {
        return this.image;
    }
    /**
     * @return A set of key/value label pairs assigned to the instance.
     * 
     */
    public Map<String,Object> labels() {
        return this.labels;
    }
    /**
     * @return The size of the image in gigabytes.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return The accelerator type resource exposed to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceBootDiskInitializeParam defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String image;
        private Map<String,Object> labels;
        private Integer size;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceBootDiskInitializeParam defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
    	      this.labels = defaults.labels;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder labels(Map<String,Object> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetInstanceBootDiskInitializeParam build() {
            return new GetInstanceBootDiskInitializeParam(image, labels, size, type);
        }
    }
}