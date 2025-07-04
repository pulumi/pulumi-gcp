// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDataQualityRulesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataQualityRulesPlainArgs Empty = new GetDataQualityRulesPlainArgs();

    /**
     * The ID of the data profile scan which the generation of quality rules will be basing on.
     * 
     */
    @Import(name="dataScanId", required=true)
    private String dataScanId;

    /**
     * @return The ID of the data profile scan which the generation of quality rules will be basing on.
     * 
     */
    public String dataScanId() {
        return this.dataScanId;
    }

    /**
     * The location where the referenced data profile scan resides.
     * 
     */
    @Import(name="location")
    private @Nullable String location;

    /**
     * @return The location where the referenced data profile scan resides.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The ID of the project in which the datascan belongs.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the datascan belongs.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetDataQualityRulesPlainArgs() {}

    private GetDataQualityRulesPlainArgs(GetDataQualityRulesPlainArgs $) {
        this.dataScanId = $.dataScanId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataQualityRulesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataQualityRulesPlainArgs $;

        public Builder() {
            $ = new GetDataQualityRulesPlainArgs();
        }

        public Builder(GetDataQualityRulesPlainArgs defaults) {
            $ = new GetDataQualityRulesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataScanId The ID of the data profile scan which the generation of quality rules will be basing on.
         * 
         * @return builder
         * 
         */
        public Builder dataScanId(String dataScanId) {
            $.dataScanId = dataScanId;
            return this;
        }

        /**
         * @param location The location where the referenced data profile scan resides.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        /**
         * @param project The ID of the project in which the datascan belongs.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetDataQualityRulesPlainArgs build() {
            if ($.dataScanId == null) {
                throw new MissingRequiredPropertyException("GetDataQualityRulesPlainArgs", "dataScanId");
            }
            return $;
        }
    }

}
