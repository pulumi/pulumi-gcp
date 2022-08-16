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
    public sealed class DatabaseInstanceSettingsPasswordValidationPolicy
    {
        /// <summary>
        /// Checks if the password is a combination of lowercase, uppercase, numeric, and non-alphanumeric characters.
        /// </summary>
        public readonly string? Complexity;
        /// <summary>
        /// Prevents the use of the username in the password.
        /// </summary>
        public readonly bool? DisallowUsernameSubstring;
        /// <summary>
        /// Enables or disable the password validation policy.
        /// </summary>
        public readonly bool EnablePasswordPolicy;
        /// <summary>
        /// Specifies the minimum number of characters that the password must have.
        /// </summary>
        public readonly int? MinLength;
        /// <summary>
        /// Specifies the minimum duration after which you can change the password.
        /// </summary>
        public readonly string? PasswordChangeInterval;
        /// <summary>
        /// Specifies the number of previous passwords that you can't reuse.
        /// </summary>
        public readonly int? ReuseInterval;

        [OutputConstructor]
        private DatabaseInstanceSettingsPasswordValidationPolicy(
            string? complexity,

            bool? disallowUsernameSubstring,

            bool enablePasswordPolicy,

            int? minLength,

            string? passwordChangeInterval,

            int? reuseInterval)
        {
            Complexity = complexity;
            DisallowUsernameSubstring = disallowUsernameSubstring;
            EnablePasswordPolicy = enablePasswordPolicy;
            MinLength = minLength;
            PasswordChangeInterval = passwordChangeInterval;
            ReuseInterval = reuseInterval;
        }
    }
}