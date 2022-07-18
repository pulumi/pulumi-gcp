// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datafusion.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * The time the instance was created in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time the instance was created in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * User-managed service account to set on Dataproc when Cloud Data Fusion creates Dataproc to run data processing pipelines.
     * 
     */
    @Import(name="dataprocServiceAccount")
    private @Nullable Output<String> dataprocServiceAccount;

    /**
     * @return User-managed service account to set on Dataproc when Cloud Data Fusion creates Dataproc to run data processing pipelines.
     * 
     */
    public Optional<Output<String>> dataprocServiceAccount() {
        return Optional.ofNullable(this.dataprocServiceAccount);
    }

    /**
     * An optional description of the instance.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of the instance.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Option to enable Stackdriver Logging.
     * 
     */
    @Import(name="enableStackdriverLogging")
    private @Nullable Output<Boolean> enableStackdriverLogging;

    /**
     * @return Option to enable Stackdriver Logging.
     * 
     */
    public Optional<Output<Boolean>> enableStackdriverLogging() {
        return Optional.ofNullable(this.enableStackdriverLogging);
    }

    /**
     * Option to enable Stackdriver Monitoring.
     * 
     */
    @Import(name="enableStackdriverMonitoring")
    private @Nullable Output<Boolean> enableStackdriverMonitoring;

    /**
     * @return Option to enable Stackdriver Monitoring.
     * 
     */
    public Optional<Output<Boolean>> enableStackdriverMonitoring() {
        return Optional.ofNullable(this.enableStackdriverMonitoring);
    }

    /**
     * Cloud Storage bucket generated by Data Fusion in the customer project.
     * 
     */
    @Import(name="gcsBucket")
    private @Nullable Output<String> gcsBucket;

    /**
     * @return Cloud Storage bucket generated by Data Fusion in the customer project.
     * 
     */
    public Optional<Output<String>> gcsBucket() {
        return Optional.ofNullable(this.gcsBucket);
    }

    /**
     * The resource labels for instance to use to annotate any related underlying resources,
     * such as Compute Engine VMs.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The resource labels for instance to use to annotate any related underlying resources,
     * such as Compute Engine VMs.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The ID of the instance or a fully qualified identifier for the instance.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The ID of the instance or a fully qualified identifier for the instance.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Network configuration options. These are required when a private Data Fusion instance is to be created.
     * Structure is documented below.
     * 
     */
    @Import(name="networkConfig")
    private @Nullable Output<InstanceNetworkConfigArgs> networkConfig;

    /**
     * @return Network configuration options. These are required when a private Data Fusion instance is to be created.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InstanceNetworkConfigArgs>> networkConfig() {
        return Optional.ofNullable(this.networkConfig);
    }

    /**
     * Map of additional options used to configure the behavior of Data Fusion instance.
     * 
     */
    @Import(name="options")
    private @Nullable Output<Map<String,String>> options;

    /**
     * @return Map of additional options used to configure the behavior of Data Fusion instance.
     * 
     */
    public Optional<Output<Map<String,String>>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * Specifies whether the Data Fusion instance should be private. If set to
     * true, all Data Fusion nodes will have private IP addresses and will not be
     * able to access the public internet.
     * 
     */
    @Import(name="privateInstance")
    private @Nullable Output<Boolean> privateInstance;

    /**
     * @return Specifies whether the Data Fusion instance should be private. If set to
     * true, all Data Fusion nodes will have private IP addresses and will not be
     * able to access the public internet.
     * 
     */
    public Optional<Output<Boolean>> privateInstance() {
        return Optional.ofNullable(this.privateInstance);
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
     * The region of the Data Fusion instance.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region of the Data Fusion instance.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Deprecated. Use &#39;tenant_project_id&#39; instead to extract the tenant project ID.
     * 
     * @deprecated
     * Use `tenant_project_id` instead to extract the tenant project ID.
     * 
     */
    @Deprecated /* Use `tenant_project_id` instead to extract the tenant project ID. */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return Deprecated. Use &#39;tenant_project_id&#39; instead to extract the tenant project ID.
     * 
     * @deprecated
     * Use `tenant_project_id` instead to extract the tenant project ID.
     * 
     */
    @Deprecated /* Use `tenant_project_id` instead to extract the tenant project ID. */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Endpoint on which the Data Fusion UI and REST APIs are accessible.
     * 
     */
    @Import(name="serviceEndpoint")
    private @Nullable Output<String> serviceEndpoint;

    /**
     * @return Endpoint on which the Data Fusion UI and REST APIs are accessible.
     * 
     */
    public Optional<Output<String>> serviceEndpoint() {
        return Optional.ofNullable(this.serviceEndpoint);
    }

    /**
     * The current state of this Data Fusion instance. - CREATING: Instance is being created - RUNNING: Instance is running and
     * ready for requests - FAILED: Instance creation failed - DELETING: Instance is being deleted - UPGRADING: Instance is
     * being upgraded - RESTARTING: Instance is being restarted
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of this Data Fusion instance. - CREATING: Instance is being created - RUNNING: Instance is running and
     * ready for requests - FAILED: Instance creation failed - DELETING: Instance is being deleted - UPGRADING: Instance is
     * being upgraded - RESTARTING: Instance is being restarted
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Additional information about the current state of this Data Fusion instance if available.
     * 
     */
    @Import(name="stateMessage")
    private @Nullable Output<String> stateMessage;

    /**
     * @return Additional information about the current state of this Data Fusion instance if available.
     * 
     */
    public Optional<Output<String>> stateMessage() {
        return Optional.ofNullable(this.stateMessage);
    }

    /**
     * The name of the tenant project.
     * 
     */
    @Import(name="tenantProjectId")
    private @Nullable Output<String> tenantProjectId;

    /**
     * @return The name of the tenant project.
     * 
     */
    public Optional<Output<String>> tenantProjectId() {
        return Optional.ofNullable(this.tenantProjectId);
    }

    /**
     * Represents the type of Data Fusion instance. Each type is configured with
     * the default settings for processing and memory.
     * * BASIC: Basic Data Fusion instance. In Basic type, the user will be able to create data pipelines
     *   using point and click UI. However, there are certain limitations, such as fewer number
     *   of concurrent pipelines, no support for streaming pipelines, etc.
     * * ENTERPRISE: Enterprise Data Fusion instance. In Enterprise type, the user will have more features
     *   available, such as support for streaming pipelines, higher number of concurrent pipelines, etc.
     * * DEVELOPER: Developer Data Fusion instance. In Developer type, the user will have all features available but
     *   with restrictive capabilities. This is to help enterprises design and develop their data ingestion and integration
     *   pipelines at low cost.
     *   Possible values are `BASIC`, `ENTERPRISE`, and `DEVELOPER`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Represents the type of Data Fusion instance. Each type is configured with
     * the default settings for processing and memory.
     * * BASIC: Basic Data Fusion instance. In Basic type, the user will be able to create data pipelines
     *   using point and click UI. However, there are certain limitations, such as fewer number
     *   of concurrent pipelines, no support for streaming pipelines, etc.
     * * ENTERPRISE: Enterprise Data Fusion instance. In Enterprise type, the user will have more features
     *   available, such as support for streaming pipelines, higher number of concurrent pipelines, etc.
     * * DEVELOPER: Developer Data Fusion instance. In Developer type, the user will have all features available but
     *   with restrictive capabilities. This is to help enterprises design and develop their data ingestion and integration
     *   pipelines at low cost.
     *   Possible values are `BASIC`, `ENTERPRISE`, and `DEVELOPER`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The time the instance was last updated in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The time the instance was last updated in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    /**
     * Current version of the Data Fusion.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Current version of the Data Fusion.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private InstanceState() {}

    private InstanceState(InstanceState $) {
        this.createTime = $.createTime;
        this.dataprocServiceAccount = $.dataprocServiceAccount;
        this.description = $.description;
        this.enableStackdriverLogging = $.enableStackdriverLogging;
        this.enableStackdriverMonitoring = $.enableStackdriverMonitoring;
        this.gcsBucket = $.gcsBucket;
        this.labels = $.labels;
        this.name = $.name;
        this.networkConfig = $.networkConfig;
        this.options = $.options;
        this.privateInstance = $.privateInstance;
        this.project = $.project;
        this.region = $.region;
        this.serviceAccount = $.serviceAccount;
        this.serviceEndpoint = $.serviceEndpoint;
        this.state = $.state;
        this.stateMessage = $.stateMessage;
        this.tenantProjectId = $.tenantProjectId;
        this.type = $.type;
        this.updateTime = $.updateTime;
        this.version = $.version;
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
         * @param createTime The time the instance was created in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time the instance was created in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param dataprocServiceAccount User-managed service account to set on Dataproc when Cloud Data Fusion creates Dataproc to run data processing pipelines.
         * 
         * @return builder
         * 
         */
        public Builder dataprocServiceAccount(@Nullable Output<String> dataprocServiceAccount) {
            $.dataprocServiceAccount = dataprocServiceAccount;
            return this;
        }

        /**
         * @param dataprocServiceAccount User-managed service account to set on Dataproc when Cloud Data Fusion creates Dataproc to run data processing pipelines.
         * 
         * @return builder
         * 
         */
        public Builder dataprocServiceAccount(String dataprocServiceAccount) {
            return dataprocServiceAccount(Output.of(dataprocServiceAccount));
        }

        /**
         * @param description An optional description of the instance.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of the instance.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enableStackdriverLogging Option to enable Stackdriver Logging.
         * 
         * @return builder
         * 
         */
        public Builder enableStackdriverLogging(@Nullable Output<Boolean> enableStackdriverLogging) {
            $.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }

        /**
         * @param enableStackdriverLogging Option to enable Stackdriver Logging.
         * 
         * @return builder
         * 
         */
        public Builder enableStackdriverLogging(Boolean enableStackdriverLogging) {
            return enableStackdriverLogging(Output.of(enableStackdriverLogging));
        }

        /**
         * @param enableStackdriverMonitoring Option to enable Stackdriver Monitoring.
         * 
         * @return builder
         * 
         */
        public Builder enableStackdriverMonitoring(@Nullable Output<Boolean> enableStackdriverMonitoring) {
            $.enableStackdriverMonitoring = enableStackdriverMonitoring;
            return this;
        }

        /**
         * @param enableStackdriverMonitoring Option to enable Stackdriver Monitoring.
         * 
         * @return builder
         * 
         */
        public Builder enableStackdriverMonitoring(Boolean enableStackdriverMonitoring) {
            return enableStackdriverMonitoring(Output.of(enableStackdriverMonitoring));
        }

        /**
         * @param gcsBucket Cloud Storage bucket generated by Data Fusion in the customer project.
         * 
         * @return builder
         * 
         */
        public Builder gcsBucket(@Nullable Output<String> gcsBucket) {
            $.gcsBucket = gcsBucket;
            return this;
        }

        /**
         * @param gcsBucket Cloud Storage bucket generated by Data Fusion in the customer project.
         * 
         * @return builder
         * 
         */
        public Builder gcsBucket(String gcsBucket) {
            return gcsBucket(Output.of(gcsBucket));
        }

        /**
         * @param labels The resource labels for instance to use to annotate any related underlying resources,
         * such as Compute Engine VMs.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The resource labels for instance to use to annotate any related underlying resources,
         * such as Compute Engine VMs.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The ID of the instance or a fully qualified identifier for the instance.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The ID of the instance or a fully qualified identifier for the instance.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkConfig Network configuration options. These are required when a private Data Fusion instance is to be created.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(@Nullable Output<InstanceNetworkConfigArgs> networkConfig) {
            $.networkConfig = networkConfig;
            return this;
        }

        /**
         * @param networkConfig Network configuration options. These are required when a private Data Fusion instance is to be created.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(InstanceNetworkConfigArgs networkConfig) {
            return networkConfig(Output.of(networkConfig));
        }

        /**
         * @param options Map of additional options used to configure the behavior of Data Fusion instance.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<Map<String,String>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Map of additional options used to configure the behavior of Data Fusion instance.
         * 
         * @return builder
         * 
         */
        public Builder options(Map<String,String> options) {
            return options(Output.of(options));
        }

        /**
         * @param privateInstance Specifies whether the Data Fusion instance should be private. If set to
         * true, all Data Fusion nodes will have private IP addresses and will not be
         * able to access the public internet.
         * 
         * @return builder
         * 
         */
        public Builder privateInstance(@Nullable Output<Boolean> privateInstance) {
            $.privateInstance = privateInstance;
            return this;
        }

        /**
         * @param privateInstance Specifies whether the Data Fusion instance should be private. If set to
         * true, all Data Fusion nodes will have private IP addresses and will not be
         * able to access the public internet.
         * 
         * @return builder
         * 
         */
        public Builder privateInstance(Boolean privateInstance) {
            return privateInstance(Output.of(privateInstance));
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
         * @param region The region of the Data Fusion instance.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region of the Data Fusion instance.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param serviceAccount Deprecated. Use &#39;tenant_project_id&#39; instead to extract the tenant project ID.
         * 
         * @return builder
         * 
         * @deprecated
         * Use `tenant_project_id` instead to extract the tenant project ID.
         * 
         */
        @Deprecated /* Use `tenant_project_id` instead to extract the tenant project ID. */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount Deprecated. Use &#39;tenant_project_id&#39; instead to extract the tenant project ID.
         * 
         * @return builder
         * 
         * @deprecated
         * Use `tenant_project_id` instead to extract the tenant project ID.
         * 
         */
        @Deprecated /* Use `tenant_project_id` instead to extract the tenant project ID. */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param serviceEndpoint Endpoint on which the Data Fusion UI and REST APIs are accessible.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpoint(@Nullable Output<String> serviceEndpoint) {
            $.serviceEndpoint = serviceEndpoint;
            return this;
        }

        /**
         * @param serviceEndpoint Endpoint on which the Data Fusion UI and REST APIs are accessible.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpoint(String serviceEndpoint) {
            return serviceEndpoint(Output.of(serviceEndpoint));
        }

        /**
         * @param state The current state of this Data Fusion instance. - CREATING: Instance is being created - RUNNING: Instance is running and
         * ready for requests - FAILED: Instance creation failed - DELETING: Instance is being deleted - UPGRADING: Instance is
         * being upgraded - RESTARTING: Instance is being restarted
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of this Data Fusion instance. - CREATING: Instance is being created - RUNNING: Instance is running and
         * ready for requests - FAILED: Instance creation failed - DELETING: Instance is being deleted - UPGRADING: Instance is
         * being upgraded - RESTARTING: Instance is being restarted
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param stateMessage Additional information about the current state of this Data Fusion instance if available.
         * 
         * @return builder
         * 
         */
        public Builder stateMessage(@Nullable Output<String> stateMessage) {
            $.stateMessage = stateMessage;
            return this;
        }

        /**
         * @param stateMessage Additional information about the current state of this Data Fusion instance if available.
         * 
         * @return builder
         * 
         */
        public Builder stateMessage(String stateMessage) {
            return stateMessage(Output.of(stateMessage));
        }

        /**
         * @param tenantProjectId The name of the tenant project.
         * 
         * @return builder
         * 
         */
        public Builder tenantProjectId(@Nullable Output<String> tenantProjectId) {
            $.tenantProjectId = tenantProjectId;
            return this;
        }

        /**
         * @param tenantProjectId The name of the tenant project.
         * 
         * @return builder
         * 
         */
        public Builder tenantProjectId(String tenantProjectId) {
            return tenantProjectId(Output.of(tenantProjectId));
        }

        /**
         * @param type Represents the type of Data Fusion instance. Each type is configured with
         * the default settings for processing and memory.
         * * BASIC: Basic Data Fusion instance. In Basic type, the user will be able to create data pipelines
         *   using point and click UI. However, there are certain limitations, such as fewer number
         *   of concurrent pipelines, no support for streaming pipelines, etc.
         * * ENTERPRISE: Enterprise Data Fusion instance. In Enterprise type, the user will have more features
         *   available, such as support for streaming pipelines, higher number of concurrent pipelines, etc.
         * * DEVELOPER: Developer Data Fusion instance. In Developer type, the user will have all features available but
         *   with restrictive capabilities. This is to help enterprises design and develop their data ingestion and integration
         *   pipelines at low cost.
         *   Possible values are `BASIC`, `ENTERPRISE`, and `DEVELOPER`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Represents the type of Data Fusion instance. Each type is configured with
         * the default settings for processing and memory.
         * * BASIC: Basic Data Fusion instance. In Basic type, the user will be able to create data pipelines
         *   using point and click UI. However, there are certain limitations, such as fewer number
         *   of concurrent pipelines, no support for streaming pipelines, etc.
         * * ENTERPRISE: Enterprise Data Fusion instance. In Enterprise type, the user will have more features
         *   available, such as support for streaming pipelines, higher number of concurrent pipelines, etc.
         * * DEVELOPER: Developer Data Fusion instance. In Developer type, the user will have all features available but
         *   with restrictive capabilities. This is to help enterprises design and develop their data ingestion and integration
         *   pipelines at low cost.
         *   Possible values are `BASIC`, `ENTERPRISE`, and `DEVELOPER`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param updateTime The time the instance was last updated in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The time the instance was last updated in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        /**
         * @param version Current version of the Data Fusion.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Current version of the Data Fusion.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public InstanceState build() {
            return $;
        }
    }

}