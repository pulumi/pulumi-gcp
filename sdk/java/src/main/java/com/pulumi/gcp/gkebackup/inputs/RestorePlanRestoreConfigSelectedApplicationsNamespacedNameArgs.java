// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkebackup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs extends com.pulumi.resources.ResourceArgs {

    public static final RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs Empty = new RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs();

    /**
     * The name of a Kubernetes Resource.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of a Kubernetes Resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The namespace of a Kubernetes Resource.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    /**
     * @return The namespace of a Kubernetes Resource.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }

    private RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs() {}

    private RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs(RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs $) {
        this.name = $.name;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs $;

        public Builder() {
            $ = new RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs();
        }

        public Builder(RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs defaults) {
            $ = new RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of a Kubernetes Resource.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of a Kubernetes Resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace The namespace of a Kubernetes Resource.
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespace of a Kubernetes Resource.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            return $;
        }
    }

}