// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Outputs
{

    [OutputType]
    public sealed class OsPolicyAssignmentOsPolicyResourceGroupResourceFile
    {
        /// <summary>
        /// A a file with this content. The size of the content
        /// is limited to 1024 characters.
        /// </summary>
        public readonly string? Content;
        /// <summary>
        /// A remote or local source. Structure is
        /// documented below.
        /// </summary>
        public readonly Outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileFile? File;
        /// <summary>
        /// The absolute path of the file within the VM.
        /// </summary>
        public readonly string Path;
        /// <summary>
        /// Consists of three octal digits which represent, in
        /// order, the permissions of the owner, group, and other users for the file
        /// (similarly to the numeric mode used in the linux chmod utility). Each digit
        /// represents a three bit number with the 4 bit corresponding to the read
        /// permissions, the 2 bit corresponds to the write bit, and the one bit
        /// corresponds to the execute permission. Default behavior is 755. Below are
        /// some examples of permissions and their associated values: read, write, and
        /// execute: 7 read and execute: 5 read and write: 6 read only: 4
        /// </summary>
        public readonly string? Permissions;
        /// <summary>
        /// Desired state of the file. Possible values are:
        /// `DESIRED_STATE_UNSPECIFIED`, `PRESENT`, `ABSENT`, `CONTENTS_MATCH`.
        /// </summary>
        public readonly string State;

        [OutputConstructor]
        private OsPolicyAssignmentOsPolicyResourceGroupResourceFile(
            string? content,

            Outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileFile? file,

            string path,

            string? permissions,

            string state)
        {
            Content = content;
            File = file;
            Path = path;
            Permissions = permissions;
            State = state;
        }
    }
}
