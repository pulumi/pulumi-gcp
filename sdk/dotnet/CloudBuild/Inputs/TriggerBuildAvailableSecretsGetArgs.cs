// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudBuild.Inputs
{

    public sealed class TriggerBuildAvailableSecretsGetArgs : Pulumi.ResourceArgs
    {
        [Input("secretManagers", required: true)]
        private InputList<Inputs.TriggerBuildAvailableSecretsSecretManagerGetArgs>? _secretManagers;

        /// <summary>
        /// Pairs a secret environment variable with a SecretVersion in Secret Manager.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.TriggerBuildAvailableSecretsSecretManagerGetArgs> SecretManagers
        {
            get => _secretManagers ?? (_secretManagers = new InputList<Inputs.TriggerBuildAvailableSecretsSecretManagerGetArgs>());
            set => _secretManagers = value;
        }

        public TriggerBuildAvailableSecretsGetArgs()
        {
        }
    }
}