// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Organizations.Inputs
{

    public sealed class IamAuditConfigAuditLogConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("exemptedMembers")]
        private InputList<string>? _exemptedMembers;

        /// <summary>
        /// Identities that do not cause logging for this type of permission.
        /// Each entry can have one of the following values:
        /// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        /// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        /// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        /// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        /// </summary>
        public InputList<string> ExemptedMembers
        {
            get => _exemptedMembers ?? (_exemptedMembers = new InputList<string>());
            set => _exemptedMembers = value;
        }

        /// <summary>
        /// Permission type for which logging is to be configured.  Must be one of `DATA_READ`, `DATA_WRITE`, or `ADMIN_READ`.
        /// </summary>
        [Input("logType", required: true)]
        public Input<string> LogType { get; set; } = null!;

        public IamAuditConfigAuditLogConfigGetArgs()
        {
        }
        public static new IamAuditConfigAuditLogConfigGetArgs Empty => new IamAuditConfigAuditLogConfigGetArgs();
    }
}
