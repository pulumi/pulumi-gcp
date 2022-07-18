// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.resourcemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LienState extends com.pulumi.resources.ResourceArgs {

    public static final LienState Empty = new LienState();

    /**
     * Time of creation
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Time of creation
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * A system-generated unique identifier for this Lien.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A system-generated unique identifier for this Lien.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A stable, user-visible/meaningful string identifying the origin
     * of the Lien, intended to be inspected programmatically. Maximum length of
     * 200 characters.
     * 
     */
    @Import(name="origin")
    private @Nullable Output<String> origin;

    /**
     * @return A stable, user-visible/meaningful string identifying the origin
     * of the Lien, intended to be inspected programmatically. Maximum length of
     * 200 characters.
     * 
     */
    public Optional<Output<String>> origin() {
        return Optional.ofNullable(this.origin);
    }

    /**
     * A reference to the resource this Lien is attached to.
     * The server will validate the parent against those for which Liens are supported.
     * Since a variety of objects can have Liens against them, you must provide the type
     * prefix (e.g. &#34;projects/my-project-name&#34;).
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return A reference to the resource this Lien is attached to.
     * The server will validate the parent against those for which Liens are supported.
     * Since a variety of objects can have Liens against them, you must provide the type
     * prefix (e.g. &#34;projects/my-project-name&#34;).
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    /**
     * Concise user-visible strings indicating why an action cannot be performed
     * on a resource. Maximum length of 200 characters.
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return Concise user-visible strings indicating why an action cannot be performed
     * on a resource. Maximum length of 200 characters.
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    /**
     * The types of operations which should be blocked as a result of this Lien.
     * Each value should correspond to an IAM permission. The server will validate
     * the permissions against those for which Liens are supported.  An empty
     * list is meaningless and will be rejected.
     * e.g. [&#39;resourcemanager.projects.delete&#39;]
     * 
     */
    @Import(name="restrictions")
    private @Nullable Output<List<String>> restrictions;

    /**
     * @return The types of operations which should be blocked as a result of this Lien.
     * Each value should correspond to an IAM permission. The server will validate
     * the permissions against those for which Liens are supported.  An empty
     * list is meaningless and will be rejected.
     * e.g. [&#39;resourcemanager.projects.delete&#39;]
     * 
     */
    public Optional<Output<List<String>>> restrictions() {
        return Optional.ofNullable(this.restrictions);
    }

    private LienState() {}

    private LienState(LienState $) {
        this.createTime = $.createTime;
        this.name = $.name;
        this.origin = $.origin;
        this.parent = $.parent;
        this.reason = $.reason;
        this.restrictions = $.restrictions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LienState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LienState $;

        public Builder() {
            $ = new LienState();
        }

        public Builder(LienState defaults) {
            $ = new LienState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Time of creation
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Time of creation
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param name A system-generated unique identifier for this Lien.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A system-generated unique identifier for this Lien.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param origin A stable, user-visible/meaningful string identifying the origin
         * of the Lien, intended to be inspected programmatically. Maximum length of
         * 200 characters.
         * 
         * @return builder
         * 
         */
        public Builder origin(@Nullable Output<String> origin) {
            $.origin = origin;
            return this;
        }

        /**
         * @param origin A stable, user-visible/meaningful string identifying the origin
         * of the Lien, intended to be inspected programmatically. Maximum length of
         * 200 characters.
         * 
         * @return builder
         * 
         */
        public Builder origin(String origin) {
            return origin(Output.of(origin));
        }

        /**
         * @param parent A reference to the resource this Lien is attached to.
         * The server will validate the parent against those for which Liens are supported.
         * Since a variety of objects can have Liens against them, you must provide the type
         * prefix (e.g. &#34;projects/my-project-name&#34;).
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent A reference to the resource this Lien is attached to.
         * The server will validate the parent against those for which Liens are supported.
         * Since a variety of objects can have Liens against them, you must provide the type
         * prefix (e.g. &#34;projects/my-project-name&#34;).
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param reason Concise user-visible strings indicating why an action cannot be performed
         * on a resource. Maximum length of 200 characters.
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason Concise user-visible strings indicating why an action cannot be performed
         * on a resource. Maximum length of 200 characters.
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        /**
         * @param restrictions The types of operations which should be blocked as a result of this Lien.
         * Each value should correspond to an IAM permission. The server will validate
         * the permissions against those for which Liens are supported.  An empty
         * list is meaningless and will be rejected.
         * e.g. [&#39;resourcemanager.projects.delete&#39;]
         * 
         * @return builder
         * 
         */
        public Builder restrictions(@Nullable Output<List<String>> restrictions) {
            $.restrictions = restrictions;
            return this;
        }

        /**
         * @param restrictions The types of operations which should be blocked as a result of this Lien.
         * Each value should correspond to an IAM permission. The server will validate
         * the permissions against those for which Liens are supported.  An empty
         * list is meaningless and will be rejected.
         * e.g. [&#39;resourcemanager.projects.delete&#39;]
         * 
         * @return builder
         * 
         */
        public Builder restrictions(List<String> restrictions) {
            return restrictions(Output.of(restrictions));
        }

        /**
         * @param restrictions The types of operations which should be blocked as a result of this Lien.
         * Each value should correspond to an IAM permission. The server will validate
         * the permissions against those for which Liens are supported.  An empty
         * list is meaningless and will be rejected.
         * e.g. [&#39;resourcemanager.projects.delete&#39;]
         * 
         * @return builder
         * 
         */
        public Builder restrictions(String... restrictions) {
            return restrictions(List.of(restrictions));
        }

        public LienState build() {
            return $;
        }
    }

}