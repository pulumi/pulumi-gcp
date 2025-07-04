// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage
{
    [Obsolete(@"gcp.storage.getTransferProjectServieAccount has been deprecated in favor of gcp.storage.getTransferProjectServiceAccount")]
    public static class GetTransferProjectServieAccount
    {
        /// <summary>
        /// Use this data source to retrieve Storage Transfer service account for this project
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = Gcp.Storage.GetTransferProjectServiceAccount.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["defaultAccount"] = @default.Apply(@default =&gt; @default.Apply(getTransferProjectServiceAccountResult =&gt; getTransferProjectServiceAccountResult.Email)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetTransferProjectServieAccountResult> InvokeAsync(GetTransferProjectServieAccountArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTransferProjectServieAccountResult>("gcp:storage/getTransferProjectServieAccount:getTransferProjectServieAccount", args ?? new GetTransferProjectServieAccountArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve Storage Transfer service account for this project
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = Gcp.Storage.GetTransferProjectServiceAccount.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["defaultAccount"] = @default.Apply(@default =&gt; @default.Apply(getTransferProjectServiceAccountResult =&gt; getTransferProjectServiceAccountResult.Email)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetTransferProjectServieAccountResult> Invoke(GetTransferProjectServieAccountInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTransferProjectServieAccountResult>("gcp:storage/getTransferProjectServieAccount:getTransferProjectServieAccount", args ?? new GetTransferProjectServieAccountInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve Storage Transfer service account for this project
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = Gcp.Storage.GetTransferProjectServiceAccount.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["defaultAccount"] = @default.Apply(@default =&gt; @default.Apply(getTransferProjectServiceAccountResult =&gt; getTransferProjectServiceAccountResult.Email)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetTransferProjectServieAccountResult> Invoke(GetTransferProjectServieAccountInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTransferProjectServieAccountResult>("gcp:storage/getTransferProjectServieAccount:getTransferProjectServieAccount", args ?? new GetTransferProjectServieAccountInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTransferProjectServieAccountArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The project ID. If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        public GetTransferProjectServieAccountArgs()
        {
        }
        public static new GetTransferProjectServieAccountArgs Empty => new GetTransferProjectServieAccountArgs();
    }

    public sealed class GetTransferProjectServieAccountInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The project ID. If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetTransferProjectServieAccountInvokeArgs()
        {
        }
        public static new GetTransferProjectServieAccountInvokeArgs Empty => new GetTransferProjectServieAccountInvokeArgs();
    }


    [OutputType]
    public sealed class GetTransferProjectServieAccountResult
    {
        /// <summary>
        /// Email address of the default service account used by Storage Transfer Jobs running in this project.
        /// </summary>
        public readonly string Email;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Identity of the service account in the form `serviceAccount:{email}`. This value is often used to refer to the service account in order to grant IAM permissions.
        /// </summary>
        public readonly string Member;
        public readonly string Project;
        /// <summary>
        /// Unique identifier for the service account.
        /// </summary>
        public readonly string SubjectId;

        [OutputConstructor]
        private GetTransferProjectServieAccountResult(
            string email,

            string id,

            string member,

            string project,

            string subjectId)
        {
            Email = email;
            Id = id;
            Member = member;
            Project = project;
            SubjectId = subjectId;
        }
    }
}
