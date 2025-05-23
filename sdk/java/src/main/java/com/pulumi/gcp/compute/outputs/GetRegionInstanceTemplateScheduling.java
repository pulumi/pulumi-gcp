// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.outputs.GetRegionInstanceTemplateSchedulingGracefulShutdown;
import com.pulumi.gcp.compute.outputs.GetRegionInstanceTemplateSchedulingLocalSsdRecoveryTimeout;
import com.pulumi.gcp.compute.outputs.GetRegionInstanceTemplateSchedulingMaxRunDuration;
import com.pulumi.gcp.compute.outputs.GetRegionInstanceTemplateSchedulingNodeAffinity;
import com.pulumi.gcp.compute.outputs.GetRegionInstanceTemplateSchedulingOnInstanceStopAction;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRegionInstanceTemplateScheduling {
    /**
     * @return Specifies whether the instance should be
     * automatically restarted if it is terminated by Compute Engine (not
     * terminated by a user). This defaults to true.
     * 
     */
    private Boolean automaticRestart;
    /**
     * @return Specifies the availability domain, which this instance should be scheduled on.
     * 
     */
    private Integer availabilityDomain;
    /**
     * @return Settings for the instance to perform a graceful shutdown.
     * 
     */
    private List<GetRegionInstanceTemplateSchedulingGracefulShutdown> gracefulShutdowns;
    /**
     * @return Beta Time in seconds for host error detection.
     * 
     */
    private Integer hostErrorTimeoutSeconds;
    /**
     * @return Describe the type of termination action for `SPOT` VM. Can be `STOP` or `DELETE`.  Read more on [here](https://cloud.google.com/compute/docs/instances/create-use-spot)
     * 
     */
    private String instanceTerminationAction;
    /**
     * @return Specifies the maximum amount of time a Local Ssd Vm should wait while
     *   recovery of the Local Ssd state is attempted. Its value should be in
     *   between 0 and 168 hours with hour granularity and the default value being 1
     *   hour.
     * 
     */
    private List<GetRegionInstanceTemplateSchedulingLocalSsdRecoveryTimeout> localSsdRecoveryTimeouts;
    /**
     * @return Specifies the frequency of planned maintenance events. The accepted values are: PERIODIC
     * 
     */
    private String maintenanceInterval;
    /**
     * @return The timeout for new network connections to hosts.
     * 
     */
    private List<GetRegionInstanceTemplateSchedulingMaxRunDuration> maxRunDurations;
    /**
     * @return Minimum number of cpus for the instance.
     * 
     */
    private Integer minNodeCpus;
    /**
     * @return Specifies node affinities or anti-affinities
     * to determine which sole-tenant nodes your instances and managed instance
     * groups will use as host systems. Read more on sole-tenant node creation
     * [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
     * Structure documented below.
     * 
     */
    private List<GetRegionInstanceTemplateSchedulingNodeAffinity> nodeAffinities;
    /**
     * @return Defines the maintenance behavior for this
     * instance.
     * 
     */
    private String onHostMaintenance;
    /**
     * @return Defines the behaviour for instances with the instance_termination_action.
     * 
     */
    private List<GetRegionInstanceTemplateSchedulingOnInstanceStopAction> onInstanceStopActions;
    /**
     * @return Allows instance to be preempted. This defaults to
     * false. Read more on this
     * [here](https://cloud.google.com/compute/docs/instances/preemptible).
     * 
     */
    private Boolean preemptible;
    /**
     * @return Describe the type of preemptible VM.
     * 
     */
    private String provisioningModel;
    /**
     * @return Specifies the timestamp, when the instance will be terminated,
     * in RFC3339 text format. If specified, the instance termination action
     * will be performed at the termination time.
     * 
     */
    private String terminationTime;

    private GetRegionInstanceTemplateScheduling() {}
    /**
     * @return Specifies whether the instance should be
     * automatically restarted if it is terminated by Compute Engine (not
     * terminated by a user). This defaults to true.
     * 
     */
    public Boolean automaticRestart() {
        return this.automaticRestart;
    }
    /**
     * @return Specifies the availability domain, which this instance should be scheduled on.
     * 
     */
    public Integer availabilityDomain() {
        return this.availabilityDomain;
    }
    /**
     * @return Settings for the instance to perform a graceful shutdown.
     * 
     */
    public List<GetRegionInstanceTemplateSchedulingGracefulShutdown> gracefulShutdowns() {
        return this.gracefulShutdowns;
    }
    /**
     * @return Beta Time in seconds for host error detection.
     * 
     */
    public Integer hostErrorTimeoutSeconds() {
        return this.hostErrorTimeoutSeconds;
    }
    /**
     * @return Describe the type of termination action for `SPOT` VM. Can be `STOP` or `DELETE`.  Read more on [here](https://cloud.google.com/compute/docs/instances/create-use-spot)
     * 
     */
    public String instanceTerminationAction() {
        return this.instanceTerminationAction;
    }
    /**
     * @return Specifies the maximum amount of time a Local Ssd Vm should wait while
     *   recovery of the Local Ssd state is attempted. Its value should be in
     *   between 0 and 168 hours with hour granularity and the default value being 1
     *   hour.
     * 
     */
    public List<GetRegionInstanceTemplateSchedulingLocalSsdRecoveryTimeout> localSsdRecoveryTimeouts() {
        return this.localSsdRecoveryTimeouts;
    }
    /**
     * @return Specifies the frequency of planned maintenance events. The accepted values are: PERIODIC
     * 
     */
    public String maintenanceInterval() {
        return this.maintenanceInterval;
    }
    /**
     * @return The timeout for new network connections to hosts.
     * 
     */
    public List<GetRegionInstanceTemplateSchedulingMaxRunDuration> maxRunDurations() {
        return this.maxRunDurations;
    }
    /**
     * @return Minimum number of cpus for the instance.
     * 
     */
    public Integer minNodeCpus() {
        return this.minNodeCpus;
    }
    /**
     * @return Specifies node affinities or anti-affinities
     * to determine which sole-tenant nodes your instances and managed instance
     * groups will use as host systems. Read more on sole-tenant node creation
     * [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
     * Structure documented below.
     * 
     */
    public List<GetRegionInstanceTemplateSchedulingNodeAffinity> nodeAffinities() {
        return this.nodeAffinities;
    }
    /**
     * @return Defines the maintenance behavior for this
     * instance.
     * 
     */
    public String onHostMaintenance() {
        return this.onHostMaintenance;
    }
    /**
     * @return Defines the behaviour for instances with the instance_termination_action.
     * 
     */
    public List<GetRegionInstanceTemplateSchedulingOnInstanceStopAction> onInstanceStopActions() {
        return this.onInstanceStopActions;
    }
    /**
     * @return Allows instance to be preempted. This defaults to
     * false. Read more on this
     * [here](https://cloud.google.com/compute/docs/instances/preemptible).
     * 
     */
    public Boolean preemptible() {
        return this.preemptible;
    }
    /**
     * @return Describe the type of preemptible VM.
     * 
     */
    public String provisioningModel() {
        return this.provisioningModel;
    }
    /**
     * @return Specifies the timestamp, when the instance will be terminated,
     * in RFC3339 text format. If specified, the instance termination action
     * will be performed at the termination time.
     * 
     */
    public String terminationTime() {
        return this.terminationTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstanceTemplateScheduling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean automaticRestart;
        private Integer availabilityDomain;
        private List<GetRegionInstanceTemplateSchedulingGracefulShutdown> gracefulShutdowns;
        private Integer hostErrorTimeoutSeconds;
        private String instanceTerminationAction;
        private List<GetRegionInstanceTemplateSchedulingLocalSsdRecoveryTimeout> localSsdRecoveryTimeouts;
        private String maintenanceInterval;
        private List<GetRegionInstanceTemplateSchedulingMaxRunDuration> maxRunDurations;
        private Integer minNodeCpus;
        private List<GetRegionInstanceTemplateSchedulingNodeAffinity> nodeAffinities;
        private String onHostMaintenance;
        private List<GetRegionInstanceTemplateSchedulingOnInstanceStopAction> onInstanceStopActions;
        private Boolean preemptible;
        private String provisioningModel;
        private String terminationTime;
        public Builder() {}
        public Builder(GetRegionInstanceTemplateScheduling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.availabilityDomain = defaults.availabilityDomain;
    	      this.gracefulShutdowns = defaults.gracefulShutdowns;
    	      this.hostErrorTimeoutSeconds = defaults.hostErrorTimeoutSeconds;
    	      this.instanceTerminationAction = defaults.instanceTerminationAction;
    	      this.localSsdRecoveryTimeouts = defaults.localSsdRecoveryTimeouts;
    	      this.maintenanceInterval = defaults.maintenanceInterval;
    	      this.maxRunDurations = defaults.maxRunDurations;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.onInstanceStopActions = defaults.onInstanceStopActions;
    	      this.preemptible = defaults.preemptible;
    	      this.provisioningModel = defaults.provisioningModel;
    	      this.terminationTime = defaults.terminationTime;
        }

        @CustomType.Setter
        public Builder automaticRestart(Boolean automaticRestart) {
            if (automaticRestart == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceTemplateScheduling", "automaticRestart");
            }
            this.automaticRestart = automaticRestart;
            return this;
        }
        @CustomType.Setter
        public Builder availabilityDomain(Integer availabilityDomain) {
            if (availabilityDomain == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceTemplateScheduling", "availabilityDomain");
            }
            this.availabilityDomain = availabilityDomain;
            return this;
        }
        @CustomType.Setter
        public Builder gracefulShutdowns(List<GetRegionInstanceTemplateSchedulingGracefulShutdown> gracefulShutdowns) {
            if (gracefulShutdowns == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceTemplateScheduling", "gracefulShutdowns");
            }
            this.gracefulShutdowns = gracefulShutdowns;
            return this;
        }
        public Builder gracefulShutdowns(GetRegionInstanceTemplateSchedulingGracefulShutdown... gracefulShutdowns) {
            return gracefulShutdowns(List.of(gracefulShutdowns));
        }
        @CustomType.Setter
        public Builder hostErrorTimeoutSeconds(Integer hostErrorTimeoutSeconds) {
            if (hostErrorTimeoutSeconds == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceTemplateScheduling", "hostErrorTimeoutSeconds");
            }
            this.hostErrorTimeoutSeconds = hostErrorTimeoutSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder instanceTerminationAction(String instanceTerminationAction) {
            if (instanceTerminationAction == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceTemplateScheduling", "instanceTerminationAction");
            }
            this.instanceTerminationAction = instanceTerminationAction;
            return this;
        }
        @CustomType.Setter
        public Builder localSsdRecoveryTimeouts(List<GetRegionInstanceTemplateSchedulingLocalSsdRecoveryTimeout> localSsdRecoveryTimeouts) {
            if (localSsdRecoveryTimeouts == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceTemplateScheduling", "localSsdRecoveryTimeouts");
            }
            this.localSsdRecoveryTimeouts = localSsdRecoveryTimeouts;
            return this;
        }
        public Builder localSsdRecoveryTimeouts(GetRegionInstanceTemplateSchedulingLocalSsdRecoveryTimeout... localSsdRecoveryTimeouts) {
            return localSsdRecoveryTimeouts(List.of(localSsdRecoveryTimeouts));
        }
        @CustomType.Setter
        public Builder maintenanceInterval(String maintenanceInterval) {
            if (maintenanceInterval == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceTemplateScheduling", "maintenanceInterval");
            }
            this.maintenanceInterval = maintenanceInterval;
            return this;
        }
        @CustomType.Setter
        public Builder maxRunDurations(List<GetRegionInstanceTemplateSchedulingMaxRunDuration> maxRunDurations) {
            if (maxRunDurations == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceTemplateScheduling", "maxRunDurations");
            }
            this.maxRunDurations = maxRunDurations;
            return this;
        }
        public Builder maxRunDurations(GetRegionInstanceTemplateSchedulingMaxRunDuration... maxRunDurations) {
            return maxRunDurations(List.of(maxRunDurations));
        }
        @CustomType.Setter
        public Builder minNodeCpus(Integer minNodeCpus) {
            if (minNodeCpus == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceTemplateScheduling", "minNodeCpus");
            }
            this.minNodeCpus = minNodeCpus;
            return this;
        }
        @CustomType.Setter
        public Builder nodeAffinities(List<GetRegionInstanceTemplateSchedulingNodeAffinity> nodeAffinities) {
            if (nodeAffinities == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceTemplateScheduling", "nodeAffinities");
            }
            this.nodeAffinities = nodeAffinities;
            return this;
        }
        public Builder nodeAffinities(GetRegionInstanceTemplateSchedulingNodeAffinity... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }
        @CustomType.Setter
        public Builder onHostMaintenance(String onHostMaintenance) {
            if (onHostMaintenance == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceTemplateScheduling", "onHostMaintenance");
            }
            this.onHostMaintenance = onHostMaintenance;
            return this;
        }
        @CustomType.Setter
        public Builder onInstanceStopActions(List<GetRegionInstanceTemplateSchedulingOnInstanceStopAction> onInstanceStopActions) {
            if (onInstanceStopActions == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceTemplateScheduling", "onInstanceStopActions");
            }
            this.onInstanceStopActions = onInstanceStopActions;
            return this;
        }
        public Builder onInstanceStopActions(GetRegionInstanceTemplateSchedulingOnInstanceStopAction... onInstanceStopActions) {
            return onInstanceStopActions(List.of(onInstanceStopActions));
        }
        @CustomType.Setter
        public Builder preemptible(Boolean preemptible) {
            if (preemptible == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceTemplateScheduling", "preemptible");
            }
            this.preemptible = preemptible;
            return this;
        }
        @CustomType.Setter
        public Builder provisioningModel(String provisioningModel) {
            if (provisioningModel == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceTemplateScheduling", "provisioningModel");
            }
            this.provisioningModel = provisioningModel;
            return this;
        }
        @CustomType.Setter
        public Builder terminationTime(String terminationTime) {
            if (terminationTime == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceTemplateScheduling", "terminationTime");
            }
            this.terminationTime = terminationTime;
            return this;
        }
        public GetRegionInstanceTemplateScheduling build() {
            final var _resultValue = new GetRegionInstanceTemplateScheduling();
            _resultValue.automaticRestart = automaticRestart;
            _resultValue.availabilityDomain = availabilityDomain;
            _resultValue.gracefulShutdowns = gracefulShutdowns;
            _resultValue.hostErrorTimeoutSeconds = hostErrorTimeoutSeconds;
            _resultValue.instanceTerminationAction = instanceTerminationAction;
            _resultValue.localSsdRecoveryTimeouts = localSsdRecoveryTimeouts;
            _resultValue.maintenanceInterval = maintenanceInterval;
            _resultValue.maxRunDurations = maxRunDurations;
            _resultValue.minNodeCpus = minNodeCpus;
            _resultValue.nodeAffinities = nodeAffinities;
            _resultValue.onHostMaintenance = onHostMaintenance;
            _resultValue.onInstanceStopActions = onInstanceStopActions;
            _resultValue.preemptible = preemptible;
            _resultValue.provisioningModel = provisioningModel;
            _resultValue.terminationTime = terminationTime;
            return _resultValue;
        }
    }
}
