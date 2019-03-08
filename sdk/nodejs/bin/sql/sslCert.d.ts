import * as pulumi from "@pulumi/pulumi";
/**
 * Creates a new Google SQL SSL Cert on a Google SQL Instance. For more information, see the [official documentation](https://cloud.google.com/sql/), or the [JSON API](https://cloud.google.com/sql/docs/mysql/admin-api/v1beta4/sslCerts).
 *
 * > **Note:** All arguments including the private key will be stored in the raw state as plain-text.
 * [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
 *
 * ## Example Usage
 *
 * Example creating a SQL Client Certificate.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const master = new gcp.sql.DatabaseInstance("master", {
 *     settings: {
 *         tier: "D0",
 *     },
 * });
 * const clientCert = new gcp.sql.SslCert("client_cert", {
 *     commonName: "client-name",
 *     instance: master.name,
 * });
 * ```
 */
export declare class SslCert extends pulumi.CustomResource {
    /**
     * Get an existing SslCert resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SslCertState, opts?: pulumi.CustomResourceOptions): SslCert;
    /**
     * The actual certificate data for this client certificate.
     */
    readonly cert: pulumi.Output<string>;
    /**
     * The serial number extracted from the certificate data.
     */
    readonly certSerialNumber: pulumi.Output<string>;
    /**
     * The common name to be used in the certificate to identify the
     * client. Constrained to [a-zA-Z.-_ ]+. Changing this forces a new resource to be created.
     */
    readonly commonName: pulumi.Output<string>;
    /**
     * The time when the certificate was created in RFC 3339 format,
     * for example 2012-11-15T16:19:00.094Z.
     */
    readonly createTime: pulumi.Output<string>;
    /**
     * The time when the certificate expires in RFC 3339 format,
     * for example 2012-11-15T16:19:00.094Z.
     */
    readonly expirationTime: pulumi.Output<string>;
    /**
     * The name of the Cloud SQL instance. Changing this
     * forces a new resource to be created.
     */
    readonly instance: pulumi.Output<string>;
    /**
     * The private key associated with the client certificate.
     */
    readonly privateKey: pulumi.Output<string>;
    /**
     * The CA cert of the server this client cert was generated from.
     */
    readonly serverCaCert: pulumi.Output<string>;
    /**
     * The SHA1 Fingerprint of the certificate.
     */
    readonly sha1Fingerprint: pulumi.Output<string>;
    /**
     * Create a SslCert resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SslCertArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering SslCert resources.
 */
export interface SslCertState {
    /**
     * The actual certificate data for this client certificate.
     */
    readonly cert?: pulumi.Input<string>;
    /**
     * The serial number extracted from the certificate data.
     */
    readonly certSerialNumber?: pulumi.Input<string>;
    /**
     * The common name to be used in the certificate to identify the
     * client. Constrained to [a-zA-Z.-_ ]+. Changing this forces a new resource to be created.
     */
    readonly commonName?: pulumi.Input<string>;
    /**
     * The time when the certificate was created in RFC 3339 format,
     * for example 2012-11-15T16:19:00.094Z.
     */
    readonly createTime?: pulumi.Input<string>;
    /**
     * The time when the certificate expires in RFC 3339 format,
     * for example 2012-11-15T16:19:00.094Z.
     */
    readonly expirationTime?: pulumi.Input<string>;
    /**
     * The name of the Cloud SQL instance. Changing this
     * forces a new resource to be created.
     */
    readonly instance?: pulumi.Input<string>;
    /**
     * The private key associated with the client certificate.
     */
    readonly privateKey?: pulumi.Input<string>;
    /**
     * The CA cert of the server this client cert was generated from.
     */
    readonly serverCaCert?: pulumi.Input<string>;
    /**
     * The SHA1 Fingerprint of the certificate.
     */
    readonly sha1Fingerprint?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a SslCert resource.
 */
export interface SslCertArgs {
    /**
     * The common name to be used in the certificate to identify the
     * client. Constrained to [a-zA-Z.-_ ]+. Changing this forces a new resource to be created.
     */
    readonly commonName: pulumi.Input<string>;
    /**
     * The name of the Cloud SQL instance. Changing this
     * forces a new resource to be created.
     */
    readonly instance: pulumi.Input<string>;
}
