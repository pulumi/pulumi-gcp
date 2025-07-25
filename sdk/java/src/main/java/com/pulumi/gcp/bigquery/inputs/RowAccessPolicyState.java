// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RowAccessPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final RowAccessPolicyState Empty = new RowAccessPolicyState();

    /**
     * The time when this row access policy was created, in milliseconds since
     * the epoch.
     * 
     */
    @Import(name="creationTime")
    private @Nullable Output<String> creationTime;

    /**
     * @return The time when this row access policy was created, in milliseconds since
     * the epoch.
     * 
     */
    public Optional<Output<String>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    /**
     * The ID of the dataset containing this row access policy.
     * 
     */
    @Import(name="datasetId")
    private @Nullable Output<String> datasetId;

    /**
     * @return The ID of the dataset containing this row access policy.
     * 
     */
    public Optional<Output<String>> datasetId() {
        return Optional.ofNullable(this.datasetId);
    }

    /**
     * A SQL boolean expression that represents the rows defined by this row
     * access policy, similar to the boolean expression in a WHERE clause of a
     * SELECT query on a table.
     * References to other tables, routines, and temporary functions are not
     * supported.
     * Examples: region=&#34;EU&#34;
     * date_field = CAST(&#39;2019-9-27&#39; as DATE)
     * nullable_field is not NULL
     * numeric_field BETWEEN 1.0 AND 5.0
     * 
     */
    @Import(name="filterPredicate")
    private @Nullable Output<String> filterPredicate;

    /**
     * @return A SQL boolean expression that represents the rows defined by this row
     * access policy, similar to the boolean expression in a WHERE clause of a
     * SELECT query on a table.
     * References to other tables, routines, and temporary functions are not
     * supported.
     * Examples: region=&#34;EU&#34;
     * date_field = CAST(&#39;2019-9-27&#39; as DATE)
     * nullable_field is not NULL
     * numeric_field BETWEEN 1.0 AND 5.0
     * 
     */
    public Optional<Output<String>> filterPredicate() {
        return Optional.ofNullable(this.filterPredicate);
    }

    /**
     * Input only. The optional list of iam_member users or groups that specifies the initial
     * members that the row-level access policy should be created with.
     * grantees types:
     * - &#34;user:alice{@literal @}example.com&#34;: An email address that represents a specific
     *   Google account.
     * - &#34;serviceAccount:my-other-app{@literal @}appspot.gserviceaccount.com&#34;: An email
     *   address that represents a service account.
     * - &#34;group:admins{@literal @}example.com&#34;: An email address that represents a Google
     *   group.
     * - &#34;domain:example.com&#34;:The Google Workspace domain (primary) that
     *   represents all the users of that domain.
     * - &#34;allAuthenticatedUsers&#34;: A special identifier that represents all service
     *   accounts and all users on the internet who have authenticated with a Google
     *   Account. This identifier includes accounts that aren&#39;t connected to a
     *   Google Workspace or Cloud Identity domain, such as personal Gmail accounts.
     *   Users who aren&#39;t authenticated, such as anonymous visitors, aren&#39;t
     *   included.
     * - &#34;allUsers&#34;:A special identifier that represents anyone who is on
     *   the internet, including authenticated and unauthenticated users. Because
     *   BigQuery requires authentication before a user can access the service,
     *   allUsers includes only authenticated users.
     * 
     */
    @Import(name="grantees")
    private @Nullable Output<List<String>> grantees;

    /**
     * @return Input only. The optional list of iam_member users or groups that specifies the initial
     * members that the row-level access policy should be created with.
     * grantees types:
     * - &#34;user:alice{@literal @}example.com&#34;: An email address that represents a specific
     *   Google account.
     * - &#34;serviceAccount:my-other-app{@literal @}appspot.gserviceaccount.com&#34;: An email
     *   address that represents a service account.
     * - &#34;group:admins{@literal @}example.com&#34;: An email address that represents a Google
     *   group.
     * - &#34;domain:example.com&#34;:The Google Workspace domain (primary) that
     *   represents all the users of that domain.
     * - &#34;allAuthenticatedUsers&#34;: A special identifier that represents all service
     *   accounts and all users on the internet who have authenticated with a Google
     *   Account. This identifier includes accounts that aren&#39;t connected to a
     *   Google Workspace or Cloud Identity domain, such as personal Gmail accounts.
     *   Users who aren&#39;t authenticated, such as anonymous visitors, aren&#39;t
     *   included.
     * - &#34;allUsers&#34;:A special identifier that represents anyone who is on
     *   the internet, including authenticated and unauthenticated users. Because
     *   BigQuery requires authentication before a user can access the service,
     *   allUsers includes only authenticated users.
     * 
     */
    public Optional<Output<List<String>>> grantees() {
        return Optional.ofNullable(this.grantees);
    }

    /**
     * The time when this row access policy was last modified, in milliseconds
     * since the epoch.
     * 
     */
    @Import(name="lastModifiedTime")
    private @Nullable Output<String> lastModifiedTime;

    /**
     * @return The time when this row access policy was last modified, in milliseconds
     * since the epoch.
     * 
     */
    public Optional<Output<String>> lastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }

    /**
     * The ID of the row access policy. The ID must contain only
     * letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum
     * length is 256 characters.
     * 
     */
    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    /**
     * @return The ID of the row access policy. The ID must contain only
     * letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum
     * length is 256 characters.
     * 
     */
    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
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

    /**
     * The ID of the table containing this row access policy.
     * 
     */
    @Import(name="tableId")
    private @Nullable Output<String> tableId;

    /**
     * @return The ID of the table containing this row access policy.
     * 
     */
    public Optional<Output<String>> tableId() {
        return Optional.ofNullable(this.tableId);
    }

    private RowAccessPolicyState() {}

    private RowAccessPolicyState(RowAccessPolicyState $) {
        this.creationTime = $.creationTime;
        this.datasetId = $.datasetId;
        this.filterPredicate = $.filterPredicate;
        this.grantees = $.grantees;
        this.lastModifiedTime = $.lastModifiedTime;
        this.policyId = $.policyId;
        this.project = $.project;
        this.tableId = $.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RowAccessPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RowAccessPolicyState $;

        public Builder() {
            $ = new RowAccessPolicyState();
        }

        public Builder(RowAccessPolicyState defaults) {
            $ = new RowAccessPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param creationTime The time when this row access policy was created, in milliseconds since
         * the epoch.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(@Nullable Output<String> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        /**
         * @param creationTime The time when this row access policy was created, in milliseconds since
         * the epoch.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(String creationTime) {
            return creationTime(Output.of(creationTime));
        }

        /**
         * @param datasetId The ID of the dataset containing this row access policy.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(@Nullable Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        /**
         * @param datasetId The ID of the dataset containing this row access policy.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        /**
         * @param filterPredicate A SQL boolean expression that represents the rows defined by this row
         * access policy, similar to the boolean expression in a WHERE clause of a
         * SELECT query on a table.
         * References to other tables, routines, and temporary functions are not
         * supported.
         * Examples: region=&#34;EU&#34;
         * date_field = CAST(&#39;2019-9-27&#39; as DATE)
         * nullable_field is not NULL
         * numeric_field BETWEEN 1.0 AND 5.0
         * 
         * @return builder
         * 
         */
        public Builder filterPredicate(@Nullable Output<String> filterPredicate) {
            $.filterPredicate = filterPredicate;
            return this;
        }

        /**
         * @param filterPredicate A SQL boolean expression that represents the rows defined by this row
         * access policy, similar to the boolean expression in a WHERE clause of a
         * SELECT query on a table.
         * References to other tables, routines, and temporary functions are not
         * supported.
         * Examples: region=&#34;EU&#34;
         * date_field = CAST(&#39;2019-9-27&#39; as DATE)
         * nullable_field is not NULL
         * numeric_field BETWEEN 1.0 AND 5.0
         * 
         * @return builder
         * 
         */
        public Builder filterPredicate(String filterPredicate) {
            return filterPredicate(Output.of(filterPredicate));
        }

        /**
         * @param grantees Input only. The optional list of iam_member users or groups that specifies the initial
         * members that the row-level access policy should be created with.
         * grantees types:
         * - &#34;user:alice{@literal @}example.com&#34;: An email address that represents a specific
         *   Google account.
         * - &#34;serviceAccount:my-other-app{@literal @}appspot.gserviceaccount.com&#34;: An email
         *   address that represents a service account.
         * - &#34;group:admins{@literal @}example.com&#34;: An email address that represents a Google
         *   group.
         * - &#34;domain:example.com&#34;:The Google Workspace domain (primary) that
         *   represents all the users of that domain.
         * - &#34;allAuthenticatedUsers&#34;: A special identifier that represents all service
         *   accounts and all users on the internet who have authenticated with a Google
         *   Account. This identifier includes accounts that aren&#39;t connected to a
         *   Google Workspace or Cloud Identity domain, such as personal Gmail accounts.
         *   Users who aren&#39;t authenticated, such as anonymous visitors, aren&#39;t
         *   included.
         * - &#34;allUsers&#34;:A special identifier that represents anyone who is on
         *   the internet, including authenticated and unauthenticated users. Because
         *   BigQuery requires authentication before a user can access the service,
         *   allUsers includes only authenticated users.
         * 
         * @return builder
         * 
         */
        public Builder grantees(@Nullable Output<List<String>> grantees) {
            $.grantees = grantees;
            return this;
        }

        /**
         * @param grantees Input only. The optional list of iam_member users or groups that specifies the initial
         * members that the row-level access policy should be created with.
         * grantees types:
         * - &#34;user:alice{@literal @}example.com&#34;: An email address that represents a specific
         *   Google account.
         * - &#34;serviceAccount:my-other-app{@literal @}appspot.gserviceaccount.com&#34;: An email
         *   address that represents a service account.
         * - &#34;group:admins{@literal @}example.com&#34;: An email address that represents a Google
         *   group.
         * - &#34;domain:example.com&#34;:The Google Workspace domain (primary) that
         *   represents all the users of that domain.
         * - &#34;allAuthenticatedUsers&#34;: A special identifier that represents all service
         *   accounts and all users on the internet who have authenticated with a Google
         *   Account. This identifier includes accounts that aren&#39;t connected to a
         *   Google Workspace or Cloud Identity domain, such as personal Gmail accounts.
         *   Users who aren&#39;t authenticated, such as anonymous visitors, aren&#39;t
         *   included.
         * - &#34;allUsers&#34;:A special identifier that represents anyone who is on
         *   the internet, including authenticated and unauthenticated users. Because
         *   BigQuery requires authentication before a user can access the service,
         *   allUsers includes only authenticated users.
         * 
         * @return builder
         * 
         */
        public Builder grantees(List<String> grantees) {
            return grantees(Output.of(grantees));
        }

        /**
         * @param grantees Input only. The optional list of iam_member users or groups that specifies the initial
         * members that the row-level access policy should be created with.
         * grantees types:
         * - &#34;user:alice{@literal @}example.com&#34;: An email address that represents a specific
         *   Google account.
         * - &#34;serviceAccount:my-other-app{@literal @}appspot.gserviceaccount.com&#34;: An email
         *   address that represents a service account.
         * - &#34;group:admins{@literal @}example.com&#34;: An email address that represents a Google
         *   group.
         * - &#34;domain:example.com&#34;:The Google Workspace domain (primary) that
         *   represents all the users of that domain.
         * - &#34;allAuthenticatedUsers&#34;: A special identifier that represents all service
         *   accounts and all users on the internet who have authenticated with a Google
         *   Account. This identifier includes accounts that aren&#39;t connected to a
         *   Google Workspace or Cloud Identity domain, such as personal Gmail accounts.
         *   Users who aren&#39;t authenticated, such as anonymous visitors, aren&#39;t
         *   included.
         * - &#34;allUsers&#34;:A special identifier that represents anyone who is on
         *   the internet, including authenticated and unauthenticated users. Because
         *   BigQuery requires authentication before a user can access the service,
         *   allUsers includes only authenticated users.
         * 
         * @return builder
         * 
         */
        public Builder grantees(String... grantees) {
            return grantees(List.of(grantees));
        }

        /**
         * @param lastModifiedTime The time when this row access policy was last modified, in milliseconds
         * since the epoch.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedTime(@Nullable Output<String> lastModifiedTime) {
            $.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * @param lastModifiedTime The time when this row access policy was last modified, in milliseconds
         * since the epoch.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            return lastModifiedTime(Output.of(lastModifiedTime));
        }

        /**
         * @param policyId The ID of the row access policy. The ID must contain only
         * letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum
         * length is 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The ID of the row access policy. The ID must contain only
         * letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum
         * length is 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
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

        /**
         * @param tableId The ID of the table containing this row access policy.
         * 
         * @return builder
         * 
         */
        public Builder tableId(@Nullable Output<String> tableId) {
            $.tableId = tableId;
            return this;
        }

        /**
         * @param tableId The ID of the table containing this row access policy.
         * 
         * @return builder
         * 
         */
        public Builder tableId(String tableId) {
            return tableId(Output.of(tableId));
        }

        public RowAccessPolicyState build() {
            return $;
        }
    }

}
