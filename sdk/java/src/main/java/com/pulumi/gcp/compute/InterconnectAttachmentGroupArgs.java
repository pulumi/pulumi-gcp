// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupAttachmentArgs;
import com.pulumi.gcp.compute.inputs.InterconnectAttachmentGroupIntentArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InterconnectAttachmentGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterconnectAttachmentGroupArgs Empty = new InterconnectAttachmentGroupArgs();

    /**
     * Attachments in the AttachmentGroup. Keys are arbitrary user-specified
     * strings. Users are encouraged, but not required, to use their preferred
     * format for resource links as keys.
     * Note that there are add-members and remove-members methods in gcloud.
     * The size of this map is limited by an &#34;Attachments per group&#34; quota.
     * Structure is documented below.
     * 
     */
    @Import(name="attachments")
    private @Nullable Output<List<InterconnectAttachmentGroupAttachmentArgs>> attachments;

    /**
     * @return Attachments in the AttachmentGroup. Keys are arbitrary user-specified
     * strings. Users are encouraged, but not required, to use their preferred
     * format for resource links as keys.
     * Note that there are add-members and remove-members methods in gcloud.
     * The size of this map is limited by an &#34;Attachments per group&#34; quota.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<InterconnectAttachmentGroupAttachmentArgs>>> attachments() {
        return Optional.ofNullable(this.attachments);
    }

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
    private Output<InterconnectAttachmentGroupIntentArgs> intent;

    /**
     * @return The user&#39;s intent for this group. This is the only required field besides
     * the name that must be specified on group creation.
     * Structure is documented below.
     * 
     */
    public Output<InterconnectAttachmentGroupIntentArgs> intent() {
        return this.intent;
    }

    /**
     * The URL of an InterconnectGroup that groups these Attachments&#39;
     * Interconnects. Customers do not need to set this unless directed by
     * Google Support.
     * 
     */
    @Import(name="interconnectGroup")
    private @Nullable Output<String> interconnectGroup;

    /**
     * @return The URL of an InterconnectGroup that groups these Attachments&#39;
     * Interconnects. Customers do not need to set this unless directed by
     * Google Support.
     * 
     */
    public Optional<Output<String>> interconnectGroup() {
        return Optional.ofNullable(this.interconnectGroup);
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

    private InterconnectAttachmentGroupArgs() {}

    private InterconnectAttachmentGroupArgs(InterconnectAttachmentGroupArgs $) {
        this.attachments = $.attachments;
        this.description = $.description;
        this.intent = $.intent;
        this.interconnectGroup = $.interconnectGroup;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterconnectAttachmentGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterconnectAttachmentGroupArgs $;

        public Builder() {
            $ = new InterconnectAttachmentGroupArgs();
        }

        public Builder(InterconnectAttachmentGroupArgs defaults) {
            $ = new InterconnectAttachmentGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attachments Attachments in the AttachmentGroup. Keys are arbitrary user-specified
         * strings. Users are encouraged, but not required, to use their preferred
         * format for resource links as keys.
         * Note that there are add-members and remove-members methods in gcloud.
         * The size of this map is limited by an &#34;Attachments per group&#34; quota.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder attachments(@Nullable Output<List<InterconnectAttachmentGroupAttachmentArgs>> attachments) {
            $.attachments = attachments;
            return this;
        }

        /**
         * @param attachments Attachments in the AttachmentGroup. Keys are arbitrary user-specified
         * strings. Users are encouraged, but not required, to use their preferred
         * format for resource links as keys.
         * Note that there are add-members and remove-members methods in gcloud.
         * The size of this map is limited by an &#34;Attachments per group&#34; quota.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder attachments(List<InterconnectAttachmentGroupAttachmentArgs> attachments) {
            return attachments(Output.of(attachments));
        }

        /**
         * @param attachments Attachments in the AttachmentGroup. Keys are arbitrary user-specified
         * strings. Users are encouraged, but not required, to use their preferred
         * format for resource links as keys.
         * Note that there are add-members and remove-members methods in gcloud.
         * The size of this map is limited by an &#34;Attachments per group&#34; quota.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder attachments(InterconnectAttachmentGroupAttachmentArgs... attachments) {
            return attachments(List.of(attachments));
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
        public Builder intent(Output<InterconnectAttachmentGroupIntentArgs> intent) {
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
        public Builder intent(InterconnectAttachmentGroupIntentArgs intent) {
            return intent(Output.of(intent));
        }

        /**
         * @param interconnectGroup The URL of an InterconnectGroup that groups these Attachments&#39;
         * Interconnects. Customers do not need to set this unless directed by
         * Google Support.
         * 
         * @return builder
         * 
         */
        public Builder interconnectGroup(@Nullable Output<String> interconnectGroup) {
            $.interconnectGroup = interconnectGroup;
            return this;
        }

        /**
         * @param interconnectGroup The URL of an InterconnectGroup that groups these Attachments&#39;
         * Interconnects. Customers do not need to set this unless directed by
         * Google Support.
         * 
         * @return builder
         * 
         */
        public Builder interconnectGroup(String interconnectGroup) {
            return interconnectGroup(Output.of(interconnectGroup));
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

        public InterconnectAttachmentGroupArgs build() {
            if ($.intent == null) {
                throw new MissingRequiredPropertyException("InterconnectAttachmentGroupArgs", "intent");
            }
            return $;
        }
    }

}
