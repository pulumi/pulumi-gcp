// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationSettingsArgs Empty = new OrganizationSettingsArgs();

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
     * The organization for which to retrieve or configure settings.
     * 
     * ***
     * 
     */
    @Import(name="organization", required=true)
    private Output<String> organization;

    /**
     * @return The organization for which to retrieve or configure settings.
     * 
     * ***
     * 
     */
    public Output<String> organization() {
        return this.organization;
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

    private OrganizationSettingsArgs() {}

    private OrganizationSettingsArgs(OrganizationSettingsArgs $) {
        this.disableDefaultSink = $.disableDefaultSink;
        this.kmsKeyName = $.kmsKeyName;
        this.organization = $.organization;
        this.storageLocation = $.storageLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationSettingsArgs $;

        public Builder() {
            $ = new OrganizationSettingsArgs();
        }

        public Builder(OrganizationSettingsArgs defaults) {
            $ = new OrganizationSettingsArgs(Objects.requireNonNull(defaults));
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
         * @param organization The organization for which to retrieve or configure settings.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder organization(Output<String> organization) {
            $.organization = organization;
            return this;
        }

        /**
         * @param organization The organization for which to retrieve or configure settings.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder organization(String organization) {
            return organization(Output.of(organization));
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

        public OrganizationSettingsArgs build() {
            if ($.organization == null) {
                throw new MissingRequiredPropertyException("OrganizationSettingsArgs", "organization");
            }
            return $;
        }
    }

}