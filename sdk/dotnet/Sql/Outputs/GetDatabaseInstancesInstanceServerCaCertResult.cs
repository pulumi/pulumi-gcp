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
    public sealed class GetDatabaseInstancesInstanceServerCaCertResult
    {
        public readonly string Cert;
        public readonly string CommonName;
        public readonly string CreateTime;
        public readonly string ExpirationTime;
        public readonly string Sha1Fingerprint;

        [OutputConstructor]
        private GetDatabaseInstancesInstanceServerCaCertResult(
            string cert,

            string commonName,

            string createTime,

            string expirationTime,

            string sha1Fingerprint)
        {
            Cert = cert;
            CommonName = commonName;
            CreateTime = createTime;
            ExpirationTime = expirationTime;
            Sha1Fingerprint = sha1Fingerprint;
        }
    }
}