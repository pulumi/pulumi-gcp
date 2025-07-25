// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.iap.inputs.SettingsAccessSettingsArgs;
import com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingsState extends com.pulumi.resources.ResourceArgs {

    public static final SettingsState Empty = new SettingsState();

    /**
     * Top level wrapper for all access related setting in IAP.
     * Structure is documented below.
     * 
     */
    @Import(name="accessSettings")
    private @Nullable Output<SettingsAccessSettingsArgs> accessSettings;

    /**
     * @return Top level wrapper for all access related setting in IAP.
     * Structure is documented below.
     * 
     */
    public Optional<Output<SettingsAccessSettingsArgs>> accessSettings() {
        return Optional.ofNullable(this.accessSettings);
    }

    /**
     * Top level wrapper for all application related settings in IAP.
     * Structure is documented below.
     * 
     */
    @Import(name="applicationSettings")
    private @Nullable Output<SettingsApplicationSettingsArgs> applicationSettings;

    /**
     * @return Top level wrapper for all application related settings in IAP.
     * Structure is documented below.
     * 
     */
    public Optional<Output<SettingsApplicationSettingsArgs>> applicationSettings() {
        return Optional.ofNullable(this.applicationSettings);
    }

    /**
     * The resource name of the IAP protected resource. Name can have below resources:
     * * organizations/{organization_id}
     * * folders/{folder_id}
     * * projects/{project_id}
     * * projects/{project_id}/iap_web
     * * projects/{project_id}/iap_web/compute
     * * projects/{project_id}/iap_web/compute-{region}
     * * projects/{project_id}/iap_web/compute/services/{service_id}
     * * projects/{project_id}/iap_web/compute-{region}/services/{service_id}
     * * projects/{project_id}/iap_web/appengine-{app_id}
     * * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}
     * * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}/version/{version_id}
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the IAP protected resource. Name can have below resources:
     * * organizations/{organization_id}
     * * folders/{folder_id}
     * * projects/{project_id}
     * * projects/{project_id}/iap_web
     * * projects/{project_id}/iap_web/compute
     * * projects/{project_id}/iap_web/compute-{region}
     * * projects/{project_id}/iap_web/compute/services/{service_id}
     * * projects/{project_id}/iap_web/compute-{region}/services/{service_id}
     * * projects/{project_id}/iap_web/appengine-{app_id}
     * * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}
     * * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}/version/{version_id}
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private SettingsState() {}

    private SettingsState(SettingsState $) {
        this.accessSettings = $.accessSettings;
        this.applicationSettings = $.applicationSettings;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingsState $;

        public Builder() {
            $ = new SettingsState();
        }

        public Builder(SettingsState defaults) {
            $ = new SettingsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessSettings Top level wrapper for all access related setting in IAP.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder accessSettings(@Nullable Output<SettingsAccessSettingsArgs> accessSettings) {
            $.accessSettings = accessSettings;
            return this;
        }

        /**
         * @param accessSettings Top level wrapper for all access related setting in IAP.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder accessSettings(SettingsAccessSettingsArgs accessSettings) {
            return accessSettings(Output.of(accessSettings));
        }

        /**
         * @param applicationSettings Top level wrapper for all application related settings in IAP.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder applicationSettings(@Nullable Output<SettingsApplicationSettingsArgs> applicationSettings) {
            $.applicationSettings = applicationSettings;
            return this;
        }

        /**
         * @param applicationSettings Top level wrapper for all application related settings in IAP.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder applicationSettings(SettingsApplicationSettingsArgs applicationSettings) {
            return applicationSettings(Output.of(applicationSettings));
        }

        /**
         * @param name The resource name of the IAP protected resource. Name can have below resources:
         * * organizations/{organization_id}
         * * folders/{folder_id}
         * * projects/{project_id}
         * * projects/{project_id}/iap_web
         * * projects/{project_id}/iap_web/compute
         * * projects/{project_id}/iap_web/compute-{region}
         * * projects/{project_id}/iap_web/compute/services/{service_id}
         * * projects/{project_id}/iap_web/compute-{region}/services/{service_id}
         * * projects/{project_id}/iap_web/appengine-{app_id}
         * * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}
         * * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}/version/{version_id}
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the IAP protected resource. Name can have below resources:
         * * organizations/{organization_id}
         * * folders/{folder_id}
         * * projects/{project_id}
         * * projects/{project_id}/iap_web
         * * projects/{project_id}/iap_web/compute
         * * projects/{project_id}/iap_web/compute-{region}
         * * projects/{project_id}/iap_web/compute/services/{service_id}
         * * projects/{project_id}/iap_web/compute-{region}/services/{service_id}
         * * projects/{project_id}/iap_web/appengine-{app_id}
         * * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}
         * * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}/version/{version_id}
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public SettingsState build() {
            return $;
        }
    }

}
