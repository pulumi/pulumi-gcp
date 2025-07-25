// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.firebase.inputs.AppHostingBackendCodebaseArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppHostingBackendArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppHostingBackendArgs Empty = new AppHostingBackendArgs();

    /**
     * Unstructured key value map that may be set by external tools to
     * store and arbitrary metadata. They are not queryable and should be
     * preserved when modifying objects.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Unstructured key value map that may be set by external tools to
     * store and arbitrary metadata. They are not queryable and should be
     * preserved when modifying objects.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The [ID of a Web
     * App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id)
     * associated with the backend.
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    /**
     * @return The [ID of a Web
     * App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id)
     * associated with the backend.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }

    /**
     * Id of the backend. Also used as the service ID for Cloud Run, and as part
     * of the default domain name.
     * 
     */
    @Import(name="backendId", required=true)
    private Output<String> backendId;

    /**
     * @return Id of the backend. Also used as the service ID for Cloud Run, and as part
     * of the default domain name.
     * 
     */
    public Output<String> backendId() {
        return this.backendId;
    }

    /**
     * The connection to an external source repository to watch for event-driven
     * updates to the backend.
     * Structure is documented below.
     * 
     */
    @Import(name="codebase")
    private @Nullable Output<AppHostingBackendCodebaseArgs> codebase;

    /**
     * @return The connection to an external source repository to watch for event-driven
     * updates to the backend.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AppHostingBackendCodebaseArgs>> codebase() {
        return Optional.ofNullable(this.codebase);
    }

    /**
     * Human-readable name. 63 character limit.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Human-readable name. 63 character limit.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The environment name of the backend, used to load environment variables
     * from environment specific configuration.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<String> environment;

    /**
     * @return The environment name of the backend, used to load environment variables
     * from environment specific configuration.
     * 
     */
    public Optional<Output<String>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * Unstructured key value map that can be used to organize and categorize
     * objects.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Unstructured key value map that can be used to organize and categorize
     * objects.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The canonical IDs of a Google Cloud location such as &#34;us-east1&#34;.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The canonical IDs of a Google Cloud location such as &#34;us-east1&#34;.
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * The name of the service account used for Cloud Build and Cloud Run.
     * Should have the role roles/firebaseapphosting.computeRunner
     * or equivalent permissions.
     * 
     */
    @Import(name="serviceAccount", required=true)
    private Output<String> serviceAccount;

    /**
     * @return The name of the service account used for Cloud Build and Cloud Run.
     * Should have the role roles/firebaseapphosting.computeRunner
     * or equivalent permissions.
     * 
     */
    public Output<String> serviceAccount() {
        return this.serviceAccount;
    }

    /**
     * Immutable. Specifies how App Hosting will serve the content for this backend. It will
     * either be contained to a single region (REGIONAL_STRICT) or allowed to use
     * App Hosting&#39;s global-replicated serving infrastructure (GLOBAL_ACCESS).
     * Possible values are: `REGIONAL_STRICT`, `GLOBAL_ACCESS`.
     * 
     */
    @Import(name="servingLocality", required=true)
    private Output<String> servingLocality;

    /**
     * @return Immutable. Specifies how App Hosting will serve the content for this backend. It will
     * either be contained to a single region (REGIONAL_STRICT) or allowed to use
     * App Hosting&#39;s global-replicated serving infrastructure (GLOBAL_ACCESS).
     * Possible values are: `REGIONAL_STRICT`, `GLOBAL_ACCESS`.
     * 
     */
    public Output<String> servingLocality() {
        return this.servingLocality;
    }

    private AppHostingBackendArgs() {}

    private AppHostingBackendArgs(AppHostingBackendArgs $) {
        this.annotations = $.annotations;
        this.appId = $.appId;
        this.backendId = $.backendId;
        this.codebase = $.codebase;
        this.displayName = $.displayName;
        this.environment = $.environment;
        this.labels = $.labels;
        this.location = $.location;
        this.project = $.project;
        this.serviceAccount = $.serviceAccount;
        this.servingLocality = $.servingLocality;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppHostingBackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppHostingBackendArgs $;

        public Builder() {
            $ = new AppHostingBackendArgs();
        }

        public Builder(AppHostingBackendArgs defaults) {
            $ = new AppHostingBackendArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Unstructured key value map that may be set by external tools to
         * store and arbitrary metadata. They are not queryable and should be
         * preserved when modifying objects.
         * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
         * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Unstructured key value map that may be set by external tools to
         * store and arbitrary metadata. They are not queryable and should be
         * preserved when modifying objects.
         * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
         * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param appId The [ID of a Web
         * App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id)
         * associated with the backend.
         * 
         * @return builder
         * 
         */
        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The [ID of a Web
         * App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id)
         * associated with the backend.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param backendId Id of the backend. Also used as the service ID for Cloud Run, and as part
         * of the default domain name.
         * 
         * @return builder
         * 
         */
        public Builder backendId(Output<String> backendId) {
            $.backendId = backendId;
            return this;
        }

        /**
         * @param backendId Id of the backend. Also used as the service ID for Cloud Run, and as part
         * of the default domain name.
         * 
         * @return builder
         * 
         */
        public Builder backendId(String backendId) {
            return backendId(Output.of(backendId));
        }

        /**
         * @param codebase The connection to an external source repository to watch for event-driven
         * updates to the backend.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder codebase(@Nullable Output<AppHostingBackendCodebaseArgs> codebase) {
            $.codebase = codebase;
            return this;
        }

        /**
         * @param codebase The connection to an external source repository to watch for event-driven
         * updates to the backend.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder codebase(AppHostingBackendCodebaseArgs codebase) {
            return codebase(Output.of(codebase));
        }

        /**
         * @param displayName Human-readable name. 63 character limit.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Human-readable name. 63 character limit.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param environment The environment name of the backend, used to load environment variables
         * from environment specific configuration.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<String> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment The environment name of the backend, used to load environment variables
         * from environment specific configuration.
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param labels Unstructured key value map that can be used to organize and categorize
         * objects.
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Unstructured key value map that can be used to organize and categorize
         * objects.
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The canonical IDs of a Google Cloud location such as &#34;us-east1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The canonical IDs of a Google Cloud location such as &#34;us-east1&#34;.
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

        /**
         * @param serviceAccount The name of the service account used for Cloud Build and Cloud Run.
         * Should have the role roles/firebaseapphosting.computeRunner
         * or equivalent permissions.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount The name of the service account used for Cloud Build and Cloud Run.
         * Should have the role roles/firebaseapphosting.computeRunner
         * or equivalent permissions.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param servingLocality Immutable. Specifies how App Hosting will serve the content for this backend. It will
         * either be contained to a single region (REGIONAL_STRICT) or allowed to use
         * App Hosting&#39;s global-replicated serving infrastructure (GLOBAL_ACCESS).
         * Possible values are: `REGIONAL_STRICT`, `GLOBAL_ACCESS`.
         * 
         * @return builder
         * 
         */
        public Builder servingLocality(Output<String> servingLocality) {
            $.servingLocality = servingLocality;
            return this;
        }

        /**
         * @param servingLocality Immutable. Specifies how App Hosting will serve the content for this backend. It will
         * either be contained to a single region (REGIONAL_STRICT) or allowed to use
         * App Hosting&#39;s global-replicated serving infrastructure (GLOBAL_ACCESS).
         * Possible values are: `REGIONAL_STRICT`, `GLOBAL_ACCESS`.
         * 
         * @return builder
         * 
         */
        public Builder servingLocality(String servingLocality) {
            return servingLocality(Output.of(servingLocality));
        }

        public AppHostingBackendArgs build() {
            if ($.appId == null) {
                throw new MissingRequiredPropertyException("AppHostingBackendArgs", "appId");
            }
            if ($.backendId == null) {
                throw new MissingRequiredPropertyException("AppHostingBackendArgs", "backendId");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("AppHostingBackendArgs", "location");
            }
            if ($.serviceAccount == null) {
                throw new MissingRequiredPropertyException("AppHostingBackendArgs", "serviceAccount");
            }
            if ($.servingLocality == null) {
                throw new MissingRequiredPropertyException("AppHostingBackendArgs", "servingLocality");
            }
            return $;
        }
    }

}
