// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TableTableConstraintsForeignKeyColumnReferences {
    /**
     * @return The column in the primary key that are
     * referenced by the referencingColumn
     * 
     */
    private String referencedColumn;
    /**
     * @return The column that composes the foreign key.
     * 
     */
    private String referencingColumn;

    private TableTableConstraintsForeignKeyColumnReferences() {}
    /**
     * @return The column in the primary key that are
     * referenced by the referencingColumn
     * 
     */
    public String referencedColumn() {
        return this.referencedColumn;
    }
    /**
     * @return The column that composes the foreign key.
     * 
     */
    public String referencingColumn() {
        return this.referencingColumn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableTableConstraintsForeignKeyColumnReferences defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String referencedColumn;
        private String referencingColumn;
        public Builder() {}
        public Builder(TableTableConstraintsForeignKeyColumnReferences defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.referencedColumn = defaults.referencedColumn;
    	      this.referencingColumn = defaults.referencingColumn;
        }

        @CustomType.Setter
        public Builder referencedColumn(String referencedColumn) {
            this.referencedColumn = Objects.requireNonNull(referencedColumn);
            return this;
        }
        @CustomType.Setter
        public Builder referencingColumn(String referencingColumn) {
            this.referencingColumn = Objects.requireNonNull(referencingColumn);
            return this;
        }
        public TableTableConstraintsForeignKeyColumnReferences build() {
            final var o = new TableTableConstraintsForeignKeyColumnReferences();
            o.referencedColumn = referencedColumn;
            o.referencingColumn = referencingColumn;
            return o;
        }
    }
}