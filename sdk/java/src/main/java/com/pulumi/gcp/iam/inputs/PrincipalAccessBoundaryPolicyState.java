// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyDetailsArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrincipalAccessBoundaryPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final PrincipalAccessBoundaryPolicyState Empty = new PrincipalAccessBoundaryPolicyState();

    /**
     * User defined annotations. See https://google.aip.dev/148#annotations
     * for more details such as format and size limitations
     * 
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return User defined annotations. See https://google.aip.dev/148#annotations
     * for more details such as format and size limitations
     * 
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Output only. The time when the principal access boundary policy was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Output only. The time when the principal access boundary policy was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Principal access boundary policy details
     * Structure is documented below.
     * 
     */
    @Import(name="details")
    private @Nullable Output<PrincipalAccessBoundaryPolicyDetailsArgs> details;

    /**
     * @return Principal access boundary policy details
     * Structure is documented below.
     * 
     */
    public Optional<Output<PrincipalAccessBoundaryPolicyDetailsArgs>> details() {
        return Optional.ofNullable(this.details);
    }

    /**
     * The description of the principal access boundary policy. Must be less than or equal to 63 characters.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The description of the principal access boundary policy. Must be less than or equal to 63 characters.
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
     * The etag for the principal access boundary. If this is provided on update, it must match the server&#39;s etag.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return The etag for the principal access boundary. If this is provided on update, it must match the server&#39;s etag.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The location the principal access boundary policy is in.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location the principal access boundary policy is in.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Identifier. The resource name of the principal access boundary policy.  The following format is supported:
     * `organizations/{organization_id}/locations/{location}/principalAccessBoundaryPolicies/{policy_id}`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Identifier. The resource name of the principal access boundary policy.  The following format is supported:
     * `organizations/{organization_id}/locations/{location}/principalAccessBoundaryPolicies/{policy_id}`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The parent organization of the principal access boundary policy.
     * 
     */
    @Import(name="organization")
    private @Nullable Output<String> organization;

    /**
     * @return The parent organization of the principal access boundary policy.
     * 
     */
    public Optional<Output<String>> organization() {
        return Optional.ofNullable(this.organization);
    }

    /**
     * The ID to use to create the principal access boundary policy.
     * This value must start with a lowercase letter followed by up to 62 lowercase letters, numbers, hyphens, or dots. Pattern, /a-z{2,62}/.
     * 
     */
    @Import(name="principalAccessBoundaryPolicyId")
    private @Nullable Output<String> principalAccessBoundaryPolicyId;

    /**
     * @return The ID to use to create the principal access boundary policy.
     * This value must start with a lowercase letter followed by up to 62 lowercase letters, numbers, hyphens, or dots. Pattern, /a-z{2,62}/.
     * 
     */
    public Optional<Output<String>> principalAccessBoundaryPolicyId() {
        return Optional.ofNullable(this.principalAccessBoundaryPolicyId);
    }

    /**
     * Output only. The globally unique ID of the principal access boundary policy.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return Output only. The globally unique ID of the principal access boundary policy.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    /**
     * Output only. The time when the principal access boundary policy was most recently updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Output only. The time when the principal access boundary policy was most recently updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private PrincipalAccessBoundaryPolicyState() {}

    private PrincipalAccessBoundaryPolicyState(PrincipalAccessBoundaryPolicyState $) {
        this.annotations = $.annotations;
        this.createTime = $.createTime;
        this.details = $.details;
        this.displayName = $.displayName;
        this.effectiveAnnotations = $.effectiveAnnotations;
        this.etag = $.etag;
        this.location = $.location;
        this.name = $.name;
        this.organization = $.organization;
        this.principalAccessBoundaryPolicyId = $.principalAccessBoundaryPolicyId;
        this.uid = $.uid;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrincipalAccessBoundaryPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrincipalAccessBoundaryPolicyState $;

        public Builder() {
            $ = new PrincipalAccessBoundaryPolicyState();
        }

        public Builder(PrincipalAccessBoundaryPolicyState defaults) {
            $ = new PrincipalAccessBoundaryPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations User defined annotations. See https://google.aip.dev/148#annotations
         * for more details such as format and size limitations
         * 
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
         * @param annotations User defined annotations. See https://google.aip.dev/148#annotations
         * for more details such as format and size limitations
         * 
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
         * @param createTime Output only. The time when the principal access boundary policy was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Output only. The time when the principal access boundary policy was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param details Principal access boundary policy details
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder details(@Nullable Output<PrincipalAccessBoundaryPolicyDetailsArgs> details) {
            $.details = details;
            return this;
        }

        /**
         * @param details Principal access boundary policy details
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder details(PrincipalAccessBoundaryPolicyDetailsArgs details) {
            return details(Output.of(details));
        }

        /**
         * @param displayName The description of the principal access boundary policy. Must be less than or equal to 63 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The description of the principal access boundary policy. Must be less than or equal to 63 characters.
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
         * @param etag The etag for the principal access boundary. If this is provided on update, it must match the server&#39;s etag.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag The etag for the principal access boundary. If this is provided on update, it must match the server&#39;s etag.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param location The location the principal access boundary policy is in.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location the principal access boundary policy is in.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Identifier. The resource name of the principal access boundary policy.  The following format is supported:
         * `organizations/{organization_id}/locations/{location}/principalAccessBoundaryPolicies/{policy_id}`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Identifier. The resource name of the principal access boundary policy.  The following format is supported:
         * `organizations/{organization_id}/locations/{location}/principalAccessBoundaryPolicies/{policy_id}`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organization The parent organization of the principal access boundary policy.
         * 
         * @return builder
         * 
         */
        public Builder organization(@Nullable Output<String> organization) {
            $.organization = organization;
            return this;
        }

        /**
         * @param organization The parent organization of the principal access boundary policy.
         * 
         * @return builder
         * 
         */
        public Builder organization(String organization) {
            return organization(Output.of(organization));
        }

        /**
         * @param principalAccessBoundaryPolicyId The ID to use to create the principal access boundary policy.
         * This value must start with a lowercase letter followed by up to 62 lowercase letters, numbers, hyphens, or dots. Pattern, /a-z{2,62}/.
         * 
         * @return builder
         * 
         */
        public Builder principalAccessBoundaryPolicyId(@Nullable Output<String> principalAccessBoundaryPolicyId) {
            $.principalAccessBoundaryPolicyId = principalAccessBoundaryPolicyId;
            return this;
        }

        /**
         * @param principalAccessBoundaryPolicyId The ID to use to create the principal access boundary policy.
         * This value must start with a lowercase letter followed by up to 62 lowercase letters, numbers, hyphens, or dots. Pattern, /a-z{2,62}/.
         * 
         * @return builder
         * 
         */
        public Builder principalAccessBoundaryPolicyId(String principalAccessBoundaryPolicyId) {
            return principalAccessBoundaryPolicyId(Output.of(principalAccessBoundaryPolicyId));
        }

        /**
         * @param uid Output only. The globally unique ID of the principal access boundary policy.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid Output only. The globally unique ID of the principal access boundary policy.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        /**
         * @param updateTime Output only. The time when the principal access boundary policy was most recently updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Output only. The time when the principal access boundary policy was most recently updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public PrincipalAccessBoundaryPolicyState build() {
            return $;
        }
    }

}
