// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.workbench.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.workbench.inputs.InstanceGceSetupArgs;
import com.pulumi.gcp.workbench.inputs.InstanceHealthInfoArgs;
import com.pulumi.gcp.workbench.inputs.InstanceUpgradeHistoryArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * An RFC3339 timestamp in UTC time. This in the format of yyyy-MM-ddTHH:mm:ss.SSSZ.
     * The milliseconds portion (&#34;.SSS&#34;) is optional.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return An RFC3339 timestamp in UTC time. This in the format of yyyy-MM-ddTHH:mm:ss.SSSZ.
     * The milliseconds portion (&#34;.SSS&#34;) is optional.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Output only. Email address of entity that sent original CreateInstance request.
     * 
     */
    @Import(name="creator")
    private @Nullable Output<String> creator;

    /**
     * @return Output only. Email address of entity that sent original CreateInstance request.
     * 
     */
    public Optional<Output<String>> creator() {
        return Optional.ofNullable(this.creator);
    }

    /**
     * Optional. If true, the workbench instance will not register with the proxy.
     * 
     */
    @Import(name="disableProxyAccess")
    private @Nullable Output<Boolean> disableProxyAccess;

    /**
     * @return Optional. If true, the workbench instance will not register with the proxy.
     * 
     */
    public Optional<Output<Boolean>> disableProxyAccess() {
        return Optional.ofNullable(this.disableProxyAccess);
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
     * The definition of how to configure a VM instance outside of Resources and Identity.
     * Structure is documented below.
     * 
     */
    @Import(name="gceSetup")
    private @Nullable Output<InstanceGceSetupArgs> gceSetup;

    /**
     * @return The definition of how to configure a VM instance outside of Resources and Identity.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InstanceGceSetupArgs>> gceSetup() {
        return Optional.ofNullable(this.gceSetup);
    }

    /**
     * &#39;Output only. Additional information about instance health. Example:
     * healthInfo&#34;: { &#34;docker_proxy_agent_status&#34;: &#34;1&#34;, &#34;docker_status&#34;: &#34;1&#34;, &#34;jupyterlab_api_status&#34;:
     * &#34;-1&#34;, &#34;jupyterlab_status&#34;: &#34;-1&#34;, &#34;updated&#34;: &#34;2020-10-18 09:40:03.573409&#34; }&#39;
     * 
     */
    @Import(name="healthInfos")
    private @Nullable Output<List<InstanceHealthInfoArgs>> healthInfos;

    /**
     * @return &#39;Output only. Additional information about instance health. Example:
     * healthInfo&#34;: { &#34;docker_proxy_agent_status&#34;: &#34;1&#34;, &#34;docker_status&#34;: &#34;1&#34;, &#34;jupyterlab_api_status&#34;:
     * &#34;-1&#34;, &#34;jupyterlab_status&#34;: &#34;-1&#34;, &#34;updated&#34;: &#34;2020-10-18 09:40:03.573409&#34; }&#39;
     * 
     */
    public Optional<Output<List<InstanceHealthInfoArgs>>> healthInfos() {
        return Optional.ofNullable(this.healthInfos);
    }

    /**
     * Output only. Instance health_state.
     * 
     */
    @Import(name="healthState")
    private @Nullable Output<String> healthState;

    /**
     * @return Output only. Instance health_state.
     * 
     */
    public Optional<Output<String>> healthState() {
        return Optional.ofNullable(this.healthState);
    }

    /**
     * Required. User-defined unique ID of this instance.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return Required. User-defined unique ID of this instance.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * &#39;Optional. Input only. The owner of this instance after creation. Format:
     * `alias@example.com` Currently supports one owner only. If not specified, all of
     * the service account users of your VM instance&#39;&#39;s service account can use the instance.&#39;
     * 
     */
    @Import(name="instanceOwners")
    private @Nullable Output<List<String>> instanceOwners;

    /**
     * @return &#39;Optional. Input only. The owner of this instance after creation. Format:
     * `alias@example.com` Currently supports one owner only. If not specified, all of
     * the service account users of your VM instance&#39;&#39;s service account can use the instance.&#39;
     * 
     */
    public Optional<Output<List<String>>> instanceOwners() {
        return Optional.ofNullable(this.instanceOwners);
    }

    /**
     * Optional. Labels to apply to this instance. These can be later modified
     * by the UpdateInstance method.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Labels to apply to this instance. These can be later modified
     * by the UpdateInstance method.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Part of `parent`. See documentation of `projectsId`.
     * 
     * ***
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Part of `parent`. See documentation of `projectsId`.
     * 
     * ***
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of this workbench instance. Format: `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of this workbench instance. Format: `projects/{project_id}/locations/{location}/instances/{instance_id}`
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
     * Output only. The proxy endpoint that is used to access the Jupyter notebook.
     * 
     */
    @Import(name="proxyUri")
    private @Nullable Output<String> proxyUri;

    /**
     * @return Output only. The proxy endpoint that is used to access the Jupyter notebook.
     * 
     */
    public Optional<Output<String>> proxyUri() {
        return Optional.ofNullable(this.proxyUri);
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
     * (Output)
     * Output only. The state of this instance upgrade history entry.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return (Output)
     * Output only. The state of this instance upgrade history entry.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * An RFC3339 timestamp in UTC time. This in the format of yyyy-MM-ddTHH:mm:ss.SSSZ.
     * The milliseconds portion (&#34;.SSS&#34;) is optional.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return An RFC3339 timestamp in UTC time. This in the format of yyyy-MM-ddTHH:mm:ss.SSSZ.
     * The milliseconds portion (&#34;.SSS&#34;) is optional.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    /**
     * Output only. The upgrade history of this instance.
     * Structure is documented below.
     * 
     */
    @Import(name="upgradeHistories")
    private @Nullable Output<List<InstanceUpgradeHistoryArgs>> upgradeHistories;

    /**
     * @return Output only. The upgrade history of this instance.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<InstanceUpgradeHistoryArgs>>> upgradeHistories() {
        return Optional.ofNullable(this.upgradeHistories);
    }

    private InstanceState() {}

    private InstanceState(InstanceState $) {
        this.createTime = $.createTime;
        this.creator = $.creator;
        this.disableProxyAccess = $.disableProxyAccess;
        this.effectiveLabels = $.effectiveLabels;
        this.gceSetup = $.gceSetup;
        this.healthInfos = $.healthInfos;
        this.healthState = $.healthState;
        this.instanceId = $.instanceId;
        this.instanceOwners = $.instanceOwners;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.proxyUri = $.proxyUri;
        this.pulumiLabels = $.pulumiLabels;
        this.state = $.state;
        this.updateTime = $.updateTime;
        this.upgradeHistories = $.upgradeHistories;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceState $;

        public Builder() {
            $ = new InstanceState();
        }

        public Builder(InstanceState defaults) {
            $ = new InstanceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime An RFC3339 timestamp in UTC time. This in the format of yyyy-MM-ddTHH:mm:ss.SSSZ.
         * The milliseconds portion (&#34;.SSS&#34;) is optional.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime An RFC3339 timestamp in UTC time. This in the format of yyyy-MM-ddTHH:mm:ss.SSSZ.
         * The milliseconds portion (&#34;.SSS&#34;) is optional.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param creator Output only. Email address of entity that sent original CreateInstance request.
         * 
         * @return builder
         * 
         */
        public Builder creator(@Nullable Output<String> creator) {
            $.creator = creator;
            return this;
        }

        /**
         * @param creator Output only. Email address of entity that sent original CreateInstance request.
         * 
         * @return builder
         * 
         */
        public Builder creator(String creator) {
            return creator(Output.of(creator));
        }

        /**
         * @param disableProxyAccess Optional. If true, the workbench instance will not register with the proxy.
         * 
         * @return builder
         * 
         */
        public Builder disableProxyAccess(@Nullable Output<Boolean> disableProxyAccess) {
            $.disableProxyAccess = disableProxyAccess;
            return this;
        }

        /**
         * @param disableProxyAccess Optional. If true, the workbench instance will not register with the proxy.
         * 
         * @return builder
         * 
         */
        public Builder disableProxyAccess(Boolean disableProxyAccess) {
            return disableProxyAccess(Output.of(disableProxyAccess));
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
         * @param gceSetup The definition of how to configure a VM instance outside of Resources and Identity.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gceSetup(@Nullable Output<InstanceGceSetupArgs> gceSetup) {
            $.gceSetup = gceSetup;
            return this;
        }

        /**
         * @param gceSetup The definition of how to configure a VM instance outside of Resources and Identity.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gceSetup(InstanceGceSetupArgs gceSetup) {
            return gceSetup(Output.of(gceSetup));
        }

        /**
         * @param healthInfos &#39;Output only. Additional information about instance health. Example:
         * healthInfo&#34;: { &#34;docker_proxy_agent_status&#34;: &#34;1&#34;, &#34;docker_status&#34;: &#34;1&#34;, &#34;jupyterlab_api_status&#34;:
         * &#34;-1&#34;, &#34;jupyterlab_status&#34;: &#34;-1&#34;, &#34;updated&#34;: &#34;2020-10-18 09:40:03.573409&#34; }&#39;
         * 
         * @return builder
         * 
         */
        public Builder healthInfos(@Nullable Output<List<InstanceHealthInfoArgs>> healthInfos) {
            $.healthInfos = healthInfos;
            return this;
        }

        /**
         * @param healthInfos &#39;Output only. Additional information about instance health. Example:
         * healthInfo&#34;: { &#34;docker_proxy_agent_status&#34;: &#34;1&#34;, &#34;docker_status&#34;: &#34;1&#34;, &#34;jupyterlab_api_status&#34;:
         * &#34;-1&#34;, &#34;jupyterlab_status&#34;: &#34;-1&#34;, &#34;updated&#34;: &#34;2020-10-18 09:40:03.573409&#34; }&#39;
         * 
         * @return builder
         * 
         */
        public Builder healthInfos(List<InstanceHealthInfoArgs> healthInfos) {
            return healthInfos(Output.of(healthInfos));
        }

        /**
         * @param healthInfos &#39;Output only. Additional information about instance health. Example:
         * healthInfo&#34;: { &#34;docker_proxy_agent_status&#34;: &#34;1&#34;, &#34;docker_status&#34;: &#34;1&#34;, &#34;jupyterlab_api_status&#34;:
         * &#34;-1&#34;, &#34;jupyterlab_status&#34;: &#34;-1&#34;, &#34;updated&#34;: &#34;2020-10-18 09:40:03.573409&#34; }&#39;
         * 
         * @return builder
         * 
         */
        public Builder healthInfos(InstanceHealthInfoArgs... healthInfos) {
            return healthInfos(List.of(healthInfos));
        }

        /**
         * @param healthState Output only. Instance health_state.
         * 
         * @return builder
         * 
         */
        public Builder healthState(@Nullable Output<String> healthState) {
            $.healthState = healthState;
            return this;
        }

        /**
         * @param healthState Output only. Instance health_state.
         * 
         * @return builder
         * 
         */
        public Builder healthState(String healthState) {
            return healthState(Output.of(healthState));
        }

        /**
         * @param instanceId Required. User-defined unique ID of this instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId Required. User-defined unique ID of this instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param instanceOwners &#39;Optional. Input only. The owner of this instance after creation. Format:
         * `alias@example.com` Currently supports one owner only. If not specified, all of
         * the service account users of your VM instance&#39;&#39;s service account can use the instance.&#39;
         * 
         * @return builder
         * 
         */
        public Builder instanceOwners(@Nullable Output<List<String>> instanceOwners) {
            $.instanceOwners = instanceOwners;
            return this;
        }

        /**
         * @param instanceOwners &#39;Optional. Input only. The owner of this instance after creation. Format:
         * `alias@example.com` Currently supports one owner only. If not specified, all of
         * the service account users of your VM instance&#39;&#39;s service account can use the instance.&#39;
         * 
         * @return builder
         * 
         */
        public Builder instanceOwners(List<String> instanceOwners) {
            return instanceOwners(Output.of(instanceOwners));
        }

        /**
         * @param instanceOwners &#39;Optional. Input only. The owner of this instance after creation. Format:
         * `alias@example.com` Currently supports one owner only. If not specified, all of
         * the service account users of your VM instance&#39;&#39;s service account can use the instance.&#39;
         * 
         * @return builder
         * 
         */
        public Builder instanceOwners(String... instanceOwners) {
            return instanceOwners(List.of(instanceOwners));
        }

        /**
         * @param labels Optional. Labels to apply to this instance. These can be later modified
         * by the UpdateInstance method.
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
         * @param labels Optional. Labels to apply to this instance. These can be later modified
         * by the UpdateInstance method.
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
         * @param location Part of `parent`. See documentation of `projectsId`.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Part of `parent`. See documentation of `projectsId`.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of this workbench instance. Format: `projects/{project_id}/locations/{location}/instances/{instance_id}`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this workbench instance. Format: `projects/{project_id}/locations/{location}/instances/{instance_id}`
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
         * @param proxyUri Output only. The proxy endpoint that is used to access the Jupyter notebook.
         * 
         * @return builder
         * 
         */
        public Builder proxyUri(@Nullable Output<String> proxyUri) {
            $.proxyUri = proxyUri;
            return this;
        }

        /**
         * @param proxyUri Output only. The proxy endpoint that is used to access the Jupyter notebook.
         * 
         * @return builder
         * 
         */
        public Builder proxyUri(String proxyUri) {
            return proxyUri(Output.of(proxyUri));
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
         * @param state (Output)
         * Output only. The state of this instance upgrade history entry.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state (Output)
         * Output only. The state of this instance upgrade history entry.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param updateTime An RFC3339 timestamp in UTC time. This in the format of yyyy-MM-ddTHH:mm:ss.SSSZ.
         * The milliseconds portion (&#34;.SSS&#34;) is optional.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime An RFC3339 timestamp in UTC time. This in the format of yyyy-MM-ddTHH:mm:ss.SSSZ.
         * The milliseconds portion (&#34;.SSS&#34;) is optional.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        /**
         * @param upgradeHistories Output only. The upgrade history of this instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder upgradeHistories(@Nullable Output<List<InstanceUpgradeHistoryArgs>> upgradeHistories) {
            $.upgradeHistories = upgradeHistories;
            return this;
        }

        /**
         * @param upgradeHistories Output only. The upgrade history of this instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder upgradeHistories(List<InstanceUpgradeHistoryArgs> upgradeHistories) {
            return upgradeHistories(Output.of(upgradeHistories));
        }

        /**
         * @param upgradeHistories Output only. The upgrade history of this instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder upgradeHistories(InstanceUpgradeHistoryArgs... upgradeHistories) {
            return upgradeHistories(List.of(upgradeHistories));
        }

        public InstanceState build() {
            return $;
        }
    }

}