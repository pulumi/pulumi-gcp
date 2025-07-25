// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.oslogin;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SshPublicKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SshPublicKeyArgs Empty = new SshPublicKeyArgs();

    /**
     * An expiration time in microseconds since epoch.
     * 
     */
    @Import(name="expirationTimeUsec")
    private @Nullable Output<String> expirationTimeUsec;

    /**
     * @return An expiration time in microseconds since epoch.
     * 
     */
    public Optional<Output<String>> expirationTimeUsec() {
        return Optional.ofNullable(this.expirationTimeUsec);
    }

    /**
     * Public key text in SSH format, defined by RFC4253 section 6.6.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Public key text in SSH format, defined by RFC4253 section 6.6.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The project ID of the Google Cloud Platform project.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project ID of the Google Cloud Platform project.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The user email.
     * 
     */
    @Import(name="user", required=true)
    private Output<String> user;

    /**
     * @return The user email.
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    private SshPublicKeyArgs() {}

    private SshPublicKeyArgs(SshPublicKeyArgs $) {
        this.expirationTimeUsec = $.expirationTimeUsec;
        this.key = $.key;
        this.project = $.project;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SshPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SshPublicKeyArgs $;

        public Builder() {
            $ = new SshPublicKeyArgs();
        }

        public Builder(SshPublicKeyArgs defaults) {
            $ = new SshPublicKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expirationTimeUsec An expiration time in microseconds since epoch.
         * 
         * @return builder
         * 
         */
        public Builder expirationTimeUsec(@Nullable Output<String> expirationTimeUsec) {
            $.expirationTimeUsec = expirationTimeUsec;
            return this;
        }

        /**
         * @param expirationTimeUsec An expiration time in microseconds since epoch.
         * 
         * @return builder
         * 
         */
        public Builder expirationTimeUsec(String expirationTimeUsec) {
            return expirationTimeUsec(Output.of(expirationTimeUsec));
        }

        /**
         * @param key Public key text in SSH format, defined by RFC4253 section 6.6.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Public key text in SSH format, defined by RFC4253 section 6.6.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param project The project ID of the Google Cloud Platform project.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project ID of the Google Cloud Platform project.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param user The user email.
         * 
         * @return builder
         * 
         */
        public Builder user(Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user The user email.
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public SshPublicKeyArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("SshPublicKeyArgs", "key");
            }
            if ($.user == null) {
                throw new MissingRequiredPropertyException("SshPublicKeyArgs", "user");
            }
            return $;
        }
    }

}
