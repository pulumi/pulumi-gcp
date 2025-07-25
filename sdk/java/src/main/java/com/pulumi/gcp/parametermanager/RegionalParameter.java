// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.parametermanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.parametermanager.RegionalParameterArgs;
import com.pulumi.gcp.parametermanager.inputs.RegionalParameterState;
import com.pulumi.gcp.parametermanager.outputs.RegionalParameterPolicyMember;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Regional Parameter is a logical regional parameter.
 * 
 * To get more information about RegionalParameter, see:
 * 
 * * [API documentation](https://cloud.google.com/secret-manager/parameter-manager/docs/reference/rest/v1/projects.locations.parameters)
 * 
 * ## Example Usage
 * 
 * ### Regional Parameter Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.parametermanager.RegionalParameter;
 * import com.pulumi.gcp.parametermanager.RegionalParameterArgs;
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
 *         var regional_parameter_basic = new RegionalParameter("regional-parameter-basic", RegionalParameterArgs.builder()
 *             .parameterId("regional_parameter")
 *             .location("us-central1")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Regional Parameter With Format
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.parametermanager.RegionalParameter;
 * import com.pulumi.gcp.parametermanager.RegionalParameterArgs;
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
 *         var regional_parameter_with_format = new RegionalParameter("regional-parameter-with-format", RegionalParameterArgs.builder()
 *             .parameterId("regional_parameter")
 *             .location("us-central1")
 *             .format("JSON")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Regional Parameter With Labels
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.parametermanager.RegionalParameter;
 * import com.pulumi.gcp.parametermanager.RegionalParameterArgs;
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
 *         var regional_parameter_with_labels = new RegionalParameter("regional-parameter-with-labels", RegionalParameterArgs.builder()
 *             .parameterId("regional_parameter")
 *             .location("us-central1")
 *             .labels(Map.ofEntries(
 *                 Map.entry("key1", "val1"),
 *                 Map.entry("key2", "val2"),
 *                 Map.entry("key3", "val3"),
 *                 Map.entry("key4", "val4"),
 *                 Map.entry("key5", "val5")
 *             ))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Regional Parameter With Kms Key
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
 * import com.pulumi.gcp.parametermanager.RegionalParameter;
 * import com.pulumi.gcp.parametermanager.RegionalParameterArgs;
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
 *         final var project = OrganizationsFunctions.getProject(GetProjectArgs.builder()
 *             .build());
 * 
 *         var regional_parameter_with_kms_key = new RegionalParameter("regional-parameter-with-kms-key", RegionalParameterArgs.builder()
 *             .parameterId("regional_parameter")
 *             .location("us-central1")
 *             .kmsKey("kms-key")
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
 * RegionalParameter can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/parameters/{{parameter_id}}`
 * 
 * * `{{project}}/{{location}}/{{parameter_id}}`
 * 
 * * `{{location}}/{{parameter_id}}`
 * 
 * When using the `pulumi import` command, RegionalParameter can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:parametermanager/regionalParameter:RegionalParameter default projects/{{project}}/locations/{{location}}/parameters/{{parameter_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:parametermanager/regionalParameter:RegionalParameter default {{project}}/{{location}}/{{parameter_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:parametermanager/regionalParameter:RegionalParameter default {{location}}/{{parameter_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:parametermanager/regionalParameter:RegionalParameter")
public class RegionalParameter extends com.pulumi.resources.CustomResource {
    /**
     * The time at which the regional Parameter was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The time at which the regional Parameter was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
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
     * The format type of the regional parameter.
     * Default value is `UNFORMATTED`.
     * Possible values are: `UNFORMATTED`, `YAML`, `JSON`.
     * 
     */
    @Export(name="format", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> format;

    /**
     * @return The format type of the regional parameter.
     * Default value is `UNFORMATTED`.
     * Possible values are: `UNFORMATTED`, `YAML`, `JSON`.
     * 
     */
    public Output<Optional<String>> format() {
        return Codegen.optional(this.format);
    }
    /**
     * The resource name of the Cloud KMS CryptoKey used to encrypt regional parameter version payload. Format
     * `projects/{{project}}/locations/{{location}}/keyRings/{{key_ring}}/cryptoKeys/{{crypto_key}}`
     * 
     */
    @Export(name="kmsKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kmsKey;

    /**
     * @return The resource name of the Cloud KMS CryptoKey used to encrypt regional parameter version payload. Format
     * `projects/{{project}}/locations/{{location}}/keyRings/{{key_ring}}/cryptoKeys/{{crypto_key}}`
     * 
     */
    public Output<Optional<String>> kmsKey() {
        return Codegen.optional(this.kmsKey);
    }
    /**
     * The labels assigned to this regional Parameter.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
     * and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
     * and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be assigned to a given resource.
     * An object containing a list of &#34;key&#34;: value pairs. Example:
     * { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return The labels assigned to this regional Parameter.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
     * and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
     * and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be assigned to a given resource.
     * An object containing a list of &#34;key&#34;: value pairs. Example:
     * { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The location of the regional parameter. eg us-central1
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location of the regional parameter. eg us-central1
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name of the regional Parameter. Format:
     * `projects/{{project}}/locations/{{location}}/parameters/{{parameter_id}}`
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name of the regional Parameter. Format:
     * `projects/{{project}}/locations/{{location}}/parameters/{{parameter_id}}`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * This must be unique within the project.
     * 
     */
    @Export(name="parameterId", refs={String.class}, tree="[0]")
    private Output<String> parameterId;

    /**
     * @return This must be unique within the project.
     * 
     */
    public Output<String> parameterId() {
        return this.parameterId;
    }
    /**
     * An object containing a unique resource identity tied to the regional parameter.
     * Structure is documented below.
     * 
     */
    @Export(name="policyMembers", refs={List.class,RegionalParameterPolicyMember.class}, tree="[0,1]")
    private Output<List<RegionalParameterPolicyMember>> policyMembers;

    /**
     * @return An object containing a unique resource identity tied to the regional parameter.
     * Structure is documented below.
     * 
     */
    public Output<List<RegionalParameterPolicyMember>> policyMembers() {
        return this.policyMembers;
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
     * The time at which the regional Parameter was updated.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return The time at which the regional Parameter was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionalParameter(java.lang.String name) {
        this(name, RegionalParameterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionalParameter(java.lang.String name, RegionalParameterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionalParameter(java.lang.String name, RegionalParameterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:parametermanager/regionalParameter:RegionalParameter", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RegionalParameter(java.lang.String name, Output<java.lang.String> id, @Nullable RegionalParameterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:parametermanager/regionalParameter:RegionalParameter", name, state, makeResourceOptions(options, id), false);
    }

    private static RegionalParameterArgs makeArgs(RegionalParameterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RegionalParameterArgs.Empty : args;
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
    public static RegionalParameter get(java.lang.String name, Output<java.lang.String> id, @Nullable RegionalParameterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegionalParameter(name, id, state, options);
    }
}
