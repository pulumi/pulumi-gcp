// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Sql.Inputs
{

    public sealed class UserSqlServerUserDetailGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("serverRoles")]
        private InputList<string>? _serverRoles;
        public InputList<string> ServerRoles
        {
            get => _serverRoles ?? (_serverRoles = new InputList<string>());
            set => _serverRoles = value;
        }

        public UserSqlServerUserDetailGetArgs()
        {
        }
        public static new UserSqlServerUserDetailGetArgs Empty => new UserSqlServerUserDetailGetArgs();
    }
}