// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.bigquery.RoutineArgs;
import com.pulumi.gcp.bigquery.inputs.RoutineState;
import com.pulumi.gcp.bigquery.outputs.RoutineArgument;
import com.pulumi.gcp.bigquery.outputs.RoutineRemoteFunctionOptions;
import com.pulumi.gcp.bigquery.outputs.RoutineSparkOptions;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A user-defined function or a stored procedure that belongs to a Dataset
 * 
 * To get more information about Routine, see:
 * 
 * * [API documentation](https://cloud.google.com/bigquery/docs/reference/rest/v2/routines)
 * * How-to Guides
 *     * [Routines Intro](https://cloud.google.com/bigquery/docs/reference/rest/v2/routines)
 * 
 * ## Example Usage
 * 
 * ### Bigquery Routine Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigquery.Dataset;
 * import com.pulumi.gcp.bigquery.DatasetArgs;
 * import com.pulumi.gcp.bigquery.Routine;
 * import com.pulumi.gcp.bigquery.RoutineArgs;
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
 *         var test = new Dataset("test", DatasetArgs.builder()
 *             .datasetId("dataset_id")
 *             .build());
 * 
 *         var sproc = new Routine("sproc", RoutineArgs.builder()
 *             .datasetId(test.datasetId())
 *             .routineId("routine_id")
 *             .routineType("PROCEDURE")
 *             .language("SQL")
 *             .securityMode("INVOKER")
 *             .definitionBody("CREATE FUNCTION Add(x FLOAT64, y FLOAT64) RETURNS FLOAT64 AS (x + y);")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Bigquery Routine Json
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigquery.Dataset;
 * import com.pulumi.gcp.bigquery.DatasetArgs;
 * import com.pulumi.gcp.bigquery.Routine;
 * import com.pulumi.gcp.bigquery.RoutineArgs;
 * import com.pulumi.gcp.bigquery.inputs.RoutineArgumentArgs;
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
 *         var test = new Dataset("test", DatasetArgs.builder()
 *             .datasetId("dataset_id")
 *             .build());
 * 
 *         var sproc = new Routine("sproc", RoutineArgs.builder()
 *             .datasetId(test.datasetId())
 *             .routineId("routine_id")
 *             .routineType("SCALAR_FUNCTION")
 *             .language("JAVASCRIPT")
 *             .definitionBody("CREATE FUNCTION multiplyInputs return x*y;")
 *             .arguments(            
 *                 RoutineArgumentArgs.builder()
 *                     .name("x")
 *                     .dataType("{\"typeKind\" :  \"FLOAT64\"}")
 *                     .build(),
 *                 RoutineArgumentArgs.builder()
 *                     .name("y")
 *                     .dataType("{\"typeKind\" :  \"FLOAT64\"}")
 *                     .build())
 *             .returnType("{\"typeKind\" :  \"FLOAT64\"}")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Bigquery Routine Tvf
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigquery.Dataset;
 * import com.pulumi.gcp.bigquery.DatasetArgs;
 * import com.pulumi.gcp.bigquery.Routine;
 * import com.pulumi.gcp.bigquery.RoutineArgs;
 * import com.pulumi.gcp.bigquery.inputs.RoutineArgumentArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var test = new Dataset("test", DatasetArgs.builder()
 *             .datasetId("dataset_id")
 *             .build());
 * 
 *         var sproc = new Routine("sproc", RoutineArgs.builder()
 *             .datasetId(test.datasetId())
 *             .routineId("routine_id")
 *             .routineType("TABLE_VALUED_FUNCTION")
 *             .language("SQL")
 *             .definitionBody("""
 * SELECT 1 + value AS value
 *             """)
 *             .arguments(RoutineArgumentArgs.builder()
 *                 .name("value")
 *                 .argumentKind("FIXED_TYPE")
 *                 .dataType(serializeJson(
 *                     jsonObject(
 *                         jsonProperty("typeKind", "INT64")
 *                     )))
 *                 .build())
 *             .returnTableType(serializeJson(
 *                 jsonObject(
 *                     jsonProperty("columns", jsonArray(jsonObject(
 *                         jsonProperty("name", "value"),
 *                         jsonProperty("type", jsonObject(
 *                             jsonProperty("typeKind", "INT64")
 *                         ))
 *                     )))
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Bigquery Routine Pyspark
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigquery.Dataset;
 * import com.pulumi.gcp.bigquery.DatasetArgs;
 * import com.pulumi.gcp.bigquery.Connection;
 * import com.pulumi.gcp.bigquery.ConnectionArgs;
 * import com.pulumi.gcp.bigquery.inputs.ConnectionSparkArgs;
 * import com.pulumi.gcp.bigquery.Routine;
 * import com.pulumi.gcp.bigquery.RoutineArgs;
 * import com.pulumi.gcp.bigquery.inputs.RoutineSparkOptionsArgs;
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
 *         var test = new Dataset("test", DatasetArgs.builder()
 *             .datasetId("dataset_id")
 *             .build());
 * 
 *         var testConnection = new Connection("testConnection", ConnectionArgs.builder()
 *             .connectionId("connection_id")
 *             .location("US")
 *             .spark(ConnectionSparkArgs.builder()
 *                 .build())
 *             .build());
 * 
 *         var pyspark = new Routine("pyspark", RoutineArgs.builder()
 *             .datasetId(test.datasetId())
 *             .routineId("routine_id")
 *             .routineType("PROCEDURE")
 *             .language("PYTHON")
 *             .definitionBody("""
 * from pyspark.sql import SparkSession
 * 
 * spark = SparkSession.builder.appName("spark-bigquery-demo").getOrCreate()
 *     
 * # Load data from BigQuery.
 * words = spark.read.format("bigquery") \
 *   .option("table", "bigquery-public-data:samples.shakespeare") \
 *   .load()
 * words.createOrReplaceTempView("words")
 *     
 * # Perform word count.
 * word_count = words.select('word', 'word_count').groupBy('word').sum('word_count').withColumnRenamed("sum(word_count)", "sum_word_count")
 * word_count.show()
 * word_count.printSchema()
 *     
 * # Saving the data to BigQuery
 * word_count.write.format("bigquery") \
 *   .option("writeMethod", "direct") \
 *   .save("wordcount_dataset.wordcount_output")
 *             """)
 *             .sparkOptions(RoutineSparkOptionsArgs.builder()
 *                 .connection(testConnection.name())
 *                 .runtimeVersion("2.1")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Bigquery Routine Pyspark Mainfile
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigquery.Dataset;
 * import com.pulumi.gcp.bigquery.DatasetArgs;
 * import com.pulumi.gcp.bigquery.Connection;
 * import com.pulumi.gcp.bigquery.ConnectionArgs;
 * import com.pulumi.gcp.bigquery.inputs.ConnectionSparkArgs;
 * import com.pulumi.gcp.bigquery.Routine;
 * import com.pulumi.gcp.bigquery.RoutineArgs;
 * import com.pulumi.gcp.bigquery.inputs.RoutineSparkOptionsArgs;
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
 *         var test = new Dataset("test", DatasetArgs.builder()
 *             .datasetId("dataset_id")
 *             .build());
 * 
 *         var testConnection = new Connection("testConnection", ConnectionArgs.builder()
 *             .connectionId("connection_id")
 *             .location("US")
 *             .spark(ConnectionSparkArgs.builder()
 *                 .build())
 *             .build());
 * 
 *         var pysparkMainfile = new Routine("pysparkMainfile", RoutineArgs.builder()
 *             .datasetId(test.datasetId())
 *             .routineId("routine_id")
 *             .routineType("PROCEDURE")
 *             .language("PYTHON")
 *             .definitionBody("")
 *             .sparkOptions(RoutineSparkOptionsArgs.builder()
 *                 .connection(testConnection.name())
 *                 .runtimeVersion("2.1")
 *                 .mainFileUri("gs://test-bucket/main.py")
 *                 .pyFileUris("gs://test-bucket/lib.py")
 *                 .fileUris("gs://test-bucket/distribute_in_executor.json")
 *                 .archiveUris("gs://test-bucket/distribute_in_executor.tar.gz")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Bigquery Routine Spark Jar
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigquery.Dataset;
 * import com.pulumi.gcp.bigquery.DatasetArgs;
 * import com.pulumi.gcp.bigquery.Connection;
 * import com.pulumi.gcp.bigquery.ConnectionArgs;
 * import com.pulumi.gcp.bigquery.inputs.ConnectionSparkArgs;
 * import com.pulumi.gcp.bigquery.Routine;
 * import com.pulumi.gcp.bigquery.RoutineArgs;
 * import com.pulumi.gcp.bigquery.inputs.RoutineSparkOptionsArgs;
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
 *         var test = new Dataset("test", DatasetArgs.builder()
 *             .datasetId("dataset_id")
 *             .build());
 * 
 *         var testConnection = new Connection("testConnection", ConnectionArgs.builder()
 *             .connectionId("connection_id")
 *             .location("US")
 *             .spark(ConnectionSparkArgs.builder()
 *                 .build())
 *             .build());
 * 
 *         var sparkJar = new Routine("sparkJar", RoutineArgs.builder()
 *             .datasetId(test.datasetId())
 *             .routineId("routine_id")
 *             .routineType("PROCEDURE")
 *             .language("SCALA")
 *             .definitionBody("")
 *             .sparkOptions(RoutineSparkOptionsArgs.builder()
 *                 .connection(testConnection.name())
 *                 .runtimeVersion("2.1")
 *                 .containerImage("gcr.io/my-project-id/my-spark-image:latest")
 *                 .mainClass("com.google.test.jar.MainClass")
 *                 .jarUris("gs://test-bucket/uberjar_spark_spark3.jar")
 *                 .properties(Map.ofEntries(
 *                     Map.entry("spark.dataproc.scaling.version", "2"),
 *                     Map.entry("spark.reducer.fetchMigratedShuffle.enabled", "true")
 *                 ))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Bigquery Routine Data Governance Type
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigquery.Dataset;
 * import com.pulumi.gcp.bigquery.DatasetArgs;
 * import com.pulumi.gcp.bigquery.Routine;
 * import com.pulumi.gcp.bigquery.RoutineArgs;
 * import com.pulumi.gcp.bigquery.inputs.RoutineArgumentArgs;
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
 *         var test = new Dataset("test", DatasetArgs.builder()
 *             .datasetId("tf_test_dataset_id_81126")
 *             .build());
 * 
 *         var customMaskingRoutine = new Routine("customMaskingRoutine", RoutineArgs.builder()
 *             .datasetId(test.datasetId())
 *             .routineId("custom_masking_routine")
 *             .routineType("SCALAR_FUNCTION")
 *             .language("SQL")
 *             .dataGovernanceType("DATA_MASKING")
 *             .definitionBody("SAFE.REGEXP_REPLACE(ssn, '[0-9]', 'X')")
 *             .arguments(RoutineArgumentArgs.builder()
 *                 .name("ssn")
 *                 .dataType("{\"typeKind\" :  \"STRING\"}")
 *                 .build())
 *             .returnType("{\"typeKind\" :  \"STRING\"}")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Bigquery Routine Remote Function
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigquery.Dataset;
 * import com.pulumi.gcp.bigquery.DatasetArgs;
 * import com.pulumi.gcp.bigquery.Connection;
 * import com.pulumi.gcp.bigquery.ConnectionArgs;
 * import com.pulumi.gcp.bigquery.inputs.ConnectionCloudResourceArgs;
 * import com.pulumi.gcp.bigquery.Routine;
 * import com.pulumi.gcp.bigquery.RoutineArgs;
 * import com.pulumi.gcp.bigquery.inputs.RoutineRemoteFunctionOptionsArgs;
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
 *         var test = new Dataset("test", DatasetArgs.builder()
 *             .datasetId("dataset_id")
 *             .build());
 * 
 *         var testConnection = new Connection("testConnection", ConnectionArgs.builder()
 *             .connectionId("connection_id")
 *             .location("US")
 *             .cloudResource(ConnectionCloudResourceArgs.builder()
 *                 .build())
 *             .build());
 * 
 *         var remoteFunction = new Routine("remoteFunction", RoutineArgs.builder()
 *             .datasetId(test.datasetId())
 *             .routineId("routine_id")
 *             .routineType("SCALAR_FUNCTION")
 *             .definitionBody("")
 *             .returnType("{\"typeKind\" :  \"STRING\"}")
 *             .remoteFunctionOptions(RoutineRemoteFunctionOptionsArgs.builder()
 *                 .endpoint("https://us-east1-my_gcf_project.cloudfunctions.net/remote_add")
 *                 .connection(testConnection.name())
 *                 .maxBatchingRows("10")
 *                 .userDefinedContext(Map.of("z", "1.5"))
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
 * Routine can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/datasets/{{dataset_id}}/routines/{{routine_id}}`
 * 
 * * `{{project}}/{{dataset_id}}/{{routine_id}}`
 * 
 * * `{{dataset_id}}/{{routine_id}}`
 * 
 * When using the `pulumi import` command, Routine can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:bigquery/routine:Routine default projects/{{project}}/datasets/{{dataset_id}}/routines/{{routine_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:bigquery/routine:Routine default {{project}}/{{dataset_id}}/{{routine_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:bigquery/routine:Routine default {{dataset_id}}/{{routine_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:bigquery/routine:Routine")
public class Routine extends com.pulumi.resources.CustomResource {
    /**
     * Input/output argument of a function or a stored procedure.
     * Structure is documented below.
     * 
     */
    @Export(name="arguments", refs={List.class,RoutineArgument.class}, tree="[0,1]")
    private Output</* @Nullable */ List<RoutineArgument>> arguments;

    /**
     * @return Input/output argument of a function or a stored procedure.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<RoutineArgument>>> arguments() {
        return Codegen.optional(this.arguments);
    }
    /**
     * The time when this routine was created, in milliseconds since the
     * epoch.
     * 
     */
    @Export(name="creationTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> creationTime;

    /**
     * @return The time when this routine was created, in milliseconds since the
     * epoch.
     * 
     */
    public Output<Integer> creationTime() {
        return this.creationTime;
    }
    /**
     * If set to DATA_MASKING, the function is validated and made available as a masking function. For more information, see https://cloud.google.com/bigquery/docs/user-defined-functions#custom-mask
     * Possible values are: `DATA_MASKING`.
     * 
     */
    @Export(name="dataGovernanceType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dataGovernanceType;

    /**
     * @return If set to DATA_MASKING, the function is validated and made available as a masking function. For more information, see https://cloud.google.com/bigquery/docs/user-defined-functions#custom-mask
     * Possible values are: `DATA_MASKING`.
     * 
     */
    public Output<Optional<String>> dataGovernanceType() {
        return Codegen.optional(this.dataGovernanceType);
    }
    /**
     * The ID of the dataset containing this routine
     * 
     */
    @Export(name="datasetId", refs={String.class}, tree="[0]")
    private Output<String> datasetId;

    /**
     * @return The ID of the dataset containing this routine
     * 
     */
    public Output<String> datasetId() {
        return this.datasetId;
    }
    /**
     * The body of the routine. For functions, this is the expression in the AS clause.
     * If language=SQL, it is the substring inside (but excluding) the parentheses.
     * 
     */
    @Export(name="definitionBody", refs={String.class}, tree="[0]")
    private Output<String> definitionBody;

    /**
     * @return The body of the routine. For functions, this is the expression in the AS clause.
     * If language=SQL, it is the substring inside (but excluding) the parentheses.
     * 
     */
    public Output<String> definitionBody() {
        return this.definitionBody;
    }
    /**
     * The description of the routine if defined.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the routine if defined.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The determinism level of the JavaScript UDF if defined.
     * Possible values are: `DETERMINISM_LEVEL_UNSPECIFIED`, `DETERMINISTIC`, `NOT_DETERMINISTIC`.
     * 
     */
    @Export(name="determinismLevel", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> determinismLevel;

    /**
     * @return The determinism level of the JavaScript UDF if defined.
     * Possible values are: `DETERMINISM_LEVEL_UNSPECIFIED`, `DETERMINISTIC`, `NOT_DETERMINISTIC`.
     * 
     */
    public Output<Optional<String>> determinismLevel() {
        return Codegen.optional(this.determinismLevel);
    }
    /**
     * Optional. If language = &#34;JAVASCRIPT&#34;, this field stores the path of the
     * imported JAVASCRIPT libraries.
     * 
     */
    @Export(name="importedLibraries", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> importedLibraries;

    /**
     * @return Optional. If language = &#34;JAVASCRIPT&#34;, this field stores the path of the
     * imported JAVASCRIPT libraries.
     * 
     */
    public Output<Optional<List<String>>> importedLibraries() {
        return Codegen.optional(this.importedLibraries);
    }
    /**
     * The language of the routine.
     * Possible values are: `SQL`, `JAVASCRIPT`, `PYTHON`, `JAVA`, `SCALA`.
     * 
     */
    @Export(name="language", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> language;

    /**
     * @return The language of the routine.
     * Possible values are: `SQL`, `JAVASCRIPT`, `PYTHON`, `JAVA`, `SCALA`.
     * 
     */
    public Output<Optional<String>> language() {
        return Codegen.optional(this.language);
    }
    /**
     * The time when this routine was modified, in milliseconds since the
     * epoch.
     * 
     */
    @Export(name="lastModifiedTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> lastModifiedTime;

    /**
     * @return The time when this routine was modified, in milliseconds since the
     * epoch.
     * 
     */
    public Output<Integer> lastModifiedTime() {
        return this.lastModifiedTime;
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
     * Remote function specific options.
     * Structure is documented below.
     * 
     */
    @Export(name="remoteFunctionOptions", refs={RoutineRemoteFunctionOptions.class}, tree="[0]")
    private Output</* @Nullable */ RoutineRemoteFunctionOptions> remoteFunctionOptions;

    /**
     * @return Remote function specific options.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RoutineRemoteFunctionOptions>> remoteFunctionOptions() {
        return Codegen.optional(this.remoteFunctionOptions);
    }
    /**
     * Optional. Can be set only if routineType = &#34;TABLE_VALUED_FUNCTION&#34;.
     * If absent, the return table type is inferred from definitionBody at query time in each query
     * that references this routine. If present, then the columns in the evaluated table result will
     * be cast to match the column types specificed in return table type, at query time.
     * 
     */
    @Export(name="returnTableType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> returnTableType;

    /**
     * @return Optional. Can be set only if routineType = &#34;TABLE_VALUED_FUNCTION&#34;.
     * If absent, the return table type is inferred from definitionBody at query time in each query
     * that references this routine. If present, then the columns in the evaluated table result will
     * be cast to match the column types specificed in return table type, at query time.
     * 
     */
    public Output<Optional<String>> returnTableType() {
        return Codegen.optional(this.returnTableType);
    }
    /**
     * A JSON schema for the return type. Optional if language = &#34;SQL&#34;; required otherwise.
     * If absent, the return type is inferred from definitionBody at query time in each query
     * that references this routine. If present, then the evaluated result will be cast to
     * the specified returned type at query time. ~&gt;**NOTE**: Because this field expects a JSON
     * string, any changes to the string will create a diff, even if the JSON itself hasn&#39;t
     * changed. If the API returns a different value for the same schema, e.g. it switche
     * d the order of values or replaced STRUCT field type with RECORD field type, we currently
     * cannot suppress the recurring diff this causes. As a workaround, we recommend using
     * the schema as returned by the API.
     * 
     */
    @Export(name="returnType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> returnType;

    /**
     * @return A JSON schema for the return type. Optional if language = &#34;SQL&#34;; required otherwise.
     * If absent, the return type is inferred from definitionBody at query time in each query
     * that references this routine. If present, then the evaluated result will be cast to
     * the specified returned type at query time. ~&gt;**NOTE**: Because this field expects a JSON
     * string, any changes to the string will create a diff, even if the JSON itself hasn&#39;t
     * changed. If the API returns a different value for the same schema, e.g. it switche
     * d the order of values or replaced STRUCT field type with RECORD field type, we currently
     * cannot suppress the recurring diff this causes. As a workaround, we recommend using
     * the schema as returned by the API.
     * 
     */
    public Output<Optional<String>> returnType() {
        return Codegen.optional(this.returnType);
    }
    /**
     * The ID of the the routine. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.
     * 
     */
    @Export(name="routineId", refs={String.class}, tree="[0]")
    private Output<String> routineId;

    /**
     * @return The ID of the the routine. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.
     * 
     */
    public Output<String> routineId() {
        return this.routineId;
    }
    /**
     * The type of routine.
     * Possible values are: `SCALAR_FUNCTION`, `PROCEDURE`, `TABLE_VALUED_FUNCTION`.
     * 
     */
    @Export(name="routineType", refs={String.class}, tree="[0]")
    private Output<String> routineType;

    /**
     * @return The type of routine.
     * Possible values are: `SCALAR_FUNCTION`, `PROCEDURE`, `TABLE_VALUED_FUNCTION`.
     * 
     */
    public Output<String> routineType() {
        return this.routineType;
    }
    /**
     * Optional. The security mode of the routine, if defined. If not defined, the security mode is automatically determined from the routine&#39;s configuration.
     * Possible values are: `DEFINER`, `INVOKER`.
     * 
     */
    @Export(name="securityMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> securityMode;

    /**
     * @return Optional. The security mode of the routine, if defined. If not defined, the security mode is automatically determined from the routine&#39;s configuration.
     * Possible values are: `DEFINER`, `INVOKER`.
     * 
     */
    public Output<Optional<String>> securityMode() {
        return Codegen.optional(this.securityMode);
    }
    /**
     * Optional. If language is one of &#34;PYTHON&#34;, &#34;JAVA&#34;, &#34;SCALA&#34;, this field stores the options for spark stored procedure.
     * Structure is documented below.
     * 
     */
    @Export(name="sparkOptions", refs={RoutineSparkOptions.class}, tree="[0]")
    private Output</* @Nullable */ RoutineSparkOptions> sparkOptions;

    /**
     * @return Optional. If language is one of &#34;PYTHON&#34;, &#34;JAVA&#34;, &#34;SCALA&#34;, this field stores the options for spark stored procedure.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RoutineSparkOptions>> sparkOptions() {
        return Codegen.optional(this.sparkOptions);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Routine(java.lang.String name) {
        this(name, RoutineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Routine(java.lang.String name, RoutineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Routine(java.lang.String name, RoutineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/routine:Routine", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Routine(java.lang.String name, Output<java.lang.String> id, @Nullable RoutineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/routine:Routine", name, state, makeResourceOptions(options, id), false);
    }

    private static RoutineArgs makeArgs(RoutineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RoutineArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Routine get(java.lang.String name, Output<java.lang.String> id, @Nullable RoutineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Routine(name, id, state, options);
    }
}
