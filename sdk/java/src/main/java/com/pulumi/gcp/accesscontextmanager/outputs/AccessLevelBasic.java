// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.accesscontextmanager.outputs.AccessLevelBasicCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessLevelBasic {
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
    private final @Nullable String combiningFunction;
    /**
     * @return A set of requirements for the AccessLevel to be granted.
     * Structure is documented below.
     * 
     */
    private final List<AccessLevelBasicCondition> conditions;

    @CustomType.Constructor
    private AccessLevelBasic(
        @CustomType.Parameter("combiningFunction") @Nullable String combiningFunction,
        @CustomType.Parameter("conditions") List<AccessLevelBasicCondition> conditions) {
        this.combiningFunction = combiningFunction;
        this.conditions = conditions;
    }

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
    public Optional<String> combiningFunction() {
        return Optional.ofNullable(this.combiningFunction);
    }
    /**
     * @return A set of requirements for the AccessLevel to be granted.
     * Structure is documented below.
     * 
     */
    public List<AccessLevelBasicCondition> conditions() {
        return this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelBasic defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String combiningFunction;
        private List<AccessLevelBasicCondition> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelBasic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.combiningFunction = defaults.combiningFunction;
    	      this.conditions = defaults.conditions;
        }

        public Builder combiningFunction(@Nullable String combiningFunction) {
            this.combiningFunction = combiningFunction;
            return this;
        }
        public Builder conditions(List<AccessLevelBasicCondition> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(AccessLevelBasicCondition... conditions) {
            return conditions(List.of(conditions));
        }        public AccessLevelBasic build() {
            return new AccessLevelBasic(combiningFunction, conditions);
        }
    }
}