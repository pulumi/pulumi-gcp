// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class WorkflowTemplateJobSparkSqlJobQueryListArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobSparkSqlJobQueryListArgs Empty = new WorkflowTemplateJobSparkSqlJobQueryListArgs();

    /**
     * Required. The queries to execute. You do not need to end a query expression with a semicolon. Multiple queries can be specified in one string by separating each with a semicolon. Here is an example of a Dataproc API snippet that uses a QueryList to specify a HiveJob: &#34;hiveJob&#34;: { &#34;queryList&#34;: { &#34;queries&#34;: } }
     * 
     */
    @Import(name="queries", required=true)
    private Output<List<String>> queries;

    /**
     * @return Required. The queries to execute. You do not need to end a query expression with a semicolon. Multiple queries can be specified in one string by separating each with a semicolon. Here is an example of a Dataproc API snippet that uses a QueryList to specify a HiveJob: &#34;hiveJob&#34;: { &#34;queryList&#34;: { &#34;queries&#34;: } }
     * 
     */
    public Output<List<String>> queries() {
        return this.queries;
    }

    private WorkflowTemplateJobSparkSqlJobQueryListArgs() {}

    private WorkflowTemplateJobSparkSqlJobQueryListArgs(WorkflowTemplateJobSparkSqlJobQueryListArgs $) {
        this.queries = $.queries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplateJobSparkSqlJobQueryListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplateJobSparkSqlJobQueryListArgs $;

        public Builder() {
            $ = new WorkflowTemplateJobSparkSqlJobQueryListArgs();
        }

        public Builder(WorkflowTemplateJobSparkSqlJobQueryListArgs defaults) {
            $ = new WorkflowTemplateJobSparkSqlJobQueryListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param queries Required. The queries to execute. You do not need to end a query expression with a semicolon. Multiple queries can be specified in one string by separating each with a semicolon. Here is an example of a Dataproc API snippet that uses a QueryList to specify a HiveJob: &#34;hiveJob&#34;: { &#34;queryList&#34;: { &#34;queries&#34;: } }
         * 
         * @return builder
         * 
         */
        public Builder queries(Output<List<String>> queries) {
            $.queries = queries;
            return this;
        }

        /**
         * @param queries Required. The queries to execute. You do not need to end a query expression with a semicolon. Multiple queries can be specified in one string by separating each with a semicolon. Here is an example of a Dataproc API snippet that uses a QueryList to specify a HiveJob: &#34;hiveJob&#34;: { &#34;queryList&#34;: { &#34;queries&#34;: } }
         * 
         * @return builder
         * 
         */
        public Builder queries(List<String> queries) {
            return queries(Output.of(queries));
        }

        /**
         * @param queries Required. The queries to execute. You do not need to end a query expression with a semicolon. Multiple queries can be specified in one string by separating each with a semicolon. Here is an example of a Dataproc API snippet that uses a QueryList to specify a HiveJob: &#34;hiveJob&#34;: { &#34;queryList&#34;: { &#34;queries&#34;: } }
         * 
         * @return builder
         * 
         */
        public Builder queries(String... queries) {
            return queries(List.of(queries));
        }

        public WorkflowTemplateJobSparkSqlJobQueryListArgs build() {
            $.queries = Objects.requireNonNull($.queries, "expected parameter 'queries' to be non-null");
            return $;
        }
    }

}