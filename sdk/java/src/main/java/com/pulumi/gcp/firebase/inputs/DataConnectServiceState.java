// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataConnectServiceState extends com.pulumi.resources.ResourceArgs {

    public static final DataConnectServiceState Empty = new DataConnectServiceState();

    /**
     * Optional. Stores small amounts of arbitrary data.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Optional. Stores small amounts of arbitrary data.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Output only. [Output only] Create time stamp.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Output only. [Output only] Create time stamp.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The deletion policy for the database. Setting the field to FORCE allows the
     * Service to be deleted even if a Schema or Connector is present. By default,
     * the Service deletion will only succeed when no Schema or Connectors are
     * present.
     * Possible values: DEFAULT, FORCE
     * 
     */
    @Import(name="deletionPolicy")
    private @Nullable Output<String> deletionPolicy;

    /**
     * @return The deletion policy for the database. Setting the field to FORCE allows the
     * Service to be deleted even if a Schema or Connector is present. By default,
     * the Service deletion will only succeed when no Schema or Connectors are
     * present.
     * Possible values: DEFAULT, FORCE
     * 
     */
    public Optional<Output<String>> deletionPolicy() {
        return Optional.ofNullable(this.deletionPolicy);
    }

    /**
     * Optional. Mutable human-readable name. 63 character limit.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Optional. Mutable human-readable name. 63 character limit.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="effectiveAnnotations")
    private @Nullable Output<Map<String,String>> effectiveAnnotations;

    public Optional<Output<Map<String,String>>> effectiveAnnotations() {
        return Optional.ofNullable(this.effectiveAnnotations);
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
     * Output only. This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     * [AIP-154](https://google.aip.dev/154)
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return Output only. This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     * [AIP-154](https://google.aip.dev/154)
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Optional. Labels as key value pairs.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Labels as key value pairs.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The region in which the service resides, e.g. &#34;us-central1&#34; or &#34;asia-east1&#34;.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The region in which the service resides, e.g. &#34;us-central1&#34; or &#34;asia-east1&#34;.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Identifier. The relative resource name of the Firebase Data Connect service, in the
     * format:
     * 
     * Note that the service ID is specific to Firebase Data Connect and does not
     * correspond to any of the instance IDs of the underlying data source
     * connections.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Identifier. The relative resource name of the Firebase Data Connect service, in the
     * format:
     * 
     * Note that the service ID is specific to Firebase Data Connect and does not
     * correspond to any of the instance IDs of the underlying data source
     * connections.
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
     * Output only. A field that if true, indicates that the system is working update the
     * service.
     * 
     */
    @Import(name="reconciling")
    private @Nullable Output<Boolean> reconciling;

    /**
     * @return Output only. A field that if true, indicates that the system is working update the
     * service.
     * 
     */
    public Optional<Output<Boolean>> reconciling() {
        return Optional.ofNullable(this.reconciling);
    }

    /**
     * Required. The ID to use for the service, which will become the final component of the
     * service&#39;s resource name.
     * 
     */
    @Import(name="serviceId")
    private @Nullable Output<String> serviceId;

    /**
     * @return Required. The ID to use for the service, which will become the final component of the
     * service&#39;s resource name.
     * 
     */
    public Optional<Output<String>> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }

    /**
     * Output only. System-assigned, unique identifier.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return Output only. System-assigned, unique identifier.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    /**
     * Output only. [Output only] Update time stamp.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Output only. [Output only] Update time stamp.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private DataConnectServiceState() {}

    private DataConnectServiceState(DataConnectServiceState $) {
        this.annotations = $.annotations;
        this.createTime = $.createTime;
        this.deletionPolicy = $.deletionPolicy;
        this.displayName = $.displayName;
        this.effectiveAnnotations = $.effectiveAnnotations;
        this.effectiveLabels = $.effectiveLabels;
        this.etag = $.etag;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.pulumiLabels = $.pulumiLabels;
        this.reconciling = $.reconciling;
        this.serviceId = $.serviceId;
        this.uid = $.uid;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataConnectServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataConnectServiceState $;

        public Builder() {
            $ = new DataConnectServiceState();
        }

        public Builder(DataConnectServiceState defaults) {
            $ = new DataConnectServiceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Optional. Stores small amounts of arbitrary data.
         * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
         * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Optional. Stores small amounts of arbitrary data.
         * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
         * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param createTime Output only. [Output only] Create time stamp.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Output only. [Output only] Create time stamp.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param deletionPolicy The deletion policy for the database. Setting the field to FORCE allows the
         * Service to be deleted even if a Schema or Connector is present. By default,
         * the Service deletion will only succeed when no Schema or Connectors are
         * present.
         * Possible values: DEFAULT, FORCE
         * 
         * @return builder
         * 
         */
        public Builder deletionPolicy(@Nullable Output<String> deletionPolicy) {
            $.deletionPolicy = deletionPolicy;
            return this;
        }

        /**
         * @param deletionPolicy The deletion policy for the database. Setting the field to FORCE allows the
         * Service to be deleted even if a Schema or Connector is present. By default,
         * the Service deletion will only succeed when no Schema or Connectors are
         * present.
         * Possible values: DEFAULT, FORCE
         * 
         * @return builder
         * 
         */
        public Builder deletionPolicy(String deletionPolicy) {
            return deletionPolicy(Output.of(deletionPolicy));
        }

        /**
         * @param displayName Optional. Mutable human-readable name. 63 character limit.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Optional. Mutable human-readable name. 63 character limit.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder effectiveAnnotations(@Nullable Output<Map<String,String>> effectiveAnnotations) {
            $.effectiveAnnotations = effectiveAnnotations;
            return this;
        }

        public Builder effectiveAnnotations(Map<String,String> effectiveAnnotations) {
            return effectiveAnnotations(Output.of(effectiveAnnotations));
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
         * @param etag Output only. This checksum is computed by the server based on the value of other
         * fields, and may be sent on update and delete requests to ensure the
         * client has an up-to-date value before proceeding.
         * [AIP-154](https://google.aip.dev/154)
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag Output only. This checksum is computed by the server based on the value of other
         * fields, and may be sent on update and delete requests to ensure the
         * client has an up-to-date value before proceeding.
         * [AIP-154](https://google.aip.dev/154)
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param labels Optional. Labels as key value pairs.
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
         * @param labels Optional. Labels as key value pairs.
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
         * @param location The region in which the service resides, e.g. &#34;us-central1&#34; or &#34;asia-east1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The region in which the service resides, e.g. &#34;us-central1&#34; or &#34;asia-east1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Identifier. The relative resource name of the Firebase Data Connect service, in the
         * format:
         * 
         * Note that the service ID is specific to Firebase Data Connect and does not
         * correspond to any of the instance IDs of the underlying data source
         * connections.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Identifier. The relative resource name of the Firebase Data Connect service, in the
         * format:
         * 
         * Note that the service ID is specific to Firebase Data Connect and does not
         * correspond to any of the instance IDs of the underlying data source
         * connections.
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
         * @param reconciling Output only. A field that if true, indicates that the system is working update the
         * service.
         * 
         * @return builder
         * 
         */
        public Builder reconciling(@Nullable Output<Boolean> reconciling) {
            $.reconciling = reconciling;
            return this;
        }

        /**
         * @param reconciling Output only. A field that if true, indicates that the system is working update the
         * service.
         * 
         * @return builder
         * 
         */
        public Builder reconciling(Boolean reconciling) {
            return reconciling(Output.of(reconciling));
        }

        /**
         * @param serviceId Required. The ID to use for the service, which will become the final component of the
         * service&#39;s resource name.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(@Nullable Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId Required. The ID to use for the service, which will become the final component of the
         * service&#39;s resource name.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        /**
         * @param uid Output only. System-assigned, unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid Output only. System-assigned, unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        /**
         * @param updateTime Output only. [Output only] Update time stamp.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Output only. [Output only] Update time stamp.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public DataConnectServiceState build() {
            return $;
        }
    }

}
