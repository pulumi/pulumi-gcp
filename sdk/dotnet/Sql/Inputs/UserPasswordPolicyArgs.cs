// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Sql.Inputs
{

    public sealed class UserPasswordPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of failed attempts allowed before the user get locked.
        /// </summary>
        [Input("allowedFailedAttempts")]
        public Input<int>? AllowedFailedAttempts { get; set; }

        /// <summary>
        /// If true, the check that will lock user after too many failed login attempts will be enabled.
        /// </summary>
        [Input("enableFailedAttemptsCheck")]
        public Input<bool>? EnableFailedAttemptsCheck { get; set; }

        /// <summary>
        /// If true, the user must specify the current password before changing the password. This flag is supported only for MySQL.
        /// </summary>
        [Input("enablePasswordVerification")]
        public Input<bool>? EnablePasswordVerification { get; set; }

        /// <summary>
        /// Password expiration duration with one week grace period.
        /// </summary>
        [Input("passwordExpirationDuration")]
        public Input<string>? PasswordExpirationDuration { get; set; }

        [Input("statuses")]
        private InputList<Inputs.UserPasswordPolicyStatusArgs>? _statuses;
        public InputList<Inputs.UserPasswordPolicyStatusArgs> Statuses
        {
            get => _statuses ?? (_statuses = new InputList<Inputs.UserPasswordPolicyStatusArgs>());
            set => _statuses = value;
        }

        public UserPasswordPolicyArgs()
        {
        }
        public static new UserPasswordPolicyArgs Empty => new UserPasswordPolicyArgs();
    }
}