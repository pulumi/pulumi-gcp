// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AssuredWorkloads.Inputs
{

    public sealed class WorkloadPartnerPermissionsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. Allow partner to view violation alerts.
        /// </summary>
        [Input("assuredWorkloadsMonitoring")]
        public Input<bool>? AssuredWorkloadsMonitoring { get; set; }

        /// <summary>
        /// Allow the partner to view inspectability logs and monitoring violations.
        /// </summary>
        [Input("dataLogsViewer")]
        public Input<bool>? DataLogsViewer { get; set; }

        /// <summary>
        /// Optional. Allow partner to view access approval logs.
        /// </summary>
        [Input("serviceAccessApprover")]
        public Input<bool>? ServiceAccessApprover { get; set; }

        public WorkloadPartnerPermissionsGetArgs()
        {
        }
        public static new WorkloadPartnerPermissionsGetArgs Empty => new WorkloadPartnerPermissionsGetArgs();
    }
}