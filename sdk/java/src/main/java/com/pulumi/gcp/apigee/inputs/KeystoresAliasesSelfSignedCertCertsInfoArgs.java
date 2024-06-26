// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertCertsInfoCertInfoArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeystoresAliasesSelfSignedCertCertsInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeystoresAliasesSelfSignedCertCertsInfoArgs Empty = new KeystoresAliasesSelfSignedCertCertsInfoArgs();

    /**
     * (Output)
     * List of all properties in the object.
     * Structure is documented below.
     * 
     */
    @Import(name="certInfos")
    private @Nullable Output<List<KeystoresAliasesSelfSignedCertCertsInfoCertInfoArgs>> certInfos;

    /**
     * @return (Output)
     * List of all properties in the object.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<KeystoresAliasesSelfSignedCertCertsInfoCertInfoArgs>>> certInfos() {
        return Optional.ofNullable(this.certInfos);
    }

    private KeystoresAliasesSelfSignedCertCertsInfoArgs() {}

    private KeystoresAliasesSelfSignedCertCertsInfoArgs(KeystoresAliasesSelfSignedCertCertsInfoArgs $) {
        this.certInfos = $.certInfos;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeystoresAliasesSelfSignedCertCertsInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeystoresAliasesSelfSignedCertCertsInfoArgs $;

        public Builder() {
            $ = new KeystoresAliasesSelfSignedCertCertsInfoArgs();
        }

        public Builder(KeystoresAliasesSelfSignedCertCertsInfoArgs defaults) {
            $ = new KeystoresAliasesSelfSignedCertCertsInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certInfos (Output)
         * List of all properties in the object.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder certInfos(@Nullable Output<List<KeystoresAliasesSelfSignedCertCertsInfoCertInfoArgs>> certInfos) {
            $.certInfos = certInfos;
            return this;
        }

        /**
         * @param certInfos (Output)
         * List of all properties in the object.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder certInfos(List<KeystoresAliasesSelfSignedCertCertsInfoCertInfoArgs> certInfos) {
            return certInfos(Output.of(certInfos));
        }

        /**
         * @param certInfos (Output)
         * List of all properties in the object.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder certInfos(KeystoresAliasesSelfSignedCertCertsInfoCertInfoArgs... certInfos) {
            return certInfos(List.of(certInfos));
        }

        public KeystoresAliasesSelfSignedCertCertsInfoArgs build() {
            return $;
        }
    }

}
