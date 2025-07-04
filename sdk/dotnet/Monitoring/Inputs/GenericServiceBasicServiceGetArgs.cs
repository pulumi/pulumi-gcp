// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Monitoring.Inputs
{

    public sealed class GenericServiceBasicServiceGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("serviceLabels")]
        private InputMap<string>? _serviceLabels;

        /// <summary>
        /// Labels that specify the resource that emits the monitoring data
        /// which is used for SLO reporting of this `Service`.
        /// </summary>
        public InputMap<string> ServiceLabels
        {
            get => _serviceLabels ?? (_serviceLabels = new InputMap<string>());
            set => _serviceLabels = value;
        }

        /// <summary>
        /// The type of service that this basic service defines, e.g.
        /// APP_ENGINE service type
        /// </summary>
        [Input("serviceType")]
        public Input<string>? ServiceType { get; set; }

        public GenericServiceBasicServiceGetArgs()
        {
        }
        public static new GenericServiceBasicServiceGetArgs Empty => new GenericServiceBasicServiceGetArgs();
    }
}
