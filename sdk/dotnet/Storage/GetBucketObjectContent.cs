// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage
{
    public static class GetBucketObjectContent
    {
        /// <summary>
        /// Gets an existing object content inside an existing bucket in Google Cloud Storage service (GCS).
        /// See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
        /// and
        /// [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
        /// 
        /// &gt; **Warning:** The object content will be saved in the state, and visible to everyone who has access to the state file.
        /// 
        /// ## Example Usage
        /// 
        /// Example file object  stored within a folder.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var key = Gcp.Storage.GetBucketObjectContent.Invoke(new()
        ///     {
        ///         Name = "encryptedkey",
        ///         Bucket = "keystore",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["encrypted"] = key.Apply(getBucketObjectContentResult =&gt; getBucketObjectContentResult.Content),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetBucketObjectContentResult> InvokeAsync(GetBucketObjectContentArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBucketObjectContentResult>("gcp:storage/getBucketObjectContent:getBucketObjectContent", args ?? new GetBucketObjectContentArgs(), options.WithDefaults());

        /// <summary>
        /// Gets an existing object content inside an existing bucket in Google Cloud Storage service (GCS).
        /// See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
        /// and
        /// [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
        /// 
        /// &gt; **Warning:** The object content will be saved in the state, and visible to everyone who has access to the state file.
        /// 
        /// ## Example Usage
        /// 
        /// Example file object  stored within a folder.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var key = Gcp.Storage.GetBucketObjectContent.Invoke(new()
        ///     {
        ///         Name = "encryptedkey",
        ///         Bucket = "keystore",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["encrypted"] = key.Apply(getBucketObjectContentResult =&gt; getBucketObjectContentResult.Content),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetBucketObjectContentResult> Invoke(GetBucketObjectContentInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBucketObjectContentResult>("gcp:storage/getBucketObjectContent:getBucketObjectContent", args ?? new GetBucketObjectContentInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Gets an existing object content inside an existing bucket in Google Cloud Storage service (GCS).
        /// See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
        /// and
        /// [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
        /// 
        /// &gt; **Warning:** The object content will be saved in the state, and visible to everyone who has access to the state file.
        /// 
        /// ## Example Usage
        /// 
        /// Example file object  stored within a folder.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var key = Gcp.Storage.GetBucketObjectContent.Invoke(new()
        ///     {
        ///         Name = "encryptedkey",
        ///         Bucket = "keystore",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["encrypted"] = key.Apply(getBucketObjectContentResult =&gt; getBucketObjectContentResult.Content),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetBucketObjectContentResult> Invoke(GetBucketObjectContentInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetBucketObjectContentResult>("gcp:storage/getBucketObjectContent:getBucketObjectContent", args ?? new GetBucketObjectContentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBucketObjectContentArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the containing bucket.
        /// </summary>
        [Input("bucket", required: true)]
        public string Bucket { get; set; } = null!;

        /// <summary>
        /// (Computed) The content of the object.
        /// </summary>
        [Input("content")]
        public string? Content { get; set; }

        /// <summary>
        /// The name of the object.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetBucketObjectContentArgs()
        {
        }
        public static new GetBucketObjectContentArgs Empty => new GetBucketObjectContentArgs();
    }

    public sealed class GetBucketObjectContentInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the containing bucket.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// (Computed) The content of the object.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        /// <summary>
        /// The name of the object.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetBucketObjectContentInvokeArgs()
        {
        }
        public static new GetBucketObjectContentInvokeArgs Empty => new GetBucketObjectContentInvokeArgs();
    }


    [OutputType]
    public sealed class GetBucketObjectContentResult
    {
        public readonly string Bucket;
        public readonly string CacheControl;
        /// <summary>
        /// (Computed) The content of the object.
        /// </summary>
        public readonly string Content;
        /// <summary>
        /// (Computed) Base64 encoded version of the object content.
        /// Use this when dealing with binary data.
        /// </summary>
        public readonly string ContentBase64;
        /// <summary>
        /// (Computed) Base64 encoded SHA512 checksum of file content.
        /// </summary>
        public readonly string ContentBase64sha512;
        public readonly string ContentDisposition;
        public readonly string ContentEncoding;
        /// <summary>
        /// (Computed) Hex encoded SHA512 checksum of file content.
        /// </summary>
        public readonly string ContentHexsha512;
        public readonly string ContentLanguage;
        public readonly string ContentType;
        public readonly string Crc32c;
        public readonly ImmutableArray<Outputs.GetBucketObjectContentCustomerEncryptionResult> CustomerEncryptions;
        public readonly string DetectMd5hash;
        public readonly bool EventBasedHold;
        public readonly bool ForceEmptyContentType;
        public readonly int Generation;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string KmsKeyName;
        public readonly string Md5hash;
        public readonly string Md5hexhash;
        public readonly string MediaLink;
        public readonly ImmutableDictionary<string, string> Metadata;
        public readonly string Name;
        public readonly string OutputName;
        public readonly ImmutableArray<Outputs.GetBucketObjectContentRetentionResult> Retentions;
        public readonly string SelfLink;
        public readonly string Source;
        public readonly string SourceMd5hash;
        public readonly string StorageClass;
        public readonly bool TemporaryHold;

        [OutputConstructor]
        private GetBucketObjectContentResult(
            string bucket,

            string cacheControl,

            string content,

            string contentBase64,

            string contentBase64sha512,

            string contentDisposition,

            string contentEncoding,

            string contentHexsha512,

            string contentLanguage,

            string contentType,

            string crc32c,

            ImmutableArray<Outputs.GetBucketObjectContentCustomerEncryptionResult> customerEncryptions,

            string detectMd5hash,

            bool eventBasedHold,

            bool forceEmptyContentType,

            int generation,

            string id,

            string kmsKeyName,

            string md5hash,

            string md5hexhash,

            string mediaLink,

            ImmutableDictionary<string, string> metadata,

            string name,

            string outputName,

            ImmutableArray<Outputs.GetBucketObjectContentRetentionResult> retentions,

            string selfLink,

            string source,

            string sourceMd5hash,

            string storageClass,

            bool temporaryHold)
        {
            Bucket = bucket;
            CacheControl = cacheControl;
            Content = content;
            ContentBase64 = contentBase64;
            ContentBase64sha512 = contentBase64sha512;
            ContentDisposition = contentDisposition;
            ContentEncoding = contentEncoding;
            ContentHexsha512 = contentHexsha512;
            ContentLanguage = contentLanguage;
            ContentType = contentType;
            Crc32c = crc32c;
            CustomerEncryptions = customerEncryptions;
            DetectMd5hash = detectMd5hash;
            EventBasedHold = eventBasedHold;
            ForceEmptyContentType = forceEmptyContentType;
            Generation = generation;
            Id = id;
            KmsKeyName = kmsKeyName;
            Md5hash = md5hash;
            Md5hexhash = md5hexhash;
            MediaLink = mediaLink;
            Metadata = metadata;
            Name = name;
            OutputName = outputName;
            Retentions = retentions;
            SelfLink = selfLink;
            Source = source;
            SourceMd5hash = sourceMd5hash;
            StorageClass = storageClass;
            TemporaryHold = temporaryHold;
        }
    }
}
