// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networksecurity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TlsInspectionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final TlsInspectionPolicyArgs Empty = new TlsInspectionPolicyArgs();

    /**
     * A CA pool resource used to issue interception certificates.
     * 
     */
    @Import(name="caPool", required=true)
    private Output<String> caPool;

    /**
     * @return A CA pool resource used to issue interception certificates.
     * 
     */
    public Output<String> caPool() {
        return this.caPool;
    }

    /**
     * Free-text description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Free-text description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * If FALSE (the default), use our default set of public CAs in addition to any CAs specified in trustConfig. These public CAs are currently based on the Mozilla Root Program and are subject to change over time. If TRUE, do not accept our default set of public CAs. Only CAs specified in trustConfig will be accepted.
     * 
     */
    @Import(name="excludePublicCaSet")
    private @Nullable Output<Boolean> excludePublicCaSet;

    /**
     * @return If FALSE (the default), use our default set of public CAs in addition to any CAs specified in trustConfig. These public CAs are currently based on the Mozilla Root Program and are subject to change over time. If TRUE, do not accept our default set of public CAs. Only CAs specified in trustConfig will be accepted.
     * 
     */
    public Optional<Output<Boolean>> excludePublicCaSet() {
        return Optional.ofNullable(this.excludePublicCaSet);
    }

    /**
     * The location of the tls inspection policy.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the tls inspection policy.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Short name of the TlsInspectionPolicy resource to be created.
     * 
     * ***
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Short name of the TlsInspectionPolicy resource to be created.
     * 
     * ***
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

    private TlsInspectionPolicyArgs() {}

    private TlsInspectionPolicyArgs(TlsInspectionPolicyArgs $) {
        this.caPool = $.caPool;
        this.description = $.description;
        this.excludePublicCaSet = $.excludePublicCaSet;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TlsInspectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsInspectionPolicyArgs $;

        public Builder() {
            $ = new TlsInspectionPolicyArgs();
        }

        public Builder(TlsInspectionPolicyArgs defaults) {
            $ = new TlsInspectionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caPool A CA pool resource used to issue interception certificates.
         * 
         * @return builder
         * 
         */
        public Builder caPool(Output<String> caPool) {
            $.caPool = caPool;
            return this;
        }

        /**
         * @param caPool A CA pool resource used to issue interception certificates.
         * 
         * @return builder
         * 
         */
        public Builder caPool(String caPool) {
            return caPool(Output.of(caPool));
        }

        /**
         * @param description Free-text description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Free-text description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param excludePublicCaSet If FALSE (the default), use our default set of public CAs in addition to any CAs specified in trustConfig. These public CAs are currently based on the Mozilla Root Program and are subject to change over time. If TRUE, do not accept our default set of public CAs. Only CAs specified in trustConfig will be accepted.
         * 
         * @return builder
         * 
         */
        public Builder excludePublicCaSet(@Nullable Output<Boolean> excludePublicCaSet) {
            $.excludePublicCaSet = excludePublicCaSet;
            return this;
        }

        /**
         * @param excludePublicCaSet If FALSE (the default), use our default set of public CAs in addition to any CAs specified in trustConfig. These public CAs are currently based on the Mozilla Root Program and are subject to change over time. If TRUE, do not accept our default set of public CAs. Only CAs specified in trustConfig will be accepted.
         * 
         * @return builder
         * 
         */
        public Builder excludePublicCaSet(Boolean excludePublicCaSet) {
            return excludePublicCaSet(Output.of(excludePublicCaSet));
        }

        /**
         * @param location The location of the tls inspection policy.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the tls inspection policy.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Short name of the TlsInspectionPolicy resource to be created.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Short name of the TlsInspectionPolicy resource to be created.
         * 
         * ***
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

        public TlsInspectionPolicyArgs build() {
            $.caPool = Objects.requireNonNull($.caPool, "expected parameter 'caPool' to be non-null");
            return $;
        }
    }

}