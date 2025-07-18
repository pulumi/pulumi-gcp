// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Transcoding Job Resource
 *
 * To get more information about Job, see:
 *
 * * [API documentation](https://cloud.google.com/transcoder/docs/reference/rest/v1/projects.locations.jobs)
 * * How-to Guides
 *     * [Transcoder](https://cloud.google.com/transcoder/docs/)
 *
 * ## Example Usage
 *
 * ### Transcoder Job Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.storage.Bucket("default", {
 *     name: "transcoder-job",
 *     location: "US",
 *     forceDestroy: true,
 *     uniformBucketLevelAccess: true,
 *     publicAccessPrevention: "enforced",
 * });
 * const exampleMp4 = new gcp.storage.BucketObject("example_mp4", {
 *     name: "example.mp4",
 *     source: new pulumi.asset.FileAsset("./test-fixtures/example.mp4"),
 *     bucket: _default.name,
 * });
 * const defaultJobTemplate = new gcp.transcoder.JobTemplate("default", {
 *     jobTemplateId: "example-job-template",
 *     location: "us-central1",
 *     config: {
 *         inputs: [{
 *             key: "input0",
 *             uri: pulumi.interpolate`gs://${_default.name}/${exampleMp4.name}`,
 *         }],
 *         output: {
 *             uri: pulumi.interpolate`gs://${_default.name}/outputs/`,
 *         },
 *         editLists: [{
 *             key: "atom0",
 *             inputs: ["input0"],
 *             startTimeOffset: "0s",
 *         }],
 *         elementaryStreams: [
 *             {
 *                 key: "video-stream0",
 *                 videoStream: {
 *                     h264: {
 *                         widthPixels: 640,
 *                         heightPixels: 360,
 *                         bitrateBps: 550000,
 *                         frameRate: 60,
 *                         pixelFormat: "yuv420p",
 *                         rateControlMode: "vbr",
 *                         crfLevel: 21,
 *                         gopDuration: "3s",
 *                         vbvSizeBits: 550000,
 *                         vbvFullnessBits: 495000,
 *                         entropyCoder: "cabac",
 *                         profile: "high",
 *                         preset: "veryfast",
 *                     },
 *                 },
 *             },
 *             {
 *                 key: "video-stream1",
 *                 videoStream: {
 *                     h264: {
 *                         widthPixels: 1280,
 *                         heightPixels: 720,
 *                         bitrateBps: 550000,
 *                         frameRate: 60,
 *                         pixelFormat: "yuv420p",
 *                         rateControlMode: "vbr",
 *                         crfLevel: 21,
 *                         gopDuration: "3s",
 *                         vbvSizeBits: 2500000,
 *                         vbvFullnessBits: 2250000,
 *                         entropyCoder: "cabac",
 *                         profile: "high",
 *                         preset: "veryfast",
 *                     },
 *                 },
 *             },
 *             {
 *                 key: "audio-stream0",
 *                 audioStream: {
 *                     codec: "aac",
 *                     bitrateBps: 64000,
 *                     channelCount: 2,
 *                     channelLayouts: [
 *                         "fl",
 *                         "fr",
 *                     ],
 *                     sampleRateHertz: 48000,
 *                 },
 *             },
 *         ],
 *         muxStreams: [
 *             {
 *                 key: "sd",
 *                 fileName: "sd.mp4",
 *                 container: "mp4",
 *                 elementaryStreams: [
 *                     "video-stream0",
 *                     "audio-stream0",
 *                 ],
 *             },
 *             {
 *                 key: "hd",
 *                 fileName: "hd.mp4",
 *                 container: "mp4",
 *                 elementaryStreams: [
 *                     "video-stream1",
 *                     "audio-stream0",
 *                 ],
 *             },
 *         ],
 *     },
 *     labels: {
 *         label: "key",
 *     },
 * });
 * const defaultJob = new gcp.transcoder.Job("default", {
 *     templateId: defaultJobTemplate.name,
 *     location: "us-central1",
 *     labels: {
 *         label: "key",
 *     },
 * });
 * ```
 * ### Transcoder Job Pubsub
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.storage.Bucket("default", {
 *     name: "transcoder-job",
 *     location: "US",
 *     forceDestroy: true,
 *     uniformBucketLevelAccess: true,
 *     publicAccessPrevention: "enforced",
 * });
 * const exampleMp4 = new gcp.storage.BucketObject("example_mp4", {
 *     name: "example.mp4",
 *     source: new pulumi.asset.FileAsset("./test-fixtures/example.mp4"),
 *     bucket: _default.name,
 * });
 * const transcoderNotifications = new gcp.pubsub.Topic("transcoder_notifications", {name: "transcoder-notifications"});
 * const defaultJob = new gcp.transcoder.Job("default", {
 *     location: "us-central1",
 *     config: {
 *         inputs: [{
 *             key: "input0",
 *             uri: pulumi.interpolate`gs://${_default.name}/${exampleMp4.name}`,
 *         }],
 *         editLists: [{
 *             key: "atom0",
 *             inputs: ["input0"],
 *             startTimeOffset: "0s",
 *         }],
 *         adBreaks: [{
 *             startTimeOffset: "3.500s",
 *         }],
 *         elementaryStreams: [
 *             {
 *                 key: "video-stream0",
 *                 videoStream: {
 *                     h264: {
 *                         widthPixels: 640,
 *                         heightPixels: 360,
 *                         bitrateBps: 550000,
 *                         frameRate: 60,
 *                         pixelFormat: "yuv420p",
 *                         rateControlMode: "vbr",
 *                         crfLevel: 21,
 *                         gopDuration: "3s",
 *                         vbvSizeBits: 550000,
 *                         vbvFullnessBits: 495000,
 *                         entropyCoder: "cabac",
 *                         profile: "high",
 *                         preset: "veryfast",
 *                     },
 *                 },
 *             },
 *             {
 *                 key: "video-stream1",
 *                 videoStream: {
 *                     h264: {
 *                         widthPixels: 1280,
 *                         heightPixels: 720,
 *                         bitrateBps: 550000,
 *                         frameRate: 60,
 *                         pixelFormat: "yuv420p",
 *                         rateControlMode: "vbr",
 *                         crfLevel: 21,
 *                         gopDuration: "3s",
 *                         vbvSizeBits: 2500000,
 *                         vbvFullnessBits: 2250000,
 *                         entropyCoder: "cabac",
 *                         profile: "high",
 *                         preset: "veryfast",
 *                     },
 *                 },
 *             },
 *             {
 *                 key: "audio-stream0",
 *                 audioStream: {
 *                     codec: "aac",
 *                     bitrateBps: 64000,
 *                     channelCount: 2,
 *                     channelLayouts: [
 *                         "fl",
 *                         "fr",
 *                     ],
 *                     sampleRateHertz: 48000,
 *                 },
 *             },
 *         ],
 *         muxStreams: [
 *             {
 *                 key: "sd",
 *                 fileName: "sd.mp4",
 *                 container: "mp4",
 *                 elementaryStreams: [
 *                     "video-stream0",
 *                     "audio-stream0",
 *                 ],
 *             },
 *             {
 *                 key: "hd",
 *                 fileName: "hd.mp4",
 *                 container: "mp4",
 *                 elementaryStreams: [
 *                     "video-stream1",
 *                     "audio-stream0",
 *                 ],
 *             },
 *         ],
 *         pubsubDestination: {
 *             topic: transcoderNotifications.id,
 *         },
 *         output: {
 *             uri: pulumi.interpolate`gs://${_default.name}/outputs/`,
 *         },
 *     },
 *     labels: {
 *         label: "key",
 *     },
 * });
 * ```
 * ### Transcoder Job Encryptions
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.storage.Bucket("default", {
 *     name: "transcoder-job",
 *     location: "US",
 *     forceDestroy: true,
 *     uniformBucketLevelAccess: true,
 *     publicAccessPrevention: "enforced",
 * });
 * const exampleMp4 = new gcp.storage.BucketObject("example_mp4", {
 *     name: "example.mp4",
 *     source: new pulumi.asset.FileAsset("./test-fixtures/example.mp4"),
 *     bucket: _default.name,
 * });
 * const encryptionKey = new gcp.secretmanager.Secret("encryption_key", {
 *     secretId: "transcoder-encryption-key",
 *     replication: {
 *         auto: {},
 *     },
 * });
 * const encryptionKeySecretVersion = new gcp.secretmanager.SecretVersion("encryption_key", {
 *     secret: encryptionKey.name,
 *     secretData: "4A67F2C1B8E93A4F6D3E7890A1BC23DF",
 * });
 * const project = gcp.organizations.getProject({});
 * // this is required to allow the transcoder service identity to access the secret
 * const transcoder = new gcp.projects.ServiceIdentity("transcoder", {
 *     project: project.then(project => project.projectId),
 *     service: "transcoder.googleapis.com",
 * });
 * const transcoderEncryptionKeyAccessor = new gcp.secretmanager.SecretIamMember("transcoder_encryption_key_accessor", {
 *     secretId: encryptionKey.secretId,
 *     project: encryptionKey.project,
 *     role: "roles/secretmanager.secretAccessor",
 *     member: pulumi.interpolate`serviceAccount:${transcoder.email}`,
 * });
 * const defaultJob = new gcp.transcoder.Job("default", {
 *     location: "us-central1",
 *     config: {
 *         inputs: [{
 *             key: "input0",
 *             uri: pulumi.interpolate`gs://${_default.name}/${exampleMp4.name}`,
 *         }],
 *         elementaryStreams: [
 *             {
 *                 key: "es_video",
 *                 videoStream: {
 *                     h264: {
 *                         profile: "main",
 *                         heightPixels: 600,
 *                         widthPixels: 800,
 *                         bitrateBps: 1000000,
 *                         frameRate: 60,
 *                     },
 *                 },
 *             },
 *             {
 *                 key: "es_audio",
 *                 audioStream: {
 *                     codec: "aac",
 *                     channelCount: 2,
 *                     bitrateBps: 160000,
 *                 },
 *             },
 *         ],
 *         encryptions: [
 *             {
 *                 id: "aes-128",
 *                 secretManagerKeySource: {
 *                     secretVersion: encryptionKeySecretVersion.name,
 *                 },
 *                 drmSystems: {
 *                     clearkey: {},
 *                 },
 *                 aes128: {},
 *             },
 *             {
 *                 id: "cenc",
 *                 secretManagerKeySource: {
 *                     secretVersion: encryptionKeySecretVersion.name,
 *                 },
 *                 drmSystems: {
 *                     widevine: {},
 *                 },
 *                 mpegCenc: {
 *                     scheme: "cenc",
 *                 },
 *             },
 *             {
 *                 id: "cbcs",
 *                 secretManagerKeySource: {
 *                     secretVersion: encryptionKeySecretVersion.name,
 *                 },
 *                 drmSystems: {
 *                     widevine: {},
 *                 },
 *                 mpegCenc: {
 *                     scheme: "cbcs",
 *                 },
 *             },
 *         ],
 *         muxStreams: [
 *             {
 *                 key: "ts_aes128",
 *                 container: "ts",
 *                 elementaryStreams: [
 *                     "es_video",
 *                     "es_audio",
 *                 ],
 *                 segmentSettings: {
 *                     segmentDuration: "6s",
 *                 },
 *                 encryptionId: "aes-128",
 *             },
 *             {
 *                 key: "fmp4_cenc_video",
 *                 container: "fmp4",
 *                 elementaryStreams: ["es_video"],
 *                 segmentSettings: {
 *                     segmentDuration: "6s",
 *                 },
 *                 encryptionId: "cenc",
 *             },
 *             {
 *                 key: "fmp4_cenc_audio",
 *                 container: "fmp4",
 *                 elementaryStreams: ["es_audio"],
 *                 segmentSettings: {
 *                     segmentDuration: "6s",
 *                 },
 *                 encryptionId: "cenc",
 *             },
 *             {
 *                 key: "fmp4_cbcs_video",
 *                 container: "fmp4",
 *                 elementaryStreams: ["es_video"],
 *                 segmentSettings: {
 *                     segmentDuration: "6s",
 *                 },
 *                 encryptionId: "cbcs",
 *             },
 *             {
 *                 key: "fmp4_cbcs_audio",
 *                 container: "fmp4",
 *                 elementaryStreams: ["es_audio"],
 *                 segmentSettings: {
 *                     segmentDuration: "6s",
 *                 },
 *                 encryptionId: "cbcs",
 *             },
 *         ],
 *         manifests: [
 *             {
 *                 fileName: "manifest_aes128.m3u8",
 *                 type: "HLS",
 *                 muxStreams: ["ts_aes128"],
 *             },
 *             {
 *                 fileName: "manifest_cenc.mpd",
 *                 type: "DASH",
 *                 muxStreams: [
 *                     "fmp4_cenc_video",
 *                     "fmp4_cenc_audio",
 *                 ],
 *             },
 *             {
 *                 fileName: "manifest_cbcs.mpd",
 *                 type: "DASH",
 *                 muxStreams: [
 *                     "fmp4_cbcs_video",
 *                     "fmp4_cbcs_audio",
 *                 ],
 *             },
 *         ],
 *         output: {
 *             uri: pulumi.interpolate`gs://${_default.name}/outputs/`,
 *         },
 *     },
 *     labels: {
 *         label: "key",
 *     },
 * });
 * ```
 * ### Transcoder Job Overlays
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.storage.Bucket("default", {
 *     name: "transcoder-job",
 *     location: "US",
 *     forceDestroy: true,
 *     uniformBucketLevelAccess: true,
 *     publicAccessPrevention: "enforced",
 * });
 * const exampleMp4 = new gcp.storage.BucketObject("example_mp4", {
 *     name: "example.mp4",
 *     source: new pulumi.asset.FileAsset("./test-fixtures/example.mp4"),
 *     bucket: _default.name,
 * });
 * const overlayPng = new gcp.storage.BucketObject("overlay_png", {
 *     name: "overlay.png",
 *     source: new pulumi.asset.FileAsset("./test-fixtures/overlay.png"),
 *     bucket: _default.name,
 * });
 * const defaultJob = new gcp.transcoder.Job("default", {
 *     location: "us-central1",
 *     config: {
 *         inputs: [{
 *             key: "input0",
 *             uri: pulumi.interpolate`gs://${_default.name}/${exampleMp4.name}`,
 *         }],
 *         editLists: [{
 *             key: "atom0",
 *             inputs: ["input0"],
 *             startTimeOffset: "0s",
 *         }],
 *         adBreaks: [{
 *             startTimeOffset: "3.500s",
 *         }],
 *         overlays: [{
 *             animations: [{
 *                 animationFade: {
 *                     fadeType: "FADE_IN",
 *                     startTimeOffset: "1.500s",
 *                     endTimeOffset: "3.500s",
 *                     xy: {
 *                         x: 1,
 *                         y: 0.5,
 *                     },
 *                 },
 *             }],
 *             image: {
 *                 uri: pulumi.interpolate`gs://${_default.name}/${overlayPng.name}`,
 *             },
 *         }],
 *         elementaryStreams: [
 *             {
 *                 key: "video-stream0",
 *                 videoStream: {
 *                     h264: {
 *                         widthPixels: 640,
 *                         heightPixels: 360,
 *                         bitrateBps: 550000,
 *                         frameRate: 60,
 *                         pixelFormat: "yuv420p",
 *                         rateControlMode: "vbr",
 *                         crfLevel: 21,
 *                         gopDuration: "3s",
 *                         vbvSizeBits: 550000,
 *                         vbvFullnessBits: 495000,
 *                         entropyCoder: "cabac",
 *                         profile: "high",
 *                         preset: "veryfast",
 *                     },
 *                 },
 *             },
 *             {
 *                 key: "video-stream1",
 *                 videoStream: {
 *                     h264: {
 *                         widthPixels: 1280,
 *                         heightPixels: 720,
 *                         bitrateBps: 550000,
 *                         frameRate: 60,
 *                         pixelFormat: "yuv420p",
 *                         rateControlMode: "vbr",
 *                         crfLevel: 21,
 *                         gopDuration: "3s",
 *                         vbvSizeBits: 2500000,
 *                         vbvFullnessBits: 2250000,
 *                         entropyCoder: "cabac",
 *                         profile: "high",
 *                         preset: "veryfast",
 *                     },
 *                 },
 *             },
 *             {
 *                 key: "audio-stream0",
 *                 audioStream: {
 *                     codec: "aac",
 *                     bitrateBps: 64000,
 *                     channelCount: 2,
 *                     channelLayouts: [
 *                         "fl",
 *                         "fr",
 *                     ],
 *                     sampleRateHertz: 48000,
 *                 },
 *             },
 *         ],
 *         muxStreams: [
 *             {
 *                 key: "sd",
 *                 fileName: "sd.mp4",
 *                 container: "mp4",
 *                 elementaryStreams: [
 *                     "video-stream0",
 *                     "audio-stream0",
 *                 ],
 *             },
 *             {
 *                 key: "hd",
 *                 fileName: "hd.mp4",
 *                 container: "mp4",
 *                 elementaryStreams: [
 *                     "video-stream1",
 *                     "audio-stream0",
 *                 ],
 *             },
 *         ],
 *         output: {
 *             uri: pulumi.interpolate`gs://${_default.name}/outputs/`,
 *         },
 *     },
 *     labels: {
 *         label: "key",
 *     },
 * });
 * ```
 * ### Transcoder Job Manifests
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.storage.Bucket("default", {
 *     name: "transcoder-job",
 *     location: "US",
 *     forceDestroy: true,
 *     uniformBucketLevelAccess: true,
 *     publicAccessPrevention: "enforced",
 * });
 * const exampleMp4 = new gcp.storage.BucketObject("example_mp4", {
 *     name: "example.mp4",
 *     source: new pulumi.asset.FileAsset("./test-fixtures/example.mp4"),
 *     bucket: _default.name,
 * });
 * const defaultJob = new gcp.transcoder.Job("default", {
 *     location: "us-central1",
 *     config: {
 *         inputs: [{
 *             key: "input0",
 *             uri: pulumi.interpolate`gs://${_default.name}/${exampleMp4.name}`,
 *         }],
 *         editLists: [{
 *             key: "atom0",
 *             startTimeOffset: "0s",
 *             inputs: ["input0"],
 *         }],
 *         adBreaks: [{
 *             startTimeOffset: "3.500s",
 *         }],
 *         elementaryStreams: [
 *             {
 *                 key: "video-stream0",
 *                 videoStream: {
 *                     h264: {
 *                         widthPixels: 640,
 *                         heightPixels: 360,
 *                         bitrateBps: 550000,
 *                         frameRate: 60,
 *                         pixelFormat: "yuv420p",
 *                         rateControlMode: "vbr",
 *                         crfLevel: 21,
 *                         gopDuration: "3s",
 *                         vbvSizeBits: 550000,
 *                         vbvFullnessBits: 495000,
 *                         entropyCoder: "cabac",
 *                         profile: "high",
 *                         preset: "veryfast",
 *                     },
 *                 },
 *             },
 *             {
 *                 key: "video-stream1",
 *                 videoStream: {
 *                     h264: {
 *                         widthPixels: 1280,
 *                         heightPixels: 720,
 *                         bitrateBps: 550000,
 *                         frameRate: 60,
 *                         pixelFormat: "yuv420p",
 *                         rateControlMode: "vbr",
 *                         crfLevel: 21,
 *                         gopDuration: "3s",
 *                         vbvSizeBits: 2500000,
 *                         vbvFullnessBits: 2250000,
 *                         entropyCoder: "cabac",
 *                         profile: "high",
 *                         preset: "veryfast",
 *                     },
 *                 },
 *             },
 *             {
 *                 key: "audio-stream0",
 *                 audioStream: {
 *                     codec: "aac",
 *                     bitrateBps: 64000,
 *                     channelCount: 2,
 *                     channelLayouts: [
 *                         "fl",
 *                         "fr",
 *                     ],
 *                     sampleRateHertz: 48000,
 *                 },
 *             },
 *         ],
 *         muxStreams: [
 *             {
 *                 key: "sd",
 *                 fileName: "sd.mp4",
 *                 container: "mp4",
 *                 elementaryStreams: [
 *                     "video-stream0",
 *                     "audio-stream0",
 *                 ],
 *             },
 *             {
 *                 key: "hd",
 *                 fileName: "hd.mp4",
 *                 container: "mp4",
 *                 elementaryStreams: [
 *                     "video-stream1",
 *                     "audio-stream0",
 *                 ],
 *             },
 *             {
 *                 key: "media-sd",
 *                 fileName: "media-sd.ts",
 *                 container: "ts",
 *                 elementaryStreams: [
 *                     "video-stream0",
 *                     "audio-stream0",
 *                 ],
 *             },
 *             {
 *                 key: "media-hd",
 *                 fileName: "media-hd.ts",
 *                 container: "ts",
 *                 elementaryStreams: [
 *                     "video-stream1",
 *                     "audio-stream0",
 *                 ],
 *             },
 *             {
 *                 key: "video-only-sd",
 *                 fileName: "video-only-sd.m4s",
 *                 container: "fmp4",
 *                 elementaryStreams: ["video-stream0"],
 *             },
 *             {
 *                 key: "video-only-hd",
 *                 fileName: "video-only-hd.m4s",
 *                 container: "fmp4",
 *                 elementaryStreams: ["video-stream1"],
 *             },
 *             {
 *                 key: "audio-only",
 *                 fileName: "audio-only.m4s",
 *                 container: "fmp4",
 *                 elementaryStreams: ["audio-stream0"],
 *             },
 *         ],
 *         manifests: [
 *             {
 *                 fileName: "manifest.m3u8",
 *                 type: "HLS",
 *                 muxStreams: [
 *                     "media-sd",
 *                     "media-hd",
 *                 ],
 *             },
 *             {
 *                 fileName: "manifest.mpd",
 *                 type: "DASH",
 *                 muxStreams: [
 *                     "video-only-sd",
 *                     "video-only-hd",
 *                     "audio-only",
 *                 ],
 *             },
 *         ],
 *         output: {
 *             uri: pulumi.interpolate`gs://${_default.name}/outputs/`,
 *         },
 *     },
 *     labels: {
 *         label: "key",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Job can be imported using any of these accepted formats:
 *
 * * `{{project}}/{{name}}`
 *
 * * `{{project}} {{name}}`
 *
 * * `{{name}}`
 *
 * When using the `pulumi import` command, Job can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:transcoder/job:Job default {{project}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:transcoder/job:Job default "{{project}} {{name}}"
 * ```
 *
 * ```sh
 * $ pulumi import gcp:transcoder/job:Job default {{name}}
 * ```
 */
export class Job extends pulumi.CustomResource {
    /**
     * Get an existing Job resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: JobState, opts?: pulumi.CustomResourceOptions): Job {
        return new Job(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:transcoder/job:Job';

    /**
     * Returns true if the given object is an instance of Job.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Job {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Job.__pulumiType;
    }

    /**
     * The configuration for this template.
     * Structure is documented below.
     */
    public readonly config!: pulumi.Output<outputs.transcoder.JobConfig>;
    /**
     * The time the job was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The time the transcoding finished.
     */
    public /*out*/ readonly endTime!: pulumi.Output<string>;
    /**
     * The labels associated with this job. You can use these to organize and group your jobs.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The location of the transcoding job resource.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The resource name of the job.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    public /*out*/ readonly pulumiLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The time the transcoding started.
     */
    public /*out*/ readonly startTime!: pulumi.Output<string>;
    /**
     * The current state of the job.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Specify the templateId to use for populating Job.config.
     * The default is preset/web-hd, which is the only supported preset.
     */
    public readonly templateId!: pulumi.Output<string>;

    /**
     * Create a Job resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: JobArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: JobArgs | JobState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as JobState | undefined;
            resourceInputs["config"] = state ? state.config : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["endTime"] = state ? state.endTime : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["startTime"] = state ? state.startTime : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["templateId"] = state ? state.templateId : undefined;
        } else {
            const args = argsOrState as JobArgs | undefined;
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            resourceInputs["config"] = args ? args.config : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["templateId"] = args ? args.templateId : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["endTime"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["startTime"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Job.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Job resources.
 */
export interface JobState {
    /**
     * The configuration for this template.
     * Structure is documented below.
     */
    config?: pulumi.Input<inputs.transcoder.JobConfig>;
    /**
     * The time the job was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The time the transcoding finished.
     */
    endTime?: pulumi.Input<string>;
    /**
     * The labels associated with this job. You can use these to organize and group your jobs.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location of the transcoding job resource.
     */
    location?: pulumi.Input<string>;
    /**
     * The resource name of the job.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    pulumiLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The time the transcoding started.
     */
    startTime?: pulumi.Input<string>;
    /**
     * The current state of the job.
     */
    state?: pulumi.Input<string>;
    /**
     * Specify the templateId to use for populating Job.config.
     * The default is preset/web-hd, which is the only supported preset.
     */
    templateId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Job resource.
 */
export interface JobArgs {
    /**
     * The configuration for this template.
     * Structure is documented below.
     */
    config?: pulumi.Input<inputs.transcoder.JobConfig>;
    /**
     * The labels associated with this job. You can use these to organize and group your jobs.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location of the transcoding job resource.
     */
    location: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * Specify the templateId to use for populating Job.config.
     * The default is preset/web-hd, which is the only supported preset.
     */
    templateId?: pulumi.Input<string>;
}
