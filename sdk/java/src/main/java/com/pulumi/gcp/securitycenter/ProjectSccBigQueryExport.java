// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.securitycenter.ProjectSccBigQueryExportArgs;
import com.pulumi.gcp.securitycenter.inputs.ProjectSccBigQueryExportState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Cloud Security Command Center (Cloud SCC) Big Query Export Config.
 * It represents exporting Security Command Center data, including assets, findings, and security marks
 * using gcloud scc bqexports
 * &gt; **Note:** In order to use Cloud SCC resources, your organization must be enrolled
 * in [SCC Standard/Premium](https://cloud.google.com/security-command-center/docs/quickstart-security-command-center).
 * Without doing so, you may run into errors during resource creation.
 * 
 * To get more information about ProjectSccBigQueryExport, see:
 * 
 * * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/projects.bigQueryExports)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/security-command-center/docs/how-to-analyze-findings-in-big-query)
 * 
 * ## Example Usage
 * 
 * ### Scc Project Big Query Export Config Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ProjectSccBigQueryExport can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/bigQueryExports/{{big_query_export_id}}`
 * 
 * * `{{project}}/{{big_query_export_id}}`
 * 
 * * `{{big_query_export_id}}`
 * 
 * When using the `pulumi import` command, ProjectSccBigQueryExport can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:securitycenter/projectSccBigQueryExport:ProjectSccBigQueryExport default projects/{{project}}/bigQueryExports/{{big_query_export_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:securitycenter/projectSccBigQueryExport:ProjectSccBigQueryExport default {{project}}/{{big_query_export_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:securitycenter/projectSccBigQueryExport:ProjectSccBigQueryExport default {{big_query_export_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:securitycenter/projectSccBigQueryExport:ProjectSccBigQueryExport")
public class ProjectSccBigQueryExport extends com.pulumi.resources.CustomResource {
    /**
     * This must be unique within the organization.
     * 
     */
    @Export(name="bigQueryExportId", refs={String.class}, tree="[0]")
    private Output<String> bigQueryExportId;

    /**
     * @return This must be unique within the organization.
     * 
     */
    public Output<String> bigQueryExportId() {
        return this.bigQueryExportId;
    }
    /**
     * The time at which the BigQuery export was created. This field is set by the server and will be ignored if provided on export on creation.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The time at which the BigQuery export was created. This field is set by the server and will be ignored if provided on export on creation.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The dataset to write findings&#39; updates to.
     * Its format is &#34;projects/[projectId]/datasets/[bigquery_dataset_id]&#34;.
     * BigQuery Dataset unique ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
     * 
     */
    @Export(name="dataset", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dataset;

    /**
     * @return The dataset to write findings&#39; updates to.
     * Its format is &#34;projects/[projectId]/datasets/[bigquery_dataset_id]&#34;.
     * BigQuery Dataset unique ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
     * 
     */
    public Output<Optional<String>> dataset() {
        return Codegen.optional(this.dataset);
    }
    /**
     * The description of the notification config (max of 1024 characters).
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the notification config (max of 1024 characters).
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Expression that defines the filter to apply across create/update
     * events of findings. The
     * expression is a list of zero or more restrictions combined via
     * logical operators AND and OR. Parentheses are supported, and OR
     * has higher precedence than AND.
     * Restrictions have the form &lt;field&gt; &lt;operator&gt; &lt;value&gt; and may have
     * a - character in front of them to indicate negation. The fields
     * map to those defined in the corresponding resource.
     * The supported operators are:
     * * = for all value types.
     * * \&gt;, &lt;, &gt;=, &lt;= for integer values.
     * * :, meaning substring matching, for strings.
     *   The supported value types are:
     * * string literals in quotes.
     * * integer literals without quotes.
     * * boolean literals true and false without quotes.
     *   See
     *   [Filtering notifications](https://cloud.google.com/security-command-center/docs/how-to-api-filter-notifications)
     *   for information on how to write a filter.
     * 
     */
    @Export(name="filter", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> filter;

    /**
     * @return Expression that defines the filter to apply across create/update
     * events of findings. The
     * expression is a list of zero or more restrictions combined via
     * logical operators AND and OR. Parentheses are supported, and OR
     * has higher precedence than AND.
     * Restrictions have the form &lt;field&gt; &lt;operator&gt; &lt;value&gt; and may have
     * a - character in front of them to indicate negation. The fields
     * map to those defined in the corresponding resource.
     * The supported operators are:
     * * = for all value types.
     * * \&gt;, &lt;, &gt;=, &lt;= for integer values.
     * * :, meaning substring matching, for strings.
     *   The supported value types are:
     * * string literals in quotes.
     * * integer literals without quotes.
     * * boolean literals true and false without quotes.
     *   See
     *   [Filtering notifications](https://cloud.google.com/security-command-center/docs/how-to-api-filter-notifications)
     *   for information on how to write a filter.
     * 
     */
    public Output<Optional<String>> filter() {
        return Codegen.optional(this.filter);
    }
    /**
     * Email address of the user who last edited the BigQuery export.
     * This field is set by the server and will be ignored if provided on export creation or update.
     * 
     */
    @Export(name="mostRecentEditor", refs={String.class}, tree="[0]")
    private Output<String> mostRecentEditor;

    /**
     * @return Email address of the user who last edited the BigQuery export.
     * This field is set by the server and will be ignored if provided on export creation or update.
     * 
     */
    public Output<String> mostRecentEditor() {
        return this.mostRecentEditor;
    }
    /**
     * The resource name of this export, in the format
     * `projects/{{project}}/bigQueryExports/{{big_query_export_id}}`.
     * This field is provided in responses, and is ignored when provided in create requests.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name of this export, in the format
     * `projects/{{project}}/bigQueryExports/{{big_query_export_id}}`.
     * This field is provided in responses, and is ignored when provided in create requests.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The service account that needs permission to create table and upload data to the BigQuery dataset.
     * 
     */
    @Export(name="principal", refs={String.class}, tree="[0]")
    private Output<String> principal;

    /**
     * @return The service account that needs permission to create table and upload data to the BigQuery dataset.
     * 
     */
    public Output<String> principal() {
        return this.principal;
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
     * The most recent time at which the BigQuery export was updated. This field is set by the server and will be ignored if provided on export creation or update.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return The most recent time at which the BigQuery export was updated. This field is set by the server and will be ignored if provided on export creation or update.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProjectSccBigQueryExport(java.lang.String name) {
        this(name, ProjectSccBigQueryExportArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProjectSccBigQueryExport(java.lang.String name, ProjectSccBigQueryExportArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectSccBigQueryExport(java.lang.String name, ProjectSccBigQueryExportArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:securitycenter/projectSccBigQueryExport:ProjectSccBigQueryExport", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ProjectSccBigQueryExport(java.lang.String name, Output<java.lang.String> id, @Nullable ProjectSccBigQueryExportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:securitycenter/projectSccBigQueryExport:ProjectSccBigQueryExport", name, state, makeResourceOptions(options, id), false);
    }

    private static ProjectSccBigQueryExportArgs makeArgs(ProjectSccBigQueryExportArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProjectSccBigQueryExportArgs.Empty : args;
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
    public static ProjectSccBigQueryExport get(java.lang.String name, Output<java.lang.String> id, @Nullable ProjectSccBigQueryExportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProjectSccBigQueryExport(name, id, state, options);
    }
}
