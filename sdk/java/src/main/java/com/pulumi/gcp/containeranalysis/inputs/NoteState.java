// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.containeranalysis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityArgs;
import com.pulumi.gcp.containeranalysis.inputs.NoteRelatedUrlArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NoteState extends com.pulumi.resources.ResourceArgs {

    public static final NoteState Empty = new NoteState();

    /**
     * Note kind that represents a logical attestation &#34;role&#34; or &#34;authority&#34;.
     * For example, an organization might have one AttestationAuthority for
     * &#34;QA&#34; and one for &#34;build&#34;. This Note is intended to act strictly as a
     * grouping mechanism for the attached Occurrences (Attestations). This
     * grouping mechanism also provides a security boundary, since IAM ACLs
     * gate the ability for a principle to attach an Occurrence to a given
     * Note. It also provides a single point of lookup to find all attached
     * Attestation Occurrences, even if they don&#39;t all live in the same
     * project.
     * Structure is documented below.
     * 
     */
    @Import(name="attestationAuthority")
    private @Nullable Output<NoteAttestationAuthorityArgs> attestationAuthority;

    /**
     * @return Note kind that represents a logical attestation &#34;role&#34; or &#34;authority&#34;.
     * For example, an organization might have one AttestationAuthority for
     * &#34;QA&#34; and one for &#34;build&#34;. This Note is intended to act strictly as a
     * grouping mechanism for the attached Occurrences (Attestations). This
     * grouping mechanism also provides a security boundary, since IAM ACLs
     * gate the ability for a principle to attach an Occurrence to a given
     * Note. It also provides a single point of lookup to find all attached
     * Attestation Occurrences, even if they don&#39;t all live in the same
     * project.
     * Structure is documented below.
     * 
     */
    public Optional<Output<NoteAttestationAuthorityArgs>> attestationAuthority() {
        return Optional.ofNullable(this.attestationAuthority);
    }

    /**
     * The time this note was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time this note was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Time of expiration for this note. Leave empty if note does not expire.
     * 
     */
    @Import(name="expirationTime")
    private @Nullable Output<String> expirationTime;

    /**
     * @return Time of expiration for this note. Leave empty if note does not expire.
     * 
     */
    public Optional<Output<String>> expirationTime() {
        return Optional.ofNullable(this.expirationTime);
    }

    /**
     * The type of analysis this note describes
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The type of analysis this note describes
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * A detailed description of the note
     * 
     */
    @Import(name="longDescription")
    private @Nullable Output<String> longDescription;

    /**
     * @return A detailed description of the note
     * 
     */
    public Optional<Output<String>> longDescription() {
        return Optional.ofNullable(this.longDescription);
    }

    /**
     * The name of the note.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the note.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Names of other notes related to this note.
     * 
     */
    @Import(name="relatedNoteNames")
    private @Nullable Output<List<String>> relatedNoteNames;

    /**
     * @return Names of other notes related to this note.
     * 
     */
    public Optional<Output<List<String>>> relatedNoteNames() {
        return Optional.ofNullable(this.relatedNoteNames);
    }

    /**
     * URLs associated with this note and related metadata.
     * 
     */
    @Import(name="relatedUrls")
    private @Nullable Output<List<NoteRelatedUrlArgs>> relatedUrls;

    /**
     * @return URLs associated with this note and related metadata.
     * 
     */
    public Optional<Output<List<NoteRelatedUrlArgs>>> relatedUrls() {
        return Optional.ofNullable(this.relatedUrls);
    }

    /**
     * A one sentence description of the note.
     * 
     */
    @Import(name="shortDescription")
    private @Nullable Output<String> shortDescription;

    /**
     * @return A one sentence description of the note.
     * 
     */
    public Optional<Output<String>> shortDescription() {
        return Optional.ofNullable(this.shortDescription);
    }

    /**
     * The time this note was last updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The time this note was last updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private NoteState() {}

    private NoteState(NoteState $) {
        this.attestationAuthority = $.attestationAuthority;
        this.createTime = $.createTime;
        this.expirationTime = $.expirationTime;
        this.kind = $.kind;
        this.longDescription = $.longDescription;
        this.name = $.name;
        this.project = $.project;
        this.relatedNoteNames = $.relatedNoteNames;
        this.relatedUrls = $.relatedUrls;
        this.shortDescription = $.shortDescription;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NoteState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NoteState $;

        public Builder() {
            $ = new NoteState();
        }

        public Builder(NoteState defaults) {
            $ = new NoteState(Objects.requireNonNull(defaults));
        }

        /**
         * @param attestationAuthority Note kind that represents a logical attestation &#34;role&#34; or &#34;authority&#34;.
         * For example, an organization might have one AttestationAuthority for
         * &#34;QA&#34; and one for &#34;build&#34;. This Note is intended to act strictly as a
         * grouping mechanism for the attached Occurrences (Attestations). This
         * grouping mechanism also provides a security boundary, since IAM ACLs
         * gate the ability for a principle to attach an Occurrence to a given
         * Note. It also provides a single point of lookup to find all attached
         * Attestation Occurrences, even if they don&#39;t all live in the same
         * project.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder attestationAuthority(@Nullable Output<NoteAttestationAuthorityArgs> attestationAuthority) {
            $.attestationAuthority = attestationAuthority;
            return this;
        }

        /**
         * @param attestationAuthority Note kind that represents a logical attestation &#34;role&#34; or &#34;authority&#34;.
         * For example, an organization might have one AttestationAuthority for
         * &#34;QA&#34; and one for &#34;build&#34;. This Note is intended to act strictly as a
         * grouping mechanism for the attached Occurrences (Attestations). This
         * grouping mechanism also provides a security boundary, since IAM ACLs
         * gate the ability for a principle to attach an Occurrence to a given
         * Note. It also provides a single point of lookup to find all attached
         * Attestation Occurrences, even if they don&#39;t all live in the same
         * project.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder attestationAuthority(NoteAttestationAuthorityArgs attestationAuthority) {
            return attestationAuthority(Output.of(attestationAuthority));
        }

        /**
         * @param createTime The time this note was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time this note was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param expirationTime Time of expiration for this note. Leave empty if note does not expire.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            $.expirationTime = expirationTime;
            return this;
        }

        /**
         * @param expirationTime Time of expiration for this note. Leave empty if note does not expire.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(String expirationTime) {
            return expirationTime(Output.of(expirationTime));
        }

        /**
         * @param kind The type of analysis this note describes
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The type of analysis this note describes
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param longDescription A detailed description of the note
         * 
         * @return builder
         * 
         */
        public Builder longDescription(@Nullable Output<String> longDescription) {
            $.longDescription = longDescription;
            return this;
        }

        /**
         * @param longDescription A detailed description of the note
         * 
         * @return builder
         * 
         */
        public Builder longDescription(String longDescription) {
            return longDescription(Output.of(longDescription));
        }

        /**
         * @param name The name of the note.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the note.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param relatedNoteNames Names of other notes related to this note.
         * 
         * @return builder
         * 
         */
        public Builder relatedNoteNames(@Nullable Output<List<String>> relatedNoteNames) {
            $.relatedNoteNames = relatedNoteNames;
            return this;
        }

        /**
         * @param relatedNoteNames Names of other notes related to this note.
         * 
         * @return builder
         * 
         */
        public Builder relatedNoteNames(List<String> relatedNoteNames) {
            return relatedNoteNames(Output.of(relatedNoteNames));
        }

        /**
         * @param relatedNoteNames Names of other notes related to this note.
         * 
         * @return builder
         * 
         */
        public Builder relatedNoteNames(String... relatedNoteNames) {
            return relatedNoteNames(List.of(relatedNoteNames));
        }

        /**
         * @param relatedUrls URLs associated with this note and related metadata.
         * 
         * @return builder
         * 
         */
        public Builder relatedUrls(@Nullable Output<List<NoteRelatedUrlArgs>> relatedUrls) {
            $.relatedUrls = relatedUrls;
            return this;
        }

        /**
         * @param relatedUrls URLs associated with this note and related metadata.
         * 
         * @return builder
         * 
         */
        public Builder relatedUrls(List<NoteRelatedUrlArgs> relatedUrls) {
            return relatedUrls(Output.of(relatedUrls));
        }

        /**
         * @param relatedUrls URLs associated with this note and related metadata.
         * 
         * @return builder
         * 
         */
        public Builder relatedUrls(NoteRelatedUrlArgs... relatedUrls) {
            return relatedUrls(List.of(relatedUrls));
        }

        /**
         * @param shortDescription A one sentence description of the note.
         * 
         * @return builder
         * 
         */
        public Builder shortDescription(@Nullable Output<String> shortDescription) {
            $.shortDescription = shortDescription;
            return this;
        }

        /**
         * @param shortDescription A one sentence description of the note.
         * 
         * @return builder
         * 
         */
        public Builder shortDescription(String shortDescription) {
            return shortDescription(Output.of(shortDescription));
        }

        /**
         * @param updateTime The time this note was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The time this note was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public NoteState build() {
            return $;
        }
    }

}
