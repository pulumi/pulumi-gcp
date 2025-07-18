// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.iam.inputs.FoldersPolicyBindingConditionArgs;
import com.pulumi.gcp.iam.inputs.FoldersPolicyBindingTargetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FoldersPolicyBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final FoldersPolicyBindingArgs Empty = new FoldersPolicyBindingArgs();

    /**
     * Optional. User defined annotations. See https://google.aip.dev/148#annotations for more details such as format and size limitations
     * 
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Optional. User defined annotations. See https://google.aip.dev/148#annotations for more details such as format and size limitations
     * 
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Represents a textual expression in the Common Expression Language
     * (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
     * CEL are documented at https://github.com/google/cel-spec.
     * Example (Comparison):
     * title: \&#34;Summary size limit\&#34;
     * description: \&#34;Determines if a summary is less than 100 chars\&#34;
     * expression: \&#34;document.summary.size() &lt; 100\&#34;
     * Example
     * (Equality):
     * title: \&#34;Requestor is owner\&#34;
     * description: \&#34;Determines if requestor is the document owner\&#34;
     * expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
     * (Logic):
     * title: \&#34;Public documents\&#34;
     * description: \&#34;Determine whether the document should be publicly visible\&#34;
     * expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
     * Example (Data Manipulation):
     * title: \&#34;Notification string\&#34;
     * description: \&#34;Create a notification string with a timestamp.\&#34;
     * expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
     * The exact variables and functions that may be referenced within an expression are
     * determined by the service that evaluates it. See the service documentation for
     * additional information.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<FoldersPolicyBindingConditionArgs> condition;

    /**
     * @return Represents a textual expression in the Common Expression Language
     * (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
     * CEL are documented at https://github.com/google/cel-spec.
     * Example (Comparison):
     * title: \&#34;Summary size limit\&#34;
     * description: \&#34;Determines if a summary is less than 100 chars\&#34;
     * expression: \&#34;document.summary.size() &lt; 100\&#34;
     * Example
     * (Equality):
     * title: \&#34;Requestor is owner\&#34;
     * description: \&#34;Determines if requestor is the document owner\&#34;
     * expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
     * (Logic):
     * title: \&#34;Public documents\&#34;
     * description: \&#34;Determine whether the document should be publicly visible\&#34;
     * expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
     * Example (Data Manipulation):
     * title: \&#34;Notification string\&#34;
     * description: \&#34;Create a notification string with a timestamp.\&#34;
     * expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
     * The exact variables and functions that may be referenced within an expression are
     * determined by the service that evaluates it. See the service documentation for
     * additional information.
     * Structure is documented below.
     * 
     */
    public Optional<Output<FoldersPolicyBindingConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * Optional. The description of the policy binding. Must be less than or equal to 63 characters.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Optional. The description of the policy binding. Must be less than or equal to 63 characters.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The parent folder for the PolicyBinding.
     * 
     */
    @Import(name="folder", required=true)
    private Output<String> folder;

    /**
     * @return The parent folder for the PolicyBinding.
     * 
     */
    public Output<String> folder() {
        return this.folder;
    }

    /**
     * The location of the PolicyBinding.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location of the PolicyBinding.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * Required. Immutable. The resource name of the policy to be bound. The binding parent and policy must belong to the same Organization (or Project).
     * 
     */
    @Import(name="policy", required=true)
    private Output<String> policy;

    /**
     * @return Required. Immutable. The resource name of the policy to be bound. The binding parent and policy must belong to the same Organization (or Project).
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    /**
     * The Policy Binding ID.
     * 
     */
    @Import(name="policyBindingId", required=true)
    private Output<String> policyBindingId;

    /**
     * @return The Policy Binding ID.
     * 
     */
    public Output<String> policyBindingId() {
        return this.policyBindingId;
    }

    /**
     * Immutable. The kind of the policy to attach in this binding. This
     * field must be one of the following:  - Left empty (will be automatically set
     * to the policy kind) - The input policy kind   Possible values:  POLICY_KIND_UNSPECIFIED PRINCIPAL_ACCESS_BOUNDARY ACCESS
     * 
     */
    @Import(name="policyKind")
    private @Nullable Output<String> policyKind;

    /**
     * @return Immutable. The kind of the policy to attach in this binding. This
     * field must be one of the following:  - Left empty (will be automatically set
     * to the policy kind) - The input policy kind   Possible values:  POLICY_KIND_UNSPECIFIED PRINCIPAL_ACCESS_BOUNDARY ACCESS
     * 
     */
    public Optional<Output<String>> policyKind() {
        return Optional.ofNullable(this.policyKind);
    }

    /**
     * Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
     * Structure is documented below.
     * 
     */
    @Import(name="target", required=true)
    private Output<FoldersPolicyBindingTargetArgs> target;

    /**
     * @return Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
     * Structure is documented below.
     * 
     */
    public Output<FoldersPolicyBindingTargetArgs> target() {
        return this.target;
    }

    private FoldersPolicyBindingArgs() {}

    private FoldersPolicyBindingArgs(FoldersPolicyBindingArgs $) {
        this.annotations = $.annotations;
        this.condition = $.condition;
        this.displayName = $.displayName;
        this.folder = $.folder;
        this.location = $.location;
        this.policy = $.policy;
        this.policyBindingId = $.policyBindingId;
        this.policyKind = $.policyKind;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FoldersPolicyBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FoldersPolicyBindingArgs $;

        public Builder() {
            $ = new FoldersPolicyBindingArgs();
        }

        public Builder(FoldersPolicyBindingArgs defaults) {
            $ = new FoldersPolicyBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Optional. User defined annotations. See https://google.aip.dev/148#annotations for more details such as format and size limitations
         * 
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
         * @param annotations Optional. User defined annotations. See https://google.aip.dev/148#annotations for more details such as format and size limitations
         * 
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
         * @param condition Represents a textual expression in the Common Expression Language
         * (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
         * CEL are documented at https://github.com/google/cel-spec.
         * Example (Comparison):
         * title: \&#34;Summary size limit\&#34;
         * description: \&#34;Determines if a summary is less than 100 chars\&#34;
         * expression: \&#34;document.summary.size() &lt; 100\&#34;
         * Example
         * (Equality):
         * title: \&#34;Requestor is owner\&#34;
         * description: \&#34;Determines if requestor is the document owner\&#34;
         * expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
         * (Logic):
         * title: \&#34;Public documents\&#34;
         * description: \&#34;Determine whether the document should be publicly visible\&#34;
         * expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
         * Example (Data Manipulation):
         * title: \&#34;Notification string\&#34;
         * description: \&#34;Create a notification string with a timestamp.\&#34;
         * expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
         * The exact variables and functions that may be referenced within an expression are
         * determined by the service that evaluates it. See the service documentation for
         * additional information.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<FoldersPolicyBindingConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition Represents a textual expression in the Common Expression Language
         * (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
         * CEL are documented at https://github.com/google/cel-spec.
         * Example (Comparison):
         * title: \&#34;Summary size limit\&#34;
         * description: \&#34;Determines if a summary is less than 100 chars\&#34;
         * expression: \&#34;document.summary.size() &lt; 100\&#34;
         * Example
         * (Equality):
         * title: \&#34;Requestor is owner\&#34;
         * description: \&#34;Determines if requestor is the document owner\&#34;
         * expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
         * (Logic):
         * title: \&#34;Public documents\&#34;
         * description: \&#34;Determine whether the document should be publicly visible\&#34;
         * expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
         * Example (Data Manipulation):
         * title: \&#34;Notification string\&#34;
         * description: \&#34;Create a notification string with a timestamp.\&#34;
         * expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
         * The exact variables and functions that may be referenced within an expression are
         * determined by the service that evaluates it. See the service documentation for
         * additional information.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder condition(FoldersPolicyBindingConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param displayName Optional. The description of the policy binding. Must be less than or equal to 63 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Optional. The description of the policy binding. Must be less than or equal to 63 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param folder The parent folder for the PolicyBinding.
         * 
         * @return builder
         * 
         */
        public Builder folder(Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The parent folder for the PolicyBinding.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param location The location of the PolicyBinding.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the PolicyBinding.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param policy Required. Immutable. The resource name of the policy to be bound. The binding parent and policy must belong to the same Organization (or Project).
         * 
         * @return builder
         * 
         */
        public Builder policy(Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Required. Immutable. The resource name of the policy to be bound. The binding parent and policy must belong to the same Organization (or Project).
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param policyBindingId The Policy Binding ID.
         * 
         * @return builder
         * 
         */
        public Builder policyBindingId(Output<String> policyBindingId) {
            $.policyBindingId = policyBindingId;
            return this;
        }

        /**
         * @param policyBindingId The Policy Binding ID.
         * 
         * @return builder
         * 
         */
        public Builder policyBindingId(String policyBindingId) {
            return policyBindingId(Output.of(policyBindingId));
        }

        /**
         * @param policyKind Immutable. The kind of the policy to attach in this binding. This
         * field must be one of the following:  - Left empty (will be automatically set
         * to the policy kind) - The input policy kind   Possible values:  POLICY_KIND_UNSPECIFIED PRINCIPAL_ACCESS_BOUNDARY ACCESS
         * 
         * @return builder
         * 
         */
        public Builder policyKind(@Nullable Output<String> policyKind) {
            $.policyKind = policyKind;
            return this;
        }

        /**
         * @param policyKind Immutable. The kind of the policy to attach in this binding. This
         * field must be one of the following:  - Left empty (will be automatically set
         * to the policy kind) - The input policy kind   Possible values:  POLICY_KIND_UNSPECIFIED PRINCIPAL_ACCESS_BOUNDARY ACCESS
         * 
         * @return builder
         * 
         */
        public Builder policyKind(String policyKind) {
            return policyKind(Output.of(policyKind));
        }

        /**
         * @param target Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<FoldersPolicyBindingTargetArgs> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder target(FoldersPolicyBindingTargetArgs target) {
            return target(Output.of(target));
        }

        public FoldersPolicyBindingArgs build() {
            if ($.folder == null) {
                throw new MissingRequiredPropertyException("FoldersPolicyBindingArgs", "folder");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("FoldersPolicyBindingArgs", "location");
            }
            if ($.policy == null) {
                throw new MissingRequiredPropertyException("FoldersPolicyBindingArgs", "policy");
            }
            if ($.policyBindingId == null) {
                throw new MissingRequiredPropertyException("FoldersPolicyBindingArgs", "policyBindingId");
            }
            if ($.target == null) {
                throw new MissingRequiredPropertyException("FoldersPolicyBindingArgs", "target");
            }
            return $;
        }
    }

}
