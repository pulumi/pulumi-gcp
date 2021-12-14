// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Inputs
{

    public sealed class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
        /// </summary>
        [Input("pullDeps")]
        public Input<bool>? PullDeps { get; set; }

        /// <summary>
        /// Required. A deb package.
        /// </summary>
        [Input("source", required: true)]
        public Input<Inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs> Source { get; set; } = null!;

        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmArgs()
        {
        }
    }
}