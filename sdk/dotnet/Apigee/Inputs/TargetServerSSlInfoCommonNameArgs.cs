// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apigee.Inputs
{

    public sealed class TargetServerSSlInfoCommonNameArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The TLS Common Name string of the certificate.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        /// <summary>
        /// Indicates whether the cert should be matched against as a wildcard cert.
        /// </summary>
        [Input("wildcardMatch")]
        public Input<bool>? WildcardMatch { get; set; }

        public TargetServerSSlInfoCommonNameArgs()
        {
        }
        public static new TargetServerSSlInfoCommonNameArgs Empty => new TargetServerSSlInfoCommonNameArgs();
    }
}