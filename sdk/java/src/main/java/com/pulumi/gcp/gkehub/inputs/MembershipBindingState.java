// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkehub.inputs.MembershipBindingStateArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MembershipBindingState extends com.pulumi.resources.ResourceArgs {

    public static final MembershipBindingState Empty = new MembershipBindingState();

    /**
     * Time the MembershipBinding was created in UTC.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Time the MembershipBinding was created in UTC.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Time the MembershipBinding was deleted in UTC.
     * 
     */
    @Import(name="deleteTime")
    private @Nullable Output<String> deleteTime;

    /**
     * @return Time the MembershipBinding was deleted in UTC.
     * 
     */
    public Optional<Output<String>> deleteTime() {
        return Optional.ofNullable(this.deleteTime);
    }

    /**
     * Location of the membership
     * 
     * ***
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Location of the membership
     * 
     * ***
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The client-provided identifier of the membership binding.
     * 
     */
    @Import(name="membershipBindingId")
    private @Nullable Output<String> membershipBindingId;

    /**
     * @return The client-provided identifier of the membership binding.
     * 
     */
    public Optional<Output<String>> membershipBindingId() {
        return Optional.ofNullable(this.membershipBindingId);
    }

    /**
     * Id of the membership
     * 
     */
    @Import(name="membershipId")
    private @Nullable Output<String> membershipId;

    /**
     * @return Id of the membership
     * 
     */
    public Optional<Output<String>> membershipId() {
        return Optional.ofNullable(this.membershipId);
    }

    /**
     * The resource name for the membershipbinding itself
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name for the membershipbinding itself
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
     * A Workspace resource name in the format
     * `projects/*{@literal /}locations/*{@literal /}scopes/*`.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return A Workspace resource name in the format
     * `projects/*{@literal /}locations/*{@literal /}scopes/*`.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * State of the membership binding resource.
     * Structure is documented below.
     * 
     */
    @Import(name="states")
    private @Nullable Output<List<MembershipBindingStateArgs>> states;

    /**
     * @return State of the membership binding resource.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<MembershipBindingStateArgs>>> states() {
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
     * Time the MembershipBinding was updated in UTC.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Time the MembershipBinding was updated in UTC.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private MembershipBindingState() {}

    private MembershipBindingState(MembershipBindingState $) {
        this.createTime = $.createTime;
        this.deleteTime = $.deleteTime;
        this.location = $.location;
        this.membershipBindingId = $.membershipBindingId;
        this.membershipId = $.membershipId;
        this.name = $.name;
        this.project = $.project;
        this.scope = $.scope;
        this.states = $.states;
        this.uid = $.uid;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MembershipBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MembershipBindingState $;

        public Builder() {
            $ = new MembershipBindingState();
        }

        public Builder(MembershipBindingState defaults) {
            $ = new MembershipBindingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Time the MembershipBinding was created in UTC.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Time the MembershipBinding was created in UTC.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param deleteTime Time the MembershipBinding was deleted in UTC.
         * 
         * @return builder
         * 
         */
        public Builder deleteTime(@Nullable Output<String> deleteTime) {
            $.deleteTime = deleteTime;
            return this;
        }

        /**
         * @param deleteTime Time the MembershipBinding was deleted in UTC.
         * 
         * @return builder
         * 
         */
        public Builder deleteTime(String deleteTime) {
            return deleteTime(Output.of(deleteTime));
        }

        /**
         * @param location Location of the membership
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
         * @param location Location of the membership
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
         * @param membershipBindingId The client-provided identifier of the membership binding.
         * 
         * @return builder
         * 
         */
        public Builder membershipBindingId(@Nullable Output<String> membershipBindingId) {
            $.membershipBindingId = membershipBindingId;
            return this;
        }

        /**
         * @param membershipBindingId The client-provided identifier of the membership binding.
         * 
         * @return builder
         * 
         */
        public Builder membershipBindingId(String membershipBindingId) {
            return membershipBindingId(Output.of(membershipBindingId));
        }

        /**
         * @param membershipId Id of the membership
         * 
         * @return builder
         * 
         */
        public Builder membershipId(@Nullable Output<String> membershipId) {
            $.membershipId = membershipId;
            return this;
        }

        /**
         * @param membershipId Id of the membership
         * 
         * @return builder
         * 
         */
        public Builder membershipId(String membershipId) {
            return membershipId(Output.of(membershipId));
        }

        /**
         * @param name The resource name for the membershipbinding itself
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name for the membershipbinding itself
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
         * @param scope A Workspace resource name in the format
         * `projects/*{@literal /}locations/*{@literal /}scopes/*`.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope A Workspace resource name in the format
         * `projects/*{@literal /}locations/*{@literal /}scopes/*`.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param states State of the membership binding resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder states(@Nullable Output<List<MembershipBindingStateArgs>> states) {
            $.states = states;
            return this;
        }

        /**
         * @param states State of the membership binding resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder states(List<MembershipBindingStateArgs> states) {
            return states(Output.of(states));
        }

        /**
         * @param states State of the membership binding resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder states(MembershipBindingStateArgs... states) {
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
         * @param updateTime Time the MembershipBinding was updated in UTC.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Time the MembershipBinding was updated in UTC.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public MembershipBindingState build() {
            return $;
        }
    }

}