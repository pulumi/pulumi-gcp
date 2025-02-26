// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EntryBigqueryTableSpecTableSpec {
    /**
     * @return (Output)
     * If the table is a dated shard, i.e., with name pattern [prefix]YYYYMMDD, groupedEntry is the
     * Data Catalog resource name of the date sharded grouped entry, for example,
     * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/entries/{entryId}.
     * Otherwise, groupedEntry is empty.
     * 
     */
    private @Nullable String groupedEntry;

    private EntryBigqueryTableSpecTableSpec() {}
    /**
     * @return (Output)
     * If the table is a dated shard, i.e., with name pattern [prefix]YYYYMMDD, groupedEntry is the
     * Data Catalog resource name of the date sharded grouped entry, for example,
     * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/entries/{entryId}.
     * Otherwise, groupedEntry is empty.
     * 
     */
    public Optional<String> groupedEntry() {
        return Optional.ofNullable(this.groupedEntry);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryBigqueryTableSpecTableSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String groupedEntry;
        public Builder() {}
        public Builder(EntryBigqueryTableSpecTableSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupedEntry = defaults.groupedEntry;
        }

        @CustomType.Setter
        public Builder groupedEntry(@Nullable String groupedEntry) {

            this.groupedEntry = groupedEntry;
            return this;
        }
        public EntryBigqueryTableSpecTableSpec build() {
            final var _resultValue = new EntryBigqueryTableSpecTableSpec();
            _resultValue.groupedEntry = groupedEntry;
            return _resultValue;
        }
    }
}
