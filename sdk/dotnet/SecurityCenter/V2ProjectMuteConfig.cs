// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecurityCenter
{
    /// <summary>
    /// Mute Findings is a volume management feature in Security Command Center
    /// that lets you manually or programmatically hide irrelevant findings,
    /// and create filters to automatically silence existing and future
    /// findings based on criteria you specify.
    /// 
    /// To get more information about ProjectMuteConfig, see:
    /// 
    /// * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/projects.muteConfigs)
    /// 
    /// ## Example Usage
    /// 
    /// ### Scc V2 Project Mute Config Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.SecurityCenter.V2ProjectMuteConfig("default", new()
    ///     {
    ///         MuteConfigId = "my-config",
    ///         Project = "my-project-name",
    ///         Location = "global",
    ///         Description = "My custom Cloud Security Command Center Finding Project mute Configuration",
    ///         Filter = "severity = \"HIGH\"",
    ///         Type = "STATIC",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ProjectMuteConfig can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/muteConfigs/{{mute_config_id}}`
    /// 
    /// * `{{project}}/{{location}}/{{mute_config_id}}`
    /// 
    /// * `{{location}}/{{mute_config_id}}`
    /// 
    /// When using the `pulumi import` command, ProjectMuteConfig can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:securitycenter/v2ProjectMuteConfig:V2ProjectMuteConfig default projects/{{project}}/locations/{{location}}/muteConfigs/{{mute_config_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:securitycenter/v2ProjectMuteConfig:V2ProjectMuteConfig default {{project}}/{{location}}/{{mute_config_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:securitycenter/v2ProjectMuteConfig:V2ProjectMuteConfig default {{location}}/{{mute_config_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:securitycenter/v2ProjectMuteConfig:V2ProjectMuteConfig")]
    public partial class V2ProjectMuteConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The time at which the mute config was created. This field is set by
        /// the server and will be ignored if provided on config creation.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// A description of the mute config.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// An expression that defines the filter to apply across create/update
        /// events of findings. While creating a filter string, be mindful of
        /// the scope in which the mute configuration is being created. E.g.,
        /// If a filter contains project = X but is created under the
        /// project = Y scope, it might not match any findings.
        /// </summary>
        [Output("filter")]
        public Output<string> Filter { get; private set; } = null!;

        /// <summary>
        /// location Id is provided by project. If not provided, Use global as default.
        /// </summary>
        [Output("location")]
        public Output<string?> Location { get; private set; } = null!;

        /// <summary>
        /// Email address of the user who last edited the mute config. This
        /// field is set by the server and will be ignored if provided on
        /// config creation or update.
        /// </summary>
        [Output("mostRecentEditor")]
        public Output<string> MostRecentEditor { get; private set; } = null!;

        /// <summary>
        /// Unique identifier provided by the client within the parent scope.
        /// </summary>
        [Output("muteConfigId")]
        public Output<string> MuteConfigId { get; private set; } = null!;

        /// <summary>
        /// Name of the mute config. Its format is
        /// projects/{project}/locations/global/muteConfigs/{configId},
        /// folders/{folder}/locations/global/muteConfigs/{configId},
        /// or organizations/{organization}/locations/global/muteConfigs/{configId}
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
        /// The type of the mute config.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Output only. The most recent time at which the mute config was
        /// updated. This field is set by the server and will be ignored if
        /// provided on config creation or update.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a V2ProjectMuteConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public V2ProjectMuteConfig(string name, V2ProjectMuteConfigArgs args, CustomResourceOptions? options = null)
            : base("gcp:securitycenter/v2ProjectMuteConfig:V2ProjectMuteConfig", name, args ?? new V2ProjectMuteConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private V2ProjectMuteConfig(string name, Input<string> id, V2ProjectMuteConfigState? state = null, CustomResourceOptions? options = null)
            : base("gcp:securitycenter/v2ProjectMuteConfig:V2ProjectMuteConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing V2ProjectMuteConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static V2ProjectMuteConfig Get(string name, Input<string> id, V2ProjectMuteConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new V2ProjectMuteConfig(name, id, state, options);
        }
    }

    public sealed class V2ProjectMuteConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description of the mute config.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// An expression that defines the filter to apply across create/update
        /// events of findings. While creating a filter string, be mindful of
        /// the scope in which the mute configuration is being created. E.g.,
        /// If a filter contains project = X but is created under the
        /// project = Y scope, it might not match any findings.
        /// </summary>
        [Input("filter", required: true)]
        public Input<string> Filter { get; set; } = null!;

        /// <summary>
        /// location Id is provided by project. If not provided, Use global as default.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Unique identifier provided by the client within the parent scope.
        /// </summary>
        [Input("muteConfigId", required: true)]
        public Input<string> MuteConfigId { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The type of the mute config.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public V2ProjectMuteConfigArgs()
        {
        }
        public static new V2ProjectMuteConfigArgs Empty => new V2ProjectMuteConfigArgs();
    }

    public sealed class V2ProjectMuteConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The time at which the mute config was created. This field is set by
        /// the server and will be ignored if provided on config creation.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// A description of the mute config.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// An expression that defines the filter to apply across create/update
        /// events of findings. While creating a filter string, be mindful of
        /// the scope in which the mute configuration is being created. E.g.,
        /// If a filter contains project = X but is created under the
        /// project = Y scope, it might not match any findings.
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        /// <summary>
        /// location Id is provided by project. If not provided, Use global as default.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Email address of the user who last edited the mute config. This
        /// field is set by the server and will be ignored if provided on
        /// config creation or update.
        /// </summary>
        [Input("mostRecentEditor")]
        public Input<string>? MostRecentEditor { get; set; }

        /// <summary>
        /// Unique identifier provided by the client within the parent scope.
        /// </summary>
        [Input("muteConfigId")]
        public Input<string>? MuteConfigId { get; set; }

        /// <summary>
        /// Name of the mute config. Its format is
        /// projects/{project}/locations/global/muteConfigs/{configId},
        /// folders/{folder}/locations/global/muteConfigs/{configId},
        /// or organizations/{organization}/locations/global/muteConfigs/{configId}
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
        /// The type of the mute config.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Output only. The most recent time at which the mute config was
        /// updated. This field is set by the server and will be ignored if
        /// provided on config creation or update.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public V2ProjectMuteConfigState()
        {
        }
        public static new V2ProjectMuteConfigState Empty => new V2ProjectMuteConfigState();
    }
}
