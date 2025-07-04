// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firebase.Inputs
{

    public sealed class HostingCustomDomainCertVerificationHttpGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A text string to serve at the path.
        /// </summary>
        [Input("desired")]
        public Input<string>? Desired { get; set; }

        /// <summary>
        /// Whether Hosting was able to find the required file contents on the
        /// specified path during its last check.
        /// </summary>
        [Input("discovered")]
        public Input<string>? Discovered { get; set; }

        /// <summary>
        /// (Output)
        /// The last time Hosting systems checked for the file contents.
        /// </summary>
        [Input("lastCheckTime")]
        public Input<string>? LastCheckTime { get; set; }

        /// <summary>
        /// The path to the file.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        public HostingCustomDomainCertVerificationHttpGetArgs()
        {
        }
        public static new HostingCustomDomainCertVerificationHttpGetArgs Empty => new HostingCustomDomainCertVerificationHttpGetArgs();
    }
}
