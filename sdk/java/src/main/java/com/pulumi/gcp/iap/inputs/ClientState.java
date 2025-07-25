// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientState extends com.pulumi.resources.ResourceArgs {

    public static final ClientState Empty = new ClientState();

    /**
     * Identifier of the brand to which this client
     * is attached to. The format is
     * `projects/{project_number}/brands/{brand_id}`.
     * 
     */
    @Import(name="brand")
    private @Nullable Output<String> brand;

    /**
     * @return Identifier of the brand to which this client
     * is attached to. The format is
     * `projects/{project_number}/brands/{brand_id}`.
     * 
     */
    public Optional<Output<String>> brand() {
        return Optional.ofNullable(this.brand);
    }

    /**
     * Output only. Unique identifier of the OAuth client.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return Output only. Unique identifier of the OAuth client.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * Human-friendly name given to the OAuth client.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Human-friendly name given to the OAuth client.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Output only. Client secret of the OAuth client.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<String> secret;

    /**
     * @return Output only. Client secret of the OAuth client.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
    }

    private ClientState() {}

    private ClientState(ClientState $) {
        this.brand = $.brand;
        this.clientId = $.clientId;
        this.displayName = $.displayName;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientState $;

        public Builder() {
            $ = new ClientState();
        }

        public Builder(ClientState defaults) {
            $ = new ClientState(Objects.requireNonNull(defaults));
        }

        /**
         * @param brand Identifier of the brand to which this client
         * is attached to. The format is
         * `projects/{project_number}/brands/{brand_id}`.
         * 
         * @return builder
         * 
         */
        public Builder brand(@Nullable Output<String> brand) {
            $.brand = brand;
            return this;
        }

        /**
         * @param brand Identifier of the brand to which this client
         * is attached to. The format is
         * `projects/{project_number}/brands/{brand_id}`.
         * 
         * @return builder
         * 
         */
        public Builder brand(String brand) {
            return brand(Output.of(brand));
        }

        /**
         * @param clientId Output only. Unique identifier of the OAuth client.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId Output only. Unique identifier of the OAuth client.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param displayName Human-friendly name given to the OAuth client.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Human-friendly name given to the OAuth client.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param secret Output only. Client secret of the OAuth client.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret Output only. Client secret of the OAuth client.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public ClientState build() {
            return $;
        }
    }

}
