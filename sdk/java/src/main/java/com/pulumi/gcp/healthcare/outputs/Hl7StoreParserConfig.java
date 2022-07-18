// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Hl7StoreParserConfig {
    /**
     * @return Determines whether messages with no header are allowed.
     * 
     */
    private final @Nullable Boolean allowNullHeader;
    /**
     * @return JSON encoded string for schemas used to parse messages in this
     * store if schematized parsing is desired.
     * 
     */
    private final @Nullable String schema;
    /**
     * @return Byte(s) to be used as the segment terminator. If this is unset, &#39;\r&#39; will be used as segment terminator.
     * A base64-encoded string.
     * 
     */
    private final @Nullable String segmentTerminator;
    /**
     * @return The version of the unschematized parser to be used when a custom `schema` is not set.
     * Default value is `V1`.
     * Possible values are `V1`, `V2`, and `V3`.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private Hl7StoreParserConfig(
        @CustomType.Parameter("allowNullHeader") @Nullable Boolean allowNullHeader,
        @CustomType.Parameter("schema") @Nullable String schema,
        @CustomType.Parameter("segmentTerminator") @Nullable String segmentTerminator,
        @CustomType.Parameter("version") @Nullable String version) {
        this.allowNullHeader = allowNullHeader;
        this.schema = schema;
        this.segmentTerminator = segmentTerminator;
        this.version = version;
    }

    /**
     * @return Determines whether messages with no header are allowed.
     * 
     */
    public Optional<Boolean> allowNullHeader() {
        return Optional.ofNullable(this.allowNullHeader);
    }
    /**
     * @return JSON encoded string for schemas used to parse messages in this
     * store if schematized parsing is desired.
     * 
     */
    public Optional<String> schema() {
        return Optional.ofNullable(this.schema);
    }
    /**
     * @return Byte(s) to be used as the segment terminator. If this is unset, &#39;\r&#39; will be used as segment terminator.
     * A base64-encoded string.
     * 
     */
    public Optional<String> segmentTerminator() {
        return Optional.ofNullable(this.segmentTerminator);
    }
    /**
     * @return The version of the unschematized parser to be used when a custom `schema` is not set.
     * Default value is `V1`.
     * Possible values are `V1`, `V2`, and `V3`.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7StoreParserConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowNullHeader;
        private @Nullable String schema;
        private @Nullable String segmentTerminator;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7StoreParserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowNullHeader = defaults.allowNullHeader;
    	      this.schema = defaults.schema;
    	      this.segmentTerminator = defaults.segmentTerminator;
    	      this.version = defaults.version;
        }

        public Builder allowNullHeader(@Nullable Boolean allowNullHeader) {
            this.allowNullHeader = allowNullHeader;
            return this;
        }
        public Builder schema(@Nullable String schema) {
            this.schema = schema;
            return this;
        }
        public Builder segmentTerminator(@Nullable String segmentTerminator) {
            this.segmentTerminator = segmentTerminator;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public Hl7StoreParserConfig build() {
            return new Hl7StoreParserConfig(allowNullHeader, schema, segmentTerminator, version);
        }
    }
}