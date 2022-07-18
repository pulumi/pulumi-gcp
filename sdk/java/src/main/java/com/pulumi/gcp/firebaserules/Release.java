// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebaserules;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.firebaserules.ReleaseArgs;
import com.pulumi.gcp.firebaserules.inputs.ReleaseState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The Firebaserules Release resource
 * 
 * ## Example Usage
 * ### Basic_release
 * Creates a basic Firebase Rules Release
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
 *         var basic = new Ruleset(&#34;basic&#34;, RulesetArgs.builder()        
 *             .project(&#34;my-project-name&#34;)
 *             .source(RulesetSourceArgs.builder()
 *                 .files(RulesetSourceFileArgs.builder()
 *                     .content(&#34;service cloud.firestore {match /databases/{database}/documents { match /{document=**} { allow read, write: if false; } } }&#34;)
 *                     .fingerprint(&#34;&#34;)
 *                     .name(&#34;firestore.rules&#34;)
 *                     .build())
 *                 .language(&#34;&#34;)
 *                 .build())
 *             .build());
 * 
 *         var primary = new Release(&#34;primary&#34;, ReleaseArgs.builder()        
 *             .project(&#34;my-project-name&#34;)
 *             .rulesetName(basic.name().apply(name -&gt; String.format(&#34;projects/my-project-name/rulesets/%s&#34;, name)))
 *             .build());
 * 
 *         var minimal = new Ruleset(&#34;minimal&#34;, RulesetArgs.builder()        
 *             .project(&#34;my-project-name&#34;)
 *             .source(RulesetSourceArgs.builder()
 *                 .files(RulesetSourceFileArgs.builder()
 *                     .content(&#34;service cloud.firestore {match /databases/{database}/documents { match /{document=**} { allow read, write: if false; } } }&#34;)
 *                     .name(&#34;firestore.rules&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Minimal_release
 * Creates a minimal Firebase Rules Release
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
 *         var minimal = new Ruleset(&#34;minimal&#34;, RulesetArgs.builder()        
 *             .project(&#34;my-project-name&#34;)
 *             .source(RulesetSourceArgs.builder()
 *                 .files(RulesetSourceFileArgs.builder()
 *                     .content(&#34;service cloud.firestore {match /databases/{database}/documents { match /{document=**} { allow read, write: if false; } } }&#34;)
 *                     .name(&#34;firestore.rules&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var primary = new Release(&#34;primary&#34;, ReleaseArgs.builder()        
 *             .project(&#34;my-project-name&#34;)
 *             .rulesetName(minimal.name().apply(name -&gt; String.format(&#34;projects/my-project-name/rulesets/%s&#34;, name)))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Release can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:firebaserules/release:Release default projects/{{project}}/releases/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:firebaserules/release:Release")
public class Release extends com.pulumi.resources.CustomResource {
    /**
     * Output only. Time the release was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Output only. Time the release was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Disable the release to keep it from being served. The response code of NOT_FOUND will be given for executables generated
     * from this Release.
     * 
     */
    @Export(name="disabled", type=Boolean.class, parameters={})
    private Output<Boolean> disabled;

    /**
     * @return Disable the release to keep it from being served. The response code of NOT_FOUND will be given for executables generated
     * from this Release.
     * 
     */
    public Output<Boolean> disabled() {
        return this.disabled;
    }
    /**
     * Format: `projects/{project_id}/releases/{release_id}`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Format: `projects/{project_id}/releases/{release_id}`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The project for the resource
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist the `Release` to be created.
     * 
     */
    @Export(name="rulesetName", type=String.class, parameters={})
    private Output<String> rulesetName;

    /**
     * @return Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist the `Release` to be created.
     * 
     */
    public Output<String> rulesetName() {
        return this.rulesetName;
    }
    /**
     * Output only. Time the release was updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Output only. Time the release was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Release(String name) {
        this(name, ReleaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Release(String name, ReleaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Release(String name, ReleaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firebaserules/release:Release", name, args == null ? ReleaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Release(String name, Output<String> id, @Nullable ReleaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firebaserules/release:Release", name, state, makeResourceOptions(options, id));
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
    public static Release get(String name, Output<String> id, @Nullable ReleaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Release(name, id, state, options);
    }
}