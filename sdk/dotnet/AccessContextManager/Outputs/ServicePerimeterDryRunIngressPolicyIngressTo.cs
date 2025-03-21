// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AccessContextManager.Outputs
{

    [OutputType]
    public sealed class ServicePerimeterDryRunIngressPolicyIngressTo
    {
        /// <summary>
        /// A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
        /// are allowed to perform in this `ServicePerimeter`.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ServicePerimeterDryRunIngressPolicyIngressToOperation> Operations;
        /// <summary>
        /// A list of resources, currently only projects in the form
        /// `projects/&lt;projectnumber&gt;`, protected by this `ServicePerimeter`
        /// that are allowed to be accessed by sources defined in the
        /// corresponding `IngressFrom`. A request matches if it contains
        /// a resource in this list. If `*` is specified for resources,
        /// then this `IngressTo` rule will authorize access to all
        /// resources inside the perimeter, provided that the request
        /// also matches the `operations` field.
        /// </summary>
        public readonly ImmutableArray<string> Resources;

        [OutputConstructor]
        private ServicePerimeterDryRunIngressPolicyIngressTo(
            ImmutableArray<Outputs.ServicePerimeterDryRunIngressPolicyIngressToOperation> operations,

            ImmutableArray<string> resources)
        {
            Operations = operations;
            Resources = resources;
        }
    }
}
