// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Projects.Inputs
{

    public sealed class IAMAuditConfigAuditLogConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("exemptedMembers")]
        private InputList<string>? _exemptedMembers;

        /// <summary>
        /// Identities that do not cause logging for this type of permission.  The format is the same as that for `members`.
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

        public IAMAuditConfigAuditLogConfigArgs()
        {
        }
        public static new IAMAuditConfigAuditLogConfigArgs Empty => new IAMAuditConfigAuditLogConfigArgs();
    }
}
