// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    /// <summary>
    /// ## Example Usage
    /// ### Region Security Policy Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var region_sec_policy_basic = new Gcp.Compute.RegionSecurityPolicy("region-sec-policy-basic", new()
    ///     {
    ///         Description = "basic region security policy",
    ///         Type = "CLOUD_ARMOR",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Region Security Policy With Ddos Protection Config
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var region_sec_policy_ddos_protection = new Gcp.Compute.RegionSecurityPolicy("region-sec-policy-ddos-protection", new()
    ///     {
    ///         Description = "with ddos protection config",
    ///         Type = "CLOUD_ARMOR_NETWORK",
    ///         DdosProtectionConfig = new Gcp.Compute.Inputs.RegionSecurityPolicyDdosProtectionConfigArgs
    ///         {
    ///             DdosProtection = "ADVANCED_PREVIEW",
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
    /// RegionSecurityPolicy can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/regionSecurityPolicy:RegionSecurityPolicy default projects/{{project}}/regions/{{region}}/securityPolicies/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/regionSecurityPolicy:RegionSecurityPolicy default {{project}}/{{region}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/regionSecurityPolicy:RegionSecurityPolicy default {{region}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/regionSecurityPolicy:RegionSecurityPolicy default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:compute/regionSecurityPolicy:RegionSecurityPolicy")]
    public partial class RegionSecurityPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Configuration for Google Cloud Armor DDOS Proctection Config.
        /// Structure is documented below.
        /// </summary>
        [Output("ddosProtectionConfig")]
        public Output<Outputs.RegionSecurityPolicyDdosProtectionConfig?> DdosProtectionConfig { get; private set; } = null!;

        /// <summary>
        /// An optional description of this resource. Provide this property when you create the resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Fingerprint of this resource. This field is used internally during
        /// updates of this resource.
        /// </summary>
        [Output("fingerprint")]
        public Output<string> Fingerprint { get; private set; } = null!;

        /// <summary>
        /// Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
        /// Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the resource. This identifier is defined by the server.
        /// </summary>
        [Output("policyId")]
        public Output<string> PolicyId { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The Region in which the created Region Security Policy should reside.
        /// If it is not provided, the provider region is used.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Server-defined URL for the resource.
        /// </summary>
        [Output("selfLink")]
        public Output<string> SelfLink { get; private set; } = null!;

        /// <summary>
        /// Server-defined URL for this resource with the resource id.
        /// </summary>
        [Output("selfLinkWithPolicyId")]
        public Output<string> SelfLinkWithPolicyId { get; private set; } = null!;

        /// <summary>
        /// The type indicates the intended use of the security policy.
        /// - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers.
        /// - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache.
        /// - CLOUD_ARMOR_NETWORK: Cloud Armor network policies can be configured to filter packets targeting network load balancing resources such as backend services, target pools, target instances, and instances with external IPs. They filter requests before the request is served from the application.
        /// This field can be set only at resource creation time.
        /// Possible values are: `CLOUD_ARMOR`, `CLOUD_ARMOR_EDGE`, `CLOUD_ARMOR_NETWORK`.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;


        /// <summary>
        /// Create a RegionSecurityPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RegionSecurityPolicy(string name, RegionSecurityPolicyArgs? args = null, CustomResourceOptions? options = null)
            : base("gcp:compute/regionSecurityPolicy:RegionSecurityPolicy", name, args ?? new RegionSecurityPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RegionSecurityPolicy(string name, Input<string> id, RegionSecurityPolicyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:compute/regionSecurityPolicy:RegionSecurityPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RegionSecurityPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RegionSecurityPolicy Get(string name, Input<string> id, RegionSecurityPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new RegionSecurityPolicy(name, id, state, options);
        }
    }

    public sealed class RegionSecurityPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration for Google Cloud Armor DDOS Proctection Config.
        /// Structure is documented below.
        /// </summary>
        [Input("ddosProtectionConfig")]
        public Input<Inputs.RegionSecurityPolicyDdosProtectionConfigArgs>? DdosProtectionConfig { get; set; }

        /// <summary>
        /// An optional description of this resource. Provide this property when you create the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
        /// Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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

        /// <summary>
        /// The Region in which the created Region Security Policy should reside.
        /// If it is not provided, the provider region is used.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The type indicates the intended use of the security policy.
        /// - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers.
        /// - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache.
        /// - CLOUD_ARMOR_NETWORK: Cloud Armor network policies can be configured to filter packets targeting network load balancing resources such as backend services, target pools, target instances, and instances with external IPs. They filter requests before the request is served from the application.
        /// This field can be set only at resource creation time.
        /// Possible values are: `CLOUD_ARMOR`, `CLOUD_ARMOR_EDGE`, `CLOUD_ARMOR_NETWORK`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public RegionSecurityPolicyArgs()
        {
        }
        public static new RegionSecurityPolicyArgs Empty => new RegionSecurityPolicyArgs();
    }

    public sealed class RegionSecurityPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration for Google Cloud Armor DDOS Proctection Config.
        /// Structure is documented below.
        /// </summary>
        [Input("ddosProtectionConfig")]
        public Input<Inputs.RegionSecurityPolicyDdosProtectionConfigGetArgs>? DdosProtectionConfig { get; set; }

        /// <summary>
        /// An optional description of this resource. Provide this property when you create the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Fingerprint of this resource. This field is used internally during
        /// updates of this resource.
        /// </summary>
        [Input("fingerprint")]
        public Input<string>? Fingerprint { get; set; }

        /// <summary>
        /// Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
        /// Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The unique identifier for the resource. This identifier is defined by the server.
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The Region in which the created Region Security Policy should reside.
        /// If it is not provided, the provider region is used.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Server-defined URL for the resource.
        /// </summary>
        [Input("selfLink")]
        public Input<string>? SelfLink { get; set; }

        /// <summary>
        /// Server-defined URL for this resource with the resource id.
        /// </summary>
        [Input("selfLinkWithPolicyId")]
        public Input<string>? SelfLinkWithPolicyId { get; set; }

        /// <summary>
        /// The type indicates the intended use of the security policy.
        /// - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers.
        /// - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache.
        /// - CLOUD_ARMOR_NETWORK: Cloud Armor network policies can be configured to filter packets targeting network load balancing resources such as backend services, target pools, target instances, and instances with external IPs. They filter requests before the request is served from the application.
        /// This field can be set only at resource creation time.
        /// Possible values are: `CLOUD_ARMOR`, `CLOUD_ARMOR_EDGE`, `CLOUD_ARMOR_NETWORK`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public RegionSecurityPolicyState()
        {
        }
        public static new RegionSecurityPolicyState Empty => new RegionSecurityPolicyState();
    }
}