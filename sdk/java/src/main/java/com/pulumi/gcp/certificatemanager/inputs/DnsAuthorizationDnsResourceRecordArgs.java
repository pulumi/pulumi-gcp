// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificatemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DnsAuthorizationDnsResourceRecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final DnsAuthorizationDnsResourceRecordArgs Empty = new DnsAuthorizationDnsResourceRecordArgs();

    @Import(name="data")
    private @Nullable Output<String> data;

    public Optional<Output<String>> data() {
        return Optional.ofNullable(this.data);
    }

    /**
     * Name of the resource; provided by the client when the resource is created.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private DnsAuthorizationDnsResourceRecordArgs() {}

    private DnsAuthorizationDnsResourceRecordArgs(DnsAuthorizationDnsResourceRecordArgs $) {
        this.data = $.data;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DnsAuthorizationDnsResourceRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DnsAuthorizationDnsResourceRecordArgs $;

        public Builder() {
            $ = new DnsAuthorizationDnsResourceRecordArgs();
        }

        public Builder(DnsAuthorizationDnsResourceRecordArgs defaults) {
            $ = new DnsAuthorizationDnsResourceRecordArgs(Objects.requireNonNull(defaults));
        }

        public Builder data(@Nullable Output<String> data) {
            $.data = data;
            return this;
        }

        public Builder data(String data) {
            return data(Output.of(data));
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is created.
         * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
         * and all following characters must be a dash, underscore, letter or digit.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is created.
         * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
         * and all following characters must be a dash, underscore, letter or digit.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DnsAuthorizationDnsResourceRecordArgs build() {
            return $;
        }
    }

}