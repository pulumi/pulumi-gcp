// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firebase
{
    /// <summary>
    /// A domain name that is associated with a backend.
    /// 
    /// ## Example Usage
    /// 
    /// ### Firebase App Hosting Domain Minimal
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var serviceAccount = new Gcp.ServiceAccount.Account("service_account", new()
    ///     {
    ///         Project = "my-project-name",
    ///         AccountId = "sa-id",
    ///         DisplayName = "Firebase App Hosting compute service account",
    ///         CreateIgnoreAlreadyExists = true,
    ///     });
    /// 
    ///     var exampleAppHostingBackend = new Gcp.Firebase.AppHostingBackend("example", new()
    ///     {
    ///         Project = "my-project-name",
    ///         Location = "us-central1",
    ///         BackendId = "domain-mini",
    ///         AppId = "1:0000000000:web:674cde32020e16fbce9dbd",
    ///         ServingLocality = "GLOBAL_ACCESS",
    ///         ServiceAccount = serviceAccount.Email,
    ///     });
    /// 
    ///     var example = new Gcp.Firebase.AppHostingDomain("example", new()
    ///     {
    ///         Project = exampleAppHostingBackend.Project,
    ///         Location = exampleAppHostingBackend.Location,
    ///         Backend = exampleAppHostingBackend.BackendId,
    ///         DomainId = "example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Firebase App Hosting Domain Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var serviceAccount = new Gcp.ServiceAccount.Account("service_account", new()
    ///     {
    ///         Project = "my-project-name",
    ///         AccountId = "sa-id",
    ///         DisplayName = "Firebase App Hosting compute service account",
    ///         CreateIgnoreAlreadyExists = true,
    ///     });
    /// 
    ///     var exampleAppHostingBackend = new Gcp.Firebase.AppHostingBackend("example", new()
    ///     {
    ///         Project = "my-project-name",
    ///         Location = "us-central1",
    ///         BackendId = "domain-full",
    ///         AppId = "1:0000000000:web:674cde32020e16fbce9dbd",
    ///         ServingLocality = "GLOBAL_ACCESS",
    ///         ServiceAccount = serviceAccount.Email,
    ///     });
    /// 
    ///     var example = new Gcp.Firebase.AppHostingDomain("example", new()
    ///     {
    ///         Project = exampleAppHostingBackend.Project,
    ///         Location = exampleAppHostingBackend.Location,
    ///         Backend = exampleAppHostingBackend.BackendId,
    ///         DomainId = "example.com",
    ///         Serve = new Gcp.Firebase.Inputs.AppHostingDomainServeArgs
    ///         {
    ///             Redirect = new Gcp.Firebase.Inputs.AppHostingDomainServeRedirectArgs
    ///             {
    ///                 Uri = "google.com",
    ///                 Status = "302",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Domain can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/backends/{{backend}}/domains/{{domain_id}}`
    /// 
    /// * `{{project}}/{{location}}/{{backend}}/{{domain_id}}`
    /// 
    /// * `{{location}}/{{backend}}/{{domain_id}}`
    /// 
    /// When using the `pulumi import` command, Domain can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:firebase/appHostingDomain:AppHostingDomain default projects/{{project}}/locations/{{location}}/backends/{{backend}}/domains/{{domain_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:firebase/appHostingDomain:AppHostingDomain default {{project}}/{{location}}/{{backend}}/{{domain_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:firebase/appHostingDomain:AppHostingDomain default {{location}}/{{backend}}/{{domain_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:firebase/appHostingDomain:AppHostingDomain")]
    public partial class AppHostingDomain : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Backend that this Domain is associated with
        /// </summary>
        [Output("backend")]
        public Output<string> Backend { get; private set; } = null!;

        /// <summary>
        /// Time at which the domain was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The status of a custom domain's linkage to the Backend.
        /// Structure is documented below.
        /// </summary>
        [Output("customDomainStatuses")]
        public Output<ImmutableArray<Outputs.AppHostingDomainCustomDomainStatus>> CustomDomainStatuses { get; private set; } = null!;

        /// <summary>
        /// Time at which the domain was deleted.
        /// </summary>
        [Output("deleteTime")]
        public Output<string> DeleteTime { get; private set; } = null!;

        /// <summary>
        /// Id of the domain to create.
        /// Must be a valid domain name, such as "foo.com"
        /// </summary>
        [Output("domainId")]
        public Output<string> DomainId { get; private set; } = null!;

        /// <summary>
        /// Server-computed checksum based on other values; may be sent
        /// on update or delete to ensure operation is done on expected resource.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The location of the Backend that this Domain is associated with
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Identifier. The resource name of the domain, e.g.
        /// `projects/{project}/locations/{locationId}/backends/{backendId}/domains/{domainId}`
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
        /// Time at which a soft-deleted domain will be purged, rendering in
        /// permanently deleted.
        /// </summary>
        [Output("purgeTime")]
        public Output<string> PurgeTime { get; private set; } = null!;

        /// <summary>
        /// The serving behavior of the domain. If specified, the domain will
        /// serve content other than its Backend's live content.
        /// Structure is documented below.
        /// </summary>
        [Output("serve")]
        public Output<Outputs.AppHostingDomainServe?> Serve { get; private set; } = null!;

        /// <summary>
        /// System-assigned, unique identifier.
        /// </summary>
        [Output("uid")]
        public Output<string> Uid { get; private set; } = null!;

        /// <summary>
        /// Time at which the domain was last updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a AppHostingDomain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AppHostingDomain(string name, AppHostingDomainArgs args, CustomResourceOptions? options = null)
            : base("gcp:firebase/appHostingDomain:AppHostingDomain", name, args ?? new AppHostingDomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AppHostingDomain(string name, Input<string> id, AppHostingDomainState? state = null, CustomResourceOptions? options = null)
            : base("gcp:firebase/appHostingDomain:AppHostingDomain", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AppHostingDomain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AppHostingDomain Get(string name, Input<string> id, AppHostingDomainState? state = null, CustomResourceOptions? options = null)
        {
            return new AppHostingDomain(name, id, state, options);
        }
    }

    public sealed class AppHostingDomainArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Backend that this Domain is associated with
        /// </summary>
        [Input("backend", required: true)]
        public Input<string> Backend { get; set; } = null!;

        /// <summary>
        /// Id of the domain to create.
        /// Must be a valid domain name, such as "foo.com"
        /// </summary>
        [Input("domainId", required: true)]
        public Input<string> DomainId { get; set; } = null!;

        /// <summary>
        /// The location of the Backend that this Domain is associated with
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The serving behavior of the domain. If specified, the domain will
        /// serve content other than its Backend's live content.
        /// Structure is documented below.
        /// </summary>
        [Input("serve")]
        public Input<Inputs.AppHostingDomainServeArgs>? Serve { get; set; }

        public AppHostingDomainArgs()
        {
        }
        public static new AppHostingDomainArgs Empty => new AppHostingDomainArgs();
    }

    public sealed class AppHostingDomainState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Backend that this Domain is associated with
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        /// <summary>
        /// Time at which the domain was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        [Input("customDomainStatuses")]
        private InputList<Inputs.AppHostingDomainCustomDomainStatusGetArgs>? _customDomainStatuses;

        /// <summary>
        /// The status of a custom domain's linkage to the Backend.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.AppHostingDomainCustomDomainStatusGetArgs> CustomDomainStatuses
        {
            get => _customDomainStatuses ?? (_customDomainStatuses = new InputList<Inputs.AppHostingDomainCustomDomainStatusGetArgs>());
            set => _customDomainStatuses = value;
        }

        /// <summary>
        /// Time at which the domain was deleted.
        /// </summary>
        [Input("deleteTime")]
        public Input<string>? DeleteTime { get; set; }

        /// <summary>
        /// Id of the domain to create.
        /// Must be a valid domain name, such as "foo.com"
        /// </summary>
        [Input("domainId")]
        public Input<string>? DomainId { get; set; }

        /// <summary>
        /// Server-computed checksum based on other values; may be sent
        /// on update or delete to ensure operation is done on expected resource.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The location of the Backend that this Domain is associated with
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Identifier. The resource name of the domain, e.g.
        /// `projects/{project}/locations/{locationId}/backends/{backendId}/domains/{domainId}`
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
        /// Time at which a soft-deleted domain will be purged, rendering in
        /// permanently deleted.
        /// </summary>
        [Input("purgeTime")]
        public Input<string>? PurgeTime { get; set; }

        /// <summary>
        /// The serving behavior of the domain. If specified, the domain will
        /// serve content other than its Backend's live content.
        /// Structure is documented below.
        /// </summary>
        [Input("serve")]
        public Input<Inputs.AppHostingDomainServeGetArgs>? Serve { get; set; }

        /// <summary>
        /// System-assigned, unique identifier.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        /// <summary>
        /// Time at which the domain was last updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public AppHostingDomainState()
        {
        }
        public static new AppHostingDomainState Empty => new AppHostingDomainState();
    }
}
