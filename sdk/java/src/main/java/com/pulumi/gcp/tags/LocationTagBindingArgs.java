// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tags;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocationTagBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocationTagBindingArgs Empty = new LocationTagBindingArgs();

    /**
     * Location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Location of the resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
     * 
     */
    @Import(name="parent", required=true)
    private Output<String> parent;

    /**
     * @return The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }

    /**
     * The TagValue of the TagBinding. Must be of the form tagValues/456.
     * 
     */
    @Import(name="tagValue", required=true)
    private Output<String> tagValue;

    /**
     * @return The TagValue of the TagBinding. Must be of the form tagValues/456.
     * 
     */
    public Output<String> tagValue() {
        return this.tagValue;
    }

    private LocationTagBindingArgs() {}

    private LocationTagBindingArgs(LocationTagBindingArgs $) {
        this.location = $.location;
        this.parent = $.parent;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationTagBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationTagBindingArgs $;

        public Builder() {
            $ = new LocationTagBindingArgs();
        }

        public Builder(LocationTagBindingArgs defaults) {
            $ = new LocationTagBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location Location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param parent The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
         * 
         * @return builder
         * 
         */
        public Builder parent(Output<String> parent) {
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
         * @return builder
         * 
         */
        public Builder tagValue(Output<String> tagValue) {
            $.tagValue = tagValue;
            return this;
        }

        /**
         * @param tagValue The TagValue of the TagBinding. Must be of the form tagValues/456.
         * 
         * @return builder
         * 
         */
        public Builder tagValue(String tagValue) {
            return tagValue(Output.of(tagValue));
        }

        public LocationTagBindingArgs build() {
            $.parent = Objects.requireNonNull($.parent, "expected parameter 'parent' to be non-null");
            $.tagValue = Objects.requireNonNull($.tagValue, "expected parameter 'tagValue' to be non-null");
            return $;
        }
    }

}