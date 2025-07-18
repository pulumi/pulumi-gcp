// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.containeranalysis;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OccurenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final OccurenceArgs Empty = new OccurenceArgs();

    /**
     * Occurrence that represents a single &#34;attestation&#34;. The authenticity
     * of an attestation can be verified using the attached signature.
     * If the verifier trusts the public key of the signer, then verifying
     * the signature is sufficient to establish trust. In this circumstance,
     * the authority to which this attestation is attached is primarily
     * useful for lookup (how to find this attestation if you already
     * know the authority and artifact to be verified) and intent (for
     * which authority this attestation was intended to sign.
     * Structure is documented below.
     * 
     */
    @Import(name="attestation", required=true)
    private Output<OccurenceAttestationArgs> attestation;

    /**
     * @return Occurrence that represents a single &#34;attestation&#34;. The authenticity
     * of an attestation can be verified using the attached signature.
     * If the verifier trusts the public key of the signer, then verifying
     * the signature is sufficient to establish trust. In this circumstance,
     * the authority to which this attestation is attached is primarily
     * useful for lookup (how to find this attestation if you already
     * know the authority and artifact to be verified) and intent (for
     * which authority this attestation was intended to sign.
     * Structure is documented below.
     * 
     */
    public Output<OccurenceAttestationArgs> attestation() {
        return this.attestation;
    }

    /**
     * The analysis note associated with this occurrence, in the form of
     * projects/[PROJECT]/notes/[NOTE_ID]. This field can be used as a
     * filter in list requests.
     * 
     */
    @Import(name="noteName", required=true)
    private Output<String> noteName;

    /**
     * @return The analysis note associated with this occurrence, in the form of
     * projects/[PROJECT]/notes/[NOTE_ID]. This field can be used as a
     * filter in list requests.
     * 
     */
    public Output<String> noteName() {
        return this.noteName;
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
     * A description of actions that can be taken to remedy the note.
     * 
     */
    @Import(name="remediation")
    private @Nullable Output<String> remediation;

    /**
     * @return A description of actions that can be taken to remedy the note.
     * 
     */
    public Optional<Output<String>> remediation() {
        return Optional.ofNullable(this.remediation);
    }

    /**
     * Required. Immutable. A URI that represents the resource for which
     * the occurrence applies. For example,
     * https://gcr.io/project/image{@literal @}sha256:123abc for a Docker image.
     * 
     */
    @Import(name="resourceUri", required=true)
    private Output<String> resourceUri;

    /**
     * @return Required. Immutable. A URI that represents the resource for which
     * the occurrence applies. For example,
     * https://gcr.io/project/image{@literal @}sha256:123abc for a Docker image.
     * 
     */
    public Output<String> resourceUri() {
        return this.resourceUri;
    }

    private OccurenceArgs() {}

    private OccurenceArgs(OccurenceArgs $) {
        this.attestation = $.attestation;
        this.noteName = $.noteName;
        this.project = $.project;
        this.remediation = $.remediation;
        this.resourceUri = $.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OccurenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OccurenceArgs $;

        public Builder() {
            $ = new OccurenceArgs();
        }

        public Builder(OccurenceArgs defaults) {
            $ = new OccurenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attestation Occurrence that represents a single &#34;attestation&#34;. The authenticity
         * of an attestation can be verified using the attached signature.
         * If the verifier trusts the public key of the signer, then verifying
         * the signature is sufficient to establish trust. In this circumstance,
         * the authority to which this attestation is attached is primarily
         * useful for lookup (how to find this attestation if you already
         * know the authority and artifact to be verified) and intent (for
         * which authority this attestation was intended to sign.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder attestation(Output<OccurenceAttestationArgs> attestation) {
            $.attestation = attestation;
            return this;
        }

        /**
         * @param attestation Occurrence that represents a single &#34;attestation&#34;. The authenticity
         * of an attestation can be verified using the attached signature.
         * If the verifier trusts the public key of the signer, then verifying
         * the signature is sufficient to establish trust. In this circumstance,
         * the authority to which this attestation is attached is primarily
         * useful for lookup (how to find this attestation if you already
         * know the authority and artifact to be verified) and intent (for
         * which authority this attestation was intended to sign.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder attestation(OccurenceAttestationArgs attestation) {
            return attestation(Output.of(attestation));
        }

        /**
         * @param noteName The analysis note associated with this occurrence, in the form of
         * projects/[PROJECT]/notes/[NOTE_ID]. This field can be used as a
         * filter in list requests.
         * 
         * @return builder
         * 
         */
        public Builder noteName(Output<String> noteName) {
            $.noteName = noteName;
            return this;
        }

        /**
         * @param noteName The analysis note associated with this occurrence, in the form of
         * projects/[PROJECT]/notes/[NOTE_ID]. This field can be used as a
         * filter in list requests.
         * 
         * @return builder
         * 
         */
        public Builder noteName(String noteName) {
            return noteName(Output.of(noteName));
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
         * @param remediation A description of actions that can be taken to remedy the note.
         * 
         * @return builder
         * 
         */
        public Builder remediation(@Nullable Output<String> remediation) {
            $.remediation = remediation;
            return this;
        }

        /**
         * @param remediation A description of actions that can be taken to remedy the note.
         * 
         * @return builder
         * 
         */
        public Builder remediation(String remediation) {
            return remediation(Output.of(remediation));
        }

        /**
         * @param resourceUri Required. Immutable. A URI that represents the resource for which
         * the occurrence applies. For example,
         * https://gcr.io/project/image{@literal @}sha256:123abc for a Docker image.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(Output<String> resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        /**
         * @param resourceUri Required. Immutable. A URI that represents the resource for which
         * the occurrence applies. For example,
         * https://gcr.io/project/image{@literal @}sha256:123abc for a Docker image.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(String resourceUri) {
            return resourceUri(Output.of(resourceUri));
        }

        public OccurenceArgs build() {
            if ($.attestation == null) {
                throw new MissingRequiredPropertyException("OccurenceArgs", "attestation");
            }
            if ($.noteName == null) {
                throw new MissingRequiredPropertyException("OccurenceArgs", "noteName");
            }
            if ($.resourceUri == null) {
                throw new MissingRequiredPropertyException("OccurenceArgs", "resourceUri");
            }
            return $;
        }
    }

}
