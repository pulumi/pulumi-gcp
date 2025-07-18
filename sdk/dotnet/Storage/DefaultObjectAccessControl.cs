// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage
{
    /// <summary>
    /// The DefaultObjectAccessControls resources represent the Access Control
    /// Lists (ACLs) applied to a new object within a Google Cloud Storage bucket
    /// when no ACL was provided for that object. ACLs let you specify who has
    /// access to your bucket contents and to what extent.
    /// 
    /// There are two roles that can be assigned to an entity:
    /// 
    /// READERs can get an object, though the acl property will not be revealed.
    /// OWNERs are READERs, and they can get the acl property, update an object,
    /// and call all objectAccessControls methods on the object. The owner of an
    /// object is always an OWNER.
    /// For more information, see Access Control, with the caveat that this API
    /// uses READER and OWNER instead of READ and FULL_CONTROL.
    /// 
    /// To get more information about DefaultObjectAccessControl, see:
    /// 
    /// * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/defaultObjectAccessControls)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/storage/docs/access-control/create-manage-lists)
    /// 
    /// ## Example Usage
    /// 
    /// ### Storage Default Object Access Control Public
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var bucket = new Gcp.Storage.Bucket("bucket", new()
    ///     {
    ///         Name = "static-content-bucket",
    ///         Location = "US",
    ///     });
    /// 
    ///     var publicRule = new Gcp.Storage.DefaultObjectAccessControl("public_rule", new()
    ///     {
    ///         Bucket = bucket.Name,
    ///         Role = "READER",
    ///         Entity = "allUsers",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// DefaultObjectAccessControl can be imported using any of these accepted formats:
    /// 
    /// * `{{bucket}}/{{entity}}`
    /// 
    /// When using the `pulumi import` command, DefaultObjectAccessControl can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:storage/defaultObjectAccessControl:DefaultObjectAccessControl default {{bucket}}/{{entity}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:storage/defaultObjectAccessControl:DefaultObjectAccessControl")]
    public partial class DefaultObjectAccessControl : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the bucket.
        /// </summary>
        [Output("bucket")]
        public Output<string> Bucket { get; private set; } = null!;

        /// <summary>
        /// The domain associated with the entity.
        /// </summary>
        [Output("domain")]
        public Output<string> Domain { get; private set; } = null!;

        /// <summary>
        /// The email address associated with the entity.
        /// </summary>
        [Output("email")]
        public Output<string> Email { get; private set; } = null!;

        /// <summary>
        /// The entity holding the permission, in one of the following forms:
        /// * user-{{userId}}
        /// * user-{{email}} (such as "user-liz@example.com")
        /// * group-{{groupId}}
        /// * group-{{email}} (such as "group-example@googlegroups.com")
        /// * domain-{{domain}} (such as "domain-example.com")
        /// * project-team-{{projectId}}
        /// * allUsers
        /// * allAuthenticatedUsers
        /// </summary>
        [Output("entity")]
        public Output<string> Entity { get; private set; } = null!;

        /// <summary>
        /// The ID for the entity
        /// </summary>
        [Output("entityId")]
        public Output<string> EntityId { get; private set; } = null!;

        /// <summary>
        /// The content generation of the object, if applied to an object.
        /// </summary>
        [Output("generation")]
        public Output<int> Generation { get; private set; } = null!;

        /// <summary>
        /// The name of the object, if applied to an object.
        /// </summary>
        [Output("object")]
        public Output<string?> Object { get; private set; } = null!;

        /// <summary>
        /// The project team associated with the entity
        /// Structure is documented below.
        /// </summary>
        [Output("projectTeams")]
        public Output<ImmutableArray<Outputs.DefaultObjectAccessControlProjectTeam>> ProjectTeams { get; private set; } = null!;

        /// <summary>
        /// The access permission for the entity.
        /// Possible values are: `OWNER`, `READER`.
        /// </summary>
        [Output("role")]
        public Output<string> Role { get; private set; } = null!;


        /// <summary>
        /// Create a DefaultObjectAccessControl resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DefaultObjectAccessControl(string name, DefaultObjectAccessControlArgs args, CustomResourceOptions? options = null)
            : base("gcp:storage/defaultObjectAccessControl:DefaultObjectAccessControl", name, args ?? new DefaultObjectAccessControlArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DefaultObjectAccessControl(string name, Input<string> id, DefaultObjectAccessControlState? state = null, CustomResourceOptions? options = null)
            : base("gcp:storage/defaultObjectAccessControl:DefaultObjectAccessControl", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DefaultObjectAccessControl resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DefaultObjectAccessControl Get(string name, Input<string> id, DefaultObjectAccessControlState? state = null, CustomResourceOptions? options = null)
        {
            return new DefaultObjectAccessControl(name, id, state, options);
        }
    }

    public sealed class DefaultObjectAccessControlArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bucket.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// The entity holding the permission, in one of the following forms:
        /// * user-{{userId}}
        /// * user-{{email}} (such as "user-liz@example.com")
        /// * group-{{groupId}}
        /// * group-{{email}} (such as "group-example@googlegroups.com")
        /// * domain-{{domain}} (such as "domain-example.com")
        /// * project-team-{{projectId}}
        /// * allUsers
        /// * allAuthenticatedUsers
        /// </summary>
        [Input("entity", required: true)]
        public Input<string> Entity { get; set; } = null!;

        /// <summary>
        /// The name of the object, if applied to an object.
        /// </summary>
        [Input("object")]
        public Input<string>? Object { get; set; }

        /// <summary>
        /// The access permission for the entity.
        /// Possible values are: `OWNER`, `READER`.
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        public DefaultObjectAccessControlArgs()
        {
        }
        public static new DefaultObjectAccessControlArgs Empty => new DefaultObjectAccessControlArgs();
    }

    public sealed class DefaultObjectAccessControlState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bucket.
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// The domain associated with the entity.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// The email address associated with the entity.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// The entity holding the permission, in one of the following forms:
        /// * user-{{userId}}
        /// * user-{{email}} (such as "user-liz@example.com")
        /// * group-{{groupId}}
        /// * group-{{email}} (such as "group-example@googlegroups.com")
        /// * domain-{{domain}} (such as "domain-example.com")
        /// * project-team-{{projectId}}
        /// * allUsers
        /// * allAuthenticatedUsers
        /// </summary>
        [Input("entity")]
        public Input<string>? Entity { get; set; }

        /// <summary>
        /// The ID for the entity
        /// </summary>
        [Input("entityId")]
        public Input<string>? EntityId { get; set; }

        /// <summary>
        /// The content generation of the object, if applied to an object.
        /// </summary>
        [Input("generation")]
        public Input<int>? Generation { get; set; }

        /// <summary>
        /// The name of the object, if applied to an object.
        /// </summary>
        [Input("object")]
        public Input<string>? Object { get; set; }

        [Input("projectTeams")]
        private InputList<Inputs.DefaultObjectAccessControlProjectTeamGetArgs>? _projectTeams;

        /// <summary>
        /// The project team associated with the entity
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.DefaultObjectAccessControlProjectTeamGetArgs> ProjectTeams
        {
            get => _projectTeams ?? (_projectTeams = new InputList<Inputs.DefaultObjectAccessControlProjectTeamGetArgs>());
            set => _projectTeams = value;
        }

        /// <summary>
        /// The access permission for the entity.
        /// Possible values are: `OWNER`, `READER`.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        public DefaultObjectAccessControlState()
        {
        }
        public static new DefaultObjectAccessControlState Empty => new DefaultObjectAccessControlState();
    }
}
