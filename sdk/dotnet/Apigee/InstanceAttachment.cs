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
    /// An `Instance attachment` in Apigee.
    /// 
    /// To get more information about InstanceAttachment, see:
    /// 
    /// * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances.attachments/create)
    /// * How-to Guides
    ///     * [Creating an environment](https://cloud.google.com/apigee/docs/api-platform/get-started/create-environment)
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// InstanceAttachment can be imported using any of these accepted formats:
    /// 
    /// * `{{instance_id}}/attachments/{{name}}`
    /// 
    /// * `{{instance_id}}/{{name}}`
    /// 
    /// When using the `pulumi import` command, InstanceAttachment can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:apigee/instanceAttachment:InstanceAttachment default {{instance_id}}/attachments/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:apigee/instanceAttachment:InstanceAttachment default {{instance_id}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:apigee/instanceAttachment:InstanceAttachment")]
    public partial class InstanceAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The resource ID of the environment.
        /// </summary>
        [Output("environment")]
        public Output<string> Environment { get; private set; } = null!;

        /// <summary>
        /// The Apigee instance associated with the Apigee environment,
        /// in the format `organizations/{{org_name}}/instances/{{instance_name}}`.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// The name of the newly created  attachment (output parameter).
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a InstanceAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InstanceAttachment(string name, InstanceAttachmentArgs args, CustomResourceOptions? options = null)
            : base("gcp:apigee/instanceAttachment:InstanceAttachment", name, args ?? new InstanceAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InstanceAttachment(string name, Input<string> id, InstanceAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("gcp:apigee/instanceAttachment:InstanceAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InstanceAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InstanceAttachment Get(string name, Input<string> id, InstanceAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new InstanceAttachment(name, id, state, options);
        }
    }

    public sealed class InstanceAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource ID of the environment.
        /// </summary>
        [Input("environment", required: true)]
        public Input<string> Environment { get; set; } = null!;

        /// <summary>
        /// The Apigee instance associated with the Apigee environment,
        /// in the format `organizations/{{org_name}}/instances/{{instance_name}}`.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        public InstanceAttachmentArgs()
        {
        }
        public static new InstanceAttachmentArgs Empty => new InstanceAttachmentArgs();
    }

    public sealed class InstanceAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource ID of the environment.
        /// </summary>
        [Input("environment")]
        public Input<string>? Environment { get; set; }

        /// <summary>
        /// The Apigee instance associated with the Apigee environment,
        /// in the format `organizations/{{org_name}}/instances/{{instance_name}}`.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The name of the newly created  attachment (output parameter).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public InstanceAttachmentState()
        {
        }
        public static new InstanceAttachmentState Empty => new InstanceAttachmentState();
    }
}
