// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.secretmanager.inputs.RegionalSecretVersionCustomerManagedEncryptionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionalSecretVersionState extends com.pulumi.resources.ResourceArgs {

    public static final RegionalSecretVersionState Empty = new RegionalSecretVersionState();

    /**
     * The time at which the regional secret version was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time at which the regional secret version was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The customer-managed encryption configuration of the regional secret.
     * Structure is documented below.
     * 
     */
    @Import(name="customerManagedEncryptions")
    private @Nullable Output<List<RegionalSecretVersionCustomerManagedEncryptionArgs>> customerManagedEncryptions;

    /**
     * @return The customer-managed encryption configuration of the regional secret.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionalSecretVersionCustomerManagedEncryptionArgs>>> customerManagedEncryptions() {
        return Optional.ofNullable(this.customerManagedEncryptions);
    }

    /**
     * The deletion policy for the regional secret version. Setting `ABANDON` allows the resource
     * to be abandoned rather than deleted. Setting `DISABLE` allows the resource to be
     * disabled rather than deleted. Default is `DELETE`. Possible values are:
     * * DELETE
     * * DISABLE
     * * ABANDON
     * 
     */
    @Import(name="deletionPolicy")
    private @Nullable Output<String> deletionPolicy;

    /**
     * @return The deletion policy for the regional secret version. Setting `ABANDON` allows the resource
     * to be abandoned rather than deleted. Setting `DISABLE` allows the resource to be
     * disabled rather than deleted. Default is `DELETE`. Possible values are:
     * * DELETE
     * * DISABLE
     * * ABANDON
     * 
     */
    public Optional<Output<String>> deletionPolicy() {
        return Optional.ofNullable(this.deletionPolicy);
    }

    /**
     * The time at which the regional secret version was destroyed. Only present if state is DESTROYED.
     * 
     */
    @Import(name="destroyTime")
    private @Nullable Output<String> destroyTime;

    /**
     * @return The time at which the regional secret version was destroyed. Only present if state is DESTROYED.
     * 
     */
    public Optional<Output<String>> destroyTime() {
        return Optional.ofNullable(this.destroyTime);
    }

    /**
     * The current state of the regional secret version.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return The current state of the regional secret version.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * If set to &#39;true&#39;, the secret data is expected to be base64-encoded string and would be sent as is.
     * 
     */
    @Import(name="isSecretDataBase64")
    private @Nullable Output<Boolean> isSecretDataBase64;

    /**
     * @return If set to &#39;true&#39;, the secret data is expected to be base64-encoded string and would be sent as is.
     * 
     */
    public Optional<Output<Boolean>> isSecretDataBase64() {
        return Optional.ofNullable(this.isSecretDataBase64);
    }

    /**
     * Location of Secret Manager regional secret resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Location of Secret Manager regional secret resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name of the regional secret version. Format:
     * `projects/{{project}}/locations/{{location}}/secrets/{{secret_id}}/versions/{{version}}`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the regional secret version. Format:
     * `projects/{{project}}/locations/{{location}}/secrets/{{secret_id}}/versions/{{version}}`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Secret Manager regional secret resource.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<String> secret;

    /**
     * @return Secret Manager regional secret resource.
     * 
     */
    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
    }

    /**
     * The secret data. Must be no larger than 64KiB.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="secretData")
    private @Nullable Output<String> secretData;

    /**
     * @return The secret data. Must be no larger than 64KiB.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<Output<String>> secretData() {
        return Optional.ofNullable(this.secretData);
    }

    /**
     * The version of the Regional Secret.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version of the Regional Secret.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private RegionalSecretVersionState() {}

    private RegionalSecretVersionState(RegionalSecretVersionState $) {
        this.createTime = $.createTime;
        this.customerManagedEncryptions = $.customerManagedEncryptions;
        this.deletionPolicy = $.deletionPolicy;
        this.destroyTime = $.destroyTime;
        this.enabled = $.enabled;
        this.isSecretDataBase64 = $.isSecretDataBase64;
        this.location = $.location;
        this.name = $.name;
        this.secret = $.secret;
        this.secretData = $.secretData;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionalSecretVersionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionalSecretVersionState $;

        public Builder() {
            $ = new RegionalSecretVersionState();
        }

        public Builder(RegionalSecretVersionState defaults) {
            $ = new RegionalSecretVersionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The time at which the regional secret version was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time at which the regional secret version was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param customerManagedEncryptions The customer-managed encryption configuration of the regional secret.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder customerManagedEncryptions(@Nullable Output<List<RegionalSecretVersionCustomerManagedEncryptionArgs>> customerManagedEncryptions) {
            $.customerManagedEncryptions = customerManagedEncryptions;
            return this;
        }

        /**
         * @param customerManagedEncryptions The customer-managed encryption configuration of the regional secret.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder customerManagedEncryptions(List<RegionalSecretVersionCustomerManagedEncryptionArgs> customerManagedEncryptions) {
            return customerManagedEncryptions(Output.of(customerManagedEncryptions));
        }

        /**
         * @param customerManagedEncryptions The customer-managed encryption configuration of the regional secret.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder customerManagedEncryptions(RegionalSecretVersionCustomerManagedEncryptionArgs... customerManagedEncryptions) {
            return customerManagedEncryptions(List.of(customerManagedEncryptions));
        }

        /**
         * @param deletionPolicy The deletion policy for the regional secret version. Setting `ABANDON` allows the resource
         * to be abandoned rather than deleted. Setting `DISABLE` allows the resource to be
         * disabled rather than deleted. Default is `DELETE`. Possible values are:
         * * DELETE
         * * DISABLE
         * * ABANDON
         * 
         * @return builder
         * 
         */
        public Builder deletionPolicy(@Nullable Output<String> deletionPolicy) {
            $.deletionPolicy = deletionPolicy;
            return this;
        }

        /**
         * @param deletionPolicy The deletion policy for the regional secret version. Setting `ABANDON` allows the resource
         * to be abandoned rather than deleted. Setting `DISABLE` allows the resource to be
         * disabled rather than deleted. Default is `DELETE`. Possible values are:
         * * DELETE
         * * DISABLE
         * * ABANDON
         * 
         * @return builder
         * 
         */
        public Builder deletionPolicy(String deletionPolicy) {
            return deletionPolicy(Output.of(deletionPolicy));
        }

        /**
         * @param destroyTime The time at which the regional secret version was destroyed. Only present if state is DESTROYED.
         * 
         * @return builder
         * 
         */
        public Builder destroyTime(@Nullable Output<String> destroyTime) {
            $.destroyTime = destroyTime;
            return this;
        }

        /**
         * @param destroyTime The time at which the regional secret version was destroyed. Only present if state is DESTROYED.
         * 
         * @return builder
         * 
         */
        public Builder destroyTime(String destroyTime) {
            return destroyTime(Output.of(destroyTime));
        }

        /**
         * @param enabled The current state of the regional secret version.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled The current state of the regional secret version.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param isSecretDataBase64 If set to &#39;true&#39;, the secret data is expected to be base64-encoded string and would be sent as is.
         * 
         * @return builder
         * 
         */
        public Builder isSecretDataBase64(@Nullable Output<Boolean> isSecretDataBase64) {
            $.isSecretDataBase64 = isSecretDataBase64;
            return this;
        }

        /**
         * @param isSecretDataBase64 If set to &#39;true&#39;, the secret data is expected to be base64-encoded string and would be sent as is.
         * 
         * @return builder
         * 
         */
        public Builder isSecretDataBase64(Boolean isSecretDataBase64) {
            return isSecretDataBase64(Output.of(isSecretDataBase64));
        }

        /**
         * @param location Location of Secret Manager regional secret resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location of Secret Manager regional secret resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource name of the regional secret version. Format:
         * `projects/{{project}}/locations/{{location}}/secrets/{{secret_id}}/versions/{{version}}`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the regional secret version. Format:
         * `projects/{{project}}/locations/{{location}}/secrets/{{secret_id}}/versions/{{version}}`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param secret Secret Manager regional secret resource.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret Secret Manager regional secret resource.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param secretData The secret data. Must be no larger than 64KiB.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder secretData(@Nullable Output<String> secretData) {
            $.secretData = secretData;
            return this;
        }

        /**
         * @param secretData The secret data. Must be no larger than 64KiB.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder secretData(String secretData) {
            return secretData(Output.of(secretData));
        }

        /**
         * @param version The version of the Regional Secret.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the Regional Secret.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public RegionalSecretVersionState build() {
            return $;
        }
    }

}
