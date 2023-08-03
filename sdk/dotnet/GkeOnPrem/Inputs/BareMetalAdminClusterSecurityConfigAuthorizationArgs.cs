// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalAdminClusterSecurityConfigAuthorizationArgs : global::Pulumi.ResourceArgs
    {
        [Input("adminUsers", required: true)]
        private InputList<Inputs.BareMetalAdminClusterSecurityConfigAuthorizationAdminUserArgs>? _adminUsers;

        /// <summary>
        /// Users that will be granted the cluster-admin role on the cluster, providing full access to the cluster.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.BareMetalAdminClusterSecurityConfigAuthorizationAdminUserArgs> AdminUsers
        {
            get => _adminUsers ?? (_adminUsers = new InputList<Inputs.BareMetalAdminClusterSecurityConfigAuthorizationAdminUserArgs>());
            set => _adminUsers = value;
        }

        public BareMetalAdminClusterSecurityConfigAuthorizationArgs()
        {
        }
        public static new BareMetalAdminClusterSecurityConfigAuthorizationArgs Empty => new BareMetalAdminClusterSecurityConfigAuthorizationArgs();
    }
}