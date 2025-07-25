// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A connection for GitHub, GitHub Enterprise, GitLab, and GitLab Enterprise.
 *
 * To get more information about Connection, see:
 *
 * * [API documentation](https://cloud.google.com/developer-connect/docs/api/reference/rest/v1/projects.locations.connections)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/developer-connect/docs/overview)
 *
 * ## Example Usage
 *
 * ### Developer Connect Connection New
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * // Setup permissions. Only needed once per project
 * const devconnect_p4sa = new gcp.projects.ServiceIdentity("devconnect-p4sa", {service: "developerconnect.googleapis.com"});
 * const devconnect_secret = new gcp.projects.IAMMember("devconnect-secret", {
 *     project: "my-project-name",
 *     role: "roles/secretmanager.admin",
 *     member: devconnect_p4sa.member,
 * });
 * const my_connection = new gcp.developerconnect.Connection("my-connection", {
 *     location: "us-central1",
 *     connectionId: "tf-test-connection-new",
 *     githubConfig: {
 *         githubApp: "FIREBASE",
 *     },
 * }, {
 *     dependsOn: [devconnect_secret],
 * });
 * export const nextSteps = my_connection.installationStates;
 * ```
 * ### Developer Connect Connection Existing Credentials
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_connection = new gcp.developerconnect.Connection("my-connection", {
 *     location: "us-central1",
 *     connectionId: "tf-test-connection-cred",
 *     githubConfig: {
 *         githubApp: "DEVELOPER_CONNECT",
 *         authorizerCredential: {
 *             oauthTokenSecretVersion: "projects/your-project/secrets/your-secret-id/versions/latest",
 *         },
 *     },
 * });
 * export const nextSteps = my_connection.installationStates;
 * ```
 * ### Developer Connect Connection Existing Installation
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 * import * as std from "@pulumi/std";
 *
 * const github_token_secret = new gcp.secretmanager.Secret("github-token-secret", {
 *     secretId: "github-token-secret",
 *     replication: {
 *         auto: {},
 *     },
 * });
 * const github_token_secret_version = new gcp.secretmanager.SecretVersion("github-token-secret-version", {
 *     secret: github_token_secret.id,
 *     secretData: std.file({
 *         input: "my-github-token.txt",
 *     }).then(invoke => invoke.result),
 * });
 * const devconnect_p4sa = new gcp.projects.ServiceIdentity("devconnect-p4sa", {service: "developerconnect.googleapis.com"});
 * const p4sa_secretAccessor = gcp.organizations.getIAMPolicyOutput({
 *     bindings: [{
 *         role: "roles/secretmanager.secretAccessor",
 *         members: [devconnect_p4sa.member],
 *     }],
 * });
 * const policy = new gcp.secretmanager.SecretIamPolicy("policy", {
 *     secretId: github_token_secret.secretId,
 *     policyData: p4sa_secretAccessor.apply(p4sa_secretAccessor => p4sa_secretAccessor.policyData),
 * });
 * const my_connection = new gcp.developerconnect.Connection("my-connection", {
 *     location: "us-central1",
 *     connectionId: "my-connection",
 *     githubConfig: {
 *         githubApp: "DEVELOPER_CONNECT",
 *         appInstallationId: "123123",
 *         authorizerCredential: {
 *             oauthTokenSecretVersion: github_token_secret_version.id,
 *         },
 *     },
 * });
 * ```
 * ### Developer Connect Connection Github
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_connection = new gcp.developerconnect.Connection("my-connection", {
 *     location: "us-central1",
 *     connectionId: "tf-test-connection",
 *     githubConfig: {
 *         githubApp: "DEVELOPER_CONNECT",
 *         authorizerCredential: {
 *             oauthTokenSecretVersion: "projects/devconnect-terraform-creds/secrets/tf-test-do-not-change-github-oauthtoken-e0b9e7/versions/1",
 *         },
 *     },
 * });
 * ```
 * ### Developer Connect Connection Github Doc
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 * import * as std from "@pulumi/std";
 *
 * const github_token_secret = new gcp.secretmanager.Secret("github-token-secret", {
 *     secretId: "github-token-secret",
 *     replication: {
 *         auto: {},
 *     },
 * });
 * const github_token_secret_version = new gcp.secretmanager.SecretVersion("github-token-secret-version", {
 *     secret: github_token_secret.id,
 *     secretData: std.file({
 *         input: "my-github-token.txt",
 *     }).then(invoke => invoke.result),
 * });
 * const p4sa_secretAccessor = gcp.organizations.getIAMPolicy({
 *     bindings: [{
 *         role: "roles/secretmanager.secretAccessor",
 *         members: ["serviceAccount:service-123456789@gcp-sa-devconnect.iam.gserviceaccount.com"],
 *     }],
 * });
 * const policy = new gcp.secretmanager.SecretIamPolicy("policy", {
 *     secretId: github_token_secret.secretId,
 *     policyData: p4sa_secretAccessor.then(p4sa_secretAccessor => p4sa_secretAccessor.policyData),
 * });
 * const my_connection = new gcp.developerconnect.Connection("my-connection", {
 *     location: "us-central1",
 *     connectionId: "my-connection",
 *     githubConfig: {
 *         githubApp: "DEVELOPER_CONNECT",
 *         appInstallationId: "123123",
 *         authorizerCredential: {
 *             oauthTokenSecretVersion: github_token_secret_version.id,
 *         },
 *     },
 * });
 * ```
 * ### Developer Connect Connection Github Enterprise
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_connection = new gcp.developerconnect.Connection("my-connection", {
 *     location: "us-central1",
 *     connectionId: "tf-test-connection",
 *     githubEnterpriseConfig: {
 *         hostUri: "https://ghe.proctor-staging-test.com",
 *         appId: "864434",
 *         privateKeySecretVersion: "projects/devconnect-terraform-creds/secrets/tf-test-ghe-do-not-change-ghe-private-key-f522d2/versions/latest",
 *         webhookSecretSecretVersion: "projects/devconnect-terraform-creds/secrets/tf-test-ghe-do-not-change-ghe-webhook-secret-3c806f/versions/latest",
 *         appInstallationId: "837537",
 *     },
 * });
 * ```
 * ### Developer Connect Connection Github Enterprise Doc
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 * import * as std from "@pulumi/std";
 *
 * const private_key_secret = new gcp.secretmanager.Secret("private-key-secret", {
 *     secretId: "ghe-pk-secret",
 *     replication: {
 *         auto: {},
 *     },
 * });
 * const private_key_secret_version = new gcp.secretmanager.SecretVersion("private-key-secret-version", {
 *     secret: private_key_secret.id,
 *     secretData: std.file({
 *         input: "private-key.pem",
 *     }).then(invoke => invoke.result),
 * });
 * const webhook_secret_secret = new gcp.secretmanager.Secret("webhook-secret-secret", {
 *     secretId: "ghe-token-secret",
 *     replication: {
 *         auto: {},
 *     },
 * });
 * const webhook_secret_secret_version = new gcp.secretmanager.SecretVersion("webhook-secret-secret-version", {
 *     secret: webhook_secret_secret.id,
 *     secretData: "<webhook-secret-data>",
 * });
 * const p4sa_secretAccessor = gcp.organizations.getIAMPolicy({
 *     bindings: [{
 *         role: "roles/secretmanager.secretAccessor",
 *         members: ["serviceAccount:service-123456789@gcp-sa-devconnect.iam.gserviceaccount.com"],
 *     }],
 * });
 * const policy_pk = new gcp.secretmanager.SecretIamPolicy("policy-pk", {
 *     secretId: private_key_secret.secretId,
 *     policyData: p4sa_secretAccessor.then(p4sa_secretAccessor => p4sa_secretAccessor.policyData),
 * });
 * const policy_whs = new gcp.secretmanager.SecretIamPolicy("policy-whs", {
 *     secretId: webhook_secret_secret.secretId,
 *     policyData: p4sa_secretAccessor.then(p4sa_secretAccessor => p4sa_secretAccessor.policyData),
 * });
 * const my_connection = new gcp.developerconnect.Connection("my-connection", {
 *     location: "us-central1",
 *     connectionId: "my-connection",
 *     githubEnterpriseConfig: {
 *         hostUri: "https://ghe.com",
 *         privateKeySecretVersion: private_key_secret_version.id,
 *         webhookSecretSecretVersion: webhook_secret_secret_version.id,
 *         appId: "100",
 *         appInstallationId: "123123",
 *     },
 * }, {
 *     dependsOn: [
 *         policy_pk,
 *         policy_whs,
 *     ],
 * });
 * ```
 * ### Developer Connect Connection Gitlab
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_connection = new gcp.developerconnect.Connection("my-connection", {
 *     location: "us-central1",
 *     connectionId: "tf-test-connection",
 *     gitlabConfig: {
 *         webhookSecretSecretVersion: "projects/devconnect-terraform-creds/secrets/gitlab-webhook/versions/latest",
 *         readAuthorizerCredential: {
 *             userTokenSecretVersion: "projects/devconnect-terraform-creds/secrets/gitlab-read-cred/versions/latest",
 *         },
 *         authorizerCredential: {
 *             userTokenSecretVersion: "projects/devconnect-terraform-creds/secrets/gitlab-auth-cred/versions/latest",
 *         },
 *     },
 * });
 * ```
 * ### Developer Connect Connection Gitlab Enterprise
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_connection = new gcp.developerconnect.Connection("my-connection", {
 *     location: "us-central1",
 *     connectionId: "tf-test-connection",
 *     gitlabEnterpriseConfig: {
 *         hostUri: "https://gle-us-central1.gcb-test.com",
 *         webhookSecretSecretVersion: "projects/devconnect-terraform-creds/secrets/gitlab-enterprise-webhook/versions/latest",
 *         readAuthorizerCredential: {
 *             userTokenSecretVersion: "projects/devconnect-terraform-creds/secrets/gitlab-enterprise-read-cred/versions/latest",
 *         },
 *         authorizerCredential: {
 *             userTokenSecretVersion: "projects/devconnect-terraform-creds/secrets/gitlab-enterprise-auth-cred/versions/latest",
 *         },
 *     },
 * });
 * ```
 * ### Developer Connect Connection Bbc
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_connection = new gcp.developerconnect.Connection("my-connection", {
 *     location: "us-central1",
 *     connectionId: "tf-test-connection",
 *     bitbucketCloudConfig: {
 *         workspace: "proctor-test",
 *         webhookSecretSecretVersion: "projects/devconnect-terraform-creds/secrets/bbc-webhook/versions/latest",
 *         readAuthorizerCredential: {
 *             userTokenSecretVersion: "projects/devconnect-terraform-creds/secrets/bbc-read-token/versions/latest",
 *         },
 *         authorizerCredential: {
 *             userTokenSecretVersion: "projects/devconnect-terraform-creds/secrets/bbc-auth-token/versions/latest",
 *         },
 *     },
 * });
 * ```
 * ### Developer Connect Connection Bbdc
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_connection = new gcp.developerconnect.Connection("my-connection", {
 *     location: "us-central1",
 *     connectionId: "tf-test-connection",
 *     bitbucketDataCenterConfig: {
 *         hostUri: "https://bitbucket-us-central.gcb-test.com",
 *         webhookSecretSecretVersion: "projects/devconnect-terraform-creds/secrets/bbdc-webhook/versions/latest",
 *         readAuthorizerCredential: {
 *             userTokenSecretVersion: "projects/devconnect-terraform-creds/secrets/bbdc-read-token/versions/latest",
 *         },
 *         authorizerCredential: {
 *             userTokenSecretVersion: "projects/devconnect-terraform-creds/secrets/bbdc-auth-token/versions/latest",
 *         },
 *     },
 * });
 * ```
 * ## Import
 *
 * Connection can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/{{location}}/connections/{{connection_id}}`
 *
 * * `{{project}}/{{location}}/{{connection_id}}`
 *
 * * `{{location}}/{{connection_id}}`
 *
 * When using the `pulumi import` command, Connection can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:developerconnect/connection:Connection default projects/{{project}}/locations/{{location}}/connections/{{connection_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:developerconnect/connection:Connection default {{project}}/{{location}}/{{connection_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:developerconnect/connection:Connection default {{location}}/{{connection_id}}
 * ```
 */
export class Connection extends pulumi.CustomResource {
    /**
     * Get an existing Connection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionState, opts?: pulumi.CustomResourceOptions): Connection {
        return new Connection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:developerconnect/connection:Connection';

    /**
     * Returns true if the given object is an instance of Connection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Connection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Connection.__pulumiType;
    }

    /**
     * Optional. Allows clients to store small amounts of arbitrary data.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effectiveAnnotations` for all of the annotations present on the resource.
     */
    public readonly annotations!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Configuration for connections to an instance of Bitbucket Cloud.
     * Structure is documented below.
     */
    public readonly bitbucketCloudConfig!: pulumi.Output<outputs.developerconnect.ConnectionBitbucketCloudConfig | undefined>;
    /**
     * Configuration for connections to an instance of Bitbucket Data Center.
     * Structure is documented below.
     */
    public readonly bitbucketDataCenterConfig!: pulumi.Output<outputs.developerconnect.ConnectionBitbucketDataCenterConfig | undefined>;
    /**
     * Required. Id of the requesting object
     * If auto-generating Id server-side, remove this field and
     * connectionId from the methodSignature of Create RPC
     */
    public readonly connectionId!: pulumi.Output<string>;
    /**
     * Output only. [Output only] Create timestamp
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The crypto key configuration. This field is used by the Customer-managed
     * encryption keys (CMEK) feature.
     * Structure is documented below.
     */
    public readonly cryptoKeyConfig!: pulumi.Output<outputs.developerconnect.ConnectionCryptoKeyConfig | undefined>;
    /**
     * Output only. [Output only] Delete timestamp
     */
    public /*out*/ readonly deleteTime!: pulumi.Output<string>;
    /**
     * Optional. If disabled is set to true, functionality is disabled for this connection.
     * Repository based API methods and webhooks processing for repositories in
     * this connection will be disabled.
     */
    public readonly disabled!: pulumi.Output<boolean | undefined>;
    public /*out*/ readonly effectiveAnnotations!: pulumi.Output<{[key: string]: string}>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Optional. This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     */
    public readonly etag!: pulumi.Output<string | undefined>;
    /**
     * Configuration for connections to github.com.
     * Structure is documented below.
     */
    public readonly githubConfig!: pulumi.Output<outputs.developerconnect.ConnectionGithubConfig | undefined>;
    /**
     * Configuration for connections to an instance of GitHub Enterprise.
     * Structure is documented below.
     */
    public readonly githubEnterpriseConfig!: pulumi.Output<outputs.developerconnect.ConnectionGithubEnterpriseConfig | undefined>;
    /**
     * Configuration for connections to gitlab.com.
     * Structure is documented below.
     */
    public readonly gitlabConfig!: pulumi.Output<outputs.developerconnect.ConnectionGitlabConfig | undefined>;
    /**
     * Configuration for connections to an instance of GitLab Enterprise.
     * Structure is documented below.
     */
    public readonly gitlabEnterpriseConfig!: pulumi.Output<outputs.developerconnect.ConnectionGitlabEnterpriseConfig | undefined>;
    /**
     * Describes stage and necessary actions to be taken by the
     * user to complete the installation. Used for GitHub and GitHub Enterprise
     * based connections.
     * Structure is documented below.
     */
    public /*out*/ readonly installationStates!: pulumi.Output<outputs.developerconnect.ConnectionInstallationState[]>;
    /**
     * Optional. Labels as key value pairs
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Identifier. The resource name of the connection, in the format
     * `projects/{project}/locations/{location}/connections/{connection_id}`.
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
     * Output only. Set to true when the connection is being set up or updated in the
     * background.
     */
    public /*out*/ readonly reconciling!: pulumi.Output<boolean>;
    /**
     * Output only. A system-assigned unique identifier for a the GitRepositoryLink.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;
    /**
     * Output only. [Output only] Update timestamp
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a Connection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectionArgs | ConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectionState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["bitbucketCloudConfig"] = state ? state.bitbucketCloudConfig : undefined;
            resourceInputs["bitbucketDataCenterConfig"] = state ? state.bitbucketDataCenterConfig : undefined;
            resourceInputs["connectionId"] = state ? state.connectionId : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["cryptoKeyConfig"] = state ? state.cryptoKeyConfig : undefined;
            resourceInputs["deleteTime"] = state ? state.deleteTime : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["effectiveAnnotations"] = state ? state.effectiveAnnotations : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["githubConfig"] = state ? state.githubConfig : undefined;
            resourceInputs["githubEnterpriseConfig"] = state ? state.githubEnterpriseConfig : undefined;
            resourceInputs["gitlabConfig"] = state ? state.gitlabConfig : undefined;
            resourceInputs["gitlabEnterpriseConfig"] = state ? state.gitlabEnterpriseConfig : undefined;
            resourceInputs["installationStates"] = state ? state.installationStates : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["reconciling"] = state ? state.reconciling : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as ConnectionArgs | undefined;
            if ((!args || args.connectionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionId'");
            }
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["bitbucketCloudConfig"] = args ? args.bitbucketCloudConfig : undefined;
            resourceInputs["bitbucketDataCenterConfig"] = args ? args.bitbucketDataCenterConfig : undefined;
            resourceInputs["connectionId"] = args ? args.connectionId : undefined;
            resourceInputs["cryptoKeyConfig"] = args ? args.cryptoKeyConfig : undefined;
            resourceInputs["disabled"] = args ? args.disabled : undefined;
            resourceInputs["etag"] = args ? args.etag : undefined;
            resourceInputs["githubConfig"] = args ? args.githubConfig : undefined;
            resourceInputs["githubEnterpriseConfig"] = args ? args.githubEnterpriseConfig : undefined;
            resourceInputs["gitlabConfig"] = args ? args.gitlabConfig : undefined;
            resourceInputs["gitlabEnterpriseConfig"] = args ? args.gitlabEnterpriseConfig : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["deleteTime"] = undefined /*out*/;
            resourceInputs["effectiveAnnotations"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["installationStates"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["reconciling"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Connection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Connection resources.
 */
export interface ConnectionState {
    /**
     * Optional. Allows clients to store small amounts of arbitrary data.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effectiveAnnotations` for all of the annotations present on the resource.
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configuration for connections to an instance of Bitbucket Cloud.
     * Structure is documented below.
     */
    bitbucketCloudConfig?: pulumi.Input<inputs.developerconnect.ConnectionBitbucketCloudConfig>;
    /**
     * Configuration for connections to an instance of Bitbucket Data Center.
     * Structure is documented below.
     */
    bitbucketDataCenterConfig?: pulumi.Input<inputs.developerconnect.ConnectionBitbucketDataCenterConfig>;
    /**
     * Required. Id of the requesting object
     * If auto-generating Id server-side, remove this field and
     * connectionId from the methodSignature of Create RPC
     */
    connectionId?: pulumi.Input<string>;
    /**
     * Output only. [Output only] Create timestamp
     */
    createTime?: pulumi.Input<string>;
    /**
     * The crypto key configuration. This field is used by the Customer-managed
     * encryption keys (CMEK) feature.
     * Structure is documented below.
     */
    cryptoKeyConfig?: pulumi.Input<inputs.developerconnect.ConnectionCryptoKeyConfig>;
    /**
     * Output only. [Output only] Delete timestamp
     */
    deleteTime?: pulumi.Input<string>;
    /**
     * Optional. If disabled is set to true, functionality is disabled for this connection.
     * Repository based API methods and webhooks processing for repositories in
     * this connection will be disabled.
     */
    disabled?: pulumi.Input<boolean>;
    effectiveAnnotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Optional. This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     */
    etag?: pulumi.Input<string>;
    /**
     * Configuration for connections to github.com.
     * Structure is documented below.
     */
    githubConfig?: pulumi.Input<inputs.developerconnect.ConnectionGithubConfig>;
    /**
     * Configuration for connections to an instance of GitHub Enterprise.
     * Structure is documented below.
     */
    githubEnterpriseConfig?: pulumi.Input<inputs.developerconnect.ConnectionGithubEnterpriseConfig>;
    /**
     * Configuration for connections to gitlab.com.
     * Structure is documented below.
     */
    gitlabConfig?: pulumi.Input<inputs.developerconnect.ConnectionGitlabConfig>;
    /**
     * Configuration for connections to an instance of GitLab Enterprise.
     * Structure is documented below.
     */
    gitlabEnterpriseConfig?: pulumi.Input<inputs.developerconnect.ConnectionGitlabEnterpriseConfig>;
    /**
     * Describes stage and necessary actions to be taken by the
     * user to complete the installation. Used for GitHub and GitHub Enterprise
     * based connections.
     * Structure is documented below.
     */
    installationStates?: pulumi.Input<pulumi.Input<inputs.developerconnect.ConnectionInstallationState>[]>;
    /**
     * Optional. Labels as key value pairs
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
     */
    location?: pulumi.Input<string>;
    /**
     * Identifier. The resource name of the connection, in the format
     * `projects/{project}/locations/{location}/connections/{connection_id}`.
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
     * Output only. Set to true when the connection is being set up or updated in the
     * background.
     */
    reconciling?: pulumi.Input<boolean>;
    /**
     * Output only. A system-assigned unique identifier for a the GitRepositoryLink.
     */
    uid?: pulumi.Input<string>;
    /**
     * Output only. [Output only] Update timestamp
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Connection resource.
 */
export interface ConnectionArgs {
    /**
     * Optional. Allows clients to store small amounts of arbitrary data.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effectiveAnnotations` for all of the annotations present on the resource.
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configuration for connections to an instance of Bitbucket Cloud.
     * Structure is documented below.
     */
    bitbucketCloudConfig?: pulumi.Input<inputs.developerconnect.ConnectionBitbucketCloudConfig>;
    /**
     * Configuration for connections to an instance of Bitbucket Data Center.
     * Structure is documented below.
     */
    bitbucketDataCenterConfig?: pulumi.Input<inputs.developerconnect.ConnectionBitbucketDataCenterConfig>;
    /**
     * Required. Id of the requesting object
     * If auto-generating Id server-side, remove this field and
     * connectionId from the methodSignature of Create RPC
     */
    connectionId: pulumi.Input<string>;
    /**
     * The crypto key configuration. This field is used by the Customer-managed
     * encryption keys (CMEK) feature.
     * Structure is documented below.
     */
    cryptoKeyConfig?: pulumi.Input<inputs.developerconnect.ConnectionCryptoKeyConfig>;
    /**
     * Optional. If disabled is set to true, functionality is disabled for this connection.
     * Repository based API methods and webhooks processing for repositories in
     * this connection will be disabled.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * Optional. This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     */
    etag?: pulumi.Input<string>;
    /**
     * Configuration for connections to github.com.
     * Structure is documented below.
     */
    githubConfig?: pulumi.Input<inputs.developerconnect.ConnectionGithubConfig>;
    /**
     * Configuration for connections to an instance of GitHub Enterprise.
     * Structure is documented below.
     */
    githubEnterpriseConfig?: pulumi.Input<inputs.developerconnect.ConnectionGithubEnterpriseConfig>;
    /**
     * Configuration for connections to gitlab.com.
     * Structure is documented below.
     */
    gitlabConfig?: pulumi.Input<inputs.developerconnect.ConnectionGitlabConfig>;
    /**
     * Configuration for connections to an instance of GitLab Enterprise.
     * Structure is documented below.
     */
    gitlabEnterpriseConfig?: pulumi.Input<inputs.developerconnect.ConnectionGitlabEnterpriseConfig>;
    /**
     * Optional. Labels as key value pairs
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
     */
    location: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
