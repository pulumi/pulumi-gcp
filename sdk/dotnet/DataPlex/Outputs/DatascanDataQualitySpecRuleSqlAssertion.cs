// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Outputs
{

    [OutputType]
    public sealed class DatascanDataQualitySpecRuleSqlAssertion
    {
        /// <summary>
        /// The SQL statement.
        /// </summary>
        public readonly string SqlStatement;

        [OutputConstructor]
        private DatascanDataQualitySpecRuleSqlAssertion(string sqlStatement)
        {
            SqlStatement = sqlStatement;
        }
    }
}
