// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkehub.inputs.ScopeStateArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScopeState extends com.pulumi.resources.ResourceArgs {

    public static final ScopeState Empty = new ScopeState();

    /**
     * Time the Scope was created in UTC.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Time the Scope was created in UTC.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Time the Scope was deleted in UTC.
     * 
     */
    @Import(name="deleteTime")
    private @Nullable Output<String> deleteTime;

    /**
     * @return Time the Scope was deleted in UTC.
     * 
     */
    public Optional<Output<String>> deleteTime() {
        return Optional.ofNullable(this.deleteTime);
    }

    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Import(name="effectiveLabels")
    private @Nullable Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Optional<Output<Map<String,String>>> effectiveLabels() {
        return Optional.ofNullable(this.effectiveLabels);
    }

    /**
     * Labels for this Scope.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels for this Scope.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The unique identifier of the scope
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique identifier of the scope
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Scope-level cluster namespace labels. For the member clusters bound
     * to the Scope, these labels are applied to each namespace under the
     * Scope. Scope-level labels take precedence over Namespace-level
     * labels (`namespace_labels` in the Fleet Namespace resource) if they
     * share a key. Keys and values must be Kubernetes-conformant.
     * 
     */
    @Import(name="namespaceLabels")
    private @Nullable Output<Map<String,String>> namespaceLabels;

    /**
     * @return Scope-level cluster namespace labels. For the member clusters bound
     * to the Scope, these labels are applied to each namespace under the
     * Scope. Scope-level labels take precedence over Namespace-level
     * labels (`namespace_labels` in the Fleet Namespace resource) if they
     * share a key. Keys and values must be Kubernetes-conformant.
     * 
     */
    public Optional<Output<Map<String,String>>> namespaceLabels() {
        return Optional.ofNullable(this.namespaceLabels);
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
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Import(name="pulumiLabels")
    private @Nullable Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Optional<Output<Map<String,String>>> pulumiLabels() {
        return Optional.ofNullable(this.pulumiLabels);
    }

    /**
     * The client-provided identifier of the scope.
     * 
     */
    @Import(name="scopeId")
    private @Nullable Output<String> scopeId;

    /**
     * @return The client-provided identifier of the scope.
     * 
     */
    public Optional<Output<String>> scopeId() {
        return Optional.ofNullable(this.scopeId);
    }

    /**
     * State of the scope resource.
     * Structure is documented below.
     * 
     */
    @Import(name="states")
    private @Nullable Output<List<ScopeStateArgs>> states;

    /**
     * @return State of the scope resource.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ScopeStateArgs>>> states() {
        return Optional.ofNullable(this.states);
    }

    /**
     * Google-generated UUID for this resource.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return Google-generated UUID for this resource.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    /**
     * Time the Scope was updated in UTC.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Time the Scope was updated in UTC.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private ScopeState() {}

    private ScopeState(ScopeState $) {
        this.createTime = $.createTime;
        this.deleteTime = $.deleteTime;
        this.effectiveLabels = $.effectiveLabels;
        this.labels = $.labels;
        this.name = $.name;
        this.namespaceLabels = $.namespaceLabels;
        this.project = $.project;
        this.pulumiLabels = $.pulumiLabels;
        this.scopeId = $.scopeId;
        this.states = $.states;
        this.uid = $.uid;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScopeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScopeState $;

        public Builder() {
            $ = new ScopeState();
        }

        public Builder(ScopeState defaults) {
            $ = new ScopeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Time the Scope was created in UTC.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Time the Scope was created in UTC.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param deleteTime Time the Scope was deleted in UTC.
         * 
         * @return builder
         * 
         */
        public Builder deleteTime(@Nullable Output<String> deleteTime) {
            $.deleteTime = deleteTime;
            return this;
        }

        /**
         * @param deleteTime Time the Scope was deleted in UTC.
         * 
         * @return builder
         * 
         */
        public Builder deleteTime(String deleteTime) {
            return deleteTime(Output.of(deleteTime));
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(@Nullable Output<Map<String,String>> effectiveLabels) {
            $.effectiveLabels = effectiveLabels;
            return this;
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            return effectiveLabels(Output.of(effectiveLabels));
        }

        /**
         * @param labels Labels for this Scope.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for this Scope.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The unique identifier of the scope
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique identifier of the scope
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceLabels Scope-level cluster namespace labels. For the member clusters bound
         * to the Scope, these labels are applied to each namespace under the
         * Scope. Scope-level labels take precedence over Namespace-level
         * labels (`namespace_labels` in the Fleet Namespace resource) if they
         * share a key. Keys and values must be Kubernetes-conformant.
         * 
         * @return builder
         * 
         */
        public Builder namespaceLabels(@Nullable Output<Map<String,String>> namespaceLabels) {
            $.namespaceLabels = namespaceLabels;
            return this;
        }

        /**
         * @param namespaceLabels Scope-level cluster namespace labels. For the member clusters bound
         * to the Scope, these labels are applied to each namespace under the
         * Scope. Scope-level labels take precedence over Namespace-level
         * labels (`namespace_labels` in the Fleet Namespace resource) if they
         * share a key. Keys and values must be Kubernetes-conformant.
         * 
         * @return builder
         * 
         */
        public Builder namespaceLabels(Map<String,String> namespaceLabels) {
            return namespaceLabels(Output.of(namespaceLabels));
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
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(@Nullable Output<Map<String,String>> pulumiLabels) {
            $.pulumiLabels = pulumiLabels;
            return this;
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            return pulumiLabels(Output.of(pulumiLabels));
        }

        /**
         * @param scopeId The client-provided identifier of the scope.
         * 
         * @return builder
         * 
         */
        public Builder scopeId(@Nullable Output<String> scopeId) {
            $.scopeId = scopeId;
            return this;
        }

        /**
         * @param scopeId The client-provided identifier of the scope.
         * 
         * @return builder
         * 
         */
        public Builder scopeId(String scopeId) {
            return scopeId(Output.of(scopeId));
        }

        /**
         * @param states State of the scope resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder states(@Nullable Output<List<ScopeStateArgs>> states) {
            $.states = states;
            return this;
        }

        /**
         * @param states State of the scope resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder states(List<ScopeStateArgs> states) {
            return states(Output.of(states));
        }

        /**
         * @param states State of the scope resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder states(ScopeStateArgs... states) {
            return states(List.of(states));
        }

        /**
         * @param uid Google-generated UUID for this resource.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid Google-generated UUID for this resource.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        /**
         * @param updateTime Time the Scope was updated in UTC.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Time the Scope was updated in UTC.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public ScopeState build() {
            return $;
        }
    }

}
