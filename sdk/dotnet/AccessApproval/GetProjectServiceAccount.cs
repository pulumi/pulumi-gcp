// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AccessApproval
{
    public static class GetProjectServiceAccount
    {
        /// <summary>
        /// Get the email address of a project's Access Approval service account.
        /// 
        /// Each Google Cloud project has a unique service account used by Access Approval.
        /// When using Access Approval with a
        /// [custom signing key](https://cloud.google.com/cloud-provider-access-management/access-approval/docs/review-approve-access-requests-custom-keys),
        /// this account needs to be granted the `cloudkms.signerVerifier` IAM role on the
        /// Cloud KMS key used to sign approvals.
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
        ///     var serviceAccount = Gcp.AccessApproval.GetProjectServiceAccount.Invoke(new()
        ///     {
        ///         ProjectId = "my-project",
        ///     });
        /// 
        ///     var iam = new Gcp.Kms.CryptoKeyIAMMember("iam", new()
        ///     {
        ///         CryptoKeyId = cryptoKey.Id,
        ///         Role = "roles/cloudkms.signerVerifier",
        ///         Member = $"serviceAccount:{serviceAccount.Apply(getProjectServiceAccountResult =&gt; getProjectServiceAccountResult.AccountEmail)}",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetProjectServiceAccountResult> InvokeAsync(GetProjectServiceAccountArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProjectServiceAccountResult>("gcp:accessapproval/getProjectServiceAccount:getProjectServiceAccount", args ?? new GetProjectServiceAccountArgs(), options.WithDefaults());

        /// <summary>
        /// Get the email address of a project's Access Approval service account.
        /// 
        /// Each Google Cloud project has a unique service account used by Access Approval.
        /// When using Access Approval with a
        /// [custom signing key](https://cloud.google.com/cloud-provider-access-management/access-approval/docs/review-approve-access-requests-custom-keys),
        /// this account needs to be granted the `cloudkms.signerVerifier` IAM role on the
        /// Cloud KMS key used to sign approvals.
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
        ///     var serviceAccount = Gcp.AccessApproval.GetProjectServiceAccount.Invoke(new()
        ///     {
        ///         ProjectId = "my-project",
        ///     });
        /// 
        ///     var iam = new Gcp.Kms.CryptoKeyIAMMember("iam", new()
        ///     {
        ///         CryptoKeyId = cryptoKey.Id,
        ///         Role = "roles/cloudkms.signerVerifier",
        ///         Member = $"serviceAccount:{serviceAccount.Apply(getProjectServiceAccountResult =&gt; getProjectServiceAccountResult.AccountEmail)}",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetProjectServiceAccountResult> Invoke(GetProjectServiceAccountInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectServiceAccountResult>("gcp:accessapproval/getProjectServiceAccount:getProjectServiceAccount", args ?? new GetProjectServiceAccountInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get the email address of a project's Access Approval service account.
        /// 
        /// Each Google Cloud project has a unique service account used by Access Approval.
        /// When using Access Approval with a
        /// [custom signing key](https://cloud.google.com/cloud-provider-access-management/access-approval/docs/review-approve-access-requests-custom-keys),
        /// this account needs to be granted the `cloudkms.signerVerifier` IAM role on the
        /// Cloud KMS key used to sign approvals.
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
        ///     var serviceAccount = Gcp.AccessApproval.GetProjectServiceAccount.Invoke(new()
        ///     {
        ///         ProjectId = "my-project",
        ///     });
        /// 
        ///     var iam = new Gcp.Kms.CryptoKeyIAMMember("iam", new()
        ///     {
        ///         CryptoKeyId = cryptoKey.Id,
        ///         Role = "roles/cloudkms.signerVerifier",
        ///         Member = $"serviceAccount:{serviceAccount.Apply(getProjectServiceAccountResult =&gt; getProjectServiceAccountResult.AccountEmail)}",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetProjectServiceAccountResult> Invoke(GetProjectServiceAccountInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectServiceAccountResult>("gcp:accessapproval/getProjectServiceAccount:getProjectServiceAccount", args ?? new GetProjectServiceAccountInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProjectServiceAccountArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The project ID the service account was created for.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetProjectServiceAccountArgs()
        {
        }
        public static new GetProjectServiceAccountArgs Empty => new GetProjectServiceAccountArgs();
    }

    public sealed class GetProjectServiceAccountInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The project ID the service account was created for.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetProjectServiceAccountInvokeArgs()
        {
        }
        public static new GetProjectServiceAccountInvokeArgs Empty => new GetProjectServiceAccountInvokeArgs();
    }


    [OutputType]
    public sealed class GetProjectServiceAccountResult
    {
        /// <summary>
        /// The email address of the service account. This value is
        /// often used to refer to the service account in order to grant IAM permissions.
        /// </summary>
        public readonly string AccountEmail;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Access Approval service account resource name. Format is "projects/{project_id}/serviceAccount".
        /// </summary>
        public readonly string Name;
        public readonly string ProjectId;

        [OutputConstructor]
        private GetProjectServiceAccountResult(
            string accountEmail,

            string id,

            string name,

            string projectId)
        {
            AccountEmail = accountEmail;
            Id = id;
            Name = name;
            ProjectId = projectId;
        }
    }
}
