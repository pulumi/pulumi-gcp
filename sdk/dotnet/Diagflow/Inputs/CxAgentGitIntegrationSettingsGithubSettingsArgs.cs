// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxAgentGitIntegrationSettingsGithubSettingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessToken")]
        private Input<string>? _accessToken;

        /// <summary>
        /// The access token used to authenticate the access to the GitHub repository.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        public Input<string>? AccessToken
        {
            get => _accessToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("branches")]
        private InputList<string>? _branches;

        /// <summary>
        /// A list of branches configured to be used from Dialogflow.
        /// </summary>
        public InputList<string> Branches
        {
            get => _branches ?? (_branches = new InputList<string>());
            set => _branches = value;
        }

        /// <summary>
        /// The unique repository display name for the GitHub repository.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The GitHub repository URI related to the agent.
        /// </summary>
        [Input("repositoryUri")]
        public Input<string>? RepositoryUri { get; set; }

        /// <summary>
        /// The branch of the GitHub repository tracked for this agent.
        /// </summary>
        [Input("trackingBranch")]
        public Input<string>? TrackingBranch { get; set; }

        public CxAgentGitIntegrationSettingsGithubSettingsArgs()
        {
        }
        public static new CxAgentGitIntegrationSettingsGithubSettingsArgs Empty => new CxAgentGitIntegrationSettingsGithubSettingsArgs();
    }
}