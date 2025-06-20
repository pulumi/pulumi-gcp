// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apphub.Inputs
{

    public sealed class ApplicationAttributesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("businessOwners")]
        private InputList<Inputs.ApplicationAttributesBusinessOwnerGetArgs>? _businessOwners;

        /// <summary>
        /// Optional. Business team that ensures user needs are met and value is delivered
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ApplicationAttributesBusinessOwnerGetArgs> BusinessOwners
        {
            get => _businessOwners ?? (_businessOwners = new InputList<Inputs.ApplicationAttributesBusinessOwnerGetArgs>());
            set => _businessOwners = value;
        }

        /// <summary>
        /// Criticality of the Application, Service, or Workload
        /// Structure is documented below.
        /// </summary>
        [Input("criticality")]
        public Input<Inputs.ApplicationAttributesCriticalityGetArgs>? Criticality { get; set; }

        [Input("developerOwners")]
        private InputList<Inputs.ApplicationAttributesDeveloperOwnerGetArgs>? _developerOwners;

        /// <summary>
        /// Optional. Developer team that owns development and coding.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ApplicationAttributesDeveloperOwnerGetArgs> DeveloperOwners
        {
            get => _developerOwners ?? (_developerOwners = new InputList<Inputs.ApplicationAttributesDeveloperOwnerGetArgs>());
            set => _developerOwners = value;
        }

        /// <summary>
        /// Environment of the Application, Service, or Workload
        /// Structure is documented below.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.ApplicationAttributesEnvironmentGetArgs>? Environment { get; set; }

        [Input("operatorOwners")]
        private InputList<Inputs.ApplicationAttributesOperatorOwnerGetArgs>? _operatorOwners;

        /// <summary>
        /// Optional. Operator team that ensures runtime and operations.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ApplicationAttributesOperatorOwnerGetArgs> OperatorOwners
        {
            get => _operatorOwners ?? (_operatorOwners = new InputList<Inputs.ApplicationAttributesOperatorOwnerGetArgs>());
            set => _operatorOwners = value;
        }

        public ApplicationAttributesGetArgs()
        {
        }
        public static new ApplicationAttributesGetArgs Empty => new ApplicationAttributesGetArgs();
    }
}
