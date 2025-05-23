// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.clouddeploy.outputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindow;
import com.pulumi.gcp.clouddeploy.outputs.DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindow;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DeployPolicyRuleRolloutRestrictionTimeWindows {
    /**
     * @return Optional. One-time windows within which actions are restricted.
     * Structure is documented below.
     * 
     */
    private @Nullable List<DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindow> oneTimeWindows;
    /**
     * @return Required. The time zone in IANA format IANA Time Zone Database (e.g. America/New_York).
     * 
     */
    private String timeZone;
    /**
     * @return Optional. Recurring weekly windows within which actions are restricted.
     * Structure is documented below.
     * 
     */
    private @Nullable List<DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindow> weeklyWindows;

    private DeployPolicyRuleRolloutRestrictionTimeWindows() {}
    /**
     * @return Optional. One-time windows within which actions are restricted.
     * Structure is documented below.
     * 
     */
    public List<DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindow> oneTimeWindows() {
        return this.oneTimeWindows == null ? List.of() : this.oneTimeWindows;
    }
    /**
     * @return Required. The time zone in IANA format IANA Time Zone Database (e.g. America/New_York).
     * 
     */
    public String timeZone() {
        return this.timeZone;
    }
    /**
     * @return Optional. Recurring weekly windows within which actions are restricted.
     * Structure is documented below.
     * 
     */
    public List<DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindow> weeklyWindows() {
        return this.weeklyWindows == null ? List.of() : this.weeklyWindows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeployPolicyRuleRolloutRestrictionTimeWindows defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindow> oneTimeWindows;
        private String timeZone;
        private @Nullable List<DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindow> weeklyWindows;
        public Builder() {}
        public Builder(DeployPolicyRuleRolloutRestrictionTimeWindows defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oneTimeWindows = defaults.oneTimeWindows;
    	      this.timeZone = defaults.timeZone;
    	      this.weeklyWindows = defaults.weeklyWindows;
        }

        @CustomType.Setter
        public Builder oneTimeWindows(@Nullable List<DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindow> oneTimeWindows) {

            this.oneTimeWindows = oneTimeWindows;
            return this;
        }
        public Builder oneTimeWindows(DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindow... oneTimeWindows) {
            return oneTimeWindows(List.of(oneTimeWindows));
        }
        @CustomType.Setter
        public Builder timeZone(String timeZone) {
            if (timeZone == null) {
              throw new MissingRequiredPropertyException("DeployPolicyRuleRolloutRestrictionTimeWindows", "timeZone");
            }
            this.timeZone = timeZone;
            return this;
        }
        @CustomType.Setter
        public Builder weeklyWindows(@Nullable List<DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindow> weeklyWindows) {

            this.weeklyWindows = weeklyWindows;
            return this;
        }
        public Builder weeklyWindows(DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindow... weeklyWindows) {
            return weeklyWindows(List.of(weeklyWindows));
        }
        public DeployPolicyRuleRolloutRestrictionTimeWindows build() {
            final var _resultValue = new DeployPolicyRuleRolloutRestrictionTimeWindows();
            _resultValue.oneTimeWindows = oneTimeWindows;
            _resultValue.timeZone = timeZone;
            _resultValue.weeklyWindows = weeklyWindows;
            return _resultValue;
        }
    }
}
