// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.identityplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.identityplatform.inputs.TenantClientArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TenantState extends com.pulumi.resources.ResourceArgs {

    public static final TenantState Empty = new TenantState();

    /**
     * Whether to allow email/password user authentication.
     * 
     */
    @Import(name="allowPasswordSignup")
    private @Nullable Output<Boolean> allowPasswordSignup;

    /**
     * @return Whether to allow email/password user authentication.
     * 
     */
    public Optional<Output<Boolean>> allowPasswordSignup() {
        return Optional.ofNullable(this.allowPasswordSignup);
    }

    /**
     * Options related to how clients making requests on behalf of a tenant should be configured.
     * Structure is documented below.
     * 
     */
    @Import(name="client")
    private @Nullable Output<TenantClientArgs> client;

    /**
     * @return Options related to how clients making requests on behalf of a tenant should be configured.
     * Structure is documented below.
     * 
     */
    public Optional<Output<TenantClientArgs>> client() {
        return Optional.ofNullable(this.client);
    }

    /**
     * Whether authentication is disabled for the tenant. If true, the users under
     * the disabled tenant are not allowed to sign-in. Admins of the disabled tenant
     * are not able to manage its users.
     * 
     */
    @Import(name="disableAuth")
    private @Nullable Output<Boolean> disableAuth;

    /**
     * @return Whether authentication is disabled for the tenant. If true, the users under
     * the disabled tenant are not allowed to sign-in. Admins of the disabled tenant
     * are not able to manage its users.
     * 
     */
    public Optional<Output<Boolean>> disableAuth() {
        return Optional.ofNullable(this.disableAuth);
    }

    /**
     * Human friendly display name of the tenant.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Human friendly display name of the tenant.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Whether to enable email link user authentication.
     * 
     */
    @Import(name="enableEmailLinkSignin")
    private @Nullable Output<Boolean> enableEmailLinkSignin;

    /**
     * @return Whether to enable email link user authentication.
     * 
     */
    public Optional<Output<Boolean>> enableEmailLinkSignin() {
        return Optional.ofNullable(this.enableEmailLinkSignin);
    }

    /**
     * The name of the tenant that is generated by the server
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the tenant that is generated by the server
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

    private TenantState() {}

    private TenantState(TenantState $) {
        this.allowPasswordSignup = $.allowPasswordSignup;
        this.client = $.client;
        this.disableAuth = $.disableAuth;
        this.displayName = $.displayName;
        this.enableEmailLinkSignin = $.enableEmailLinkSignin;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TenantState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TenantState $;

        public Builder() {
            $ = new TenantState();
        }

        public Builder(TenantState defaults) {
            $ = new TenantState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowPasswordSignup Whether to allow email/password user authentication.
         * 
         * @return builder
         * 
         */
        public Builder allowPasswordSignup(@Nullable Output<Boolean> allowPasswordSignup) {
            $.allowPasswordSignup = allowPasswordSignup;
            return this;
        }

        /**
         * @param allowPasswordSignup Whether to allow email/password user authentication.
         * 
         * @return builder
         * 
         */
        public Builder allowPasswordSignup(Boolean allowPasswordSignup) {
            return allowPasswordSignup(Output.of(allowPasswordSignup));
        }

        /**
         * @param client Options related to how clients making requests on behalf of a tenant should be configured.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder client(@Nullable Output<TenantClientArgs> client) {
            $.client = client;
            return this;
        }

        /**
         * @param client Options related to how clients making requests on behalf of a tenant should be configured.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder client(TenantClientArgs client) {
            return client(Output.of(client));
        }

        /**
         * @param disableAuth Whether authentication is disabled for the tenant. If true, the users under
         * the disabled tenant are not allowed to sign-in. Admins of the disabled tenant
         * are not able to manage its users.
         * 
         * @return builder
         * 
         */
        public Builder disableAuth(@Nullable Output<Boolean> disableAuth) {
            $.disableAuth = disableAuth;
            return this;
        }

        /**
         * @param disableAuth Whether authentication is disabled for the tenant. If true, the users under
         * the disabled tenant are not allowed to sign-in. Admins of the disabled tenant
         * are not able to manage its users.
         * 
         * @return builder
         * 
         */
        public Builder disableAuth(Boolean disableAuth) {
            return disableAuth(Output.of(disableAuth));
        }

        /**
         * @param displayName Human friendly display name of the tenant.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Human friendly display name of the tenant.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enableEmailLinkSignin Whether to enable email link user authentication.
         * 
         * @return builder
         * 
         */
        public Builder enableEmailLinkSignin(@Nullable Output<Boolean> enableEmailLinkSignin) {
            $.enableEmailLinkSignin = enableEmailLinkSignin;
            return this;
        }

        /**
         * @param enableEmailLinkSignin Whether to enable email link user authentication.
         * 
         * @return builder
         * 
         */
        public Builder enableEmailLinkSignin(Boolean enableEmailLinkSignin) {
            return enableEmailLinkSignin(Output.of(enableEmailLinkSignin));
        }

        /**
         * @param name The name of the tenant that is generated by the server
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the tenant that is generated by the server
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

        public TenantState build() {
            return $;
        }
    }

}
