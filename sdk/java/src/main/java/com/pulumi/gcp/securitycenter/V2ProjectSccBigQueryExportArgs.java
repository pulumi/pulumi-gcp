// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2ProjectSccBigQueryExportArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2ProjectSccBigQueryExportArgs Empty = new V2ProjectSccBigQueryExportArgs();

    /**
     * This must be unique within the organization.
     * 
     */
    @Import(name="bigQueryExportId", required=true)
    private Output<String> bigQueryExportId;

    /**
     * @return This must be unique within the organization.
     * 
     */
    public Output<String> bigQueryExportId() {
        return this.bigQueryExportId;
    }

    /**
     * The dataset to write findings&#39; updates to.
     * Its format is &#34;projects/[projectId]/datasets/[bigquery_dataset_id]&#34;.
     * BigQuery Dataset unique ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
     * 
     */
    @Import(name="dataset")
    private @Nullable Output<String> dataset;

    /**
     * @return The dataset to write findings&#39; updates to.
     * Its format is &#34;projects/[projectId]/datasets/[bigquery_dataset_id]&#34;.
     * BigQuery Dataset unique ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
     * 
     */
    public Optional<Output<String>> dataset() {
        return Optional.ofNullable(this.dataset);
    }

    /**
     * The description of the notification config (max of 1024 characters).
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the notification config (max of 1024 characters).
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
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
     * * &gt; , &lt;, &gt;=, &lt;= for integer values.
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
    @Import(name="filter")
    private @Nullable Output<String> filter;

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
     * * &gt; , &lt;, &gt;=, &lt;= for integer values.
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
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * location Id is provided by organization. If not provided, Use global as default.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return location Id is provided by organization. If not provided, Use global as default.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private V2ProjectSccBigQueryExportArgs() {}

    private V2ProjectSccBigQueryExportArgs(V2ProjectSccBigQueryExportArgs $) {
        this.bigQueryExportId = $.bigQueryExportId;
        this.dataset = $.dataset;
        this.description = $.description;
        this.filter = $.filter;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2ProjectSccBigQueryExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2ProjectSccBigQueryExportArgs $;

        public Builder() {
            $ = new V2ProjectSccBigQueryExportArgs();
        }

        public Builder(V2ProjectSccBigQueryExportArgs defaults) {
            $ = new V2ProjectSccBigQueryExportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bigQueryExportId This must be unique within the organization.
         * 
         * @return builder
         * 
         */
        public Builder bigQueryExportId(Output<String> bigQueryExportId) {
            $.bigQueryExportId = bigQueryExportId;
            return this;
        }

        /**
         * @param bigQueryExportId This must be unique within the organization.
         * 
         * @return builder
         * 
         */
        public Builder bigQueryExportId(String bigQueryExportId) {
            return bigQueryExportId(Output.of(bigQueryExportId));
        }

        /**
         * @param dataset The dataset to write findings&#39; updates to.
         * Its format is &#34;projects/[projectId]/datasets/[bigquery_dataset_id]&#34;.
         * BigQuery Dataset unique ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
         * 
         * @return builder
         * 
         */
        public Builder dataset(@Nullable Output<String> dataset) {
            $.dataset = dataset;
            return this;
        }

        /**
         * @param dataset The dataset to write findings&#39; updates to.
         * Its format is &#34;projects/[projectId]/datasets/[bigquery_dataset_id]&#34;.
         * BigQuery Dataset unique ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
         * 
         * @return builder
         * 
         */
        public Builder dataset(String dataset) {
            return dataset(Output.of(dataset));
        }

        /**
         * @param description The description of the notification config (max of 1024 characters).
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the notification config (max of 1024 characters).
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param filter Expression that defines the filter to apply across create/update
         * events of findings. The
         * expression is a list of zero or more restrictions combined via
         * logical operators AND and OR. Parentheses are supported, and OR
         * has higher precedence than AND.
         * Restrictions have the form &lt;field&gt; &lt;operator&gt; &lt;value&gt; and may have
         * a - character in front of them to indicate negation. The fields
         * map to those defined in the corresponding resource.
         * The supported operators are:
         * * = for all value types.
         * * &gt; , &lt;, &gt;=, &lt;= for integer values.
         * * :, meaning substring matching, for strings.
         *   The supported value types are:
         * * string literals in quotes.
         * * integer literals without quotes.
         * * boolean literals true and false without quotes.
         *   See
         *   [Filtering notifications](https://cloud.google.com/security-command-center/docs/how-to-api-filter-notifications)
         *   for information on how to write a filter.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Expression that defines the filter to apply across create/update
         * events of findings. The
         * expression is a list of zero or more restrictions combined via
         * logical operators AND and OR. Parentheses are supported, and OR
         * has higher precedence than AND.
         * Restrictions have the form &lt;field&gt; &lt;operator&gt; &lt;value&gt; and may have
         * a - character in front of them to indicate negation. The fields
         * map to those defined in the corresponding resource.
         * The supported operators are:
         * * = for all value types.
         * * &gt; , &lt;, &gt;=, &lt;= for integer values.
         * * :, meaning substring matching, for strings.
         *   The supported value types are:
         * * string literals in quotes.
         * * integer literals without quotes.
         * * boolean literals true and false without quotes.
         *   See
         *   [Filtering notifications](https://cloud.google.com/security-command-center/docs/how-to-api-filter-notifications)
         *   for information on how to write a filter.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param location location Id is provided by organization. If not provided, Use global as default.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location location Id is provided by organization. If not provided, Use global as default.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public V2ProjectSccBigQueryExportArgs build() {
            if ($.bigQueryExportId == null) {
                throw new MissingRequiredPropertyException("V2ProjectSccBigQueryExportArgs", "bigQueryExportId");
            }
            return $;
        }
    }

}
