// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTopicSchemaSetting {
    /**
     * @return The encoding of messages validated against schema. Default value: &#34;ENCODING_UNSPECIFIED&#34; Possible values: [&#34;ENCODING_UNSPECIFIED&#34;, &#34;JSON&#34;, &#34;BINARY&#34;]
     * 
     */
    private String encoding;
    /**
     * @return The name of the schema that messages published should be
     * validated against. Format is projects/{project}/schemas/{schema}.
     * The value of this field will be _deleted-schema_
     * if the schema has been deleted.
     * 
     */
    private String schema;

    private GetTopicSchemaSetting() {}
    /**
     * @return The encoding of messages validated against schema. Default value: &#34;ENCODING_UNSPECIFIED&#34; Possible values: [&#34;ENCODING_UNSPECIFIED&#34;, &#34;JSON&#34;, &#34;BINARY&#34;]
     * 
     */
    public String encoding() {
        return this.encoding;
    }
    /**
     * @return The name of the schema that messages published should be
     * validated against. Format is projects/{project}/schemas/{schema}.
     * The value of this field will be _deleted-schema_
     * if the schema has been deleted.
     * 
     */
    public String schema() {
        return this.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicSchemaSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String encoding;
        private String schema;
        public Builder() {}
        public Builder(GetTopicSchemaSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.schema = defaults.schema;
        }

        @CustomType.Setter
        public Builder encoding(String encoding) {
            if (encoding == null) {
              throw new MissingRequiredPropertyException("GetTopicSchemaSetting", "encoding");
            }
            this.encoding = encoding;
            return this;
        }
        @CustomType.Setter
        public Builder schema(String schema) {
            if (schema == null) {
              throw new MissingRequiredPropertyException("GetTopicSchemaSetting", "schema");
            }
            this.schema = schema;
            return this;
        }
        public GetTopicSchemaSetting build() {
            final var _resultValue = new GetTopicSchemaSetting();
            _resultValue.encoding = encoding;
            _resultValue.schema = schema;
            return _resultValue;
        }
    }
}
