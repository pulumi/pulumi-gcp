// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tags.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagBindingState extends com.pulumi.resources.ResourceArgs {

    public static final TagBindingState Empty = new TagBindingState();

    /**
     * The generated id for the TagBinding. This is a string of the form: `tagBindings/{full-resource-name}/{tag-value-name}`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The generated id for the TagBinding. This is a string of the form: `tagBindings/{full-resource-name}/{tag-value-name}`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    /**
     * The TagValue of the TagBinding. Must be of the form tagValues/456.
     * 
     * ***
     * 
     */
    @Import(name="tagValue")
    private @Nullable Output<String> tagValue;

    /**
     * @return The TagValue of the TagBinding. Must be of the form tagValues/456.
     * 
     * ***
     * 
     */
    public Optional<Output<String>> tagValue() {
        return Optional.ofNullable(this.tagValue);
    }

    private TagBindingState() {}

    private TagBindingState(TagBindingState $) {
        this.name = $.name;
        this.parent = $.parent;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagBindingState $;

        public Builder() {
            $ = new TagBindingState();
        }

        public Builder(TagBindingState defaults) {
            $ = new TagBindingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The generated id for the TagBinding. This is a string of the form: `tagBindings/{full-resource-name}/{tag-value-name}`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The generated id for the TagBinding. This is a string of the form: `tagBindings/{full-resource-name}/{tag-value-name}`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parent The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param tagValue The TagValue of the TagBinding. Must be of the form tagValues/456.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder tagValue(@Nullable Output<String> tagValue) {
            $.tagValue = tagValue;
            return this;
        }

        /**
         * @param tagValue The TagValue of the TagBinding. Must be of the form tagValues/456.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder tagValue(String tagValue) {
            return tagValue(Output.of(tagValue));
        }

        public TagBindingState build() {
            return $;
        }
    }

}
