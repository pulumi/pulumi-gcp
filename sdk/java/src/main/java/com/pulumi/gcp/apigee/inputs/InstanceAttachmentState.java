// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceAttachmentState Empty = new InstanceAttachmentState();

    /**
     * The resource ID of the environment.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<String> environment;

    /**
     * @return The resource ID of the environment.
     * 
     */
    public Optional<Output<String>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * The Apigee instance associated with the Apigee environment,
     * in the format `organizations/{{org_name}}/instances/{{instance_name}}`.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The Apigee instance associated with the Apigee environment,
     * in the format `organizations/{{org_name}}/instances/{{instance_name}}`.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The name of the newly created  attachment (output parameter).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the newly created  attachment (output parameter).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private InstanceAttachmentState() {}

    private InstanceAttachmentState(InstanceAttachmentState $) {
        this.environment = $.environment;
        this.instanceId = $.instanceId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceAttachmentState $;

        public Builder() {
            $ = new InstanceAttachmentState();
        }

        public Builder(InstanceAttachmentState defaults) {
            $ = new InstanceAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param environment The resource ID of the environment.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<String> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment The resource ID of the environment.
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param instanceId The Apigee instance associated with the Apigee environment,
         * in the format `organizations/{{org_name}}/instances/{{instance_name}}`.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The Apigee instance associated with the Apigee environment,
         * in the format `organizations/{{org_name}}/instances/{{instance_name}}`.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param name The name of the newly created  attachment (output parameter).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the newly created  attachment (output parameter).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public InstanceAttachmentState build() {
            return $;
        }
    }

}
