// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecureSourceManager
{
    /// <summary>
    /// BranchRule is the protection rule to enforce pre-defined rules on designated branches within a repository.
    /// 
    /// To get more information about BranchRule, see:
    /// 
    /// * [API documentation](https://cloud.google.com/secure-source-manager/docs/reference/rest/v1/projects.locations.repositories.branchRules)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/secure-source-manager/docs/overview)
    /// 
    /// ## Example Usage
    /// 
    /// ### Secure Source Manager Branch Rule Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var instance = new Gcp.SecureSourceManager.Instance("instance", new()
    ///     {
    ///         Location = "us-central1",
    ///         InstanceId = "my-basic-instance",
    ///     });
    /// 
    ///     var repository = new Gcp.SecureSourceManager.Repository("repository", new()
    ///     {
    ///         RepositoryId = "my-basic-repository",
    ///         Location = instance.Location,
    ///         Instance = instance.Name,
    ///     });
    /// 
    ///     var basic = new Gcp.SecureSourceManager.BranchRule("basic", new()
    ///     {
    ///         BranchRuleId = "my-basic-branchrule",
    ///         RepositoryId = repository.RepositoryId,
    ///         Location = repository.Location,
    ///         IncludePattern = "main",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Secure Source Manager Branch Rule With Fields
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var instance = new Gcp.SecureSourceManager.Instance("instance", new()
    ///     {
    ///         Location = "us-central1",
    ///         InstanceId = "my-initial-instance",
    ///     });
    /// 
    ///     var repository = new Gcp.SecureSourceManager.Repository("repository", new()
    ///     {
    ///         RepositoryId = "my-initial-repository",
    ///         Instance = instance.Name,
    ///         Location = instance.Location,
    ///     });
    /// 
    ///     var @default = new Gcp.SecureSourceManager.BranchRule("default", new()
    ///     {
    ///         BranchRuleId = "my-initial-branchrule",
    ///         Location = repository.Location,
    ///         RepositoryId = repository.RepositoryId,
    ///         IncludePattern = "test",
    ///         MinimumApprovalsCount = 2,
    ///         MinimumReviewsCount = 2,
    ///         RequireCommentsResolved = true,
    ///         RequireLinearHistory = true,
    ///         RequirePullRequest = true,
    ///         Disabled = false,
    ///         AllowStaleReviews = false,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// BranchRule can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/repositories/{{repository_id}}/branchRules/{{branch_rule_id}}`
    /// 
    /// * `{{project}}/{{location}}/{{repository_id}}/{{branch_rule_id}}`
    /// 
    /// * `{{location}}/{{repository_id}}/{{branch_rule_id}}`
    /// 
    /// * `{{branch_rule_id}}`
    /// 
    /// When using the `pulumi import` command, BranchRule can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:securesourcemanager/branchRule:BranchRule default projects/{{project}}/locations/{{location}}/repositories/{{repository_id}}/branchRules/{{branch_rule_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:securesourcemanager/branchRule:BranchRule default {{project}}/{{location}}/{{repository_id}}/{{branch_rule_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:securesourcemanager/branchRule:BranchRule default {{location}}/{{repository_id}}/{{branch_rule_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:securesourcemanager/branchRule:BranchRule default {{branch_rule_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:securesourcemanager/branchRule:BranchRule")]
    public partial class BranchRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Determines if allow stale reviews or approvals before merging to the branch.
        /// </summary>
        [Output("allowStaleReviews")]
        public Output<bool?> AllowStaleReviews { get; private set; } = null!;

        /// <summary>
        /// The ID for the BranchRule.
        /// </summary>
        [Output("branchRuleId")]
        public Output<string> BranchRuleId { get; private set; } = null!;

        /// <summary>
        /// Time the BranchRule was created in UTC.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Determines if the branch rule is disabled or not.
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// The BranchRule matches branches based on the specified regular expression. Use .* to match all branches.
        /// </summary>
        [Output("includePattern")]
        public Output<string> IncludePattern { get; private set; } = null!;

        /// <summary>
        /// The location for the Repository.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The minimum number of approvals required for the branch rule to be matched.
        /// </summary>
        [Output("minimumApprovalsCount")]
        public Output<int?> MinimumApprovalsCount { get; private set; } = null!;

        /// <summary>
        /// The minimum number of reviews required for the branch rule to be matched.
        /// </summary>
        [Output("minimumReviewsCount")]
        public Output<int?> MinimumReviewsCount { get; private set; } = null!;

        /// <summary>
        /// The resource name for the BranchRule.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The ID for the Repository.
        /// </summary>
        [Output("repositoryId")]
        public Output<string> RepositoryId { get; private set; } = null!;

        /// <summary>
        /// Determines if require comments resolved before merging to the branch.
        /// </summary>
        [Output("requireCommentsResolved")]
        public Output<bool?> RequireCommentsResolved { get; private set; } = null!;

        /// <summary>
        /// Determines if require linear history before merging to the branch.
        /// </summary>
        [Output("requireLinearHistory")]
        public Output<bool?> RequireLinearHistory { get; private set; } = null!;

        /// <summary>
        /// Determines if the branch rule requires a pull request or not.
        /// </summary>
        [Output("requirePullRequest")]
        public Output<bool?> RequirePullRequest { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the BranchRule.
        /// </summary>
        [Output("uid")]
        public Output<string> Uid { get; private set; } = null!;

        /// <summary>
        /// Time the BranchRule was updated in UTC.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a BranchRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BranchRule(string name, BranchRuleArgs args, CustomResourceOptions? options = null)
            : base("gcp:securesourcemanager/branchRule:BranchRule", name, args ?? new BranchRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BranchRule(string name, Input<string> id, BranchRuleState? state = null, CustomResourceOptions? options = null)
            : base("gcp:securesourcemanager/branchRule:BranchRule", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing BranchRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BranchRule Get(string name, Input<string> id, BranchRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new BranchRule(name, id, state, options);
        }
    }

    public sealed class BranchRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines if allow stale reviews or approvals before merging to the branch.
        /// </summary>
        [Input("allowStaleReviews")]
        public Input<bool>? AllowStaleReviews { get; set; }

        /// <summary>
        /// The ID for the BranchRule.
        /// </summary>
        [Input("branchRuleId", required: true)]
        public Input<string> BranchRuleId { get; set; } = null!;

        /// <summary>
        /// Determines if the branch rule is disabled or not.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The BranchRule matches branches based on the specified regular expression. Use .* to match all branches.
        /// </summary>
        [Input("includePattern", required: true)]
        public Input<string> IncludePattern { get; set; } = null!;

        /// <summary>
        /// The location for the Repository.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The minimum number of approvals required for the branch rule to be matched.
        /// </summary>
        [Input("minimumApprovalsCount")]
        public Input<int>? MinimumApprovalsCount { get; set; }

        /// <summary>
        /// The minimum number of reviews required for the branch rule to be matched.
        /// </summary>
        [Input("minimumReviewsCount")]
        public Input<int>? MinimumReviewsCount { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The ID for the Repository.
        /// </summary>
        [Input("repositoryId", required: true)]
        public Input<string> RepositoryId { get; set; } = null!;

        /// <summary>
        /// Determines if require comments resolved before merging to the branch.
        /// </summary>
        [Input("requireCommentsResolved")]
        public Input<bool>? RequireCommentsResolved { get; set; }

        /// <summary>
        /// Determines if require linear history before merging to the branch.
        /// </summary>
        [Input("requireLinearHistory")]
        public Input<bool>? RequireLinearHistory { get; set; }

        /// <summary>
        /// Determines if the branch rule requires a pull request or not.
        /// </summary>
        [Input("requirePullRequest")]
        public Input<bool>? RequirePullRequest { get; set; }

        public BranchRuleArgs()
        {
        }
        public static new BranchRuleArgs Empty => new BranchRuleArgs();
    }

    public sealed class BranchRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines if allow stale reviews or approvals before merging to the branch.
        /// </summary>
        [Input("allowStaleReviews")]
        public Input<bool>? AllowStaleReviews { get; set; }

        /// <summary>
        /// The ID for the BranchRule.
        /// </summary>
        [Input("branchRuleId")]
        public Input<string>? BranchRuleId { get; set; }

        /// <summary>
        /// Time the BranchRule was created in UTC.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Determines if the branch rule is disabled or not.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The BranchRule matches branches based on the specified regular expression. Use .* to match all branches.
        /// </summary>
        [Input("includePattern")]
        public Input<string>? IncludePattern { get; set; }

        /// <summary>
        /// The location for the Repository.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The minimum number of approvals required for the branch rule to be matched.
        /// </summary>
        [Input("minimumApprovalsCount")]
        public Input<int>? MinimumApprovalsCount { get; set; }

        /// <summary>
        /// The minimum number of reviews required for the branch rule to be matched.
        /// </summary>
        [Input("minimumReviewsCount")]
        public Input<int>? MinimumReviewsCount { get; set; }

        /// <summary>
        /// The resource name for the BranchRule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The ID for the Repository.
        /// </summary>
        [Input("repositoryId")]
        public Input<string>? RepositoryId { get; set; }

        /// <summary>
        /// Determines if require comments resolved before merging to the branch.
        /// </summary>
        [Input("requireCommentsResolved")]
        public Input<bool>? RequireCommentsResolved { get; set; }

        /// <summary>
        /// Determines if require linear history before merging to the branch.
        /// </summary>
        [Input("requireLinearHistory")]
        public Input<bool>? RequireLinearHistory { get; set; }

        /// <summary>
        /// Determines if the branch rule requires a pull request or not.
        /// </summary>
        [Input("requirePullRequest")]
        public Input<bool>? RequirePullRequest { get; set; }

        /// <summary>
        /// Unique identifier of the BranchRule.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        /// <summary>
        /// Time the BranchRule was updated in UTC.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public BranchRuleState()
        {
        }
        public static new BranchRuleState Empty => new BranchRuleState();
    }
}
