// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InstanceSchedulingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies if the instance should be
        /// restarted if it was terminated by Compute Engine (not a user).
        /// Defaults to true.
        /// </summary>
        [Input("automaticRestart")]
        public Input<bool>? AutomaticRestart { get; set; }

        /// <summary>
        /// Specifies the availability domain to place the instance in. The value must be a number between 1 and the number of availability domains specified in the spread placement policy attached to the instance.
        /// </summary>
        [Input("availabilityDomain")]
        public Input<int>? AvailabilityDomain { get; set; }

        /// <summary>
        /// Settings for the instance to perform a graceful shutdown. Structure is documented below.
        /// </summary>
        [Input("gracefulShutdown")]
        public Input<Inputs.InstanceSchedulingGracefulShutdownArgs>? GracefulShutdown { get; set; }

        /// <summary>
        /// Specifies the time in seconds for host error detection, the value must be within the range of [90, 330] with the increment of 30, if unset, the default behavior of host error recovery will be used.
        /// </summary>
        [Input("hostErrorTimeoutSeconds")]
        public Input<int>? HostErrorTimeoutSeconds { get; set; }

        /// <summary>
        /// Describe the type of termination action for VM. Can be `STOP` or `DELETE`.  Read more on [here](https://cloud.google.com/compute/docs/instances/create-use-spot)
        /// </summary>
        [Input("instanceTerminationAction")]
        public Input<string>? InstanceTerminationAction { get; set; }

        /// <summary>
        /// Specifies the maximum amount of time a Local Ssd Vm should wait while
        ///   recovery of the Local Ssd state is attempted. Its value should be in
        ///   between 0 and 168 hours with hour granularity and the default value being 1
        ///   hour.
        /// </summary>
        [Input("localSsdRecoveryTimeout")]
        public Input<Inputs.InstanceSchedulingLocalSsdRecoveryTimeoutArgs>? LocalSsdRecoveryTimeout { get; set; }

        /// <summary>
        /// Specifies the frequency of planned maintenance events. The accepted values are: `PERIODIC`.
        /// </summary>
        [Input("maintenanceInterval")]
        public Input<string>? MaintenanceInterval { get; set; }

        /// <summary>
        /// The duration of the instance. Instance will run and be terminated after then, the termination action could be defined in `instance_termination_action`. Structure is documented below.
        /// </summary>
        [Input("maxRunDuration")]
        public Input<Inputs.InstanceSchedulingMaxRunDurationArgs>? MaxRunDuration { get; set; }

        /// <summary>
        /// The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
        /// </summary>
        [Input("minNodeCpus")]
        public Input<int>? MinNodeCpus { get; set; }

        [Input("nodeAffinities")]
        private InputList<Inputs.InstanceSchedulingNodeAffinityArgs>? _nodeAffinities;

        /// <summary>
        /// Specifies node affinities or anti-affinities
        /// to determine which sole-tenant nodes your instances and managed instance
        /// groups will use as host systems. Read more on sole-tenant node creation
        /// [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
        /// Structure documented below.
        /// </summary>
        public InputList<Inputs.InstanceSchedulingNodeAffinityArgs> NodeAffinities
        {
            get => _nodeAffinities ?? (_nodeAffinities = new InputList<Inputs.InstanceSchedulingNodeAffinityArgs>());
            set => _nodeAffinities = value;
        }

        /// <summary>
        /// Describes maintenance behavior for the
        /// instance. Can be MIGRATE or TERMINATE, for more info, read
        /// [here](https://cloud.google.com/compute/docs/instances/setting-instance-scheduling-options).
        /// </summary>
        [Input("onHostMaintenance")]
        public Input<string>? OnHostMaintenance { get; set; }

        /// <summary>
        /// Specifies the action to be performed when the instance is terminated using `max_run_duration` and `STOP` `instance_termination_action`. Only support `true` `discard_local_ssd` at this point. Structure is documented below.
        /// </summary>
        [Input("onInstanceStopAction")]
        public Input<Inputs.InstanceSchedulingOnInstanceStopActionArgs>? OnInstanceStopAction { get; set; }

        /// <summary>
        /// Specifies if the instance is preemptible.
        /// If this field is set to true, then `automatic_restart` must be
        /// set to false.  Defaults to false.
        /// </summary>
        [Input("preemptible")]
        public Input<bool>? Preemptible { get; set; }

        /// <summary>
        /// Describe the type of preemptible VM. This field accepts the value `STANDARD` or `SPOT`. If the value is `STANDARD`, there will be no discount. If this   is set to `SPOT`,
        /// `preemptible` should be `true` and `automatic_restart` should be
        /// `false`. For more info about
        /// `SPOT`, read [here](https://cloud.google.com/compute/docs/instances/spot)
        /// </summary>
        [Input("provisioningModel")]
        public Input<string>? ProvisioningModel { get; set; }

        /// <summary>
        /// Specifies the timestamp, when the instance will be terminated, in RFC3339 text format. If specified, the instance termination action will be performed at the termination time.
        /// </summary>
        [Input("terminationTime")]
        public Input<string>? TerminationTime { get; set; }

        public InstanceSchedulingArgs()
        {
        }
        public static new InstanceSchedulingArgs Empty => new InstanceSchedulingArgs();
    }
}
