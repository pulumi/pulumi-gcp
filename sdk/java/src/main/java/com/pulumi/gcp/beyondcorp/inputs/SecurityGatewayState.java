// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.beyondcorp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayHubArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityGatewayState extends com.pulumi.resources.ResourceArgs {

    public static final SecurityGatewayState Empty = new SecurityGatewayState();

    /**
     * Output only. Timestamp when the resource was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Output only. Timestamp when the resource was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Service account used for operations that involve resources in consumer projects.
     * 
     */
    @Import(name="delegatingServiceAccount")
    private @Nullable Output<String> delegatingServiceAccount;

    /**
     * @return Service account used for operations that involve resources in consumer projects.
     * 
     */
    public Optional<Output<String>> delegatingServiceAccount() {
        return Optional.ofNullable(this.delegatingServiceAccount);
    }

    /**
     * Optional. An arbitrary user-provided name for the SecurityGateway.
     * Cannot exceed 64 characters.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Optional. An arbitrary user-provided name for the SecurityGateway.
     * Cannot exceed 64 characters.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Output only. IP addresses that will be used for establishing
     * connection to the endpoints.
     * 
     */
    @Import(name="externalIps")
    private @Nullable Output<List<String>> externalIps;

    /**
     * @return Output only. IP addresses that will be used for establishing
     * connection to the endpoints.
     * 
     */
    public Optional<Output<List<String>>> externalIps() {
        return Optional.ofNullable(this.externalIps);
    }

    /**
     * Optional. Map of Hubs that represents regional data path deployment with GCP region
     * as a key.
     * Structure is documented below.
     * 
     */
    @Import(name="hubs")
    private @Nullable Output<List<SecurityGatewayHubArgs>> hubs;

    /**
     * @return Optional. Map of Hubs that represents regional data path deployment with GCP region
     * as a key.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<SecurityGatewayHubArgs>>> hubs() {
        return Optional.ofNullable(this.hubs);
    }

    /**
     * (Optional, Deprecated)
     * Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. Must be omitted or set to `global`.
     * 
     * &gt; **Warning:** `location` is deprecated and will be removed in a future major release.
     * 
     * @deprecated
     * `location` is deprecated and will be removed in a future major release.
     * 
     */
    @Deprecated /* `location` is deprecated and will be removed in a future major release. */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return (Optional, Deprecated)
     * Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. Must be omitted or set to `global`.
     * 
     * &gt; **Warning:** `location` is deprecated and will be removed in a future major release.
     * 
     * @deprecated
     * `location` is deprecated and will be removed in a future major release.
     * 
     */
    @Deprecated /* `location` is deprecated and will be removed in a future major release. */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Identifier. Name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Identifier. Name of the resource.
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
     * Optional. User-settable SecurityGateway resource ID.
     * * Must start with a letter.
     * * Must contain between 4-63 characters from `/a-z-/`.
     * * Must end with a number or letter.
     * 
     */
    @Import(name="securityGatewayId")
    private @Nullable Output<String> securityGatewayId;

    /**
     * @return Optional. User-settable SecurityGateway resource ID.
     * * Must start with a letter.
     * * Must contain between 4-63 characters from `/a-z-/`.
     * * Must end with a number or letter.
     * 
     */
    public Optional<Output<String>> securityGatewayId() {
        return Optional.ofNullable(this.securityGatewayId);
    }

    /**
     * Output only. The operational state of the SecurityGateway.
     * Possible values:
     * STATE_UNSPECIFIED
     * CREATING
     * UPDATING
     * DELETING
     * RUNNING
     * DOWN
     * ERROR
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Output only. The operational state of the SecurityGateway.
     * Possible values:
     * STATE_UNSPECIFIED
     * CREATING
     * UPDATING
     * DELETING
     * RUNNING
     * DOWN
     * ERROR
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Output only. Timestamp when the resource was last modified.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Output only. Timestamp when the resource was last modified.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private SecurityGatewayState() {}

    private SecurityGatewayState(SecurityGatewayState $) {
        this.createTime = $.createTime;
        this.delegatingServiceAccount = $.delegatingServiceAccount;
        this.displayName = $.displayName;
        this.externalIps = $.externalIps;
        this.hubs = $.hubs;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.securityGatewayId = $.securityGatewayId;
        this.state = $.state;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityGatewayState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityGatewayState $;

        public Builder() {
            $ = new SecurityGatewayState();
        }

        public Builder(SecurityGatewayState defaults) {
            $ = new SecurityGatewayState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Output only. Timestamp when the resource was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Output only. Timestamp when the resource was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param delegatingServiceAccount Service account used for operations that involve resources in consumer projects.
         * 
         * @return builder
         * 
         */
        public Builder delegatingServiceAccount(@Nullable Output<String> delegatingServiceAccount) {
            $.delegatingServiceAccount = delegatingServiceAccount;
            return this;
        }

        /**
         * @param delegatingServiceAccount Service account used for operations that involve resources in consumer projects.
         * 
         * @return builder
         * 
         */
        public Builder delegatingServiceAccount(String delegatingServiceAccount) {
            return delegatingServiceAccount(Output.of(delegatingServiceAccount));
        }

        /**
         * @param displayName Optional. An arbitrary user-provided name for the SecurityGateway.
         * Cannot exceed 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Optional. An arbitrary user-provided name for the SecurityGateway.
         * Cannot exceed 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param externalIps Output only. IP addresses that will be used for establishing
         * connection to the endpoints.
         * 
         * @return builder
         * 
         */
        public Builder externalIps(@Nullable Output<List<String>> externalIps) {
            $.externalIps = externalIps;
            return this;
        }

        /**
         * @param externalIps Output only. IP addresses that will be used for establishing
         * connection to the endpoints.
         * 
         * @return builder
         * 
         */
        public Builder externalIps(List<String> externalIps) {
            return externalIps(Output.of(externalIps));
        }

        /**
         * @param externalIps Output only. IP addresses that will be used for establishing
         * connection to the endpoints.
         * 
         * @return builder
         * 
         */
        public Builder externalIps(String... externalIps) {
            return externalIps(List.of(externalIps));
        }

        /**
         * @param hubs Optional. Map of Hubs that represents regional data path deployment with GCP region
         * as a key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hubs(@Nullable Output<List<SecurityGatewayHubArgs>> hubs) {
            $.hubs = hubs;
            return this;
        }

        /**
         * @param hubs Optional. Map of Hubs that represents regional data path deployment with GCP region
         * as a key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hubs(List<SecurityGatewayHubArgs> hubs) {
            return hubs(Output.of(hubs));
        }

        /**
         * @param hubs Optional. Map of Hubs that represents regional data path deployment with GCP region
         * as a key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hubs(SecurityGatewayHubArgs... hubs) {
            return hubs(List.of(hubs));
        }

        /**
         * @param location (Optional, Deprecated)
         * Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. Must be omitted or set to `global`.
         * 
         * &gt; **Warning:** `location` is deprecated and will be removed in a future major release.
         * 
         * @return builder
         * 
         * @deprecated
         * `location` is deprecated and will be removed in a future major release.
         * 
         */
        @Deprecated /* `location` is deprecated and will be removed in a future major release. */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location (Optional, Deprecated)
         * Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. Must be omitted or set to `global`.
         * 
         * &gt; **Warning:** `location` is deprecated and will be removed in a future major release.
         * 
         * @return builder
         * 
         * @deprecated
         * `location` is deprecated and will be removed in a future major release.
         * 
         */
        @Deprecated /* `location` is deprecated and will be removed in a future major release. */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Identifier. Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Identifier. Name of the resource.
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
         * @param securityGatewayId Optional. User-settable SecurityGateway resource ID.
         * * Must start with a letter.
         * * Must contain between 4-63 characters from `/a-z-/`.
         * * Must end with a number or letter.
         * 
         * @return builder
         * 
         */
        public Builder securityGatewayId(@Nullable Output<String> securityGatewayId) {
            $.securityGatewayId = securityGatewayId;
            return this;
        }

        /**
         * @param securityGatewayId Optional. User-settable SecurityGateway resource ID.
         * * Must start with a letter.
         * * Must contain between 4-63 characters from `/a-z-/`.
         * * Must end with a number or letter.
         * 
         * @return builder
         * 
         */
        public Builder securityGatewayId(String securityGatewayId) {
            return securityGatewayId(Output.of(securityGatewayId));
        }

        /**
         * @param state Output only. The operational state of the SecurityGateway.
         * Possible values:
         * STATE_UNSPECIFIED
         * CREATING
         * UPDATING
         * DELETING
         * RUNNING
         * DOWN
         * ERROR
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Output only. The operational state of the SecurityGateway.
         * Possible values:
         * STATE_UNSPECIFIED
         * CREATING
         * UPDATING
         * DELETING
         * RUNNING
         * DOWN
         * ERROR
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param updateTime Output only. Timestamp when the resource was last modified.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Output only. Timestamp when the resource was last modified.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public SecurityGatewayState build() {
            return $;
        }
    }

}
