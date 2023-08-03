// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalAdminClusterValidationCheckStatusArgs : global::Pulumi.ResourceArgs
    {
        [Input("results")]
        private InputList<Inputs.BareMetalAdminClusterValidationCheckStatusResultArgs>? _results;

        /// <summary>
        /// (Output)
        /// Individual checks which failed as part of the Preflight check execution.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.BareMetalAdminClusterValidationCheckStatusResultArgs> Results
        {
            get => _results ?? (_results = new InputList<Inputs.BareMetalAdminClusterValidationCheckStatusResultArgs>());
            set => _results = value;
        }

        public BareMetalAdminClusterValidationCheckStatusArgs()
        {
        }
        public static new BareMetalAdminClusterValidationCheckStatusArgs Empty => new BareMetalAdminClusterValidationCheckStatusArgs();
    }
}