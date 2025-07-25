// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.dataproc.GdcSparkApplicationArgs;
import com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationState;
import com.pulumi.gcp.dataproc.outputs.GdcSparkApplicationPysparkApplicationConfig;
import com.pulumi.gcp.dataproc.outputs.GdcSparkApplicationSparkApplicationConfig;
import com.pulumi.gcp.dataproc.outputs.GdcSparkApplicationSparkRApplicationConfig;
import com.pulumi.gcp.dataproc.outputs.GdcSparkApplicationSparkSqlApplicationConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Spark application is a single Spark workload run on a GDC cluster.
 * 
 * To get more information about SparkApplication, see:
 * 
 * * [API documentation](https://cloud.google.com/dataproc-gdc/docs/reference/rest/v1/projects.locations.serviceInstances.sparkApplications)
 * * How-to Guides
 *     * [Dataproc Intro](https://cloud.google.com/dataproc/)
 * 
 * ## Example Usage
 * 
 * ### Dataprocgdc Sparkapplication Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.dataproc.GdcSparkApplication;
 * import com.pulumi.gcp.dataproc.GdcSparkApplicationArgs;
 * import com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkApplicationConfigArgs;
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
 *         var spark_application = new GdcSparkApplication("spark-application", GdcSparkApplicationArgs.builder()
 *             .sparkApplicationId("tf-e2e-spark-app-basic")
 *             .serviceinstance("do-not-delete-dataproc-gdc-instance")
 *             .project("my-project")
 *             .location("us-west2")
 *             .namespace("default")
 *             .sparkApplicationConfig(GdcSparkApplicationSparkApplicationConfigArgs.builder()
 *                 .mainClass("org.apache.spark.examples.SparkPi")
 *                 .jarFileUris("file:///usr/lib/spark/examples/jars/spark-examples.jar")
 *                 .args("10000")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Dataprocgdc Sparkapplication
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.dataproc.GdcApplicationEnvironment;
 * import com.pulumi.gcp.dataproc.GdcApplicationEnvironmentArgs;
 * import com.pulumi.gcp.dataproc.GdcSparkApplication;
 * import com.pulumi.gcp.dataproc.GdcSparkApplicationArgs;
 * import com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkApplicationConfigArgs;
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
 *         var appEnv = new GdcApplicationEnvironment("appEnv", GdcApplicationEnvironmentArgs.builder()
 *             .applicationEnvironmentId("tf-e2e-spark-app-env")
 *             .serviceinstance("do-not-delete-dataproc-gdc-instance")
 *             .project("my-project")
 *             .location("us-west2")
 *             .namespace("default")
 *             .build());
 * 
 *         var spark_application = new GdcSparkApplication("spark-application", GdcSparkApplicationArgs.builder()
 *             .sparkApplicationId("tf-e2e-spark-app")
 *             .serviceinstance("do-not-delete-dataproc-gdc-instance")
 *             .project("my-project")
 *             .location("us-west2")
 *             .namespace("default")
 *             .labels(Map.of("test-label", "label-value"))
 *             .annotations(Map.of("an_annotation", "annotation_value"))
 *             .properties(Map.of("spark.executor.instances", "2"))
 *             .applicationEnvironment(appEnv.name())
 *             .version("1.2")
 *             .sparkApplicationConfig(GdcSparkApplicationSparkApplicationConfigArgs.builder()
 *                 .mainJarFileUri("file:///usr/lib/spark/examples/jars/spark-examples.jar")
 *                 .jarFileUris("file:///usr/lib/spark/examples/jars/spark-examples.jar")
 *                 .archiveUris("file://usr/lib/spark/examples/spark-examples.jar")
 *                 .fileUris("file:///usr/lib/spark/examples/jars/spark-examples.jar")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Dataprocgdc Sparkapplication Pyspark
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.dataproc.GdcSparkApplication;
 * import com.pulumi.gcp.dataproc.GdcSparkApplicationArgs;
 * import com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationPysparkApplicationConfigArgs;
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
 *         var spark_application = new GdcSparkApplication("spark-application", GdcSparkApplicationArgs.builder()
 *             .sparkApplicationId("tf-e2e-pyspark-app")
 *             .serviceinstance("do-not-delete-dataproc-gdc-instance")
 *             .project("my-project")
 *             .location("us-west2")
 *             .namespace("default")
 *             .displayName("A Pyspark application for a Terraform create test")
 *             .dependencyImages("gcr.io/some/image")
 *             .pysparkApplicationConfig(GdcSparkApplicationPysparkApplicationConfigArgs.builder()
 *                 .mainPythonFileUri("gs://goog-dataproc-initialization-actions-us-west2/conda/test_conda.py")
 *                 .jarFileUris("file:///usr/lib/spark/examples/jars/spark-examples.jar")
 *                 .pythonFileUris("gs://goog-dataproc-initialization-actions-us-west2/conda/get-sys-exec.py")
 *                 .fileUris("file://usr/lib/spark/examples/spark-examples.jar")
 *                 .archiveUris("file://usr/lib/spark/examples/spark-examples.jar")
 *                 .args("10")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Dataprocgdc Sparkapplication Sparkr
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.dataproc.GdcSparkApplication;
 * import com.pulumi.gcp.dataproc.GdcSparkApplicationArgs;
 * import com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkRApplicationConfigArgs;
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
 *         var spark_application = new GdcSparkApplication("spark-application", GdcSparkApplicationArgs.builder()
 *             .sparkApplicationId("tf-e2e-sparkr-app")
 *             .serviceinstance("do-not-delete-dataproc-gdc-instance")
 *             .project("my-project")
 *             .location("us-west2")
 *             .namespace("default")
 *             .displayName("A SparkR application for a Terraform create test")
 *             .sparkRApplicationConfig(GdcSparkApplicationSparkRApplicationConfigArgs.builder()
 *                 .mainRFileUri("gs://some-bucket/something.R")
 *                 .fileUris("file://usr/lib/spark/examples/spark-examples.jar")
 *                 .archiveUris("file://usr/lib/spark/examples/spark-examples.jar")
 *                 .args("10")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Dataprocgdc Sparkapplication Sparksql
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.dataproc.GdcSparkApplication;
 * import com.pulumi.gcp.dataproc.GdcSparkApplicationArgs;
 * import com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkSqlApplicationConfigArgs;
 * import com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkSqlApplicationConfigQueryListArgs;
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
 *         var spark_application = new GdcSparkApplication("spark-application", GdcSparkApplicationArgs.builder()
 *             .sparkApplicationId("tf-e2e-sparksql-app")
 *             .serviceinstance("do-not-delete-dataproc-gdc-instance")
 *             .project("my-project")
 *             .location("us-west2")
 *             .namespace("default")
 *             .displayName("A SparkSql application for a Terraform create test")
 *             .sparkSqlApplicationConfig(GdcSparkApplicationSparkSqlApplicationConfigArgs.builder()
 *                 .jarFileUris("file:///usr/lib/spark/examples/jars/spark-examples.jar")
 *                 .queryList(GdcSparkApplicationSparkSqlApplicationConfigQueryListArgs.builder()
 *                     .queries("show tables;")
 *                     .build())
 *                 .scriptVariables(Map.of("MY_VAR", "1"))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Dataprocgdc Sparkapplication Sparksql Query File
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.dataproc.GdcSparkApplication;
 * import com.pulumi.gcp.dataproc.GdcSparkApplicationArgs;
 * import com.pulumi.gcp.dataproc.inputs.GdcSparkApplicationSparkSqlApplicationConfigArgs;
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
 *         var spark_application = new GdcSparkApplication("spark-application", GdcSparkApplicationArgs.builder()
 *             .sparkApplicationId("tf-e2e-sparksql-app")
 *             .serviceinstance("do-not-delete-dataproc-gdc-instance")
 *             .project("my-project")
 *             .location("us-west2")
 *             .namespace("default")
 *             .displayName("A SparkSql application for a Terraform create test")
 *             .sparkSqlApplicationConfig(GdcSparkApplicationSparkSqlApplicationConfigArgs.builder()
 *                 .jarFileUris("file:///usr/lib/spark/examples/jars/spark-examples.jar")
 *                 .queryFileUri("gs://some-bucket/something.sql")
 *                 .scriptVariables(Map.of("MY_VAR", "1"))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * SparkApplication can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/serviceInstances/{{serviceinstance}}/sparkApplications/{{spark_application_id}}`
 * 
 * * `{{project}}/{{location}}/{{serviceinstance}}/{{spark_application_id}}`
 * 
 * * `{{location}}/{{serviceinstance}}/{{spark_application_id}}`
 * 
 * When using the `pulumi import` command, SparkApplication can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:dataproc/gdcSparkApplication:GdcSparkApplication default projects/{{project}}/locations/{{location}}/serviceInstances/{{serviceinstance}}/sparkApplications/{{spark_application_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:dataproc/gdcSparkApplication:GdcSparkApplication default {{project}}/{{location}}/{{serviceinstance}}/{{spark_application_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:dataproc/gdcSparkApplication:GdcSparkApplication default {{location}}/{{serviceinstance}}/{{spark_application_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:dataproc/gdcSparkApplication:GdcSparkApplication")
public class GdcSparkApplication extends com.pulumi.resources.CustomResource {
    /**
     * The annotations to associate with this application. Annotations may be used to store client information, but are not used by the server.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> annotations;

    /**
     * @return The annotations to associate with this application. Annotations may be used to store client information, but are not used by the server.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * An ApplicationEnvironment from which to inherit configuration properties.
     * 
     */
    @Export(name="applicationEnvironment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> applicationEnvironment;

    /**
     * @return An ApplicationEnvironment from which to inherit configuration properties.
     * 
     */
    public Output<Optional<String>> applicationEnvironment() {
        return Codegen.optional(this.applicationEnvironment);
    }
    /**
     * The timestamp when the resource was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The timestamp when the resource was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * List of container image uris for additional file dependencies. Dependent files are sequentially copied from each image. If a file with the same name exists in 2 images then the file from later image is used.
     * 
     */
    @Export(name="dependencyImages", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> dependencyImages;

    /**
     * @return List of container image uris for additional file dependencies. Dependent files are sequentially copied from each image. If a file with the same name exists in 2 images then the file from later image is used.
     * 
     */
    public Output<Optional<List<String>>> dependencyImages() {
        return Codegen.optional(this.dependencyImages);
    }
    /**
     * User-provided human-readable name to be used in user interfaces.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return User-provided human-readable name to be used in user interfaces.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    @Export(name="effectiveAnnotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> effectiveAnnotations;

    public Output<Map<String,String>> effectiveAnnotations() {
        return this.effectiveAnnotations;
    }
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Export(name="effectiveLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Output<Map<String,String>> effectiveLabels() {
        return this.effectiveLabels;
    }
    /**
     * The labels to associate with this application. Labels may be used for filtering and billing tracking.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return The labels to associate with this application. Labels may be used for filtering and billing tracking.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The location of the spark application.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location of the spark application.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * URL for a monitoring UI for this application (for eventual Spark PHS/UI support) Out of scope for private GA
     * 
     */
    @Export(name="monitoringEndpoint", refs={String.class}, tree="[0]")
    private Output<String> monitoringEndpoint;

    /**
     * @return URL for a monitoring UI for this application (for eventual Spark PHS/UI support) Out of scope for private GA
     * 
     */
    public Output<String> monitoringEndpoint() {
        return this.monitoringEndpoint;
    }
    /**
     * Identifier. The name of the application. Format: projects/{project}/locations/{location}/serviceInstances/{service_instance}/sparkApplications/{application}
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Identifier. The name of the application. Format: projects/{project}/locations/{location}/serviceInstances/{service_instance}/sparkApplications/{application}
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Kubernetes namespace in which to create the application. This namespace must already exist on the cluster.
     * 
     */
    @Export(name="namespace", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> namespace;

    /**
     * @return The Kubernetes namespace in which to create the application. This namespace must already exist on the cluster.
     * 
     */
    public Output<Optional<String>> namespace() {
        return Codegen.optional(this.namespace);
    }
    /**
     * An HCFS URI pointing to the location of stdout and stdout of the application Mainly useful for Pantheon and gcloud Not in scope for private GA
     * 
     */
    @Export(name="outputUri", refs={String.class}, tree="[0]")
    private Output<String> outputUri;

    /**
     * @return An HCFS URI pointing to the location of stdout and stdout of the application Mainly useful for Pantheon and gcloud Not in scope for private GA
     * 
     */
    public Output<String> outputUri() {
        return this.outputUri;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * application-specific properties.
     * 
     */
    @Export(name="properties", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> properties;

    /**
     * @return application-specific properties.
     * 
     */
    public Output<Optional<Map<String,String>>> properties() {
        return Codegen.optional(this.properties);
    }
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Export(name="pulumiLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Output<Map<String,String>> pulumiLabels() {
        return this.pulumiLabels;
    }
    /**
     * Represents the PySparkApplicationConfig.
     * Structure is documented below.
     * 
     */
    @Export(name="pysparkApplicationConfig", refs={GdcSparkApplicationPysparkApplicationConfig.class}, tree="[0]")
    private Output</* @Nullable */ GdcSparkApplicationPysparkApplicationConfig> pysparkApplicationConfig;

    /**
     * @return Represents the PySparkApplicationConfig.
     * Structure is documented below.
     * 
     */
    public Output<Optional<GdcSparkApplicationPysparkApplicationConfig>> pysparkApplicationConfig() {
        return Codegen.optional(this.pysparkApplicationConfig);
    }
    /**
     * Whether the application is currently reconciling. True if the current state of the resource does not match the intended state, and the system is working to reconcile them, whether or not the change was user initiated.
     * 
     */
    @Export(name="reconciling", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> reconciling;

    /**
     * @return Whether the application is currently reconciling. True if the current state of the resource does not match the intended state, and the system is working to reconcile them, whether or not the change was user initiated.
     * 
     */
    public Output<Boolean> reconciling() {
        return this.reconciling;
    }
    /**
     * The id of the service instance to which this spark application belongs.
     * 
     */
    @Export(name="serviceinstance", refs={String.class}, tree="[0]")
    private Output<String> serviceinstance;

    /**
     * @return The id of the service instance to which this spark application belongs.
     * 
     */
    public Output<String> serviceinstance() {
        return this.serviceinstance;
    }
    /**
     * Represents the SparkApplicationConfig.
     * Structure is documented below.
     * 
     */
    @Export(name="sparkApplicationConfig", refs={GdcSparkApplicationSparkApplicationConfig.class}, tree="[0]")
    private Output</* @Nullable */ GdcSparkApplicationSparkApplicationConfig> sparkApplicationConfig;

    /**
     * @return Represents the SparkApplicationConfig.
     * Structure is documented below.
     * 
     */
    public Output<Optional<GdcSparkApplicationSparkApplicationConfig>> sparkApplicationConfig() {
        return Codegen.optional(this.sparkApplicationConfig);
    }
    /**
     * The id of the application
     * 
     */
    @Export(name="sparkApplicationId", refs={String.class}, tree="[0]")
    private Output<String> sparkApplicationId;

    /**
     * @return The id of the application
     * 
     */
    public Output<String> sparkApplicationId() {
        return this.sparkApplicationId;
    }
    /**
     * Represents the SparkRApplicationConfig.
     * Structure is documented below.
     * 
     */
    @Export(name="sparkRApplicationConfig", refs={GdcSparkApplicationSparkRApplicationConfig.class}, tree="[0]")
    private Output</* @Nullable */ GdcSparkApplicationSparkRApplicationConfig> sparkRApplicationConfig;

    /**
     * @return Represents the SparkRApplicationConfig.
     * Structure is documented below.
     * 
     */
    public Output<Optional<GdcSparkApplicationSparkRApplicationConfig>> sparkRApplicationConfig() {
        return Codegen.optional(this.sparkRApplicationConfig);
    }
    /**
     * Represents the SparkRApplicationConfig.
     * Structure is documented below.
     * 
     */
    @Export(name="sparkSqlApplicationConfig", refs={GdcSparkApplicationSparkSqlApplicationConfig.class}, tree="[0]")
    private Output</* @Nullable */ GdcSparkApplicationSparkSqlApplicationConfig> sparkSqlApplicationConfig;

    /**
     * @return Represents the SparkRApplicationConfig.
     * Structure is documented below.
     * 
     */
    public Output<Optional<GdcSparkApplicationSparkSqlApplicationConfig>> sparkSqlApplicationConfig() {
        return Codegen.optional(this.sparkSqlApplicationConfig);
    }
    /**
     * The current state.
     * Possible values:
     * * `STATE_UNSPECIFIED`
     * * `PENDING`
     * * `RUNNING`
     * * `CANCELLING`
     * * `CANCELLED`
     * * `SUCCEEDED`
     * * `FAILED`
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The current state.
     * Possible values:
     * * `STATE_UNSPECIFIED`
     * * `PENDING`
     * * `RUNNING`
     * * `CANCELLING`
     * * `CANCELLED`
     * * `SUCCEEDED`
     * * `FAILED`
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * A message explaining the current state.
     * 
     */
    @Export(name="stateMessage", refs={String.class}, tree="[0]")
    private Output<String> stateMessage;

    /**
     * @return A message explaining the current state.
     * 
     */
    public Output<String> stateMessage() {
        return this.stateMessage;
    }
    /**
     * System generated unique identifier for this application, formatted as UUID4.
     * 
     */
    @Export(name="uid", refs={String.class}, tree="[0]")
    private Output<String> uid;

    /**
     * @return System generated unique identifier for this application, formatted as UUID4.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * The timestamp when the resource was most recently updated.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return The timestamp when the resource was most recently updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * The Dataproc version of this application.
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> version;

    /**
     * @return The Dataproc version of this application.
     * 
     */
    public Output<Optional<String>> version() {
        return Codegen.optional(this.version);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GdcSparkApplication(java.lang.String name) {
        this(name, GdcSparkApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GdcSparkApplication(java.lang.String name, GdcSparkApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GdcSparkApplication(java.lang.String name, GdcSparkApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/gdcSparkApplication:GdcSparkApplication", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GdcSparkApplication(java.lang.String name, Output<java.lang.String> id, @Nullable GdcSparkApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/gdcSparkApplication:GdcSparkApplication", name, state, makeResourceOptions(options, id), false);
    }

    private static GdcSparkApplicationArgs makeArgs(GdcSparkApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GdcSparkApplicationArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "effectiveLabels",
                "pulumiLabels"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GdcSparkApplication get(java.lang.String name, Output<java.lang.String> id, @Nullable GdcSparkApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GdcSparkApplication(name, id, state, options);
    }
}
