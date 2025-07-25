// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Monitoring.Inputs
{

    public sealed class AlertPolicyDocumentationLinkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A short display name for the link. The display name must not be empty or exceed 63 characters. Example: "playbook".
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The url of a webpage. A url can be templatized by using variables in the path or the query parameters. The total length of a URL should not exceed 2083 characters before and after variable expansion. Example: "https://my_domain.com/playbook?name=${resource.name}".
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public AlertPolicyDocumentationLinkArgs()
        {
        }
        public static new AlertPolicyDocumentationLinkArgs Empty => new AlertPolicyDocumentationLinkArgs();
    }
}
