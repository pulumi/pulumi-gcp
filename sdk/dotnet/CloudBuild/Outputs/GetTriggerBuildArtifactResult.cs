// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudBuild.Outputs
{

    [OutputType]
    public sealed class GetTriggerBuildArtifactResult
    {
        /// <summary>
        /// A list of images to be pushed upon the successful completion of all build steps.
        /// 
        /// The images will be pushed using the builder service account's credentials.
        /// 
        /// The digests of the pushed images will be stored in the Build resource's results field.
        /// 
        /// If any of the images fail to be pushed, the build is marked FAILURE.
        /// </summary>
        public readonly ImmutableArray<string> Images;
        /// <summary>
        /// A Maven artifact to upload to Artifact Registry upon successful completion of all build steps.
        /// 
        /// The location and generation of the uploaded objects will be stored in the Build resource's results field.
        /// 
        /// If any objects fail to be pushed, the build is marked FAILURE.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTriggerBuildArtifactMavenArtifactResult> MavenArtifacts;
        /// <summary>
        /// Npm package to upload to Artifact Registry upon successful completion of all build steps.
        /// 
        /// The location and generation of the uploaded objects will be stored in the Build resource's results field.
        /// 
        /// If any objects fail to be pushed, the build is marked FAILURE.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTriggerBuildArtifactNpmPackageResult> NpmPackages;
        /// <summary>
        /// A list of objects to be uploaded to Cloud Storage upon successful completion of all build steps.
        /// 
        /// Files in the workspace matching specified paths globs will be uploaded to the
        /// Cloud Storage location using the builder service account's credentials.
        /// 
        /// The location and generation of the uploaded objects will be stored in the Build resource's results field.
        /// 
        /// If any objects fail to be pushed, the build is marked FAILURE.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTriggerBuildArtifactObjectResult> Objects;
        /// <summary>
        /// Python package to upload to Artifact Registry upon successful completion of all build steps. A package can encapsulate multiple objects to be uploaded to a single repository.
        /// 
        /// The location and generation of the uploaded objects will be stored in the Build resource's results field.
        /// 
        /// If any objects fail to be pushed, the build is marked FAILURE.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTriggerBuildArtifactPythonPackageResult> PythonPackages;

        [OutputConstructor]
        private GetTriggerBuildArtifactResult(
            ImmutableArray<string> images,

            ImmutableArray<Outputs.GetTriggerBuildArtifactMavenArtifactResult> mavenArtifacts,

            ImmutableArray<Outputs.GetTriggerBuildArtifactNpmPackageResult> npmPackages,

            ImmutableArray<Outputs.GetTriggerBuildArtifactObjectResult> objects,

            ImmutableArray<Outputs.GetTriggerBuildArtifactPythonPackageResult> pythonPackages)
        {
            Images = images;
            MavenArtifacts = mavenArtifacts;
            NpmPackages = npmPackages;
            Objects = objects;
            PythonPackages = pythonPackages;
        }
    }
}
