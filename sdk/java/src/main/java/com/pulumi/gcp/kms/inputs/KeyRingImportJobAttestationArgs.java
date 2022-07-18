// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyRingImportJobAttestationArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyRingImportJobAttestationArgs Empty = new KeyRingImportJobAttestationArgs();

    @Import(name="content")
    private @Nullable Output<String> content;

    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    @Import(name="format")
    private @Nullable Output<String> format;

    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    private KeyRingImportJobAttestationArgs() {}

    private KeyRingImportJobAttestationArgs(KeyRingImportJobAttestationArgs $) {
        this.content = $.content;
        this.format = $.format;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyRingImportJobAttestationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyRingImportJobAttestationArgs $;

        public Builder() {
            $ = new KeyRingImportJobAttestationArgs();
        }

        public Builder(KeyRingImportJobAttestationArgs defaults) {
            $ = new KeyRingImportJobAttestationArgs(Objects.requireNonNull(defaults));
        }

        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        public Builder content(String content) {
            return content(Output.of(content));
        }

        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        public Builder format(String format) {
            return format(Output.of(format));
        }

        public KeyRingImportJobAttestationArgs build() {
            return $;
        }
    }

}