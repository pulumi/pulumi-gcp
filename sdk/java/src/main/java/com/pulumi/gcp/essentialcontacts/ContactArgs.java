// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.essentialcontacts;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ContactArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContactArgs Empty = new ContactArgs();

    /**
     * The email address to send notifications to. This does not need to be a Google account.
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return The email address to send notifications to. This does not need to be a Google account.
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    /**
     * The preferred language for notifications, as a ISO 639-1 language code. See Supported languages for a list of supported languages.
     * 
     */
    @Import(name="languageTag", required=true)
    private Output<String> languageTag;

    /**
     * @return The preferred language for notifications, as a ISO 639-1 language code. See Supported languages for a list of supported languages.
     * 
     */
    public Output<String> languageTag() {
        return this.languageTag;
    }

    /**
     * The categories of notifications that the contact will receive communications for.
     * 
     */
    @Import(name="notificationCategorySubscriptions", required=true)
    private Output<List<String>> notificationCategorySubscriptions;

    /**
     * @return The categories of notifications that the contact will receive communications for.
     * 
     */
    public Output<List<String>> notificationCategorySubscriptions() {
        return this.notificationCategorySubscriptions;
    }

    /**
     * The resource to save this contact for. Format: organizations/{organization_id}, folders/{folder_id} or projects/{project_id}
     * 
     */
    @Import(name="parent", required=true)
    private Output<String> parent;

    /**
     * @return The resource to save this contact for. Format: organizations/{organization_id}, folders/{folder_id} or projects/{project_id}
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }

    private ContactArgs() {}

    private ContactArgs(ContactArgs $) {
        this.email = $.email;
        this.languageTag = $.languageTag;
        this.notificationCategorySubscriptions = $.notificationCategorySubscriptions;
        this.parent = $.parent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactArgs $;

        public Builder() {
            $ = new ContactArgs();
        }

        public Builder(ContactArgs defaults) {
            $ = new ContactArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param email The email address to send notifications to. This does not need to be a Google account.
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email address to send notifications to. This does not need to be a Google account.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param languageTag The preferred language for notifications, as a ISO 639-1 language code. See Supported languages for a list of supported languages.
         * 
         * @return builder
         * 
         */
        public Builder languageTag(Output<String> languageTag) {
            $.languageTag = languageTag;
            return this;
        }

        /**
         * @param languageTag The preferred language for notifications, as a ISO 639-1 language code. See Supported languages for a list of supported languages.
         * 
         * @return builder
         * 
         */
        public Builder languageTag(String languageTag) {
            return languageTag(Output.of(languageTag));
        }

        /**
         * @param notificationCategorySubscriptions The categories of notifications that the contact will receive communications for.
         * 
         * @return builder
         * 
         */
        public Builder notificationCategorySubscriptions(Output<List<String>> notificationCategorySubscriptions) {
            $.notificationCategorySubscriptions = notificationCategorySubscriptions;
            return this;
        }

        /**
         * @param notificationCategorySubscriptions The categories of notifications that the contact will receive communications for.
         * 
         * @return builder
         * 
         */
        public Builder notificationCategorySubscriptions(List<String> notificationCategorySubscriptions) {
            return notificationCategorySubscriptions(Output.of(notificationCategorySubscriptions));
        }

        /**
         * @param notificationCategorySubscriptions The categories of notifications that the contact will receive communications for.
         * 
         * @return builder
         * 
         */
        public Builder notificationCategorySubscriptions(String... notificationCategorySubscriptions) {
            return notificationCategorySubscriptions(List.of(notificationCategorySubscriptions));
        }

        /**
         * @param parent The resource to save this contact for. Format: organizations/{organization_id}, folders/{folder_id} or projects/{project_id}
         * 
         * @return builder
         * 
         */
        public Builder parent(Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The resource to save this contact for. Format: organizations/{organization_id}, folders/{folder_id} or projects/{project_id}
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        public ContactArgs build() {
            if ($.email == null) {
                throw new MissingRequiredPropertyException("ContactArgs", "email");
            }
            if ($.languageTag == null) {
                throw new MissingRequiredPropertyException("ContactArgs", "languageTag");
            }
            if ($.notificationCategorySubscriptions == null) {
                throw new MissingRequiredPropertyException("ContactArgs", "notificationCategorySubscriptions");
            }
            if ($.parent == null) {
                throw new MissingRequiredPropertyException("ContactArgs", "parent");
            }
            return $;
        }
    }

}
