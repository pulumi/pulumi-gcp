// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Inputs
{

    public sealed class GuestPoliciesPackageRepositoryAptArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of archive files in this repository. The default behavior is DEB.
        /// Default value is `DEB`.
        /// Possible values are: `DEB`, `DEB_SRC`.
        /// </summary>
        [Input("archiveType")]
        public Input<string>? ArchiveType { get; set; }

        [Input("components", required: true)]
        private InputList<string>? _components;

        /// <summary>
        /// List of components for this repository. Must contain at least one item.
        /// </summary>
        public InputList<string> Components
        {
            get => _components ?? (_components = new InputList<string>());
            set => _components = value;
        }

        /// <summary>
        /// Distribution of this repository.
        /// </summary>
        [Input("distribution", required: true)]
        public Input<string> Distribution { get; set; } = null!;

        /// <summary>
        /// URI of the key file for this repository. The agent maintains a keyring at
        /// /etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg containing all the keys in any applied guest policy.
        /// </summary>
        [Input("gpgKey")]
        public Input<string>? GpgKey { get; set; }

        /// <summary>
        /// URI for this repository.
        /// </summary>
        [Input("uri", required: true)]
        public Input<string> Uri { get; set; } = null!;

        public GuestPoliciesPackageRepositoryAptArgs()
        {
        }
        public static new GuestPoliciesPackageRepositoryAptArgs Empty => new GuestPoliciesPackageRepositoryAptArgs();
    }
}
