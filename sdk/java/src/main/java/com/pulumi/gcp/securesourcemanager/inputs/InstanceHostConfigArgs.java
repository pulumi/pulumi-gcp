// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securesourcemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceHostConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceHostConfigArgs Empty = new InstanceHostConfigArgs();

    /**
     * (Output)
     * API hostname.
     * 
     */
    @Import(name="api")
    private @Nullable Output<String> api;

    /**
     * @return (Output)
     * API hostname.
     * 
     */
    public Optional<Output<String>> api() {
        return Optional.ofNullable(this.api);
    }

    /**
     * (Output)
     * Git HTTP hostname.
     * 
     */
    @Import(name="gitHttp")
    private @Nullable Output<String> gitHttp;

    /**
     * @return (Output)
     * Git HTTP hostname.
     * 
     */
    public Optional<Output<String>> gitHttp() {
        return Optional.ofNullable(this.gitHttp);
    }

    /**
     * (Output)
     * Git SSH hostname.
     * 
     */
    @Import(name="gitSsh")
    private @Nullable Output<String> gitSsh;

    /**
     * @return (Output)
     * Git SSH hostname.
     * 
     */
    public Optional<Output<String>> gitSsh() {
        return Optional.ofNullable(this.gitSsh);
    }

    /**
     * (Output)
     * HTML hostname.
     * 
     */
    @Import(name="html")
    private @Nullable Output<String> html;

    /**
     * @return (Output)
     * HTML hostname.
     * 
     */
    public Optional<Output<String>> html() {
        return Optional.ofNullable(this.html);
    }

    private InstanceHostConfigArgs() {}

    private InstanceHostConfigArgs(InstanceHostConfigArgs $) {
        this.api = $.api;
        this.gitHttp = $.gitHttp;
        this.gitSsh = $.gitSsh;
        this.html = $.html;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceHostConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceHostConfigArgs $;

        public Builder() {
            $ = new InstanceHostConfigArgs();
        }

        public Builder(InstanceHostConfigArgs defaults) {
            $ = new InstanceHostConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param api (Output)
         * API hostname.
         * 
         * @return builder
         * 
         */
        public Builder api(@Nullable Output<String> api) {
            $.api = api;
            return this;
        }

        /**
         * @param api (Output)
         * API hostname.
         * 
         * @return builder
         * 
         */
        public Builder api(String api) {
            return api(Output.of(api));
        }

        /**
         * @param gitHttp (Output)
         * Git HTTP hostname.
         * 
         * @return builder
         * 
         */
        public Builder gitHttp(@Nullable Output<String> gitHttp) {
            $.gitHttp = gitHttp;
            return this;
        }

        /**
         * @param gitHttp (Output)
         * Git HTTP hostname.
         * 
         * @return builder
         * 
         */
        public Builder gitHttp(String gitHttp) {
            return gitHttp(Output.of(gitHttp));
        }

        /**
         * @param gitSsh (Output)
         * Git SSH hostname.
         * 
         * @return builder
         * 
         */
        public Builder gitSsh(@Nullable Output<String> gitSsh) {
            $.gitSsh = gitSsh;
            return this;
        }

        /**
         * @param gitSsh (Output)
         * Git SSH hostname.
         * 
         * @return builder
         * 
         */
        public Builder gitSsh(String gitSsh) {
            return gitSsh(Output.of(gitSsh));
        }

        /**
         * @param html (Output)
         * HTML hostname.
         * 
         * @return builder
         * 
         */
        public Builder html(@Nullable Output<String> html) {
            $.html = html;
            return this;
        }

        /**
         * @param html (Output)
         * HTML hostname.
         * 
         * @return builder
         * 
         */
        public Builder html(String html) {
            return html(Output.of(html));
        }

        public InstanceHostConfigArgs build() {
            return $;
        }
    }

}