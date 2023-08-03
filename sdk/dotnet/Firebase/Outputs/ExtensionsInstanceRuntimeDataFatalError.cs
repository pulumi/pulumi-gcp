// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firebase.Outputs
{

    [OutputType]
    public sealed class ExtensionsInstanceRuntimeDataFatalError
    {
        /// <summary>
        /// The error message. This is set by the extension developer to give
        /// more detail on why the extension is unusable and must be re-installed
        /// or reconfigured.
        /// </summary>
        public readonly string? ErrorMessage;

        [OutputConstructor]
        private ExtensionsInstanceRuntimeDataFatalError(string? errorMessage)
        {
            ErrorMessage = errorMessage;
        }
    }
}