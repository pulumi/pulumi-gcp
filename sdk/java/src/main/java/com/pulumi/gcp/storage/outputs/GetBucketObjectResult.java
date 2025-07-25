// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.storage.outputs.GetBucketObjectCustomerEncryption;
import com.pulumi.gcp.storage.outputs.GetBucketObjectRetention;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBucketObjectResult {
    private @Nullable String bucket;
    /**
     * @return (Computed) [Cache-Control](https://tools.ietf.org/html/rfc7234#section-5.2)
     * directive to specify caching behavior of object data. If omitted and object is accessible to all anonymous users, the default will be public, max-age=3600
     * 
     */
    private String cacheControl;
    private String content;
    /**
     * @return (Computed) [Content-Disposition](https://tools.ietf.org/html/rfc6266) of the object data.
     * 
     */
    private String contentDisposition;
    /**
     * @return (Computed) [Content-Encoding](https://tools.ietf.org/html/rfc7231#section-3.1.2.2) of the object data.
     * 
     */
    private String contentEncoding;
    /**
     * @return (Computed) [Content-Language](https://tools.ietf.org/html/rfc7231#section-3.1.3.2) of the object data.
     * 
     */
    private String contentLanguage;
    /**
     * @return (Computed) [Content-Type](https://tools.ietf.org/html/rfc7231#section-3.1.1.5) of the object data. Defaults to &#34;application/octet-stream&#34; or &#34;text/plain; charset=utf-8&#34;.
     * 
     */
    private String contentType;
    /**
     * @return (Computed) Base 64 CRC32 hash of the uploaded data.
     * 
     */
    private String crc32c;
    private List<GetBucketObjectCustomerEncryption> customerEncryptions;
    private String detectMd5hash;
    /**
     * @return (Computed) Whether an object is under [event-based hold](https://cloud.google.com/storage/docs/object-holds#hold-types). Event-based hold is a way to retain objects until an event occurs, which is signified by the hold&#39;s release (i.e. this value is set to false). After being released (set to false), such objects will be subject to bucket-level retention (if any).
     * 
     */
    private Boolean eventBasedHold;
    private Boolean forceEmptyContentType;
    /**
     * @return (Computed) The content generation of this object. Used for object [versioning](https://cloud.google.com/storage/docs/object-versioning) and [soft delete](https://cloud.google.com/storage/docs/soft-delete).
     * 
     */
    private Integer generation;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String kmsKeyName;
    /**
     * @return (Computed) Base 64 MD5 hash of the uploaded data.
     * 
     */
    private String md5hash;
    private String md5hexhash;
    /**
     * @return (Computed) A url reference to download this object.
     * 
     */
    private String mediaLink;
    private Map<String,String> metadata;
    private @Nullable String name;
    private String outputName;
    private List<GetBucketObjectRetention> retentions;
    /**
     * @return (Computed) A url reference to this object.
     * 
     */
    private String selfLink;
    private String source;
    private String sourceMd5hash;
    /**
     * @return (Computed) The [StorageClass](https://cloud.google.com/storage/docs/storage-classes) of the new bucket object.
     * Supported values include: `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`. If not provided, this defaults to the bucket&#39;s default
     * storage class or to a [standard](https://cloud.google.com/storage/docs/storage-classes#standard) class.
     * 
     */
    private String storageClass;
    /**
     * @return (Computed) Whether an object is under [temporary hold](https://cloud.google.com/storage/docs/object-holds#hold-types). While this flag is set to true, the object is protected against deletion and overwrites.
     * 
     */
    private Boolean temporaryHold;

    private GetBucketObjectResult() {}
    public Optional<String> bucket() {
        return Optional.ofNullable(this.bucket);
    }
    /**
     * @return (Computed) [Cache-Control](https://tools.ietf.org/html/rfc7234#section-5.2)
     * directive to specify caching behavior of object data. If omitted and object is accessible to all anonymous users, the default will be public, max-age=3600
     * 
     */
    public String cacheControl() {
        return this.cacheControl;
    }
    public String content() {
        return this.content;
    }
    /**
     * @return (Computed) [Content-Disposition](https://tools.ietf.org/html/rfc6266) of the object data.
     * 
     */
    public String contentDisposition() {
        return this.contentDisposition;
    }
    /**
     * @return (Computed) [Content-Encoding](https://tools.ietf.org/html/rfc7231#section-3.1.2.2) of the object data.
     * 
     */
    public String contentEncoding() {
        return this.contentEncoding;
    }
    /**
     * @return (Computed) [Content-Language](https://tools.ietf.org/html/rfc7231#section-3.1.3.2) of the object data.
     * 
     */
    public String contentLanguage() {
        return this.contentLanguage;
    }
    /**
     * @return (Computed) [Content-Type](https://tools.ietf.org/html/rfc7231#section-3.1.1.5) of the object data. Defaults to &#34;application/octet-stream&#34; or &#34;text/plain; charset=utf-8&#34;.
     * 
     */
    public String contentType() {
        return this.contentType;
    }
    /**
     * @return (Computed) Base 64 CRC32 hash of the uploaded data.
     * 
     */
    public String crc32c() {
        return this.crc32c;
    }
    public List<GetBucketObjectCustomerEncryption> customerEncryptions() {
        return this.customerEncryptions;
    }
    public String detectMd5hash() {
        return this.detectMd5hash;
    }
    /**
     * @return (Computed) Whether an object is under [event-based hold](https://cloud.google.com/storage/docs/object-holds#hold-types). Event-based hold is a way to retain objects until an event occurs, which is signified by the hold&#39;s release (i.e. this value is set to false). After being released (set to false), such objects will be subject to bucket-level retention (if any).
     * 
     */
    public Boolean eventBasedHold() {
        return this.eventBasedHold;
    }
    public Boolean forceEmptyContentType() {
        return this.forceEmptyContentType;
    }
    /**
     * @return (Computed) The content generation of this object. Used for object [versioning](https://cloud.google.com/storage/docs/object-versioning) and [soft delete](https://cloud.google.com/storage/docs/soft-delete).
     * 
     */
    public Integer generation() {
        return this.generation;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * @return (Computed) Base 64 MD5 hash of the uploaded data.
     * 
     */
    public String md5hash() {
        return this.md5hash;
    }
    public String md5hexhash() {
        return this.md5hexhash;
    }
    /**
     * @return (Computed) A url reference to download this object.
     * 
     */
    public String mediaLink() {
        return this.mediaLink;
    }
    public Map<String,String> metadata() {
        return this.metadata;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public String outputName() {
        return this.outputName;
    }
    public List<GetBucketObjectRetention> retentions() {
        return this.retentions;
    }
    /**
     * @return (Computed) A url reference to this object.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    public String source() {
        return this.source;
    }
    public String sourceMd5hash() {
        return this.sourceMd5hash;
    }
    /**
     * @return (Computed) The [StorageClass](https://cloud.google.com/storage/docs/storage-classes) of the new bucket object.
     * Supported values include: `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`. If not provided, this defaults to the bucket&#39;s default
     * storage class or to a [standard](https://cloud.google.com/storage/docs/storage-classes#standard) class.
     * 
     */
    public String storageClass() {
        return this.storageClass;
    }
    /**
     * @return (Computed) Whether an object is under [temporary hold](https://cloud.google.com/storage/docs/object-holds#hold-types). While this flag is set to true, the object is protected against deletion and overwrites.
     * 
     */
    public Boolean temporaryHold() {
        return this.temporaryHold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketObjectResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bucket;
        private String cacheControl;
        private String content;
        private String contentDisposition;
        private String contentEncoding;
        private String contentLanguage;
        private String contentType;
        private String crc32c;
        private List<GetBucketObjectCustomerEncryption> customerEncryptions;
        private String detectMd5hash;
        private Boolean eventBasedHold;
        private Boolean forceEmptyContentType;
        private Integer generation;
        private String id;
        private String kmsKeyName;
        private String md5hash;
        private String md5hexhash;
        private String mediaLink;
        private Map<String,String> metadata;
        private @Nullable String name;
        private String outputName;
        private List<GetBucketObjectRetention> retentions;
        private String selfLink;
        private String source;
        private String sourceMd5hash;
        private String storageClass;
        private Boolean temporaryHold;
        public Builder() {}
        public Builder(GetBucketObjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.cacheControl = defaults.cacheControl;
    	      this.content = defaults.content;
    	      this.contentDisposition = defaults.contentDisposition;
    	      this.contentEncoding = defaults.contentEncoding;
    	      this.contentLanguage = defaults.contentLanguage;
    	      this.contentType = defaults.contentType;
    	      this.crc32c = defaults.crc32c;
    	      this.customerEncryptions = defaults.customerEncryptions;
    	      this.detectMd5hash = defaults.detectMd5hash;
    	      this.eventBasedHold = defaults.eventBasedHold;
    	      this.forceEmptyContentType = defaults.forceEmptyContentType;
    	      this.generation = defaults.generation;
    	      this.id = defaults.id;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.md5hash = defaults.md5hash;
    	      this.md5hexhash = defaults.md5hexhash;
    	      this.mediaLink = defaults.mediaLink;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.outputName = defaults.outputName;
    	      this.retentions = defaults.retentions;
    	      this.selfLink = defaults.selfLink;
    	      this.source = defaults.source;
    	      this.sourceMd5hash = defaults.sourceMd5hash;
    	      this.storageClass = defaults.storageClass;
    	      this.temporaryHold = defaults.temporaryHold;
        }

        @CustomType.Setter
        public Builder bucket(@Nullable String bucket) {

            this.bucket = bucket;
            return this;
        }
        @CustomType.Setter
        public Builder cacheControl(String cacheControl) {
            if (cacheControl == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "cacheControl");
            }
            this.cacheControl = cacheControl;
            return this;
        }
        @CustomType.Setter
        public Builder content(String content) {
            if (content == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "content");
            }
            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder contentDisposition(String contentDisposition) {
            if (contentDisposition == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "contentDisposition");
            }
            this.contentDisposition = contentDisposition;
            return this;
        }
        @CustomType.Setter
        public Builder contentEncoding(String contentEncoding) {
            if (contentEncoding == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "contentEncoding");
            }
            this.contentEncoding = contentEncoding;
            return this;
        }
        @CustomType.Setter
        public Builder contentLanguage(String contentLanguage) {
            if (contentLanguage == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "contentLanguage");
            }
            this.contentLanguage = contentLanguage;
            return this;
        }
        @CustomType.Setter
        public Builder contentType(String contentType) {
            if (contentType == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "contentType");
            }
            this.contentType = contentType;
            return this;
        }
        @CustomType.Setter
        public Builder crc32c(String crc32c) {
            if (crc32c == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "crc32c");
            }
            this.crc32c = crc32c;
            return this;
        }
        @CustomType.Setter
        public Builder customerEncryptions(List<GetBucketObjectCustomerEncryption> customerEncryptions) {
            if (customerEncryptions == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "customerEncryptions");
            }
            this.customerEncryptions = customerEncryptions;
            return this;
        }
        public Builder customerEncryptions(GetBucketObjectCustomerEncryption... customerEncryptions) {
            return customerEncryptions(List.of(customerEncryptions));
        }
        @CustomType.Setter
        public Builder detectMd5hash(String detectMd5hash) {
            if (detectMd5hash == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "detectMd5hash");
            }
            this.detectMd5hash = detectMd5hash;
            return this;
        }
        @CustomType.Setter
        public Builder eventBasedHold(Boolean eventBasedHold) {
            if (eventBasedHold == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "eventBasedHold");
            }
            this.eventBasedHold = eventBasedHold;
            return this;
        }
        @CustomType.Setter
        public Builder forceEmptyContentType(Boolean forceEmptyContentType) {
            if (forceEmptyContentType == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "forceEmptyContentType");
            }
            this.forceEmptyContentType = forceEmptyContentType;
            return this;
        }
        @CustomType.Setter
        public Builder generation(Integer generation) {
            if (generation == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "generation");
            }
            this.generation = generation;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyName(String kmsKeyName) {
            if (kmsKeyName == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "kmsKeyName");
            }
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        @CustomType.Setter
        public Builder md5hash(String md5hash) {
            if (md5hash == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "md5hash");
            }
            this.md5hash = md5hash;
            return this;
        }
        @CustomType.Setter
        public Builder md5hexhash(String md5hexhash) {
            if (md5hexhash == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "md5hexhash");
            }
            this.md5hexhash = md5hexhash;
            return this;
        }
        @CustomType.Setter
        public Builder mediaLink(String mediaLink) {
            if (mediaLink == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "mediaLink");
            }
            this.mediaLink = mediaLink;
            return this;
        }
        @CustomType.Setter
        public Builder metadata(Map<String,String> metadata) {
            if (metadata == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "metadata");
            }
            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder outputName(String outputName) {
            if (outputName == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "outputName");
            }
            this.outputName = outputName;
            return this;
        }
        @CustomType.Setter
        public Builder retentions(List<GetBucketObjectRetention> retentions) {
            if (retentions == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "retentions");
            }
            this.retentions = retentions;
            return this;
        }
        public Builder retentions(GetBucketObjectRetention... retentions) {
            return retentions(List.of(retentions));
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            if (selfLink == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "selfLink");
            }
            this.selfLink = selfLink;
            return this;
        }
        @CustomType.Setter
        public Builder source(String source) {
            if (source == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "source");
            }
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder sourceMd5hash(String sourceMd5hash) {
            if (sourceMd5hash == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "sourceMd5hash");
            }
            this.sourceMd5hash = sourceMd5hash;
            return this;
        }
        @CustomType.Setter
        public Builder storageClass(String storageClass) {
            if (storageClass == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "storageClass");
            }
            this.storageClass = storageClass;
            return this;
        }
        @CustomType.Setter
        public Builder temporaryHold(Boolean temporaryHold) {
            if (temporaryHold == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectResult", "temporaryHold");
            }
            this.temporaryHold = temporaryHold;
            return this;
        }
        public GetBucketObjectResult build() {
            final var _resultValue = new GetBucketObjectResult();
            _resultValue.bucket = bucket;
            _resultValue.cacheControl = cacheControl;
            _resultValue.content = content;
            _resultValue.contentDisposition = contentDisposition;
            _resultValue.contentEncoding = contentEncoding;
            _resultValue.contentLanguage = contentLanguage;
            _resultValue.contentType = contentType;
            _resultValue.crc32c = crc32c;
            _resultValue.customerEncryptions = customerEncryptions;
            _resultValue.detectMd5hash = detectMd5hash;
            _resultValue.eventBasedHold = eventBasedHold;
            _resultValue.forceEmptyContentType = forceEmptyContentType;
            _resultValue.generation = generation;
            _resultValue.id = id;
            _resultValue.kmsKeyName = kmsKeyName;
            _resultValue.md5hash = md5hash;
            _resultValue.md5hexhash = md5hexhash;
            _resultValue.mediaLink = mediaLink;
            _resultValue.metadata = metadata;
            _resultValue.name = name;
            _resultValue.outputName = outputName;
            _resultValue.retentions = retentions;
            _resultValue.selfLink = selfLink;
            _resultValue.source = source;
            _resultValue.sourceMd5hash = sourceMd5hash;
            _resultValue.storageClass = storageClass;
            _resultValue.temporaryHold = temporaryHold;
            return _resultValue;
        }
    }
}
