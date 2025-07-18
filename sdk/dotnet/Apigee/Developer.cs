// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apigee
{
    /// <summary>
    /// A `Developer` is an API consumer that can have apps registered in Apigee.
    /// 
    /// To get more information about Developer, see:
    /// 
    /// * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.developers)
    /// * How-to Guides
    ///     * [Creating a developer](https://cloud.google.com/apigee/docs/api-platform/publish/adding-developers-your-api-product)
    /// 
    /// ## Example Usage
    /// 
    /// ### Apigee Developer Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var current = Gcp.Organizations.GetClientConfig.Invoke();
    /// 
    ///     var apigeeNetwork = new Gcp.Compute.Network("apigee_network", new()
    ///     {
    ///         Name = "apigee-network",
    ///     });
    /// 
    ///     var apigeeRange = new Gcp.Compute.GlobalAddress("apigee_range", new()
    ///     {
    ///         Name = "apigee-range",
    ///         Purpose = "VPC_PEERING",
    ///         AddressType = "INTERNAL",
    ///         PrefixLength = 16,
    ///         Network = apigeeNetwork.Id,
    ///     });
    /// 
    ///     var apigeeVpcConnection = new Gcp.ServiceNetworking.Connection("apigee_vpc_connection", new()
    ///     {
    ///         Network = apigeeNetwork.Id,
    ///         Service = "servicenetworking.googleapis.com",
    ///         ReservedPeeringRanges = new[]
    ///         {
    ///             apigeeRange.Name,
    ///         },
    ///     });
    /// 
    ///     var apigeeOrg = new Gcp.Apigee.Organization("apigee_org", new()
    ///     {
    ///         AnalyticsRegion = "us-central1",
    ///         ProjectId = current.Apply(getClientConfigResult =&gt; getClientConfigResult.Project),
    ///         AuthorizedNetwork = apigeeNetwork.Id,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             apigeeVpcConnection,
    ///         },
    ///     });
    /// 
    ///     var apigeeInstance = new Gcp.Apigee.Instance("apigee_instance", new()
    ///     {
    ///         Name = "my-instance",
    ///         Location = "us-central1",
    ///         OrgId = apigeeOrg.Id,
    ///         PeeringCidrRange = "SLASH_22",
    ///     });
    /// 
    ///     var apigeeDeveloper = new Gcp.Apigee.Developer("apigee_developer", new()
    ///     {
    ///         Email = "john.doe@acme.com",
    ///         FirstName = "John",
    ///         LastName = "Doe",
    ///         UserName = "john.doe",
    ///         OrgId = apigeeOrg.Id,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             apigeeInstance,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Apigee Developer With Attributes
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var current = Gcp.Organizations.GetClientConfig.Invoke();
    /// 
    ///     var apigeeNetwork = new Gcp.Compute.Network("apigee_network", new()
    ///     {
    ///         Name = "apigee-network",
    ///     });
    /// 
    ///     var apigeeRange = new Gcp.Compute.GlobalAddress("apigee_range", new()
    ///     {
    ///         Name = "apigee-range",
    ///         Purpose = "VPC_PEERING",
    ///         AddressType = "INTERNAL",
    ///         PrefixLength = 16,
    ///         Network = apigeeNetwork.Id,
    ///     });
    /// 
    ///     var apigeeVpcConnection = new Gcp.ServiceNetworking.Connection("apigee_vpc_connection", new()
    ///     {
    ///         Network = apigeeNetwork.Id,
    ///         Service = "servicenetworking.googleapis.com",
    ///         ReservedPeeringRanges = new[]
    ///         {
    ///             apigeeRange.Name,
    ///         },
    ///     });
    /// 
    ///     var apigeeOrg = new Gcp.Apigee.Organization("apigee_org", new()
    ///     {
    ///         AnalyticsRegion = "us-central1",
    ///         ProjectId = current.Apply(getClientConfigResult =&gt; getClientConfigResult.Project),
    ///         AuthorizedNetwork = apigeeNetwork.Id,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             apigeeVpcConnection,
    ///         },
    ///     });
    /// 
    ///     var apigeeInstance = new Gcp.Apigee.Instance("apigee_instance", new()
    ///     {
    ///         Name = "my-instance",
    ///         Location = "us-central1",
    ///         OrgId = apigeeOrg.Id,
    ///         PeeringCidrRange = "SLASH_22",
    ///     });
    /// 
    ///     var apigeeDeveloper = new Gcp.Apigee.Developer("apigee_developer", new()
    ///     {
    ///         Email = "john.doe@acme.com",
    ///         FirstName = "John",
    ///         LastName = "Doe",
    ///         UserName = "john.doe",
    ///         Attributes = new[]
    ///         {
    ///             new Gcp.Apigee.Inputs.DeveloperAttributeArgs
    ///             {
    ///                 Name = "business_unit",
    ///                 Value = "HR",
    ///             },
    ///             new Gcp.Apigee.Inputs.DeveloperAttributeArgs
    ///             {
    ///                 Name = "department",
    ///                 Value = "payroll",
    ///             },
    ///         },
    ///         OrgId = apigeeOrg.Id,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             apigeeInstance,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Developer can be imported using any of these accepted formats:
    /// 
    /// * `{{org_id}}/developers/{{email}}`
    /// 
    /// * `{{org_id}}/{{email}}`
    /// 
    /// When using the `pulumi import` command, Developer can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:apigee/developer:Developer default {{org_id}}/developers/{{email}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:apigee/developer:Developer default {{org_id}}/{{email}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:apigee/developer:Developer")]
    public partial class Developer : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Developer attributes (name/value pairs). The custom attribute limit is 18.
        /// Structure is documented below.
        /// </summary>
        [Output("attributes")]
        public Output<ImmutableArray<Outputs.DeveloperAttribute>> Attributes { get; private set; } = null!;

        /// <summary>
        /// Time at which the developer was created in milliseconds since epoch.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Email address of the developer. This value is used to uniquely identify the developer in Apigee hybrid. Note that the email address has to be in lowercase only..
        /// </summary>
        [Output("email")]
        public Output<string> Email { get; private set; } = null!;

        /// <summary>
        /// First name of the developer.
        /// </summary>
        [Output("firstName")]
        public Output<string> FirstName { get; private set; } = null!;

        /// <summary>
        /// Time at which the developer was last modified in milliseconds since epoch.
        /// </summary>
        [Output("lastModifiedAt")]
        public Output<string> LastModifiedAt { get; private set; } = null!;

        /// <summary>
        /// Last name of the developer.
        /// </summary>
        [Output("lastName")]
        public Output<string> LastName { get; private set; } = null!;

        /// <summary>
        /// The Apigee Organization associated with the Apigee instance,
        /// in the format `organizations/{{org_name}}`.
        /// </summary>
        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// Name of the Apigee organization in which the developer resides.
        /// </summary>
        [Output("organizatioName")]
        public Output<string> OrganizatioName { get; private set; } = null!;

        /// <summary>
        /// Status of the developer. Valid values are active and inactive.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// User name of the developer. Not used by Apigee hybrid.
        /// </summary>
        [Output("userName")]
        public Output<string> UserName { get; private set; } = null!;


        /// <summary>
        /// Create a Developer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Developer(string name, DeveloperArgs args, CustomResourceOptions? options = null)
            : base("gcp:apigee/developer:Developer", name, args ?? new DeveloperArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Developer(string name, Input<string> id, DeveloperState? state = null, CustomResourceOptions? options = null)
            : base("gcp:apigee/developer:Developer", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Developer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Developer Get(string name, Input<string> id, DeveloperState? state = null, CustomResourceOptions? options = null)
        {
            return new Developer(name, id, state, options);
        }
    }

    public sealed class DeveloperArgs : global::Pulumi.ResourceArgs
    {
        [Input("attributes")]
        private InputList<Inputs.DeveloperAttributeArgs>? _attributes;

        /// <summary>
        /// Developer attributes (name/value pairs). The custom attribute limit is 18.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.DeveloperAttributeArgs> Attributes
        {
            get => _attributes ?? (_attributes = new InputList<Inputs.DeveloperAttributeArgs>());
            set => _attributes = value;
        }

        /// <summary>
        /// Email address of the developer. This value is used to uniquely identify the developer in Apigee hybrid. Note that the email address has to be in lowercase only..
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        /// <summary>
        /// First name of the developer.
        /// </summary>
        [Input("firstName", required: true)]
        public Input<string> FirstName { get; set; } = null!;

        /// <summary>
        /// Last name of the developer.
        /// </summary>
        [Input("lastName", required: true)]
        public Input<string> LastName { get; set; } = null!;

        /// <summary>
        /// The Apigee Organization associated with the Apigee instance,
        /// in the format `organizations/{{org_name}}`.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// User name of the developer. Not used by Apigee hybrid.
        /// </summary>
        [Input("userName", required: true)]
        public Input<string> UserName { get; set; } = null!;

        public DeveloperArgs()
        {
        }
        public static new DeveloperArgs Empty => new DeveloperArgs();
    }

    public sealed class DeveloperState : global::Pulumi.ResourceArgs
    {
        [Input("attributes")]
        private InputList<Inputs.DeveloperAttributeGetArgs>? _attributes;

        /// <summary>
        /// Developer attributes (name/value pairs). The custom attribute limit is 18.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.DeveloperAttributeGetArgs> Attributes
        {
            get => _attributes ?? (_attributes = new InputList<Inputs.DeveloperAttributeGetArgs>());
            set => _attributes = value;
        }

        /// <summary>
        /// Time at which the developer was created in milliseconds since epoch.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Email address of the developer. This value is used to uniquely identify the developer in Apigee hybrid. Note that the email address has to be in lowercase only..
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// First name of the developer.
        /// </summary>
        [Input("firstName")]
        public Input<string>? FirstName { get; set; }

        /// <summary>
        /// Time at which the developer was last modified in milliseconds since epoch.
        /// </summary>
        [Input("lastModifiedAt")]
        public Input<string>? LastModifiedAt { get; set; }

        /// <summary>
        /// Last name of the developer.
        /// </summary>
        [Input("lastName")]
        public Input<string>? LastName { get; set; }

        /// <summary>
        /// The Apigee Organization associated with the Apigee instance,
        /// in the format `organizations/{{org_name}}`.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Name of the Apigee organization in which the developer resides.
        /// </summary>
        [Input("organizatioName")]
        public Input<string>? OrganizatioName { get; set; }

        /// <summary>
        /// Status of the developer. Valid values are active and inactive.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// User name of the developer. Not used by Apigee hybrid.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public DeveloperState()
        {
        }
        public static new DeveloperState Empty => new DeveloperState();
    }
}
