// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxAgentGitIntegrationSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Settings of integration with GitHub.
        /// Structure is documented below.
        /// </summary>
        [Input("githubSettings")]
        public Input<Inputs.CxAgentGitIntegrationSettingsGithubSettingsGetArgs>? GithubSettings { get; set; }

        public CxAgentGitIntegrationSettingsGetArgs()
        {
        }
        public static new CxAgentGitIntegrationSettingsGetArgs Empty => new CxAgentGitIntegrationSettingsGetArgs();
    }
}