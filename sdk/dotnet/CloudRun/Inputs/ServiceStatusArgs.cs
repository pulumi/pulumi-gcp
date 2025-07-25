// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRun.Inputs
{

    public sealed class ServiceStatusArgs : global::Pulumi.ResourceArgs
    {
        [Input("conditions")]
        private InputList<Inputs.ServiceStatusConditionArgs>? _conditions;

        /// <summary>
        /// (Output)
        /// Array of observed Service Conditions, indicating the current ready state of the service.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ServiceStatusConditionArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.ServiceStatusConditionArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// (Output)
        /// From ConfigurationStatus. LatestCreatedRevisionName is the last revision that was created
        /// from this Service's Configuration. It might not be ready yet, for that use
        /// LatestReadyRevisionName.
        /// </summary>
        [Input("latestCreatedRevisionName")]
        public Input<string>? LatestCreatedRevisionName { get; set; }

        /// <summary>
        /// (Output)
        /// From ConfigurationStatus. LatestReadyRevisionName holds the name of the latest Revision
        /// stamped out from this Service's Configuration that has had its "Ready" condition become
        /// "True".
        /// </summary>
        [Input("latestReadyRevisionName")]
        public Input<string>? LatestReadyRevisionName { get; set; }

        /// <summary>
        /// (Output)
        /// ObservedGeneration is the 'Generation' of the Route that was last processed by the
        /// controller.
        /// Clients polling for completed reconciliation should poll until observedGeneration =
        /// metadata.generation and the Ready condition's status is True or False.
        /// </summary>
        [Input("observedGeneration")]
        public Input<int>? ObservedGeneration { get; set; }

        [Input("traffics")]
        private InputList<Inputs.ServiceStatusTrafficArgs>? _traffics;

        /// <summary>
        /// Traffic specifies how to distribute traffic over a collection of Knative Revisions
        /// and Configurations
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ServiceStatusTrafficArgs> Traffics
        {
            get => _traffics ?? (_traffics = new InputList<Inputs.ServiceStatusTrafficArgs>());
            set => _traffics = value;
        }

        /// <summary>
        /// (Output)
        /// URL displays the URL for accessing tagged traffic targets. URL is displayed in status,
        /// and is disallowed on spec. URL must contain a scheme (e.g. http://) and a hostname,
        /// but may not contain anything else (e.g. basic auth, url path, etc.)
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public ServiceStatusArgs()
        {
        }
        public static new ServiceStatusArgs Empty => new ServiceStatusArgs();
    }
}
