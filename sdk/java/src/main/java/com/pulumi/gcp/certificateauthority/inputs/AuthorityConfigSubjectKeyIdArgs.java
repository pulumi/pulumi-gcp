// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthorityConfigSubjectKeyIdArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthorityConfigSubjectKeyIdArgs Empty = new AuthorityConfigSubjectKeyIdArgs();

    /**
     * The value of the KeyId in lowercase hexadecimal.
     * 
     * &lt;a name=&#34;nested_config_x509_config&#34;&gt;&lt;/a&gt;The `x509_config` block supports:
     * 
     */
    @Import(name="keyId")
    private @Nullable Output<String> keyId;

    /**
     * @return The value of the KeyId in lowercase hexadecimal.
     * 
     * &lt;a name=&#34;nested_config_x509_config&#34;&gt;&lt;/a&gt;The `x509_config` block supports:
     * 
     */
    public Optional<Output<String>> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    private AuthorityConfigSubjectKeyIdArgs() {}

    private AuthorityConfigSubjectKeyIdArgs(AuthorityConfigSubjectKeyIdArgs $) {
        this.keyId = $.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthorityConfigSubjectKeyIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorityConfigSubjectKeyIdArgs $;

        public Builder() {
            $ = new AuthorityConfigSubjectKeyIdArgs();
        }

        public Builder(AuthorityConfigSubjectKeyIdArgs defaults) {
            $ = new AuthorityConfigSubjectKeyIdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyId The value of the KeyId in lowercase hexadecimal.
         * 
         * &lt;a name=&#34;nested_config_x509_config&#34;&gt;&lt;/a&gt;The `x509_config` block supports:
         * 
         * @return builder
         * 
         */
        public Builder keyId(@Nullable Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId The value of the KeyId in lowercase hexadecimal.
         * 
         * &lt;a name=&#34;nested_config_x509_config&#34;&gt;&lt;/a&gt;The `x509_config` block supports:
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        public AuthorityConfigSubjectKeyIdArgs build() {
            return $;
        }
    }

}
