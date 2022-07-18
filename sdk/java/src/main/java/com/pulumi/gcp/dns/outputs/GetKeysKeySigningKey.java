// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dns.outputs.GetKeysKeySigningKeyDigest;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKeysKeySigningKey {
    /**
     * @return String mnemonic specifying the DNSSEC algorithm of this key. Immutable after creation time. Possible values are `ecdsap256sha256`, `ecdsap384sha384`, `rsasha1`, `rsasha256`, and `rsasha512`.
     * 
     */
    private final String algorithm;
    /**
     * @return The time that this resource was created in the control plane. This is in RFC3339 text format.
     * 
     */
    private final String creationTime;
    /**
     * @return A mutable string of at most 1024 characters associated with this resource for the user&#39;s convenience.
     * 
     */
    private final String description;
    /**
     * @return A list of cryptographic hashes of the DNSKEY resource record associated with this DnsKey. These digests are needed to construct a DS record that points at this DNS key. Each contains:
     * 
     */
    private final List<GetKeysKeySigningKeyDigest> digests;
    /**
     * @return The DS record based on the KSK record. This is used when [delegating](https://cloud.google.com/dns/docs/dnssec-advanced#subdelegation) DNSSEC-signed subdomains.
     * 
     */
    private final String dsRecord;
    /**
     * @return Unique identifier for the resource; defined by the server.
     * 
     */
    private final String id;
    /**
     * @return Active keys will be used to sign subsequent changes to the ManagedZone. Inactive keys will still be present as DNSKEY Resource Records for the use of resolvers validating existing signatures.
     * 
     */
    private final Boolean isActive;
    /**
     * @return Length of the key in bits. Specified at creation time then immutable.
     * 
     */
    private final Integer keyLength;
    /**
     * @return The key tag is a non-cryptographic hash of the a DNSKEY resource record associated with this DnsKey. The key tag can be used to identify a DNSKEY more quickly (but it is not a unique identifier). In particular, the key tag is used in a parent zone&#39;s DS record to point at the DNSKEY in this child ManagedZone. The key tag is a number in the range [0, 65535] and the algorithm to calculate it is specified in RFC4034 Appendix B.
     * 
     */
    private final Integer keyTag;
    /**
     * @return Base64 encoded public half of this key.
     * 
     */
    private final String publicKey;

    @CustomType.Constructor
    private GetKeysKeySigningKey(
        @CustomType.Parameter("algorithm") String algorithm,
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("digests") List<GetKeysKeySigningKeyDigest> digests,
        @CustomType.Parameter("dsRecord") String dsRecord,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isActive") Boolean isActive,
        @CustomType.Parameter("keyLength") Integer keyLength,
        @CustomType.Parameter("keyTag") Integer keyTag,
        @CustomType.Parameter("publicKey") String publicKey) {
        this.algorithm = algorithm;
        this.creationTime = creationTime;
        this.description = description;
        this.digests = digests;
        this.dsRecord = dsRecord;
        this.id = id;
        this.isActive = isActive;
        this.keyLength = keyLength;
        this.keyTag = keyTag;
        this.publicKey = publicKey;
    }

    /**
     * @return String mnemonic specifying the DNSSEC algorithm of this key. Immutable after creation time. Possible values are `ecdsap256sha256`, `ecdsap384sha384`, `rsasha1`, `rsasha256`, and `rsasha512`.
     * 
     */
    public String algorithm() {
        return this.algorithm;
    }
    /**
     * @return The time that this resource was created in the control plane. This is in RFC3339 text format.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return A mutable string of at most 1024 characters associated with this resource for the user&#39;s convenience.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A list of cryptographic hashes of the DNSKEY resource record associated with this DnsKey. These digests are needed to construct a DS record that points at this DNS key. Each contains:
     * 
     */
    public List<GetKeysKeySigningKeyDigest> digests() {
        return this.digests;
    }
    /**
     * @return The DS record based on the KSK record. This is used when [delegating](https://cloud.google.com/dns/docs/dnssec-advanced#subdelegation) DNSSEC-signed subdomains.
     * 
     */
    public String dsRecord() {
        return this.dsRecord;
    }
    /**
     * @return Unique identifier for the resource; defined by the server.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Active keys will be used to sign subsequent changes to the ManagedZone. Inactive keys will still be present as DNSKEY Resource Records for the use of resolvers validating existing signatures.
     * 
     */
    public Boolean isActive() {
        return this.isActive;
    }
    /**
     * @return Length of the key in bits. Specified at creation time then immutable.
     * 
     */
    public Integer keyLength() {
        return this.keyLength;
    }
    /**
     * @return The key tag is a non-cryptographic hash of the a DNSKEY resource record associated with this DnsKey. The key tag can be used to identify a DNSKEY more quickly (but it is not a unique identifier). In particular, the key tag is used in a parent zone&#39;s DS record to point at the DNSKEY in this child ManagedZone. The key tag is a number in the range [0, 65535] and the algorithm to calculate it is specified in RFC4034 Appendix B.
     * 
     */
    public Integer keyTag() {
        return this.keyTag;
    }
    /**
     * @return Base64 encoded public half of this key.
     * 
     */
    public String publicKey() {
        return this.publicKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeysKeySigningKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private String creationTime;
        private String description;
        private List<GetKeysKeySigningKeyDigest> digests;
        private String dsRecord;
        private String id;
        private Boolean isActive;
        private Integer keyLength;
        private Integer keyTag;
        private String publicKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeysKeySigningKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.digests = defaults.digests;
    	      this.dsRecord = defaults.dsRecord;
    	      this.id = defaults.id;
    	      this.isActive = defaults.isActive;
    	      this.keyLength = defaults.keyLength;
    	      this.keyTag = defaults.keyTag;
    	      this.publicKey = defaults.publicKey;
        }

        public Builder algorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder digests(List<GetKeysKeySigningKeyDigest> digests) {
            this.digests = Objects.requireNonNull(digests);
            return this;
        }
        public Builder digests(GetKeysKeySigningKeyDigest... digests) {
            return digests(List.of(digests));
        }
        public Builder dsRecord(String dsRecord) {
            this.dsRecord = Objects.requireNonNull(dsRecord);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isActive(Boolean isActive) {
            this.isActive = Objects.requireNonNull(isActive);
            return this;
        }
        public Builder keyLength(Integer keyLength) {
            this.keyLength = Objects.requireNonNull(keyLength);
            return this;
        }
        public Builder keyTag(Integer keyTag) {
            this.keyTag = Objects.requireNonNull(keyTag);
            return this;
        }
        public Builder publicKey(String publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }        public GetKeysKeySigningKey build() {
            return new GetKeysKeySigningKey(algorithm, creationTime, description, digests, dsRecord, id, isActive, keyLength, keyTag, publicKey);
        }
    }
}