// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAndroidAppConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAndroidAppConfigArgs Empty = new GetAndroidAppConfigArgs();

    @Import(name="appId", required=true)
    private Output<String> appId;

    public Output<String> appId() {
        return this.appId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetAndroidAppConfigArgs() {}

    private GetAndroidAppConfigArgs(GetAndroidAppConfigArgs $) {
        this.appId = $.appId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAndroidAppConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAndroidAppConfigArgs $;

        public Builder() {
            $ = new GetAndroidAppConfigArgs();
        }

        public Builder(GetAndroidAppConfigArgs defaults) {
            $ = new GetAndroidAppConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetAndroidAppConfigArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            return $;
        }
    }

}