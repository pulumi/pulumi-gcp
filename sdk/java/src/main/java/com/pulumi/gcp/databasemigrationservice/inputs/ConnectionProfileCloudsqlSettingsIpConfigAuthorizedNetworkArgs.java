// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.databasemigrationservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetworkArgs Empty = new ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetworkArgs();

    /**
     * The time when this access control entry expires in RFC 3339 format.
     * 
     */
    @Import(name="expireTime")
    private @Nullable Output<String> expireTime;

    /**
     * @return The time when this access control entry expires in RFC 3339 format.
     * 
     */
    public Optional<Output<String>> expireTime() {
        return Optional.ofNullable(this.expireTime);
    }

    /**
     * A label to identify this entry.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return A label to identify this entry.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * Input only. The time-to-leave of this access control entry.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<String> ttl;

    /**
     * @return Input only. The time-to-leave of this access control entry.
     * 
     */
    public Optional<Output<String>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    /**
     * The allowlisted value for the access control list.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The allowlisted value for the access control list.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetworkArgs() {}

    private ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetworkArgs(ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetworkArgs $) {
        this.expireTime = $.expireTime;
        this.label = $.label;
        this.ttl = $.ttl;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetworkArgs $;

        public Builder() {
            $ = new ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetworkArgs();
        }

        public Builder(ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetworkArgs defaults) {
            $ = new ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expireTime The time when this access control entry expires in RFC 3339 format.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(@Nullable Output<String> expireTime) {
            $.expireTime = expireTime;
            return this;
        }

        /**
         * @param expireTime The time when this access control entry expires in RFC 3339 format.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(String expireTime) {
            return expireTime(Output.of(expireTime));
        }

        /**
         * @param label A label to identify this entry.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label A label to identify this entry.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param ttl Input only. The time-to-leave of this access control entry.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<String> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl Input only. The time-to-leave of this access control entry.
         * 
         * @return builder
         * 
         */
        public Builder ttl(String ttl) {
            return ttl(Output.of(ttl));
        }

        /**
         * @param value The allowlisted value for the access control list.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The allowlisted value for the access control list.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetworkArgs build() {
            if ($.value == null) {
                throw new MissingRequiredPropertyException("ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetworkArgs", "value");
            }
            return $;
        }
    }

}
