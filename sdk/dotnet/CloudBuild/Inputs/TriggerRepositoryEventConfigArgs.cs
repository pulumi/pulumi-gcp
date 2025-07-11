// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudBuild.Inputs
{

    public sealed class TriggerRepositoryEventConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Contains filter properties for matching Pull Requests.
        /// Structure is documented below.
        /// </summary>
        [Input("pullRequest")]
        public Input<Inputs.TriggerRepositoryEventConfigPullRequestArgs>? PullRequest { get; set; }

        /// <summary>
        /// Contains filter properties for matching git pushes.
        /// Structure is documented below.
        /// </summary>
        [Input("push")]
        public Input<Inputs.TriggerRepositoryEventConfigPushArgs>? Push { get; set; }

        /// <summary>
        /// The resource name of the Repo API resource.
        /// </summary>
        [Input("repository")]
        public Input<string>? Repository { get; set; }

        public TriggerRepositoryEventConfigArgs()
        {
        }
        public static new TriggerRepositoryEventConfigArgs Empty => new TriggerRepositoryEventConfigArgs();
    }
}
