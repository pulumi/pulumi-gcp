// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Sql.Outputs
{

    [OutputType]
    public sealed class UserPasswordPolicy
    {
        /// <summary>
        /// Number of failed attempts allowed before the user get locked.
        /// </summary>
        public readonly int? AllowedFailedAttempts;
        /// <summary>
        /// If true, the check that will lock user after too many failed login attempts will be enabled.
        /// </summary>
        public readonly bool? EnableFailedAttemptsCheck;
        /// <summary>
        /// If true, the user must specify the current password before changing the password. This flag is supported only for MySQL.
        /// </summary>
        public readonly bool? EnablePasswordVerification;
        /// <summary>
        /// Password expiration duration with one week grace period.
        /// </summary>
        public readonly string? PasswordExpirationDuration;
        public readonly ImmutableArray<Outputs.UserPasswordPolicyStatus> Statuses;

        [OutputConstructor]
        private UserPasswordPolicy(
            int? allowedFailedAttempts,

            bool? enableFailedAttemptsCheck,

            bool? enablePasswordVerification,

            string? passwordExpirationDuration,

            ImmutableArray<Outputs.UserPasswordPolicyStatus> statuses)
        {
            AllowedFailedAttempts = allowedFailedAttempts;
            EnableFailedAttemptsCheck = enableFailedAttemptsCheck;
            EnablePasswordVerification = enablePasswordVerification;
            PasswordExpirationDuration = passwordExpirationDuration;
            Statuses = statuses;
        }
    }
}