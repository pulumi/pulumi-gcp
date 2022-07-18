// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Outputs
{

    [OutputType]
    public sealed class ConnectionAwsAccessRole
    {
        /// <summary>
        /// The user’s AWS IAM Role that trusts the Google-owned AWS IAM user Connection.
        /// </summary>
        public readonly string IamRoleId;
        /// <summary>
        /// -
        /// A unique Google-owned and Google-generated identity for the Connection. This identity will be used to access the user's AWS IAM Role.
        /// </summary>
        public readonly string? Identity;

        [OutputConstructor]
        private ConnectionAwsAccessRole(
            string iamRoleId,

            string? identity)
        {
            IamRoleId = iamRoleId;
            Identity = identity;
        }
    }
}