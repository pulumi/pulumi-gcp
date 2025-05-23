// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.binaryauthorization.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNotePublicKeyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AttestorAttestationAuthorityNoteArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttestorAttestationAuthorityNoteArgs Empty = new AttestorAttestationAuthorityNoteArgs();

    /**
     * (Output)
     * This field will contain the service account email address that
     * this Attestor will use as the principal when querying Container
     * Analysis. Attestor administrators must grant this service account
     * the IAM role needed to read attestations from the noteReference in
     * Container Analysis (containeranalysis.notes.occurrences.viewer).
     * This email address is fixed for the lifetime of the Attestor, but
     * callers should not make any other assumptions about the service
     * account email; future versions may use an email based on a
     * different naming pattern.
     * 
     */
    @Import(name="delegationServiceAccountEmail")
    private @Nullable Output<String> delegationServiceAccountEmail;

    /**
     * @return (Output)
     * This field will contain the service account email address that
     * this Attestor will use as the principal when querying Container
     * Analysis. Attestor administrators must grant this service account
     * the IAM role needed to read attestations from the noteReference in
     * Container Analysis (containeranalysis.notes.occurrences.viewer).
     * This email address is fixed for the lifetime of the Attestor, but
     * callers should not make any other assumptions about the service
     * account email; future versions may use an email based on a
     * different naming pattern.
     * 
     */
    public Optional<Output<String>> delegationServiceAccountEmail() {
        return Optional.ofNullable(this.delegationServiceAccountEmail);
    }

    /**
     * The resource name of a ATTESTATION_AUTHORITY Note, created by the
     * user. If the Note is in a different project from the Attestor, it
     * should be specified in the format `projects/*&#47;notes/*` (or the legacy
     * `providers/*&#47;notes/*`). This field may not be updated.
     * An attestation by this attestor is stored as a Container Analysis
     * ATTESTATION_AUTHORITY Occurrence that names a container image
     * and that links to this Note.
     * 
     */
    @Import(name="noteReference", required=true)
    private Output<String> noteReference;

    /**
     * @return The resource name of a ATTESTATION_AUTHORITY Note, created by the
     * user. If the Note is in a different project from the Attestor, it
     * should be specified in the format `projects/*&#47;notes/*` (or the legacy
     * `providers/*&#47;notes/*`). This field may not be updated.
     * An attestation by this attestor is stored as a Container Analysis
     * ATTESTATION_AUTHORITY Occurrence that names a container image
     * and that links to this Note.
     * 
     */
    public Output<String> noteReference() {
        return this.noteReference;
    }

    /**
     * Public keys that verify attestations signed by this attestor. This
     * field may be updated.
     * If this field is non-empty, one of the specified public keys must
     * verify that an attestation was signed by this attestor for the
     * image specified in the admission request.
     * If this field is empty, this attestor always returns that no valid
     * attestations exist.
     * Structure is documented below.
     * 
     */
    @Import(name="publicKeys")
    private @Nullable Output<List<AttestorAttestationAuthorityNotePublicKeyArgs>> publicKeys;

    /**
     * @return Public keys that verify attestations signed by this attestor. This
     * field may be updated.
     * If this field is non-empty, one of the specified public keys must
     * verify that an attestation was signed by this attestor for the
     * image specified in the admission request.
     * If this field is empty, this attestor always returns that no valid
     * attestations exist.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<AttestorAttestationAuthorityNotePublicKeyArgs>>> publicKeys() {
        return Optional.ofNullable(this.publicKeys);
    }

    private AttestorAttestationAuthorityNoteArgs() {}

    private AttestorAttestationAuthorityNoteArgs(AttestorAttestationAuthorityNoteArgs $) {
        this.delegationServiceAccountEmail = $.delegationServiceAccountEmail;
        this.noteReference = $.noteReference;
        this.publicKeys = $.publicKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttestorAttestationAuthorityNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttestorAttestationAuthorityNoteArgs $;

        public Builder() {
            $ = new AttestorAttestationAuthorityNoteArgs();
        }

        public Builder(AttestorAttestationAuthorityNoteArgs defaults) {
            $ = new AttestorAttestationAuthorityNoteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param delegationServiceAccountEmail (Output)
         * This field will contain the service account email address that
         * this Attestor will use as the principal when querying Container
         * Analysis. Attestor administrators must grant this service account
         * the IAM role needed to read attestations from the noteReference in
         * Container Analysis (containeranalysis.notes.occurrences.viewer).
         * This email address is fixed for the lifetime of the Attestor, but
         * callers should not make any other assumptions about the service
         * account email; future versions may use an email based on a
         * different naming pattern.
         * 
         * @return builder
         * 
         */
        public Builder delegationServiceAccountEmail(@Nullable Output<String> delegationServiceAccountEmail) {
            $.delegationServiceAccountEmail = delegationServiceAccountEmail;
            return this;
        }

        /**
         * @param delegationServiceAccountEmail (Output)
         * This field will contain the service account email address that
         * this Attestor will use as the principal when querying Container
         * Analysis. Attestor administrators must grant this service account
         * the IAM role needed to read attestations from the noteReference in
         * Container Analysis (containeranalysis.notes.occurrences.viewer).
         * This email address is fixed for the lifetime of the Attestor, but
         * callers should not make any other assumptions about the service
         * account email; future versions may use an email based on a
         * different naming pattern.
         * 
         * @return builder
         * 
         */
        public Builder delegationServiceAccountEmail(String delegationServiceAccountEmail) {
            return delegationServiceAccountEmail(Output.of(delegationServiceAccountEmail));
        }

        /**
         * @param noteReference The resource name of a ATTESTATION_AUTHORITY Note, created by the
         * user. If the Note is in a different project from the Attestor, it
         * should be specified in the format `projects/*&#47;notes/*` (or the legacy
         * `providers/*&#47;notes/*`). This field may not be updated.
         * An attestation by this attestor is stored as a Container Analysis
         * ATTESTATION_AUTHORITY Occurrence that names a container image
         * and that links to this Note.
         * 
         * @return builder
         * 
         */
        public Builder noteReference(Output<String> noteReference) {
            $.noteReference = noteReference;
            return this;
        }

        /**
         * @param noteReference The resource name of a ATTESTATION_AUTHORITY Note, created by the
         * user. If the Note is in a different project from the Attestor, it
         * should be specified in the format `projects/*&#47;notes/*` (or the legacy
         * `providers/*&#47;notes/*`). This field may not be updated.
         * An attestation by this attestor is stored as a Container Analysis
         * ATTESTATION_AUTHORITY Occurrence that names a container image
         * and that links to this Note.
         * 
         * @return builder
         * 
         */
        public Builder noteReference(String noteReference) {
            return noteReference(Output.of(noteReference));
        }

        /**
         * @param publicKeys Public keys that verify attestations signed by this attestor. This
         * field may be updated.
         * If this field is non-empty, one of the specified public keys must
         * verify that an attestation was signed by this attestor for the
         * image specified in the admission request.
         * If this field is empty, this attestor always returns that no valid
         * attestations exist.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder publicKeys(@Nullable Output<List<AttestorAttestationAuthorityNotePublicKeyArgs>> publicKeys) {
            $.publicKeys = publicKeys;
            return this;
        }

        /**
         * @param publicKeys Public keys that verify attestations signed by this attestor. This
         * field may be updated.
         * If this field is non-empty, one of the specified public keys must
         * verify that an attestation was signed by this attestor for the
         * image specified in the admission request.
         * If this field is empty, this attestor always returns that no valid
         * attestations exist.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder publicKeys(List<AttestorAttestationAuthorityNotePublicKeyArgs> publicKeys) {
            return publicKeys(Output.of(publicKeys));
        }

        /**
         * @param publicKeys Public keys that verify attestations signed by this attestor. This
         * field may be updated.
         * If this field is non-empty, one of the specified public keys must
         * verify that an attestation was signed by this attestor for the
         * image specified in the admission request.
         * If this field is empty, this attestor always returns that no valid
         * attestations exist.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder publicKeys(AttestorAttestationAuthorityNotePublicKeyArgs... publicKeys) {
            return publicKeys(List.of(publicKeys));
        }

        public AttestorAttestationAuthorityNoteArgs build() {
            if ($.noteReference == null) {
                throw new MissingRequiredPropertyException("AttestorAttestationAuthorityNoteArgs", "noteReference");
            }
            return $;
        }
    }

}
