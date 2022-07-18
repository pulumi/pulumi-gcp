// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs Empty = new PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs();

    /**
     * Resource name of the requested StoredInfoType, for example `organizations/433245324/storedInfoTypes/432452342`
     * or `projects/project-id/storedInfoTypes/432452342`.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Resource name of the requested StoredInfoType, for example `organizations/433245324/storedInfoTypes/432452342`
     * or `projects/project-id/storedInfoTypes/432452342`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs() {}

    private PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs(PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs $;

        public Builder() {
            $ = new PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs();
        }

        public Builder(PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs defaults) {
            $ = new PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Resource name of the requested StoredInfoType, for example `organizations/433245324/storedInfoTypes/432452342`
         * or `projects/project-id/storedInfoTypes/432452342`.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name of the requested StoredInfoType, for example `organizations/433245324/storedInfoTypes/432452342`
         * or `projects/project-id/storedInfoTypes/432452342`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}