// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EntryEntrySourceAncestorArgs extends com.pulumi.resources.ResourceArgs {

    public static final EntryEntrySourceAncestorArgs Empty = new EntryEntrySourceAncestorArgs();

    /**
     * The name of the ancestor resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the ancestor resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type of the ancestor resource.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the ancestor resource.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private EntryEntrySourceAncestorArgs() {}

    private EntryEntrySourceAncestorArgs(EntryEntrySourceAncestorArgs $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntryEntrySourceAncestorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntryEntrySourceAncestorArgs $;

        public Builder() {
            $ = new EntryEntrySourceAncestorArgs();
        }

        public Builder(EntryEntrySourceAncestorArgs defaults) {
            $ = new EntryEntrySourceAncestorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the ancestor resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the ancestor resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The type of the ancestor resource.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the ancestor resource.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public EntryEntrySourceAncestorArgs build() {
            return $;
        }
    }

}
