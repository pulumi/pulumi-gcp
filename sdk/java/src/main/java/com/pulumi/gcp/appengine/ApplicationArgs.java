// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.appengine.inputs.ApplicationFeatureSettingsArgs;
import com.pulumi.gcp.appengine.inputs.ApplicationIapArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * The domain to authenticate users with when using App Engine&#39;s User API.
     * 
     */
    @Import(name="authDomain")
    private @Nullable Output<String> authDomain;

    /**
     * @return The domain to authenticate users with when using App Engine&#39;s User API.
     * 
     */
    public Optional<Output<String>> authDomain() {
        return Optional.ofNullable(this.authDomain);
    }

    /**
     * The type of the Cloud Firestore or Cloud Datastore database associated with this application.
     * Can be `CLOUD_FIRESTORE` or `CLOUD_DATASTORE_COMPATIBILITY` for new
     * instances.  To support old instances, the value `CLOUD_DATASTORE` is accepted by the provider, but will be rejected by the API.
     * To create a Cloud Firestore database without creating an App Engine application, use the
     * `gcp.firestore.Database`
     * resource instead.
     * 
     */
    @Import(name="databaseType")
    private @Nullable Output<String> databaseType;

    /**
     * @return The type of the Cloud Firestore or Cloud Datastore database associated with this application.
     * Can be `CLOUD_FIRESTORE` or `CLOUD_DATASTORE_COMPATIBILITY` for new
     * instances.  To support old instances, the value `CLOUD_DATASTORE` is accepted by the provider, but will be rejected by the API.
     * To create a Cloud Firestore database without creating an App Engine application, use the
     * `gcp.firestore.Database`
     * resource instead.
     * 
     */
    public Optional<Output<String>> databaseType() {
        return Optional.ofNullable(this.databaseType);
    }

    /**
     * A block of optional settings to configure specific App Engine features:
     * 
     */
    @Import(name="featureSettings")
    private @Nullable Output<ApplicationFeatureSettingsArgs> featureSettings;

    /**
     * @return A block of optional settings to configure specific App Engine features:
     * 
     */
    public Optional<Output<ApplicationFeatureSettingsArgs>> featureSettings() {
        return Optional.ofNullable(this.featureSettings);
    }

    /**
     * Settings for enabling Cloud Identity Aware Proxy
     * 
     */
    @Import(name="iap")
    private @Nullable Output<ApplicationIapArgs> iap;

    /**
     * @return Settings for enabling Cloud Identity Aware Proxy
     * 
     */
    public Optional<Output<ApplicationIapArgs>> iap() {
        return Optional.ofNullable(this.iap);
    }

    /**
     * The [location](https://cloud.google.com/appengine/docs/locations)
     * to serve the app from.
     * 
     */
    @Import(name="locationId", required=true)
    private Output<String> locationId;

    /**
     * @return The [location](https://cloud.google.com/appengine/docs/locations)
     * to serve the app from.
     * 
     */
    public Output<String> locationId() {
        return this.locationId;
    }

    /**
     * The project ID to create the application under.
     * ~&gt;**NOTE:** GCP only accepts project ID, not project number. If you are using number,
     * you may get a &#34;Permission denied&#34; error.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project ID to create the application under.
     * ~&gt;**NOTE:** GCP only accepts project ID, not project number. If you are using number,
     * you may get a &#34;Permission denied&#34; error.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The serving status of the app.
     * 
     */
    @Import(name="servingStatus")
    private @Nullable Output<String> servingStatus;

    /**
     * @return The serving status of the app.
     * 
     */
    public Optional<Output<String>> servingStatus() {
        return Optional.ofNullable(this.servingStatus);
    }

    private ApplicationArgs() {}

    private ApplicationArgs(ApplicationArgs $) {
        this.authDomain = $.authDomain;
        this.databaseType = $.databaseType;
        this.featureSettings = $.featureSettings;
        this.iap = $.iap;
        this.locationId = $.locationId;
        this.project = $.project;
        this.servingStatus = $.servingStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationArgs $;

        public Builder() {
            $ = new ApplicationArgs();
        }

        public Builder(ApplicationArgs defaults) {
            $ = new ApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authDomain The domain to authenticate users with when using App Engine&#39;s User API.
         * 
         * @return builder
         * 
         */
        public Builder authDomain(@Nullable Output<String> authDomain) {
            $.authDomain = authDomain;
            return this;
        }

        /**
         * @param authDomain The domain to authenticate users with when using App Engine&#39;s User API.
         * 
         * @return builder
         * 
         */
        public Builder authDomain(String authDomain) {
            return authDomain(Output.of(authDomain));
        }

        /**
         * @param databaseType The type of the Cloud Firestore or Cloud Datastore database associated with this application.
         * Can be `CLOUD_FIRESTORE` or `CLOUD_DATASTORE_COMPATIBILITY` for new
         * instances.  To support old instances, the value `CLOUD_DATASTORE` is accepted by the provider, but will be rejected by the API.
         * To create a Cloud Firestore database without creating an App Engine application, use the
         * `gcp.firestore.Database`
         * resource instead.
         * 
         * @return builder
         * 
         */
        public Builder databaseType(@Nullable Output<String> databaseType) {
            $.databaseType = databaseType;
            return this;
        }

        /**
         * @param databaseType The type of the Cloud Firestore or Cloud Datastore database associated with this application.
         * Can be `CLOUD_FIRESTORE` or `CLOUD_DATASTORE_COMPATIBILITY` for new
         * instances.  To support old instances, the value `CLOUD_DATASTORE` is accepted by the provider, but will be rejected by the API.
         * To create a Cloud Firestore database without creating an App Engine application, use the
         * `gcp.firestore.Database`
         * resource instead.
         * 
         * @return builder
         * 
         */
        public Builder databaseType(String databaseType) {
            return databaseType(Output.of(databaseType));
        }

        /**
         * @param featureSettings A block of optional settings to configure specific App Engine features:
         * 
         * @return builder
         * 
         */
        public Builder featureSettings(@Nullable Output<ApplicationFeatureSettingsArgs> featureSettings) {
            $.featureSettings = featureSettings;
            return this;
        }

        /**
         * @param featureSettings A block of optional settings to configure specific App Engine features:
         * 
         * @return builder
         * 
         */
        public Builder featureSettings(ApplicationFeatureSettingsArgs featureSettings) {
            return featureSettings(Output.of(featureSettings));
        }

        /**
         * @param iap Settings for enabling Cloud Identity Aware Proxy
         * 
         * @return builder
         * 
         */
        public Builder iap(@Nullable Output<ApplicationIapArgs> iap) {
            $.iap = iap;
            return this;
        }

        /**
         * @param iap Settings for enabling Cloud Identity Aware Proxy
         * 
         * @return builder
         * 
         */
        public Builder iap(ApplicationIapArgs iap) {
            return iap(Output.of(iap));
        }

        /**
         * @param locationId The [location](https://cloud.google.com/appengine/docs/locations)
         * to serve the app from.
         * 
         * @return builder
         * 
         */
        public Builder locationId(Output<String> locationId) {
            $.locationId = locationId;
            return this;
        }

        /**
         * @param locationId The [location](https://cloud.google.com/appengine/docs/locations)
         * to serve the app from.
         * 
         * @return builder
         * 
         */
        public Builder locationId(String locationId) {
            return locationId(Output.of(locationId));
        }

        /**
         * @param project The project ID to create the application under.
         * ~&gt;**NOTE:** GCP only accepts project ID, not project number. If you are using number,
         * you may get a &#34;Permission denied&#34; error.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project ID to create the application under.
         * ~&gt;**NOTE:** GCP only accepts project ID, not project number. If you are using number,
         * you may get a &#34;Permission denied&#34; error.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param servingStatus The serving status of the app.
         * 
         * @return builder
         * 
         */
        public Builder servingStatus(@Nullable Output<String> servingStatus) {
            $.servingStatus = servingStatus;
            return this;
        }

        /**
         * @param servingStatus The serving status of the app.
         * 
         * @return builder
         * 
         */
        public Builder servingStatus(String servingStatus) {
            return servingStatus(Output.of(servingStatus));
        }

        public ApplicationArgs build() {
            if ($.locationId == null) {
                throw new MissingRequiredPropertyException("ApplicationArgs", "locationId");
            }
            return $;
        }
    }

}
