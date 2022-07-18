// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.storage.DefaultObjectACLArgs;
import com.pulumi.gcp.storage.inputs.DefaultObjectACLState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Authoritatively manages the default object ACLs for a Google Cloud Storage bucket
 * without managing the bucket itself.
 * 
 * &gt; Note that for each object, its creator will have the `&#34;OWNER&#34;` role in addition
 * to the default ACL that has been defined.
 * 
 * For more information see
 * [the official documentation](https://cloud.google.com/storage/docs/access-control/lists)
 * and
 * [API](https://cloud.google.com/storage/docs/json_api/v1/defaultObjectAccessControls).
 * 
 * &gt; Want fine-grained control over default object ACLs? Use `gcp.storage.DefaultObjectAccessControl`
 * to control individual role entity pairs.
 * 
 * ## Example Usage
 * 
 * Example creating a default object ACL on a bucket with one owner, and one reader.
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var image_store = new Bucket(&#34;image-store&#34;, BucketArgs.builder()        
 *             .location(&#34;EU&#34;)
 *             .build());
 * 
 *         var image_store_default_acl = new DefaultObjectACL(&#34;image-store-default-acl&#34;, DefaultObjectACLArgs.builder()        
 *             .bucket(image_store.name())
 *             .roleEntities(            
 *                 &#34;OWNER:user-my.email@gmail.com&#34;,
 *                 &#34;READER:group-mygroup&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:storage/defaultObjectACL:DefaultObjectACL")
public class DefaultObjectACL extends com.pulumi.resources.CustomResource {
    /**
     * The name of the bucket it applies to.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the bucket it applies to.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * List of role/entity pairs in the form `ROLE:entity`.
     * See [GCS Object ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls) for more details.
     * Omitting the field is the same as providing an empty list.
     * 
     */
    @Export(name="roleEntities", type=List.class, parameters={String.class})
    private Output<List<String>> roleEntities;

    /**
     * @return List of role/entity pairs in the form `ROLE:entity`.
     * See [GCS Object ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls) for more details.
     * Omitting the field is the same as providing an empty list.
     * 
     */
    public Output<List<String>> roleEntities() {
        return this.roleEntities;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DefaultObjectACL(String name) {
        this(name, DefaultObjectACLArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DefaultObjectACL(String name, DefaultObjectACLArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefaultObjectACL(String name, DefaultObjectACLArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/defaultObjectACL:DefaultObjectACL", name, args == null ? DefaultObjectACLArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DefaultObjectACL(String name, Output<String> id, @Nullable DefaultObjectACLState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/defaultObjectACL:DefaultObjectACL", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DefaultObjectACL get(String name, Output<String> id, @Nullable DefaultObjectACLState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DefaultObjectACL(name, id, state, options);
    }
}