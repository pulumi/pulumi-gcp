// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ApiGateway.Outputs
{

    [OutputType]
    public sealed class ApiConfigGrpcService
    {
        /// <summary>
        /// Input only. File descriptor set, generated by protoc.
        /// To generate, use protoc with imports and source info included. For an example test.proto file, the following command would put the value in a new file named out.pb.
        /// $ protoc --include_imports --include_source_info test.proto -o out.pb
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ApiConfigGrpcServiceFileDescriptorSet FileDescriptorSet;
        /// <summary>
        /// Uncompiled proto files associated with the descriptor set, used for display purposes (server-side compilation is not supported). These should match the inputs to 'protoc' command used to generate fileDescriptorSet.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ApiConfigGrpcServiceSource> Sources;

        [OutputConstructor]
        private ApiConfigGrpcService(
            Outputs.ApiConfigGrpcServiceFileDescriptorSet fileDescriptorSet,

            ImmutableArray<Outputs.ApiConfigGrpcServiceSource> sources)
        {
            FileDescriptorSet = fileDescriptorSet;
            Sources = sources;
        }
    }
}