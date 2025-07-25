// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firestore;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.firestore.inputs.GetDocumentArgs;
import com.pulumi.gcp.firestore.inputs.GetDocumentPlainArgs;
import com.pulumi.gcp.firestore.outputs.GetDocumentResult;
import java.util.concurrent.CompletableFuture;

public final class FirestoreFunctions {
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
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.firestore.Document;
     * import com.pulumi.gcp.firestore.DocumentArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var mydoc = new Document("mydoc", DocumentArgs.builder()
     *             .project(database.project())
     *             .database(database.name())
     *             .collection("somenewcollection")
     *             .documentId("my-doc-id")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetDocumentResult> getDocument(GetDocumentArgs args) {
        return getDocument(args, InvokeOptions.Empty);
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
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.firestore.Document;
     * import com.pulumi.gcp.firestore.DocumentArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var mydoc = new Document("mydoc", DocumentArgs.builder()
     *             .project(database.project())
     *             .database(database.name())
     *             .collection("somenewcollection")
     *             .documentId("my-doc-id")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetDocumentResult> getDocumentPlain(GetDocumentPlainArgs args) {
        return getDocumentPlain(args, InvokeOptions.Empty);
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
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.firestore.Document;
     * import com.pulumi.gcp.firestore.DocumentArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var mydoc = new Document("mydoc", DocumentArgs.builder()
     *             .project(database.project())
     *             .database(database.name())
     *             .collection("somenewcollection")
     *             .documentId("my-doc-id")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetDocumentResult> getDocument(GetDocumentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:firestore/getDocument:getDocument", TypeShape.of(GetDocumentResult.class), args, Utilities.withVersion(options));
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
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.firestore.Document;
     * import com.pulumi.gcp.firestore.DocumentArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var mydoc = new Document("mydoc", DocumentArgs.builder()
     *             .project(database.project())
     *             .database(database.name())
     *             .collection("somenewcollection")
     *             .documentId("my-doc-id")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetDocumentResult> getDocument(GetDocumentArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("gcp:firestore/getDocument:getDocument", TypeShape.of(GetDocumentResult.class), args, Utilities.withVersion(options));
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
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.firestore.Document;
     * import com.pulumi.gcp.firestore.DocumentArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var mydoc = new Document("mydoc", DocumentArgs.builder()
     *             .project(database.project())
     *             .database(database.name())
     *             .collection("somenewcollection")
     *             .documentId("my-doc-id")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetDocumentResult> getDocumentPlain(GetDocumentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:firestore/getDocument:getDocument", TypeShape.of(GetDocumentResult.class), args, Utilities.withVersion(options));
    }
}
