// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.vertex.AiDatasetArgs;
import com.pulumi.gcp.vertex.inputs.AiDatasetState;
import com.pulumi.gcp.vertex.outputs.AiDatasetEncryptionSpec;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A collection of DataItems and Annotations on them.
 * 
 * To get more information about Dataset, see:
 * 
 * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.datasets)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
 * 
 * ## Example Usage
 * ### Vertex Ai Dataset
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var dataset = new AiDataset(&#34;dataset&#34;, AiDatasetArgs.builder()        
 *             .displayName(&#34;terraform&#34;)
 *             .metadataSchemaUri(&#34;gs://google-cloud-aiplatform/schema/dataset/metadata/image_1.0.0.yaml&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:vertex/aiDataset:AiDataset")
public class AiDataset extends com.pulumi.resources.CustomResource {
    /**
     * The timestamp of when the dataset was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
     * fractional digits.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp of when the dataset was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
     * fractional digits.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The user-defined name of the Dataset. The name can be up to 128 characters long and can be consist of any UTF-8 characters.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The user-defined name of the Dataset. The name can be up to 128 characters long and can be consist of any UTF-8 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Customer-managed encryption key spec for a Dataset. If set, this Dataset and all sub-resources of this Dataset will be secured by this key.
     * Structure is documented below.
     * 
     */
    @Export(name="encryptionSpec", type=AiDatasetEncryptionSpec.class, parameters={})
    private Output</* @Nullable */ AiDatasetEncryptionSpec> encryptionSpec;

    /**
     * @return Customer-managed encryption key spec for a Dataset. If set, this Dataset and all sub-resources of this Dataset will be secured by this key.
     * Structure is documented below.
     * 
     */
    public Output<Optional<AiDatasetEncryptionSpec>> encryptionSpec() {
        return Codegen.optional(this.encryptionSpec);
    }
    /**
     * A set of key/value label pairs to assign to this Workflow.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs to assign to this Workflow.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Points to a YAML file stored on Google Cloud Storage describing additional information about the Dataset. The schema is defined as an OpenAPI 3.0.2 Schema Object. The schema files that can be used here are found in gs://google-cloud-aiplatform/schema/dataset/metadata/.
     * 
     */
    @Export(name="metadataSchemaUri", type=String.class, parameters={})
    private Output<String> metadataSchemaUri;

    /**
     * @return Points to a YAML file stored on Google Cloud Storage describing additional information about the Dataset. The schema is defined as an OpenAPI 3.0.2 Schema Object. The schema files that can be used here are found in gs://google-cloud-aiplatform/schema/dataset/metadata/.
     * 
     */
    public Output<String> metadataSchemaUri() {
        return this.metadataSchemaUri;
    }
    /**
     * The resource name of the Dataset. This value is set by Google.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the Dataset. This value is set by Google.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
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
     * The region of the dataset. eg us-central1
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region of the dataset. eg us-central1
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The timestamp of when the dataset was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to
     * nine fractional digits.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp of when the dataset was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to
     * nine fractional digits.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AiDataset(String name) {
        this(name, AiDatasetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AiDataset(String name, AiDatasetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AiDataset(String name, AiDatasetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiDataset:AiDataset", name, args == null ? AiDatasetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AiDataset(String name, Output<String> id, @Nullable AiDatasetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiDataset:AiDataset", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static AiDataset get(String name, Output<String> id, @Nullable AiDatasetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AiDataset(name, id, state, options);
    }
}