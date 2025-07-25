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
    public sealed class V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforce
    {
        /// <summary>
        /// Optional arguments to pass to the source during execution.
        /// </summary>
        public readonly ImmutableArray<string> Args;
        /// <summary>
        /// A remote or local file.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFile? File;
        /// <summary>
        /// The script interpreter to use.
        /// Possible values are: `NONE`, `SHELL`, `POWERSHELL`.
        /// </summary>
        public readonly string Interpreter;
        /// <summary>
        /// Only recorded for enforce Exec.
        /// Path to an output file (that is created by this Exec) whose
        /// content will be recorded in OSPolicyResourceCompliance after a
        /// successful run. Absence or failure to read this file will result in
        /// this ExecResource being non-compliant. Output file size is limited to
        /// 500K bytes.
        /// </summary>
        public readonly string? OutputFilePath;
        /// <summary>
        /// An inline script.
        /// The size of the script is limited to 32KiB.
        /// </summary>
        public readonly string? Script;

        [OutputConstructor]
        private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforce(
            ImmutableArray<string> args,

            Outputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFile? file,

            string interpreter,

            string? outputFilePath,

            string? script)
        {
            Args = args;
            File = file;
            Interpreter = interpreter;
            OutputFilePath = outputFilePath;
            Script = script;
        }
    }
}
