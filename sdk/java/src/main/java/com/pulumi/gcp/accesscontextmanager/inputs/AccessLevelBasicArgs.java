// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessLevelBasicArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessLevelBasicArgs Empty = new AccessLevelBasicArgs();

    /**
     * How the conditions list should be combined to determine if a request
     * is granted this AccessLevel. If AND is used, each Condition in
     * conditions must be satisfied for the AccessLevel to be applied. If
     * OR is used, at least one Condition in conditions must be satisfied
     * for the AccessLevel to be applied.
     * Default value is `AND`.
     * Possible values are `AND` and `OR`.
     * 
     */
    @Import(name="combiningFunction")
    private @Nullable Output<String> combiningFunction;

    /**
     * @return How the conditions list should be combined to determine if a request
     * is granted this AccessLevel. If AND is used, each Condition in
     * conditions must be satisfied for the AccessLevel to be applied. If
     * OR is used, at least one Condition in conditions must be satisfied
     * for the AccessLevel to be applied.
     * Default value is `AND`.
     * Possible values are `AND` and `OR`.
     * 
     */
    public Optional<Output<String>> combiningFunction() {
        return Optional.ofNullable(this.combiningFunction);
    }

    /**
     * A set of requirements for the AccessLevel to be granted.
     * Structure is documented below.
     * 
     */
    @Import(name="conditions", required=true)
    private Output<List<AccessLevelBasicConditionArgs>> conditions;

    /**
     * @return A set of requirements for the AccessLevel to be granted.
     * Structure is documented below.
     * 
     */
    public Output<List<AccessLevelBasicConditionArgs>> conditions() {
        return this.conditions;
    }

    private AccessLevelBasicArgs() {}

    private AccessLevelBasicArgs(AccessLevelBasicArgs $) {
        this.combiningFunction = $.combiningFunction;
        this.conditions = $.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessLevelBasicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessLevelBasicArgs $;

        public Builder() {
            $ = new AccessLevelBasicArgs();
        }

        public Builder(AccessLevelBasicArgs defaults) {
            $ = new AccessLevelBasicArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param combiningFunction How the conditions list should be combined to determine if a request
         * is granted this AccessLevel. If AND is used, each Condition in
         * conditions must be satisfied for the AccessLevel to be applied. If
         * OR is used, at least one Condition in conditions must be satisfied
         * for the AccessLevel to be applied.
         * Default value is `AND`.
         * Possible values are `AND` and `OR`.
         * 
         * @return builder
         * 
         */
        public Builder combiningFunction(@Nullable Output<String> combiningFunction) {
            $.combiningFunction = combiningFunction;
            return this;
        }

        /**
         * @param combiningFunction How the conditions list should be combined to determine if a request
         * is granted this AccessLevel. If AND is used, each Condition in
         * conditions must be satisfied for the AccessLevel to be applied. If
         * OR is used, at least one Condition in conditions must be satisfied
         * for the AccessLevel to be applied.
         * Default value is `AND`.
         * Possible values are `AND` and `OR`.
         * 
         * @return builder
         * 
         */
        public Builder combiningFunction(String combiningFunction) {
            return combiningFunction(Output.of(combiningFunction));
        }

        /**
         * @param conditions A set of requirements for the AccessLevel to be granted.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder conditions(Output<List<AccessLevelBasicConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions A set of requirements for the AccessLevel to be granted.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<AccessLevelBasicConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions A set of requirements for the AccessLevel to be granted.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder conditions(AccessLevelBasicConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public AccessLevelBasicArgs build() {
            $.conditions = Objects.requireNonNull($.conditions, "expected parameter 'conditions' to be non-null");
            return $;
        }
    }

}