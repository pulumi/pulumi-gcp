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
    public sealed class ServicePerimeterEgressPolicyEgressToOperationMethodSelector
    {
        /// <summary>
        /// Value for `method` should be a valid method name for the corresponding
        /// `serviceName` in `ApiOperation`. If `*` used as value for method,
        /// then ALL methods and permissions are allowed.
        /// </summary>
        public readonly string? Method;
        /// <summary>
        /// Value for permission should be a valid Cloud IAM permission for the
        /// corresponding `serviceName` in `ApiOperation`.
        /// </summary>
        public readonly string? Permission;

        [OutputConstructor]
        private ServicePerimeterEgressPolicyEgressToOperationMethodSelector(
            string? method,

            string? permission)
        {
            Method = method;
            Permission = permission;
        }
    }
}