// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.clouddeploy.inputs.AutomationRuleArgs;
import com.pulumi.gcp.clouddeploy.inputs.AutomationSelectorArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutomationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomationArgs Empty = new AutomationArgs();

    /**
     * Optional. User annotations. These attributes can only be set and used by the user, and not by Cloud Deploy. Annotations must meet the following constraints: * Annotations are key/value pairs. * Valid annotation keys have two segments: an optional prefix and name, separated by a slash (`/`). * The name segment is required and must be 63 characters or less, beginning and ending with an alphanumeric character (`[a-z0-9A-Z]`) with dashes (`-`), underscores (`_`), dots (`.`), and alphanumerics between. * The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots(`.`), not longer than 253 characters in total, followed by a slash (`/`). See https://kubernetes.io/docs/concepts/overview/working-with-objects/annotations/#syntax-and-character-set for more details.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Optional. User annotations. These attributes can only be set and used by the user, and not by Cloud Deploy. Annotations must meet the following constraints: * Annotations are key/value pairs. * Valid annotation keys have two segments: an optional prefix and name, separated by a slash (`/`). * The name segment is required and must be 63 characters or less, beginning and ending with an alphanumeric character (`[a-z0-9A-Z]`) with dashes (`-`), underscores (`_`), dots (`.`), and alphanumerics between. * The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots(`.`), not longer than 253 characters in total, followed by a slash (`/`). See https://kubernetes.io/docs/concepts/overview/working-with-objects/annotations/#syntax-and-character-set for more details.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The delivery_pipeline for the resource
     * 
     */
    @Import(name="deliveryPipeline", required=true)
    private Output<String> deliveryPipeline;

    /**
     * @return The delivery_pipeline for the resource
     * 
     */
    public Output<String> deliveryPipeline() {
        return this.deliveryPipeline;
    }

    /**
     * Optional. Description of the `Automation`. Max length is 255 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. Description of the `Automation`. Max length is 255 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Optional. Labels are attributes that can be set and used by both the user and by Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be &lt;= 63 characters.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Labels are attributes that can be set and used by both the user and by Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be &lt;= 63 characters.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * Name of the `Automation`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the `Automation`.
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

    /**
     * Required. List of Automation rules associated with the Automation resource. Must have at least one rule and limited to 250 rules per Delivery Pipeline. Note: the order of the rules here is not the same as the order of execution.
     * Structure is documented below.
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<AutomationRuleArgs>> rules;

    /**
     * @return Required. List of Automation rules associated with the Automation resource. Must have at least one rule and limited to 250 rules per Delivery Pipeline. Note: the order of the rules here is not the same as the order of execution.
     * Structure is documented below.
     * 
     */
    public Output<List<AutomationRuleArgs>> rules() {
        return this.rules;
    }

    /**
     * Required. Selected resources to which the automation will be applied.
     * Structure is documented below.
     * 
     */
    @Import(name="selector", required=true)
    private Output<AutomationSelectorArgs> selector;

    /**
     * @return Required. Selected resources to which the automation will be applied.
     * Structure is documented below.
     * 
     */
    public Output<AutomationSelectorArgs> selector() {
        return this.selector;
    }

    /**
     * Required. Email address of the user-managed IAM service account that creates Cloud Deploy release and rollout resources.
     * 
     */
    @Import(name="serviceAccount", required=true)
    private Output<String> serviceAccount;

    /**
     * @return Required. Email address of the user-managed IAM service account that creates Cloud Deploy release and rollout resources.
     * 
     */
    public Output<String> serviceAccount() {
        return this.serviceAccount;
    }

    /**
     * Optional. When Suspended, automation is deactivated from execution.
     * 
     */
    @Import(name="suspended")
    private @Nullable Output<Boolean> suspended;

    /**
     * @return Optional. When Suspended, automation is deactivated from execution.
     * 
     */
    public Optional<Output<Boolean>> suspended() {
        return Optional.ofNullable(this.suspended);
    }

    private AutomationArgs() {}

    private AutomationArgs(AutomationArgs $) {
        this.annotations = $.annotations;
        this.deliveryPipeline = $.deliveryPipeline;
        this.description = $.description;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.rules = $.rules;
        this.selector = $.selector;
        this.serviceAccount = $.serviceAccount;
        this.suspended = $.suspended;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationArgs $;

        public Builder() {
            $ = new AutomationArgs();
        }

        public Builder(AutomationArgs defaults) {
            $ = new AutomationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Optional. User annotations. These attributes can only be set and used by the user, and not by Cloud Deploy. Annotations must meet the following constraints: * Annotations are key/value pairs. * Valid annotation keys have two segments: an optional prefix and name, separated by a slash (`/`). * The name segment is required and must be 63 characters or less, beginning and ending with an alphanumeric character (`[a-z0-9A-Z]`) with dashes (`-`), underscores (`_`), dots (`.`), and alphanumerics between. * The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots(`.`), not longer than 253 characters in total, followed by a slash (`/`). See https://kubernetes.io/docs/concepts/overview/working-with-objects/annotations/#syntax-and-character-set for more details.
         * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
         * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Optional. User annotations. These attributes can only be set and used by the user, and not by Cloud Deploy. Annotations must meet the following constraints: * Annotations are key/value pairs. * Valid annotation keys have two segments: an optional prefix and name, separated by a slash (`/`). * The name segment is required and must be 63 characters or less, beginning and ending with an alphanumeric character (`[a-z0-9A-Z]`) with dashes (`-`), underscores (`_`), dots (`.`), and alphanumerics between. * The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots(`.`), not longer than 253 characters in total, followed by a slash (`/`). See https://kubernetes.io/docs/concepts/overview/working-with-objects/annotations/#syntax-and-character-set for more details.
         * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
         * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param deliveryPipeline The delivery_pipeline for the resource
         * 
         * @return builder
         * 
         */
        public Builder deliveryPipeline(Output<String> deliveryPipeline) {
            $.deliveryPipeline = deliveryPipeline;
            return this;
        }

        /**
         * @param deliveryPipeline The delivery_pipeline for the resource
         * 
         * @return builder
         * 
         */
        public Builder deliveryPipeline(String deliveryPipeline) {
            return deliveryPipeline(Output.of(deliveryPipeline));
        }

        /**
         * @param description Optional. Description of the `Automation`. Max length is 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. Description of the `Automation`. Max length is 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels Optional. Labels are attributes that can be set and used by both the user and by Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be &lt;= 63 characters.
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
         * @param labels Optional. Labels are attributes that can be set and used by both the user and by Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be &lt;= 63 characters.
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
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Name of the `Automation`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the `Automation`.
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

        /**
         * @param rules Required. List of Automation rules associated with the Automation resource. Must have at least one rule and limited to 250 rules per Delivery Pipeline. Note: the order of the rules here is not the same as the order of execution.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rules(Output<List<AutomationRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Required. List of Automation rules associated with the Automation resource. Must have at least one rule and limited to 250 rules per Delivery Pipeline. Note: the order of the rules here is not the same as the order of execution.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<AutomationRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules Required. List of Automation rules associated with the Automation resource. Must have at least one rule and limited to 250 rules per Delivery Pipeline. Note: the order of the rules here is not the same as the order of execution.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rules(AutomationRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param selector Required. Selected resources to which the automation will be applied.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder selector(Output<AutomationSelectorArgs> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector Required. Selected resources to which the automation will be applied.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder selector(AutomationSelectorArgs selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param serviceAccount Required. Email address of the user-managed IAM service account that creates Cloud Deploy release and rollout resources.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount Required. Email address of the user-managed IAM service account that creates Cloud Deploy release and rollout resources.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param suspended Optional. When Suspended, automation is deactivated from execution.
         * 
         * @return builder
         * 
         */
        public Builder suspended(@Nullable Output<Boolean> suspended) {
            $.suspended = suspended;
            return this;
        }

        /**
         * @param suspended Optional. When Suspended, automation is deactivated from execution.
         * 
         * @return builder
         * 
         */
        public Builder suspended(Boolean suspended) {
            return suspended(Output.of(suspended));
        }

        public AutomationArgs build() {
            if ($.deliveryPipeline == null) {
                throw new MissingRequiredPropertyException("AutomationArgs", "deliveryPipeline");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("AutomationArgs", "location");
            }
            if ($.rules == null) {
                throw new MissingRequiredPropertyException("AutomationArgs", "rules");
            }
            if ($.selector == null) {
                throw new MissingRequiredPropertyException("AutomationArgs", "selector");
            }
            if ($.serviceAccount == null) {
                throw new MissingRequiredPropertyException("AutomationArgs", "serviceAccount");
            }
            return $;
        }
    }

}