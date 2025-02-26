// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.oracledatabase.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutonomousDatabasePropertiesConnectionUrl {
    /**
     * @return Oracle Application Express (APEX) URL.
     * 
     */
    private @Nullable String apexUri;
    /**
     * @return The URL of the Database Transforms for the Autonomous Database.
     * 
     */
    private @Nullable String databaseTransformsUri;
    /**
     * @return The URL of the Graph Studio for the Autonomous Database.
     * 
     */
    private @Nullable String graphStudioUri;
    /**
     * @return The URL of the Oracle Machine Learning (OML) Notebook for the Autonomous
     * Database.
     * 
     */
    private @Nullable String machineLearningNotebookUri;
    /**
     * @return The URL of Machine Learning user management the Autonomous Database.
     * 
     */
    private @Nullable String machineLearningUserManagementUri;
    /**
     * @return The URL of the MongoDB API for the Autonomous Database.
     * 
     */
    private @Nullable String mongoDbUri;
    /**
     * @return The Oracle REST Data Services (ORDS) URL of the Web Access for the
     * Autonomous Database.
     * 
     */
    private @Nullable String ordsUri;
    /**
     * @return The URL of the Oracle SQL Developer Web for the Autonomous Database.
     * 
     */
    private @Nullable String sqlDevWebUri;

    private AutonomousDatabasePropertiesConnectionUrl() {}
    /**
     * @return Oracle Application Express (APEX) URL.
     * 
     */
    public Optional<String> apexUri() {
        return Optional.ofNullable(this.apexUri);
    }
    /**
     * @return The URL of the Database Transforms for the Autonomous Database.
     * 
     */
    public Optional<String> databaseTransformsUri() {
        return Optional.ofNullable(this.databaseTransformsUri);
    }
    /**
     * @return The URL of the Graph Studio for the Autonomous Database.
     * 
     */
    public Optional<String> graphStudioUri() {
        return Optional.ofNullable(this.graphStudioUri);
    }
    /**
     * @return The URL of the Oracle Machine Learning (OML) Notebook for the Autonomous
     * Database.
     * 
     */
    public Optional<String> machineLearningNotebookUri() {
        return Optional.ofNullable(this.machineLearningNotebookUri);
    }
    /**
     * @return The URL of Machine Learning user management the Autonomous Database.
     * 
     */
    public Optional<String> machineLearningUserManagementUri() {
        return Optional.ofNullable(this.machineLearningUserManagementUri);
    }
    /**
     * @return The URL of the MongoDB API for the Autonomous Database.
     * 
     */
    public Optional<String> mongoDbUri() {
        return Optional.ofNullable(this.mongoDbUri);
    }
    /**
     * @return The Oracle REST Data Services (ORDS) URL of the Web Access for the
     * Autonomous Database.
     * 
     */
    public Optional<String> ordsUri() {
        return Optional.ofNullable(this.ordsUri);
    }
    /**
     * @return The URL of the Oracle SQL Developer Web for the Autonomous Database.
     * 
     */
    public Optional<String> sqlDevWebUri() {
        return Optional.ofNullable(this.sqlDevWebUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutonomousDatabasePropertiesConnectionUrl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apexUri;
        private @Nullable String databaseTransformsUri;
        private @Nullable String graphStudioUri;
        private @Nullable String machineLearningNotebookUri;
        private @Nullable String machineLearningUserManagementUri;
        private @Nullable String mongoDbUri;
        private @Nullable String ordsUri;
        private @Nullable String sqlDevWebUri;
        public Builder() {}
        public Builder(AutonomousDatabasePropertiesConnectionUrl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apexUri = defaults.apexUri;
    	      this.databaseTransformsUri = defaults.databaseTransformsUri;
    	      this.graphStudioUri = defaults.graphStudioUri;
    	      this.machineLearningNotebookUri = defaults.machineLearningNotebookUri;
    	      this.machineLearningUserManagementUri = defaults.machineLearningUserManagementUri;
    	      this.mongoDbUri = defaults.mongoDbUri;
    	      this.ordsUri = defaults.ordsUri;
    	      this.sqlDevWebUri = defaults.sqlDevWebUri;
        }

        @CustomType.Setter
        public Builder apexUri(@Nullable String apexUri) {

            this.apexUri = apexUri;
            return this;
        }
        @CustomType.Setter
        public Builder databaseTransformsUri(@Nullable String databaseTransformsUri) {

            this.databaseTransformsUri = databaseTransformsUri;
            return this;
        }
        @CustomType.Setter
        public Builder graphStudioUri(@Nullable String graphStudioUri) {

            this.graphStudioUri = graphStudioUri;
            return this;
        }
        @CustomType.Setter
        public Builder machineLearningNotebookUri(@Nullable String machineLearningNotebookUri) {

            this.machineLearningNotebookUri = machineLearningNotebookUri;
            return this;
        }
        @CustomType.Setter
        public Builder machineLearningUserManagementUri(@Nullable String machineLearningUserManagementUri) {

            this.machineLearningUserManagementUri = machineLearningUserManagementUri;
            return this;
        }
        @CustomType.Setter
        public Builder mongoDbUri(@Nullable String mongoDbUri) {

            this.mongoDbUri = mongoDbUri;
            return this;
        }
        @CustomType.Setter
        public Builder ordsUri(@Nullable String ordsUri) {

            this.ordsUri = ordsUri;
            return this;
        }
        @CustomType.Setter
        public Builder sqlDevWebUri(@Nullable String sqlDevWebUri) {

            this.sqlDevWebUri = sqlDevWebUri;
            return this;
        }
        public AutonomousDatabasePropertiesConnectionUrl build() {
            final var _resultValue = new AutonomousDatabasePropertiesConnectionUrl();
            _resultValue.apexUri = apexUri;
            _resultValue.databaseTransformsUri = databaseTransformsUri;
            _resultValue.graphStudioUri = graphStudioUri;
            _resultValue.machineLearningNotebookUri = machineLearningNotebookUri;
            _resultValue.machineLearningUserManagementUri = machineLearningUserManagementUri;
            _resultValue.mongoDbUri = mongoDbUri;
            _resultValue.ordsUri = ordsUri;
            _resultValue.sqlDevWebUri = sqlDevWebUri;
            return _resultValue;
        }
    }
}
