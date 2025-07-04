// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Organizations
{
    public static class GetIamCustomRole
    {
        /// <summary>
        /// Get information about a Google Cloud Organization IAM Custom Role. Note that you must have the `roles/iam.organizationRoleViewer` role (or equivalent permissions) at the organization level to use this datasource.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Gcp.Organizations.GetIamCustomRole.Invoke(new()
        ///     {
        ///         OrgId = "1234567890",
        ///         RoleId = "your-role-id",
        ///     });
        /// 
        ///     var project = new Gcp.Projects.IAMMember("project", new()
        ///     {
        ///         Project = "your-project-id",
        ///         Role = example.Apply(getIamCustomRoleResult =&gt; getIamCustomRoleResult.Name),
        ///         Member = "user:jane@example.com",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetIamCustomRoleResult> InvokeAsync(GetIamCustomRoleArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIamCustomRoleResult>("gcp:organizations/getIamCustomRole:getIamCustomRole", args ?? new GetIamCustomRoleArgs(), options.WithDefaults());

        /// <summary>
        /// Get information about a Google Cloud Organization IAM Custom Role. Note that you must have the `roles/iam.organizationRoleViewer` role (or equivalent permissions) at the organization level to use this datasource.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Gcp.Organizations.GetIamCustomRole.Invoke(new()
        ///     {
        ///         OrgId = "1234567890",
        ///         RoleId = "your-role-id",
        ///     });
        /// 
        ///     var project = new Gcp.Projects.IAMMember("project", new()
        ///     {
        ///         Project = "your-project-id",
        ///         Role = example.Apply(getIamCustomRoleResult =&gt; getIamCustomRoleResult.Name),
        ///         Member = "user:jane@example.com",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetIamCustomRoleResult> Invoke(GetIamCustomRoleInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIamCustomRoleResult>("gcp:organizations/getIamCustomRole:getIamCustomRole", args ?? new GetIamCustomRoleInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get information about a Google Cloud Organization IAM Custom Role. Note that you must have the `roles/iam.organizationRoleViewer` role (or equivalent permissions) at the organization level to use this datasource.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Gcp.Organizations.GetIamCustomRole.Invoke(new()
        ///     {
        ///         OrgId = "1234567890",
        ///         RoleId = "your-role-id",
        ///     });
        /// 
        ///     var project = new Gcp.Projects.IAMMember("project", new()
        ///     {
        ///         Project = "your-project-id",
        ///         Role = example.Apply(getIamCustomRoleResult =&gt; getIamCustomRoleResult.Name),
        ///         Member = "user:jane@example.com",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetIamCustomRoleResult> Invoke(GetIamCustomRoleInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetIamCustomRoleResult>("gcp:organizations/getIamCustomRole:getIamCustomRole", args ?? new GetIamCustomRoleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIamCustomRoleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The numeric ID of the organization in which you want to create a custom role.
        /// </summary>
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        /// <summary>
        /// The role id that has been used for this role.
        /// </summary>
        [Input("roleId", required: true)]
        public string RoleId { get; set; } = null!;

        public GetIamCustomRoleArgs()
        {
        }
        public static new GetIamCustomRoleArgs Empty => new GetIamCustomRoleArgs();
    }

    public sealed class GetIamCustomRoleInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The numeric ID of the organization in which you want to create a custom role.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// The role id that has been used for this role.
        /// </summary>
        [Input("roleId", required: true)]
        public Input<string> RoleId { get; set; } = null!;

        public GetIamCustomRoleInvokeArgs()
        {
        }
        public static new GetIamCustomRoleInvokeArgs Empty => new GetIamCustomRoleInvokeArgs();
    }


    [OutputType]
    public sealed class GetIamCustomRoleResult
    {
        public readonly bool Deleted;
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string OrgId;
        public readonly ImmutableArray<string> Permissions;
        public readonly string RoleId;
        public readonly string Stage;
        public readonly string Title;

        [OutputConstructor]
        private GetIamCustomRoleResult(
            bool deleted,

            string description,

            string id,

            string name,

            string orgId,

            ImmutableArray<string> permissions,

            string roleId,

            string stage,

            string title)
        {
            Deleted = deleted;
            Description = description;
            Id = id;
            Name = name;
            OrgId = orgId;
            Permissions = permissions;
            RoleId = roleId;
            Stage = stage;
            Title = title;
        }
    }
}
