// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudBuild.Inputs
{

    public sealed class TriggerRepositoryEventConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Contains filter properties for matching Pull Requests.
        /// Structure is documented below.
        /// </summary>
        [Input("pullRequest")]
        public Input<Inputs.TriggerRepositoryEventConfigPullRequestGetArgs>? PullRequest { get; set; }

        /// <summary>
        /// Contains filter properties for matching git pushes.
        /// Structure is documented below.
        /// </summary>
        [Input("push")]
        public Input<Inputs.TriggerRepositoryEventConfigPushGetArgs>? Push { get; set; }

        /// <summary>
        /// The resource name of the Repo API resource.
        /// </summary>
        [Input("repository")]
        public Input<string>? Repository { get; set; }

        public TriggerRepositoryEventConfigGetArgs()
        {
        }
        public static new TriggerRepositoryEventConfigGetArgs Empty => new TriggerRepositoryEventConfigGetArgs();
    }
}