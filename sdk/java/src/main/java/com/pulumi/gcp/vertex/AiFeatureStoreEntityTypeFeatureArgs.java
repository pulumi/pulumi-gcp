// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AiFeatureStoreEntityTypeFeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final AiFeatureStoreEntityTypeFeatureArgs Empty = new AiFeatureStoreEntityTypeFeatureArgs();

    /**
     * Description of the feature.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the feature.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entitytype}.
     * 
     */
    @Import(name="entitytype", required=true)
    private Output<String> entitytype;

    /**
     * @return The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entitytype}.
     * 
     */
    public Output<String> entitytype() {
        return this.entitytype;
    }

    /**
     * A set of key/value label pairs to assign to the feature.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs to assign to the feature.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the feature. The feature can be up to 64 characters long and can consist only of ASCII Latin letters A-Z and a-z, underscore(_), and ASCII digits 0-9 starting with a letter. The value will be unique given an entity type.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the feature. The feature can be up to 64 characters long and can consist only of ASCII Latin letters A-Z and a-z, underscore(_), and ASCII digits 0-9 starting with a letter. The value will be unique given an entity type.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Type of Feature value. Immutable. https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featurestores.entityTypes.features#ValueType
     * 
     */
    @Import(name="valueType", required=true)
    private Output<String> valueType;

    /**
     * @return Type of Feature value. Immutable. https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featurestores.entityTypes.features#ValueType
     * 
     */
    public Output<String> valueType() {
        return this.valueType;
    }

    private AiFeatureStoreEntityTypeFeatureArgs() {}

    private AiFeatureStoreEntityTypeFeatureArgs(AiFeatureStoreEntityTypeFeatureArgs $) {
        this.description = $.description;
        this.entitytype = $.entitytype;
        this.labels = $.labels;
        this.name = $.name;
        this.valueType = $.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AiFeatureStoreEntityTypeFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AiFeatureStoreEntityTypeFeatureArgs $;

        public Builder() {
            $ = new AiFeatureStoreEntityTypeFeatureArgs();
        }

        public Builder(AiFeatureStoreEntityTypeFeatureArgs defaults) {
            $ = new AiFeatureStoreEntityTypeFeatureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the feature.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the feature.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param entitytype The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entitytype}.
         * 
         * @return builder
         * 
         */
        public Builder entitytype(Output<String> entitytype) {
            $.entitytype = entitytype;
            return this;
        }

        /**
         * @param entitytype The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entitytype}.
         * 
         * @return builder
         * 
         */
        public Builder entitytype(String entitytype) {
            return entitytype(Output.of(entitytype));
        }

        /**
         * @param labels A set of key/value label pairs to assign to the feature.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels A set of key/value label pairs to assign to the feature.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the feature. The feature can be up to 64 characters long and can consist only of ASCII Latin letters A-Z and a-z, underscore(_), and ASCII digits 0-9 starting with a letter. The value will be unique given an entity type.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the feature. The feature can be up to 64 characters long and can consist only of ASCII Latin letters A-Z and a-z, underscore(_), and ASCII digits 0-9 starting with a letter. The value will be unique given an entity type.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param valueType Type of Feature value. Immutable. https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featurestores.entityTypes.features#ValueType
         * 
         * @return builder
         * 
         */
        public Builder valueType(Output<String> valueType) {
            $.valueType = valueType;
            return this;
        }

        /**
         * @param valueType Type of Feature value. Immutable. https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featurestores.entityTypes.features#ValueType
         * 
         * @return builder
         * 
         */
        public Builder valueType(String valueType) {
            return valueType(Output.of(valueType));
        }

        public AiFeatureStoreEntityTypeFeatureArgs build() {
            if ($.entitytype == null) {
                throw new MissingRequiredPropertyException("AiFeatureStoreEntityTypeFeatureArgs", "entitytype");
            }
            if ($.valueType == null) {
                throw new MissingRequiredPropertyException("AiFeatureStoreEntityTypeFeatureArgs", "valueType");
            }
            return $;
        }
    }

}
