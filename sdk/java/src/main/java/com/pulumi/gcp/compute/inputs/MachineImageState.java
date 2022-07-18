// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.MachineImageMachineImageEncryptionKeyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MachineImageState extends com.pulumi.resources.ResourceArgs {

    public static final MachineImageState Empty = new MachineImageState();

    /**
     * A text description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A text description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specify this to create an application consistent machine image by informing the OS to prepare for the snapshot process.
     * Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     * 
     */
    @Import(name="guestFlush")
    private @Nullable Output<Boolean> guestFlush;

    /**
     * @return Specify this to create an application consistent machine image by informing the OS to prepare for the snapshot process.
     * Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     * 
     */
    public Optional<Output<Boolean>> guestFlush() {
        return Optional.ofNullable(this.guestFlush);
    }

    /**
     * Encrypts the machine image using a customer-supplied encryption key.
     * After you encrypt a machine image with a customer-supplied key, you must
     * provide the same key if you use the machine image later (e.g. to create a
     * instance from the image)
     * Structure is documented below.
     * 
     */
    @Import(name="machineImageEncryptionKey")
    private @Nullable Output<MachineImageMachineImageEncryptionKeyArgs> machineImageEncryptionKey;

    /**
     * @return Encrypts the machine image using a customer-supplied encryption key.
     * After you encrypt a machine image with a customer-supplied key, you must
     * provide the same key if you use the machine image later (e.g. to create a
     * instance from the image)
     * Structure is documented below.
     * 
     */
    public Optional<Output<MachineImageMachineImageEncryptionKeyArgs>> machineImageEncryptionKey() {
        return Optional.ofNullable(this.machineImageEncryptionKey);
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * The source instance used to create the machine image. You can provide this as a partial or full URL to the resource.
     * 
     */
    @Import(name="sourceInstance")
    private @Nullable Output<String> sourceInstance;

    /**
     * @return The source instance used to create the machine image. You can provide this as a partial or full URL to the resource.
     * 
     */
    public Optional<Output<String>> sourceInstance() {
        return Optional.ofNullable(this.sourceInstance);
    }

    /**
     * The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
     * 
     */
    @Import(name="storageLocations")
    private @Nullable Output<List<String>> storageLocations;

    /**
     * @return The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
     * 
     */
    public Optional<Output<List<String>>> storageLocations() {
        return Optional.ofNullable(this.storageLocations);
    }

    private MachineImageState() {}

    private MachineImageState(MachineImageState $) {
        this.description = $.description;
        this.guestFlush = $.guestFlush;
        this.machineImageEncryptionKey = $.machineImageEncryptionKey;
        this.name = $.name;
        this.project = $.project;
        this.selfLink = $.selfLink;
        this.sourceInstance = $.sourceInstance;
        this.storageLocations = $.storageLocations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MachineImageState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MachineImageState $;

        public Builder() {
            $ = new MachineImageState();
        }

        public Builder(MachineImageState defaults) {
            $ = new MachineImageState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A text description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A text description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param guestFlush Specify this to create an application consistent machine image by informing the OS to prepare for the snapshot process.
         * Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
         * 
         * @return builder
         * 
         */
        public Builder guestFlush(@Nullable Output<Boolean> guestFlush) {
            $.guestFlush = guestFlush;
            return this;
        }

        /**
         * @param guestFlush Specify this to create an application consistent machine image by informing the OS to prepare for the snapshot process.
         * Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
         * 
         * @return builder
         * 
         */
        public Builder guestFlush(Boolean guestFlush) {
            return guestFlush(Output.of(guestFlush));
        }

        /**
         * @param machineImageEncryptionKey Encrypts the machine image using a customer-supplied encryption key.
         * After you encrypt a machine image with a customer-supplied key, you must
         * provide the same key if you use the machine image later (e.g. to create a
         * instance from the image)
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder machineImageEncryptionKey(@Nullable Output<MachineImageMachineImageEncryptionKeyArgs> machineImageEncryptionKey) {
            $.machineImageEncryptionKey = machineImageEncryptionKey;
            return this;
        }

        /**
         * @param machineImageEncryptionKey Encrypts the machine image using a customer-supplied encryption key.
         * After you encrypt a machine image with a customer-supplied key, you must
         * provide the same key if you use the machine image later (e.g. to create a
         * instance from the image)
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder machineImageEncryptionKey(MachineImageMachineImageEncryptionKeyArgs machineImageEncryptionKey) {
            return machineImageEncryptionKey(Output.of(machineImageEncryptionKey));
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param selfLink The URI of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        /**
         * @param selfLink The URI of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        /**
         * @param sourceInstance The source instance used to create the machine image. You can provide this as a partial or full URL to the resource.
         * 
         * @return builder
         * 
         */
        public Builder sourceInstance(@Nullable Output<String> sourceInstance) {
            $.sourceInstance = sourceInstance;
            return this;
        }

        /**
         * @param sourceInstance The source instance used to create the machine image. You can provide this as a partial or full URL to the resource.
         * 
         * @return builder
         * 
         */
        public Builder sourceInstance(String sourceInstance) {
            return sourceInstance(Output.of(sourceInstance));
        }

        /**
         * @param storageLocations The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
         * 
         * @return builder
         * 
         */
        public Builder storageLocations(@Nullable Output<List<String>> storageLocations) {
            $.storageLocations = storageLocations;
            return this;
        }

        /**
         * @param storageLocations The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
         * 
         * @return builder
         * 
         */
        public Builder storageLocations(List<String> storageLocations) {
            return storageLocations(Output.of(storageLocations));
        }

        /**
         * @param storageLocations The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
         * 
         * @return builder
         * 
         */
        public Builder storageLocations(String... storageLocations) {
            return storageLocations(List.of(storageLocations));
        }

        public MachineImageState build() {
            return $;
        }
    }

}