// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FolderSettingsState extends com.pulumi.resources.ResourceArgs {

    public static final FolderSettingsState Empty = new FolderSettingsState();

    /**
     * If set to true, the _Default sink in newly created projects and folders will created in a disabled state. This can be used to automatically disable log storage if there is already an aggregated sink configured in the hierarchy. The _Default sink can be re-enabled manually if needed.
     * 
     */
    @Import(name="disableDefaultSink")
    private @Nullable Output<Boolean> disableDefaultSink;

    /**
     * @return If set to true, the _Default sink in newly created projects and folders will created in a disabled state. This can be used to automatically disable log storage if there is already an aggregated sink configured in the hierarchy. The _Default sink can be re-enabled manually if needed.
     * 
     */
    public Optional<Output<Boolean>> disableDefaultSink() {
        return Optional.ofNullable(this.disableDefaultSink);
    }

    /**
     * The folder for which to retrieve settings.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The folder for which to retrieve settings.
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * The resource name for the configured Cloud KMS key.
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    /**
     * @return The resource name for the configured Cloud KMS key.
     * 
     */
    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    /**
     * The service account that will be used by the Log Router to access your Cloud KMS key.
     * 
     */
    @Import(name="kmsServiceAccountId")
    private @Nullable Output<String> kmsServiceAccountId;

    /**
     * @return The service account that will be used by the Log Router to access your Cloud KMS key.
     * 
     */
    public Optional<Output<String>> kmsServiceAccountId() {
        return Optional.ofNullable(this.kmsServiceAccountId);
    }

    /**
     * The service account for the given container. Sinks use this service account as their writerIdentity if no custom service account is provided.
     * 
     */
    @Import(name="loggingServiceAccountId")
    private @Nullable Output<String> loggingServiceAccountId;

    /**
     * @return The service account for the given container. Sinks use this service account as their writerIdentity if no custom service account is provided.
     * 
     */
    public Optional<Output<String>> loggingServiceAccountId() {
        return Optional.ofNullable(this.loggingServiceAccountId);
    }

    /**
     * The resource name of the settings.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the settings.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The storage location that Cloud Logging will use to create new resources when a location is needed but not explicitly provided.
     * 
     */
    @Import(name="storageLocation")
    private @Nullable Output<String> storageLocation;

    /**
     * @return The storage location that Cloud Logging will use to create new resources when a location is needed but not explicitly provided.
     * 
     */
    public Optional<Output<String>> storageLocation() {
        return Optional.ofNullable(this.storageLocation);
    }

    private FolderSettingsState() {}

    private FolderSettingsState(FolderSettingsState $) {
        this.disableDefaultSink = $.disableDefaultSink;
        this.folder = $.folder;
        this.kmsKeyName = $.kmsKeyName;
        this.kmsServiceAccountId = $.kmsServiceAccountId;
        this.loggingServiceAccountId = $.loggingServiceAccountId;
        this.name = $.name;
        this.storageLocation = $.storageLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FolderSettingsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FolderSettingsState $;

        public Builder() {
            $ = new FolderSettingsState();
        }

        public Builder(FolderSettingsState defaults) {
            $ = new FolderSettingsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param disableDefaultSink If set to true, the _Default sink in newly created projects and folders will created in a disabled state. This can be used to automatically disable log storage if there is already an aggregated sink configured in the hierarchy. The _Default sink can be re-enabled manually if needed.
         * 
         * @return builder
         * 
         */
        public Builder disableDefaultSink(@Nullable Output<Boolean> disableDefaultSink) {
            $.disableDefaultSink = disableDefaultSink;
            return this;
        }

        /**
         * @param disableDefaultSink If set to true, the _Default sink in newly created projects and folders will created in a disabled state. This can be used to automatically disable log storage if there is already an aggregated sink configured in the hierarchy. The _Default sink can be re-enabled manually if needed.
         * 
         * @return builder
         * 
         */
        public Builder disableDefaultSink(Boolean disableDefaultSink) {
            return disableDefaultSink(Output.of(disableDefaultSink));
        }

        /**
         * @param folder The folder for which to retrieve settings.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The folder for which to retrieve settings.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param kmsKeyName The resource name for the configured Cloud KMS key.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName The resource name for the configured Cloud KMS key.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        /**
         * @param kmsServiceAccountId The service account that will be used by the Log Router to access your Cloud KMS key.
         * 
         * @return builder
         * 
         */
        public Builder kmsServiceAccountId(@Nullable Output<String> kmsServiceAccountId) {
            $.kmsServiceAccountId = kmsServiceAccountId;
            return this;
        }

        /**
         * @param kmsServiceAccountId The service account that will be used by the Log Router to access your Cloud KMS key.
         * 
         * @return builder
         * 
         */
        public Builder kmsServiceAccountId(String kmsServiceAccountId) {
            return kmsServiceAccountId(Output.of(kmsServiceAccountId));
        }

        /**
         * @param loggingServiceAccountId The service account for the given container. Sinks use this service account as their writerIdentity if no custom service account is provided.
         * 
         * @return builder
         * 
         */
        public Builder loggingServiceAccountId(@Nullable Output<String> loggingServiceAccountId) {
            $.loggingServiceAccountId = loggingServiceAccountId;
            return this;
        }

        /**
         * @param loggingServiceAccountId The service account for the given container. Sinks use this service account as their writerIdentity if no custom service account is provided.
         * 
         * @return builder
         * 
         */
        public Builder loggingServiceAccountId(String loggingServiceAccountId) {
            return loggingServiceAccountId(Output.of(loggingServiceAccountId));
        }

        /**
         * @param name The resource name of the settings.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the settings.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param storageLocation The storage location that Cloud Logging will use to create new resources when a location is needed but not explicitly provided.
         * 
         * @return builder
         * 
         */
        public Builder storageLocation(@Nullable Output<String> storageLocation) {
            $.storageLocation = storageLocation;
            return this;
        }

        /**
         * @param storageLocation The storage location that Cloud Logging will use to create new resources when a location is needed but not explicitly provided.
         * 
         * @return builder
         * 
         */
        public Builder storageLocation(String storageLocation) {
            return storageLocation(Output.of(storageLocation));
        }

        public FolderSettingsState build() {
            return $;
        }
    }

}
