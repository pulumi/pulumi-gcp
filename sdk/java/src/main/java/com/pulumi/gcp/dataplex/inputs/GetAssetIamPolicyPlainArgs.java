// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAssetIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAssetIamPolicyPlainArgs Empty = new GetAssetIamPolicyPlainArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="asset", required=true)
    private String asset;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String asset() {
        return this.asset;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="dataplexZone", required=true)
    private String dataplexZone;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String dataplexZone() {
        return this.dataplexZone;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="lake", required=true)
    private String lake;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String lake() {
        return this.lake;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     * 
     */
    @Import(name="location")
    private @Nullable String location;

    /**
     * @return Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetAssetIamPolicyPlainArgs() {}

    private GetAssetIamPolicyPlainArgs(GetAssetIamPolicyPlainArgs $) {
        this.asset = $.asset;
        this.dataplexZone = $.dataplexZone;
        this.lake = $.lake;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAssetIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAssetIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetAssetIamPolicyPlainArgs();
        }

        public Builder(GetAssetIamPolicyPlainArgs defaults) {
            $ = new GetAssetIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param asset Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder asset(String asset) {
            $.asset = asset;
            return this;
        }

        /**
         * @param dataplexZone Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder dataplexZone(String dataplexZone) {
            $.dataplexZone = dataplexZone;
            return this;
        }

        /**
         * @param lake Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder lake(String lake) {
            $.lake = lake;
            return this;
        }

        /**
         * @param location Used to find the parent resource to bind the IAM policy to. If not specified,
         * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
         * location is specified, it is taken from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetAssetIamPolicyPlainArgs build() {
            if ($.asset == null) {
                throw new MissingRequiredPropertyException("GetAssetIamPolicyPlainArgs", "asset");
            }
            if ($.dataplexZone == null) {
                throw new MissingRequiredPropertyException("GetAssetIamPolicyPlainArgs", "dataplexZone");
            }
            if ($.lake == null) {
                throw new MissingRequiredPropertyException("GetAssetIamPolicyPlainArgs", "lake");
            }
            return $;
        }
    }

}
