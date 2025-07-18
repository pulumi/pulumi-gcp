// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firebaserules
{
    /// <summary>
    /// For more information, see:
    /// * [Get started with Firebase Security Rules](https://firebase.google.com/docs/rules/get-started)
    /// ## Example Usage
    /// 
    /// ### Basic_ruleset
    /// Creates a basic Firestore ruleset
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var primary = new Gcp.Firebaserules.Ruleset("primary", new()
    ///     {
    ///         Source = new Gcp.Firebaserules.Inputs.RulesetSourceArgs
    ///         {
    ///             Files = new[]
    ///             {
    ///                 new Gcp.Firebaserules.Inputs.RulesetSourceFileArgs
    ///                 {
    ///                     Content = "service cloud.firestore {match /databases/{database}/documents { match /{document=**} { allow read, write: if false; } } }",
    ///                     Name = "firestore.rules",
    ///                     Fingerprint = "",
    ///                 },
    ///             },
    ///             Language = "",
    ///         },
    ///         Project = "my-project-name",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Minimal_ruleset
    /// Creates a minimal Firestore ruleset
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var primary = new Gcp.Firebaserules.Ruleset("primary", new()
    ///     {
    ///         Source = new Gcp.Firebaserules.Inputs.RulesetSourceArgs
    ///         {
    ///             Files = new[]
    ///             {
    ///                 new Gcp.Firebaserules.Inputs.RulesetSourceFileArgs
    ///                 {
    ///                     Content = "service cloud.firestore {match /databases/{database}/documents { match /{document=**} { allow read, write: if false; } } }",
    ///                     Name = "firestore.rules",
    ///                 },
    ///             },
    ///         },
    ///         Project = "my-project-name",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Ruleset can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/rulesets/{{name}}`
    /// 
    /// * `{{project}}/{{name}}`
    /// 
    /// * `{{name}}`
    /// 
    /// When using the `pulumi import` command, Ruleset can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:firebaserules/ruleset:Ruleset default projects/{{project}}/rulesets/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:firebaserules/ruleset:Ruleset default {{project}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:firebaserules/ruleset:Ruleset default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:firebaserules/ruleset:Ruleset")]
    public partial class Ruleset : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Output only. Time the `Ruleset` was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Output only. The metadata for this ruleset.
        /// </summary>
        [Output("metadatas")]
        public Output<ImmutableArray<Outputs.RulesetMetadata>> Metadatas { get; private set; } = null!;

        /// <summary>
        /// Output only. Name of the `Ruleset`. The ruleset_id is auto generated by the service. Format: `projects/{project_id}/rulesets/{ruleset_id}`
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The project for the resource
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// `Source` for the `Ruleset`.
        /// </summary>
        [Output("source")]
        public Output<Outputs.RulesetSource> Source { get; private set; } = null!;


        /// <summary>
        /// Create a Ruleset resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Ruleset(string name, RulesetArgs args, CustomResourceOptions? options = null)
            : base("gcp:firebaserules/ruleset:Ruleset", name, args ?? new RulesetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Ruleset(string name, Input<string> id, RulesetState? state = null, CustomResourceOptions? options = null)
            : base("gcp:firebaserules/ruleset:Ruleset", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Ruleset resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Ruleset Get(string name, Input<string> id, RulesetState? state = null, CustomResourceOptions? options = null)
        {
            return new Ruleset(name, id, state, options);
        }
    }

    public sealed class RulesetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The project for the resource
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// `Source` for the `Ruleset`.
        /// </summary>
        [Input("source", required: true)]
        public Input<Inputs.RulesetSourceArgs> Source { get; set; } = null!;

        public RulesetArgs()
        {
        }
        public static new RulesetArgs Empty => new RulesetArgs();
    }

    public sealed class RulesetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Output only. Time the `Ruleset` was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        [Input("metadatas")]
        private InputList<Inputs.RulesetMetadataGetArgs>? _metadatas;

        /// <summary>
        /// Output only. The metadata for this ruleset.
        /// </summary>
        public InputList<Inputs.RulesetMetadataGetArgs> Metadatas
        {
            get => _metadatas ?? (_metadatas = new InputList<Inputs.RulesetMetadataGetArgs>());
            set => _metadatas = value;
        }

        /// <summary>
        /// Output only. Name of the `Ruleset`. The ruleset_id is auto generated by the service. Format: `projects/{project_id}/rulesets/{ruleset_id}`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project for the resource
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// `Source` for the `Ruleset`.
        /// </summary>
        [Input("source")]
        public Input<Inputs.RulesetSourceGetArgs>? Source { get; set; }

        public RulesetState()
        {
        }
        public static new RulesetState Empty => new RulesetState();
    }
}
