// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeBackup.Inputs
{

    public sealed class RestorePlanRestoreConfigTransformationRuleResourceFilterGroupKindGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// API Group string of a Kubernetes resource, e.g.
        /// "apiextensions.k8s.io", "storage.k8s.io", etc.
        /// Use empty string for core group.
        /// </summary>
        [Input("resourceGroup")]
        public Input<string>? ResourceGroup { get; set; }

        /// <summary>
        /// Kind of a Kubernetes resource, e.g.
        /// "CustomResourceDefinition", "StorageClass", etc.
        /// </summary>
        [Input("resourceKind")]
        public Input<string>? ResourceKind { get; set; }

        public RestorePlanRestoreConfigTransformationRuleResourceFilterGroupKindGetArgs()
        {
        }
        public static new RestorePlanRestoreConfigTransformationRuleResourceFilterGroupKindGetArgs Empty => new RestorePlanRestoreConfigTransformationRuleResourceFilterGroupKindGetArgs();
    }
}