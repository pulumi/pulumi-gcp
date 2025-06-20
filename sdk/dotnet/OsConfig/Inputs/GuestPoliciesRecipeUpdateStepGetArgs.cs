// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Inputs
{

    public sealed class GuestPoliciesRecipeUpdateStepGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Extracts an archive into the specified directory.
        /// Structure is documented below.
        /// </summary>
        [Input("archiveExtraction")]
        public Input<Inputs.GuestPoliciesRecipeUpdateStepArchiveExtractionGetArgs>? ArchiveExtraction { get; set; }

        /// <summary>
        /// Installs a deb file via dpkg.
        /// Structure is documented below.
        /// </summary>
        [Input("dpkgInstallation")]
        public Input<Inputs.GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs>? DpkgInstallation { get; set; }

        /// <summary>
        /// Copies a file onto the instance.
        /// Structure is documented below.
        /// </summary>
        [Input("fileCopy")]
        public Input<Inputs.GuestPoliciesRecipeUpdateStepFileCopyGetArgs>? FileCopy { get; set; }

        /// <summary>
        /// Executes an artifact or local file.
        /// Structure is documented below.
        /// </summary>
        [Input("fileExec")]
        public Input<Inputs.GuestPoliciesRecipeUpdateStepFileExecGetArgs>? FileExec { get; set; }

        /// <summary>
        /// Installs an MSI file.
        /// Structure is documented below.
        /// </summary>
        [Input("msiInstallation")]
        public Input<Inputs.GuestPoliciesRecipeUpdateStepMsiInstallationGetArgs>? MsiInstallation { get; set; }

        /// <summary>
        /// Installs an rpm file via the rpm utility.
        /// Structure is documented below.
        /// </summary>
        [Input("rpmInstallation")]
        public Input<Inputs.GuestPoliciesRecipeUpdateStepRpmInstallationGetArgs>? RpmInstallation { get; set; }

        /// <summary>
        /// Runs commands in a shell.
        /// Structure is documented below.
        /// </summary>
        [Input("scriptRun")]
        public Input<Inputs.GuestPoliciesRecipeUpdateStepScriptRunGetArgs>? ScriptRun { get; set; }

        public GuestPoliciesRecipeUpdateStepGetArgs()
        {
        }
        public static new GuestPoliciesRecipeUpdateStepGetArgs Empty => new GuestPoliciesRecipeUpdateStepGetArgs();
    }
}
