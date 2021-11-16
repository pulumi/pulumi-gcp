﻿using System.Collections.Generic;
using System.Threading.Tasks;

using Pulumi;
using Pulumi.Gcp.CloudFunctions;
using Pulumi.Gcp.Storage;

class Program
{
    static Task<int> Main()
    {
        return Deployment.RunAsync(() => {

            var bucket = new Bucket("bucket", new BucketArgs
            {
                Location = "US",
            });

            var bucketObject = new BucketObject("python-zip", new BucketObjectArgs
            {
                Bucket = bucket.Name,
                Source = new FileArchive("./pythonfunc")
            });

            var function = new Function("python-func", new FunctionArgs
            {
                SourceArchiveBucket = bucket.Name,
                Runtime = "python37",
                SourceArchiveObject = bucketObject.Name,
                EntryPoint = "handler",
                TriggerHttp = true,
                AvailableMemoryMb = 128
            });

            var invoker = new FunctionIamMember("invoker", new FunctionIamMemberArgs
            {
                Project = function.Project,
                Region = function.Region,
                CloudFunction = function.Name,

                Role = "roles/cloudfunctions.invoker",
                Member = "allUsers",
            });

            // Export the URL of the function
            return new Dictionary<string, object>
            {
                { "url", function.HttpsTriggerUrl },
            };
        });
    }
}
