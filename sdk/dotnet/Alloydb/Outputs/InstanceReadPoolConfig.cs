// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Alloydb.Outputs
{

    [OutputType]
    public sealed class InstanceReadPoolConfig
    {
        /// <summary>
        /// Read capacity, i.e. number of nodes in a read pool instance.
        /// </summary>
        public readonly int? NodeCount;

        [OutputConstructor]
        private InstanceReadPoolConfig(int? nodeCount)
        {
            NodeCount = nodeCount;
        }
    }
}