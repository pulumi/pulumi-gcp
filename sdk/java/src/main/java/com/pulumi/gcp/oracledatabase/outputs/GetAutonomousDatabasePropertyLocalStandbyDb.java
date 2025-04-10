// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.oracledatabase.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAutonomousDatabasePropertyLocalStandbyDb {
    /**
     * @return The date and time the Autonomous Data Guard role was switched for the
     * standby Autonomous Database.
     * 
     */
    private String dataGuardRoleChangedTime;
    /**
     * @return The date and time the Disaster Recovery role was switched for the standby
     * Autonomous Database.
     * 
     */
    private String disasterRecoveryRoleChangedTime;
    /**
     * @return The amount of time, in seconds, that the data of the standby database lags
     * in comparison to the data of the primary database.
     * 
     */
    private String lagTimeDuration;
    /**
     * @return The additional details about the current lifecycle state of the
     * Autonomous Database.
     * 
     */
    private String lifecycleDetails;
    /**
     * @return Possible values:
     *  STATE_UNSPECIFIED
     * PROVISIONING
     * AVAILABLE
     * STOPPING
     * STOPPED
     * STARTING
     * TERMINATING
     * TERMINATED
     * UNAVAILABLE
     * RESTORE_IN_PROGRESS
     * RESTORE_FAILED
     * BACKUP_IN_PROGRESS
     * SCALE_IN_PROGRESS
     * AVAILABLE_NEEDS_ATTENTION
     * UPDATING
     * MAINTENANCE_IN_PROGRESS
     * RESTARTING
     * RECREATING
     * ROLE_CHANGE_IN_PROGRESS
     * UPGRADING
     * INACCESSIBLE
     * STANDBY
     * 
     */
    private String state;

    private GetAutonomousDatabasePropertyLocalStandbyDb() {}
    /**
     * @return The date and time the Autonomous Data Guard role was switched for the
     * standby Autonomous Database.
     * 
     */
    public String dataGuardRoleChangedTime() {
        return this.dataGuardRoleChangedTime;
    }
    /**
     * @return The date and time the Disaster Recovery role was switched for the standby
     * Autonomous Database.
     * 
     */
    public String disasterRecoveryRoleChangedTime() {
        return this.disasterRecoveryRoleChangedTime;
    }
    /**
     * @return The amount of time, in seconds, that the data of the standby database lags
     * in comparison to the data of the primary database.
     * 
     */
    public String lagTimeDuration() {
        return this.lagTimeDuration;
    }
    /**
     * @return The additional details about the current lifecycle state of the
     * Autonomous Database.
     * 
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * @return Possible values:
     *  STATE_UNSPECIFIED
     * PROVISIONING
     * AVAILABLE
     * STOPPING
     * STOPPED
     * STARTING
     * TERMINATING
     * TERMINATED
     * UNAVAILABLE
     * RESTORE_IN_PROGRESS
     * RESTORE_FAILED
     * BACKUP_IN_PROGRESS
     * SCALE_IN_PROGRESS
     * AVAILABLE_NEEDS_ATTENTION
     * UPDATING
     * MAINTENANCE_IN_PROGRESS
     * RESTARTING
     * RECREATING
     * ROLE_CHANGE_IN_PROGRESS
     * UPGRADING
     * INACCESSIBLE
     * STANDBY
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutonomousDatabasePropertyLocalStandbyDb defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dataGuardRoleChangedTime;
        private String disasterRecoveryRoleChangedTime;
        private String lagTimeDuration;
        private String lifecycleDetails;
        private String state;
        public Builder() {}
        public Builder(GetAutonomousDatabasePropertyLocalStandbyDb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataGuardRoleChangedTime = defaults.dataGuardRoleChangedTime;
    	      this.disasterRecoveryRoleChangedTime = defaults.disasterRecoveryRoleChangedTime;
    	      this.lagTimeDuration = defaults.lagTimeDuration;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder dataGuardRoleChangedTime(String dataGuardRoleChangedTime) {
            if (dataGuardRoleChangedTime == null) {
              throw new MissingRequiredPropertyException("GetAutonomousDatabasePropertyLocalStandbyDb", "dataGuardRoleChangedTime");
            }
            this.dataGuardRoleChangedTime = dataGuardRoleChangedTime;
            return this;
        }
        @CustomType.Setter
        public Builder disasterRecoveryRoleChangedTime(String disasterRecoveryRoleChangedTime) {
            if (disasterRecoveryRoleChangedTime == null) {
              throw new MissingRequiredPropertyException("GetAutonomousDatabasePropertyLocalStandbyDb", "disasterRecoveryRoleChangedTime");
            }
            this.disasterRecoveryRoleChangedTime = disasterRecoveryRoleChangedTime;
            return this;
        }
        @CustomType.Setter
        public Builder lagTimeDuration(String lagTimeDuration) {
            if (lagTimeDuration == null) {
              throw new MissingRequiredPropertyException("GetAutonomousDatabasePropertyLocalStandbyDb", "lagTimeDuration");
            }
            this.lagTimeDuration = lagTimeDuration;
            return this;
        }
        @CustomType.Setter
        public Builder lifecycleDetails(String lifecycleDetails) {
            if (lifecycleDetails == null) {
              throw new MissingRequiredPropertyException("GetAutonomousDatabasePropertyLocalStandbyDb", "lifecycleDetails");
            }
            this.lifecycleDetails = lifecycleDetails;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetAutonomousDatabasePropertyLocalStandbyDb", "state");
            }
            this.state = state;
            return this;
        }
        public GetAutonomousDatabasePropertyLocalStandbyDb build() {
            final var _resultValue = new GetAutonomousDatabasePropertyLocalStandbyDb();
            _resultValue.dataGuardRoleChangedTime = dataGuardRoleChangedTime;
            _resultValue.disasterRecoveryRoleChangedTime = disasterRecoveryRoleChangedTime;
            _resultValue.lagTimeDuration = lagTimeDuration;
            _resultValue.lifecycleDetails = lifecycleDetails;
            _resultValue.state = state;
            return _resultValue;
        }
    }
}
