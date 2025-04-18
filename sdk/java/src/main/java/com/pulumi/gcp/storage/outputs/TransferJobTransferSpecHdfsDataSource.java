// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TransferJobTransferSpecHdfsDataSource {
    /**
     * @return Root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;.
     * 
     */
    private String path;

    private TransferJobTransferSpecHdfsDataSource() {}
    /**
     * @return Root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;.
     * 
     */
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecHdfsDataSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String path;
        public Builder() {}
        public Builder(TransferJobTransferSpecHdfsDataSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("TransferJobTransferSpecHdfsDataSource", "path");
            }
            this.path = path;
            return this;
        }
        public TransferJobTransferSpecHdfsDataSource build() {
            final var _resultValue = new TransferJobTransferSpecHdfsDataSource();
            _resultValue.path = path;
            return _resultValue;
        }
    }
}
