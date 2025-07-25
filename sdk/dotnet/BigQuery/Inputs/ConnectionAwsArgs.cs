// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Inputs
{

    public sealed class ConnectionAwsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authentication using Google owned service account to assume into customer's AWS IAM Role.
        /// Structure is documented below.
        /// </summary>
        [Input("accessRole", required: true)]
        public Input<Inputs.ConnectionAwsAccessRoleArgs> AccessRole { get; set; } = null!;

        public ConnectionAwsArgs()
        {
        }
        public static new ConnectionAwsArgs Empty => new ConnectionAwsArgs();
    }
}
