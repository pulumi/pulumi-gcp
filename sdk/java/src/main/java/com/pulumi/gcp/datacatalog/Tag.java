// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.datacatalog.TagArgs;
import com.pulumi.gcp.datacatalog.inputs.TagState;
import com.pulumi.gcp.datacatalog.outputs.TagField;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **Warning:** `gcp.datacatalog.Tag` is deprecated and will be removed in a future major release. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
 * 
 * Tags are used to attach custom metadata to Data Catalog resources. Tags conform to the specifications within their tag template.
 * 
 * See [Data Catalog IAM](https://cloud.google.com/data-catalog/docs/concepts/iam) for information on the permissions needed to create or view tags.
 * 
 * To get more information about Tag, see:
 * 
 * * [API documentation](https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.entryGroups.tags)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/data-catalog/docs)
 * 
 * ## Example Usage
 * 
 * ### Data Catalog Entry Tag Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.datacatalog.EntryGroup;
 * import com.pulumi.gcp.datacatalog.EntryGroupArgs;
 * import com.pulumi.gcp.datacatalog.Entry;
 * import com.pulumi.gcp.datacatalog.EntryArgs;
 * import com.pulumi.gcp.datacatalog.TagTemplate;
 * import com.pulumi.gcp.datacatalog.TagTemplateArgs;
 * import com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldArgs;
 * import com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeArgs;
 * import com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeArgs;
 * import com.pulumi.gcp.datacatalog.Tag;
 * import com.pulumi.gcp.datacatalog.TagArgs;
 * import com.pulumi.gcp.datacatalog.inputs.TagFieldArgs;
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
 *         var entryGroup = new EntryGroup("entryGroup", EntryGroupArgs.builder()
 *             .entryGroupId("my_entry_group")
 *             .build());
 * 
 *         var entry = new Entry("entry", EntryArgs.builder()
 *             .entryGroup(entryGroup.id())
 *             .entryId("my_entry")
 *             .userSpecifiedType("my_custom_type")
 *             .userSpecifiedSystem("SomethingExternal")
 *             .build());
 * 
 *         var tagTemplate = new TagTemplate("tagTemplate", TagTemplateArgs.builder()
 *             .tagTemplateId("my_template")
 *             .region("us-central1")
 *             .displayName("Demo Tag Template")
 *             .fields(            
 *                 TagTemplateFieldArgs.builder()
 *                     .fieldId("source")
 *                     .displayName("Source of data asset")
 *                     .type(TagTemplateFieldTypeArgs.builder()
 *                         .primitiveType("STRING")
 *                         .build())
 *                     .isRequired(true)
 *                     .build(),
 *                 TagTemplateFieldArgs.builder()
 *                     .fieldId("num_rows")
 *                     .displayName("Number of rows in the data asset")
 *                     .type(TagTemplateFieldTypeArgs.builder()
 *                         .primitiveType("DOUBLE")
 *                         .build())
 *                     .build(),
 *                 TagTemplateFieldArgs.builder()
 *                     .fieldId("pii_type")
 *                     .displayName("PII type")
 *                     .type(TagTemplateFieldTypeArgs.builder()
 *                         .enumType(TagTemplateFieldTypeEnumTypeArgs.builder()
 *                             .allowedValues(                            
 *                                 TagTemplateFieldTypeEnumTypeAllowedValueArgs.builder()
 *                                     .displayName("EMAIL")
 *                                     .build(),
 *                                 TagTemplateFieldTypeEnumTypeAllowedValueArgs.builder()
 *                                     .displayName("SOCIAL SECURITY NUMBER")
 *                                     .build(),
 *                                 TagTemplateFieldTypeEnumTypeAllowedValueArgs.builder()
 *                                     .displayName("NONE")
 *                                     .build())
 *                             .build())
 *                         .build())
 *                     .build())
 *             .forceDelete(false)
 *             .build());
 * 
 *         var basicTag = new Tag("basicTag", TagArgs.builder()
 *             .parent(entry.id())
 *             .template(tagTemplate.id())
 *             .fields(TagFieldArgs.builder()
 *                 .fieldName("source")
 *                 .stringValue("my-string")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Data Catalog Entry Group Tag
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.datacatalog.EntryGroup;
 * import com.pulumi.gcp.datacatalog.EntryGroupArgs;
 * import com.pulumi.gcp.datacatalog.Entry;
 * import com.pulumi.gcp.datacatalog.EntryArgs;
 * import com.pulumi.gcp.datacatalog.TagTemplate;
 * import com.pulumi.gcp.datacatalog.TagTemplateArgs;
 * import com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldArgs;
 * import com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeArgs;
 * import com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeArgs;
 * import com.pulumi.gcp.datacatalog.Tag;
 * import com.pulumi.gcp.datacatalog.TagArgs;
 * import com.pulumi.gcp.datacatalog.inputs.TagFieldArgs;
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
 *         var entryGroup = new EntryGroup("entryGroup", EntryGroupArgs.builder()
 *             .entryGroupId("my_entry_group")
 *             .build());
 * 
 *         var firstEntry = new Entry("firstEntry", EntryArgs.builder()
 *             .entryGroup(entryGroup.id())
 *             .entryId("first_entry")
 *             .userSpecifiedType("my_custom_type")
 *             .userSpecifiedSystem("SomethingExternal")
 *             .build());
 * 
 *         var secondEntry = new Entry("secondEntry", EntryArgs.builder()
 *             .entryGroup(entryGroup.id())
 *             .entryId("second_entry")
 *             .userSpecifiedType("another_custom_type")
 *             .userSpecifiedSystem("SomethingElseExternal")
 *             .build());
 * 
 *         var tagTemplate = new TagTemplate("tagTemplate", TagTemplateArgs.builder()
 *             .tagTemplateId("my_template")
 *             .region("us-central1")
 *             .displayName("Demo Tag Template")
 *             .fields(            
 *                 TagTemplateFieldArgs.builder()
 *                     .fieldId("source")
 *                     .displayName("Source of data asset")
 *                     .type(TagTemplateFieldTypeArgs.builder()
 *                         .primitiveType("STRING")
 *                         .build())
 *                     .isRequired(true)
 *                     .build(),
 *                 TagTemplateFieldArgs.builder()
 *                     .fieldId("num_rows")
 *                     .displayName("Number of rows in the data asset")
 *                     .type(TagTemplateFieldTypeArgs.builder()
 *                         .primitiveType("DOUBLE")
 *                         .build())
 *                     .build(),
 *                 TagTemplateFieldArgs.builder()
 *                     .fieldId("pii_type")
 *                     .displayName("PII type")
 *                     .type(TagTemplateFieldTypeArgs.builder()
 *                         .enumType(TagTemplateFieldTypeEnumTypeArgs.builder()
 *                             .allowedValues(                            
 *                                 TagTemplateFieldTypeEnumTypeAllowedValueArgs.builder()
 *                                     .displayName("EMAIL")
 *                                     .build(),
 *                                 TagTemplateFieldTypeEnumTypeAllowedValueArgs.builder()
 *                                     .displayName("SOCIAL SECURITY NUMBER")
 *                                     .build(),
 *                                 TagTemplateFieldTypeEnumTypeAllowedValueArgs.builder()
 *                                     .displayName("NONE")
 *                                     .build())
 *                             .build())
 *                         .build())
 *                     .build())
 *             .forceDelete(false)
 *             .build());
 * 
 *         var entryGroupTag = new Tag("entryGroupTag", TagArgs.builder()
 *             .parent(entryGroup.id())
 *             .template(tagTemplate.id())
 *             .fields(TagFieldArgs.builder()
 *                 .fieldName("source")
 *                 .stringValue("my-string")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Data Catalog Entry Tag Full
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.datacatalog.EntryGroup;
 * import com.pulumi.gcp.datacatalog.EntryGroupArgs;
 * import com.pulumi.gcp.datacatalog.Entry;
 * import com.pulumi.gcp.datacatalog.EntryArgs;
 * import com.pulumi.gcp.datacatalog.TagTemplate;
 * import com.pulumi.gcp.datacatalog.TagTemplateArgs;
 * import com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldArgs;
 * import com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeArgs;
 * import com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeArgs;
 * import com.pulumi.gcp.datacatalog.Tag;
 * import com.pulumi.gcp.datacatalog.TagArgs;
 * import com.pulumi.gcp.datacatalog.inputs.TagFieldArgs;
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
 *         var entryGroup = new EntryGroup("entryGroup", EntryGroupArgs.builder()
 *             .entryGroupId("my_entry_group")
 *             .build());
 * 
 *         var entry = new Entry("entry", EntryArgs.builder()
 *             .entryGroup(entryGroup.id())
 *             .entryId("my_entry")
 *             .userSpecifiedType("my_custom_type")
 *             .userSpecifiedSystem("SomethingExternal")
 *             .schema("""
 * {
 *   "columns": [
 *     {
 *       "column": "first_name",
 *       "description": "First name",
 *       "mode": "REQUIRED",
 *       "type": "STRING"
 *     },
 *     {
 *       "column": "last_name",
 *       "description": "Last name",
 *       "mode": "REQUIRED",
 *       "type": "STRING"
 *     },
 *     {
 *       "column": "address",
 *       "description": "Address",
 *       "mode": "REPEATED",
 *       "subcolumns": [
 *         {
 *           "column": "city",
 *           "description": "City",
 *           "mode": "NULLABLE",
 *           "type": "STRING"
 *         },
 *         {
 *           "column": "state",
 *           "description": "State",
 *           "mode": "NULLABLE",
 *           "type": "STRING"
 *         }
 *       ],
 *       "type": "RECORD"
 *     }
 *   ]
 * }
 *             """)
 *             .build());
 * 
 *         var tagTemplate = new TagTemplate("tagTemplate", TagTemplateArgs.builder()
 *             .tagTemplateId("my_template")
 *             .region("us-central1")
 *             .displayName("Demo Tag Template")
 *             .fields(            
 *                 TagTemplateFieldArgs.builder()
 *                     .fieldId("source")
 *                     .displayName("Source of data asset")
 *                     .type(TagTemplateFieldTypeArgs.builder()
 *                         .primitiveType("STRING")
 *                         .build())
 *                     .isRequired(true)
 *                     .build(),
 *                 TagTemplateFieldArgs.builder()
 *                     .fieldId("num_rows")
 *                     .displayName("Number of rows in the data asset")
 *                     .type(TagTemplateFieldTypeArgs.builder()
 *                         .primitiveType("DOUBLE")
 *                         .build())
 *                     .build(),
 *                 TagTemplateFieldArgs.builder()
 *                     .fieldId("pii_type")
 *                     .displayName("PII type")
 *                     .type(TagTemplateFieldTypeArgs.builder()
 *                         .enumType(TagTemplateFieldTypeEnumTypeArgs.builder()
 *                             .allowedValues(                            
 *                                 TagTemplateFieldTypeEnumTypeAllowedValueArgs.builder()
 *                                     .displayName("EMAIL")
 *                                     .build(),
 *                                 TagTemplateFieldTypeEnumTypeAllowedValueArgs.builder()
 *                                     .displayName("SOCIAL SECURITY NUMBER")
 *                                     .build(),
 *                                 TagTemplateFieldTypeEnumTypeAllowedValueArgs.builder()
 *                                     .displayName("NONE")
 *                                     .build())
 *                             .build())
 *                         .build())
 *                     .build())
 *             .forceDelete(false)
 *             .build());
 * 
 *         var basicTag = new Tag("basicTag", TagArgs.builder()
 *             .parent(entry.id())
 *             .template(tagTemplate.id())
 *             .fields(            
 *                 TagFieldArgs.builder()
 *                     .fieldName("source")
 *                     .stringValue("my-string")
 *                     .build(),
 *                 TagFieldArgs.builder()
 *                     .fieldName("num_rows")
 *                     .doubleValue(5.0)
 *                     .build(),
 *                 TagFieldArgs.builder()
 *                     .fieldName("pii_type")
 *                     .enumValue("EMAIL")
 *                     .build())
 *             .column("address")
 *             .build());
 * 
 *         var second_tag = new Tag("second-tag", TagArgs.builder()
 *             .parent(entry.id())
 *             .template(tagTemplate.id())
 *             .fields(            
 *                 TagFieldArgs.builder()
 *                     .fieldName("source")
 *                     .stringValue("my-string")
 *                     .build(),
 *                 TagFieldArgs.builder()
 *                     .fieldName("pii_type")
 *                     .enumValue("NONE")
 *                     .build())
 *             .column("first_name")
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
 * Tag can be imported using any of these accepted formats:
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, Tag can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:datacatalog/tag:Tag default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:datacatalog/tag:Tag")
public class Tag extends com.pulumi.resources.CustomResource {
    /**
     * Resources like Entry can have schemas associated with them. This scope allows users to attach tags to an
     * individual column based on that schema.
     * For attaching a tag to a nested column, use `.` to separate the column names. Example:
     * `outer_column.inner_column`
     * 
     */
    @Export(name="column", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> column;

    /**
     * @return Resources like Entry can have schemas associated with them. This scope allows users to attach tags to an
     * individual column based on that schema.
     * For attaching a tag to a nested column, use `.` to separate the column names. Example:
     * `outer_column.inner_column`
     * 
     */
    public Output<Optional<String>> column() {
        return Codegen.optional(this.column);
    }
    /**
     * This maps the ID of a tag field to the value of and additional information about that field.
     * Valid field IDs are defined by the tag&#39;s template. A tag must have at least 1 field and at most 500 fields.
     * Structure is documented below.
     * 
     */
    @Export(name="fields", refs={List.class,TagField.class}, tree="[0,1]")
    private Output<List<TagField>> fields;

    /**
     * @return This maps the ID of a tag field to the value of and additional information about that field.
     * Valid field IDs are defined by the tag&#39;s template. A tag must have at least 1 field and at most 500 fields.
     * Structure is documented below.
     * 
     */
    public Output<List<TagField>> fields() {
        return this.fields;
    }
    /**
     * The resource name of the tag in URL format. Example:
     * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/entries/{entryId}/tags/{tag_id} or
     * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/tags/{tag_id}
     * where tag_id is a system-generated identifier. Note that this Tag may not actually be stored in the location in this name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name of the tag in URL format. Example:
     * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/entries/{entryId}/tags/{tag_id} or
     * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/tags/{tag_id}
     * where tag_id is a system-generated identifier. Note that this Tag may not actually be stored in the location in this name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the parent this tag is attached to. This can be the name of an entry or an entry group. If an entry group, the tag will be attached to
     * all entries in that group.
     * 
     */
    @Export(name="parent", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> parent;

    /**
     * @return The name of the parent this tag is attached to. This can be the name of an entry or an entry group. If an entry group, the tag will be attached to
     * all entries in that group.
     * 
     */
    public Output<Optional<String>> parent() {
        return Codegen.optional(this.parent);
    }
    /**
     * The resource name of the tag template that this tag uses. Example:
     * projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}
     * This field cannot be modified after creation.
     * 
     */
    @Export(name="template", refs={String.class}, tree="[0]")
    private Output<String> template;

    /**
     * @return The resource name of the tag template that this tag uses. Example:
     * projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}
     * This field cannot be modified after creation.
     * 
     */
    public Output<String> template() {
        return this.template;
    }
    /**
     * The display name of the tag template.
     * 
     */
    @Export(name="templateDisplayname", refs={String.class}, tree="[0]")
    private Output<String> templateDisplayname;

    /**
     * @return The display name of the tag template.
     * 
     */
    public Output<String> templateDisplayname() {
        return this.templateDisplayname;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Tag(java.lang.String name) {
        this(name, TagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Tag(java.lang.String name, TagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Tag(java.lang.String name, TagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/tag:Tag", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Tag(java.lang.String name, Output<java.lang.String> id, @Nullable TagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/tag:Tag", name, state, makeResourceOptions(options, id), false);
    }

    private static TagArgs makeArgs(TagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TagArgs.Empty : args;
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
    public static Tag get(java.lang.String name, Output<java.lang.String> id, @Nullable TagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Tag(name, id, state, options);
    }
}
