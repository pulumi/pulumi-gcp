// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterNodeConfigKubeletConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedUnsafeSysctls")]
        private InputList<string>? _allowedUnsafeSysctls;

        /// <summary>
        /// Defines a comma-separated allowlist of unsafe sysctls or sysctl patterns which can be set on the Pods. The allowed sysctl groups are `kernel.shm*`, `kernel.msg*`, `kernel.sem`, `fs.mqueue.*`, and `net.*`.
        /// </summary>
        public InputList<string> AllowedUnsafeSysctls
        {
            get => _allowedUnsafeSysctls ?? (_allowedUnsafeSysctls = new InputList<string>());
            set => _allowedUnsafeSysctls = value;
        }

        /// <summary>
        /// Defines the maximum number of container log files that can be present for a container. The integer must be between 2 and 10, inclusive.
        /// </summary>
        [Input("containerLogMaxFiles")]
        public Input<int>? ContainerLogMaxFiles { get; set; }

        /// <summary>
        /// Defines the maximum size of the
        /// container log file before it is rotated. Specified as a positive number and a
        /// unit suffix, such as `"100Ki"`, `"10Mi"`. Valid units are "Ki", "Mi", "Gi".
        /// The value must be between `"10Mi"` and `"500Mi"`, inclusive. And the total container log size
        /// (`container_log_max_size` * `container_log_max_files`) cannot exceed 1% of the total storage of the node.
        /// </summary>
        [Input("containerLogMaxSize")]
        public Input<string>? ContainerLogMaxSize { get; set; }

        /// <summary>
        /// If true, enables CPU CFS quota enforcement for
        /// containers that specify CPU limits.
        /// </summary>
        [Input("cpuCfsQuota")]
        public Input<bool>? CpuCfsQuota { get; set; }

        /// <summary>
        /// The CPU CFS quota period value. Specified
        /// as a sequence of decimal numbers, each with optional fraction and a unit suffix,
        /// such as `"300ms"`. Valid time units are "ns", "us" (or "µs"), "ms", "s", "m",
        /// "h". The value must be a positive duration.
        /// </summary>
        [Input("cpuCfsQuotaPeriod")]
        public Input<string>? CpuCfsQuotaPeriod { get; set; }

        /// <summary>
        /// The CPU management policy on the node. See
        /// [K8S CPU Management Policies](https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/).
        /// One of `"none"` or `"static"`. If unset (or set to the empty string `""`), the API will treat the field as if set to "none".
        /// Prior to the 6.4.0 this field was marked as required. The workaround for the required field
        /// is setting the empty string `""`, which will function identically to not setting this field.
        /// </summary>
        [Input("cpuManagerPolicy")]
        public Input<string>? CpuManagerPolicy { get; set; }

        /// <summary>
        /// Defines the percent of disk usage after which image garbage collection is always run. The integer must be between 10 and 85, inclusive.
        /// </summary>
        [Input("imageGcHighThresholdPercent")]
        public Input<int>? ImageGcHighThresholdPercent { get; set; }

        /// <summary>
        /// Defines the percent of disk usage before which image garbage collection is never run. Lowest disk usage to garbage collect to. The integer must be between 10 and 85, inclusive.
        /// </summary>
        [Input("imageGcLowThresholdPercent")]
        public Input<int>? ImageGcLowThresholdPercent { get; set; }

        /// <summary>
        /// Defines the maximum age an image can be unused before it is garbage collected. Specified as a sequence of decimal numbers, each with optional fraction and a unit suffix, such as `"300s"`, `"1.5m"`, and `"2h45m"`. Valid time units are "ns", "us" (or "µs"), "ms", "s", "m", "h". The value must be a positive duration.
        /// </summary>
        [Input("imageMaximumGcAge")]
        public Input<string>? ImageMaximumGcAge { get; set; }

        /// <summary>
        /// Defines the minimum age for an unused image before it is garbage collected. Specified as a sequence of decimal numbers, each with optional fraction and a unit suffix, such as `"300s"`, `"1.5m"`. The value cannot be greater than "2m".
        /// </summary>
        [Input("imageMinimumGcAge")]
        public Input<string>? ImageMinimumGcAge { get; set; }

        /// <summary>
        /// Controls whether the kubelet read-only port is enabled. It is strongly recommended to set this to `FALSE`. Possible values: `TRUE`, `FALSE`.
        /// </summary>
        [Input("insecureKubeletReadonlyPortEnabled")]
        public Input<string>? InsecureKubeletReadonlyPortEnabled { get; set; }

        /// <summary>
        /// Controls the maximum number of processes allowed to run in a pod. The value must be greater than or equal to 1024 and less than 4194304.
        /// </summary>
        [Input("podPidsLimit")]
        public Input<int>? PodPidsLimit { get; set; }

        public ClusterNodeConfigKubeletConfigGetArgs()
        {
        }
        public static new ClusterNodeConfigKubeletConfigGetArgs Empty => new ClusterNodeConfigKubeletConfigGetArgs();
    }
}
