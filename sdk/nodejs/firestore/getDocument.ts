// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Reads a document from a Firestore database.
 * See [the official documentation](https://cloud.google.com/firestore/native/docs/)
 * and
 * [API](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.documents/get/).
 *
 * ## Example Usage
 *
 * Retrieve a document from the Firestore database.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const mydoc = new gcp.firestore.Document("mydoc", {
 *     project: database.project,
 *     database: database.name,
 *     collection: "somenewcollection",
 *     documentId: "my-doc-id",
 * });
 * ```
 */
export function getDocument(args: GetDocumentArgs, opts?: pulumi.InvokeOptions): Promise<GetDocumentResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:firestore/getDocument:getDocument", {
        "collection": args.collection,
        "database": args.database,
        "documentId": args.documentId,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getDocument.
 */
export interface GetDocumentArgs {
    /**
     * The name of the collection of documents.
     */
    collection: string;
    /**
     * The name of the Firestore database.
     */
    database: string;
    /**
     * The id of the document to get.
     */
    documentId: string;
    /**
     * The project in which the database resides.
     */
    project?: string;
}

/**
 * A collection of values returned by getDocument.
 */
export interface GetDocumentResult {
    readonly collection: string;
    readonly createTime: string;
    readonly database: string;
    readonly documentId: string;
    readonly fields: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly path: string;
    readonly project?: string;
    readonly updateTime: string;
}
/**
 * Reads a document from a Firestore database.
 * See [the official documentation](https://cloud.google.com/firestore/native/docs/)
 * and
 * [API](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.documents/get/).
 *
 * ## Example Usage
 *
 * Retrieve a document from the Firestore database.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const mydoc = new gcp.firestore.Document("mydoc", {
 *     project: database.project,
 *     database: database.name,
 *     collection: "somenewcollection",
 *     documentId: "my-doc-id",
 * });
 * ```
 */
export function getDocumentOutput(args: GetDocumentOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDocumentResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:firestore/getDocument:getDocument", {
        "collection": args.collection,
        "database": args.database,
        "documentId": args.documentId,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getDocument.
 */
export interface GetDocumentOutputArgs {
    /**
     * The name of the collection of documents.
     */
    collection: pulumi.Input<string>;
    /**
     * The name of the Firestore database.
     */
    database: pulumi.Input<string>;
    /**
     * The id of the document to get.
     */
    documentId: pulumi.Input<string>;
    /**
     * The project in which the database resides.
     */
    project?: pulumi.Input<string>;
}
