// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.applicationintegration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.applicationintegration.inputs.AuthConfigClientCertificateArgs;
import com.pulumi.gcp.applicationintegration.inputs.AuthConfigDecryptedCredentialArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthConfigState extends com.pulumi.resources.ResourceArgs {

    public static final AuthConfigState Empty = new AuthConfigState();

    /**
     * Certificate id for client certificate.
     * 
     */
    @Import(name="certificateId")
    private @Nullable Output<String> certificateId;

    /**
     * @return Certificate id for client certificate.
     * 
     */
    public Optional<Output<String>> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }

    /**
     * Raw client certificate
     * Structure is documented below.
     * 
     */
    @Import(name="clientCertificate")
    private @Nullable Output<AuthConfigClientCertificateArgs> clientCertificate;

    /**
     * @return Raw client certificate
     * Structure is documented below.
     * 
     */
    public Optional<Output<AuthConfigClientCertificateArgs>> clientCertificate() {
        return Optional.ofNullable(this.clientCertificate);
    }

    /**
     * The timestamp when the auth config is created.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The timestamp when the auth config is created.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The creator&#39;s email address. Generated based on the End User Credentials/LOAS role of the user making the call.
     * 
     */
    @Import(name="creatorEmail")
    private @Nullable Output<String> creatorEmail;

    /**
     * @return The creator&#39;s email address. Generated based on the End User Credentials/LOAS role of the user making the call.
     * 
     */
    public Optional<Output<String>> creatorEmail() {
        return Optional.ofNullable(this.creatorEmail);
    }

    /**
     * Credential type of the encrypted credential.
     * 
     */
    @Import(name="credentialType")
    private @Nullable Output<String> credentialType;

    /**
     * @return Credential type of the encrypted credential.
     * 
     */
    public Optional<Output<String>> credentialType() {
        return Optional.ofNullable(this.credentialType);
    }

    /**
     * Raw auth credentials.
     * Structure is documented below.
     * 
     */
    @Import(name="decryptedCredential")
    private @Nullable Output<AuthConfigDecryptedCredentialArgs> decryptedCredential;

    /**
     * @return Raw auth credentials.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AuthConfigDecryptedCredentialArgs>> decryptedCredential() {
        return Optional.ofNullable(this.decryptedCredential);
    }

    /**
     * A description of the auth config.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the auth config.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the auth config.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The name of the auth config.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Auth credential encrypted by Cloud KMS. Can be decrypted as Credential with proper KMS key.
     * A base64-encoded string.
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Output<String> encryptedCredential;

    /**
     * @return Auth credential encrypted by Cloud KMS. Can be decrypted as Credential with proper KMS key.
     * A base64-encoded string.
     * 
     */
    public Optional<Output<String>> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * User can define the time to receive notification after which the auth config becomes invalid. Support up to 30 days. Support granularity in hours.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="expiryNotificationDurations")
    private @Nullable Output<List<String>> expiryNotificationDurations;

    /**
     * @return User can define the time to receive notification after which the auth config becomes invalid. Support up to 30 days. Support granularity in hours.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<Output<List<String>>> expiryNotificationDurations() {
        return Optional.ofNullable(this.expiryNotificationDurations);
    }

    /**
     * The last modifier&#39;s email address. Generated based on the End User Credentials/LOAS role of the user making the call.
     * 
     */
    @Import(name="lastModifierEmail")
    private @Nullable Output<String> lastModifierEmail;

    /**
     * @return The last modifier&#39;s email address. Generated based on the End User Credentials/LOAS role of the user making the call.
     * 
     */
    public Optional<Output<String>> lastModifierEmail() {
        return Optional.ofNullable(this.lastModifierEmail);
    }

    /**
     * Location in which client needs to be provisioned.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Location in which client needs to be provisioned.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Resource name of the auth config.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name of the auth config.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * User provided expiry time to override. For the example of Salesforce, username/password credentials can be valid for 6 months depending on the instance settings.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="overrideValidTime")
    private @Nullable Output<String> overrideValidTime;

    /**
     * @return User provided expiry time to override. For the example of Salesforce, username/password credentials can be valid for 6 months depending on the instance settings.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> overrideValidTime() {
        return Optional.ofNullable(this.overrideValidTime);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The reason / details of the current status.
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return The reason / details of the current status.
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    /**
     * The status of the auth config.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The status of the auth config.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The timestamp when the auth config is modified.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The timestamp when the auth config is modified.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    /**
     * The time until the auth config is valid. Empty or max value is considered the auth config won&#39;t expire.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="validTime")
    private @Nullable Output<String> validTime;

    /**
     * @return The time until the auth config is valid. Empty or max value is considered the auth config won&#39;t expire.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> validTime() {
        return Optional.ofNullable(this.validTime);
    }

    /**
     * The visibility of the auth config.
     * Possible values are: `PRIVATE`, `CLIENT_VISIBLE`.
     * 
     */
    @Import(name="visibility")
    private @Nullable Output<String> visibility;

    /**
     * @return The visibility of the auth config.
     * Possible values are: `PRIVATE`, `CLIENT_VISIBLE`.
     * 
     */
    public Optional<Output<String>> visibility() {
        return Optional.ofNullable(this.visibility);
    }

    private AuthConfigState() {}

    private AuthConfigState(AuthConfigState $) {
        this.certificateId = $.certificateId;
        this.clientCertificate = $.clientCertificate;
        this.createTime = $.createTime;
        this.creatorEmail = $.creatorEmail;
        this.credentialType = $.credentialType;
        this.decryptedCredential = $.decryptedCredential;
        this.description = $.description;
        this.displayName = $.displayName;
        this.encryptedCredential = $.encryptedCredential;
        this.expiryNotificationDurations = $.expiryNotificationDurations;
        this.lastModifierEmail = $.lastModifierEmail;
        this.location = $.location;
        this.name = $.name;
        this.overrideValidTime = $.overrideValidTime;
        this.project = $.project;
        this.reason = $.reason;
        this.state = $.state;
        this.updateTime = $.updateTime;
        this.validTime = $.validTime;
        this.visibility = $.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthConfigState $;

        public Builder() {
            $ = new AuthConfigState();
        }

        public Builder(AuthConfigState defaults) {
            $ = new AuthConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateId Certificate id for client certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(@Nullable Output<String> certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        /**
         * @param certificateId Certificate id for client certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(String certificateId) {
            return certificateId(Output.of(certificateId));
        }

        /**
         * @param clientCertificate Raw client certificate
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificate(@Nullable Output<AuthConfigClientCertificateArgs> clientCertificate) {
            $.clientCertificate = clientCertificate;
            return this;
        }

        /**
         * @param clientCertificate Raw client certificate
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificate(AuthConfigClientCertificateArgs clientCertificate) {
            return clientCertificate(Output.of(clientCertificate));
        }

        /**
         * @param createTime The timestamp when the auth config is created.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The timestamp when the auth config is created.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param creatorEmail The creator&#39;s email address. Generated based on the End User Credentials/LOAS role of the user making the call.
         * 
         * @return builder
         * 
         */
        public Builder creatorEmail(@Nullable Output<String> creatorEmail) {
            $.creatorEmail = creatorEmail;
            return this;
        }

        /**
         * @param creatorEmail The creator&#39;s email address. Generated based on the End User Credentials/LOAS role of the user making the call.
         * 
         * @return builder
         * 
         */
        public Builder creatorEmail(String creatorEmail) {
            return creatorEmail(Output.of(creatorEmail));
        }

        /**
         * @param credentialType Credential type of the encrypted credential.
         * 
         * @return builder
         * 
         */
        public Builder credentialType(@Nullable Output<String> credentialType) {
            $.credentialType = credentialType;
            return this;
        }

        /**
         * @param credentialType Credential type of the encrypted credential.
         * 
         * @return builder
         * 
         */
        public Builder credentialType(String credentialType) {
            return credentialType(Output.of(credentialType));
        }

        /**
         * @param decryptedCredential Raw auth credentials.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder decryptedCredential(@Nullable Output<AuthConfigDecryptedCredentialArgs> decryptedCredential) {
            $.decryptedCredential = decryptedCredential;
            return this;
        }

        /**
         * @param decryptedCredential Raw auth credentials.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder decryptedCredential(AuthConfigDecryptedCredentialArgs decryptedCredential) {
            return decryptedCredential(Output.of(decryptedCredential));
        }

        /**
         * @param description A description of the auth config.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the auth config.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The name of the auth config.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the auth config.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param encryptedCredential Auth credential encrypted by Cloud KMS. Can be decrypted as Credential with proper KMS key.
         * A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder encryptedCredential(@Nullable Output<String> encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        /**
         * @param encryptedCredential Auth credential encrypted by Cloud KMS. Can be decrypted as Credential with proper KMS key.
         * A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder encryptedCredential(String encryptedCredential) {
            return encryptedCredential(Output.of(encryptedCredential));
        }

        /**
         * @param expiryNotificationDurations User can define the time to receive notification after which the auth config becomes invalid. Support up to 30 days. Support granularity in hours.
         * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expiryNotificationDurations(@Nullable Output<List<String>> expiryNotificationDurations) {
            $.expiryNotificationDurations = expiryNotificationDurations;
            return this;
        }

        /**
         * @param expiryNotificationDurations User can define the time to receive notification after which the auth config becomes invalid. Support up to 30 days. Support granularity in hours.
         * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expiryNotificationDurations(List<String> expiryNotificationDurations) {
            return expiryNotificationDurations(Output.of(expiryNotificationDurations));
        }

        /**
         * @param expiryNotificationDurations User can define the time to receive notification after which the auth config becomes invalid. Support up to 30 days. Support granularity in hours.
         * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expiryNotificationDurations(String... expiryNotificationDurations) {
            return expiryNotificationDurations(List.of(expiryNotificationDurations));
        }

        /**
         * @param lastModifierEmail The last modifier&#39;s email address. Generated based on the End User Credentials/LOAS role of the user making the call.
         * 
         * @return builder
         * 
         */
        public Builder lastModifierEmail(@Nullable Output<String> lastModifierEmail) {
            $.lastModifierEmail = lastModifierEmail;
            return this;
        }

        /**
         * @param lastModifierEmail The last modifier&#39;s email address. Generated based on the End User Credentials/LOAS role of the user making the call.
         * 
         * @return builder
         * 
         */
        public Builder lastModifierEmail(String lastModifierEmail) {
            return lastModifierEmail(Output.of(lastModifierEmail));
        }

        /**
         * @param location Location in which client needs to be provisioned.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location in which client needs to be provisioned.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Resource name of the auth config.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name of the auth config.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param overrideValidTime User provided expiry time to override. For the example of Salesforce, username/password credentials can be valid for 6 months depending on the instance settings.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder overrideValidTime(@Nullable Output<String> overrideValidTime) {
            $.overrideValidTime = overrideValidTime;
            return this;
        }

        /**
         * @param overrideValidTime User provided expiry time to override. For the example of Salesforce, username/password credentials can be valid for 6 months depending on the instance settings.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder overrideValidTime(String overrideValidTime) {
            return overrideValidTime(Output.of(overrideValidTime));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param reason The reason / details of the current status.
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason The reason / details of the current status.
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        /**
         * @param state The status of the auth config.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The status of the auth config.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param updateTime The timestamp when the auth config is modified.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The timestamp when the auth config is modified.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        /**
         * @param validTime The time until the auth config is valid. Empty or max value is considered the auth config won&#39;t expire.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder validTime(@Nullable Output<String> validTime) {
            $.validTime = validTime;
            return this;
        }

        /**
         * @param validTime The time until the auth config is valid. Empty or max value is considered the auth config won&#39;t expire.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder validTime(String validTime) {
            return validTime(Output.of(validTime));
        }

        /**
         * @param visibility The visibility of the auth config.
         * Possible values are: `PRIVATE`, `CLIENT_VISIBLE`.
         * 
         * @return builder
         * 
         */
        public Builder visibility(@Nullable Output<String> visibility) {
            $.visibility = visibility;
            return this;
        }

        /**
         * @param visibility The visibility of the auth config.
         * Possible values are: `PRIVATE`, `CLIENT_VISIBLE`.
         * 
         * @return builder
         * 
         */
        public Builder visibility(String visibility) {
            return visibility(Output.of(visibility));
        }

        public AuthConfigState build() {
            return $;
        }
    }

}
