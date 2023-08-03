// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity
{
    /// <summary>
    /// ## Example Usage
    /// ### Network Security Authorization Policy Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.NetworkSecurity.AuthorizationPolicy("default", new()
    ///     {
    ///         Labels = 
    ///         {
    ///             { "foo", "bar" },
    ///         },
    ///         Description = "my description",
    ///         Action = "ALLOW",
    ///         Rules = new[]
    ///         {
    ///             new Gcp.NetworkSecurity.Inputs.AuthorizationPolicyRuleArgs
    ///             {
    ///                 Sources = new[]
    ///                 {
    ///                     new Gcp.NetworkSecurity.Inputs.AuthorizationPolicyRuleSourceArgs
    ///                     {
    ///                         Principals = new[]
    ///                         {
    ///                             "namespace/*",
    ///                         },
    ///                         IpBlocks = new[]
    ///                         {
    ///                             "1.2.3.0/24",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Network Security Authorization Policy Destinations
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.NetworkSecurity.AuthorizationPolicy("default", new()
    ///     {
    ///         Labels = 
    ///         {
    ///             { "foo", "bar" },
    ///         },
    ///         Description = "my description",
    ///         Action = "ALLOW",
    ///         Rules = new[]
    ///         {
    ///             new Gcp.NetworkSecurity.Inputs.AuthorizationPolicyRuleArgs
    ///             {
    ///                 Sources = new[]
    ///                 {
    ///                     new Gcp.NetworkSecurity.Inputs.AuthorizationPolicyRuleSourceArgs
    ///                     {
    ///                         Principals = new[]
    ///                         {
    ///                             "namespace/*",
    ///                         },
    ///                         IpBlocks = new[]
    ///                         {
    ///                             "1.2.3.0/24",
    ///                         },
    ///                     },
    ///                 },
    ///                 Destinations = new[]
    ///                 {
    ///                     new Gcp.NetworkSecurity.Inputs.AuthorizationPolicyRuleDestinationArgs
    ///                     {
    ///                         Hosts = new[]
    ///                         {
    ///                             "mydomain.*",
    ///                         },
    ///                         Ports = new[]
    ///                         {
    ///                             8080,
    ///                         },
    ///                         Methods = new[]
    ///                         {
    ///                             "GET",
    ///                         },
    ///                         HttpHeaderMatch = new Gcp.NetworkSecurity.Inputs.AuthorizationPolicyRuleDestinationHttpHeaderMatchArgs
    ///                         {
    ///                             HeaderName = ":method",
    ///                             RegexMatch = "GET",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// AuthorizationPolicy can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:networksecurity/authorizationPolicy:AuthorizationPolicy default projects/{{project}}/locations/{{location}}/authorizationPolicies/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:networksecurity/authorizationPolicy:AuthorizationPolicy default {{project}}/{{location}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:networksecurity/authorizationPolicy:AuthorizationPolicy default {{location}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:networksecurity/authorizationPolicy:AuthorizationPolicy")]
    public partial class AuthorizationPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The action to take when a rule match is found. Possible values are "ALLOW" or "DENY".
        /// Possible values are: `ALLOW`, `DENY`.
        /// </summary>
        [Output("action")]
        public Output<string> Action { get; private set; } = null!;

        /// <summary>
        /// Time the AuthorizationPolicy was created in UTC.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// A free-text description of the resource. Max length 1024 characters.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Set of label tags associated with the AuthorizationPolicy resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// The location of the authorization policy.
        /// The default value is `global`.
        /// </summary>
        [Output("location")]
        public Output<string?> Location { get; private set; } = null!;

        /// <summary>
        /// Name of the AuthorizationPolicy resource.
        /// 
        /// 
        /// - - -
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
        /// List of rules to match. Note that at least one of the rules must match in order for the action specified in the 'action' field to be taken.
        /// A rule is a match if there is a matching source and destination. If left blank, the action specified in the action field will be applied on every request.
        /// Structure is documented below.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.AuthorizationPolicyRule>> Rules { get; private set; } = null!;

        /// <summary>
        /// Time the AuthorizationPolicy was updated in UTC.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a AuthorizationPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AuthorizationPolicy(string name, AuthorizationPolicyArgs args, CustomResourceOptions? options = null)
            : base("gcp:networksecurity/authorizationPolicy:AuthorizationPolicy", name, args ?? new AuthorizationPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AuthorizationPolicy(string name, Input<string> id, AuthorizationPolicyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:networksecurity/authorizationPolicy:AuthorizationPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AuthorizationPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AuthorizationPolicy Get(string name, Input<string> id, AuthorizationPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new AuthorizationPolicy(name, id, state, options);
        }
    }

    public sealed class AuthorizationPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to take when a rule match is found. Possible values are "ALLOW" or "DENY".
        /// Possible values are: `ALLOW`, `DENY`.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// A free-text description of the resource. Max length 1024 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Set of label tags associated with the AuthorizationPolicy resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The location of the authorization policy.
        /// The default value is `global`.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Name of the AuthorizationPolicy resource.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("rules")]
        private InputList<Inputs.AuthorizationPolicyRuleArgs>? _rules;

        /// <summary>
        /// List of rules to match. Note that at least one of the rules must match in order for the action specified in the 'action' field to be taken.
        /// A rule is a match if there is a matching source and destination. If left blank, the action specified in the action field will be applied on every request.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.AuthorizationPolicyRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.AuthorizationPolicyRuleArgs>());
            set => _rules = value;
        }

        public AuthorizationPolicyArgs()
        {
        }
        public static new AuthorizationPolicyArgs Empty => new AuthorizationPolicyArgs();
    }

    public sealed class AuthorizationPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to take when a rule match is found. Possible values are "ALLOW" or "DENY".
        /// Possible values are: `ALLOW`, `DENY`.
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// Time the AuthorizationPolicy was created in UTC.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// A free-text description of the resource. Max length 1024 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Set of label tags associated with the AuthorizationPolicy resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The location of the authorization policy.
        /// The default value is `global`.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Name of the AuthorizationPolicy resource.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("rules")]
        private InputList<Inputs.AuthorizationPolicyRuleGetArgs>? _rules;

        /// <summary>
        /// List of rules to match. Note that at least one of the rules must match in order for the action specified in the 'action' field to be taken.
        /// A rule is a match if there is a matching source and destination. If left blank, the action specified in the action field will be applied on every request.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.AuthorizationPolicyRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.AuthorizationPolicyRuleGetArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// Time the AuthorizationPolicy was updated in UTC.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public AuthorizationPolicyState()
        {
        }
        public static new AuthorizationPolicyState Empty => new AuthorizationPolicyState();
    }
}