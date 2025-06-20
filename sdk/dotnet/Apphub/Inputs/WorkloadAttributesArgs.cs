// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apphub.Inputs
{

    public sealed class WorkloadAttributesArgs : global::Pulumi.ResourceArgs
    {
        [Input("businessOwners")]
        private InputList<Inputs.WorkloadAttributesBusinessOwnerArgs>? _businessOwners;

        /// <summary>
        /// Business team that ensures user needs are met and value is delivered
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.WorkloadAttributesBusinessOwnerArgs> BusinessOwners
        {
            get => _businessOwners ?? (_businessOwners = new InputList<Inputs.WorkloadAttributesBusinessOwnerArgs>());
            set => _businessOwners = value;
        }

        /// <summary>
        /// Criticality of the Application, Service, or Workload
        /// Structure is documented below.
        /// </summary>
        [Input("criticality")]
        public Input<Inputs.WorkloadAttributesCriticalityArgs>? Criticality { get; set; }

        [Input("developerOwners")]
        private InputList<Inputs.WorkloadAttributesDeveloperOwnerArgs>? _developerOwners;

        /// <summary>
        /// Developer team that owns development and coding.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.WorkloadAttributesDeveloperOwnerArgs> DeveloperOwners
        {
            get => _developerOwners ?? (_developerOwners = new InputList<Inputs.WorkloadAttributesDeveloperOwnerArgs>());
            set => _developerOwners = value;
        }

        /// <summary>
        /// Environment of the Application, Service, or Workload
        /// Structure is documented below.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.WorkloadAttributesEnvironmentArgs>? Environment { get; set; }

        [Input("operatorOwners")]
        private InputList<Inputs.WorkloadAttributesOperatorOwnerArgs>? _operatorOwners;

        /// <summary>
        /// Operator team that ensures runtime and operations.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.WorkloadAttributesOperatorOwnerArgs> OperatorOwners
        {
            get => _operatorOwners ?? (_operatorOwners = new InputList<Inputs.WorkloadAttributesOperatorOwnerArgs>());
            set => _operatorOwners = value;
        }

        public WorkloadAttributesArgs()
        {
        }
        public static new WorkloadAttributesArgs Empty => new WorkloadAttributesArgs();
    }
}
