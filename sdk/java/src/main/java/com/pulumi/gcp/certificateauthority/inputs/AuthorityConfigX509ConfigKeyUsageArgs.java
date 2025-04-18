// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs;
import com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs;
import com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthorityConfigX509ConfigKeyUsageArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthorityConfigX509ConfigKeyUsageArgs Empty = new AuthorityConfigX509ConfigKeyUsageArgs();

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @Import(name="baseKeyUsage", required=true)
    private Output<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs> baseKeyUsage;

    /**
     * @return Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    public Output<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs> baseKeyUsage() {
        return this.baseKeyUsage;
    }

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @Import(name="extendedKeyUsage", required=true)
    private Output<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs> extendedKeyUsage;

    /**
     * @return Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    public Output<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs> extendedKeyUsage() {
        return this.extendedKeyUsage;
    }

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * 
     */
    @Import(name="unknownExtendedKeyUsages")
    private @Nullable Output<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages;

    /**
     * @return An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>>> unknownExtendedKeyUsages() {
        return Optional.ofNullable(this.unknownExtendedKeyUsages);
    }

    private AuthorityConfigX509ConfigKeyUsageArgs() {}

    private AuthorityConfigX509ConfigKeyUsageArgs(AuthorityConfigX509ConfigKeyUsageArgs $) {
        this.baseKeyUsage = $.baseKeyUsage;
        this.extendedKeyUsage = $.extendedKeyUsage;
        this.unknownExtendedKeyUsages = $.unknownExtendedKeyUsages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthorityConfigX509ConfigKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorityConfigX509ConfigKeyUsageArgs $;

        public Builder() {
            $ = new AuthorityConfigX509ConfigKeyUsageArgs();
        }

        public Builder(AuthorityConfigX509ConfigKeyUsageArgs defaults) {
            $ = new AuthorityConfigX509ConfigKeyUsageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseKeyUsage Describes high-level ways in which a key may be used.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder baseKeyUsage(Output<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs> baseKeyUsage) {
            $.baseKeyUsage = baseKeyUsage;
            return this;
        }

        /**
         * @param baseKeyUsage Describes high-level ways in which a key may be used.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder baseKeyUsage(AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs baseKeyUsage) {
            return baseKeyUsage(Output.of(baseKeyUsage));
        }

        /**
         * @param extendedKeyUsage Describes high-level ways in which a key may be used.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder extendedKeyUsage(Output<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs> extendedKeyUsage) {
            $.extendedKeyUsage = extendedKeyUsage;
            return this;
        }

        /**
         * @param extendedKeyUsage Describes high-level ways in which a key may be used.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder extendedKeyUsage(AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs extendedKeyUsage) {
            return extendedKeyUsage(Output.of(extendedKeyUsage));
        }

        /**
         * @param unknownExtendedKeyUsages An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder unknownExtendedKeyUsages(@Nullable Output<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages) {
            $.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }

        /**
         * @param unknownExtendedKeyUsages An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder unknownExtendedKeyUsages(List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs> unknownExtendedKeyUsages) {
            return unknownExtendedKeyUsages(Output.of(unknownExtendedKeyUsages));
        }

        /**
         * @param unknownExtendedKeyUsages An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder unknownExtendedKeyUsages(AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs... unknownExtendedKeyUsages) {
            return unknownExtendedKeyUsages(List.of(unknownExtendedKeyUsages));
        }

        public AuthorityConfigX509ConfigKeyUsageArgs build() {
            if ($.baseKeyUsage == null) {
                throw new MissingRequiredPropertyException("AuthorityConfigX509ConfigKeyUsageArgs", "baseKeyUsage");
            }
            if ($.extendedKeyUsage == null) {
                throw new MissingRequiredPropertyException("AuthorityConfigX509ConfigKeyUsageArgs", "extendedKeyUsage");
            }
            return $;
        }
    }

}
