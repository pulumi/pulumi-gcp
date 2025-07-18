// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Billing
{
    public static class GetAccountIamPolicy
    {
        /// <summary>
        /// Retrieves the current IAM policy data for a Billing Account.
        /// 
        /// ## example
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var policy = Gcp.Billing.GetAccountIamPolicy.Invoke(new()
        ///     {
        ///         BillingAccountId = "MEEP-MEEP-MEEP-MEEP-MEEP",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAccountIamPolicyResult> InvokeAsync(GetAccountIamPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccountIamPolicyResult>("gcp:billing/getAccountIamPolicy:getAccountIamPolicy", args ?? new GetAccountIamPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the current IAM policy data for a Billing Account.
        /// 
        /// ## example
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var policy = Gcp.Billing.GetAccountIamPolicy.Invoke(new()
        ///     {
        ///         BillingAccountId = "MEEP-MEEP-MEEP-MEEP-MEEP",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAccountIamPolicyResult> Invoke(GetAccountIamPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountIamPolicyResult>("gcp:billing/getAccountIamPolicy:getAccountIamPolicy", args ?? new GetAccountIamPolicyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the current IAM policy data for a Billing Account.
        /// 
        /// ## example
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var policy = Gcp.Billing.GetAccountIamPolicy.Invoke(new()
        ///     {
        ///         BillingAccountId = "MEEP-MEEP-MEEP-MEEP-MEEP",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAccountIamPolicyResult> Invoke(GetAccountIamPolicyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountIamPolicyResult>("gcp:billing/getAccountIamPolicy:getAccountIamPolicy", args ?? new GetAccountIamPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccountIamPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The billing account id.
        /// </summary>
        [Input("billingAccountId", required: true)]
        public string BillingAccountId { get; set; } = null!;

        public GetAccountIamPolicyArgs()
        {
        }
        public static new GetAccountIamPolicyArgs Empty => new GetAccountIamPolicyArgs();
    }

    public sealed class GetAccountIamPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The billing account id.
        /// </summary>
        [Input("billingAccountId", required: true)]
        public Input<string> BillingAccountId { get; set; } = null!;

        public GetAccountIamPolicyInvokeArgs()
        {
        }
        public static new GetAccountIamPolicyInvokeArgs Empty => new GetAccountIamPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccountIamPolicyResult
    {
        public readonly string BillingAccountId;
        /// <summary>
        /// (Computed) The etag of the IAM policy.
        /// </summary>
        public readonly string Etag;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Computed) The policy data
        /// </summary>
        public readonly string PolicyData;

        [OutputConstructor]
        private GetAccountIamPolicyResult(
            string billingAccountId,

            string etag,

            string id,

            string policyData)
        {
            BillingAccountId = billingAccountId;
            Etag = etag;
            Id = id;
            PolicyData = policyData;
        }
    }
}
