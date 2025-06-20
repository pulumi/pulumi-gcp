// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.inputs.InterconnectGroupIntentArgs;
import com.pulumi.gcp.compute.inputs.InterconnectGroupInterconnectArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InterconnectGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterconnectGroupArgs Empty = new InterconnectGroupArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The user&#39;s intent for this group. This is the only required field besides
     * the name that must be specified on group creation.
     * Structure is documented below.
     * 
     */
    @Import(name="intent", required=true)
    private Output<InterconnectGroupIntentArgs> intent;

    /**
     * @return The user&#39;s intent for this group. This is the only required field besides
     * the name that must be specified on group creation.
     * Structure is documented below.
     * 
     */
    public Output<InterconnectGroupIntentArgs> intent() {
        return this.intent;
    }

    /**
     * (Output)
     * Interconnects used to explain this blocker in more
     * detail.
     * 
     */
    @Import(name="interconnects")
    private @Nullable Output<List<InterconnectGroupInterconnectArgs>> interconnects;

    /**
     * @return (Output)
     * Interconnects used to explain this blocker in more
     * detail.
     * 
     */
    public Optional<Output<List<InterconnectGroupInterconnectArgs>>> interconnects() {
        return Optional.ofNullable(this.interconnects);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be
     * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?` which means the first
     * character must be a lowercase letter, and all following characters must be a dash,
     * lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be
     * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?` which means the first
     * character must be a lowercase letter, and all following characters must be a dash,
     * lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private InterconnectGroupArgs() {}

    private InterconnectGroupArgs(InterconnectGroupArgs $) {
        this.description = $.description;
        this.intent = $.intent;
        this.interconnects = $.interconnects;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterconnectGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterconnectGroupArgs $;

        public Builder() {
            $ = new InterconnectGroupArgs();
        }

        public Builder(InterconnectGroupArgs defaults) {
            $ = new InterconnectGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param intent The user&#39;s intent for this group. This is the only required field besides
         * the name that must be specified on group creation.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder intent(Output<InterconnectGroupIntentArgs> intent) {
            $.intent = intent;
            return this;
        }

        /**
         * @param intent The user&#39;s intent for this group. This is the only required field besides
         * the name that must be specified on group creation.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder intent(InterconnectGroupIntentArgs intent) {
            return intent(Output.of(intent));
        }

        /**
         * @param interconnects (Output)
         * Interconnects used to explain this blocker in more
         * detail.
         * 
         * @return builder
         * 
         */
        public Builder interconnects(@Nullable Output<List<InterconnectGroupInterconnectArgs>> interconnects) {
            $.interconnects = interconnects;
            return this;
        }

        /**
         * @param interconnects (Output)
         * Interconnects used to explain this blocker in more
         * detail.
         * 
         * @return builder
         * 
         */
        public Builder interconnects(List<InterconnectGroupInterconnectArgs> interconnects) {
            return interconnects(Output.of(interconnects));
        }

        /**
         * @param interconnects (Output)
         * Interconnects used to explain this blocker in more
         * detail.
         * 
         * @return builder
         * 
         */
        public Builder interconnects(InterconnectGroupInterconnectArgs... interconnects) {
            return interconnects(List.of(interconnects));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be
         * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
         * long and match the regular expression `a-z?` which means the first
         * character must be a lowercase letter, and all following characters must be a dash,
         * lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be
         * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
         * long and match the regular expression `a-z?` which means the first
         * character must be a lowercase letter, and all following characters must be a dash,
         * lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public InterconnectGroupArgs build() {
            if ($.intent == null) {
                throw new MissingRequiredPropertyException("InterconnectGroupArgs", "intent");
            }
            return $;
        }
    }

}
