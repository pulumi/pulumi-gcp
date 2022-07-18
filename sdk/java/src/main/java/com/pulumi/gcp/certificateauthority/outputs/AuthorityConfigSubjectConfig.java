// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.certificateauthority.outputs.AuthorityConfigSubjectConfigSubject;
import com.pulumi.gcp.certificateauthority.outputs.AuthorityConfigSubjectConfigSubjectAltName;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AuthorityConfigSubjectConfig {
    /**
     * @return Contains distinguished name fields such as the location and organization.
     * Structure is documented below.
     * 
     */
    private final AuthorityConfigSubjectConfigSubject subject;
    /**
     * @return The subject alternative name fields.
     * Structure is documented below.
     * 
     */
    private final @Nullable AuthorityConfigSubjectConfigSubjectAltName subjectAltName;

    @CustomType.Constructor
    private AuthorityConfigSubjectConfig(
        @CustomType.Parameter("subject") AuthorityConfigSubjectConfigSubject subject,
        @CustomType.Parameter("subjectAltName") @Nullable AuthorityConfigSubjectConfigSubjectAltName subjectAltName) {
        this.subject = subject;
        this.subjectAltName = subjectAltName;
    }

    /**
     * @return Contains distinguished name fields such as the location and organization.
     * Structure is documented below.
     * 
     */
    public AuthorityConfigSubjectConfigSubject subject() {
        return this.subject;
    }
    /**
     * @return The subject alternative name fields.
     * Structure is documented below.
     * 
     */
    public Optional<AuthorityConfigSubjectConfigSubjectAltName> subjectAltName() {
        return Optional.ofNullable(this.subjectAltName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigSubjectConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorityConfigSubjectConfigSubject subject;
        private @Nullable AuthorityConfigSubjectConfigSubjectAltName subjectAltName;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigSubjectConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subject = defaults.subject;
    	      this.subjectAltName = defaults.subjectAltName;
        }

        public Builder subject(AuthorityConfigSubjectConfigSubject subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }
        public Builder subjectAltName(@Nullable AuthorityConfigSubjectConfigSubjectAltName subjectAltName) {
            this.subjectAltName = subjectAltName;
            return this;
        }        public AuthorityConfigSubjectConfig build() {
            return new AuthorityConfigSubjectConfig(subject, subjectAltName);
        }
    }
}