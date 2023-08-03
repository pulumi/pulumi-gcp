// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firebase.Inputs
{

    public sealed class ExtensionsInstanceRuntimeDataFatalErrorGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The error message. This is set by the extension developer to give
        /// more detail on why the extension is unusable and must be re-installed
        /// or reconfigured.
        /// </summary>
        [Input("errorMessage")]
        public Input<string>? ErrorMessage { get; set; }

        public ExtensionsInstanceRuntimeDataFatalErrorGetArgs()
        {
        }
        public static new ExtensionsInstanceRuntimeDataFatalErrorGetArgs Empty => new ExtensionsInstanceRuntimeDataFatalErrorGetArgs();
    }
}