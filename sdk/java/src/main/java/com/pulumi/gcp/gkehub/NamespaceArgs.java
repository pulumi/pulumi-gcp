// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceArgs Empty = new NamespaceArgs();

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
     * The name of the Scope instance.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return The name of the Scope instance.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     * Id of the scope
     * 
     * ***
     * 
     */
    @Import(name="scopeId", required=true)
    private Output<String> scopeId;

    /**
     * @return Id of the scope
     * 
     * ***
     * 
     */
    public Output<String> scopeId() {
        return this.scopeId;
    }

    /**
     * The client-provided identifier of the namespace.
     * 
     */
    @Import(name="scopeNamespaceId", required=true)
    private Output<String> scopeNamespaceId;

    /**
     * @return The client-provided identifier of the namespace.
     * 
     */
    public Output<String> scopeNamespaceId() {
        return this.scopeNamespaceId;
    }

    private NamespaceArgs() {}

    private NamespaceArgs(NamespaceArgs $) {
        this.project = $.project;
        this.scope = $.scope;
        this.scopeId = $.scopeId;
        this.scopeNamespaceId = $.scopeNamespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceArgs $;

        public Builder() {
            $ = new NamespaceArgs();
        }

        public Builder(NamespaceArgs defaults) {
            $ = new NamespaceArgs(Objects.requireNonNull(defaults));
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
         * @param scope The name of the Scope instance.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The name of the Scope instance.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param scopeId Id of the scope
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder scopeId(Output<String> scopeId) {
            $.scopeId = scopeId;
            return this;
        }

        /**
         * @param scopeId Id of the scope
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder scopeId(String scopeId) {
            return scopeId(Output.of(scopeId));
        }

        /**
         * @param scopeNamespaceId The client-provided identifier of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder scopeNamespaceId(Output<String> scopeNamespaceId) {
            $.scopeNamespaceId = scopeNamespaceId;
            return this;
        }

        /**
         * @param scopeNamespaceId The client-provided identifier of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder scopeNamespaceId(String scopeNamespaceId) {
            return scopeNamespaceId(Output.of(scopeNamespaceId));
        }

        public NamespaceArgs build() {
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            $.scopeId = Objects.requireNonNull($.scopeId, "expected parameter 'scopeId' to be non-null");
            $.scopeNamespaceId = Objects.requireNonNull($.scopeNamespaceId, "expected parameter 'scopeNamespaceId' to be non-null");
            return $;
        }
    }

}