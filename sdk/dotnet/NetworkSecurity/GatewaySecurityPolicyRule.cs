// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity
{
    /// <summary>
    /// The GatewaySecurityPolicyRule resource is in a nested collection within a GatewaySecurityPolicy and represents
    /// a traffic matching condition and associated action to perform.
    /// 
    /// To get more information about GatewaySecurityPolicyRule, see:
    /// 
    /// * [API documentation](https://cloud.google.com/secure-web-proxy/docs/reference/network-security/rest/v1/projects.locations.gatewaySecurityPolicies.rules)
    /// 
    /// ## Example Usage
    /// 
    /// ### Network Security Gateway Security Policy Rules Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.NetworkSecurity.GatewaySecurityPolicy("default", new()
    ///     {
    ///         Name = "my-gateway-security-policy",
    ///         Location = "us-central1",
    ///         Description = "gateway security policy created to be used as reference by the rule.",
    ///     });
    /// 
    ///     var defaultGatewaySecurityPolicyRule = new Gcp.NetworkSecurity.GatewaySecurityPolicyRule("default", new()
    ///     {
    ///         Name = "my-gateway-security-policy-rule",
    ///         Location = "us-central1",
    ///         GatewaySecurityPolicy = @default.Name,
    ///         Enabled = true,
    ///         Description = "my description",
    ///         Priority = 0,
    ///         SessionMatcher = "host() == 'example.com'",
    ///         BasicProfile = "ALLOW",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Network Security Gateway Security Policy Rules Advanced
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.NetworkSecurity.GatewaySecurityPolicy("default", new()
    ///     {
    ///         Name = "my-gateway-security-policy",
    ///         Location = "us-central1",
    ///         Description = "gateway security policy created to be used as reference by the rule.",
    ///     });
    /// 
    ///     var defaultGatewaySecurityPolicyRule = new Gcp.NetworkSecurity.GatewaySecurityPolicyRule("default", new()
    ///     {
    ///         Name = "my-gateway-security-policy-rule",
    ///         Location = "us-central1",
    ///         GatewaySecurityPolicy = @default.Name,
    ///         Enabled = true,
    ///         Description = "my description",
    ///         Priority = 0,
    ///         SessionMatcher = "host() == 'example.com'",
    ///         ApplicationMatcher = "request.method == 'POST'",
    ///         TlsInspectionEnabled = false,
    ///         BasicProfile = "ALLOW",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// GatewaySecurityPolicyRule can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/gatewaySecurityPolicies/{{gateway_security_policy}}/rules/{{name}}`
    /// 
    /// * `{{project}}/{{location}}/{{gateway_security_policy}}/{{name}}`
    /// 
    /// * `{{location}}/{{gateway_security_policy}}/{{name}}`
    /// 
    /// When using the `pulumi import` command, GatewaySecurityPolicyRule can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:networksecurity/gatewaySecurityPolicyRule:GatewaySecurityPolicyRule default projects/{{project}}/locations/{{location}}/gatewaySecurityPolicies/{{gateway_security_policy}}/rules/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:networksecurity/gatewaySecurityPolicyRule:GatewaySecurityPolicyRule default {{project}}/{{location}}/{{gateway_security_policy}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:networksecurity/gatewaySecurityPolicyRule:GatewaySecurityPolicyRule default {{location}}/{{gateway_security_policy}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:networksecurity/gatewaySecurityPolicyRule:GatewaySecurityPolicyRule")]
    public partial class GatewaySecurityPolicyRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// CEL expression for matching on L7/application level criteria.
        /// </summary>
        [Output("applicationMatcher")]
        public Output<string?> ApplicationMatcher { get; private set; } = null!;

        /// <summary>
        /// Profile which tells what the primitive action should be. Possible values are: * ALLOW * DENY.
        /// Possible values are: `BASIC_PROFILE_UNSPECIFIED`, `ALLOW`, `DENY`.
        /// </summary>
        [Output("basicProfile")]
        public Output<string> BasicProfile { get; private set; } = null!;

        /// <summary>
        /// The timestamp when the resource was created.
        /// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        /// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Free-text description of the resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Whether the rule is enforced.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// The name of the gatewat security policy this rule belongs to.
        /// </summary>
        [Output("gatewaySecurityPolicy")]
        public Output<string> GatewaySecurityPolicy { get; private set; } = null!;

        /// <summary>
        /// The location of the gateway security policy.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Name of the resource. ame is the full resource name so projects/{project}/locations/{location}/gatewaySecurityPolicies/{gateway_security_policy}/rules/{rule}
        /// rule should match the pattern: (^a-z?$).
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Priority of the rule. Lower number corresponds to higher precedence.
        /// </summary>
        [Output("priority")]
        public Output<int> Priority { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Server-defined URL of this resource.
        /// </summary>
        [Output("selfLink")]
        public Output<string> SelfLink { get; private set; } = null!;

        /// <summary>
        /// CEL expression for matching on session criteria.
        /// </summary>
        [Output("sessionMatcher")]
        public Output<string> SessionMatcher { get; private set; } = null!;

        /// <summary>
        /// Flag to enable TLS inspection of traffic matching on. Can only be true if the
        /// parent GatewaySecurityPolicy references a TLSInspectionConfig.
        /// </summary>
        [Output("tlsInspectionEnabled")]
        public Output<bool?> TlsInspectionEnabled { get; private set; } = null!;

        /// <summary>
        /// The timestamp when the resource was updated.
        /// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        /// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a GatewaySecurityPolicyRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GatewaySecurityPolicyRule(string name, GatewaySecurityPolicyRuleArgs args, CustomResourceOptions? options = null)
            : base("gcp:networksecurity/gatewaySecurityPolicyRule:GatewaySecurityPolicyRule", name, args ?? new GatewaySecurityPolicyRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GatewaySecurityPolicyRule(string name, Input<string> id, GatewaySecurityPolicyRuleState? state = null, CustomResourceOptions? options = null)
            : base("gcp:networksecurity/gatewaySecurityPolicyRule:GatewaySecurityPolicyRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GatewaySecurityPolicyRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GatewaySecurityPolicyRule Get(string name, Input<string> id, GatewaySecurityPolicyRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new GatewaySecurityPolicyRule(name, id, state, options);
        }
    }

    public sealed class GatewaySecurityPolicyRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CEL expression for matching on L7/application level criteria.
        /// </summary>
        [Input("applicationMatcher")]
        public Input<string>? ApplicationMatcher { get; set; }

        /// <summary>
        /// Profile which tells what the primitive action should be. Possible values are: * ALLOW * DENY.
        /// Possible values are: `BASIC_PROFILE_UNSPECIFIED`, `ALLOW`, `DENY`.
        /// </summary>
        [Input("basicProfile", required: true)]
        public Input<string> BasicProfile { get; set; } = null!;

        /// <summary>
        /// Free-text description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether the rule is enforced.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The name of the gatewat security policy this rule belongs to.
        /// </summary>
        [Input("gatewaySecurityPolicy", required: true)]
        public Input<string> GatewaySecurityPolicy { get; set; } = null!;

        /// <summary>
        /// The location of the gateway security policy.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// Name of the resource. ame is the full resource name so projects/{project}/locations/{location}/gatewaySecurityPolicies/{gateway_security_policy}/rules/{rule}
        /// rule should match the pattern: (^a-z?$).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Priority of the rule. Lower number corresponds to higher precedence.
        /// </summary>
        [Input("priority", required: true)]
        public Input<int> Priority { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// CEL expression for matching on session criteria.
        /// </summary>
        [Input("sessionMatcher", required: true)]
        public Input<string> SessionMatcher { get; set; } = null!;

        /// <summary>
        /// Flag to enable TLS inspection of traffic matching on. Can only be true if the
        /// parent GatewaySecurityPolicy references a TLSInspectionConfig.
        /// </summary>
        [Input("tlsInspectionEnabled")]
        public Input<bool>? TlsInspectionEnabled { get; set; }

        public GatewaySecurityPolicyRuleArgs()
        {
        }
        public static new GatewaySecurityPolicyRuleArgs Empty => new GatewaySecurityPolicyRuleArgs();
    }

    public sealed class GatewaySecurityPolicyRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CEL expression for matching on L7/application level criteria.
        /// </summary>
        [Input("applicationMatcher")]
        public Input<string>? ApplicationMatcher { get; set; }

        /// <summary>
        /// Profile which tells what the primitive action should be. Possible values are: * ALLOW * DENY.
        /// Possible values are: `BASIC_PROFILE_UNSPECIFIED`, `ALLOW`, `DENY`.
        /// </summary>
        [Input("basicProfile")]
        public Input<string>? BasicProfile { get; set; }

        /// <summary>
        /// The timestamp when the resource was created.
        /// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        /// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z"
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Free-text description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether the rule is enforced.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The name of the gatewat security policy this rule belongs to.
        /// </summary>
        [Input("gatewaySecurityPolicy")]
        public Input<string>? GatewaySecurityPolicy { get; set; }

        /// <summary>
        /// The location of the gateway security policy.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Name of the resource. ame is the full resource name so projects/{project}/locations/{location}/gatewaySecurityPolicies/{gateway_security_policy}/rules/{rule}
        /// rule should match the pattern: (^a-z?$).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Priority of the rule. Lower number corresponds to higher precedence.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Server-defined URL of this resource.
        /// </summary>
        [Input("selfLink")]
        public Input<string>? SelfLink { get; set; }

        /// <summary>
        /// CEL expression for matching on session criteria.
        /// </summary>
        [Input("sessionMatcher")]
        public Input<string>? SessionMatcher { get; set; }

        /// <summary>
        /// Flag to enable TLS inspection of traffic matching on. Can only be true if the
        /// parent GatewaySecurityPolicy references a TLSInspectionConfig.
        /// </summary>
        [Input("tlsInspectionEnabled")]
        public Input<bool>? TlsInspectionEnabled { get; set; }

        /// <summary>
        /// The timestamp when the resource was updated.
        /// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        /// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public GatewaySecurityPolicyRuleState()
        {
        }
        public static new GatewaySecurityPolicyRuleState Empty => new GatewaySecurityPolicyRuleState();
    }
}
