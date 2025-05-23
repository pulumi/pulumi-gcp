// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificatemanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.certificatemanager.outputs.GetCertificatesCertificate;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCertificatesResult {
    /**
     * @return A list of all retrieved certificates. See gcp.certificatemanager.Certificate resource for details of the available attributes.
     * 
     */
    private List<GetCertificatesCertificate> certificates;
    private @Nullable String filter;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String region;

    private GetCertificatesResult() {}
    /**
     * @return A list of all retrieved certificates. See gcp.certificatemanager.Certificate resource for details of the available attributes.
     * 
     */
    public List<GetCertificatesCertificate> certificates() {
        return this.certificates;
    }
    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificatesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetCertificatesCertificate> certificates;
        private @Nullable String filter;
        private String id;
        private @Nullable String region;
        public Builder() {}
        public Builder(GetCertificatesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder certificates(List<GetCertificatesCertificate> certificates) {
            if (certificates == null) {
              throw new MissingRequiredPropertyException("GetCertificatesResult", "certificates");
            }
            this.certificates = certificates;
            return this;
        }
        public Builder certificates(GetCertificatesCertificate... certificates) {
            return certificates(List.of(certificates));
        }
        @CustomType.Setter
        public Builder filter(@Nullable String filter) {

            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCertificatesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        public GetCertificatesResult build() {
            final var _resultValue = new GetCertificatesResult();
            _resultValue.certificates = certificates;
            _resultValue.filter = filter;
            _resultValue.id = id;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
