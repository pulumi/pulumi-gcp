// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataCatalog.Outputs
{

    [OutputType]
    public sealed class PolicyTagIamMemberCondition
    {
        public readonly string? Description;
        public readonly string Expression;
        public readonly string Title;

        [OutputConstructor]
        private PolicyTagIamMemberCondition(
            string? description,

            string expression,

            string title)
        {
            Description = description;
            Expression = expression;
            Title = title;
        }
    }
}
