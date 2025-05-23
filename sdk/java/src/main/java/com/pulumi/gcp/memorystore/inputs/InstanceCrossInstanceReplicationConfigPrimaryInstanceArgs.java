// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.memorystore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs Empty = new InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs();

    /**
     * The full resource path of the primary instance in the format: projects/{project}/locations/{region}/instances/{instance-id}
     * 
     */
    @Import(name="instance")
    private @Nullable Output<String> instance;

    /**
     * @return The full resource path of the primary instance in the format: projects/{project}/locations/{region}/instances/{instance-id}
     * 
     */
    public Optional<Output<String>> instance() {
        return Optional.ofNullable(this.instance);
    }

    /**
     * (Output)
     * The unique id of the primary instance.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return (Output)
     * The unique id of the primary instance.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    private InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs() {}

    private InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs(InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs $) {
        this.instance = $.instance;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs $;

        public Builder() {
            $ = new InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs();
        }

        public Builder(InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs defaults) {
            $ = new InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instance The full resource path of the primary instance in the format: projects/{project}/locations/{region}/instances/{instance-id}
         * 
         * @return builder
         * 
         */
        public Builder instance(@Nullable Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance The full resource path of the primary instance in the format: projects/{project}/locations/{region}/instances/{instance-id}
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        /**
         * @param uid (Output)
         * The unique id of the primary instance.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid (Output)
         * The unique id of the primary instance.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        public InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs build() {
            return $;
        }
    }

}
