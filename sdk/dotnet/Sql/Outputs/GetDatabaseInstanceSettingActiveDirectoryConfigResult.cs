// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Sql.Outputs
{

    [OutputType]
    public sealed class GetDatabaseInstanceSettingActiveDirectoryConfigResult
    {
        public readonly string Domain;

        [OutputConstructor]
        private GetDatabaseInstanceSettingActiveDirectoryConfigResult(string domain)
        {
            Domain = domain;
        }
    }
}