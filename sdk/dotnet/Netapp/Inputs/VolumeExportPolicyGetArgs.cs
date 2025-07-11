// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Netapp.Inputs
{

    public sealed class VolumeExportPolicyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("rules", required: true)]
        private InputList<Inputs.VolumeExportPolicyRuleGetArgs>? _rules;

        /// <summary>
        /// Export rules (up to 5) control NFS volume access.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.VolumeExportPolicyRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.VolumeExportPolicyRuleGetArgs>());
            set => _rules = value;
        }

        public VolumeExportPolicyGetArgs()
        {
        }
        public static new VolumeExportPolicyGetArgs Empty => new VolumeExportPolicyGetArgs();
    }
}
